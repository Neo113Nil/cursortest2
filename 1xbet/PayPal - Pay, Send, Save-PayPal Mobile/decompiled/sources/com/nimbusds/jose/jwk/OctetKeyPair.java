package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public class OctetKeyPair extends com.nimbusds.jose.jwk.JWK implements com.nimbusds.jose.jwk.AsymmetricJWK, com.nimbusds.jose.jwk.CurveBasedJWK {
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_CURVES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.nimbusds.jose.jwk.Curve.Ed25519, com.nimbusds.jose.jwk.Curve.Ed448, com.nimbusds.jose.jwk.Curve.X25519, com.nimbusds.jose.jwk.Curve.X448)));
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.jwk.Curve crv;
    private final com.nimbusds.jose.util.Base64URL d;
    private final byte[] decodedD;
    private final byte[] decodedX;
    private final com.nimbusds.jose.util.Base64URL x;

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(java.security.cert.X509Certificate x509Certificate) {
        return false;
    }

    /* loaded from: classes10.dex */
    public static class Builder {
        private com.nimbusds.jose.Algorithm alg;
        private final com.nimbusds.jose.jwk.Curve crv;
        private com.nimbusds.jose.util.Base64URL d;
        private java.util.Date exp;
        private java.util.Date iat;
        private java.lang.String kid;
        private java.security.KeyStore ks;
        private java.util.Date nbf;
        private java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
        private com.nimbusds.jose.jwk.KeyUse use;
        private final com.nimbusds.jose.util.Base64URL x;
        private java.util.List<com.nimbusds.jose.util.Base64> x5c;

        @java.lang.Deprecated
        private com.nimbusds.jose.util.Base64URL x5t;
        private com.nimbusds.jose.util.Base64URL x5t256;
        private java.net.URI x5u;

        public Builder(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL) {
            if (curve == null) {
                throw new java.lang.IllegalArgumentException("The curve must not be null");
            }
            this.crv = curve;
            if (base64URL == null) {
                throw new java.lang.IllegalArgumentException("The 'x' coordinate must not be null");
            }
            this.x = base64URL;
        }

        public Builder(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair) {
            this.crv = octetKeyPair.crv;
            this.x = octetKeyPair.x;
            this.d = octetKeyPair.d;
            this.use = octetKeyPair.getKeyUse();
            this.ops = octetKeyPair.getKeyOperations();
            this.alg = octetKeyPair.getAlgorithm();
            this.kid = octetKeyPair.getKeyID();
            this.x5u = octetKeyPair.getX509CertURL();
            this.x5t = octetKeyPair.getX509CertThumbprint();
            this.x5t256 = octetKeyPair.getX509CertSHA256Thumbprint();
            this.x5c = octetKeyPair.getX509CertChain();
            this.exp = octetKeyPair.getExpirationTime();
            this.nbf = octetKeyPair.getNotBeforeTime();
            this.iat = octetKeyPair.getIssueTime();
            this.ks = octetKeyPair.getKeyStore();
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder d(com.nimbusds.jose.util.Base64URL base64URL) {
            this.d = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder keyUse(com.nimbusds.jose.jwk.KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder keyOperations(java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder algorithm(com.nimbusds.jose.Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder keyID(java.lang.String str) {
            this.kid = str;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder keyIDFromThumbprint() throws com.nimbusds.jose.JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder keyIDFromThumbprint(java.lang.String str) throws com.nimbusds.jose.JOSEException {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("crv", this.crv.toString());
            linkedHashMap.put("kty", com.nimbusds.jose.jwk.KeyType.OKP.getValue());
            linkedHashMap.put("x", this.x.toString());
            this.kid = com.nimbusds.jose.jwk.ThumbprintUtils.compute(str, (java.util.LinkedHashMap<java.lang.String, ?>) linkedHashMap).toString();
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder x509CertURL(java.net.URI uri) {
            this.x5u = uri;
            return this;
        }

        @java.lang.Deprecated
        public com.nimbusds.jose.jwk.OctetKeyPair.Builder x509CertThumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder x509CertChain(java.util.List<com.nimbusds.jose.util.Base64> list) {
            this.x5c = list;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder expirationTime(java.util.Date date) {
            this.exp = date;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder notBeforeTime(java.util.Date date) {
            this.nbf = date;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder issueTime(java.util.Date date) {
            this.iat = date;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair.Builder keyStore(java.security.KeyStore keyStore) {
            this.ks = keyStore;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetKeyPair build() {
            try {
                if (this.d == null) {
                    return new com.nimbusds.jose.jwk.OctetKeyPair(this.crv, this.x, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
                }
                return new com.nimbusds.jose.jwk.OctetKeyPair(this.crv, this.x, this.d, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        }
    }

    @java.lang.Deprecated
    public OctetKeyPair(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, base64URL, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, null, null, null, keyStore);
    }

    @java.lang.Deprecated
    public OctetKeyPair(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, base64URL, base64URL2, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, null, null, null, keyStore);
    }

    public OctetKeyPair(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, date, date2, date3, keyStore);
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new java.lang.IllegalArgumentException("Unknown / unsupported curve: ".concat(java.lang.String.valueOf(curve)));
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.x = base64URL;
        this.decodedX = base64URL.decode();
        this.d = null;
        this.decodedD = null;
    }

    public OctetKeyPair(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyStore);
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new java.lang.IllegalArgumentException("Unknown / unsupported curve: ".concat(java.lang.String.valueOf(curve)));
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.x = base64URL;
        this.decodedX = base64URL.decode();
        if (base64URL2 == null) {
            throw new java.lang.IllegalArgumentException("The 'd' parameter must not be null");
        }
        this.d = base64URL2;
        this.decodedD = base64URL2.decode();
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public com.nimbusds.jose.jwk.Curve getCurve() {
        return this.crv;
    }

    public com.nimbusds.jose.util.Base64URL getX() {
        return this.x;
    }

    public byte[] getDecodedX() {
        return (byte[]) this.decodedX.clone();
    }

    public com.nimbusds.jose.util.Base64URL getD() {
        return this.d;
    }

    public byte[] getDecodedD() {
        byte[] bArr = this.decodedD;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public java.security.PublicKey toPublicKey() throws com.nimbusds.jose.JOSEException {
        throw new com.nimbusds.jose.JOSEException("Export to java.security.PublicKey not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public java.security.PrivateKey toPrivateKey() throws com.nimbusds.jose.JOSEException {
        throw new com.nimbusds.jose.JOSEException("Export to java.security.PrivateKey not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public java.security.KeyPair toKeyPair() throws com.nimbusds.jose.JOSEException {
        throw new com.nimbusds.jose.JOSEException("Export to java.security.KeyPair not supported");
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public java.util.LinkedHashMap<java.lang.String, ?> getRequiredParams() {
        java.util.LinkedHashMap<java.lang.String, ?> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("crv", this.crv.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("x", this.x.toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return this.d != null;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public com.nimbusds.jose.jwk.OctetKeyPair toPublicJWK() {
        return new com.nimbusds.jose.jwk.OctetKeyPair(getCurve(), getX(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getExpirationTime(), getNotBeforeTime(), getIssueTime(), getKeyStore());
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.x.toString());
        com.nimbusds.jose.util.Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        return com.nimbusds.jose.util.ByteUtils.bitLength(this.x.decode());
    }

    public static com.nimbusds.jose.jwk.OctetKeyPair parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public static com.nimbusds.jose.jwk.OctetKeyPair parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (!com.nimbusds.jose.jwk.KeyType.OKP.equals(com.nimbusds.jose.jwk.JWKMetadata.parseKeyType(map))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The key type kty must be ");
            sb.append(com.nimbusds.jose.jwk.KeyType.OKP.getValue());
            throw new java.text.ParseException(sb.toString(), 0);
        }
        try {
            com.nimbusds.jose.jwk.Curve parse = com.nimbusds.jose.jwk.Curve.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "crv"));
            com.nimbusds.jose.util.Base64URL base64URL = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "x");
            com.nimbusds.jose.util.Base64URL base64URL2 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "d");
            try {
                if (base64URL2 == null) {
                    return new com.nimbusds.jose.jwk.OctetKeyPair(parse, base64URL, com.nimbusds.jose.jwk.JWKMetadata.parseKeyUse(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyOperations(map), com.nimbusds.jose.jwk.JWKMetadata.parseAlgorithm(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyID(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertURL(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertThumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertSHA256Thumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertChain(map), com.nimbusds.jose.jwk.JWKMetadata.parseExpirationTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseNotBeforeTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseIssueTime(map), null);
                }
                return new com.nimbusds.jose.jwk.OctetKeyPair(parse, base64URL, base64URL2, com.nimbusds.jose.jwk.JWKMetadata.parseKeyUse(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyOperations(map), com.nimbusds.jose.jwk.JWKMetadata.parseAlgorithm(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyID(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertURL(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertThumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertSHA256Thumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertChain(map), com.nimbusds.jose.jwk.JWKMetadata.parseExpirationTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseNotBeforeTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseIssueTime(map), null);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.text.ParseException(e.getMessage(), 0);
            }
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.text.ParseException(e2.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.nimbusds.jose.jwk.OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair = (com.nimbusds.jose.jwk.OctetKeyPair) obj;
        return java.util.Objects.equals(this.crv, octetKeyPair.crv) && java.util.Objects.equals(this.x, octetKeyPair.x) && java.util.Arrays.equals(this.decodedX, octetKeyPair.decodedX) && java.util.Objects.equals(this.d, octetKeyPair.d) && java.util.Arrays.equals(this.decodedD, octetKeyPair.decodedD);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        int hashCode = super.hashCode();
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(hashCode), this.crv, this.x, this.d) * 31) + java.util.Arrays.hashCode(this.decodedX)) * 31) + java.util.Arrays.hashCode(this.decodedD);
    }
}
