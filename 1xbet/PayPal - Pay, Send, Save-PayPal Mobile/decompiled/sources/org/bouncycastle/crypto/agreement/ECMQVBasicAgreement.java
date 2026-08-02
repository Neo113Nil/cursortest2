package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class ECMQVBasicAgreement implements org.bouncycastle.crypto.BasicAgreement {
    org.bouncycastle.crypto.params.MQVPrivateParameters getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.ec.disable_mqv")) {
            throw new java.lang.IllegalStateException("ECMQV explicitly disabled");
        }
        org.bouncycastle.crypto.params.MQVPublicParameters mQVPublicParameters = (org.bouncycastle.crypto.params.MQVPublicParameters) cipherParameters;
        org.bouncycastle.crypto.params.ECPrivateKeyParameters staticPrivateKey = this.getHighResolutionOutputSizeshNQ4ISI.getStaticPrivateKey();
        org.bouncycastle.crypto.params.ECDomainParameters parameters = staticPrivateKey.getParameters();
        if (!parameters.equals(mQVPublicParameters.getStaticPublicKey().getParameters())) {
            throw new java.lang.IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        org.bouncycastle.crypto.params.ECPrivateKeyParameters ephemeralPrivateKey = this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPrivateKey();
        org.bouncycastle.crypto.params.ECPublicKeyParameters ephemeralPublicKey = this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPublicKey();
        org.bouncycastle.crypto.params.ECPublicKeyParameters staticPublicKey = mQVPublicParameters.getStaticPublicKey();
        org.bouncycastle.crypto.params.ECPublicKeyParameters ephemeralPublicKey2 = mQVPublicParameters.getEphemeralPublicKey();
        java.math.BigInteger n = parameters.getN();
        int bitLength = (n.bitLength() + 1) / 2;
        java.math.BigInteger shiftLeft = org.bouncycastle.math.ec.ECConstants.ONE.shiftLeft(bitLength);
        org.bouncycastle.math.ec.ECCurve curve = parameters.getCurve();
        org.bouncycastle.math.ec.ECPoint cleanPoint = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(curve, ephemeralPublicKey.getQ());
        org.bouncycastle.math.ec.ECPoint cleanPoint2 = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(curve, staticPublicKey.getQ());
        org.bouncycastle.math.ec.ECPoint cleanPoint3 = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(curve, ephemeralPublicKey2.getQ());
        java.math.BigInteger mod = staticPrivateKey.getD().multiply(cleanPoint.getAffineXCoord().toBigInteger().mod(shiftLeft).setBit(bitLength)).add(ephemeralPrivateKey.getD()).mod(n);
        java.math.BigInteger bit = cleanPoint3.getAffineXCoord().toBigInteger().mod(shiftLeft).setBit(bitLength);
        java.math.BigInteger mod2 = parameters.getH().multiply(mod).mod(n);
        org.bouncycastle.math.ec.ECPoint normalize = org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(cleanPoint2, bit.multiply(mod2).mod(n), cleanPoint3, mod2).normalize();
        if (normalize.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid agreement value for MQV");
        }
        return normalize.getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.MQVPrivateParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.getStaticPrivateKey().getParameters().getCurve().getFieldSize() + 7) / 8;
    }
}
