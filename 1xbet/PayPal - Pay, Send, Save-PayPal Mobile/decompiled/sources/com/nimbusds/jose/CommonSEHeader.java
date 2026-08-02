package com.nimbusds.jose;

/* loaded from: classes4.dex */
abstract class CommonSEHeader extends com.nimbusds.jose.Header {
    private static final long serialVersionUID = 1;
    private final java.net.URI jku;
    private final com.nimbusds.jose.jwk.JWK jwk;
    private final java.lang.String kid;
    private final java.util.List<com.nimbusds.jose.util.Base64> x5c;
    private final com.nimbusds.jose.util.Base64URL x5t;
    private final com.nimbusds.jose.util.Base64URL x5t256;
    private final java.net.URI x5u;

    protected CommonSEHeader(com.nimbusds.jose.Algorithm algorithm, com.nimbusds.jose.JOSEObjectType jOSEObjectType, java.lang.String str, java.util.Set<java.lang.String> set, java.net.URI uri, com.nimbusds.jose.jwk.JWK jwk, java.net.URI uri2, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL3) {
        super(algorithm, jOSEObjectType, str, set, map, base64URL3);
        this.jku = uri;
        this.jwk = jwk;
        this.x5u = uri2;
        this.x5t = base64URL;
        this.x5t256 = base64URL2;
        if (list != null) {
            this.x5c = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        } else {
            this.x5c = null;
        }
        this.kid = str2;
    }

    public java.net.URI getJWKURL() {
        return this.jku;
    }

    public com.nimbusds.jose.jwk.JWK getJWK() {
        return this.jwk;
    }

    public java.net.URI getX509CertURL() {
        return this.x5u;
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.util.Base64URL getX509CertThumbprint() {
        return this.x5t;
    }

    public com.nimbusds.jose.util.Base64URL getX509CertSHA256Thumbprint() {
        return this.x5t256;
    }

    public java.util.List<com.nimbusds.jose.util.Base64> getX509CertChain() {
        return this.x5c;
    }

    public java.lang.String getKeyID() {
        return this.kid;
    }

    @Override // com.nimbusds.jose.Header
    public java.util.Set<java.lang.String> getIncludedParams() {
        java.util.Set<java.lang.String> includedParams = super.getIncludedParams();
        if (this.jku != null) {
            includedParams.add("jku");
        }
        if (this.jwk != null) {
            includedParams.add("jwk");
        }
        if (this.x5u != null) {
            includedParams.add("x5u");
        }
        if (this.x5t != null) {
            includedParams.add("x5t");
        }
        if (this.x5t256 != null) {
            includedParams.add("x5t#S256");
        }
        java.util.List<com.nimbusds.jose.util.Base64> list = this.x5c;
        if (list != null && !list.isEmpty()) {
            includedParams.add("x5c");
        }
        if (this.kid != null) {
            includedParams.add("kid");
        }
        return includedParams;
    }

    @Override // com.nimbusds.jose.Header
    public java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        java.net.URI uri = this.jku;
        if (uri != null) {
            jSONObject.put("jku", uri.toString());
        }
        com.nimbusds.jose.jwk.JWK jwk = this.jwk;
        if (jwk != null) {
            jSONObject.put("jwk", jwk.toJSONObject());
        }
        java.net.URI uri2 = this.x5u;
        if (uri2 != null) {
            jSONObject.put("x5u", uri2.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL = this.x5t;
        if (base64URL != null) {
            jSONObject.put("x5t", base64URL.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL2 = this.x5t256;
        if (base64URL2 != null) {
            jSONObject.put("x5t#S256", base64URL2.toString());
        }
        java.util.List<com.nimbusds.jose.util.Base64> list = this.x5c;
        if (list != null && !list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.x5c.size());
            java.util.Iterator<com.nimbusds.jose.util.Base64> it = this.x5c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            jSONObject.put("x5c", arrayList);
        }
        java.lang.String str = this.kid;
        if (str != null) {
            jSONObject.put("kid", str);
        }
        return jSONObject;
    }

    static com.nimbusds.jose.jwk.JWK parsePublicJWK(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map == null) {
            return null;
        }
        com.nimbusds.jose.jwk.JWK parse = com.nimbusds.jose.jwk.JWK.parse(map);
        if (parse.isPrivate()) {
            throw new java.text.ParseException("Non-public key in jwk header parameter", 0);
        }
        return parse;
    }
}
