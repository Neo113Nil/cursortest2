package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class DHUnifiedAgreement {
    private org.bouncycastle.crypto.params.DHUPrivateParameters getHighSpeedVideoSizes;

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.DHUPrivateParameters) cipherParameters;
    }

    public int getFieldSize() {
        return (this.getHighSpeedVideoSizes.getStaticPrivateKey().getParameters().getP().bitLength() + 7) / 8;
    }

    public byte[] calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.DHUPublicParameters dHUPublicParameters = (org.bouncycastle.crypto.params.DHUPublicParameters) cipherParameters;
        org.bouncycastle.crypto.agreement.DHBasicAgreement dHBasicAgreement = new org.bouncycastle.crypto.agreement.DHBasicAgreement();
        org.bouncycastle.crypto.agreement.DHBasicAgreement dHBasicAgreement2 = new org.bouncycastle.crypto.agreement.DHBasicAgreement();
        dHBasicAgreement.init(this.getHighSpeedVideoSizes.getStaticPrivateKey());
        java.math.BigInteger calculateAgreement = dHBasicAgreement.calculateAgreement(dHUPublicParameters.getStaticPublicKey());
        dHBasicAgreement2.init(this.getHighSpeedVideoSizes.getEphemeralPrivateKey());
        java.math.BigInteger calculateAgreement2 = dHBasicAgreement2.calculateAgreement(dHUPublicParameters.getEphemeralPublicKey());
        int fieldSize = getFieldSize();
        byte[] bArr = new byte[fieldSize * 2];
        org.bouncycastle.util.BigIntegers.asUnsignedByteArray(calculateAgreement2, bArr, 0, fieldSize);
        org.bouncycastle.util.BigIntegers.asUnsignedByteArray(calculateAgreement, bArr, fieldSize, fieldSize);
        return bArr;
    }
}
