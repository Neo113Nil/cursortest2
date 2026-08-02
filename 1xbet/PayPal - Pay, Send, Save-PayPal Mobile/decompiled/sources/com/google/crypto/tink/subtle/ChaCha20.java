package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class ChaCha20 implements com.google.crypto.tink.subtle.IndCpaCipher {
    static final int NONCE_LENGTH_IN_BYTES = 12;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20 cipher;

    ChaCha20(byte[] bArr, int i) throws java.security.InvalidKeyException {
        this.cipher = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20(bArr, i);
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] bArr) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr.length + 12);
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(12);
        allocate.put(randBytes);
        this.cipher.encrypt(allocate, randBytes, bArr);
        return allocate.array();
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length < 12) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.cipher.decrypt(java.util.Arrays.copyOf(bArr, 12), java.nio.ByteBuffer.wrap(bArr, 12, bArr.length - 12));
    }
}
