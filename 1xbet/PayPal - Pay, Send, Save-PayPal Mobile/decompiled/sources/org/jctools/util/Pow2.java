package org.jctools.util;

/* loaded from: classes5.dex */
public final class Pow2 {
    public static final int MAX_POW2 = 1073741824;

    public static boolean isPowerOfTwo(int i) {
        return (i & (i + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i) {
        if (i > 1073741824) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("There is no larger power of 2 int for value:");
            sb.append(i);
            sb.append(" since it exceeds 2^31.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Given value:");
            sb2.append(i);
            sb2.append(". Expecting value >= 0.");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        return 1 << (32 - java.lang.Integer.numberOfLeadingZeros(i - 1));
    }

    public static long align(long j, int i) {
        if (!isPowerOfTwo(i)) {
            throw new java.lang.IllegalArgumentException("alignment must be a power of 2:".concat(java.lang.String.valueOf(i)));
        }
        return (j + (i - 1)) & (~r4);
    }
}
