package com.nimbusds.jose.jwk;

/* loaded from: classes4.dex */
public abstract class JWK implements java.io.Serializable {
    public static final java.lang.String MIME_TYPE = "application/jwk+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.Algorithm alg;
    private final java.util.Date exp;
    private final java.util.Date iat;
    private final java.security.KeyStore keyStore;
    private final java.lang.String kid;
    private final com.nimbusds.jose.jwk.KeyType kty;
    private final java.util.Date nbf;
    private final java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
    private final java.util.List<java.security.cert.X509Certificate> parsedX5c;
    private final com.nimbusds.jose.jwk.KeyUse use;
    private final java.util.List<com.nimbusds.jose.util.Base64> x5c;

    @java.lang.Deprecated
    private final com.nimbusds.jose.util.Base64URL x5t;
    private final com.nimbusds.jose.util.Base64URL x5t256;
    private final java.net.URI x5u;

    public abstract java.util.LinkedHashMap<java.lang.String, ?> getRequiredParams();

    public abstract boolean isPrivate();

    public abstract int size();

    public abstract com.nimbusds.jose.jwk.JWK toPublicJWK();

    @java.lang.Deprecated
    protected JWK(com.nimbusds.jose.jwk.KeyType keyType, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(keyType, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, null, null, null, keyStore);
    }

