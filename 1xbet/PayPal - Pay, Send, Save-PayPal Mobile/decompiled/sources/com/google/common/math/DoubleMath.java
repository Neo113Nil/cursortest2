package com.google.common.math;

/* loaded from: classes9.dex */
public final class DoubleMath {
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = java.lang.Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static double roundIntermediate(double d, java.math.RoundingMode roundingMode) {
        if (!com.google.common.math.DoubleUtils.isFinite(d)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d));
                return d;
            case 2:
                return (d >= 0.0d || isMathematicalInteger(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || isMathematicalInteger(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (isMathematicalInteger(d)) {
                    return d;
                }
                return ((long) d) + (d > 0.0d ? 1 : -1);
            case 6:
                return java.lang.Math.rint(d);
            case 7:
                double rint = java.lang.Math.rint(d);
                return java.lang.Math.abs(d - rint) == 0.5d ? d + java.lang.Math.copySign(0.5d, d) : rint;
            case 8:
                double rint2 = java.lang.Math.rint(d);
                return java.lang.Math.abs(d - rint2) == 0.5d ? d : rint2;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[java.math.RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[java.math.RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.FLOOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.CEILING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.DOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static int roundToInt(double d, java.math.RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d, roundingMode);
        com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs((roundIntermediate > -2.147483649E9d) & (roundIntermediate < 2.147483648E9d), d, roundingMode);
        return (int) roundIntermediate;
    }

    public static long roundToLong(double d, java.math.RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d, roundingMode);
        com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs((MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d) & (roundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE), d, roundingMode);
        return (long) roundIntermediate;
    }

    public static java.math.BigInteger roundToBigInteger(double d, java.math.RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d, roundingMode);
        if ((MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d) & (roundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE)) {
            return java.math.BigInteger.valueOf((long) roundIntermediate);
        }
        java.math.BigInteger shiftLeft = java.math.BigInteger.valueOf(com.google.common.math.DoubleUtils.getSignificand(roundIntermediate)).shiftLeft(java.lang.Math.getExponent(roundIntermediate) - 52);
        return roundIntermediate < 0.0d ? shiftLeft.negate() : shiftLeft;
    }

    public static boolean isPowerOfTwo(double d) {
        if (d <= 0.0d || !com.google.common.math.DoubleUtils.isFinite(d)) {
            return false;
        }
        long significand = com.google.common.math.DoubleUtils.getSignificand(d);
        return (significand & (significand - 1)) == 0;
    }

    public static double log2(double d) {
        return java.lang.Math.log(d) / LN_2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int log2(double d, java.math.RoundingMode roundingMode) {
        boolean z;
        boolean z2;
        boolean isPowerOfTwo;
        com.google.common.base.Preconditions.checkArgument(d > 0.0d && com.google.common.math.DoubleUtils.isFinite(d), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(d);
        if (!com.google.common.math.DoubleUtils.isNormal(d)) {
            return log2(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !isPowerOfTwo(d);
                if (!z) {
                    return exponent;
                }
                return exponent + 1;
            case 4:
                z2 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(d);
                z = (!isPowerOfTwo) & z2;
                if (!z) {
                }
                return exponent + 1;
            case 5:
                z2 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(d);
                z = (!isPowerOfTwo) & z2;
                if (!z) {
                }
                return exponent + 1;
            case 6:
            case 7:
            case 8:
                double scaleNormalize = com.google.common.math.DoubleUtils.scaleNormalize(d);
                if (scaleNormalize * scaleNormalize <= 2.0d) {
                    return exponent;
                }
                return exponent + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean isMathematicalInteger(double d) {
        if (com.google.common.math.DoubleUtils.isFinite(d)) {
            return d == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(com.google.common.math.DoubleUtils.getSignificand(d)) <= java.lang.Math.getExponent(d);
        }
        return false;
    }

    public static double factorial(int i) {
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        if (i > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i2 = (i & (-16)) + 1; i2 <= i; i2++) {
            d *= i2;
        }
        return d * everySixteenthFactorial[i >> 4];
    }

    public static boolean fuzzyEquals(double d, double d2, double d3) {
        com.google.common.math.MathPreconditions.checkNonNegative("tolerance", d3);
        if (java.lang.Math.copySign(d - d2, 1.0d) <= d3 || d == d2) {
            return true;
        }
        return java.lang.Double.isNaN(d) && java.lang.Double.isNaN(d2);
    }

    public static int fuzzyCompare(double d, double d2, double d3) {
        if (fuzzyEquals(d, d2, d3)) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return java.lang.Boolean.compare(java.lang.Double.isNaN(d), java.lang.Double.isNaN(d2));
    }

    @java.lang.Deprecated
    public static double mean(double... dArr) {
        com.google.common.base.Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double checkFinite = checkFinite(dArr[0]);
        long j = 1;
        for (int i = 1; i < dArr.length; i++) {
            checkFinite(dArr[i]);
            j++;
            checkFinite += (dArr[i] - checkFinite) / j;
        }
        return checkFinite;
    }

    @java.lang.Deprecated
    public static double mean(int... iArr) {
        com.google.common.base.Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : iArr) {
            j += i;
        }
        return j / iArr.length;
    }

    @java.lang.Deprecated
    public static double mean(long... jArr) {
        com.google.common.base.Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d = jArr[0];
        long j = 1;
        for (int i = 1; i < jArr.length; i++) {
            j++;
            d += (jArr[i] - d) / j;
        }
        return d;
    }

    @java.lang.Deprecated
    public static double mean(java.lang.Iterable<? extends java.lang.Number> iterable) {
        return mean(iterable.iterator());
    }

    @java.lang.Deprecated
    public static double mean(java.util.Iterator<? extends java.lang.Number> it) {
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double checkFinite = checkFinite(it.next().doubleValue());
        long j = 1;
        while (it.hasNext()) {
            j++;
            checkFinite += (checkFinite(it.next().doubleValue()) - checkFinite) / j;
        }
        return checkFinite;
    }

    private static double checkFinite(double d) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(d));
        return d;
    }

    private DoubleMath() {
    }
}
