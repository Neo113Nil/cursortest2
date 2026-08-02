package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class DHBasicAgreement implements org.bouncycastle.crypto.BasicAgreement {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.DHParameters getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.DHPrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters = (org.bouncycastle.crypto.params.DHPrivateKeyParameters) asymmetricKeyParameter;
        this.getHighResolutionOutputSizeshNQ4ISI = dHPrivateKeyParameters;
        this.getHighSpeedVideoFpsRanges = dHPrivateKeyParameters.getParameters();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.DHPublicKeyParameters dHPublicKeyParameters = (org.bouncycastle.crypto.params.DHPublicKeyParameters) cipherParameters;
        if (!dHPublicKeyParameters.getParameters().equals(this.getHighSpeedVideoFpsRanges)) {
            throw new java.lang.IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        java.math.BigInteger p = this.getHighSpeedVideoFpsRanges.getP();
        java.math.BigInteger y = dHPublicKeyParameters.getY();
        if (y != null) {
            java.math.BigInteger bigInteger = getHighSpeedVideoFpsRangesFor;
            if (y.compareTo(bigInteger) > 0 && y.compareTo(p.subtract(bigInteger)) < 0) {
                java.math.BigInteger modPow = y.modPow(this.getHighResolutionOutputSizeshNQ4ISI.getX(), p);
                if (modPow.equals(bigInteger)) {
                    throw new java.lang.IllegalStateException("Shared key can't be 1");
                }
                return modPow;
            }
        }
        throw new java.lang.IllegalArgumentException("Diffie-Hellman public key is weak");
    }
}
