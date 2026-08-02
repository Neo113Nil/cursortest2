package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public class InsecureNonceXChaCha20 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base {
    public static final int NONCE_SIZE_IN_BYTES = 24;

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    int nonceSizeInBytes() {
        return 24;
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        return super.decrypt(bArr, byteBuffer);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return super.decrypt(bArr, bArr2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ void encrypt(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        super.encrypt(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return super.encrypt(bArr, bArr2);
    }

    public InsecureNonceXChaCha20(byte[] bArr, int i) throws java.security.InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base
    int[] createInitialState(int[] iArr, int i) {
        if (iArr.length != nonceSizeInBytes() / 4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        com.google.crypto.tink.aead.internal.ChaCha20Util.setSigmaAndKey(iArr2, com.google.crypto.tink.aead.internal.ChaCha20Util.hChaCha20(this.key, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
