package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class Pbes2HmacShaWithAesKeyWrapAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.KeyManagementAlgorithm {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {0};
    private org.jose4j.jwe.ContentEncryptionKeyDescriptor Camera2StreamConfigurationMap;
    private org.jose4j.jwe.AesKeyWrapManagementAlgorithm getHighSpeedVideoSizes;
    private org.jose4j.jwe.kdf.PasswordBasedKeyDerivationFunction2 getInputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRangesFor = 65536;
    private int getHighSpeedVideoFpsRanges = 12;
    private long getInputFormats = 2499999;

    public Pbes2HmacShaWithAesKeyWrapAlgorithm(java.lang.String str, java.lang.String str2, org.jose4j.jwe.AesKeyWrapManagementAlgorithm aesKeyWrapManagementAlgorithm) {
        setAlgorithmIdentifier(str);
        setJavaAlgorithm("n/a");
        this.getInputSizeshNQ4ISI = new org.jose4j.jwe.kdf.PasswordBasedKeyDerivationFunction2(str2);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        setKeyType(org.jose4j.keys.PbkdfKey.ALGORITHM);
        this.getHighSpeedVideoSizes = aesKeyWrapManagementAlgorithm;
        this.Camera2StreamConfigurationMap = new org.jose4j.jwe.ContentEncryptionKeyDescriptor(aesKeyWrapManagementAlgorithm.getHighSpeedVideoFpsRangesFor, org.jose4j.keys.AesKey.ALGORITHM);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return this.getHighSpeedVideoSizes.manageForEncrypt(deriveForEncrypt(key, headers, providerContext), contentEncryptionKeyDescriptor, headers, bArr, providerContext);
    }

    protected java.security.Key deriveForEncrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        byte[] base64UrlDecode;
        java.lang.Long longHeaderValue = headers.getLongHeaderValue("p2c");
        if (longHeaderValue == null) {
            longHeaderValue = java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor);
            headers.setObjectHeaderValue("p2c", longHeaderValue);
        }
        if (longHeaderValue.longValue() < 1000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("iteration count (p2c=");
            sb.append(longHeaderValue);
            sb.append(") cannot be less than 1000 (and should probably be considerably more)");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }
        java.lang.String stringHeaderValue = headers.getStringHeaderValue("p2s");
        org.jose4j.base64url.Base64Url base64Url = new org.jose4j.base64url.Base64Url();
        if (stringHeaderValue == null) {
            base64UrlDecode = org.jose4j.lang.ByteUtil.randomBytes(this.getHighSpeedVideoFpsRanges, providerContext.getSecureRandom());
            headers.setStringHeaderValue("p2s", base64Url.base64UrlEncode(base64UrlDecode));
        } else {
            base64UrlDecode = base64Url.base64UrlDecode(stringHeaderValue);
        }
        if (base64UrlDecode.length < 8) {
            throw new org.jose4j.lang.JoseException("A p2s salt input value containing 8 or more octets MUST be used.");
        }
        return getHighSpeedVideoFpsRanges(key, longHeaderValue, base64UrlDecode, providerContext);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForDecrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        java.lang.Long longHeaderValue = headers.getLongHeaderValue("p2c");
        if (longHeaderValue.longValue() > this.getInputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PBES2 iteration count (p2c=");
            sb.append(longHeaderValue);
            sb.append(") cannot be more than ");
            sb.append(this.getInputFormats);
            sb.append(" to avoid excessive resource utilization.");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }
        return new org.jose4j.jwa.CryptoPrimitive(getHighSpeedVideoFpsRanges(key, longHeaderValue, new org.jose4j.base64url.Base64Url().base64UrlDecode(headers.getStringHeaderValue("p2s")), providerContext));
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return this.getHighSpeedVideoSizes.manageForDecrypt(this.getHighSpeedVideoSizes.prepareForDecrypt(cryptoPrimitive.getKey(), headers, providerContext), bArr, contentEncryptionKeyDescriptor, headers, providerContext);
    }

    private java.security.Key getHighSpeedVideoFpsRanges(java.security.Key key, java.lang.Long l, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return new javax.crypto.spec.SecretKeySpec(this.getInputSizeshNQ4ISI.derive(key.getEncoded(), org.jose4j.lang.ByteUtil.concat(org.jose4j.lang.StringUtil.getBytesUtf8(getAlgorithmIdentifier()), getHighResolutionOutputSizeshNQ4ISI, bArr), l.intValue(), this.Camera2StreamConfigurationMap.getContentEncryptionKeyByteLength(), providerContext.getSuppliedKeyProviderContext().getMacProvider()), this.Camera2StreamConfigurationMap.getContentEncryptionKeyAlgorithm());
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        validateKey(key);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        validateKey(key);
    }

    public void validateKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.notNull(key);
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return this.getHighSpeedVideoSizes.isAvailable();
    }

    public long getDefaultIterationCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDefaultIterationCount(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public int getDefaultSaltByteLength() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDefaultSaltByteLength(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public long getMaxIterationCount() {
        return this.getInputFormats;
    }

    public void setMaxIterationCount(long j) {
        this.getInputFormats = j;
    }

    public static class HmacSha256Aes128 extends org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm {
        public HmacSha256Aes128() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS256_A128KW, org.jose4j.mac.MacUtil.HMAC_SHA256, new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes128().getHighSpeedVideoFpsRanges());
        }
    }

    public static class HmacSha384Aes192 extends org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm {
        public HmacSha384Aes192() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS384_A192KW, org.jose4j.mac.MacUtil.HMAC_SHA384, new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes192().getHighSpeedVideoFpsRanges());
        }
    }

    public static class HmacSha512Aes256 extends org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm {
        public HmacSha512Aes256() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS512_A256KW, org.jose4j.mac.MacUtil.HMAC_SHA512, new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes256().getHighSpeedVideoFpsRanges());
        }
    }
}
