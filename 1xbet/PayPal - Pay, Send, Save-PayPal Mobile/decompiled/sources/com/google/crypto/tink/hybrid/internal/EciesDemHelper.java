package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class EciesDemHelper {
    private static final byte[] EMPTY_AAD = new byte[0];

    public interface Dem {
        byte[] decrypt(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException;

        byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException;

        int getSymmetricKeySizeInBytes();
    }

    static final class AesGcmDem implements com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem {
        private static final int AES_GCM_IV_SIZE_IN_BYTES = 12;
        private static final int AES_GCM_TAG_SIZE_IN_BYTES = 16;
        private final int keySizeInBytes;

        public AesGcmDem(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters) throws java.security.GeneralSecurityException {
            if (aesGcmParameters.getIvSizeBytes() != 12) {
                throw new java.security.GeneralSecurityException("invalid IV size");
            }
            if (aesGcmParameters.getTagSizeBytes() != 16) {
                throw new java.security.GeneralSecurityException("invalid tag size");
            }
            if (aesGcmParameters.getVariant() != com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX) {
                throw new java.security.GeneralSecurityException("invalid variant");
            }
            this.keySizeInBytes = aesGcmParameters.getKeySizeBytes();
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final int getSymmetricKeySizeInBytes() {
            return this.keySizeInBytes;
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
            if (bArr.length != this.keySizeInBytes) {
                throw new java.security.GeneralSecurityException("invalid key size");
            }
            javax.crypto.SecretKey secretKey = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getSecretKey(bArr);
            byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(12);
            java.security.spec.AlgorithmParameterSpec params = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getParams(randBytes);
            javax.crypto.Cipher threadLocalCipher = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getThreadLocalCipher();
            threadLocalCipher.init(1, secretKey, params);
            int outputSize = threadLocalCipher.getOutputSize(bArr4.length);
            int length = bArr2.length + bArr3.length;
            if (outputSize > 2147483635 - length) {
                throw new java.security.GeneralSecurityException("plaintext too long");
            }
            int i = length + 12;
            byte[] copyOf = java.util.Arrays.copyOf(bArr2, i + outputSize);
            java.lang.System.arraycopy(bArr3, 0, copyOf, bArr2.length, bArr3.length);
            java.lang.System.arraycopy(randBytes, 0, copyOf, length, 12);
            if (threadLocalCipher.doFinal(bArr4, 0, bArr4.length, copyOf, i) == outputSize) {
                return copyOf;
            }
            throw new java.security.GeneralSecurityException("not enough data written");
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final byte[] decrypt(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
            if (bArr2.length < i) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            if (bArr.length != this.keySizeInBytes) {
                throw new java.security.GeneralSecurityException("invalid key size");
            }
            javax.crypto.SecretKey secretKey = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getSecretKey(bArr);
            if (bArr2.length < i + 28) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            java.security.spec.AlgorithmParameterSpec params = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getParams(bArr2, i, 12);
            javax.crypto.Cipher threadLocalCipher = com.google.crypto.tink.aead.internal.AesGcmJceUtil.getThreadLocalCipher();
            threadLocalCipher.init(2, secretKey, params);
            return threadLocalCipher.doFinal(bArr2, i + 12, (bArr2.length - i) - 12);
        }
    }

    static final class AesCtrHmacDem implements com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem {
        private final int keySizeInBytes;
        private final com.google.crypto.tink.aead.AesCtrHmacAeadParameters parameters;

        public AesCtrHmacDem(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters) {
            this.parameters = aesCtrHmacAeadParameters;
            this.keySizeInBytes = aesCtrHmacAeadParameters.getAesKeySizeBytes() + aesCtrHmacAeadParameters.getHmacKeySizeBytes();
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final int getSymmetricKeySizeInBytes() {
            return this.keySizeInBytes;
        }

        private com.google.crypto.tink.Aead getAead(byte[] bArr) throws java.security.GeneralSecurityException {
            return com.google.crypto.tink.subtle.EncryptThenAuthenticate.create(com.google.crypto.tink.aead.AesCtrHmacAeadKey.builder().setParameters(this.parameters).setAesKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(java.util.Arrays.copyOf(bArr, this.parameters.getAesKeySizeBytes()), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setHmacKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(java.util.Arrays.copyOfRange(bArr, this.parameters.getAesKeySizeBytes(), this.parameters.getAesKeySizeBytes() + this.parameters.getHmacKeySizeBytes()), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build());
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
            return com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3, getAead(bArr).encrypt(bArr4, com.google.crypto.tink.hybrid.internal.EciesDemHelper.EMPTY_AAD));
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final byte[] decrypt(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
            if (bArr2.length < i) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            return getAead(bArr).decrypt(java.util.Arrays.copyOfRange(bArr2, i, bArr2.length), com.google.crypto.tink.hybrid.internal.EciesDemHelper.EMPTY_AAD);
        }
    }

    static final class AesSivDem implements com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem {
        private final int keySizeInBytes;
        private final com.google.crypto.tink.daead.AesSivParameters parameters;

        public AesSivDem(com.google.crypto.tink.daead.AesSivParameters aesSivParameters) {
            this.parameters = aesSivParameters;
            this.keySizeInBytes = aesSivParameters.getKeySizeBytes();
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final int getSymmetricKeySizeInBytes() {
            return this.keySizeInBytes;
        }

        private com.google.crypto.tink.DeterministicAead getDaead(byte[] bArr) throws java.security.GeneralSecurityException {
            return com.google.crypto.tink.subtle.AesSiv.create(com.google.crypto.tink.daead.AesSivKey.builder().setParameters(this.parameters).setKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(bArr, com.google.crypto.tink.InsecureSecretKeyAccess.get())).build());
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
            return com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3, getDaead(bArr).encryptDeterministically(bArr4, com.google.crypto.tink.hybrid.internal.EciesDemHelper.EMPTY_AAD));
        }

        @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
        public final byte[] decrypt(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
            if (bArr2.length < i) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            return getDaead(bArr).decryptDeterministically(java.util.Arrays.copyOfRange(bArr2, i, bArr2.length), com.google.crypto.tink.hybrid.internal.EciesDemHelper.EMPTY_AAD);
        }
    }

    public static com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem getDem(com.google.crypto.tink.hybrid.EciesParameters eciesParameters) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Parameters demParameters = eciesParameters.getDemParameters();
        if (demParameters instanceof com.google.crypto.tink.aead.AesGcmParameters) {
            return new com.google.crypto.tink.hybrid.internal.EciesDemHelper.AesGcmDem((com.google.crypto.tink.aead.AesGcmParameters) demParameters);
        }
        if (demParameters instanceof com.google.crypto.tink.aead.AesCtrHmacAeadParameters) {
            return new com.google.crypto.tink.hybrid.internal.EciesDemHelper.AesCtrHmacDem((com.google.crypto.tink.aead.AesCtrHmacAeadParameters) demParameters);
        }
        if (demParameters instanceof com.google.crypto.tink.daead.AesSivParameters) {
            return new com.google.crypto.tink.hybrid.internal.EciesDemHelper.AesSivDem((com.google.crypto.tink.daead.AesSivParameters) demParameters);
        }
        throw new java.security.GeneralSecurityException("Unsupported DEM parameters: ".concat(java.lang.String.valueOf(demParameters)));
    }

    private EciesDemHelper() {
    }
}
