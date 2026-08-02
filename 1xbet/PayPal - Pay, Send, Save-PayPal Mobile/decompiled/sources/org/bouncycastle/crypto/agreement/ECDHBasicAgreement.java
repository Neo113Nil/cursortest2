package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class ECDHBasicAgreement implements org.bouncycastle.crypto.BasicAgreement {
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.Camera2StreamConfigurationMap.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.Camera2StreamConfigurationMap.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new java.lang.IllegalStateException("ECDH public key has wrong domain parameters");
        }
        java.math.BigInteger d = this.Camera2StreamConfigurationMap.getD();
        org.bouncycastle.math.ec.ECPoint cleanPoint = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (cleanPoint.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        java.math.BigInteger h = parameters.getH();
        if (!h.equals(org.bouncycastle.math.ec.ECConstants.ONE)) {
            d = parameters.getHInv().multiply(d).mod(parameters.getN());
            cleanPoint = org.bouncycastle.math.ec.ECAlgorithms.referenceMultiply(cleanPoint, h);
        }
        org.bouncycastle.math.ec.ECPoint normalize = cleanPoint.multiply(d).normalize();
        if (normalize.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid agreement value for ECDH");
        }
        return normalize.getAffineXCoord().toBigInteger();
    }
}
