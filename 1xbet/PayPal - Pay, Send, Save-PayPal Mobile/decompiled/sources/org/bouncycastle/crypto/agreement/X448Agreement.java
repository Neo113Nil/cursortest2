package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public final class X448Agreement implements org.bouncycastle.crypto.RawAgreement {
    private org.bouncycastle.crypto.params.X448PrivateKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.RawAgreement
    public final int getAgreementSize() {
        return 56;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public final void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.X448PrivateKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public final void calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i) {
        this.getHighSpeedVideoSizes.generateSecret((org.bouncycastle.crypto.params.X448PublicKeyParameters) cipherParameters, bArr, i);
    }
}
