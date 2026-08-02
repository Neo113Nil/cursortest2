package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class RSABlindingParameters implements org.bouncycastle.crypto.CipherParameters {
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.RSAKeyParameters getPublicKey() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getBlindingFactor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public RSABlindingParameters(org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters, java.math.BigInteger bigInteger) {
        if (rSAKeyParameters instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) {
            throw new java.lang.IllegalArgumentException("RSA parameters should be for a public key");
        }
        this.getHighSpeedVideoSizes = rSAKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }
}
