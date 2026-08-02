package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class JWSHeader extends com.nimbusds.jose.CommonSEHeader {
    private static final java.util.Set<java.lang.String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final boolean b64;

    @Override // com.nimbusds.jose.CommonSEHeader
    public final /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.JWK getJWK() {
        return super.getJWK();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final /* bridge */ /* synthetic */ java.net.URI getJWKURL() {
        return super.getJWKURL();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final /* bridge */ /* synthetic */ java.lang.String getKeyID() {
        return super.getKeyID();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final /* bridge */ /* synthetic */ java.util.List getX509CertChain() {
        return super.getX509CertChain();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final /* bridge */ /* synthetic */ com.nimbusds.jose.util.Base64URL getX509CertSHA256Thumbprint() {
        return super.getX509CertSHA256Thumbprint();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ com.nimbusds.jose.util.Base64URL getX509CertThumbprint() {
        return super.getX509CertThumbprint();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final /* bridge */ /* synthetic */ java.net.URI getX509CertURL() {
        return super.getX509CertURL();
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        REGISTERED_PARAMETER_NAMES = java.util.Collections.unmodifiableSet(hashSet);
    }

    public static class Builder {
        private final com.nimbusds.jose.JWSAlgorithm alg;
        private boolean b64;
        private java.util.Set<java.lang.String> crit;
        private java.lang.String cty;
        private java.util.Map<java.lang.String, java.lang.Object> customParams;
        private java.net.URI jku;
        private com.nimbusds.jose.jwk.JWK jwk;
        private java.lang.String kid;
        private com.nimbusds.jose.util.Base64URL parsedBase64URL;
        private com.nimbusds.jose.JOSEObjectType typ;
        private java.util.List<com.nimbusds.jose.util.Base64> x5c;

        @java.lang.Deprecated
        private com.nimbusds.jose.util.Base64URL x5t;
        private com.nimbusds.jose.util.Base64URL x5t256;
        private java.net.URI x5u;

        public Builder(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) {
            this.b64 = true;
            if (jWSAlgorithm.getName().equals(com.nimbusds.jose.Algorithm.NONE.getName())) {
                throw new java.lang.IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
            }
            this.alg = jWSAlgorithm;
        }

        public Builder(com.nimbusds.jose.JWSHeader jWSHeader) {
            this(jWSHeader.getAlgorithm());
            this.typ = jWSHeader.getType();
            this.cty = jWSHeader.getContentType();
            this.crit = jWSHeader.getCriticalParams();
            this.jku = jWSHeader.getJWKURL();
            this.jwk = jWSHeader.getJWK();
            this.x5u = jWSHeader.getX509CertURL();
            this.x5t = jWSHeader.getX509CertThumbprint();
            this.x5t256 = jWSHeader.getX509CertSHA256Thumbprint();
            this.x5c = jWSHeader.getX509CertChain();
            this.kid = jWSHeader.getKeyID();
            this.b64 = jWSHeader.isBase64URLEncodePayload();
            this.customParams = jWSHeader.getCustomParams();
        }

        public com.nimbusds.jose.JWSHeader.Builder type(com.nimbusds.jose.JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder contentType(java.lang.String str) {
            this.cty = str;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder criticalParams(java.util.Set<java.lang.String> set) {
            this.crit = set;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder jwkURL(java.net.URI uri) {
            this.jku = uri;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder jwk(com.nimbusds.jose.jwk.JWK jwk) {
            if (jwk != null && jwk.isPrivate()) {
                throw new java.lang.IllegalArgumentException("The JWK must be public");
            }
            this.jwk = jwk;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder x509CertURL(java.net.URI uri) {
            this.x5u = uri;
            return this;
        }

        @java.lang.Deprecated
        public com.nimbusds.jose.JWSHeader.Builder x509CertThumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder x509CertChain(java.util.List<com.nimbusds.jose.util.Base64> list) {
            this.x5c = list;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder keyID(java.lang.String str) {
            this.kid = str;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder base64URLEncodePayload(boolean z) {
            this.b64 = z;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder customParam(java.lang.String str, java.lang.Object obj) {
            if (com.nimbusds.jose.JWSHeader.getRegisteredParameterNames().contains(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The parameter name \"");
                sb.append(str);
                sb.append("\" matches a registered name");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (this.customParams == null) {
                this.customParams = new java.util.HashMap();
            }
            this.customParams.put(str, obj);
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder customParams(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.customParams = map;
            return this;
        }

        public com.nimbusds.jose.JWSHeader.Builder parsedBase64URL(com.nimbusds.jose.util.Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWSHeader build() {
            return new com.nimbusds.jose.JWSHeader(this.alg, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.b64, this.customParams, this.parsedBase64URL);
        }
    }

    public JWSHeader(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) {
        this(jWSAlgorithm, null, null, null, null, null, null, null, null, null, null, true, null, null);
    }

    @java.lang.Deprecated
    public JWSHeader(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, com.nimbusds.jose.JOSEObjectType jOSEObjectType, java.lang.String str, java.util.Set<java.lang.String> set, java.net.URI uri, com.nimbusds.jose.jwk.JWK jwk, java.net.URI uri2, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL3) {
        this(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, true, map, base64URL3);
    }

    public JWSHeader(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, com.nimbusds.jose.JOSEObjectType jOSEObjectType, java.lang.String str, java.util.Set<java.lang.String> set, java.net.URI uri, com.nimbusds.jose.jwk.JWK jwk, java.net.URI uri2, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.lang.String str2, boolean z, java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL3) {
        super(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (jWSAlgorithm == null) {
            throw new java.lang.IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        if (jWSAlgorithm.getName().equals(com.nimbusds.jose.Algorithm.NONE.getName())) {
            throw new java.lang.IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.b64 = z;
    }

    public JWSHeader(com.nimbusds.jose.JWSHeader jWSHeader) {
        this(jWSHeader.getAlgorithm(), jWSHeader.getType(), jWSHeader.getContentType(), jWSHeader.getCriticalParams(), jWSHeader.getJWKURL(), jWSHeader.getJWK(), jWSHeader.getX509CertURL(), jWSHeader.getX509CertThumbprint(), jWSHeader.getX509CertSHA256Thumbprint(), jWSHeader.getX509CertChain(), jWSHeader.getKeyID(), jWSHeader.isBase64URLEncodePayload(), jWSHeader.getCustomParams(), jWSHeader.getParsedBase64URL());
    }

    public static java.util.Set<java.lang.String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    @Override // com.nimbusds.jose.Header
    public final com.nimbusds.jose.JWSAlgorithm getAlgorithm() {
        return (com.nimbusds.jose.JWSAlgorithm) super.getAlgorithm();
    }

    public final boolean isBase64URLEncodePayload() {
        return this.b64;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public final java.util.Set<java.lang.String> getIncludedParams() {
        java.util.Set<java.lang.String> includedParams = super.getIncludedParams();
        if (!isBase64URLEncodePayload()) {
            includedParams.add("b64");
        }
        return includedParams;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        if (!isBase64URLEncodePayload()) {
            jSONObject.put("b64", java.lang.Boolean.FALSE);
        }
        return jSONObject;
    }

    public static com.nimbusds.jose.JWSHeader parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return parse(map, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.JWSHeader parse(java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        com.nimbusds.jose.Algorithm parseAlgorithm = com.nimbusds.jose.Header.parseAlgorithm(map);
        if (!(parseAlgorithm instanceof com.nimbusds.jose.JWSAlgorithm)) {
            throw new java.text.ParseException("Not a JWS header", 0);
        }
        com.nimbusds.jose.JWSHeader.Builder parsedBase64URL = new com.nimbusds.jose.JWSHeader.Builder((com.nimbusds.jose.JWSAlgorithm) parseAlgorithm).parsedBase64URL(base64URL);
        for (java.lang.String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if ("typ".equals(str)) {
                    java.lang.String string = com.nimbusds.jose.util.JSONObjectUtils.getString(map, str);
                    if (string != null) {
                        parsedBase64URL = parsedBase64URL.type(new com.nimbusds.jose.JOSEObjectType(string));
                    }
                } else if ("cty".equals(str)) {
                    parsedBase64URL = parsedBase64URL.contentType(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str));
                } else if ("crit".equals(str)) {
                    java.util.List<java.lang.String> stringList = com.nimbusds.jose.util.JSONObjectUtils.getStringList(map, str);
                    if (stringList != null) {
                        parsedBase64URL = parsedBase64URL.criticalParams(new java.util.HashSet(stringList));
                    }
                } else if ("jku".equals(str)) {
                    parsedBase64URL = parsedBase64URL.jwkURL(com.nimbusds.jose.util.JSONObjectUtils.getURI(map, str));
                } else if ("jwk".equals(str)) {
                    parsedBase64URL = parsedBase64URL.jwk(com.nimbusds.jose.CommonSEHeader.parsePublicJWK(com.nimbusds.jose.util.JSONObjectUtils.getJSONObject(map, str)));
                } else if ("x5u".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertURL(com.nimbusds.jose.util.JSONObjectUtils.getURI(map, str));
                } else if ("x5t".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertThumbprint(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if ("x5c".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertChain(com.nimbusds.jose.util.X509CertChainUtils.toBase64List(com.nimbusds.jose.util.JSONObjectUtils.getJSONArray(map, str)));
                } else if ("kid".equals(str)) {
                    parsedBase64URL = parsedBase64URL.keyID(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str));
                } else if ("b64".equals(str)) {
                    parsedBase64URL = parsedBase64URL.base64URLEncodePayload(com.nimbusds.jose.util.JSONObjectUtils.getBoolean(map, str));
                } else {
                    parsedBase64URL = parsedBase64URL.customParam(str, map.get(str));
                }
            }
        }
        return parsedBase64URL.build();
    }

    public static com.nimbusds.jose.JWSHeader parse(java.lang.String str) throws java.text.ParseException {
        return parse(str, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.JWSHeader parse(java.lang.String str, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str, 20000), base64URL);
    }

    public static com.nimbusds.jose.JWSHeader parse(com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
