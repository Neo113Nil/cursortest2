package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
class DHParametersHelper {
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(2);

    static java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
        java.math.BigInteger modPow;
        java.math.BigInteger subtract = bigInteger.subtract(getHighSpeedVideoFpsRanges);
        do {
            java.math.BigInteger bigInteger2 = getHighSpeedVideoFpsRanges;
            modPow = org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger2, subtract, secureRandom).modPow(bigInteger2, bigInteger);
        } while (modPow.equals(getHighResolutionOutputSizeshNQ4ISI));
        return modPow;
    }

    static java.math.BigInteger[] getHighSpeedVideoFpsRangesFor(int i, int i2, java.security.SecureRandom secureRandom) {
        while (true) {
            java.math.BigInteger createRandomPrime = org.bouncycastle.util.BigIntegers.createRandomPrime(i - 1, 2, secureRandom);
            java.math.BigInteger add = createRandomPrime.shiftLeft(1).add(getHighResolutionOutputSizeshNQ4ISI);
            if (add.isProbablePrime(i2) && (i2 <= 2 || createRandomPrime.isProbablePrime(i2 - 2))) {
                if (org.bouncycastle.math.ec.WNafUtil.getNafWeight(add) >= (i >>> 2)) {
                    return new java.math.BigInteger[]{add, createRandomPrime};
                }
            }
        }
    }

    DHParametersHelper() {
    }
}
