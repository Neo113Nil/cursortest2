package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public final class PolynomialRingGF2 {
    public static int add(int i, int i2) {
        return i ^ i2;
    }

    public static int degree(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int degree(long j) {
        int i = 0;
        while (j != 0) {
            i++;
            j >>>= 1;
        }
        return i - 1;
    }

    public static long multiply(int i, int i2) {
        long j = 0;
        if (i2 != 0) {
            long j2 = i2 & 4294967295L;
            while (i != 0) {
                if (((byte) (i & 1)) == 1) {
                    j ^= j2;
                }
                i >>>= 1;
                j2 <<= 1;
            }
        }
        return j;
    }

    public static int rest(long j, int i) {
        if (i == 0) {
            java.lang.System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j2 = i & 4294967295L;
        while ((j >>> 32) != 0) {
            j ^= j2 << (degree(j) - degree(j2));
        }
        int i2 = (int) j;
        while (degree(i2) >= degree(i)) {
            i2 ^= i << (degree(i2) - degree(i));
        }
        return i2;
    }

    public static int remainder(int i, int i2) {
        if (i2 == 0) {
            java.lang.System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i) >= degree(i2)) {
            i ^= i2 << (degree(i) - degree(i2));
        }
        return i;
    }

    public static int modMultiply(int i, int i2, int i3) {
        int remainder = remainder(i, i3);
        int remainder2 = remainder(i2, i3);
        int i4 = 0;
        if (remainder2 != 0) {
            int degree = degree(i3);
            while (remainder != 0) {
                if (((byte) (remainder & 1)) == 1) {
                    i4 ^= remainder2;
                }
                remainder >>>= 1;
                remainder2 <<= 1;
                if (remainder2 >= (1 << degree)) {
                    remainder2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static boolean isIrreducible(int i) {
        if (i == 0) {
            return false;
        }
        int degree = degree(i);
        int i2 = 2;
        for (int i3 = 0; i3 < (degree >>> 1); i3++) {
            i2 = modMultiply(i2, i2, i);
            if (gcd(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int getIrreduciblePolynomial(int i) {
        java.io.PrintStream printStream;
        java.lang.String str;
        if (i < 0) {
            printStream = java.lang.System.err;
            str = "The Degree is negative";
        } else {
            if (i <= 31) {
                if (i == 0) {
                    return 1;
                }
                for (int i2 = (1 << i) + 1; i2 < (1 << (i + 1)); i2 += 2) {
                    if (isIrreducible(i2)) {
                        return i2;
                    }
                }
                return 0;
            }
            printStream = java.lang.System.err;
            str = "The Degree is more then 31";
        }
        printStream.println(str);
        return 0;
    }

    public static int gcd(int i, int i2) {
        while (i2 != 0) {
            int i3 = i2;
            i2 = remainder(i, i2);
            i = i3;
        }
        return i;
    }

    private PolynomialRingGF2() {
    }
}
