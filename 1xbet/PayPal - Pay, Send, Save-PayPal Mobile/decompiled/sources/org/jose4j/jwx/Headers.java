package org.jose4j.jwx;

/* loaded from: classes18.dex */
public class Headers {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoSizes;
    protected org.jose4j.base64url.Base64Url base64url = new org.jose4j.base64url.Base64Url();
    private java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

    public java.lang.String getFullHeaderAsJsonString() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.jose4j.json.JsonUtil.toJson(this.Camera2StreamConfigurationMap);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getEncodedHeader() {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.base64url.base64UrlEncodeUtf8ByteRepresentation(getFullHeaderAsJsonString());
        }
        return this.getHighSpeedVideoSizes;
    }

    public void setStringHeaderValue(java.lang.String str, java.lang.String str2) {
        setObjectHeaderValue(str, str2);
    }

    public void setObjectHeaderValue(java.lang.String str, java.lang.Object obj) {
        this.Camera2StreamConfigurationMap.put(str, obj);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
    }

    public void setJwkHeaderValue(java.lang.String str, org.jose4j.jwk.JsonWebKey jsonWebKey) {
        setObjectHeaderValue(str, jsonWebKey.toParams(org.jose4j.jwk.JsonWebKey.OutputControlLevel.PUBLIC_ONLY));
    }

    public java.lang.String getStringHeaderValue(java.lang.String str) {
        return org.jose4j.lang.JsonHelp.getString(this.Camera2StreamConfigurationMap, str);
    }

    public java.lang.Long getLongHeaderValue(java.lang.String str) {
        return org.jose4j.lang.JsonHelp.getLong(this.Camera2StreamConfigurationMap, str);
    }

    public java.lang.Object getObjectHeaderValue(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    @java.lang.Deprecated
    public org.jose4j.jwk.JsonWebKey getJwkHeaderValue(java.lang.String str) throws org.jose4j.lang.JoseException {
        return getPublicJwkHeaderValue(str, null);
    }

    public org.jose4j.jwk.PublicJsonWebKey getPublicJwkHeaderValue(java.lang.String str, java.lang.String str2) throws org.jose4j.lang.JoseException {
        java.util.Map map = (java.util.Map) getObjectHeaderValue(str);
        if (map == null) {
            return null;
        }
        org.jose4j.jwk.PublicJsonWebKey newPublicJwk = org.jose4j.jwk.PublicJsonWebKey.Factory.newPublicJwk((java.util.Map<java.lang.String, java.lang.Object>) map, str2);
        if (newPublicJwk.getPrivateKey() == null) {
            return newPublicJwk;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" header contains a private key, which it most definitely should not.");
        throw new org.jose4j.lang.JoseException(sb.toString());
    }

    public void setFullHeaderAsJsonString(java.lang.String str) throws org.jose4j.lang.JoseException {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = org.jose4j.json.JsonUtil.parseJson(str);
    }

    final void getHighSpeedVideoFpsRanges(java.lang.String str) throws org.jose4j.lang.JoseException {
        this.getHighSpeedVideoSizes = str;
        java.lang.String base64UrlDecodeToUtf8String = this.base64url.base64UrlDecodeToUtf8String(str);
        this.getHighResolutionOutputSizeshNQ4ISI = base64UrlDecodeToUtf8String;
        this.Camera2StreamConfigurationMap = org.jose4j.json.JsonUtil.parseJson(base64UrlDecodeToUtf8String);
    }
}
