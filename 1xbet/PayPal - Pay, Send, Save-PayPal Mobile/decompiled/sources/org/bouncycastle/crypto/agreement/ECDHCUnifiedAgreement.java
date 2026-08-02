package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class ECDHCUnifiedAgreement {
    private org.bouncycastle.crypto.params.ECDHUPrivateParameters getHighSpeedVideoFpsRangesFor;

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.ECDHUPrivateParameters) cipherParameters;
    }

    public int getFieldSize() {
        return (this.getHighSpeedVideoFpsRangesFor.getStaticPrivateKey().getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    public byte[] calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ECDHUPublicParameters eCDHUPublicParameters = (org.bouncycastle.crypto.params.ECDHUPublicParameters) cipherParameters;
        org.bouncycastle.crypto.agreement.ECDHCBasicAgreement eCDHCBasicAgreement = new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement();
        org.bouncycastle.crypto.agreement.ECDHCBasicAgreement eCDHCBasicAgreement2 = new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement();
        eCDHCBasicAgreement.init(this.getHighSpeedVideoFpsRangesFor.getStaticPrivateKey());
        java.math.BigInteger calculateAgreement = eCDHCBasicAgreement.calculateAgreement(eCDHUPublicParameters.getStaticPublicKey());
        eCDHCBasicAgreement2.init(this.getHighSpeedVideoFpsRangesFor.getEphemeralPrivateKey());
        java.math.BigInteger calculateAgreement2 = eCDHCBasicAgreement2.calculateAgreement(eCDHUPublicParameters.getEphemeralPublicKey());
        int fieldSize = getFieldSize();
        byte[] bArr = new byte[fieldSize * 2];
        org.bouncycastle.util.BigIntegers.asUnsignedByteArray(calculateAgreement2, bArr, 0, fieldSize);
        org.bouncycastle.util.BigIntegers.asUnsignedByteArray(calculateAgreement, bArr, fieldSize, fieldSize);
        return bArr;
    }
}
