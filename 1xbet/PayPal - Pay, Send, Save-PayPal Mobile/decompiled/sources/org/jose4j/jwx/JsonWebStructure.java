package org.jose4j.jwx;

/* loaded from: classes18.dex */
public abstract class JsonWebStructure {
    private static final org.jose4j.jca.ProviderContext getHighSpeedVideoFpsRangesFor = new org.jose4j.jca.ProviderContext();
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private java.security.Key getHighSpeedVideoSizes;
    protected java.lang.String rawCompactSerialization;
    protected org.jose4j.base64url.Base64Url base64url = new org.jose4j.base64url.Base64Url();
    protected org.jose4j.jwx.Headers headers = new org.jose4j.jwx.Headers();
    protected boolean doKeyValidation = true;
    private org.jose4j.jwa.AlgorithmConstraints Camera2StreamConfigurationMap = org.jose4j.jwa.AlgorithmConstraints.NO_CONSTRAINTS;
    private java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = java.util.Collections.emptySet();
    private org.jose4j.jca.ProviderContext getInputFormats = getHighSpeedVideoFpsRangesFor;

    public abstract org.jose4j.jwa.Algorithm getAlgorithm() throws org.jose4j.lang.InvalidAlgorithmException;

    public abstract org.jose4j.jwa.Algorithm getAlgorithmNoConstraintCheck() throws org.jose4j.lang.InvalidAlgorithmException;

    public abstract java.lang.String getCompactSerialization() throws org.jose4j.lang.JoseException;

    public abstract java.lang.String getPayload() throws org.jose4j.lang.JoseException;

    protected boolean isSupportedCriticalHeader(java.lang.String str) {
        return false;
    }

    protected void onNewKey() {
    }

    protected abstract void setCompactSerializationParts(java.lang.String[] strArr) throws org.jose4j.lang.JoseException;

    public abstract void setPayload(java.lang.String str);

    public static org.jose4j.jwx.JsonWebStructure fromCompactSerialization(java.lang.String str) throws org.jose4j.lang.JoseException {
        org.jose4j.jwx.JsonWebStructure jsonWebSignature;
        java.lang.String[] deserialize = org.jose4j.jwx.CompactSerializer.deserialize(str);
        if (deserialize.length == 5) {
            jsonWebSignature = new org.jose4j.jwe.JsonWebEncryption();
        } else if (deserialize.length == 3) {
            jsonWebSignature = new org.jose4j.jws.JsonWebSignature();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid JOSE Compact Serialization. Expecting either 3 or 5 parts for JWS or JWE respectively but was ");
            sb.append(deserialize.length);
            sb.append(".");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }
        jsonWebSignature.setCompactSerializationParts(deserialize);
        jsonWebSignature.rawCompactSerialization = str;
        return jsonWebSignature;
    }

    public void setCompactSerialization(java.lang.String str) throws org.jose4j.lang.JoseException {
        setCompactSerializationParts(org.jose4j.jwx.CompactSerializer.deserialize(str));
        this.rawCompactSerialization = str;
    }

    public java.lang.String getHeader() {
        return getHeaders().getFullHeaderAsJsonString();
    }

    protected java.lang.String getEncodedHeader() {
        return this.headers.getEncodedHeader();
    }

    public void setHeader(java.lang.String str, java.lang.String str2) {
        this.headers.setStringHeaderValue(str, str2);
    }

    protected void setEncodedHeader(java.lang.String str) throws org.jose4j.lang.JoseException {
        checkNotEmptyPart(str, "Encoded Header");
        this.headers.getHighSpeedVideoFpsRanges(str);
    }

    public org.jose4j.jwx.Headers getHeaders() {
        return this.headers;
    }

