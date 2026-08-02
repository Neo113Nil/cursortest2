package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public final class AesGcmSiv implements com.google.crypto.tink.Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final com.google.crypto.tink.aead.internal.AesGcmSiv.ThrowingSupplier<javax.crypto.Cipher> cipherSupplier;
    private final javax.crypto.SecretKey keySpec;
    private final byte[] outputPrefix;
    private static final byte[] testPlaintext = com.google.crypto.tink.subtle.Hex.decode("7a806c");
    private static final byte[] testAad = com.google.crypto.tink.subtle.Hex.decode("46bb91c3c5");
    private static final byte[] testKey = com.google.crypto.tink.subtle.Hex.decode("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] testNounce = com.google.crypto.tink.subtle.Hex.decode("bae8e37fc83441b16034566b");
    private static final byte[] testResult = com.google.crypto.tink.subtle.Hex.decode("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public interface ThrowingSupplier<T> {
        T get() throws java.security.GeneralSecurityException;
    }

    public static boolean isAesGcmSivCipher(javax.crypto.Cipher cipher) {
        try {
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(testKey, org.jose4j.keys.AesKey.ALGORITHM), getParams(testNounce));
            cipher.updateAAD(testAad);
            byte[] bArr = testResult;
            return com.google.crypto.tink.subtle.Bytes.equal(cipher.doFinal(bArr, 0, bArr.length), testPlaintext);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.AesGcmSivKey aesGcmSivKey, com.google.crypto.tink.aead.internal.AesGcmSiv.ThrowingSupplier<javax.crypto.Cipher> throwingSupplier) throws java.security.GeneralSecurityException {
        if (!isAesGcmSivCipher(throwingSupplier.get())) {
            throw new java.lang.IllegalStateException("Cipher does not implement AES GCM SIV.");
        }
        return new com.google.crypto.tink.aead.internal.AesGcmSiv(aesGcmSivKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), aesGcmSivKey.getOutputPrefix().toByteArray(), throwingSupplier);
    }

    private AesGcmSiv(byte[] bArr, byte[] bArr2, com.google.crypto.tink.aead.internal.AesGcmSiv.ThrowingSupplier<javax.crypto.Cipher> throwingSupplier) throws java.security.GeneralSecurityException {
        this.outputPrefix = bArr2;
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(bArr.length);
        this.keySpec = new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
        this.cipherSupplier = throwingSupplier;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = this.cipherSupplier.get();
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        if (length > 2147483619 - bArr3.length) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(12);
        java.lang.System.arraycopy(randBytes, 0, copyOf, this.outputPrefix.length, 12);
        cipher.init(1, this.keySpec, getParams(randBytes));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int doFinal = cipher.doFinal(bArr, 0, bArr.length, copyOf, this.outputPrefix.length + 12);
        if (doFinal == bArr.length + 16) {
            return copyOf;
        }
        throw new java.security.GeneralSecurityException(java.lang.String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", 16, java.lang.Integer.valueOf(doFinal - bArr.length)));
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        if (length < bArr3.length + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        javax.crypto.Cipher cipher = this.cipherSupplier.get();
        cipher.init(2, this.keySpec, getParams(bArr, this.outputPrefix.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr4 = this.outputPrefix;
        return cipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] bArr) {
        return getParams(bArr, 0, bArr.length);
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] bArr, int i, int i2) {
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, i, i2);
    }
}
