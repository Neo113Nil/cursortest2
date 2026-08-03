package com.google.common.math;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class IntMath {
    static final int FLOOR_SQRT_MAX_INT = 46340;
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] halfPowersOf10 = {3, 31, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean isPowerOfTwo(int x) {
        return (x > 0) & ((x & (x + (-1))) == 0);
    }

    static int lessThanBranchFree(int x, int y) {
        return (~(~(x - y))) >>> 31;
    }

    public static int mean(int x, int y) {
        return (x & y) + ((x ^ y) >> 1);
    }

    public static int ceilingPowerOfTwo(int x) {
        com.google.common.math.MathPreconditions.checkPositive("x", x);
        if (x > 1073741824) {
            throw new java.lang.ArithmeticException("ceilingPowerOfTwo(" + x + ") not representable as an int");
        }
        return 1 << (-java.lang.Integer.numberOfLeadingZeros(x - 1));
    }

    public static int floorPowerOfTwo(int x) {
        com.google.common.math.MathPreconditions.checkPositive("x", x);
        return java.lang.Integer.highestOneBit(x);
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

    public static int log2(int x, java.math.RoundingMode mode) {
        com.google.common.math.MathPreconditions.checkPositive("x", x);
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - java.lang.Integer.numberOfLeadingZeros(x - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(x);
                return (31 - numberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> numberOfLeadingZeros, x);
            default:
                throw new java.lang.AssertionError();
        }
        return 31 - java.lang.Integer.numberOfLeadingZeros(x);
    }

    public static int log10(int x, java.math.RoundingMode mode) {
        int lessThanBranchFree;
        com.google.common.math.MathPreconditions.checkPositive("x", x);
        int log10Floor = log10Floor(x);
        int i = powersOf10[log10Floor];
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(x == i);
            case 2:
            case 3:
                return log10Floor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(i, x);
                return log10Floor + lessThanBranchFree;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree(halfPowersOf10[log10Floor], x);
                return log10Floor + lessThanBranchFree;
            default:
                throw new java.lang.AssertionError();
        }
    }

    private static int log10Floor(int x) {
        byte b = maxLog10ForLeadingZeros[java.lang.Integer.numberOfLeadingZeros(x)];
        return b - lessThanBranchFree(x, powersOf10[b]);
    }

    public static int pow(int b, int k) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", k);
        if (b == -2) {
            if (k < 32) {
                return (k & 1) == 0 ? 1 << k : -(1 << k);
            }
            return 0;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            if (k < 32) {
                return 1 << k;
            }
            return 0;
        }
        int i = 1;
        while (k != 0) {
            if (k == 1) {
                return b * i;
            }
            i *= (k & 1) == 0 ? 1 : b;
            b *= b;
            k >>= 1;
        }
        return i;
    }

    public static int sqrt(int x, java.math.RoundingMode mode) {
        int lessThanBranchFree;
        com.google.common.math.MathPreconditions.checkNonNegative("x", x);
        int sqrtFloor = sqrtFloor(x);
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(sqrtFloor * sqrtFloor == x);
            case 2:
            case 3:
                return sqrtFloor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(sqrtFloor * sqrtFloor, x);
                return sqrtFloor + lessThanBranchFree;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree((sqrtFloor * sqrtFloor) + sqrtFloor, x);
                return sqrtFloor + lessThanBranchFree;
            default:
                throw new java.lang.AssertionError();
        }
    }

    private static int sqrtFloor(int x) {
        return (int) java.lang.Math.sqrt(x);
    }

    public static int divide(int p, int q, java.math.RoundingMode mode) {
        com.google.common.base.Preconditions.checkNotNull(mode);
        if (q == 0) {
            throw new java.lang.ArithmeticException("/ by zero");
        }
        int i = p / q;
        int i2 = p - (q * i);
        if (i2 == 0) {
            return i;
        }
        int i3 = ((p ^ q) >> 31) | 1;
        switch (com.google.common.math.IntMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(i2 == 0);
                return i;
            case 2:
                return i;
            case 3:
                if (i3 >= 0) {
                    return i;
                }
                break;
            case 4:
                break;
            case 5:
                if (i3 <= 0) {
                    return i;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = java.lang.Math.abs(i2);
                int abs2 = abs - (java.lang.Math.abs(q) - abs);
                if (abs2 == 0) {
                    if (mode != java.math.RoundingMode.HALF_UP) {
                        if (!((mode == java.math.RoundingMode.HALF_EVEN) & ((i & 1) != 0))) {
                            return i;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i;
                }
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return i + i3;
    }

    public static int mod(int x, int m) {
        if (m <= 0) {
            throw new java.lang.ArithmeticException("Modulus " + m + " must be > 0");
        }
        int i = x % m;
        return i >= 0 ? i : i + m;
    }

    public static int gcd(int a2, int b) {
        com.google.common.math.MathPreconditions.checkNonNegative("a", a2);
        com.google.common.math.MathPreconditions.checkNonNegative("b", b);
        if (a2 == 0) {
            return b;
        }
        if (b == 0) {
            return a2;
        }
        int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(a2);
        int i = a2 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = java.lang.Integer.numberOfTrailingZeros(b);
        int i2 = b >> numberOfTrailingZeros2;
        while (i != i2) {
            int i3 = i - i2;
            int i4 = (i3 >> 31) & i3;
            int i5 = (i3 - i4) - i4;
            i2 += i4;
            i = i5 >> java.lang.Integer.numberOfTrailingZeros(i5);
        }
        return i << java.lang.Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static int checkedAdd(int a2, int b) {
        long j = a2 + b;
        int i = (int) j;
        com.google.common.math.MathPreconditions.checkNoOverflow(j == ((long) i), "checkedAdd", a2, b);
        return i;
    }

    public static int checkedSubtract(int a2, int b) {
        long j = a2 - b;
        int i = (int) j;
        com.google.common.math.MathPreconditions.checkNoOverflow(j == ((long) i), "checkedSubtract", a2, b);
        return i;
    }

    public static int checkedMultiply(int a2, int b) {
        long j = a2 * b;
        int i = (int) j;
        com.google.common.math.MathPreconditions.checkNoOverflow(j == ((long) i), "checkedMultiply", a2, b);
        return i;
    }

    public static int checkedPow(int b, int k) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", k);
        if (b == -2) {
            com.google.common.math.MathPreconditions.checkNoOverflow(k < 32, "checkedPow", b, k);
            return (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            com.google.common.math.MathPreconditions.checkNoOverflow(k < 31, "checkedPow", b, k);
            return 1 << k;
        }
        int i = 1;
        while (k != 0) {
            if (k == 1) {
                return checkedMultiply(i, b);
            }
            if ((k & 1) != 0) {
                i = checkedMultiply(i, b);
            }
            k >>= 1;
            if (k > 0) {
                com.google.common.math.MathPreconditions.checkNoOverflow((-46340 <= b) & (b <= FLOOR_SQRT_MAX_INT), "checkedPow", b, k);
                b *= b;
            }
        }
        return i;
    }

    public static int saturatedAdd(int a2, int b) {
        return com.google.common.primitives.Ints.saturatedCast(a2 + b);
    }

    public static int saturatedSubtract(int a2, int b) {
        return com.google.common.primitives.Ints.saturatedCast(a2 - b);
    }

    public static int saturatedMultiply(int a2, int b) {
        return com.google.common.primitives.Ints.saturatedCast(a2 * b);
    }

    public static int saturatedPow(int b, int k) {
        com.google.common.math.MathPreconditions.checkNonNegative("exponent", k);
        if (b == -2) {
            return k >= 32 ? (k & 1) + Integer.MAX_VALUE : (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            if (k >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << k;
        }
        int i = ((b >>> 31) & k & 1) + Integer.MAX_VALUE;
        int i2 = 1;
        while (k != 0) {
            if (k == 1) {
                return saturatedMultiply(i2, b);
            }
            if ((k & 1) != 0) {
                i2 = saturatedMultiply(i2, b);
            }
            k >>= 1;
            if (k > 0) {
                if ((-46340 > b) || (b > FLOOR_SQRT_MAX_INT)) {
                    return i;
                }
                b *= b;
            }
        }
        return i2;
    }

    public static int factorial(int n) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.ironsource.B5.q, n);
        int[] iArr = factorials;
        if (n < iArr.length) {
            return iArr[n];
        }
        return Integer.MAX_VALUE;
    }

    public static int binomial(int n, int k) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.ironsource.B5.q, n);
        com.google.common.math.MathPreconditions.checkNonNegative("k", k);
        int i = 0;
        com.google.common.base.Preconditions.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        int[] iArr = biggestBinomials;
        if (k >= iArr.length || n > iArr[k]) {
            return Integer.MAX_VALUE;
        }
        if (k == 0) {
            return 1;
        }
        if (k == 1) {
            return n;
        }
        long j = 1;
        while (i < k) {
            long j2 = j * (n - i);
            i++;
            j = j2 / i;
        }
        return (int) j;
    }

    public static boolean isPrime(int n) {
        return com.google.common.math.LongMath.isPrime(n);
    }

    private IntMath() {
    }
}
