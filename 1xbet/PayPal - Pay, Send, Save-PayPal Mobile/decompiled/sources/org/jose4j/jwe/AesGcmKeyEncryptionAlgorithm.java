package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class AesGcmKeyEncryptionAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.KeyManagementAlgorithm {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.jose4j.jwe.SimpleAeadCipher getHighSpeedVideoFpsRanges;

    public AesGcmKeyEncryptionAlgorithm(java.lang.String str, int i) {
        setAlgorithmIdentifier(str);
        setJavaAlgorithm(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        setKeyType(org.jose4j.jwk.OctetSequenceJsonWebKey.KEY_TYPE);
        this.getHighSpeedVideoFpsRanges = new org.jose4j.jwe.SimpleAeadCipher(getJavaAlgorithm(), 16);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        byte[] base64UrlDecode;
        java.security.SecureRandom secureRandom = providerContext.getSecureRandom();
        if (bArr == null) {
            bArr = org.jose4j.lang.ByteUtil.randomBytes(contentEncryptionKeyDescriptor.getContentEncryptionKeyByteLength(), secureRandom);
        }
        org.jose4j.base64url.Base64Url base64Url = new org.jose4j.base64url.Base64Url();
        java.lang.String stringHeaderValue = headers.getStringHeaderValue("iv");
        if (stringHeaderValue == null) {
            base64UrlDecode = org.jose4j.lang.ByteUtil.randomBytes(12, secureRandom);
            headers.setStringHeaderValue("iv", base64Url.base64UrlEncode(base64UrlDecode));
        } else {
            base64UrlDecode = base64Url.base64UrlDecode(stringHeaderValue);
        }
        java.lang.String cipherProvider = providerContext.getSuppliedKeyProviderContext().getCipherProvider();
        org.jose4j.jwe.SimpleAeadCipher.CipherOutput encrypt = this.getHighSpeedVideoFpsRanges.encrypt(key, base64UrlDecode, bArr, null, cipherProvider);
        byte[] ciphertext = encrypt.getCiphertext();
        headers.setStringHeaderValue("tag", base64Url.base64UrlEncode(encrypt.getTag()));
        return new org.jose4j.jwe.ContentEncryptionKeys(bArr, ciphertext);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForDecrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return new org.jose4j.jwa.CryptoPrimitive(this.getHighSpeedVideoFpsRanges.getInitialisedCipher(key, new org.jose4j.base64url.Base64Url().base64UrlDecode(headers.getStringHeaderValue("iv")), 2, providerContext.getSuppliedKeyProviderContext().getCipherProvider()));
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return new javax.crypto.spec.SecretKeySpec(this.getHighSpeedVideoFpsRanges.decrypt(bArr, new org.jose4j.base64url.Base64Url().base64UrlDecode(headers.getStringHeaderValue("tag")), null, cryptoPrimitive.getCipher()), contentEncryptionKeyDescriptor.getContentEncryptionKeyAlgorithm());
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return this.getHighSpeedVideoFpsRanges.isAvailable(this.log, this.getHighResolutionOutputSizeshNQ4ISI, 12, getAlgorithmIdentifier());
    }

    public static class Aes128Gcm extends org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm {
        public Aes128Gcm() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A128GCMKW, org.jose4j.lang.ByteUtil.byteLength(128));
        }
    }

    public static class Aes192Gcm extends org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm {
        public Aes192Gcm() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A192GCMKW, org.jose4j.lang.ByteUtil.byteLength(192));
        }
    }

    public static class Aes256Gcm extends org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm {
        public Aes256Gcm() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A256GCMKW, org.jose4j.lang.ByteUtil.byteLength(256));
        }
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.validateAesWrappingKey(key, getAlgorithmIdentifier(), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.validateAesWrappingKey(key, getAlgorithmIdentifier(), this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