    protected void checkNotEmptyPart(java.lang.String str, java.lang.String str2) throws org.jose4j.lang.JoseException {
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
            sb.append(str2);
            sb.append(" cannot be empty.");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }
    }

    public java.lang.String getHeader(java.lang.String str) {
        return this.headers.getStringHeaderValue(str);
    }

    public void setHeader(java.lang.String str, java.lang.Object obj) {
        this.headers.setObjectHeaderValue(str, obj);
    }

    public java.lang.Object getObjectHeader(java.lang.String str) {
        return this.headers.getObjectHeaderValue(str);
    }

    public void setAlgorithmHeaderValue(java.lang.String str) {
        setHeader("alg", str);
    }

    public java.lang.String getAlgorithmHeaderValue() {
        return getHeader("alg");
    }

    public void setContentTypeHeaderValue(java.lang.String str) {
        setHeader("cty", str);
    }

    public java.lang.String getContentTypeHeaderValue() {
        return getHeader("cty");
    }

    public void setKeyIdHeaderValue(java.lang.String str) {
        setHeader("kid", str);
    }

    public java.lang.String getKeyIdHeaderValue() {
        return getHeader("kid");
    }

    public org.jose4j.jwk.PublicJsonWebKey getJwkHeader() throws org.jose4j.lang.JoseException {
        return this.headers.getPublicJwkHeaderValue("jwk", null);
    }

    public void setJwkHeader(org.jose4j.jwk.PublicJsonWebKey publicJsonWebKey) {
        this.headers.setJwkHeaderValue("jwk", publicJsonWebKey);
    }

    public java.security.cert.X509Certificate getLeafCertificateHeaderValue() throws org.jose4j.lang.JoseException {
        java.util.List<java.security.cert.X509Certificate> certificateChainHeaderValue = getCertificateChainHeaderValue();
        if (certificateChainHeaderValue == null || certificateChainHeaderValue.isEmpty()) {
            return null;
        }
        return certificateChainHeaderValue.get(0);
    }

    public java.util.List<java.security.cert.X509Certificate> getCertificateChainHeaderValue() throws org.jose4j.lang.JoseException {
        java.lang.Object objectHeaderValue = this.headers.getObjectHeaderValue("x5c");
        if (!(objectHeaderValue instanceof java.util.List)) {
            return null;
        }
        java.util.List list = (java.util.List) objectHeaderValue;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        org.jose4j.keys.X509Util x509Util = new org.jose4j.keys.X509Util();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x509Util.fromBase64Der((java.lang.String) it.next()));
        }
        return arrayList;
    }

    public void setCertificateChainHeaderValue(java.security.cert.X509Certificate... x509CertificateArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.jose4j.keys.X509Util x509Util = new org.jose4j.keys.X509Util();
        for (java.security.cert.X509Certificate x509Certificate : x509CertificateArr) {
            arrayList.add(x509Util.toBase64(x509Certificate));
        }
        this.headers.setObjectHeaderValue("x5c", arrayList);
    }

    public java.lang.String getX509CertSha1ThumbprintHeaderValue() {
        return getHeader("x5t");
    }

    public void setX509CertSha1ThumbprintHeaderValue(java.lang.String str) {
        setHeader("x5t", str);
    }

    public void setX509CertSha1ThumbprintHeaderValue(java.security.cert.X509Certificate x509Certificate) {
        setX509CertSha1ThumbprintHeaderValue(org.jose4j.keys.X509Util.x5t(x509Certificate));
    }

    public java.lang.String getX509CertSha256ThumbprintHeaderValue() {
        return getHeader("x5t#S256");
    }

    public void setX509CertSha256ThumbprintHeaderValue(java.lang.String str) {
        setHeader("x5t#S256", str);
    }

    public void setX509CertSha256ThumbprintHeaderValue(java.security.cert.X509Certificate x509Certificate) {
        setX509CertSha256ThumbprintHeaderValue(org.jose4j.keys.X509Util.x5tS256(x509Certificate));
    }

    public java.security.Key getKey() {
        return this.getHighSpeedVideoSizes;
    }

    public void setKey(java.security.Key key) {
        java.security.Key key2 = this.getHighSpeedVideoSizes;
        if (key != null ? key2 == null || !key.equals(key2) : key2 != null) {
            onNewKey();
        }
        this.getHighSpeedVideoSizes = key;
    }

    protected byte[] getIntegrity() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected void setIntegrity(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public boolean isDoKeyValidation() {
        return this.doKeyValidation;
    }

    public void setDoKeyValidation(boolean z) {
        this.doKeyValidation = z;
    }

    protected org.jose4j.jwa.AlgorithmConstraints getAlgorithmConstraints() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints algorithmConstraints) {
        this.Camera2StreamConfigurationMap = algorithmConstraints;
    }

    public void setCriticalHeaderNames(java.lang.String... strArr) {
        this.headers.setObjectHeaderValue("crit", strArr);
    }

    public void setKnownCriticalHeaders(java.lang.String... strArr) {
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    protected void checkCrit() throws org.jose4j.lang.JoseException {
        java.util.List<java.lang.String> asList;
        java.lang.Object objectHeaderValue = this.headers.getObjectHeaderValue("crit");
        if (objectHeaderValue != null) {
            if (objectHeaderValue instanceof java.util.List) {
                asList = (java.util.List) objectHeaderValue;
            } else if (objectHeaderValue instanceof java.lang.String[]) {
                asList = java.util.Arrays.asList((java.lang.String[]) objectHeaderValue);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("crit header value not an array (");
                sb.append(objectHeaderValue.getClass());
                sb.append(").");
                throw new org.jose4j.lang.JoseException(sb.toString());
            }
            for (java.lang.String str : asList) {
                if (!this.getHighSpeedVideoFpsRanges.contains(str) && !isSupportedCriticalHeader(str)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unrecognized header '");
                    sb2.append(str);
                    sb2.append("' marked as critical.");
                    throw new org.jose4j.lang.JoseException(sb2.toString());
                }
            }
        }
    }

    protected org.jose4j.jca.ProviderContext getProviderCtx() {
        return this.getInputFormats;
    }

    public void setProviderContext(org.jose4j.jca.ProviderContext providerContext) {
        this.getInputFormats = providerContext;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(getHeaders().getFullHeaderAsJsonString());
        if (this.rawCompactSerialization != null) {
            sb.append("->");
            sb.append(this.rawCompactSerialization);
        }
        return sb.toString();
    }
}
