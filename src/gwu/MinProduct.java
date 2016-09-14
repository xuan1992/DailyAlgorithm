package gwu;

/**
 * Created by wuxuan on 9/14/16.
 */
public class MinProduct {
    public int solution(int a, int b) {
        int bigger = a < b ? b : a;
        int smaller = a < b ? a : b;
        return helper(smaller, bigger);
    }

    public int helper(int smaller, int bigger) {
        if(smaller == 0) {
            return 0;
        } else if (smaller == 1) {
            return bigger;
        }

        int s = smaller >> 1;
        int side1 = solution(s, bigger);
        int side2 = side1;
        if (smaller % 2 == 1) {
            side2 = helper(smaller - s, bigger);
        }

        return side1 + side2;
    }

    public static void main(String[] args) {
        MinProduct mp = new MinProduct();
        System.out.println(mp.solution(8, 7));
    }
}
