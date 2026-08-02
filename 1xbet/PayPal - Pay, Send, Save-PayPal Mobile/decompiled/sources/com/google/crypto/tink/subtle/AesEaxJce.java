package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class AesEaxJce implements com.google.crypto.tink.Aead {
    static final int BLOCK_SIZE_IN_BYTES = 16;
    static final int TAG_SIZE_IN_BYTES = 16;
    private final com.google.crypto.tink.prf.Prf cmac;
    private final int ivSizeInBytes;
    private final javax.crypto.spec.SecretKeySpec keySpec;
    private final byte[] outputPrefix;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCtrCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.subtle.AesEaxJce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
            try {
                return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/CTR/NOPADDING");
            } catch (java.security.GeneralSecurityException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    };

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.AesEaxKey aesEaxKey) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (aesEaxKey.getParameters().getTagSizeBytes() != 16) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AesEaxJce only supports 16 byte tag size, not ");
            sb.append(aesEaxKey.getParameters().getTagSizeBytes());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return new com.google.crypto.tink.subtle.AesEaxJce(aesEaxKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), aesEaxKey.getParameters().getIvSizeBytes(), aesEaxKey.getOutputPrefix().toByteArray());
    }

    private static com.google.crypto.tink.prf.Prf createCmac(byte[] bArr) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.PrfAesCmac(bArr);
    }

    private AesEaxJce(byte[] bArr, int i, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new java.lang.IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.ivSizeInBytes = i;
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(bArr.length);
        this.keySpec = new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
        this.cmac = createCmac(bArr);
        this.outputPrefix = bArr2;
    }

    public AesEaxJce(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        this(bArr, i, new byte[0]);
    }

    private byte[] omac(int i, byte[] bArr, int i2, int i3) throws java.security.GeneralSecurityException {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        java.lang.System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.cmac.compute(bArr2, 16);
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        int length2 = bArr3.length;
        int i = this.ivSizeInBytes;
        if (length > ((Integer.MAX_VALUE - length2) - i) - 16) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(this.ivSizeInBytes);
        java.lang.System.arraycopy(randBytes, 0, copyOf, this.outputPrefix.length, this.ivSizeInBytes);
        byte[] omac = omac(0, randBytes, 0, randBytes.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] omac2 = omac(1, bArr2, 0, bArr2.length);
        javax.crypto.Cipher cipher = localCtrCipher.get();
        cipher.init(1, this.keySpec, new javax.crypto.spec.IvParameterSpec(omac));
        cipher.doFinal(bArr, 0, bArr.length, copyOf, this.outputPrefix.length + this.ivSizeInBytes);
        byte[] omac3 = omac(2, copyOf, this.outputPrefix.length + this.ivSizeInBytes, bArr.length);
        int length3 = this.outputPrefix.length;
        int length4 = bArr.length;
        int i2 = this.ivSizeInBytes;
        for (int i3 = 0; i3 < 16; i3++) {
            copyOf[length3 + length4 + i2 + i3] = (byte) ((omac2[i3] ^ omac[i3]) ^ omac3[i3]);
        }
        return copyOf;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        int length2 = ((length - bArr3.length) - this.ivSizeInBytes) - 16;
        if (length2 < 0) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] omac = omac(0, bArr, this.outputPrefix.length, this.ivSizeInBytes);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] omac2 = omac(1, bArr2, 0, bArr2.length);
        byte[] omac3 = omac(2, bArr, this.outputPrefix.length + this.ivSizeInBytes, length2);
        int length3 = bArr.length;
        byte b = 0;
        for (int i = 0; i < 16; i++) {
            b = (byte) (b | (((bArr[(length3 - 16) + i] ^ omac2[i]) ^ omac[i]) ^ omac3[i]));
        }
        if (b != 0) {
            throw new javax.crypto.AEADBadTagException("tag mismatch");
        }
        javax.crypto.Cipher cipher = localCtrCipher.get();
        cipher.init(1, this.keySpec, new javax.crypto.spec.IvParameterSpec(omac));
        return cipher.doFinal(bArr, this.outputPrefix.length + this.ivSizeInBytes, length2);
    }
}
