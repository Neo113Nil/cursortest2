package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class JsonWebEncryption extends org.jose4j.jwx.JsonWebStructure {
    public static final short COMPACT_SERIALIZATION_PARTS = 5;
    private static final org.jose4j.jwa.AlgorithmConstraints getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwa.AlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType.BLOCK, org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA1_5, org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS256_A128KW, org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS384_A192KW, org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS512_A256KW);
    byte[] Camera2StreamConfigurationMap;
    byte[] getHighSpeedVideoFpsRanges;
    byte[] getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;
    private byte[] getInputFormats;
    private org.jose4j.jwa.CryptoPrimitive getOutputFormats;
    private org.jose4j.base64url.Base64Url getOutputMinFrameDuration = new org.jose4j.base64url.Base64Url();
    private java.lang.String getInputSizeshNQ4ISI = "UTF-8";
    private org.jose4j.jwa.AlgorithmConstraints getHighSpeedVideoSizesFor = org.jose4j.jwa.AlgorithmConstraints.NO_CONSTRAINTS;

    public JsonWebEncryption() {
        setAlgorithmConstraints(getHighResolutionOutputSizeshNQ4ISI);
    }

    public void setPlainTextCharEncoding(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public void setPlaintext(byte[] bArr) {
        this.getInputFormats = bArr;
    }

    public void setPlaintext(java.lang.String str) {
        this.getInputFormats = org.jose4j.lang.StringUtil.getBytesUnchecked(str, this.getInputSizeshNQ4ISI);
    }

    public java.lang.String getPlaintextString() throws org.jose4j.lang.JoseException {
        return org.jose4j.lang.StringUtil.newString(getPlaintextBytes(), this.getInputSizeshNQ4ISI);
    }

    public byte[] getPlaintextBytes() throws org.jose4j.lang.JoseException {
        if (this.getInputFormats == null) {
            org.jose4j.jwe.KeyManagementAlgorithm keyManagementModeAlgorithm = getKeyManagementModeAlgorithm();
            org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm = getContentEncryptionAlgorithm();
            org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor = contentEncryptionAlgorithm.getContentEncryptionKeyDescriptor();
            checkCrit();
            org.jose4j.jwa.CryptoPrimitive cryptoPrimitive = this.getOutputFormats;
            if (cryptoPrimitive == null) {
                cryptoPrimitive = getHighSpeedVideoSizes();
            }
            java.security.Key manageForDecrypt = keyManagementModeAlgorithm.manageForDecrypt(cryptoPrimitive, getEncryptedKey(), contentEncryptionKeyDescriptor, getHeaders(), getProviderCtx());
            org.jose4j.jwe.ContentEncryptionParts contentEncryptionParts = new org.jose4j.jwe.ContentEncryptionParts(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, getIntegrity());
            byte[] bytesAscii = org.jose4j.lang.StringUtil.getBytesAscii(getEncodedHeader());
            byte[] encoded = manageForDecrypt.getEncoded();
            getHighResolutionOutputSizeshNQ4ISI(contentEncryptionAlgorithm, contentEncryptionKeyDescriptor, encoded);
            byte[] decrypt = contentEncryptionAlgorithm.decrypt(contentEncryptionParts, bytesAscii, encoded, getHeaders(), getProviderCtx());
            java.lang.String stringHeaderValue = getHeaders().getStringHeaderValue("zip");
            if (stringHeaderValue != null) {
                decrypt = org.jose4j.jwa.AlgorithmFactoryFactory.getInstance().getCompressionAlgorithmFactory().getAlgorithm(stringHeaderValue).decompress(decrypt);
            }
            setPlaintext(decrypt);
        }
        return this.getInputFormats;
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public java.lang.String getPayload() throws org.jose4j.lang.JoseException {
        return getPlaintextString();
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public void setPayload(java.lang.String str) {
        setPlaintext(str);
    }

    public void setEncryptionMethodHeaderParameter(java.lang.String str) {
        setHeader("enc", str);
    }

    public java.lang.String getEncryptionMethodHeaderParameter() {
        return getHeader("enc");
    }

    public void setCompressionAlgorithmHeaderParameter(java.lang.String str) {
        setHeader("zip", str);
    }

    public java.lang.String getCompressionAlgorithmHeaderParameter() {
        return getHeader("zip");
    }

    public void enableDefaultCompression() {
        setCompressionAlgorithmHeaderParameter(org.jose4j.zip.CompressionAlgorithmIdentifiers.DEFLATE);
    }

    public void setContentEncryptionAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints algorithmConstraints) {
        this.getHighSpeedVideoSizesFor = algorithmConstraints;
    }

    public org.jose4j.jwe.ContentEncryptionAlgorithm getContentEncryptionAlgorithm() throws org.jose4j.lang.InvalidAlgorithmException {
        java.lang.String encryptionMethodHeaderParameter = getEncryptionMethodHeaderParameter();
        if (encryptionMethodHeaderParameter == null) {
            throw new org.jose4j.lang.InvalidAlgorithmException("Content encryption header (enc) not set.");
        }
        this.getHighSpeedVideoSizesFor.checkConstraint(encryptionMethodHeaderParameter);
        return org.jose4j.jwa.AlgorithmFactoryFactory.getInstance().getJweContentEncryptionAlgorithmFactory().getAlgorithm(encryptionMethodHeaderParameter);
    }

    public org.jose4j.jwe.KeyManagementAlgorithm getKeyManagementModeAlgorithm() throws org.jose4j.lang.InvalidAlgorithmException {
        return getHighSpeedVideoFpsRanges(true);
    }

    private org.jose4j.jwe.KeyManagementAlgorithm getHighSpeedVideoFpsRanges(boolean z) throws org.jose4j.lang.InvalidAlgorithmException {
        java.lang.String algorithmHeaderValue = getAlgorithmHeaderValue();
        if (algorithmHeaderValue == null) {
            throw new org.jose4j.lang.InvalidAlgorithmException("Encryption key management algorithm header (alg) not set.");
        }
        if (z) {
            getAlgorithmConstraints().checkConstraint(algorithmHeaderValue);
        }
        return org.jose4j.jwa.AlgorithmFactoryFactory.getInstance().getJweKeyManagementAlgorithmFactory().getAlgorithm(algorithmHeaderValue);
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public org.jose4j.jwe.KeyManagementAlgorithm getAlgorithmNoConstraintCheck() throws org.jose4j.lang.InvalidAlgorithmException {
        return getHighSpeedVideoFpsRanges(false);
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public org.jose4j.jwe.KeyManagementAlgorithm getAlgorithm() throws org.jose4j.lang.InvalidAlgorithmException {
        return getKeyManagementModeAlgorithm();
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public void setCompactSerializationParts(java.lang.String[] strArr) throws org.jose4j.lang.JoseException {
        if (strArr.length != 5) {
            throw new org.jose4j.lang.JoseException("A JWE Compact Serialization must have exactly 5 parts separated by period ('.') characters");
        }
        setEncodedHeader(strArr[0]);
        this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration.base64UrlDecode(strArr[1]);
        setEncodedIv(strArr[2]);
        java.lang.String str = strArr[3];
        checkNotEmptyPart(str, "Encoded JWE Ciphertext");
        this.getHighSpeedVideoSizes = this.getOutputMinFrameDuration.base64UrlDecode(str);
        java.lang.String str2 = strArr[4];
        checkNotEmptyPart(str2, "Encoded JWE Authentication Tag");
        setIntegrity(this.getOutputMinFrameDuration.base64UrlDecode(str2));
    }

    public org.jose4j.jwa.CryptoPrimitive prepareDecryptingPrimitive() throws org.jose4j.lang.JoseException {
        org.jose4j.jwa.CryptoPrimitive highSpeedVideoSizes = getHighSpeedVideoSizes();
        this.getOutputFormats = highSpeedVideoSizes;
        return highSpeedVideoSizes;
    }

    private org.jose4j.jwa.CryptoPrimitive getHighSpeedVideoSizes() throws org.jose4j.lang.JoseException {
        org.jose4j.jwe.KeyManagementAlgorithm keyManagementModeAlgorithm = getKeyManagementModeAlgorithm();
        java.security.Key key = getKey();
        if (isDoKeyValidation()) {
            keyManagementModeAlgorithm.validateDecryptionKey(key, getContentEncryptionAlgorithm());
        }
        return keyManagementModeAlgorithm.prepareForDecrypt(key, this.headers, getProviderCtx());
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, byte[] bArr) throws org.jose4j.lang.InvalidKeyException {
        int contentEncryptionKeyByteLength = contentEncryptionKeyDescriptor.getContentEncryptionKeyByteLength();
        if (bArr.length == contentEncryptionKeyByteLength) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(org.jose4j.lang.ByteUtil.bitLength(bArr));
        sb.append(" bit content encryption key is not the correct size for the ");
        sb.append(contentEncryptionAlgorithm.getAlgorithmIdentifier());
        sb.append(" content encryption algorithm (");
        sb.append(org.jose4j.lang.ByteUtil.bitLength(contentEncryptionKeyByteLength));
        sb.append(").");
        throw new org.jose4j.lang.InvalidKeyException(sb.toString());
    }

    public byte[] getEncryptedKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public java.lang.String getCompactSerialization() throws org.jose4j.lang.JoseException {
        org.jose4j.jwe.KeyManagementAlgorithm keyManagementModeAlgorithm = getKeyManagementModeAlgorithm();
        org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm = getContentEncryptionAlgorithm();
        org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor = contentEncryptionAlgorithm.getContentEncryptionKeyDescriptor();
        java.security.Key key = getKey();
        if (isDoKeyValidation()) {
            keyManagementModeAlgorithm.validateEncryptionKey(getKey(), contentEncryptionAlgorithm);
        }
        org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt = keyManagementModeAlgorithm.manageForEncrypt(key, contentEncryptionKeyDescriptor, getHeaders(), this.Camera2StreamConfigurationMap, getProviderCtx());
        setContentEncryptionKey(manageForEncrypt.getContentEncryptionKey());
        this.getHighSpeedVideoFpsRanges = manageForEncrypt.getEncryptedKey();
        byte[] bytesAscii = org.jose4j.lang.StringUtil.getBytesAscii(getEncodedHeader());
        byte[] contentEncryptionKey = manageForEncrypt.getContentEncryptionKey();
        byte[] bArr = this.getInputFormats;
        if (bArr == null) {
            throw new java.lang.NullPointerException("The plaintext payload for the JWE has not been set.");
        }
        java.lang.String stringHeaderValue = getHeaders().getStringHeaderValue("zip");
        if (stringHeaderValue != null) {
            bArr = org.jose4j.jwa.AlgorithmFactoryFactory.getInstance().getCompressionAlgorithmFactory().getAlgorithm(stringHeaderValue).compress(bArr);
        }
        getHighResolutionOutputSizeshNQ4ISI(contentEncryptionAlgorithm, contentEncryptionKeyDescriptor, contentEncryptionKey);
        org.jose4j.jwe.ContentEncryptionParts encrypt = contentEncryptionAlgorithm.encrypt(bArr, bytesAscii, contentEncryptionKey, getHeaders(), getIv(), getProviderCtx());
        setIv(encrypt.getIv());
        this.getHighSpeedVideoSizes = encrypt.getCiphertext();
        java.lang.String base64UrlEncode = this.getOutputMinFrameDuration.base64UrlEncode(encrypt.getIv());
        java.lang.String base64UrlEncode2 = this.getOutputMinFrameDuration.base64UrlEncode(encrypt.getCiphertext());
        java.lang.String base64UrlEncode3 = this.getOutputMinFrameDuration.base64UrlEncode(encrypt.getAuthenticationTag());
        return org.jose4j.jwx.CompactSerializer.serialize(getEncodedHeader(), this.getOutputMinFrameDuration.base64UrlEncode(manageForEncrypt.getEncryptedKey()), base64UrlEncode, base64UrlEncode2, base64UrlEncode3);
    }

    public byte[] getContentEncryptionKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setContentEncryptionKey(byte[] bArr) {
        this.Camera2StreamConfigurationMap = bArr;
    }

    public void setEncodedContentEncryptionKey(java.lang.String str) {
        setContentEncryptionKey(org.jose4j.base64url.Base64Url.decode(str));
    }

    public byte[] getIv() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setIv(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    public void setEncodedIv(java.lang.String str) {
        setIv(this.getOutputMinFrameDuration.base64UrlDecode(str));
    }
}
