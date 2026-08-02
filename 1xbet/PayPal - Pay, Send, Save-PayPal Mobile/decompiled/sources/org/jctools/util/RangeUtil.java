package org.jctools.util;

/* loaded from: classes5.dex */
public final class RangeUtil {
    public static long checkPositive(long j, java.lang.String str) {
        if (j > 0) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(j);
        sb.append(" (expected: > 0)");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static int checkPositiveOrZero(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(" (expected: >= 0)");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static int checkLessThan(int i, int i2, java.lang.String str) {
        if (i < i2) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(" (expected: < ");
        sb.append(i2);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static int checkLessThanOrEqual(int i, long j, java.lang.String str) {
        if (i <= j) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(" (expected: <= ");
        sb.append(j);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static int checkGreaterThanOrEqual(int i, int i2, java.lang.String str) {
        if (i >= i2) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(" (expected: >= ");
        sb.append(i2);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
