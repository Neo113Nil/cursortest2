package com.google.common.math;

/* loaded from: classes4.dex */
final class MathPreconditions {
    static int checkPositive(java.lang.String str, int i) {
        if (i > 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static long checkPositive(java.lang.String str, long j) {
        if (j > 0) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be > 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static java.math.BigInteger checkPositive(java.lang.String str, java.math.BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(bigInteger);
        sb.append(") must be > 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static int checkNonNegative(java.lang.String str, int i) {
        if (i >= 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be >= 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static long checkNonNegative(java.lang.String str, long j) {
        if (j >= 0) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be >= 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static java.math.BigInteger checkNonNegative(java.lang.String str, java.math.BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(bigInteger);
        sb.append(") must be >= 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static double checkNonNegative(java.lang.String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(d);
        sb.append(") must be >= 0");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static void checkRoundingUnnecessary(boolean z) {
        if (!z) {
            throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void checkInRangeForRoundingInputs(boolean z, double d, java.math.RoundingMode roundingMode) {
        if (z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rounded value is out of range for input ");
        sb.append(d);
        sb.append(" and rounding mode ");
        sb.append(roundingMode);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    static void checkNoOverflow(boolean z, java.lang.String str, int i, int i2) {
        if (z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        throw new java.lang.ArithmeticException(sb.toString());
    }

    static void checkNoOverflow(boolean z, java.lang.String str, long j, long j2) {
        if (z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new java.lang.ArithmeticException(sb.toString());
    }

    private MathPreconditions() {
    }
}
