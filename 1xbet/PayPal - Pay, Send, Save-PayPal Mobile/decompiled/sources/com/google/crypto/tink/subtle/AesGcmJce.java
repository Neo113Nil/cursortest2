package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class AesGcmJce implements com.google.crypto.tink.Aead {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final javax.crypto.SecretKey keySpec;
    private final byte[] outputPrefix;

    private AesGcmJce(byte[] bArr, com.google.crypto.tink.util.Bytes bytes) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.keySpec = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getSecretKey(bArr);
        this.outputPrefix = bytes.toByteArray();
    }

    public AesGcmJce(byte[] bArr) throws java.security.GeneralSecurityException {
        this(bArr, com.google.crypto.tink.util.Bytes.copyFrom(new byte[0]));
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.AesGcmKey aesGcmKey) throws java.security.GeneralSecurityException {
        if (aesGcmKey.getParameters().getIvSizeBytes() != 12) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected IV Size 12, got ");
            sb.append(aesGcmKey.getParameters().getIvSizeBytes());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (aesGcmKey.getParameters().getTagSizeBytes() != 16) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected tag Size 16, got ");
            sb2.append(aesGcmKey.getParameters().getTagSizeBytes());
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return new com.google.crypto.tink.subtle.AesGcmJce(aesGcmKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), aesGcmKey.getOutputPrefix());
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("plaintext is null");
        }
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(12);
        java.security.spec.AlgorithmParameterSpec params = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getParams(randBytes);
        javax.crypto.Cipher threadLocalCipher = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(1, this.keySpec, params);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocalCipher.updateAAD(bArr2);
        }
        int outputSize = threadLocalCipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.outputPrefix;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        java.lang.System.arraycopy(randBytes, 0, copyOf, this.outputPrefix.length, 12);
        if (threadLocalCipher.doFinal(bArr, 0, bArr.length, copyOf, this.outputPrefix.length + 12) == outputSize) {
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
        if (length < bArr3.length + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        java.security.spec.AlgorithmParameterSpec params = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getParams(bArr, this.outputPrefix.length, 12);
        javax.crypto.Cipher threadLocalCipher = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(2, this.keySpec, params);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocalCipher.updateAAD(bArr2);
        }
        byte[] bArr4 = this.outputPrefix;
        return threadLocalCipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
