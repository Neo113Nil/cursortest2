package com.google.crypto.tink.aead.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class XChaCha20Poly1305Jce implements com.google.crypto.tink.Aead {
    private static final java.lang.String CIPHER_NAME = "ChaCha20-Poly1305";
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final java.lang.String KEY_NAME = "ChaCha20";
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_SIZE_IN_BYTES = 24;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final byte[] key;
    private final byte[] outputPrefix;

    private XChaCha20Poly1305Jce(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!isSupported()) {
            throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.key = bArr;
        this.outputPrefix = bArr2;
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.XChaCha20Poly1305Key xChaCha20Poly1305Key) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.aead.internal.XChaCha20Poly1305Jce(xChaCha20Poly1305Key.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), xChaCha20Poly1305Key.getOutputPrefix().toByteArray());
    }

    public static boolean isSupported() {
        return com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.getThreadLocalCipherOrNull() != null;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("plaintext is null");
        }
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(24);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(com.google.crypto.tink.aead.internal.ChaCha20Util.hChaCha20(this.key, randBytes), KEY_NAME);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(getChaCha20Nonce(randBytes));
        javax.crypto.Cipher threadLocalCipherOrNull = com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.getThreadLocalCipherOrNull();
        threadLocalCipherOrNull.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocalCipherOrNull.updateAAD(bArr2);
        }
        int outputSize = threadLocalCipherOrNull.getOutputSize(bArr.length);
        byte[] bArr3 = this.outputPrefix;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        java.lang.System.arraycopy(randBytes, 0, copyOf, this.outputPrefix.length, 24);
        if (threadLocalCipherOrNull.doFinal(bArr, 0, bArr.length, copyOf, this.outputPrefix.length + 24) == outputSize) {
            return copyOf;
        }
        throw new java.security.GeneralSecurityException("not enough data written");
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        if (length < bArr3.length + 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        java.lang.System.arraycopy(bArr, this.outputPrefix.length, bArr4, 0, 24);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(com.google.crypto.tink.aead.internal.ChaCha20Util.hChaCha20(this.key, bArr4), KEY_NAME);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(getChaCha20Nonce(bArr4));
        javax.crypto.Cipher threadLocalCipherOrNull = com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.getThreadLocalCipherOrNull();
        threadLocalCipherOrNull.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocalCipherOrNull.updateAAD(bArr2);
        }
        byte[] bArr5 = this.outputPrefix;
        return threadLocalCipherOrNull.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }

    static byte[] getChaCha20Nonce(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        java.lang.System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }
}
