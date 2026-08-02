package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class OctetSequenceKey extends com.nimbusds.jose.jwk.JWK implements com.nimbusds.jose.jwk.SecretJWK {
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.util.Base64URL k;

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean isPrivate() {
        return true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final com.nimbusds.jose.jwk.OctetSequenceKey toPublicJWK() {
        return null;
    }

    /* loaded from: classes10.dex */
    public static class Builder {
        private com.nimbusds.jose.Algorithm alg;
        private java.util.Date exp;
        private java.util.Date iat;
        private final com.nimbusds.jose.util.Base64URL k;
        private java.lang.String kid;
        private java.security.KeyStore ks;
        private java.util.Date nbf;
        private java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
        private com.nimbusds.jose.jwk.KeyUse use;
        private java.util.List<com.nimbusds.jose.util.Base64> x5c;

        @java.lang.Deprecated
        private com.nimbusds.jose.util.Base64URL x5t;
        private com.nimbusds.jose.util.Base64URL x5t256;
        private java.net.URI x5u;

        public Builder(com.nimbusds.jose.util.Base64URL base64URL) {
            if (base64URL == null) {
                throw new java.lang.IllegalArgumentException("The key value must not be null");
            }
            this.k = base64URL;
        }

        public Builder(byte[] bArr) {
            this(com.nimbusds.jose.util.Base64URL.encode(bArr));
            if (bArr.length == 0) {
                throw new java.lang.IllegalArgumentException("The key must have a positive length");
            }
        }

        public Builder(javax.crypto.SecretKey secretKey) {
            this(secretKey.getEncoded());
        }

        public Builder(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) {
            this.k = octetSequenceKey.k;
            this.use = octetSequenceKey.getKeyUse();
            this.ops = octetSequenceKey.getKeyOperations();
            this.alg = octetSequenceKey.getAlgorithm();
            this.kid = octetSequenceKey.getKeyID();
            this.x5u = octetSequenceKey.getX509CertURL();
            this.x5t = octetSequenceKey.getX509CertThumbprint();
            this.x5t256 = octetSequenceKey.getX509CertSHA256Thumbprint();
            this.x5c = octetSequenceKey.getX509CertChain();
            this.exp = octetSequenceKey.getExpirationTime();
            this.nbf = octetSequenceKey.getNotBeforeTime();
            this.iat = octetSequenceKey.getIssueTime();
            this.ks = octetSequenceKey.getKeyStore();
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyUse(com.nimbusds.jose.jwk.KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyOperations(java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder algorithm(com.nimbusds.jose.Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyID(java.lang.String str) {
            this.kid = str;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyIDFromThumbprint() throws com.nimbusds.jose.JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyIDFromThumbprint(java.lang.String str) throws com.nimbusds.jose.JOSEException {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("k", this.k.toString());
            linkedHashMap.put("kty", com.nimbusds.jose.jwk.KeyType.OCT.getValue());
            this.kid = com.nimbusds.jose.jwk.ThumbprintUtils.compute(str, (java.util.LinkedHashMap<java.lang.String, ?>) linkedHashMap).toString();
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder x509CertURL(java.net.URI uri) {
            this.x5u = uri;
            return this;
        }

        @java.lang.Deprecated
        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder x509CertThumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder x509CertChain(java.util.List<com.nimbusds.jose.util.Base64> list) {
            this.x5c = list;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder expirationTime(java.util.Date date) {
            this.exp = date;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder notBeforeTime(java.util.Date date) {
            this.nbf = date;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder issueTime(java.util.Date date) {
            this.iat = date;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey.Builder keyStore(java.security.KeyStore keyStore) {
            this.ks = keyStore;
            return this;
        }

        public com.nimbusds.jose.jwk.OctetSequenceKey build() {
            try {
                return new com.nimbusds.jose.jwk.OctetSequenceKey(this.k, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        }
    }

    @java.lang.Deprecated
    public OctetSequenceKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(base64URL, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, null, null, null, keyStore);
    }

    public OctetSequenceKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.OCT, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, date, date2, date3, keyStore);
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The key value must not be null");
        }
        this.k = base64URL;
    }

    public final com.nimbusds.jose.util.Base64URL getKeyValue() {
        return this.k;
    }

    public final byte[] toByteArray() {
        return getKeyValue().decode();
    }

    @Override // com.nimbusds.jose.jwk.SecretJWK
    public final javax.crypto.SecretKey toSecretKey() {
        return toSecretKey("NONE");
    }

    public final javax.crypto.SecretKey toSecretKey(java.lang.String str) {
        return new javax.crypto.spec.SecretKeySpec(toByteArray(), str);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final java.util.LinkedHashMap<java.lang.String, ?> getRequiredParams() {
        java.util.LinkedHashMap<java.lang.String, ?> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("k", this.k.toString());
        linkedHashMap.put("kty", getKeyType().toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int size() {
        try {
            return com.nimbusds.jose.util.ByteUtils.safeBitLength(this.k.decode());
        } catch (com.nimbusds.jose.util.IntegerOverflowException e) {
            throw new java.lang.ArithmeticException(e.getMessage());
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        jSONObject.put("k", this.k.toString());
        return jSONObject;
    }

    public static com.nimbusds.jose.jwk.OctetSequenceKey parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public static com.nimbusds.jose.jwk.OctetSequenceKey parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (!com.nimbusds.jose.jwk.KeyType.OCT.equals(com.nimbusds.jose.jwk.JWKMetadata.parseKeyType(map))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The key type kty must be ");
            sb.append(com.nimbusds.jose.jwk.KeyType.OCT.getValue());
            throw new java.text.ParseException(sb.toString(), 0);
        }
        try {
            return new com.nimbusds.jose.jwk.OctetSequenceKey(com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "k"), com.nimbusds.jose.jwk.JWKMetadata.parseKeyUse(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyOperations(map), com.nimbusds.jose.jwk.JWKMetadata.parseAlgorithm(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyID(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertURL(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertThumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertSHA256Thumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertChain(map), com.nimbusds.jose.jwk.JWKMetadata.parseExpirationTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseNotBeforeTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseIssueTime(map), null);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.text.ParseException(e.getMessage(), 0);
        }
    }

    public static com.nimbusds.jose.jwk.OctetSequenceKey load(java.security.KeyStore keyStore, java.lang.String str, char[] cArr) throws java.security.KeyStoreException, com.nimbusds.jose.JOSEException {
        try {
            java.security.Key key = keyStore.getKey(str, cArr);
            if (key instanceof javax.crypto.SecretKey) {
                return new com.nimbusds.jose.jwk.OctetSequenceKey.Builder((javax.crypto.SecretKey) key).keyID(str).keyStore(keyStore).build();
            }
            return null;
        } catch (java.security.NoSuchAlgorithmException | java.security.UnrecoverableKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't retrieve secret key (bad pin?): ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof com.nimbusds.jose.jwk.OctetSequenceKey) && super.equals(obj)) {
            return java.util.Objects.equals(this.k, ((com.nimbusds.jose.jwk.OctetSequenceKey) obj).k);
        }
        return false;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        int hashCode = super.hashCode();
        return java.util.Objects.hash(java.lang.Integer.valueOf(hashCode), this.k);
    }
}
