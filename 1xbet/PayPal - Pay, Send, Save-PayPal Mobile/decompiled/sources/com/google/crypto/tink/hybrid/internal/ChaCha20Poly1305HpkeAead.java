package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class ChaCha20Poly1305HpkeAead implements com.google.crypto.tink.hybrid.internal.HpkeAead {
    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final int getKeyLength() {
        return 32;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final int getNonceLength() {
        return 12;
    }

    ChaCha20Poly1305HpkeAead() {
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final byte[] seal(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        if (bArr.length != getKeyLength()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected key length: ");
            sb.append(getKeyLength());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Jce.isSupported()) {
            return com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Jce.create(bArr).encrypt(bArr2, bArr3, i, bArr4);
        }
        byte[] encrypt = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305(bArr).encrypt(bArr2, bArr3, bArr4);
        if (encrypt.length > Integer.MAX_VALUE - i) {
            throw new java.security.InvalidAlgorithmParameterException("Plaintext too long");
        }
        byte[] bArr5 = new byte[encrypt.length + i];
        java.lang.System.arraycopy(encrypt, 0, bArr5, i, encrypt.length);
        return bArr5;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final byte[] open(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        if (bArr.length != getKeyLength()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected key length: ");
            sb.append(getKeyLength());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Jce.isSupported()) {
            return com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Jce.create(bArr).decrypt(bArr2, bArr3, i, bArr4);
        }
        return new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305(bArr).decrypt(bArr2, java.util.Arrays.copyOfRange(bArr3, i, bArr3.length), bArr4);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final byte[] getAeadId() {
        return com.google.crypto.tink.hybrid.internal.HpkeUtil.CHACHA20_POLY1305_AEAD_ID;
    }
}
