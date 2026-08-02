package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class XChaCha20Poly1305 implements com.google.crypto.tink.Aead {
    private final com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20Poly1305 cipher;
    private final byte[] outputPrefix;

    private XChaCha20Poly1305(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        this.cipher = new com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20Poly1305(bArr);
        this.outputPrefix = bArr2;
    }

    public XChaCha20Poly1305(byte[] bArr) throws java.security.GeneralSecurityException {
        this(bArr, new byte[0]);
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.XChaCha20Poly1305Key xChaCha20Poly1305Key) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.XChaCha20Poly1305(xChaCha20Poly1305Key.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), xChaCha20Poly1305Key.getOutputPrefix().toByteArray());
    }

    private byte[] rawEncrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr.length + 40);
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(24);
        allocate.put(randBytes);
        this.cipher.encrypt(allocate, randBytes, bArr, bArr2);
        return allocate.array();
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] rawEncrypt = rawEncrypt(bArr, bArr2);
        byte[] bArr3 = this.outputPrefix;
        return bArr3.length == 0 ? rawEncrypt : com.google.crypto.tink.subtle.Bytes.concat(bArr3, rawEncrypt);
    }

    private byte[] rawDecrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length < 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, 24);
        return this.cipher.decrypt(java.nio.ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length == 0) {
            return rawDecrypt(bArr, bArr2);
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return rawDecrypt(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length), bArr2);
    }
}
