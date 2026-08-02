package org.threeten.bp.jdk8;

/* loaded from: classes18.dex */
public final class Jdk8Methods {
    public static int compareInts(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int compareLongs(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    private Jdk8Methods() {
    }

    public static <T> T requireNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Value must not be null");
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw new java.lang.NullPointerException(sb.toString());
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Addition overflows an int: ");
        sb.append(i);
        sb.append(" + ");
        sb.append(i2);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static long safeAdd(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Addition overflows a long: ");
        sb.append(j);
        sb.append(" + ");
        sb.append(j2);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static int safeSubtract(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) >= 0 || (i ^ i2) >= 0) {
            return i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Subtraction overflows an int: ");
        sb.append(i);
        sb.append(" - ");
        sb.append(i2);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static long safeSubtract(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Subtraction overflows a long: ");
        sb.append(j);
        sb.append(" - ");
        sb.append(j2);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static int safeMultiply(int i, int i2) {
        long j = i * i2;
        if (j >= androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask && j <= androidx.collection.SieveCacheKt.NodeLinkMask) {
            return (int) j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiplication overflows an int: ");
        sb.append(i);
        sb.append(" * ");
        sb.append(i2);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static long safeMultiply(long j, int i) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiplication overflows a long: ");
            sb.append(j);
            sb.append(" * ");
            sb.append(i);
            throw new java.lang.ArithmeticException(sb.toString());
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j;
        }
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Multiplication overflows a long: ");
        sb2.append(j);
        sb2.append(" * ");
        sb2.append(i);
        throw new java.lang.ArithmeticException(sb2.toString());
    }

    public static long safeMultiply(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" * ");
        sb.append(j2);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static int safeToInt(long j) {
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask || j < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) {
            throw new java.lang.ArithmeticException("Calculation overflows an int: ".concat(java.lang.String.valueOf(j)));
        }
        return (int) j;
    }

    public static long floorDiv(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static long floorMod(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static int floorMod(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static int floorDiv(int i, int i2) {
        return i >= 0 ? i / i2 : ((i + 1) / i2) - 1;
    }

    public static int floorMod(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }
}
