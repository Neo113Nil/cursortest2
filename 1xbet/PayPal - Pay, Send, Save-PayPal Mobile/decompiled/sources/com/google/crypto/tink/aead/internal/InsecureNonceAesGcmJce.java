package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public final class InsecureNonceAesGcmJce {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final int IV_SIZE_IN_BYTES = 12;
    public static final int TAG_SIZE_IN_BYTES = 16;
    private final javax.crypto.SecretKey keySpec;

    public InsecureNonceAesGcmJce(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.keySpec = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getSecretKey(bArr);
    }

    public final byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return encrypt(bArr, bArr2, 0, bArr3);
    }

    public final byte[] encrypt(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (bArr.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        }
        java.security.spec.AlgorithmParameterSpec params = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getParams(bArr);
        javax.crypto.Cipher threadLocalCipher = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(1, this.keySpec, params);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocalCipher.updateAAD(bArr3);
        }
        int outputSize = threadLocalCipher.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i + outputSize];
        if (threadLocalCipher.doFinal(bArr2, 0, bArr2.length, bArr4, i) == outputSize) {
            return bArr4;
        }
        throw new java.security.GeneralSecurityException("not enough data written");
    }

    public final byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return decrypt(bArr, bArr2, 0, bArr3);
    }

    public final byte[] decrypt(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (bArr.length != 12) {
            throw new java.security.GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i + 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec params = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getParams(bArr);
        javax.crypto.Cipher threadLocalCipher = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(2, this.keySpec, params);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocalCipher.updateAAD(bArr3);
        }
        return threadLocalCipher.doFinal(bArr2, i, bArr2.length - i);
    }
}
