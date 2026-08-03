package com.google.common.math;

@com.google.common.math.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class BigIntegerMath {
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;
    static final java.math.BigInteger SQRT2_PRECOMPUTED_BITS = new java.math.BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double LN_10 = java.lang.Math.log(10.0d);
    private static final double LN_2 = java.lang.Math.log(2.0d);

    public static java.math.BigInteger ceilingPowerOfTwo(java.math.BigInteger x) {
        return java.math.BigInteger.ZERO.setBit(log2(x, java.math.RoundingMode.CEILING));
    }

    public static java.math.BigInteger floorPowerOfTwo(java.math.BigInteger x) {
        return java.math.BigInteger.ZERO.setBit(log2(x, java.math.RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(java.math.BigInteger x) {
        com.google.common.base.Preconditions.checkNotNull(x);
        return x.signum() > 0 && x.getLowestSetBit() == x.bitLength() - 1;
    }

    public static int log2(java.math.BigInteger x, java.math.RoundingMode mode) {
        com.google.common.math.MathPreconditions.checkPositive("x", (java.math.BigInteger) com.google.common.base.Preconditions.checkNotNull(x));
        int bitLength = x.bitLength();
        int i = bitLength - 1;
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
            case 2:
            case 3:
                return i;
            case 4:
            case 5:
                return isPowerOfTwo(x) ? i : bitLength;
            case 6:
            case 7:
            case 8:
                return i < 256 ? x.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - i)) <= 0 ? i : bitLength : x.pow(2).bitLength() + (-1) < (i * 2) + 1 ? i : bitLength;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
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

    public static int log10(java.math.BigInteger x, java.math.RoundingMode mode) {
        int i;
        com.google.common.math.MathPreconditions.checkPositive("x", x);
        if (fitsInLong(x)) {
            return com.google.common.math.LongMath.log10(x.longValue(), mode);
        }
        int log2 = (int) ((log2(x, java.math.RoundingMode.FLOOR) * LN_2) / LN_10);
        java.math.BigInteger pow = java.math.BigInteger.TEN.pow(log2);
        int compareTo = pow.compareTo(x);
        if (compareTo > 0) {
            do {
                log2--;
                pow = pow.divide(java.math.BigInteger.TEN);
                i = pow.compareTo(x);
            } while (i > 0);
        } else {
            java.math.BigInteger multiply = java.math.BigInteger.TEN.multiply(pow);
            int i2 = compareTo;
            int compareTo2 = multiply.compareTo(x);
            while (compareTo2 <= 0) {
                log2++;
                java.math.BigInteger multiply2 = java.math.BigInteger.TEN.multiply(multiply);
                int compareTo3 = multiply2.compareTo(x);
                java.math.BigInteger bigInteger = multiply;
                multiply = multiply2;
                pow = bigInteger;
                i2 = compareTo2;
                compareTo2 = compareTo3;
            }
            i = i2;
        }
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(i == 0);
            case 2:
            case 3:
                return log2;
            case 4:
            case 5:
                return pow.equals(x) ? log2 : log2 + 1;
            case 6:
            case 7:
            case 8:
                return x.pow(2).compareTo(pow.pow(2).multiply(java.math.BigInteger.TEN)) <= 0 ? log2 : log2 + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static java.math.BigInteger sqrt(java.math.BigInteger x, java.math.RoundingMode mode) {
        com.google.common.math.MathPreconditions.checkNonNegative("x", x);
        if (fitsInLong(x)) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.sqrt(x.longValue(), mode));
        }
        java.math.BigInteger sqrtFloor = sqrtFloor(x);
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(sqrtFloor.pow(2).equals(x));
            case 2:
            case 3:
                return sqrtFloor;
            case 4:
            case 5:
                int intValue = sqrtFloor.intValue();
                return (intValue * intValue == x.intValue() && sqrtFloor.pow(2).equals(x)) ? sqrtFloor : sqrtFloor.add(java.math.BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return sqrtFloor.pow(2).add(sqrtFloor).compareTo(x) >= 0 ? sqrtFloor : sqrtFloor.add(java.math.BigInteger.ONE);
            default:
                throw new java.lang.AssertionError();
        }
    }

    private static java.math.BigInteger sqrtFloor(java.math.BigInteger x) {
        java.math.BigInteger shiftLeft;
        int log2 = log2(x, java.math.RoundingMode.FLOOR);
        if (log2 < 1023) {
            shiftLeft = sqrtApproxWithDoubles(x);
        } else {
            int i = (log2 - 52) & (-2);
            shiftLeft = sqrtApproxWithDoubles(x.shiftRight(i)).shiftLeft(i >> 1);
        }
        java.math.BigInteger shiftRight = shiftLeft.add(x.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            java.math.BigInteger shiftRight2 = shiftRight.add(x.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }

    private static java.math.BigInteger sqrtApproxWithDoubles(java.math.BigInteger x) {
        return com.google.common.math.DoubleMath.roundToBigInteger(java.lang.Math.sqrt(com.google.common.math.DoubleUtils.bigToDouble(x)), java.math.RoundingMode.HALF_EVEN);
    }

    public static double roundToDouble(java.math.BigInteger x, java.math.RoundingMode mode) {
        return com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder.INSTANCE.roundToDouble(x, mode);
    }

    private static class BigIntegerToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigInteger> {
        static final com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder INSTANCE = new com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(java.math.BigInteger bigInteger) {
            return com.google.common.math.DoubleUtils.bigToDouble(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public int sign(java.math.BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public java.math.BigInteger toX(double d, java.math.RoundingMode mode) {
            return com.google.common.math.DoubleMath.roundToBigInteger(d, mode);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public java.math.BigInteger minus(java.math.BigInteger a2, java.math.BigInteger b) {
            return a2.subtract(b);
        }
    }

    public static java.math.BigInteger divide(java.math.BigInteger p, java.math.BigInteger q, java.math.RoundingMode mode) {
        return new java.math.BigDecimal(p).divide(new java.math.BigDecimal(q), 0, mode).toBigIntegerExact();
    }

    public static java.math.BigInteger factorial(int n) {
        com.google.common.math.MathPreconditions.checkNonNegative(com.ironsource.B5.q, n);
        if (n < com.google.common.math.LongMath.factorials.length) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.factorials[n]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(com.google.common.math.IntMath.divide(com.google.common.math.IntMath.log2(n, java.math.RoundingMode.CEILING) * n, 64, java.math.RoundingMode.CEILING));
        int length = com.google.common.math.LongMath.factorials.length;
        long j = com.google.common.math.LongMath.factorials[length - 1];
        int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long j2 = j >> numberOfTrailingZeros;
        int log2 = com.google.common.math.LongMath.log2(j2, java.math.RoundingMode.FLOOR) + 1;
        long j3 = length;
        int log22 = com.google.common.math.LongMath.log2(j3, java.math.RoundingMode.FLOOR);
        int i = log22 + 1;
        int i2 = 1 << log22;
        while (j3 <= n) {
            if ((i2 & j3) != 0) {
                i2 <<= 1;
                i++;
            }
            int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((i - numberOfTrailingZeros2) + log2 >= 64) {
                arrayList.add(java.math.BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j4;
            log2 = com.google.common.math.LongMath.log2(j2, java.math.RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(java.math.BigInteger.valueOf(j2));
        }
        return listProduct(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> nums) {
        return listProduct(nums, 0, nums.size());
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> nums, int start, int end) {
        int i = end - start;
        if (i == 0) {
            return java.math.BigInteger.ONE;
        }
        if (i == 1) {
            return nums.get(start);
        }
        if (i == 2) {
            return nums.get(start).multiply(nums.get(start + 1));
        }
        if (i == 3) {
            return nums.get(start).multiply(nums.get(start + 1)).multiply(nums.get(start + 2));
        }
        int i2 = (end + start) >>> 1;
        return listProduct(nums, start, i2).multiply(listProduct(nums, i2, end));
    }

    public static java.math.BigInteger binomial(int n, int k) {
        int i;
        com.google.common.math.MathPreconditions.checkNonNegative(com.ironsource.B5.q, n);
        com.google.common.math.MathPreconditions.checkNonNegative("k", k);
        int i2 = 1;
        com.google.common.base.Preconditions.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        if (k < com.google.common.math.LongMath.biggestBinomials.length && n <= com.google.common.math.LongMath.biggestBinomials[k]) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.binomial(n, k));
        }
        java.math.BigInteger bigInteger = java.math.BigInteger.ONE;
        long j = n;
        int log2 = com.google.common.math.LongMath.log2(j, java.math.RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i3 = log2;
            while (i2 < k) {
                i = n - i2;
                i2++;
                i3 += log2;
                if (i3 >= 63) {
                    break;
                }
                j *= i;
                j2 *= i2;
            }
            return bigInteger.multiply(java.math.BigInteger.valueOf(j)).divide(java.math.BigInteger.valueOf(j2));
            bigInteger = bigInteger.multiply(java.math.BigInteger.valueOf(j)).divide(java.math.BigInteger.valueOf(j2));
            j = i;
            j2 = i2;
        }
    }

    static boolean fitsInLong(java.math.BigInteger x) {
        return x.bitLength() <= 63;
    }

    private BigIntegerMath() {
    }
}
