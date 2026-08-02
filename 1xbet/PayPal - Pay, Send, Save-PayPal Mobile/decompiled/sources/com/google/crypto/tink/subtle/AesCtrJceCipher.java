package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class AesCtrJceCipher implements com.google.crypto.tink.subtle.IndCpaCipher {
    private static final java.lang.String CIPHER_ALGORITHM = "AES/CTR/NoPadding";
    private static final java.lang.String KEY_ALGORITHM = "AES";
    private static final int MIN_IV_SIZE_IN_BYTES = 12;
    private final int blockSize;
    private final int ivSize;
    private final javax.crypto.spec.SecretKeySpec keySpec;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.subtle.AesCtrJceCipher.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
            try {
                return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance(com.google.crypto.tink.subtle.AesCtrJceCipher.CIPHER_ALGORITHM);
            } catch (java.security.GeneralSecurityException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    };

    public AesCtrJceCipher(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(bArr.length);
        this.keySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        int blockSize = localCipher.get().getBlockSize();
        this.blockSize = blockSize;
        if (i < 12 || i > blockSize) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        }
        this.ivSize = i;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public final byte[] encrypt(byte[] bArr) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i = this.ivSize;
        if (length > Integer.MAX_VALUE - i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("plaintext length can not exceed ");
            sb.append(Integer.MAX_VALUE - this.ivSize);
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(i);
        java.lang.System.arraycopy(randBytes, 0, bArr2, 0, this.ivSize);
        doCtr(bArr, 0, bArr.length, bArr2, this.ivSize, randBytes, true);
        return bArr2;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public final byte[] decrypt(byte[] bArr) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i = this.ivSize;
        if (length < i) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.ivSize;
        byte[] bArr3 = new byte[length2 - i2];
        doCtr(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    private void doCtr(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = localCipher.get();
        byte[] bArr4 = new byte[this.blockSize];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, this.ivSize);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.keySpec, ivParameterSpec);
        } else {
            cipher.init(2, this.keySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
