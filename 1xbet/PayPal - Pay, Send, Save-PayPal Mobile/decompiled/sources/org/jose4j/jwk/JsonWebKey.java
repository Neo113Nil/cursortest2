package org.jose4j.jwk;

/* loaded from: classes18.dex */
public abstract class JsonWebKey implements java.io.Serializable {
    public static final java.lang.String ALGORITHM_PARAMETER = "alg";
    public static final java.lang.String KEY_ID_PARAMETER = "kid";
    public static final java.lang.String KEY_OPERATIONS = "key_ops";
    public static final java.lang.String KEY_TYPE_PARAMETER = "kty";
    public static final java.lang.String USE_PARAMETER = "use";
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    protected java.security.Key key;
    protected java.util.Map<java.lang.String, java.lang.Object> otherParameters;

    public enum OutputControlLevel {
        INCLUDE_PRIVATE,
        INCLUDE_SYMMETRIC,
        PUBLIC_ONLY
    }

    protected abstract void fillTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map, org.jose4j.jwk.JsonWebKey.OutputControlLevel outputControlLevel);

    public abstract java.lang.String getKeyType();

    protected abstract java.lang.String produceThumbprintHashInput();

    protected JsonWebKey(java.security.Key key) {
        this.otherParameters = new java.util.LinkedHashMap();
        this.key = key;
    }

    protected JsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.otherParameters = linkedHashMap;
        linkedHashMap.putAll(map);
        removeFromOtherParams("kty", "use", "kid", "alg", "key_ops");
        setUse(getString(map, "use"));
        setKeyId(getString(map, "kid"));
        setAlgorithm(getString(map, "alg"));
        if (map.containsKey("key_ops")) {
            this.getHighSpeedVideoFpsRanges = org.jose4j.lang.JsonHelp.getStringArray(map, "key_ops");
        }
    }

    public java.security.PublicKey getPublicKey() {
        try {
            return (java.security.PublicKey) this.key;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.security.Key getKey() {
        return this.key;
    }

    public java.lang.String getUse() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setUse(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String getKeyId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setKeyId(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setAlgorithm(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public java.util.List<java.lang.String> getKeyOps() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setKeyOps(java.util.List<java.lang.String> list) {
        this.getHighSpeedVideoFpsRanges = list;
    }

    public void setOtherParameter(java.lang.String str, java.lang.Object obj) {
        this.otherParameters.put(str, obj);
    }

    public <T> T getOtherParameterValue(java.lang.String str, java.lang.Class<T> cls) {
        return cls.cast(this.otherParameters.get(str));
    }

    protected void removeFromOtherParams(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            this.otherParameters.remove(str);
        }
    }

    public java.util.Map<java.lang.String, java.lang.Object> toParams(org.jose4j.jwk.JsonWebKey.OutputControlLevel outputControlLevel) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("kty", getKeyType());
        putIfNotNull("kid", getKeyId(), linkedHashMap);
        putIfNotNull("use", getUse(), linkedHashMap);
        putIfNotNull("key_ops", this.getHighSpeedVideoFpsRanges, linkedHashMap);
        putIfNotNull("alg", getAlgorithm(), linkedHashMap);
        fillTypeSpecificParams(linkedHashMap, outputControlLevel);
        linkedHashMap.putAll(this.otherParameters);
        return linkedHashMap;
    }

    public java.lang.String toJson() {
        return toJson(org.jose4j.jwk.JsonWebKey.OutputControlLevel.INCLUDE_SYMMETRIC);
    }

    public java.lang.String toJson(org.jose4j.jwk.JsonWebKey.OutputControlLevel outputControlLevel) {
        return org.jose4j.json.JsonUtil.toJson(toParams(outputControlLevel));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(toParams(org.jose4j.jwk.JsonWebKey.OutputControlLevel.PUBLIC_ONLY));
        return sb.toString();
    }

    public java.lang.String calculateBase64urlEncodedThumbprint(java.lang.String str) {
        return org.jose4j.base64url.Base64Url.encode(calculateThumbprint(str));
    }

    public byte[] calculateThumbprint(java.lang.String str) {
        return org.jose4j.lang.HashUtil.getMessageDigest(str).digest(org.jose4j.lang.StringUtil.getBytesUtf8(produceThumbprintHashInput()));
    }

    public java.lang.String calculateThumbprintUri(java.lang.String str) {
        if (!str.equals("SHA-256")) {
            throw new java.lang.UnsupportedOperationException("Only SHA-256 algorithm supported at this time for Thumbprint URIs");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("urn:ietf:params:oauth:jwk-thumbprint:sha-256:");
        sb.append(calculateBase64urlEncodedThumbprint(str));
        return sb.toString();
    }

    protected void putIfNotNull(java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (obj != null) {
            map.put(str, obj);
        }
    }

    protected static java.lang.String getString(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        return org.jose4j.lang.JsonHelp.getStringChecked(map, str);
    }

    protected static java.lang.String getStringRequired(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        return getString(map, str, true);
    }

    protected static java.lang.String getString(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, boolean z) throws org.jose4j.lang.JoseException {
        java.lang.String string = getString(map, str);
        if (string != null || !z) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing required '");
        sb.append(str);
        sb.append("' parameter.");
        throw new org.jose4j.lang.JoseException(sb.toString());
    }

    public static class Factory {
        public static org.jose4j.jwk.JsonWebKey newJwk(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
            char c;
            java.lang.String stringRequired = org.jose4j.jwk.JsonWebKey.getStringRequired(map, "kty");
            stringRequired.hashCode();
            int hashCode = stringRequired.hashCode();
            if (hashCode == 2206) {
                if (stringRequired.equals("EC")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 78324) {
                if (stringRequired.equals(org.jose4j.jwk.OctetKeyPairJsonWebKey.KEY_TYPE)) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 81440) {
                if (hashCode == 109856 && stringRequired.equals(org.jose4j.jwk.OctetSequenceJsonWebKey.KEY_TYPE)) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (stringRequired.equals("RSA")) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                return new org.jose4j.jwk.EllipticCurveJsonWebKey(map);
            }
            if (c == 1) {
                return new org.jose4j.jwk.OctetKeyPairJsonWebKey(map);
            }
            if (c == 2) {
                return new org.jose4j.jwk.RsaJsonWebKey(map);
            }
            if (c == 3) {
                return new org.jose4j.jwk.OctetSequenceJsonWebKey(map);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown key type algorithm: '");
            sb.append(stringRequired);
            sb.append("'");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }

        public static org.jose4j.jwk.JsonWebKey newJwk(java.security.Key key) throws org.jose4j.lang.JoseException {
            if (java.security.interfaces.RSAPublicKey.class.isInstance(key)) {
                return new org.jose4j.jwk.RsaJsonWebKey((java.security.interfaces.RSAPublicKey) key);
            }
            if (java.security.interfaces.ECPublicKey.class.isInstance(key)) {
                return new org.jose4j.jwk.EllipticCurveJsonWebKey((java.security.interfaces.ECPublicKey) key);
            }
            if (java.security.PublicKey.class.isInstance(key)) {
                if (org.jose4j.jwk.OctetKeyPairJsonWebKey.getHighSpeedVideoSizes(key)) {
                    return new org.jose4j.jwk.OctetKeyPairJsonWebKey((java.security.PublicKey) key);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported or unknown public key (alg=");
                sb.append(key.getAlgorithm());
                sb.append(") ");
                sb.append(key);
                throw new org.jose4j.lang.JoseException(sb.toString());
            }
            return new org.jose4j.jwk.OctetSequenceJsonWebKey(key);
        }

        public static org.jose4j.jwk.JsonWebKey newJwk(java.lang.String str) throws org.jose4j.lang.JoseException {
            return newJwk(org.jose4j.json.JsonUtil.parseJson(str));
        }
    }
}
