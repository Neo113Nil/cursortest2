package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class RSABlindingFactorGenerator {
    private static java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(0);
    private static java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoSizes;

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.RSAKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
            secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        if (this.getHighSpeedVideoSizes instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) {
            throw new java.lang.IllegalArgumentException("generator requires RSA public key");
        }
    }

    public java.math.BigInteger generateBlindingFactor() {
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = this.getHighSpeedVideoSizes;
        if (rSAKeyParameters == null) {
            throw new java.lang.IllegalStateException("generator not initialised");
        }
        java.math.BigInteger modulus = rSAKeyParameters.getModulus();
        int bitLength = modulus.bitLength();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength - 1, this.getHighResolutionOutputSizeshNQ4ISI);
            java.math.BigInteger gcd = createRandomBigInteger.gcd(modulus);
            if (!createRandomBigInteger.equals(getHighSpeedVideoFpsRanges) && !createRandomBigInteger.equals(getHighSpeedVideoFpsRangesFor) && gcd.equals(getHighSpeedVideoFpsRangesFor)) {
                return createRandomBigInteger;
            }
        }
    }
}
