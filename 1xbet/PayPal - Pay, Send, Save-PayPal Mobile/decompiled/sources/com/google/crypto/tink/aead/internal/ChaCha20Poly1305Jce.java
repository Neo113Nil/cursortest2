package com.google.crypto.tink.aead.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class ChaCha20Poly1305Jce implements com.google.crypto.tink.Aead {
    private static final java.lang.String CIPHER_NAME = "ChaCha20-Poly1305";
    private static final java.lang.String KEY_NAME = "ChaCha20";
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final javax.crypto.SecretKey keySpec;
    private final byte[] outputPrefix;
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final byte[] testKey = com.google.crypto.tink.subtle.Hex.decode("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] testNonce = com.google.crypto.tink.subtle.Hex.decode("070000004041424344454647");
    private static final byte[] testCiphertextOfEmpty = com.google.crypto.tink.subtle.Hex.decode("a0784d7a4716f3feb4f64e7f4b39bf04");
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @javax.annotation.Nullable
        public javax.crypto.Cipher initialValue() {
            try {
                javax.crypto.Cipher engineFactory = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance(com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.CIPHER_NAME);
                if (com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.isValid(engineFactory)) {
                    return engineFactory;
                }
                return null;
            } catch (java.security.GeneralSecurityException unused) {
                return null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValid(javax.crypto.Cipher cipher) {
        try {
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(testNonce);
            byte[] bArr = testKey;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, KEY_NAME), ivParameterSpec);
            byte[] bArr2 = testCiphertextOfEmpty;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, KEY_NAME), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    private ChaCha20Poly1305Jce(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
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
        this.outputPrefix = bArr2;
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.ChaCha20Poly1305Key chaCha20Poly1305Key) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce(chaCha20Poly1305Key.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), chaCha20Poly1305Key.getOutputPrefix().toByteArray());
    }

    @javax.annotation.Nullable
    static javax.crypto.Cipher getThreadLocalCipherOrNull() {
        return localCipher.get();
    }

    public static boolean isSupported() {
        return localCipher.get() != null;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("plaintext is null");
        }
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(12);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(randBytes);
        javax.crypto.Cipher cipher = localCipher.get();
        cipher.init(1, this.keySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.outputPrefix;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        java.lang.System.arraycopy(randBytes, 0, copyOf, this.outputPrefix.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, this.outputPrefix.length + 12) == outputSize) {
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
        byte[] bArr4 = new byte[12];
        java.lang.System.arraycopy(bArr, this.outputPrefix.length, bArr4, 0, 12);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr4);
        javax.crypto.Cipher cipher = localCipher.get();
        cipher.init(2, this.keySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr5 = this.outputPrefix;
        return cipher.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }
}
