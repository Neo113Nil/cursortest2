package com.google.common.math;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class DoubleMath {
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = java.lang.Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static double roundIntermediate(double x, java.math.RoundingMode mode) {
        if (!com.google.common.math.DoubleUtils.isFinite(x)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(x));
                return x;
            case 2:
                return (x >= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) - 1;
            case 3:
                return (x <= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) + 1;
            case 4:
                return x;
            case 5:
                if (isMathematicalInteger(x)) {
                    return x;
                }
                return ((long) x) + (x > 0.0d ? 1 : -1);
            case 6:
                return java.lang.Math.rint(x);
            case 7:
                double rint = java.lang.Math.rint(x);
                return java.lang.Math.abs(x - rint) == 0.5d ? x + java.lang.Math.copySign(0.5d, x) : rint;
            case 8:
                double rint2 = java.lang.Math.rint(x);
                return java.lang.Math.abs(x - rint2) == 0.5d ? x : rint2;
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

    public static int roundToInt(double x, java.math.RoundingMode mode) {
        double roundIntermediate = roundIntermediate(x, mode);
        com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs((roundIntermediate > -2.147483649E9d) & (roundIntermediate < 2.147483648E9d), x, mode);
        return (int) roundIntermediate;
    }

    public static long roundToLong(double x, java.math.RoundingMode mode) {
        double roundIntermediate = roundIntermediate(x, mode);
        com.google.common.math.MathPreconditions.checkInRangeForRoundingInputs((MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d) & (roundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE), x, mode);
        return (long) roundIntermediate;
    }

    public static java.math.BigInteger roundToBigInteger(double x, java.math.RoundingMode mode) {
        double roundIntermediate = roundIntermediate(x, mode);
        if ((roundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE) & (MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d)) {
            return java.math.BigInteger.valueOf((long) roundIntermediate);
        }
        java.math.BigInteger shiftLeft = java.math.BigInteger.valueOf(com.google.common.math.DoubleUtils.getSignificand(roundIntermediate)).shiftLeft(java.lang.Math.getExponent(roundIntermediate) - 52);
        return roundIntermediate < 0.0d ? shiftLeft.negate() : shiftLeft;
    }

    public static boolean isPowerOfTwo(double x) {
        if (x <= 0.0d || !com.google.common.math.DoubleUtils.isFinite(x)) {
            return false;
        }
        long significand = com.google.common.math.DoubleUtils.getSignificand(x);
        return (significand & (significand - 1)) == 0;
    }

    public static double log2(double x) {
        return java.lang.Math.log(x) / LN_2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int log2(double x, java.math.RoundingMode mode) {
        boolean z;
        boolean z2;
        boolean isPowerOfTwo;
        com.google.common.base.Preconditions.checkArgument(x > 0.0d && com.google.common.math.DoubleUtils.isFinite(x), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(x);
        if (!com.google.common.math.DoubleUtils.isNormal(x)) {
            return log2(x * 4.503599627370496E15d, mode) - 52;
        }
        switch (com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !isPowerOfTwo(x);
                if (!z) {
                    return exponent;
                }
                return exponent + 1;
            case 4:
                z2 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(x);
                z = (!isPowerOfTwo) & z2;
                if (!z) {
                }
                return exponent + 1;
            case 5:
                z2 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(x);
                z = (!isPowerOfTwo) & z2;
                if (!z) {
                }
                return exponent + 1;
            case 6:
            case 7:
            case 8:
                double scaleNormalize = com.google.common.math.DoubleUtils.scaleNormalize(x);
                if (scaleNormalize * scaleNormalize <= 2.0d) {
                    return exponent;
                }
                return exponent + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean isMathematicalInteger(double x) {
        return com.google.common.math.DoubleUtils.isFinite(x) && (x == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(com.google.common.math.DoubleUtils.getSignificand(x)) <= java.lang.Math.getExponent(x));
    }

    public static double factorial(int n) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.ironsource.B5.q, n);
        if (n > MAX_FACTORIAL) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i = (n & (-16)) + 1; i <= n; i++) {
            d *= i;
        }
        return d * everySixteenthFactorial[n >> 4];
    }

    public static boolean fuzzyEquals(double a2, double b, double tolerance) {
        com.google.common.math.MathPreconditions.checkNonNegative("tolerance", tolerance);
        return java.lang.Math.copySign(a2 - b, 1.0d) <= tolerance || a2 == b || (java.lang.Double.isNaN(a2) && java.lang.Double.isNaN(b));
    }

    public static int fuzzyCompare(double a2, double b, double tolerance) {
        if (fuzzyEquals(a2, b, tolerance)) {
            return 0;
        }
        if (a2 < b) {
            return -1;
        }
        if (a2 > b) {
            return 1;
        }
        return com.google.common.primitives.Booleans.compare(java.lang.Double.isNaN(a2), java.lang.Double.isNaN(b));
    }

    @java.lang.Deprecated
    public static double mean(double... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double checkFinite = checkFinite(values[0]);
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            checkFinite(values[i]);
            j++;
            checkFinite += (values[i] - checkFinite) / j;
        }
        return checkFinite;
    }

    @java.lang.Deprecated
    public static double mean(int... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : values) {
            j += i;
        }
        return j / values.length;
    }

    @java.lang.Deprecated
    public static double mean(long... values) {
        com.google.common.base.Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double d = values[0];
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            j++;
            d += (values[i] - d) / j;
        }
        return d;
    }

    @java.lang.Deprecated
    public static double mean(java.lang.Iterable<? extends java.lang.Number> values) {
        return mean(values.iterator());
    }

    @java.lang.Deprecated
    public static double mean(java.util.Iterator<? extends java.lang.Number> values) {
        com.google.common.base.Preconditions.checkArgument(values.hasNext(), "Cannot take mean of 0 values");
        double checkFinite = checkFinite(values.next().doubleValue());
        long j = 1;
        while (values.hasNext()) {
            j++;
            checkFinite += (checkFinite(values.next().doubleValue()) - checkFinite) / j;
        }
        return checkFinite;
    }

    private static double checkFinite(double argument) {
        com.google.common.base.Preconditions.checkArgument(com.google.common.math.DoubleUtils.isFinite(argument));
        return argument;
    }

    private DoubleMath() {
    }
}
