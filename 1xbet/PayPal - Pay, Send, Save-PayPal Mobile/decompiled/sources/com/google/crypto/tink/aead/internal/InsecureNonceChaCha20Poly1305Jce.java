package com.google.crypto.tink.aead.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class InsecureNonceChaCha20Poly1305Jce {
    private static final java.lang.String CIPHER_NAME = "ChaCha20-Poly1305";
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final java.lang.String KEY_NAME = "ChaCha20";
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final javax.crypto.SecretKey keySpec;

    private InsecureNonceChaCha20Poly1305Jce(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!isSupported()) {
            throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.keySpec = new javax.crypto.spec.SecretKeySpec(bArr, KEY_NAME);
    }

    public static com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Jce create(byte[] bArr) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Jce(bArr);
    }

    public static boolean isSupported() {
        return com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.getThreadLocalCipherOrNull() != null;
    }

    public final byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return encrypt(bArr, bArr2, 0, bArr3);
    }

    public final byte[] encrypt(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("plaintext is null");
        }
        if (bArr.length != 12) {
            throw new java.security.GeneralSecurityException("nonce length must be 12 bytes.");
        }
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
        javax.crypto.Cipher threadLocalCipherOrNull = com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.getThreadLocalCipherOrNull();
        threadLocalCipherOrNull.init(1, this.keySpec, ivParameterSpec);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocalCipherOrNull.updateAAD(bArr3);
        }
        int outputSize = threadLocalCipherOrNull.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i + outputSize];
        if (threadLocalCipherOrNull.doFinal(bArr2, 0, bArr2.length, bArr4, i) == outputSize) {
            return bArr4;
        }
        throw new java.security.GeneralSecurityException("not enough data written");
    }

    public final byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return decrypt(bArr, bArr2, 0, bArr3);
    }

    public final byte[] decrypt(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        if (bArr.length != 12) {
            throw new java.security.GeneralSecurityException("nonce length must be 12 bytes.");
        }
        if (bArr2.length < i + 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
        javax.crypto.Cipher threadLocalCipherOrNull = com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.getThreadLocalCipherOrNull();
        threadLocalCipherOrNull.init(2, this.keySpec, ivParameterSpec);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocalCipherOrNull.updateAAD(bArr3);
        }
        return threadLocalCipherOrNull.doFinal(bArr2, i, bArr2.length - i);
    }
}
