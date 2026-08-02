package org.jose4j.jws;

/* loaded from: classes18.dex */
public class JsonWebSignature extends org.jose4j.jwx.JsonWebStructure {
    public static final short COMPACT_SERIALIZATION_PARTS = 3;
    private java.lang.String Camera2StreamConfigurationMap = "UTF-8";
    private java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.jose4j.jwa.CryptoPrimitive getHighSpeedVideoSizes;

    public JsonWebSignature() {
        if (java.lang.Boolean.getBoolean("org.jose4j.jws.default-allow-none")) {
            return;
        }
        setAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.DISALLOW_NONE);
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public void setPayload(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = org.jose4j.lang.StringUtil.getBytesUnchecked(str, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = null;
    }

    public byte[] getPayloadBytes() throws org.jose4j.lang.JoseException {
        if (!verifySignature()) {
            throw new org.jose4j.lang.IntegrityException("JWS signature is invalid.");
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getUnverifiedPayloadBytes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setPayloadBytes(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public void setCompactSerializationParts(java.lang.String[] strArr) throws org.jose4j.lang.JoseException {
        if (strArr.length != 3) {
            throw new org.jose4j.lang.JoseException("A JWS Compact Serialization must have exactly 3 parts separated by period ('.') characters");
        }
        setEncodedHeader(strArr[0]);
        if (isRfc7797UnencodedPayload()) {
            setPayload(strArr[1]);
        } else {
            setEncodedPayload(strArr[1]);
        }
        setSignature(this.base64url.base64UrlDecode(strArr[2]));
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public java.lang.String getCompactSerialization() throws org.jose4j.lang.JoseException {
        java.lang.String encodedPayload;
        sign();
        if (!isRfc7797UnencodedPayload()) {
            encodedPayload = getEncodedPayload();
        } else {
            encodedPayload = org.jose4j.lang.StringUtil.newString(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            if (encodedPayload.contains(".")) {
                throw new org.jose4j.lang.JoseException("per https://tools.ietf.org/html/rfc7797#section-5.2 when using the JWS Compact Serialization, unencoded non-detached payloads using period ('.') characters would cause parsing errors; such payloads MUST NOT be used with the JWS Compact Serialization.");
            }
        }
        return org.jose4j.jwx.CompactSerializer.serialize(getEncodedHeader(), encodedPayload, getEncodedSignature());
    }

    public java.lang.String getDetachedContentCompactSerialization() throws org.jose4j.lang.JoseException {
        sign();
        return org.jose4j.jwx.CompactSerializer.serialize(getEncodedHeader(), "", getEncodedSignature());
    }

    public org.jose4j.jwa.CryptoPrimitive prepareSigningPrimitive() throws org.jose4j.lang.JoseException {
        org.jose4j.jwa.CryptoPrimitive highSpeedVideoSizes = getHighSpeedVideoSizes();
        this.getHighSpeedVideoSizes = highSpeedVideoSizes;
        return highSpeedVideoSizes;
    }

    private org.jose4j.jwa.CryptoPrimitive getHighSpeedVideoSizes() throws org.jose4j.lang.JoseException {
        org.jose4j.jws.JsonWebSignatureAlgorithm algorithm = getAlgorithm();
        java.security.Key key = getKey();
        if (isDoKeyValidation()) {
            algorithm.validateSigningKey(key);
        }
        return algorithm.prepareForSign(key, getProviderCtx());
    }

    public void sign() throws org.jose4j.lang.JoseException {
        org.jose4j.jwa.CryptoPrimitive cryptoPrimitive = this.getHighSpeedVideoSizes;
        if (cryptoPrimitive == null) {
            cryptoPrimitive = getHighSpeedVideoSizes();
        }
        setSignature(getAlgorithm().sign(cryptoPrimitive, getHighResolutionOutputSizeshNQ4ISI()));
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public void onNewKey() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public boolean verifySignature() throws org.jose4j.lang.JoseException {
        org.jose4j.jws.JsonWebSignatureAlgorithm algorithm = getAlgorithm();
        java.security.Key key = getKey();
        if (isDoKeyValidation()) {
            algorithm.validateVerificationKey(key);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            checkCrit();
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.valueOf(algorithm.verifySignature(getSignature(), key, getHighResolutionOutputSizeshNQ4ISI(), getProviderCtx()));
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.booleanValue();
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public boolean isSupportedCriticalHeader(java.lang.String str) {
        return "b64".equals(str);
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public org.jose4j.jws.JsonWebSignatureAlgorithm getAlgorithm() throws org.jose4j.lang.InvalidAlgorithmException {
        return Camera2StreamConfigurationMap(true);
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public org.jose4j.jws.JsonWebSignatureAlgorithm getAlgorithmNoConstraintCheck() throws org.jose4j.lang.InvalidAlgorithmException {
        return Camera2StreamConfigurationMap(false);
    }

    private org.jose4j.jws.JsonWebSignatureAlgorithm Camera2StreamConfigurationMap(boolean z) throws org.jose4j.lang.InvalidAlgorithmException {
        java.lang.String algorithmHeaderValue = getAlgorithmHeaderValue();
        if (algorithmHeaderValue == null) {
            throw new org.jose4j.lang.InvalidAlgorithmException("Signature algorithm header (alg) not set.");
        }
        if (z) {
            getAlgorithmConstraints().checkConstraint(algorithmHeaderValue);
        }
        return org.jose4j.jwa.AlgorithmFactoryFactory.getInstance().getJwsAlgorithmFactory().getAlgorithm(algorithmHeaderValue);
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI() throws org.jose4j.lang.JoseException {
        if (!isRfc7797UnencodedPayload()) {
            return org.jose4j.lang.StringUtil.getBytesAscii(org.jose4j.jwx.CompactSerializer.serialize(getEncodedHeader(), getEncodedPayload()));
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byteArrayOutputStream.write(org.jose4j.lang.StringUtil.getBytesAscii(getEncodedHeader()));
            byteArrayOutputStream.write(46);
            byteArrayOutputStream.write(this.getHighSpeedVideoFpsRangesFor);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new org.jose4j.lang.JoseException("This should never happen from a ByteArrayOutputStream", e);
        }
    }

    protected boolean isRfc7797UnencodedPayload() {
        java.lang.Object objectHeaderValue = this.headers.getObjectHeaderValue("b64");
        return (objectHeaderValue == null || !(objectHeaderValue instanceof java.lang.Boolean) || ((java.lang.Boolean) objectHeaderValue).booleanValue()) ? false : true;
    }

    @Override // org.jose4j.jwx.JsonWebStructure
    public java.lang.String getPayload() throws org.jose4j.lang.JoseException {
        if (!java.lang.Boolean.getBoolean("org.jose4j.jws.getPayload-skip-verify") && !verifySignature()) {
            throw new org.jose4j.lang.IntegrityException("JWS signature is invalid.");
        }
        return org.jose4j.lang.StringUtil.newString(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }

    public java.lang.String getPayloadCharEncoding() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setPayloadCharEncoding(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String getKeyType() throws org.jose4j.lang.InvalidAlgorithmException {
        return getAlgorithmNoConstraintCheck().getKeyType();
    }

    public org.jose4j.keys.KeyPersuasion getKeyPersuasion() throws org.jose4j.lang.InvalidAlgorithmException {
        return getAlgorithmNoConstraintCheck().getKeyPersuasion();
    }

    public void setEncodedPayload(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = this.base64url.base64UrlDecode(str);
    }

    public java.lang.String getEncodedPayload() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        return str != null ? str : this.base64url.base64UrlEncode(this.getHighSpeedVideoFpsRangesFor);
    }

    public java.lang.String getEncodedSignature() {
        return this.base64url.base64UrlEncode(getSignature());
    }

    protected byte[] getSignature() {
        return getIntegrity();
    }

    protected void setSignature(byte[] bArr) {
        setIntegrity(bArr);
    }

    public java.lang.String getUnverifiedPayload() {
        return org.jose4j.lang.StringUtil.newString(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }
}
