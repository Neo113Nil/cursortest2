package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public final class InsecureNonceChaCha20Poly1305 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base {
    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public final /* bridge */ /* synthetic */ byte[] decrypt(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return super.decrypt(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public final /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return super.decrypt(bArr, bArr2, bArr3);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public final /* bridge */ /* synthetic */ void encrypt(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        super.encrypt(byteBuffer, bArr, bArr2, bArr3);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public final /* bridge */ /* synthetic */ byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return super.encrypt(bArr, bArr2, bArr3);
    }

    public InsecureNonceChaCha20Poly1305(byte[] bArr) throws java.security.GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base newChaCha20Instance(byte[] bArr, int i) throws java.security.InvalidKeyException {
        return new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20(bArr, i);
    }
}
