package com.google.common.math;

/* loaded from: classes9.dex */
public final class BigIntegerMath {
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;
    static final java.math.BigInteger SQRT2_PRECOMPUTED_BITS = new java.math.BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double LN_10 = java.lang.Math.log(10.0d);
    private static final double LN_2 = java.lang.Math.log(2.0d);

    public static java.math.BigInteger ceilingPowerOfTwo(java.math.BigInteger bigInteger) {
        return java.math.BigInteger.ZERO.setBit(log2(bigInteger, java.math.RoundingMode.CEILING));
    }

    public static java.math.BigInteger floorPowerOfTwo(java.math.BigInteger bigInteger) {
        return java.math.BigInteger.ZERO.setBit(log2(bigInteger, java.math.RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(java.math.BigInteger bigInteger) {
        com.google.common.base.Preconditions.checkNotNull(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int log2(java.math.BigInteger bigInteger, java.math.RoundingMode roundingMode) {
        com.google.common.math.MathPreconditions.checkPositive("x", (java.math.BigInteger) com.google.common.base.Preconditions.checkNotNull(bigInteger));
        int bitLength = bigInteger.bitLength();
        int i = bitLength - 1;
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(bigInteger));
                return i;
            case 2:
            case 3:
                return i;
            case 4:
            case 5:
                if (!isPowerOfTwo(bigInteger)) {
                    return bitLength;
                }
                break;
            case 6:
            case 7:
            case 8:
                if (i < 256) {
                    if (bigInteger.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - i)) > 0) {
                        return bitLength;
                    }
                } else if (bigInteger.pow(2).bitLength() - 1 >= (i * 2) + 1) {
                    return bitLength;
                }
                return i;
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

    public static int log10(java.math.BigInteger bigInteger, java.math.RoundingMode roundingMode) {
        int i;
        com.google.common.math.MathPreconditions.checkPositive("x", bigInteger);
        if (fitsInLong(bigInteger)) {
            return com.google.common.math.LongMath.log10(bigInteger.longValue(), roundingMode);
        }
        int log2 = (int) ((log2(bigInteger, java.math.RoundingMode.FLOOR) * LN_2) / LN_10);
        java.math.BigInteger pow = java.math.BigInteger.TEN.pow(log2);
        int compareTo = pow.compareTo(bigInteger);
        if (compareTo > 0) {
            do {
                log2--;
                pow = pow.divide(java.math.BigInteger.TEN);
                i = pow.compareTo(bigInteger);
            } while (i > 0);
        } else {
            java.math.BigInteger multiply = java.math.BigInteger.TEN.multiply(pow);
            int compareTo2 = multiply.compareTo(bigInteger);
            java.math.BigInteger bigInteger2 = pow;
            java.math.BigInteger bigInteger3 = multiply;
            int i2 = compareTo;
            while (compareTo2 <= 0) {
                log2++;
                java.math.BigInteger multiply2 = java.math.BigInteger.TEN.multiply(bigInteger3);
                int compareTo3 = multiply2.compareTo(bigInteger);
                bigInteger2 = bigInteger3;
                bigInteger3 = multiply2;
                int i3 = compareTo2;
                compareTo2 = compareTo3;
                i2 = i3;
            }
            pow = bigInteger2;
            i = i2;
        }
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(i == 0);
                return log2;
            case 2:
            case 3:
                return log2;
            case 4:
            case 5:
                return pow.equals(bigInteger) ? log2 : log2 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(pow.pow(2).multiply(java.math.BigInteger.TEN)) <= 0 ? log2 : log2 + 1;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static java.math.BigInteger sqrt(java.math.BigInteger bigInteger, java.math.RoundingMode roundingMode) {
        com.google.common.math.MathPreconditions.checkNonNegative("x", bigInteger);
        if (fitsInLong(bigInteger)) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.sqrt(bigInteger.longValue(), roundingMode));
        }
        java.math.BigInteger sqrtFloor = sqrtFloor(bigInteger);
        switch (com.google.common.math.BigIntegerMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.MathPreconditions.checkRoundingUnnecessary(sqrtFloor.pow(2).equals(bigInteger));
                return sqrtFloor;
            case 2:
            case 3:
                return sqrtFloor;
            case 4:
            case 5:
                int intValue = sqrtFloor.intValue();
                return (intValue * intValue == bigInteger.intValue() && sqrtFloor.pow(2).equals(bigInteger)) ? sqrtFloor : sqrtFloor.add(java.math.BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                if (sqrtFloor.pow(2).add(sqrtFloor).compareTo(bigInteger) < 0) {
                    return sqrtFloor.add(java.math.BigInteger.ONE);
                }
                return sqrtFloor;
            default:
                throw new java.lang.AssertionError();
        }
    }

    private static java.math.BigInteger sqrtFloor(java.math.BigInteger bigInteger) {
        java.math.BigInteger shiftLeft;
        int log2 = log2(bigInteger, java.math.RoundingMode.FLOOR);
        if (log2 < 1023) {
            shiftLeft = sqrtApproxWithDoubles(bigInteger);
        } else {
            int i = (log2 - 52) & (-2);
            shiftLeft = sqrtApproxWithDoubles(bigInteger.shiftRight(i)).shiftLeft(i >> 1);
        }
        java.math.BigInteger shiftRight = shiftLeft.add(bigInteger.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            java.math.BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }

    private static java.math.BigInteger sqrtApproxWithDoubles(java.math.BigInteger bigInteger) {
        return com.google.common.math.DoubleMath.roundToBigInteger(java.lang.Math.sqrt(com.google.common.math.DoubleUtils.bigToDouble(bigInteger)), java.math.RoundingMode.HALF_EVEN);
    }

    public static double roundToDouble(java.math.BigInteger bigInteger, java.math.RoundingMode roundingMode) {
        return com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder.INSTANCE.roundToDouble(bigInteger, roundingMode);
    }

    static final class BigIntegerToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigInteger> {
        static final com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder INSTANCE = new com.google.common.math.BigIntegerMath.BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final double roundToDoubleArbitrarily(java.math.BigInteger bigInteger) {
            return com.google.common.math.DoubleUtils.bigToDouble(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final int sign(java.math.BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final java.math.BigInteger toX(double d, java.math.RoundingMode roundingMode) {
            return com.google.common.math.DoubleMath.roundToBigInteger(d, roundingMode);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public final java.math.BigInteger minus(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }
    }

    public static java.math.BigInteger divide(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.RoundingMode roundingMode) {
        return new java.math.BigDecimal(bigInteger).divide(new java.math.BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static java.math.BigInteger factorial(int i) {
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        if (i < com.google.common.math.LongMath.factorials.length) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.factorials[i]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(com.google.common.math.IntMath.divide(com.google.common.math.IntMath.log2(i, java.math.RoundingMode.CEILING) * i, 64, java.math.RoundingMode.CEILING));
        int length = com.google.common.math.LongMath.factorials.length;
        long j = com.google.common.math.LongMath.factorials[length - 1];
        int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long j2 = j >> numberOfTrailingZeros;
        int log2 = com.google.common.math.LongMath.log2(j2, java.math.RoundingMode.FLOOR) + 1;
        long j3 = length;
        int log22 = com.google.common.math.LongMath.log2(j3, java.math.RoundingMode.FLOOR);
        int i2 = log22 + 1;
        int i3 = 1 << log22;
        while (j3 <= i) {
            if ((i3 & j3) != 0) {
                i3 <<= 1;
                i2++;
            }
            int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j3);
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((i2 - numberOfTrailingZeros2) + log2 >= 64) {
                arrayList.add(java.math.BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j3 >> numberOfTrailingZeros2;
            log2 = com.google.common.math.LongMath.log2(j2, java.math.RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(java.math.BigInteger.valueOf(j2));
        }
        return listProduct(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> list) {
        return listProduct(list, 0, list.size());
    }

    static java.math.BigInteger listProduct(java.util.List<java.math.BigInteger> list, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return java.math.BigInteger.ONE;
        }
        if (i3 == 1) {
            return list.get(i);
        }
        if (i3 == 2) {
            return list.get(i).multiply(list.get(i + 1));
        }
        if (i3 == 3) {
            return list.get(i).multiply(list.get(i + 1)).multiply(list.get(i + 2));
        }
        int i4 = (i2 + i) >>> 1;
        return listProduct(list, i, i4).multiply(listProduct(list, i4, i2));
    }

    public static java.math.BigInteger binomial(int i, int i2) {
        int i3;
        com.google.common.math.MathPreconditions.checkNonNegative("n", i);
        com.google.common.math.MathPreconditions.checkNonNegative("k", i2);
        int i4 = 1;
        com.google.common.base.Preconditions.checkArgument(i2 <= i, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        if (i2 < com.google.common.math.LongMath.biggestBinomials.length && i <= com.google.common.math.LongMath.biggestBinomials[i2]) {
            return java.math.BigInteger.valueOf(com.google.common.math.LongMath.binomial(i, i2));
        }
        java.math.BigInteger bigInteger = java.math.BigInteger.ONE;
        long j = i;
        int log2 = com.google.common.math.LongMath.log2(j, java.math.RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i5 = log2;
            while (i4 < i2) {
                i3 = i - i4;
                i4++;
                i5 += log2;
                if (i5 >= 63) {
                    break;
                }
                j *= i3;
                j2 *= i4;
            }
            return bigInteger.multiply(java.math.BigInteger.valueOf(j)).divide(java.math.BigInteger.valueOf(j2));
            bigInteger = bigInteger.multiply(java.math.BigInteger.valueOf(j)).divide(java.math.BigInteger.valueOf(j2));
            j = i3;
            j2 = i4;
        }
    }

    static boolean fitsInLong(java.math.BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    private BigIntegerMath() {
    }
}
