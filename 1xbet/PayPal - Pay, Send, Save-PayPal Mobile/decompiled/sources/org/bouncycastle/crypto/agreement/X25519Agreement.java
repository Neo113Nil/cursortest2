package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public final class X25519Agreement implements org.bouncycastle.crypto.RawAgreement {
    private org.bouncycastle.crypto.params.X25519PrivateKeyParameters Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.RawAgreement
    public final int getAgreementSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public final void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.X25519PrivateKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public final void calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i) {
        this.Camera2StreamConfigurationMap.generateSecret((org.bouncycastle.crypto.params.X25519PublicKeyParameters) cipherParameters, bArr, i);
    }
}
