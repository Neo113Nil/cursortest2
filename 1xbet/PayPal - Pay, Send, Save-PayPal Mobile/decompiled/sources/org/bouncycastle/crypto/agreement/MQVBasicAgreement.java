package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class MQVBasicAgreement implements org.bouncycastle.crypto.BasicAgreement {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    org.bouncycastle.crypto.params.DHMQVPrivateParameters getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public java.math.BigInteger calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.DHMQVPublicParameters dHMQVPublicParameters = (org.bouncycastle.crypto.params.DHMQVPublicParameters) cipherParameters;
        org.bouncycastle.crypto.params.DHPrivateKeyParameters staticPrivateKey = this.getHighResolutionOutputSizeshNQ4ISI.getStaticPrivateKey();
        if (!this.getHighResolutionOutputSizeshNQ4ISI.getStaticPrivateKey().getParameters().equals(dHMQVPublicParameters.getStaticPublicKey().getParameters())) {
            throw new java.lang.IllegalStateException("MQV public key components have wrong domain parameters");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getStaticPrivateKey().getParameters().getQ() == null) {
            throw new java.lang.IllegalStateException("MQV key domain parameters do not have Q set");
        }
        org.bouncycastle.crypto.params.DHParameters parameters = staticPrivateKey.getParameters();
        org.bouncycastle.crypto.params.DHPublicKeyParameters staticPublicKey = dHMQVPublicParameters.getStaticPublicKey();
        org.bouncycastle.crypto.params.DHPrivateKeyParameters ephemeralPrivateKey = this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPrivateKey();
        org.bouncycastle.crypto.params.DHPublicKeyParameters ephemeralPublicKey = this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPublicKey();
        org.bouncycastle.crypto.params.DHPublicKeyParameters ephemeralPublicKey2 = dHMQVPublicParameters.getEphemeralPublicKey();
        java.math.BigInteger q = parameters.getQ();
        java.math.BigInteger pow = java.math.BigInteger.valueOf(2L).pow((q.bitLength() + 1) / 2);
        java.math.BigInteger modPow = ephemeralPublicKey2.getY().multiply(staticPublicKey.getY().modPow(ephemeralPublicKey2.getY().mod(pow).add(pow), parameters.getP())).modPow(ephemeralPrivateKey.getX().add(ephemeralPublicKey.getY().mod(pow).add(pow).multiply(staticPrivateKey.getX())).mod(q), parameters.getP());
        if (modPow.equals(getHighSpeedVideoFpsRangesFor)) {
            throw new java.lang.IllegalStateException("1 is not a valid agreement value for MQV");
        }
        return modPow;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.DHMQVPrivateParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.getStaticPrivateKey().getParameters().getP().bitLength() + 7) / 8;
    }
}