    protected JWK(com.nimbusds.jose.jwk.KeyType keyType, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        if (keyType == null) {
            throw new java.lang.IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.kty = keyType;
        if (!com.nimbusds.jose.jwk.KeyUseAndOpsConsistency.areConsistent(keyUse, set)) {
            throw new java.lang.IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        this.use = keyUse;
        this.ops = set;
        this.alg = algorithm;
        this.kid = str;
        this.x5u = uri;
        this.x5t = base64URL;
        this.x5t256 = base64URL2;
        if (list != null && list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.x5c = list;
        try {
            this.parsedX5c = com.nimbusds.jose.util.X509CertChainUtils.parse(list);
            this.exp = date;
            this.nbf = date2;
            this.iat = date3;
            this.keyStore = keyStore;
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid X.509 certificate chain \"x5c\": ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }

    public com.nimbusds.jose.jwk.KeyType getKeyType() {
        return this.kty;
    }

    public com.nimbusds.jose.jwk.KeyUse getKeyUse() {
        return this.use;
    }

    public java.util.Set<com.nimbusds.jose.jwk.KeyOperation> getKeyOperations() {
        return this.ops;
    }

    public com.nimbusds.jose.Algorithm getAlgorithm() {
        return this.alg;
    }

    public java.lang.String getKeyID() {
        return this.kid;
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
        java.util.List<com.nimbusds.jose.util.Base64> list = this.x5c;
        if (list == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(list);
    }

    public java.util.List<java.security.cert.X509Certificate> getParsedX509CertChain() {
        java.util.List<java.security.cert.X509Certificate> list = this.parsedX5c;
        if (list == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(list);
    }

    public java.util.Date getExpirationTime() {
        return this.exp;
    }

    public java.util.Date getNotBeforeTime() {
        return this.nbf;
    }

    public java.util.Date getIssueTime() {
        return this.iat;
    }

    public java.security.KeyStore getKeyStore() {
        return this.keyStore;
    }

    public com.nimbusds.jose.util.Base64URL computeThumbprint() throws com.nimbusds.jose.JOSEException {
        return computeThumbprint("SHA-256");
    }

    public com.nimbusds.jose.util.Base64URL computeThumbprint(java.lang.String str) throws com.nimbusds.jose.JOSEException {
        return com.nimbusds.jose.jwk.ThumbprintUtils.compute(str, this);
    }

    public com.nimbusds.jose.jwk.ThumbprintURI computeThumbprintURI() throws com.nimbusds.jose.JOSEException {
        return new com.nimbusds.jose.jwk.ThumbprintURI("sha-256", computeThumbprint("SHA-256"));
    }

    public com.nimbusds.jose.jwk.RSAKey toRSAKey() {
        return (com.nimbusds.jose.jwk.RSAKey) this;
    }

    public com.nimbusds.jose.jwk.ECKey toECKey() {
        return (com.nimbusds.jose.jwk.ECKey) this;
    }

    public com.nimbusds.jose.jwk.OctetSequenceKey toOctetSequenceKey() {
        return (com.nimbusds.jose.jwk.OctetSequenceKey) this;
    }

    public com.nimbusds.jose.jwk.OctetKeyPair toOctetKeyPair() {
        return (com.nimbusds.jose.jwk.OctetKeyPair) this;
    }

    public java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.put("kty", this.kty.getValue());
        com.nimbusds.jose.jwk.KeyUse keyUse = this.use;
        if (keyUse != null) {
            newJSONObject.put("use", keyUse.identifier());
        }
        if (this.ops != null) {
            java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
            java.util.Iterator<com.nimbusds.jose.jwk.KeyOperation> it = this.ops.iterator();
            while (it.hasNext()) {
                newJSONArray.add(it.next().identifier());
            }
            newJSONObject.put("key_ops", newJSONArray);
        }
        com.nimbusds.jose.Algorithm algorithm = this.alg;
        if (algorithm != null) {
            newJSONObject.put("alg", algorithm.getName());
        }
        java.lang.String str = this.kid;
        if (str != null) {
            newJSONObject.put("kid", str);
        }
        java.net.URI uri = this.x5u;
        if (uri != null) {
            newJSONObject.put("x5u", uri.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL = this.x5t;
        if (base64URL != null) {
            newJSONObject.put("x5t", base64URL.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL2 = this.x5t256;
        if (base64URL2 != null) {
            newJSONObject.put("x5t#S256", base64URL2.toString());
        }
        if (this.x5c != null) {
            java.util.List<java.lang.Object> newJSONArray2 = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
            java.util.Iterator<com.nimbusds.jose.util.Base64> it2 = this.x5c.iterator();
            while (it2.hasNext()) {
                newJSONArray2.add(it2.next().toString());
            }
            newJSONObject.put("x5c", newJSONArray2);
        }
        java.util.Date date = this.exp;
        if (date != null) {
            newJSONObject.put("exp", java.lang.Long.valueOf(com.nimbusds.jwt.util.DateUtils.toSecondsSinceEpoch(date)));
        }
        java.util.Date date2 = this.nbf;
        if (date2 != null) {
            newJSONObject.put("nbf", java.lang.Long.valueOf(com.nimbusds.jwt.util.DateUtils.toSecondsSinceEpoch(date2)));
        }
        java.util.Date date3 = this.iat;
        if (date3 != null) {
            newJSONObject.put("iat", java.lang.Long.valueOf(com.nimbusds.jwt.util.DateUtils.toSecondsSinceEpoch(date3)));
        }
        return newJSONObject;
    }

    public java.lang.String toJSONString() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toJSONObject());
    }

    public java.lang.String toString() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toJSONObject());
    }

    public static com.nimbusds.jose.jwk.JWK parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public static com.nimbusds.jose.jwk.JWK parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        java.lang.String string = com.nimbusds.jose.util.JSONObjectUtils.getString(map, "kty");
        if (string == null) {
            throw new java.text.ParseException("Missing key type \"kty\" parameter", 0);
        }
        com.nimbusds.jose.jwk.KeyType parse = com.nimbusds.jose.jwk.KeyType.parse(string);
        if (parse == com.nimbusds.jose.jwk.KeyType.EC) {
            return com.nimbusds.jose.jwk.ECKey.parse(map);
        }
        if (parse == com.nimbusds.jose.jwk.KeyType.RSA) {
            return com.nimbusds.jose.jwk.RSAKey.parse(map);
        }
        if (parse == com.nimbusds.jose.jwk.KeyType.OCT) {
            return com.nimbusds.jose.jwk.OctetSequenceKey.parse(map);
        }
        if (parse == com.nimbusds.jose.jwk.KeyType.OKP) {
            return com.nimbusds.jose.jwk.OctetKeyPair.parse(map);
        }
        throw new java.text.ParseException("Unsupported key type \"kty\" parameter: ".concat(java.lang.String.valueOf(parse)), 0);
    }

    public static com.nimbusds.jose.jwk.JWK parse(java.security.cert.X509Certificate x509Certificate) throws com.nimbusds.jose.JOSEException {
        if (x509Certificate.getPublicKey() instanceof java.security.interfaces.RSAPublicKey) {
            return com.nimbusds.jose.jwk.RSAKey.parse(x509Certificate);
        }
        if (x509Certificate.getPublicKey() instanceof java.security.interfaces.ECPublicKey) {
            return com.nimbusds.jose.jwk.ECKey.parse(x509Certificate);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported public key algorithm: ");
        sb.append(x509Certificate.getPublicKey().getAlgorithm());
        throw new com.nimbusds.jose.JOSEException(sb.toString());
    }

    public static com.nimbusds.jose.jwk.JWK parseFromPEMEncodedX509Cert(java.lang.String str) throws com.nimbusds.jose.JOSEException {
        java.security.cert.X509Certificate parse = com.nimbusds.jose.util.X509CertUtils.parse(str);
        if (parse == null) {
            throw new com.nimbusds.jose.JOSEException("Couldn't parse PEM-encoded X.509 certificate");
        }
        return parse(parse);
    }

    public static com.nimbusds.jose.jwk.JWK load(java.security.KeyStore keyStore, java.lang.String str, char[] cArr) throws java.security.KeyStoreException, com.nimbusds.jose.JOSEException {
        java.security.cert.Certificate certificate = keyStore.getCertificate(str);
        if (certificate == null) {
            return com.nimbusds.jose.jwk.OctetSequenceKey.load(keyStore, str, cArr);
        }
        if (certificate.getPublicKey() instanceof java.security.interfaces.RSAPublicKey) {
            return com.nimbusds.jose.jwk.RSAKey.load(keyStore, str, cArr);
        }
        if (certificate.getPublicKey() instanceof java.security.interfaces.ECPublicKey) {
            return com.nimbusds.jose.jwk.ECKey.load(keyStore, str, cArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported public key algorithm: ");
        sb.append(certificate.getPublicKey().getAlgorithm());
        throw new com.nimbusds.jose.JOSEException(sb.toString());
    }

    public static com.nimbusds.jose.jwk.JWK parseFromPEMEncodedObjects(java.lang.String str) throws com.nimbusds.jose.JOSEException {
        java.util.List<java.security.KeyPair> parseKeys = com.nimbusds.jose.jwk.PEMEncodedKeyParser.parseKeys(str);
        if (parseKeys.isEmpty()) {
            throw new com.nimbusds.jose.JOSEException("No PEM-encoded keys found");
        }
        java.security.KeyPair mergeKeyPairs = mergeKeyPairs(parseKeys);
        java.security.PublicKey publicKey = mergeKeyPairs.getPublic();
        java.security.PrivateKey privateKey = mergeKeyPairs.getPrivate();
        if (publicKey == null) {
            throw new com.nimbusds.jose.JOSEException("Missing PEM-encoded public key to construct JWK");
        }
        if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) publicKey;
            java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
            boolean z = privateKey instanceof java.security.interfaces.ECPrivateKey;
            if (z) {
                validateEcCurves(eCPublicKey, (java.security.interfaces.ECPrivateKey) privateKey);
            }
            if (privateKey != null && !z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported ");
                sb.append(com.nimbusds.jose.jwk.KeyType.EC.getValue());
                sb.append(" private key type: ");
                sb.append(privateKey);
                throw new com.nimbusds.jose.JOSEException(sb.toString());
            }
            com.nimbusds.jose.jwk.ECKey.Builder builder = new com.nimbusds.jose.jwk.ECKey.Builder(com.nimbusds.jose.jwk.Curve.forECParameterSpec(params), eCPublicKey);
            if (privateKey != null) {
                builder.privateKey((java.security.interfaces.ECPrivateKey) privateKey);
            }
            return builder.build();
        }
        if (publicKey instanceof java.security.interfaces.RSAPublicKey) {
            com.nimbusds.jose.jwk.RSAKey.Builder builder2 = new com.nimbusds.jose.jwk.RSAKey.Builder((java.security.interfaces.RSAPublicKey) publicKey);
            if (privateKey instanceof java.security.interfaces.RSAPrivateKey) {
                builder2.privateKey((java.security.interfaces.RSAPrivateKey) privateKey);
            } else if (privateKey != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported ");
                sb2.append(com.nimbusds.jose.jwk.KeyType.RSA.getValue());
                sb2.append(" private key type: ");
                sb2.append(privateKey);
                throw new com.nimbusds.jose.JOSEException(sb2.toString());
            }
            return builder2.build();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unsupported algorithm of PEM-encoded key: ");
        sb3.append(publicKey.getAlgorithm());
        throw new com.nimbusds.jose.JOSEException(sb3.toString());
    }

    private static void validateEcCurves(java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey) throws com.nimbusds.jose.JOSEException {
        java.security.spec.ECParameterSpec params = eCPublicKey.getParams();
        java.security.spec.ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Public/private ");
            sb.append(com.nimbusds.jose.jwk.KeyType.EC.getValue());
            sb.append(" key curve mismatch: ");
            sb.append(eCPublicKey);
            throw new com.nimbusds.jose.JOSEException(sb.toString());
        }
        if (params.getCofactor() != params2.getCofactor()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Public/private ");
            sb2.append(com.nimbusds.jose.jwk.KeyType.EC.getValue());
            sb2.append(" key cofactor mismatch: ");
            sb2.append(eCPublicKey);
            throw new com.nimbusds.jose.JOSEException(sb2.toString());
        }
        if (!params.getGenerator().equals(params2.getGenerator())) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Public/private ");
            sb3.append(com.nimbusds.jose.jwk.KeyType.EC.getValue());
            sb3.append(" key generator mismatch: ");
            sb3.append(eCPublicKey);
            throw new com.nimbusds.jose.JOSEException(sb3.toString());
        }
        if (params.getOrder().equals(params2.getOrder())) {
            return;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Public/private ");
        sb4.append(com.nimbusds.jose.jwk.KeyType.EC.getValue());
        sb4.append(" key order mismatch: ");
        sb4.append(eCPublicKey);
        throw new com.nimbusds.jose.JOSEException(sb4.toString());
    }

    private static java.security.KeyPair mergeKeyPairs(java.util.List<java.security.KeyPair> list) throws com.nimbusds.jose.JOSEException {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return twoKeysToKeyPair(list);
        }
        throw new com.nimbusds.jose.JOSEException("Expected key or pair of PEM-encoded keys");
    }

    private static java.security.KeyPair twoKeysToKeyPair(java.util.List<? extends java.security.KeyPair> list) throws com.nimbusds.jose.JOSEException {
        java.security.KeyPair keyPair = list.get(0);
        java.security.KeyPair keyPair2 = list.get(1);
        if (keyPair.getPublic() != null && keyPair2.getPrivate() != null) {
            return new java.security.KeyPair(keyPair.getPublic(), keyPair2.getPrivate());
        }
        if (keyPair.getPrivate() != null && keyPair2.getPublic() != null) {
            return new java.security.KeyPair(keyPair2.getPublic(), keyPair.getPrivate());
        }
        throw new com.nimbusds.jose.JOSEException("Not a public/private key pair");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.nimbusds.jose.jwk.JWK)) {
            return false;
        }
        com.nimbusds.jose.jwk.JWK jwk = (com.nimbusds.jose.jwk.JWK) obj;
        return java.util.Objects.equals(this.kty, jwk.kty) && java.util.Objects.equals(this.use, jwk.use) && java.util.Objects.equals(this.ops, jwk.ops) && java.util.Objects.equals(this.alg, jwk.alg) && java.util.Objects.equals(this.kid, jwk.kid) && java.util.Objects.equals(this.x5u, jwk.x5u) && java.util.Objects.equals(this.x5t, jwk.x5t) && java.util.Objects.equals(this.x5t256, jwk.x5t256) && java.util.Objects.equals(this.x5c, jwk.x5c) && java.util.Objects.equals(this.exp, jwk.exp) && java.util.Objects.equals(this.nbf, jwk.nbf) && java.util.Objects.equals(this.iat, jwk.iat) && java.util.Objects.equals(this.keyStore, jwk.keyStore);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.kty, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.keyStore);
    }
}
