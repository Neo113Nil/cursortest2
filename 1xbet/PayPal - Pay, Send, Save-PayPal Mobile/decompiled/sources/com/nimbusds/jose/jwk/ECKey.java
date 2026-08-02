package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class ECKey extends com.nimbusds.jose.jwk.JWK implements com.nimbusds.jose.jwk.AsymmetricJWK, com.nimbusds.jose.jwk.CurveBasedJWK {
    public static final java.util.Set<com.nimbusds.jose.jwk.Curve> SUPPORTED_CURVES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.nimbusds.jose.jwk.Curve.P_256, com.nimbusds.jose.jwk.Curve.SECP256K1, com.nimbusds.jose.jwk.Curve.P_384, com.nimbusds.jose.jwk.Curve.P_521)));
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.jwk.Curve crv;
    private final com.nimbusds.jose.util.Base64URL d;
    private final java.security.PrivateKey privateKey;
    private final com.nimbusds.jose.util.Base64URL x;
    private final com.nimbusds.jose.util.Base64URL y;

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
        private java.security.PrivateKey priv;
        private com.nimbusds.jose.jwk.KeyUse use;
        private final com.nimbusds.jose.util.Base64URL x;
        private java.util.List<com.nimbusds.jose.util.Base64> x5c;

        @java.lang.Deprecated
        private com.nimbusds.jose.util.Base64URL x5t;
        private com.nimbusds.jose.util.Base64URL x5t256;
        private java.net.URI x5u;
        private final com.nimbusds.jose.util.Base64URL y;

        public Builder(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2) {
            if (curve == null) {
                throw new java.lang.IllegalArgumentException("The curve must not be null");
            }
            this.crv = curve;
            if (base64URL == null) {
                throw new java.lang.IllegalArgumentException("The 'x' coordinate must not be null");
            }
            this.x = base64URL;
            if (base64URL2 == null) {
                throw new java.lang.IllegalArgumentException("The 'y' coordinate must not be null");
            }
            this.y = base64URL2;
        }

        public Builder(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey) {
            this(curve, com.nimbusds.jose.jwk.ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), com.nimbusds.jose.jwk.ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }

        public Builder(com.nimbusds.jose.jwk.ECKey eCKey) {
            this.crv = eCKey.crv;
            this.x = eCKey.x;
            this.y = eCKey.y;
            this.d = eCKey.d;
            this.priv = eCKey.privateKey;
            this.use = eCKey.getKeyUse();
            this.ops = eCKey.getKeyOperations();
            this.alg = eCKey.getAlgorithm();
            this.kid = eCKey.getKeyID();
            this.x5u = eCKey.getX509CertURL();
            this.x5t = eCKey.getX509CertThumbprint();
            this.x5t256 = eCKey.getX509CertSHA256Thumbprint();
            this.x5c = eCKey.getX509CertChain();
            this.exp = eCKey.getExpirationTime();
            this.nbf = eCKey.getNotBeforeTime();
            this.iat = eCKey.getIssueTime();
            this.ks = eCKey.getKeyStore();
        }

        public com.nimbusds.jose.jwk.ECKey.Builder d(com.nimbusds.jose.util.Base64URL base64URL) {
            this.d = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder privateKey(java.security.interfaces.ECPrivateKey eCPrivateKey) {
            if (eCPrivateKey != null) {
                this.d = com.nimbusds.jose.jwk.ECKey.encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS());
            }
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder privateKey(java.security.PrivateKey privateKey) {
            if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
                return privateKey((java.security.interfaces.ECPrivateKey) privateKey);
            }
            if (!"EC".equalsIgnoreCase(privateKey.getAlgorithm())) {
                throw new java.lang.IllegalArgumentException("The private key algorithm must be EC");
            }
            this.priv = privateKey;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder keyUse(com.nimbusds.jose.jwk.KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder keyOperations(java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder algorithm(com.nimbusds.jose.Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder keyID(java.lang.String str) {
            this.kid = str;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder keyIDFromThumbprint() throws com.nimbusds.jose.JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public com.nimbusds.jose.jwk.ECKey.Builder keyIDFromThumbprint(java.lang.String str) throws com.nimbusds.jose.JOSEException {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("crv", this.crv.toString());
            linkedHashMap.put("kty", com.nimbusds.jose.jwk.KeyType.EC.getValue());
            linkedHashMap.put("x", this.x.toString());
            linkedHashMap.put("y", this.y.toString());
            this.kid = com.nimbusds.jose.jwk.ThumbprintUtils.compute(str, (java.util.LinkedHashMap<java.lang.String, ?>) linkedHashMap).toString();
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder x509CertURL(java.net.URI uri) {
            this.x5u = uri;
            return this;
        }

        @java.lang.Deprecated
        public com.nimbusds.jose.jwk.ECKey.Builder x509CertThumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder x509CertChain(java.util.List<com.nimbusds.jose.util.Base64> list) {
            this.x5c = list;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder expirationTime(java.util.Date date) {
            this.exp = date;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder notBeforeTime(java.util.Date date) {
            this.nbf = date;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder issueTime(java.util.Date date) {
            this.iat = date;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey.Builder keyStore(java.security.KeyStore keyStore) {
            this.ks = keyStore;
            return this;
        }

        public com.nimbusds.jose.jwk.ECKey build() {
            try {
                if (this.d == null && this.priv == null) {
                    return new com.nimbusds.jose.jwk.ECKey(this.crv, this.x, this.y, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
                }
                if (this.priv != null) {
                    return new com.nimbusds.jose.jwk.ECKey(this.crv, this.x, this.y, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
                }
                return new com.nimbusds.jose.jwk.ECKey(this.crv, this.x, this.y, this.d, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        }
    }

    public static com.nimbusds.jose.util.Base64URL encodeCoordinate(int i, java.math.BigInteger bigInteger) {
        byte[] bytesUnsigned = com.nimbusds.jose.util.BigIntegerUtils.toBytesUnsigned(bigInteger);
        int i2 = (i + 7) / 8;
        if (bytesUnsigned.length >= i2) {
            return com.nimbusds.jose.util.Base64URL.encode(bytesUnsigned);
        }
        byte[] bArr = new byte[i2];
        java.lang.System.arraycopy(bytesUnsigned, 0, bArr, i2 - bytesUnsigned.length, bytesUnsigned.length);
        return com.nimbusds.jose.util.Base64URL.encode(bArr);
    }

    private static void ensurePublicCoordinatesOnCurve(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2) {
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new java.lang.IllegalArgumentException("Unknown / unsupported curve: ".concat(java.lang.String.valueOf(curve)));
        }
        if (com.nimbusds.jose.crypto.utils.ECChecks.isPointOnCurve(base64URL.decodeToBigInteger(), base64URL2.decodeToBigInteger(), curve.toECParameterSpec())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the ");
        sb.append(curve);
        sb.append(" curve");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @java.lang.Deprecated
    public ECKey(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, base64URL, base64URL2, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    @java.lang.Deprecated
    public ECKey(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, base64URL, base64URL2, base64URL3, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    @java.lang.Deprecated
    public ECKey(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, base64URL, base64URL2, privateKey, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    @java.lang.Deprecated
    public ECKey(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    @java.lang.Deprecated
    public ECKey(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    @java.lang.Deprecated
    public ECKey(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    public ECKey(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyStore);
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.x = base64URL;
        if (base64URL2 == null) {
            throw new java.lang.IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.d = null;
        this.privateKey = null;
    }

    public ECKey(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.EC, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, date, date2, date3, keyStore);
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.x = base64URL;
        if (base64URL2 == null) {
            throw new java.lang.IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        if (base64URL3 == null) {
            throw new java.lang.IllegalArgumentException("The 'd' coordinate must not be null");
        }
        this.d = base64URL3;
        this.privateKey = null;
    }

    public ECKey(com.nimbusds.jose.jwk.Curve curve, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyStore);
        if (curve == null) {
            throw new java.lang.IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.x = base64URL;
        if (base64URL2 == null) {
            throw new java.lang.IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.d = null;
        this.privateKey = privateKey;
    }

    public ECKey(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    public ECKey(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    public ECKey(com.nimbusds.jose.jwk.Curve curve, java.security.interfaces.ECPublicKey eCPublicKey, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public final com.nimbusds.jose.jwk.Curve getCurve() {
        return this.crv;
    }

    public final com.nimbusds.jose.util.Base64URL getX() {
        return this.x;
    }

    public final com.nimbusds.jose.util.Base64URL getY() {
        return this.y;
    }

    public final com.nimbusds.jose.util.Base64URL getD() {
        return this.d;
    }

    public final java.security.interfaces.ECPublicKey toECPublicKey() throws com.nimbusds.jose.JOSEException {
        return toECPublicKey(null);
    }

    public final java.security.interfaces.ECPublicKey toECPublicKey(java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.security.KeyFactory keyFactory;
        java.security.spec.ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't get EC parameter spec for curve ");
            sb.append(this.crv);
            throw new com.nimbusds.jose.JOSEException(sb.toString());
        }
        java.security.spec.ECPublicKeySpec eCPublicKeySpec = new java.security.spec.ECPublicKeySpec(new java.security.spec.ECPoint(this.x.decodeToBigInteger(), this.y.decodeToBigInteger()), eCParameterSpec);
        try {
            if (provider == null) {
                keyFactory = java.security.KeyFactory.getInstance("EC");
            } else {
                keyFactory = java.security.KeyFactory.getInstance("EC", provider);
            }
            return (java.security.interfaces.ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public final java.security.interfaces.ECPrivateKey toECPrivateKey() throws com.nimbusds.jose.JOSEException {
        return toECPrivateKey(null);
    }

    public final java.security.interfaces.ECPrivateKey toECPrivateKey(java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.security.KeyFactory keyFactory;
        if (this.d == null) {
            return null;
        }
        java.security.spec.ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't get EC parameter spec for curve ");
            sb.append(this.crv);
            throw new com.nimbusds.jose.JOSEException(sb.toString());
        }
        java.security.spec.ECPrivateKeySpec eCPrivateKeySpec = new java.security.spec.ECPrivateKeySpec(this.d.decodeToBigInteger(), eCParameterSpec);
        try {
            if (provider == null) {
                keyFactory = java.security.KeyFactory.getInstance("EC");
            } else {
                keyFactory = java.security.KeyFactory.getInstance("EC", provider);
            }
            return (java.security.interfaces.ECPrivateKey) keyFactory.generatePrivate(eCPrivateKeySpec);
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final java.security.PublicKey toPublicKey() throws com.nimbusds.jose.JOSEException {
        return toECPublicKey();
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final java.security.PrivateKey toPrivateKey() throws com.nimbusds.jose.JOSEException {
        java.security.interfaces.ECPrivateKey eCPrivateKey = toECPrivateKey();
        return eCPrivateKey != null ? eCPrivateKey : this.privateKey;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final java.security.KeyPair toKeyPair() throws com.nimbusds.jose.JOSEException {
        return toKeyPair(null);
    }

    public final java.security.KeyPair toKeyPair(java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        if (this.privateKey != null) {
            return new java.security.KeyPair(toECPublicKey(provider), this.privateKey);
        }
        return new java.security.KeyPair(toECPublicKey(provider), toECPrivateKey(provider));
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final boolean matches(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (getX().decodeToBigInteger().equals(eCPublicKey.getW().getAffineX())) {
                return getY().decodeToBigInteger().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    private void ensureMatches(java.util.List<java.security.cert.X509Certificate> list) {
        if (list != null && !matches(list.get(0))) {
            throw new java.lang.IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final java.util.LinkedHashMap<java.lang.String, ?> getRequiredParams() {
        java.util.LinkedHashMap<java.lang.String, ?> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("crv", this.crv.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("x", this.x.toString());
        linkedHashMap.put("y", this.y.toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean isPrivate() {
        return (this.d == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int size() {
        java.security.spec.ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't determine field size for curve ");
            sb.append(this.crv.getName());
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
        return eCParameterSpec.getCurve().getField().getFieldSize();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final com.nimbusds.jose.jwk.ECKey toPublicJWK() {
        return new com.nimbusds.jose.jwk.ECKey(getCurve(), getX(), getY(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getExpirationTime(), getNotBeforeTime(), getIssueTime(), getKeyStore());
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.x.toString());
        jSONObject.put("y", this.y.toString());
        com.nimbusds.jose.util.Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    public static com.nimbusds.jose.jwk.ECKey parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public static com.nimbusds.jose.jwk.ECKey parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (!com.nimbusds.jose.jwk.KeyType.EC.equals(com.nimbusds.jose.jwk.JWKMetadata.parseKeyType(map))) {
            throw new java.text.ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            com.nimbusds.jose.jwk.Curve parse = com.nimbusds.jose.jwk.Curve.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "crv"));
            com.nimbusds.jose.util.Base64URL base64URL = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "x");
            com.nimbusds.jose.util.Base64URL base64URL2 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "y");
            com.nimbusds.jose.util.Base64URL base64URL3 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "d");
            try {
                if (base64URL3 == null) {
                    return new com.nimbusds.jose.jwk.ECKey(parse, base64URL, base64URL2, com.nimbusds.jose.jwk.JWKMetadata.parseKeyUse(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyOperations(map), com.nimbusds.jose.jwk.JWKMetadata.parseAlgorithm(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyID(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertURL(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertThumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertSHA256Thumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertChain(map), com.nimbusds.jose.jwk.JWKMetadata.parseExpirationTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseNotBeforeTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseIssueTime(map), (java.security.KeyStore) null);
                }
                return new com.nimbusds.jose.jwk.ECKey(parse, base64URL, base64URL2, base64URL3, com.nimbusds.jose.jwk.JWKMetadata.parseKeyUse(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyOperations(map), com.nimbusds.jose.jwk.JWKMetadata.parseAlgorithm(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyID(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertURL(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertThumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertSHA256Thumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertChain(map), com.nimbusds.jose.jwk.JWKMetadata.parseExpirationTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseNotBeforeTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseIssueTime(map), (java.security.KeyStore) null);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.text.ParseException(e.getMessage(), 0);
            }
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.text.ParseException(e2.getMessage(), 0);
        }
    }

    public static com.nimbusds.jose.jwk.ECKey parse(java.security.cert.X509Certificate x509Certificate) throws com.nimbusds.jose.JOSEException {
        if (!(x509Certificate.getPublicKey() instanceof java.security.interfaces.ECPublicKey)) {
            throw new com.nimbusds.jose.JOSEException("The public key of the X.509 certificate is not EC");
        }
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) x509Certificate.getPublicKey();
        try {
            java.lang.String obj = new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate).getSubjectPublicKeyInfo().getAlgorithm().getParameters().toString();
            com.nimbusds.jose.jwk.Curve forOID = com.nimbusds.jose.jwk.Curve.forOID(obj);
            if (forOID == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't determine EC JWK curve for OID ");
                sb.append(obj);
                throw new com.nimbusds.jose.JOSEException(sb.toString());
            }
            return new com.nimbusds.jose.jwk.ECKey.Builder(forOID, eCPublicKey).keyUse(com.nimbusds.jose.jwk.KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(java.util.Collections.singletonList(com.nimbusds.jose.util.Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL.encode(java.security.MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()))).expirationTime(x509Certificate.getNotAfter()).notBeforeTime(x509Certificate.getNotBefore()).build();
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't encode x5t parameter: ");
            sb2.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e);
        } catch (java.security.cert.CertificateEncodingException e2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Couldn't encode x5c parameter: ");
            sb3.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb3.toString(), e2);
        }
    }

    public static com.nimbusds.jose.jwk.ECKey load(java.security.KeyStore keyStore, java.lang.String str, char[] cArr) throws java.security.KeyStoreException, com.nimbusds.jose.JOSEException {
        java.security.cert.Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof java.security.cert.X509Certificate)) {
            return null;
        }
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof java.security.interfaces.ECPublicKey)) {
            throw new com.nimbusds.jose.JOSEException("Couldn't load EC JWK: The key algorithm is not EC");
        }
        com.nimbusds.jose.jwk.ECKey build = new com.nimbusds.jose.jwk.ECKey.Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            java.security.Key key = keyStore.getKey(str, cArr);
            if (key instanceof java.security.interfaces.ECPrivateKey) {
                return new com.nimbusds.jose.jwk.ECKey.Builder(build).privateKey((java.security.interfaces.ECPrivateKey) key).build();
            }
            return ((key instanceof java.security.PrivateKey) && "EC".equalsIgnoreCase(key.getAlgorithm())) ? new com.nimbusds.jose.jwk.ECKey.Builder(build).privateKey((java.security.PrivateKey) key).build() : build;
        } catch (java.security.NoSuchAlgorithmException | java.security.UnrecoverableKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't retrieve private EC key (bad pin?): ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.nimbusds.jose.jwk.ECKey) || !super.equals(obj)) {
            return false;
        }
        com.nimbusds.jose.jwk.ECKey eCKey = (com.nimbusds.jose.jwk.ECKey) obj;
        return java.util.Objects.equals(this.crv, eCKey.crv) && java.util.Objects.equals(this.x, eCKey.x) && java.util.Objects.equals(this.y, eCKey.y) && java.util.Objects.equals(this.d, eCKey.d) && java.util.Objects.equals(this.privateKey, eCKey.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        int hashCode = super.hashCode();
        return java.util.Objects.hash(java.lang.Integer.valueOf(hashCode), this.crv, this.x, this.y, this.d, this.privateKey);
    }
}
