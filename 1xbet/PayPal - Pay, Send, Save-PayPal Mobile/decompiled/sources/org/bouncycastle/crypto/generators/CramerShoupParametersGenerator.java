package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class CramerShoupParametersGenerator {
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    public void init(int i, int i2, java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = secureRandom;
    }

    static class ParametersHelper {
        private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(2);

        static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
            java.math.BigInteger modPow;
            java.math.BigInteger subtract = bigInteger.subtract(Camera2StreamConfigurationMap);
            do {
                java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap;
                modPow = org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger2, subtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (modPow.equals(org.bouncycastle.crypto.generators.CramerShoupParametersGenerator.getHighSpeedVideoFpsRanges));
            return modPow;
        }

        static java.math.BigInteger[] getHighSpeedVideoFpsRangesFor(int i, int i2, java.security.SecureRandom secureRandom) {
            java.math.BigInteger createRandomPrime;
            java.math.BigInteger add;
            while (true) {
                createRandomPrime = org.bouncycastle.util.BigIntegers.createRandomPrime(i - 1, 2, secureRandom);
                add = createRandomPrime.shiftLeft(1).add(org.bouncycastle.crypto.generators.CramerShoupParametersGenerator.getHighSpeedVideoFpsRanges);
                if (!add.isProbablePrime(i2) || (i2 > 2 && !createRandomPrime.isProbablePrime(i2))) {
                }
            }
            return new java.math.BigInteger[]{add, createRandomPrime};
        }

        private ParametersHelper() {
        }
    }

    public org.bouncycastle.crypto.params.CramerShoupParameters generateParameters(org.bouncycastle.crypto.params.DHParameters dHParameters) {
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI;
        java.math.BigInteger p = dHParameters.getP();
        java.math.BigInteger g = dHParameters.getG();
        do {
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.generators.CramerShoupParametersGenerator.ParametersHelper.getHighResolutionOutputSizeshNQ4ISI(p, this.Camera2StreamConfigurationMap);
        } while (g.equals(highResolutionOutputSizeshNQ4ISI));
        return new org.bouncycastle.crypto.params.CramerShoupParameters(p, g, highResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.digests.SHA256Digest());
    }

    public org.bouncycastle.crypto.params.CramerShoupParameters generateParameters() {
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI;
        java.math.BigInteger bigInteger = org.bouncycastle.crypto.generators.CramerShoupParametersGenerator.ParametersHelper.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap)[1];
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.crypto.generators.CramerShoupParametersGenerator.ParametersHelper.getHighResolutionOutputSizeshNQ4ISI(bigInteger, this.Camera2StreamConfigurationMap);
        do {
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.generators.CramerShoupParametersGenerator.ParametersHelper.getHighResolutionOutputSizeshNQ4ISI(bigInteger, this.Camera2StreamConfigurationMap);
        } while (highResolutionOutputSizeshNQ4ISI2.equals(highResolutionOutputSizeshNQ4ISI));
        return new org.bouncycastle.crypto.params.CramerShoupParameters(bigInteger, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.digests.SHA256Digest());
    }
}
