package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class XChaCha20 implements com.google.crypto.tink.subtle.IndCpaCipher {
    static final int NONCE_LENGTH_IN_BYTES = 24;
    private final com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20 cipher;

    XChaCha20(byte[] bArr, int i) throws java.security.InvalidKeyException {
        this.cipher = new com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20(bArr, i);
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] bArr) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr.length + 24);
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(24);
        allocate.put(randBytes);
        this.cipher.encrypt(allocate, randBytes, bArr);
        return allocate.array();
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length < 24) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.cipher.decrypt(java.util.Arrays.copyOf(bArr, 24), java.nio.ByteBuffer.wrap(bArr, 24, bArr.length - 24));
    }
}
