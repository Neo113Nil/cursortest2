package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class DHAgreement {
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.DHParameters getHighSpeedVideoSizes;

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighSpeedVideoFpsRanges = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.DHPrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters = (org.bouncycastle.crypto.params.DHPrivateKeyParameters) asymmetricKeyParameter;
        this.getHighResolutionOutputSizeshNQ4ISI = dHPrivateKeyParameters;
        this.getHighSpeedVideoSizes = dHPrivateKeyParameters.getParameters();
    }

    public java.math.BigInteger calculateMessage() {
        org.bouncycastle.crypto.generators.DHKeyPairGenerator dHKeyPairGenerator = new org.bouncycastle.crypto.generators.DHKeyPairGenerator();
        dHKeyPairGenerator.init(new org.bouncycastle.crypto.params.DHKeyGenerationParameters(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = dHKeyPairGenerator.generateKeyPair();
        this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.crypto.params.DHPrivateKeyParameters) generateKeyPair.getPrivate()).getX();
        return ((org.bouncycastle.crypto.params.DHPublicKeyParameters) generateKeyPair.getPublic()).getY();
    }

    public java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters, java.math.BigInteger bigInteger) {
        if (!dHPublicKeyParameters.getParameters().equals(this.getHighSpeedVideoSizes)) {
            throw new java.lang.IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        java.math.BigInteger p = this.getHighSpeedVideoSizes.getP();
        java.math.BigInteger y = dHPublicKeyParameters.getY();
        if (y != null) {
            java.math.BigInteger bigInteger2 = Camera2StreamConfigurationMap;
            if (y.compareTo(bigInteger2) > 0 && y.compareTo(p.subtract(bigInteger2)) < 0) {
                java.math.BigInteger modPow = y.modPow(this.getHighSpeedVideoFpsRangesFor, p);
                if (modPow.equals(bigInteger2)) {
                    throw new java.lang.IllegalStateException("Shared key can't be 1");
                }
                return bigInteger.modPow(this.getHighResolutionOutputSizeshNQ4ISI.getX(), p).multiply(modPow).mod(p);
            }
        }
        throw new java.lang.IllegalArgumentException("Diffie-Hellman public key is weak");
    }
}
