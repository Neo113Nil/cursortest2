package com.google.common.math;

/* loaded from: classes4.dex */
public final class LongMath {
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;
    static final byte[] maxLog10ForLeadingZeros = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, 14, 14, 14, 13, 13, 13, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, okhttp3.internal.connection.RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    static boolean fitsInInt(long j) {
        return ((long) ((int) j)) == j;
    }

    public static boolean isPowerOfTwo(long j) {
        return (j > 0) & ((j & (j - 1)) == 0);
    }

    static int lessThanBranchFree(long j, long j2) {
        return (int) ((~(~(j - j2))) >>> 63);
    }

    public static long mean(long j, long j2) {
        return (j & j2) + ((j ^ j2) >> 1);
    }

    public static long saturatedAdd(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedSubtract(long j, long j2) {
        long j3 = j - j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) >= 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long ceilingPowerOfTwo(long j) {
        com.google.common.math.MathPreconditions.checkPositive("x", j);
        if (j > 4611686018427387904L) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ceilingPowerOfTwo(");
            sb.append(j);
            sb.append(") is not representable as a long");
            throw new java.lang.ArithmeticException(sb.toString());
        }
        return 1 << (-java.lang.Long.numberOfLeadingZeros(j - 1));
    }

    public static long floorPowerOfTwo(long j) {
        com.google.common.math.MathPreconditions.checkPositive("x", j);
        return 1 << (63 - java.lang.Long.numberOfLeadingZeros(j));
    }

    /* renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
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
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.FLOOR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.UP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.CEILING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[java.math.RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static int log2(long j, java.math.RoundingMode roundingMode) {
        com.google.common.math.MathPreconditions.checkPositive("x", j);
        switch (com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - java.lang.Long.numberOfLeadingZeros(j - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j);
                return (63 - numberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> numberOfLeadingZeros, j);
            default:
                throw new java.lang.AssertionError("impossible");
        }
        return 63 - java.lang.Long.numberOfLeadingZeros(j);
    }

    public static int log10(long j, java.math.RoundingMode roundingMode) {
        int lessThanBranchFree;
        com.google.common.math.MathPreconditions.checkPositive("x", j);
        int log10Floor = log10Floor(j);
        long j2 = powersOf10[log10Floor];
        switch (com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(j == j2);
                return log10Floor;
            case 2:
            case 3:
                return log10Floor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(j2, j);
                break;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree(halfPowersOf10[log10Floor], j);
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return log10Floor + lessThanBranchFree;
    }

    static int log10Floor(long j) {
        byte b = maxLog10ForLeadingZeros[java.lang.Long.numberOfLeadingZeros(j)];
        return b - lessThanBranchFree(j, powersOf10[b]);
    }

    public static long pow(long j, int i) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", i);
        if (-2 > j || j > 2) {
            long j2 = 1;
            while (i != 0) {
                if (i == 1) {
                    return j2 * j;
                }
                j2 *= (i & 1) == 0 ? 1L : j;
                j *= j;
                i >>= 1;
            }
            return j2;
        }
        int i2 = (int) j;
        if (i2 == -2) {
            if (i < 64) {
                return (i & 1) == 0 ? 1 << i : -(1 << i);
            }
            return 0L;
        }
        if (i2 == -1) {
            return (i & 1) == 0 ? 1L : -1L;
        }
        if (i2 == 0) {
            return i == 0 ? 1L : 0L;
        }
        if (i2 == 1) {
            return 1L;
        }
        if (i2 != 2) {
            throw new java.lang.AssertionError();
        }
        if (i < 64) {
            return 1 << i;
        }
        return 0L;
    }

    public static long sqrt(long j, java.math.RoundingMode roundingMode) {
        com.google.common.math.MathPreconditions.checkNonNegative("x", j);
        if (fitsInInt(j)) {
            return com.google.common.math.IntMath.sqrt((int) j, roundingMode);
        }
        long sqrt = (long) java.lang.Math.sqrt(j);
        long j2 = sqrt * sqrt;
        switch (com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(j2 == j);
                return sqrt;
            case 2:
            case 3:
                return j < j2 ? sqrt - 1 : sqrt;
            case 4:
            case 5:
                return j > j2 ? sqrt + 1 : sqrt;
            case 6:
            case 7:
            case 8:
                return (sqrt - (j < j2 ? 1 : 0)) + lessThanBranchFree((r0 * r0) + r0, j);
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long divide(long j, long j2, java.math.RoundingMode roundingMode) {
        com.google.common.base.Preconditions.checkNotNull(roundingMode);
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case 6:
            case 7:
            case 8:
                long abs = java.lang.Math.abs(j4);
                long abs2 = abs - (java.lang.Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP && (roundingMode != java.math.RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static int mod(long j, int i) {
        return (int) mod(j, i);
    }

    public static long mod(long j, long j2) {
        if (j2 <= 0) {
            throw new java.lang.ArithmeticException("Modulus must be positive");
        }
        return java.lang.Math.floorMod(j, j2);
    }

    public static long gcd(long j, long j2) {
        com.google.common.math.MathPreconditions.checkNonNegative("a", j);
        com.google.common.math.MathPreconditions.checkNonNegative(util.h.xy.cb.b.f1091, j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> java.lang.Long.numberOfTrailingZeros(j7);
        }
        return j3 << java.lang.Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long checkedAdd(long j, long j2) {
        return java.lang.Math.addExact(j, j2);
    }

    public static long checkedSubtract(long j, long j2) {
        return java.lang.Math.subtractExact(j, j2);
    }

    public static long checkedMultiply(long j, long j2) {
        return java.lang.Math.multiplyExact(j, j2);
    }

    public static long checkedPow(long j, int i) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", i);
        long j2 = 1;
        if ((j >= -2) && (j <= 2)) {
            int i2 = (int) j;
            if (i2 == -2) {
                com.google.common.math.MathPreconditions.checkNoOverflow(i < 64, "checkedPow", j, i);
                return (i & 1) == 0 ? 1 << i : (-1) << i;
            }
            if (i2 == -1) {
                return (i & 1) == 0 ? 1L : -1L;
            }
            if (i2 == 0) {
                return i == 0 ? 1L : 0L;
            }
            if (i2 == 1) {
                return 1L;
            }
            if (i2 == 2) {
                com.google.common.math.MathPreconditions.checkNoOverflow(i < 63, "checkedPow", j, i);
                return 1 << i;
            }
            throw new java.lang.AssertionError();
        }
        long j3 = j;
        int i3 = i;
        while (i3 != 0) {
            if (i3 == 1) {
                return java.lang.Math.multiplyExact(j2, j3);
            }
            if ((i3 & 1) != 0) {
                j2 = java.lang.Math.multiplyExact(j2, j3);
            }
            long j4 = j2;
            int i4 = i3 >> 1;
            if (i4 > 0) {
                com.google.common.math.MathPreconditions.checkNoOverflow(-3037000499L <= j3 && j3 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j3, i4);
                j3 *= j3;
            }
            i3 = i4;
            j2 = j4;
        }
        return j2;
    }

    public static long saturatedMultiply(long j, long j2) {
        int numberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j3 = j * j2;
            if (j == 0 || j3 / j == j2) {
                return j3;
            }
        }
        return ((j ^ j2) >>> 63) + Long.MAX_VALUE;
    }

    public static long saturatedPow(long j, int i) {
        long j2;
        int i2 = i;
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", i2);
        long j3 = 1;
        if (!(j >= -2) || !(j <= 2)) {
            long j4 = i2 & 1;
            long j5 = j;
            while (i2 != 0) {
                if (i2 == 1) {
                    return saturatedMultiply(j3, j5);
                }
                if ((i2 & 1) != 0) {
                    j3 = saturatedMultiply(j3, j5);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    if ((-3037000499L > j5) || (j5 > FLOOR_SQRT_MAX_LONG)) {
                        j2 = (j >>> 63) & j4;
                    } else {
                        j5 *= j5;
                    }
                }
            }
            return j3;
        }
        int i3 = (int) j;
        if (i3 != -2) {
            if (i3 == -1) {
                return (i2 & 1) == 0 ? 1L : -1L;
            }
            if (i3 == 0) {
                return i2 == 0 ? 1L : 0L;
            }
            if (i3 == 1) {
                return 1L;
            }
            if (i3 != 2) {
                throw new java.lang.AssertionError();
            }
            if (i2 >= 63) {
                return Long.MAX_VALUE;
            }
            return 1 << i2;
        }
        if (i2 < 64) {
            return (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
        }
        j2 = i2 & 1;
        return j2 + Long.MAX_VALUE;
    }

    public static long factorial(int i) {
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        long[] jArr = factorials;
        if (i < jArr.length) {
            return jArr[i];
        }
        return Long.MAX_VALUE;
    }

    public static long binomial(int i, int i2) {
        int i3 = i2;
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        com.google.common.math.MathPreconditions.checkNonNegative("k", i3);
        com.google.common.base.Preconditions.checkArgument(i3 <= i, "k (%s) > n (%s)", i3, i);
        if (i3 > (i >> 1)) {
            i3 = i - i3;
        }
        if (i3 == 0) {
            return 1L;
        }
        if (i3 == 1) {
            return i;
        }
        long[] jArr = factorials;
        if (i < jArr.length) {
            return jArr[i] / (jArr[i3] * jArr[i - i3]);
        }
        int[] iArr = biggestBinomials;
        if (i3 >= iArr.length || i > iArr[i3]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i3 < iArr2.length && i <= iArr2[i3]) {
            int i4 = i - 1;
            long j = i;
            for (int i5 = 2; i5 <= i3; i5++) {
                j = (j * i4) / i5;
                i4--;
            }
            return j;
        }
        long j2 = i;
        int log2 = log2(j2, java.math.RoundingMode.CEILING);
        int i6 = i - 1;
        int i7 = 2;
        int i8 = log2;
        long j3 = j2;
        long j4 = 1;
        long j5 = 1;
        while (i7 <= i3) {
            i8 += log2;
            if (i8 < 63) {
                j3 *= i6;
                j5 *= i7;
            } else {
                j4 = multiplyFraction(j4, j3, j5);
                j3 = i6;
                j5 = i7;
                i8 = log2;
            }
            i7++;
            i6--;
        }
        return multiplyFraction(j4, j3, j5);
    }

    static long multiplyFraction(long j, long j2, long j3) {
        if (j == 1) {
            return j2 / j3;
        }
        long gcd = gcd(j, j3);
        return (j / gcd) * (j2 / (j3 / gcd));
    }

    public static boolean isPrime(long j) {
        if (j < 2) {
            com.google.common.math.MathPreconditions.checkNonNegative("n", j);
            return false;
        }
        if (j < 66) {
            return ((722865708377213483 >> (((int) j) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j % 30))) & SIEVE_30) != 0 || j % 7 == 0 || j % 11 == 0 || j % 13 == 0) {
            return false;
        }
        if (j < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j <= jArr[0]) {
                for (int i = 1; i < jArr.length; i++) {
                    if (!com.google.common.math.LongMath.MillerRabinTester.test(jArr[i], j)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new java.lang.AssertionError();
    }

    /* loaded from: classes9.dex */
    enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            final long mulMod(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            final long squareMod(long j, long j2) {
                return (j * j) % j2;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j, long j2, long j3) {
                long j4 = j + j2;
                return j >= j3 - j2 ? j4 - j3 : j4;
            }

            private long times2ToThe32Mod(long j, long j2) {
                int i = 32;
                do {
                    int min = java.lang.Math.min(i, java.lang.Long.numberOfLeadingZeros(j));
                    j = com.google.common.primitives.UnsignedLongs.remainder(j << min, j2);
                    i -= min;
                } while (i > 0);
                return j;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            final long mulMod(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & 4294967295L;
                long j7 = j2 & 4294967295L;
                long times2ToThe32Mod = times2ToThe32Mod(j4 * j5, j3) + (j4 * j7);
                if (times2ToThe32Mod < 0) {
                    times2ToThe32Mod = com.google.common.primitives.UnsignedLongs.remainder(times2ToThe32Mod, j3);
                }
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + (j5 * j6), j3), com.google.common.primitives.UnsignedLongs.remainder(j6 * j7, j3), j3);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            final long squareMod(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & 4294967295L;
                long times2ToThe32Mod = times2ToThe32Mod(j3 * j3, j2);
                long j5 = j3 * j4 * 2;
                if (j5 < 0) {
                    j5 = com.google.common.primitives.UnsignedLongs.remainder(j5, j2);
                }
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + j5, j2), com.google.common.primitives.UnsignedLongs.remainder(j4 * j4, j2), j2);
            }
        };

        abstract long mulMod(long j, long j2, long j3);

        abstract long squareMod(long j, long j2);

        /* synthetic */ MillerRabinTester(com.google.common.math.LongMath.AnonymousClass1 anonymousClass1) {
            this();
        }

        static boolean test(long j, long j2) {
            return (j2 <= com.google.common.math.LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(j, j2);
        }

        private long powMod(long j, long j2, long j3) {
            long j4 = 1;
            while (j2 != 0) {
                if ((j2 & 1) != 0) {
                    j4 = mulMod(j4, j, j3);
                }
                j = squareMod(j, j3);
                j2 >>= 1;
            }
            return j4;
        }

        private boolean testWitness(long j, long j2) {
            long j3 = j2 - 1;
            int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j3);
            long j4 = j % j2;
            if (j4 == 0) {
                return true;
            }
            long powMod = powMod(j4, j3 >> numberOfTrailingZeros, j2);
            if (powMod == 1) {
                return true;
            }
            int i = 0;
            while (powMod != j3) {
                i++;
                if (i == numberOfTrailingZeros) {
                    return false;
                }
                powMod = squareMod(powMod, j2);
            }
            return true;
        }
    }

    public static double roundToDouble(long j, java.math.RoundingMode roundingMode) {
        long floor;
        double d;
        double d2 = j;
        long j2 = (long) d2;
        int compare = j2 == Long.MAX_VALUE ? -1 : java.lang.Long.compare(j, j2);
        switch (com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(compare == 0);
                return d2;
            case 2:
                if (j >= 0) {
                    if (compare < 0) {
                        return com.google.common.math.DoubleUtils.nextDown(d2);
                    }
                } else if (compare > 0) {
                    return java.lang.Math.nextUp(d2);
                }
                return d2;
            case 3:
                if (compare < 0) {
                    return com.google.common.math.DoubleUtils.nextDown(d2);
                }
                return d2;
            case 4:
                if (j >= 0) {
                    if (compare > 0) {
                        return java.lang.Math.nextUp(d2);
                    }
                } else if (compare < 0) {
                    return com.google.common.math.DoubleUtils.nextDown(d2);
                }
                return d2;
            case 5:
                if (compare > 0) {
                    return java.lang.Math.nextUp(d2);
                }
                return d2;
            case 6:
            case 7:
            case 8:
                if (compare >= 0) {
                    d = java.lang.Math.nextUp(d2);
                    j2 = (long) java.lang.Math.ceil(d);
                    floor = j2;
                } else {
                    double nextDown = com.google.common.math.DoubleUtils.nextDown(d2);
                    floor = (long) java.lang.Math.floor(nextDown);
                    d2 = nextDown;
                    d = d2;
                }
                long j3 = j2 - j;
                if (j2 == Long.MAX_VALUE) {
                    j3++;
                }
                int compare2 = java.lang.Long.compare(j - floor, j3);
                if (compare2 >= 0) {
                    if (compare2 <= 0) {
                        int i = com.google.common.math.LongMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()];
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    throw new java.lang.AssertionError("impossible");
                                }
                                if ((com.google.common.math.DoubleUtils.getSignificand(d2) & 1) == 0) {
                                }
                            } else if (j >= 0) {
                            }
                        } else if (j >= 0) {
                        }
                    }
                    return d;
                }
                return d2;
            default:
                throw new java.lang.AssertionError("impossible");
        }
    }

    public static long saturatedAbs(long j) {
        if (j == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return java.lang.Math.abs(j);
    }

    private LongMath() {
    }
}
