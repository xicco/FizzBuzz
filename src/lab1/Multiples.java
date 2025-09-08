package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println("Count = " + multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++)  {
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                count++;
            }
        }
        return count;
    }
}
