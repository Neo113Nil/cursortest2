package com.google.common.math;

/* loaded from: classes4.dex */
public final class IntMath {
    static final int FLOOR_SQRT_MAX_INT = 46340;
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD, 100000000, 1000000000};
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean isPowerOfTwo(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    static int lessThanBranchFree(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    public static int mean(int i, int i2) {
        return (i & i2) + ((i ^ i2) >> 1);
    }

    public static int ceilingPowerOfTwo(int i) {
        com.google.common.math.MathPreconditions.checkPositive("x", i);
        if (i > 1073741824) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ceilingPowerOfTwo(");
            sb.append(i);
            sb.append(") not representable as an int");
            throw new java.lang.ArithmeticException(sb.toString());
        }
        return 1 << (-java.lang.Integer.numberOfLeadingZeros(i - 1));
    }

    public static int floorPowerOfTwo(int i) {
        com.google.common.math.MathPreconditions.checkPositive("x", i);
        return java.lang.Integer.highestOneBit(i);
    }

    /* renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
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

    public static int log2(int i, java.math.RoundingMode roundingMode) {
        com.google.common.math.MathPreconditions.checkPositive("x", i);
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - java.lang.Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> numberOfLeadingZeros, i);
            default:
                throw new java.lang.AssertionError();
        }
        return 31 - java.lang.Integer.numberOfLeadingZeros(i);
    }

    public static int log10(int i, java.math.RoundingMode roundingMode) {
        int lessThanBranchFree;
        com.google.common.math.MathPreconditions.checkPositive("x", i);
        int log10Floor = log10Floor(i);
        int i2 = powersOf10[log10Floor];
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(i == i2);
                return log10Floor;
            case 2:
            case 3:
                return log10Floor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(i2, i);
                break;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree(halfPowersOf10[log10Floor], i);
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return log10Floor + lessThanBranchFree;
    }

    private static int log10Floor(int i) {
        byte b = maxLog10ForLeadingZeros[java.lang.Integer.numberOfLeadingZeros(i)];
        return b - lessThanBranchFree(i, powersOf10[b]);
    }

    public static int pow(int i, int i2) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", i2);
        if (i == -2) {
            if (i2 < 32) {
                return (i2 & 1) == 0 ? 1 << i2 : -(1 << i2);
            }
            return 0;
        }
        if (i == -1) {
            return (i2 & 1) == 0 ? 1 : -1;
        }
        if (i == 0) {
            return i2 == 0 ? 1 : 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            if (i2 < 32) {
                return 1 << i2;
            }
            return 0;
        }
        int i3 = 1;
        while (i2 != 0) {
            if (i2 == 1) {
                return i * i3;
            }
            i3 *= (i2 & 1) == 0 ? 1 : i;
            i *= i;
            i2 >>= 1;
        }
        return i3;
    }

    public static int sqrt(int i, java.math.RoundingMode roundingMode) {
        int lessThanBranchFree;
        com.google.common.math.MathPreconditions.checkNonNegative("x", i);
        int sqrtFloor = sqrtFloor(i);
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(sqrtFloor * sqrtFloor == i);
                return sqrtFloor;
            case 2:
            case 3:
                return sqrtFloor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(sqrtFloor * sqrtFloor, i);
                break;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree((sqrtFloor * sqrtFloor) + sqrtFloor, i);
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return sqrtFloor + lessThanBranchFree;
    }

    private static int sqrtFloor(int i) {
        return (int) java.lang.Math.sqrt(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int divide(int i, int i2, java.math.RoundingMode roundingMode) {
        com.google.common.base.Preconditions.checkNotNull(roundingMode);
        if (i2 == 0) {
            throw new java.lang.ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                return i3 + i5;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                return i3 + i5;
            case 6:
            case 7:
            case 8:
                int abs = java.lang.Math.abs(i4);
                int abs2 = abs - (java.lang.Math.abs(i2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP) {
                        if (!((roundingMode == java.math.RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            return i3;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i3;
                }
                return i3 + i5;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static int mod(int i, int i2) {
        if (i2 <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Modulus ");
            sb.append(i2);
            sb.append(" must be > 0");
            throw new java.lang.ArithmeticException(sb.toString());
        }
        return java.lang.Math.floorMod(i, i2);
    }

    public static int gcd(int i, int i2) {
        com.google.common.math.MathPreconditions.checkNonNegative("a", i);
        com.google.common.math.MathPreconditions.checkNonNegative(util.h.xy.cb.b.f1091, i2);
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i);
        int i3 = i >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = java.lang.Integer.numberOfTrailingZeros(i2);
        int i4 = i2 >> numberOfTrailingZeros2;
        while (i3 != i4) {
            int i5 = i3 - i4;
            int i6 = (i5 >> 31) & i5;
            int i7 = (i5 - i6) - i6;
            i4 += i6;
            i3 = i7 >> java.lang.Integer.numberOfTrailingZeros(i7);
        }
        return i3 << java.lang.Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static int checkedAdd(int i, int i2) {
        return java.lang.Math.addExact(i, i2);
    }

    public static int checkedSubtract(int i, int i2) {
        return java.lang.Math.subtractExact(i, i2);
    }

    public static int checkedMultiply(int i, int i2) {
        return java.lang.Math.multiplyExact(i, i2);
    }

    public static int checkedPow(int i, int i2) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", i2);
        if (i == -2) {
            com.google.common.math.MathPreconditions.checkNoOverflow(i2 < 32, "checkedPow", i, i2);
            return (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
        }
        if (i == -1) {
            return (i2 & 1) == 0 ? 1 : -1;
        }
        if (i == 0) {
            return i2 == 0 ? 1 : 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            com.google.common.math.MathPreconditions.checkNoOverflow(i2 < 31, "checkedPow", i, i2);
            return 1 << i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if (i2 == 1) {
                return java.lang.Math.multiplyExact(i3, i);
            }
            if ((i2 & 1) != 0) {
                i3 = java.lang.Math.multiplyExact(i3, i);
            }
            i2 >>= 1;
            if (i2 > 0) {
                com.google.common.math.MathPreconditions.checkNoOverflow((-46340 <= i) & (i <= FLOOR_SQRT_MAX_INT), "checkedPow", i, i2);
                i *= i;
            }
        }
        return i3;
    }

    public static int saturatedAdd(int i, int i2) {
        return com.google.common.primitives.Ints.saturatedCast(i + i2);
    }

    public static int saturatedSubtract(int i, int i2) {
        return com.google.common.primitives.Ints.saturatedCast(i - i2);
    }

    public static int saturatedMultiply(int i, int i2) {
        return com.google.common.primitives.Ints.saturatedCast(i * i2);
    }

    public static int saturatedPow(int i, int i2) {
        int i3;
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", i2);
        if (i != -2) {
            if (i == -1) {
                return (i2 & 1) == 0 ? 1 : -1;
            }
            if (i == 0) {
                return i2 == 0 ? 1 : 0;
            }
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                if (i2 >= 31) {
                    return Integer.MAX_VALUE;
                }
                return 1 << i2;
            }
            int i4 = i;
            int i5 = i2;
            int i6 = 1;
            while (i5 != 0) {
                if (i5 == 1) {
                    return saturatedMultiply(i6, i4);
                }
                if ((i5 & 1) != 0) {
                    i6 = saturatedMultiply(i6, i4);
                }
                i5 >>= 1;
                if (i5 > 0) {
                    if ((-46340 > i4) || (i4 > FLOOR_SQRT_MAX_INT)) {
                        i3 = (i >>> 31) & i2 & 1;
                    } else {
                        i4 *= i4;
                    }
                }
            }
            return i6;
        }
        if (i2 < 32) {
            return (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
        }
        i3 = i2 & 1;
        return i3 + Integer.MAX_VALUE;
    }

    public static int factorial(int i) {
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        int[] iArr = factorials;
        if (i < iArr.length) {
            return iArr[i];
        }
        return Integer.MAX_VALUE;
    }

    public static int binomial(int i, int i2) {
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        com.google.common.math.MathPreconditions.checkNonNegative("k", i2);
        int i3 = 0;
        com.google.common.base.Preconditions.checkArgument(i2 <= i, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = biggestBinomials;
        if (i2 >= iArr.length || i > iArr[i2]) {
            return Integer.MAX_VALUE;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return i;
        }
        long j = 1;
        while (i3 < i2) {
            long j2 = i - i3;
            i3++;
            j = (j * j2) / i3;
        }
        return (int) j;
    }

    public static boolean isPrime(int i) {
        return com.google.common.math.LongMath.isPrime(i);
    }

    public static int saturatedAbs(int i) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.abs(i);
    }

    private IntMath() {
    }
}
