package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class JWEHeader extends com.nimbusds.jose.CommonSEHeader {
    private static final java.util.Set<java.lang.String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.util.Base64URL apu;
    private final com.nimbusds.jose.util.Base64URL apv;
    private final com.nimbusds.jose.EncryptionMethod enc;
    private final com.nimbusds.jose.jwk.JWK epk;
    private final com.nimbusds.jose.util.Base64URL iv;
    private final int p2c;
    private final com.nimbusds.jose.util.Base64URL p2s;
    private final java.lang.String skid;
    private final com.nimbusds.jose.util.Base64URL tag;
    private final com.nimbusds.jose.CompressionAlgorithm zip;

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
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add(com.nimbusds.jose.HeaderParameterNames.SENDER_KEY_ID);
        hashSet.add("authTag");
        REGISTERED_PARAMETER_NAMES = java.util.Collections.unmodifiableSet(hashSet);
    }

    public static class Builder {
        private com.nimbusds.jose.JWEAlgorithm alg;
        private com.nimbusds.jose.util.Base64URL apu;
        private com.nimbusds.jose.util.Base64URL apv;
        private java.util.Set<java.lang.String> crit;
        private java.lang.String cty;
        private java.util.Map<java.lang.String, java.lang.Object> customParams;
        private final com.nimbusds.jose.EncryptionMethod enc;
        private com.nimbusds.jose.jwk.JWK epk;
        private com.nimbusds.jose.util.Base64URL iv;
        private java.net.URI jku;
        private com.nimbusds.jose.jwk.JWK jwk;
        private java.lang.String kid;
        private int p2c;
        private com.nimbusds.jose.util.Base64URL p2s;
        private com.nimbusds.jose.util.Base64URL parsedBase64URL;
        private java.lang.String skid;
        private com.nimbusds.jose.util.Base64URL tag;
        private com.nimbusds.jose.JOSEObjectType typ;
        private java.util.List<com.nimbusds.jose.util.Base64> x5c;

        @java.lang.Deprecated
        private com.nimbusds.jose.util.Base64URL x5t;
        private com.nimbusds.jose.util.Base64URL x5t256;
        private java.net.URI x5u;
        private com.nimbusds.jose.CompressionAlgorithm zip;

        public Builder(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, com.nimbusds.jose.EncryptionMethod encryptionMethod) {
            if (jWEAlgorithm.getName().equals(com.nimbusds.jose.Algorithm.NONE.getName())) {
                throw new java.lang.IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.alg = jWEAlgorithm;
            if (encryptionMethod == null) {
                throw new java.lang.IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.enc = encryptionMethod;
        }

        public Builder(com.nimbusds.jose.EncryptionMethod encryptionMethod) {
            if (encryptionMethod == null) {
                throw new java.lang.IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.enc = encryptionMethod;
        }

        public Builder(com.nimbusds.jose.JWEHeader jWEHeader) {
            this(jWEHeader.getEncryptionMethod());
            this.alg = jWEHeader.getAlgorithm();
            this.typ = jWEHeader.getType();
            this.cty = jWEHeader.getContentType();
            this.crit = jWEHeader.getCriticalParams();
            this.customParams = jWEHeader.getCustomParams();
            this.jku = jWEHeader.getJWKURL();
            this.jwk = jWEHeader.getJWK();
            this.x5u = jWEHeader.getX509CertURL();
            this.x5t = jWEHeader.getX509CertThumbprint();
            this.x5t256 = jWEHeader.getX509CertSHA256Thumbprint();
            this.x5c = jWEHeader.getX509CertChain();
            this.kid = jWEHeader.getKeyID();
            this.epk = jWEHeader.getEphemeralPublicKey();
            this.zip = jWEHeader.getCompressionAlgorithm();
            this.apu = jWEHeader.getAgreementPartyUInfo();
            this.apv = jWEHeader.getAgreementPartyVInfo();
            this.p2s = jWEHeader.getPBES2Salt();
            this.p2c = jWEHeader.getPBES2Count();
            this.iv = jWEHeader.getIV();
            this.tag = jWEHeader.getAuthTag();
            this.skid = jWEHeader.getSenderKeyID();
            this.customParams = jWEHeader.getCustomParams();
        }

        public com.nimbusds.jose.JWEHeader.Builder alg(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm) {
            this.alg = jWEAlgorithm;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder type(com.nimbusds.jose.JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder contentType(java.lang.String str) {
            this.cty = str;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder criticalParams(java.util.Set<java.lang.String> set) {
            this.crit = set;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder jwkURL(java.net.URI uri) {
            this.jku = uri;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder jwk(com.nimbusds.jose.jwk.JWK jwk) {
            if (jwk != null && jwk.isPrivate()) {
                throw new java.lang.IllegalArgumentException("The JWK must be public");
            }
            this.jwk = jwk;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder x509CertURL(java.net.URI uri) {
            this.x5u = uri;
            return this;
        }

        @java.lang.Deprecated
        public com.nimbusds.jose.JWEHeader.Builder x509CertThumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder x509CertChain(java.util.List<com.nimbusds.jose.util.Base64> list) {
            this.x5c = list;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder keyID(java.lang.String str) {
            this.kid = str;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder ephemeralPublicKey(com.nimbusds.jose.jwk.JWK jwk) {
            this.epk = jwk;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder compressionAlgorithm(com.nimbusds.jose.CompressionAlgorithm compressionAlgorithm) {
            this.zip = compressionAlgorithm;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder agreementPartyUInfo(com.nimbusds.jose.util.Base64URL base64URL) {
            this.apu = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder agreementPartyVInfo(com.nimbusds.jose.util.Base64URL base64URL) {
            this.apv = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder pbes2Salt(com.nimbusds.jose.util.Base64URL base64URL) {
            this.p2s = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder pbes2Count(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("The PBES2 count parameter must not be negative");
            }
            this.p2c = i;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder iv(com.nimbusds.jose.util.Base64URL base64URL) {
            this.iv = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder authTag(com.nimbusds.jose.util.Base64URL base64URL) {
            this.tag = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder senderKeyID(java.lang.String str) {
            this.skid = str;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder customParam(java.lang.String str, java.lang.Object obj) {
            if (com.nimbusds.jose.JWEHeader.getRegisteredParameterNames().contains(str)) {
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

        public com.nimbusds.jose.JWEHeader.Builder customParams(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.customParams = map;
            return this;
        }

        public com.nimbusds.jose.JWEHeader.Builder parsedBase64URL(com.nimbusds.jose.util.Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public com.nimbusds.jose.JWEHeader build() {
            return new com.nimbusds.jose.JWEHeader(this.alg, this.enc, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.epk, this.zip, this.apu, this.apv, this.p2s, this.p2c, this.iv, this.tag, this.skid, this.customParams, this.parsedBase64URL);
        }
    }

    public JWEHeader(com.nimbusds.jose.EncryptionMethod encryptionMethod) {
        this(null, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
    }

    public JWEHeader(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, com.nimbusds.jose.EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
    }

    public JWEHeader(com.nimbusds.jose.Algorithm algorithm, com.nimbusds.jose.EncryptionMethod encryptionMethod, com.nimbusds.jose.JOSEObjectType jOSEObjectType, java.lang.String str, java.util.Set<java.lang.String> set, java.net.URI uri, com.nimbusds.jose.jwk.JWK jwk, java.net.URI uri2, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.lang.String str2, com.nimbusds.jose.jwk.JWK jwk2, com.nimbusds.jose.CompressionAlgorithm compressionAlgorithm, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, int i, com.nimbusds.jose.util.Base64URL base64URL6, com.nimbusds.jose.util.Base64URL base64URL7, java.lang.String str3, java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        if (algorithm != null && algorithm.getName().equals(com.nimbusds.jose.Algorithm.NONE.getName())) {
            throw new java.lang.IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (encryptionMethod == null) {
            throw new java.lang.IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            throw new java.lang.IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i;
        this.iv = base64URL6;
        this.tag = base64URL7;
        this.skid = str3;
    }

    public JWEHeader(com.nimbusds.jose.JWEHeader jWEHeader) {
        this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod(), jWEHeader.getType(), jWEHeader.getContentType(), jWEHeader.getCriticalParams(), jWEHeader.getJWKURL(), jWEHeader.getJWK(), jWEHeader.getX509CertURL(), jWEHeader.getX509CertThumbprint(), jWEHeader.getX509CertSHA256Thumbprint(), jWEHeader.getX509CertChain(), jWEHeader.getKeyID(), jWEHeader.getEphemeralPublicKey(), jWEHeader.getCompressionAlgorithm(), jWEHeader.getAgreementPartyUInfo(), jWEHeader.getAgreementPartyVInfo(), jWEHeader.getPBES2Salt(), jWEHeader.getPBES2Count(), jWEHeader.getIV(), jWEHeader.getAuthTag(), jWEHeader.getSenderKeyID(), jWEHeader.getCustomParams(), jWEHeader.getParsedBase64URL());
    }

    public static java.util.Set<java.lang.String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    @Override // com.nimbusds.jose.Header
    public final com.nimbusds.jose.JWEAlgorithm getAlgorithm() {
        return (com.nimbusds.jose.JWEAlgorithm) super.getAlgorithm();
    }

    public final com.nimbusds.jose.EncryptionMethod getEncryptionMethod() {
        return this.enc;
    }

    public final com.nimbusds.jose.jwk.JWK getEphemeralPublicKey() {
        return this.epk;
    }

    public final com.nimbusds.jose.CompressionAlgorithm getCompressionAlgorithm() {
        return this.zip;
    }

    public final com.nimbusds.jose.util.Base64URL getAgreementPartyUInfo() {
        return this.apu;
    }

    public final com.nimbusds.jose.util.Base64URL getAgreementPartyVInfo() {
        return this.apv;
    }

    public final com.nimbusds.jose.util.Base64URL getPBES2Salt() {
        return this.p2s;
    }

    public final int getPBES2Count() {
        return this.p2c;
    }

    public final com.nimbusds.jose.util.Base64URL getIV() {
        return this.iv;
    }

    public final com.nimbusds.jose.util.Base64URL getAuthTag() {
        return this.tag;
    }

    public final java.lang.String getSenderKeyID() {
        return this.skid;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public final java.util.Set<java.lang.String> getIncludedParams() {
        java.util.Set<java.lang.String> includedParams = super.getIncludedParams();
        if (this.enc != null) {
            includedParams.add("enc");
        }
        if (this.epk != null) {
            includedParams.add("epk");
        }
        if (this.zip != null) {
            includedParams.add("zip");
        }
        if (this.apu != null) {
            includedParams.add("apu");
        }
        if (this.apv != null) {
            includedParams.add("apv");
        }
        if (this.p2s != null) {
            includedParams.add("p2s");
        }
        if (this.p2c > 0) {
            includedParams.add("p2c");
        }
        if (this.iv != null) {
            includedParams.add("iv");
        }
        if (this.tag != null) {
            includedParams.add("tag");
        }
        if (this.skid != null) {
            includedParams.add(com.nimbusds.jose.HeaderParameterNames.SENDER_KEY_ID);
        }
        return includedParams;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        com.nimbusds.jose.EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put("enc", encryptionMethod.toString());
        }
        com.nimbusds.jose.jwk.JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put("epk", jwk.toJSONObject());
        }
        com.nimbusds.jose.CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put("zip", compressionAlgorithm.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put("apu", base64URL.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put("apv", base64URL2.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put("p2s", base64URL3.toString());
        }
        int i = this.p2c;
        if (i > 0) {
            jSONObject.put("p2c", java.lang.Integer.valueOf(i));
        }
        com.nimbusds.jose.util.Base64URL base64URL4 = this.iv;
        if (base64URL4 != null) {
            jSONObject.put("iv", base64URL4.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put("tag", base64URL5.toString());
        }
        java.lang.String str = this.skid;
        if (str != null) {
            jSONObject.put(com.nimbusds.jose.HeaderParameterNames.SENDER_KEY_ID, str);
        }
        return jSONObject;
    }

    private static com.nimbusds.jose.EncryptionMethod parseEncryptionMethod(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.EncryptionMethod.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "enc"));
    }

    public static com.nimbusds.jose.JWEHeader parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return parse(map, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.JWEHeader parse(java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        com.nimbusds.jose.JWEHeader.Builder parsedBase64URL = new com.nimbusds.jose.JWEHeader.Builder(parseEncryptionMethod(map)).parsedBase64URL(base64URL);
        for (java.lang.String str : map.keySet()) {
            if ("alg".equals(str)) {
                parsedBase64URL = parsedBase64URL.alg(com.nimbusds.jose.JWEAlgorithm.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
            } else if (!"enc".equals(str)) {
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
                } else if ("epk".equals(str)) {
                    parsedBase64URL = parsedBase64URL.ephemeralPublicKey(com.nimbusds.jose.jwk.JWK.parse(com.nimbusds.jose.util.JSONObjectUtils.getJSONObject(map, str)));
                } else if ("zip".equals(str)) {
                    java.lang.String string2 = com.nimbusds.jose.util.JSONObjectUtils.getString(map, str);
                    if (string2 != null) {
                        parsedBase64URL = parsedBase64URL.compressionAlgorithm(new com.nimbusds.jose.CompressionAlgorithm(string2));
                    }
                } else if ("apu".equals(str)) {
                    parsedBase64URL = parsedBase64URL.agreementPartyUInfo(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if ("apv".equals(str)) {
                    parsedBase64URL = parsedBase64URL.agreementPartyVInfo(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if ("p2s".equals(str)) {
                    parsedBase64URL = parsedBase64URL.pbes2Salt(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if ("p2c".equals(str)) {
                    parsedBase64URL = parsedBase64URL.pbes2Count(com.nimbusds.jose.util.JSONObjectUtils.getInt(map, str));
                } else if ("iv".equals(str)) {
                    parsedBase64URL = parsedBase64URL.iv(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if ("tag".equals(str)) {
                    parsedBase64URL = parsedBase64URL.authTag(com.nimbusds.jose.util.Base64URL.from(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str)));
                } else if (com.nimbusds.jose.HeaderParameterNames.SENDER_KEY_ID.equals(str)) {
                    parsedBase64URL = parsedBase64URL.senderKeyID(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str));
                } else {
                    parsedBase64URL = parsedBase64URL.customParam(str, map.get(str));
                }
            }
        }
        return parsedBase64URL.build();
    }

    public static com.nimbusds.jose.JWEHeader parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str), (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.JWEHeader parse(java.lang.String str, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str, 20000), base64URL);
    }

    public static com.nimbusds.jose.JWEHeader parse(com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
