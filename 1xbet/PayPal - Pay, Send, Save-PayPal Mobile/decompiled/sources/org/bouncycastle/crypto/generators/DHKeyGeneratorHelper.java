package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
class DHKeyGeneratorHelper {
    static final org.bouncycastle.crypto.generators.DHKeyGeneratorHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.generators.DHKeyGeneratorHelper();
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(2);

    static java.math.BigInteger getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.params.DHParameters dHParameters, java.math.BigInteger bigInteger) {
        return dHParameters.getG().modPow(bigInteger, dHParameters.getP());
    }

    static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.params.DHParameters dHParameters, java.security.SecureRandom secureRandom) {
        java.math.BigInteger createRandomInRange;
        java.math.BigInteger bit;
        int l = dHParameters.getL();
        if (l != 0) {
            do {
                bit = org.bouncycastle.util.BigIntegers.createRandomBigInteger(l, secureRandom).setBit(l - 1);
            } while (org.bouncycastle.math.ec.WNafUtil.getNafWeight(bit) < (l >>> 2));
            return bit;
        }
        java.math.BigInteger bigInteger = getHighSpeedVideoSizes;
        int m = dHParameters.getM();
        java.math.BigInteger shiftLeft = m != 0 ? Camera2StreamConfigurationMap.shiftLeft(m - 1) : bigInteger;
        java.math.BigInteger q = dHParameters.getQ();
        if (q == null) {
            q = dHParameters.getP();
        }
        java.math.BigInteger subtract = q.subtract(bigInteger);
        int bitLength = subtract.bitLength();
        do {
            createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(shiftLeft, subtract, secureRandom);
        } while (org.bouncycastle.math.ec.WNafUtil.getNafWeight(createRandomInRange) < (bitLength >>> 2));
        return createRandomInRange;
    }

    private DHKeyGeneratorHelper() {
    }
}
