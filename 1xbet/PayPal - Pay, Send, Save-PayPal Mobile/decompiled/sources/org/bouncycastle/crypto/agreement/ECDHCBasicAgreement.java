package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class ECDHCBasicAgreement implements org.bouncycastle.crypto.BasicAgreement {
    org.bouncycastle.crypto.params.ECPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighResolutionOutputSizeshNQ4ISI.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new java.lang.IllegalStateException("ECDHC public key has wrong domain parameters");
        }
        java.math.BigInteger mod = parameters.getH().multiply(this.getHighResolutionOutputSizeshNQ4ISI.getD()).mod(parameters.getN());
        org.bouncycastle.math.ec.ECPoint cleanPoint = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (cleanPoint.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        org.bouncycastle.math.ec.ECPoint normalize = cleanPoint.multiply(mod).normalize();
        if (normalize.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid agreement value for ECDHC");
        }
        return normalize.getAffineXCoord().toBigInteger();
    }
}
