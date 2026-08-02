package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
abstract class InsecureNonceChaCha20Poly1305Base {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base chacha20;
    private final com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base macKeyChaCha20;

    abstract com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base newChaCha20Instance(byte[] bArr, int i) throws java.security.InvalidKeyException;

    public InsecureNonceChaCha20Poly1305Base(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.chacha20 = newChaCha20Instance(bArr, 1);
        this.macKeyChaCha20 = newChaCha20Instance(bArr, 0);
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (bArr2.length > 2147483631) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr2.length + 16);
        encrypt(allocate, bArr, bArr2, bArr3);
        return allocate.array();
    }

    public void encrypt(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new java.lang.IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.chacha20.encrypt(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] computeMac = com.google.crypto.tink.aead.internal.Poly1305.computeMac(getMacKey(bArr), macDataRfc8439(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(computeMac);
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return decrypt(java.nio.ByteBuffer.wrap(bArr2), bArr, bArr3);
    }

    public byte[] decrypt(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            com.google.crypto.tink.aead.internal.Poly1305.verifyMac(getMacKey(bArr), macDataRfc8439(bArr2, byteBuffer), bArr3);
            byteBuffer.position(position);
            return this.chacha20.decrypt(bArr, byteBuffer);
        } catch (java.security.GeneralSecurityException e) {
            throw new javax.crypto.AEADBadTagException(e.toString());
        }
    }

    private byte[] getMacKey(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.macKeyChaCha20.chacha20Block(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] macDataRfc8439(byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(i2 + 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }
}
