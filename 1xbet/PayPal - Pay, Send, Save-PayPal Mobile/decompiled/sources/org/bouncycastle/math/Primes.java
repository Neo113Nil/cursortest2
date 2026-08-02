package org.bouncycastle.math;

/* loaded from: classes17.dex */
public abstract class Primes {
    public static final int SMALL_FACTOR_LIMIT = 211;
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(2);
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(3);

    public static class MROutput {
        private boolean Camera2StreamConfigurationMap;
        private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;

        static /* synthetic */ org.bouncycastle.math.Primes.MROutput getHighSpeedVideoSizes() {
            return new org.bouncycastle.math.Primes.MROutput(false, null);
        }

        static /* synthetic */ org.bouncycastle.math.Primes.MROutput getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger) {
            return new org.bouncycastle.math.Primes.MROutput(true, bigInteger);
        }

        static /* synthetic */ org.bouncycastle.math.Primes.MROutput Camera2StreamConfigurationMap() {
            return new org.bouncycastle.math.Primes.MROutput(true, null);
        }

        public boolean isProvablyComposite() {
            return this.Camera2StreamConfigurationMap;
        }

        public boolean isNotPrimePower() {
            return this.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == null;
        }

        public java.math.BigInteger getFactor() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        private MROutput(boolean z, java.math.BigInteger bigInteger) {
            this.Camera2StreamConfigurationMap = z;
            this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        }
    }

    private static java.math.BigInteger Camera2StreamConfigurationMap(org.bouncycastle.crypto.Digest digest, byte[] bArr, int i) {
        int digestSize = digest.getDigestSize();
        int i2 = i * digestSize;
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i; i3++) {
            i2 -= digestSize;
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr2, i2);
            Camera2StreamConfigurationMap(bArr, 1);
        }
        return new java.math.BigInteger(1, bArr2);
    }

    private static org.bouncycastle.math.Primes.STOutput getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest, int i, byte[] bArr) {
        int digestSize = digest.getDigestSize();
        byte b = 0;
        int i2 = 1;
        if (i < 33) {
            byte[] bArr2 = new byte[digestSize];
            byte[] bArr3 = new byte[digestSize];
            int i3 = 0;
            do {
                digest.update(bArr, 0, bArr.length);
                digest.doFinal(bArr2, 0);
                Camera2StreamConfigurationMap(bArr, 1);
                digest.update(bArr, 0, bArr.length);
                digest.doFinal(bArr3, 0);
                Camera2StreamConfigurationMap(bArr, 1);
                i3++;
                long highSpeedVideoFpsRanges = (((getHighSpeedVideoFpsRanges(bArr2) ^ getHighSpeedVideoFpsRanges(bArr3)) & ((-1) >>> (32 - i))) | (1 << (i - 1)) | 1) & 4294967295L;
                if (getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges)) {
                    return new org.bouncycastle.math.Primes.STOutput(java.math.BigInteger.valueOf(highSpeedVideoFpsRanges), bArr, i3, b);
                }
            } while (i3 <= i * 4);
            throw new java.lang.IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
        }
        org.bouncycastle.math.Primes.STOutput highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(digest, (i + 3) / 2, bArr);
        java.math.BigInteger prime = highSpeedVideoFpsRanges2.getPrime();
        byte[] primeSeed = highSpeedVideoFpsRanges2.getPrimeSeed();
        int primeGenCounter = highSpeedVideoFpsRanges2.getPrimeGenCounter();
        int i4 = i - 1;
        int i5 = (i4 / (digestSize * 8)) + 1;
        java.math.BigInteger Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(digest, primeSeed, i5);
        java.math.BigInteger bigInteger = getHighSpeedVideoFpsRanges;
        java.math.BigInteger bit = Camera2StreamConfigurationMap.mod(bigInteger.shiftLeft(i4)).setBit(i4);
        java.math.BigInteger shiftLeft = prime.shiftLeft(1);
        java.math.BigInteger shiftLeft2 = bit.subtract(bigInteger).divide(shiftLeft).add(bigInteger).shiftLeft(1);
        java.math.BigInteger add = shiftLeft2.multiply(prime).add(bigInteger);
        int i6 = primeGenCounter;
        int i7 = 0;
        while (true) {
            if (add.bitLength() > i) {
                java.math.BigInteger bigInteger2 = getHighSpeedVideoFpsRanges;
                java.math.BigInteger shiftLeft3 = bigInteger2.shiftLeft(i4).subtract(bigInteger2).divide(shiftLeft).add(bigInteger2).shiftLeft(i2);
                add = shiftLeft3.multiply(prime).add(bigInteger2);
                shiftLeft2 = shiftLeft3;
            }
            i6 += i2;
            if (getHighSpeedVideoFpsRangesFor(add)) {
                Camera2StreamConfigurationMap(primeSeed, i5);
            } else {
                java.math.BigInteger add2 = Camera2StreamConfigurationMap(digest, primeSeed, i5).mod(add.subtract(getHighResolutionOutputSizeshNQ4ISI)).add(getHighSpeedVideoFpsRangesFor);
                shiftLeft2 = shiftLeft2.add(java.math.BigInteger.valueOf(i7));
                java.math.BigInteger modPow = add2.modPow(shiftLeft2, add);
                java.math.BigInteger bigInteger3 = getHighSpeedVideoFpsRanges;
                if (add.gcd(modPow.subtract(bigInteger3)).equals(bigInteger3) && modPow.modPow(prime, add).equals(bigInteger3)) {
                    return new org.bouncycastle.math.Primes.STOutput(add, primeSeed, i6, b);
                }
                i7 = 0;
            }
            if (i6 >= (i * 4) + primeGenCounter) {
                throw new java.lang.IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
            }
            i7 += 2;
            add = add.add(shiftLeft);
            i2 = 1;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(long j) {
        if ((j >>> 32) != 0) {
            throw new java.lang.IllegalArgumentException("Size limit exceeded");
        }
        if (j <= 5) {
            return j == 2 || j == 3 || j == 5;
        }
        if ((1 & j) == 0 || j % 3 == 0 || j % 5 == 0) {
            return false;
        }
        long[] jArr = {1, 7, 11, 13, 17, 19, 23, 29};
        long j2 = 0;
        int i = 1;
        while (true) {
            if (i >= 8) {
                j2 += 30;
                if (j2 * j2 >= j) {
                    return true;
                }
                i = 0;
            } else {
                if (j % (jArr[i] + j2) == 0) {
                    return j < 30;
                }
                i++;
            }
        }
    }

    public static boolean isMRProbablePrimeToBase(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        getHighSpeedVideoFpsRangesFor(bigInteger, "candidate");
        getHighSpeedVideoFpsRangesFor(bigInteger2, "base");
        java.math.BigInteger bigInteger3 = getHighSpeedVideoFpsRanges;
        if (bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) >= 0) {
            throw new java.lang.IllegalArgumentException("'base' must be < ('candidate' - 1)");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        java.math.BigInteger subtract = bigInteger.subtract(bigInteger3);
        int lowestSetBit = subtract.getLowestSetBit();
        return Camera2StreamConfigurationMap(bigInteger, subtract, subtract.shiftRight(lowestSetBit), lowestSetBit, bigInteger2);
    }

    public static boolean isMRProbablePrime(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom, int i) {
        getHighSpeedVideoFpsRangesFor(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new java.lang.IllegalArgumentException("'random' cannot be null");
        }
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        if (!bigInteger.testBit(0)) {
            return false;
        }
        java.math.BigInteger subtract = bigInteger.subtract(getHighSpeedVideoFpsRanges);
        java.math.BigInteger subtract2 = bigInteger.subtract(getHighSpeedVideoFpsRangesFor);
        int lowestSetBit = subtract.getLowestSetBit();
        java.math.BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            if (!Camera2StreamConfigurationMap(bigInteger, subtract, shiftRight, lowestSetBit, org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoFpsRangesFor, subtract2, secureRandom))) {
                return false;
            }
        }
        return true;
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int length = bArr.length;
        while (i > 0) {
            length--;
            if (length < 0) {
                return;
            }
            int i2 = i + (bArr[length] & 255);
            bArr[length] = (byte) i2;
            i = i2 >>> 8;
        }
    }

    private static boolean Camera2StreamConfigurationMap(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i, java.math.BigInteger bigInteger4) {
        java.math.BigInteger modPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (modPow.equals(getHighSpeedVideoFpsRanges) || modPow.equals(bigInteger2)) {
            return true;
        }
        for (int i2 = 1; i2 < i; i2++) {
            modPow = modPow.modPow(getHighSpeedVideoFpsRangesFor, bigInteger);
            if (modPow.equals(bigInteger2)) {
                return true;
            }
            if (modPow.equals(getHighSpeedVideoFpsRanges)) {
                return false;
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger) {
        int intValue = bigInteger.mod(java.math.BigInteger.valueOf(223092870L)).intValue();
        if (intValue % 2 == 0 || intValue % 3 == 0 || intValue % 5 == 0 || intValue % 7 == 0 || intValue % 11 == 0 || intValue % 13 == 0 || intValue % 17 == 0 || intValue % 19 == 0 || intValue % 23 == 0) {
            return true;
        }
        int intValue2 = bigInteger.mod(java.math.BigInteger.valueOf(58642669L)).intValue();
        if (intValue2 % 29 == 0 || intValue2 % 31 == 0 || intValue2 % 37 == 0 || intValue2 % 41 == 0 || intValue2 % 43 == 0) {
            return true;
        }
        int intValue3 = bigInteger.mod(java.math.BigInteger.valueOf(600662303L)).intValue();
        if (intValue3 % 47 == 0 || intValue3 % 53 == 0 || intValue3 % 59 == 0 || intValue3 % 61 == 0 || intValue3 % 67 == 0) {
            return true;
        }
        int intValue4 = bigInteger.mod(java.math.BigInteger.valueOf(33984931L)).intValue();
        if (intValue4 % 71 == 0 || intValue4 % 73 == 0 || intValue4 % 79 == 0 || intValue4 % 83 == 0) {
            return true;
        }
        int intValue5 = bigInteger.mod(java.math.BigInteger.valueOf(89809099L)).intValue();
        if (intValue5 % 89 == 0 || intValue5 % 97 == 0 || intValue5 % 101 == 0 || intValue5 % 103 == 0) {
            return true;
        }
        int intValue6 = bigInteger.mod(java.math.BigInteger.valueOf(167375713L)).intValue();
        if (intValue6 % 107 == 0 || intValue6 % 109 == 0 || intValue6 % 113 == 0 || intValue6 % 127 == 0) {
            return true;
        }
        int intValue7 = bigInteger.mod(java.math.BigInteger.valueOf(371700317L)).intValue();
        if (intValue7 % 131 == 0 || intValue7 % 137 == 0 || intValue7 % com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE == 0 || intValue7 % 149 == 0) {
            return true;
        }
        int intValue8 = bigInteger.mod(java.math.BigInteger.valueOf(645328247L)).intValue();
        if (intValue8 % 151 == 0 || intValue8 % 157 == 0 || intValue8 % 163 == 0 || intValue8 % 167 == 0) {
            return true;
        }
        int intValue9 = bigInteger.mod(java.math.BigInteger.valueOf(1070560157L)).intValue();
        if (intValue9 % com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE == 0 || intValue9 % 179 == 0 || intValue9 % 181 == 0 || intValue9 % com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE == 0) {
            return true;
        }
        int intValue10 = bigInteger.mod(java.math.BigInteger.valueOf(1596463769L)).intValue();
        return intValue10 % 193 == 0 || intValue10 % 197 == 0 || intValue10 % 199 == 0 || intValue10 % 211 == 0;
    }

    public static boolean hasAnySmallFactors(java.math.BigInteger bigInteger) {
        getHighSpeedVideoFpsRangesFor(bigInteger, "candidate");
        return getHighSpeedVideoFpsRangesFor(bigInteger);
    }

    public static class STOutput {
        private byte[] Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

        public byte[] getPrimeSeed() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getPrimeGenCounter() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public java.math.BigInteger getPrime() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* synthetic */ STOutput(java.math.BigInteger bigInteger, byte[] bArr, int i, byte b) {
            this(bigInteger, bArr, i);
        }

        private STOutput(java.math.BigInteger bigInteger, byte[] bArr, int i) {
            this.getHighSpeedVideoFpsRangesFor = bigInteger;
            this.Camera2StreamConfigurationMap = bArr;
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    public static org.bouncycastle.math.Primes.STOutput generateSTRandomPrime(org.bouncycastle.crypto.Digest digest, int i, byte[] bArr) {
        if (digest == null) {
            throw new java.lang.IllegalArgumentException("'hash' cannot be null");
        }
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("'length' must be >= 2");
        }
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("'inputSeed' cannot be null or empty");
        }
        return getHighSpeedVideoFpsRanges(digest, i, org.bouncycastle.util.Arrays.clone(bArr));
    }

    private static int getHighSpeedVideoFpsRanges(byte[] bArr) {
        int min = java.lang.Math.min(4, bArr.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            int i3 = i + 1;
            i2 |= (bArr[bArr.length - i3] & 255) << (i * 8);
            i = i3;
        }
        return i2;
    }

    public static org.bouncycastle.math.Primes.MROutput enhancedMRProbablePrimeTest(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom, int i) {
        java.math.BigInteger bigInteger2;
        getHighSpeedVideoFpsRangesFor(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new java.lang.IllegalArgumentException("'random' cannot be null");
        }
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return org.bouncycastle.math.Primes.MROutput.getHighSpeedVideoSizes();
        }
        if (!bigInteger.testBit(0)) {
            return org.bouncycastle.math.Primes.MROutput.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor);
        }
        java.math.BigInteger subtract = bigInteger.subtract(getHighSpeedVideoFpsRanges);
        java.math.BigInteger subtract2 = bigInteger.subtract(getHighSpeedVideoFpsRangesFor);
        int lowestSetBit = subtract.getLowestSetBit();
        java.math.BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            java.math.BigInteger createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoFpsRangesFor, subtract2, secureRandom);
            java.math.BigInteger gcd = createRandomInRange.gcd(bigInteger);
            java.math.BigInteger bigInteger3 = getHighSpeedVideoFpsRanges;
            if (gcd.compareTo(bigInteger3) > 0) {
                return org.bouncycastle.math.Primes.MROutput.getHighSpeedVideoFpsRanges(gcd);
            }
            java.math.BigInteger modPow = createRandomInRange.modPow(shiftRight, bigInteger);
            if (!modPow.equals(bigInteger3) && !modPow.equals(subtract)) {
                boolean z = true;
                int i3 = 1;
                while (true) {
                    if (i3 >= lowestSetBit) {
                        z = false;
                        bigInteger2 = modPow;
                        break;
                    }
                    bigInteger2 = modPow.modPow(getHighSpeedVideoFpsRangesFor, bigInteger);
                    if (bigInteger2.equals(subtract)) {
                        break;
                    }
                    if (bigInteger2.equals(getHighSpeedVideoFpsRanges)) {
                        z = false;
                        break;
                    }
                    i3++;
                    modPow = bigInteger2;
                }
                if (!z) {
                    java.math.BigInteger bigInteger4 = getHighSpeedVideoFpsRanges;
                    if (!bigInteger2.equals(bigInteger4)) {
                        modPow = bigInteger2.modPow(getHighSpeedVideoFpsRangesFor, bigInteger);
                        if (modPow.equals(bigInteger4)) {
                            modPow = bigInteger2;
                        }
                    }
                    java.math.BigInteger gcd2 = modPow.subtract(bigInteger4).gcd(bigInteger);
                    return gcd2.compareTo(bigInteger4) > 0 ? org.bouncycastle.math.Primes.MROutput.getHighSpeedVideoFpsRanges(gcd2) : org.bouncycastle.math.Primes.MROutput.Camera2StreamConfigurationMap();
                }
            }
        }
        return org.bouncycastle.math.Primes.MROutput.getHighSpeedVideoSizes();
    }

    private static void getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger, java.lang.String str) {
        if (bigInteger == null || bigInteger.signum() <= 0 || bigInteger.bitLength() < 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(str);
            sb.append("' must be non-null and >= 2");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
