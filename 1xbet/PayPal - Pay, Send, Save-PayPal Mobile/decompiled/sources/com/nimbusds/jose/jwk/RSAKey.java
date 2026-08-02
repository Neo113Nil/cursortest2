package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class RSAKey extends com.nimbusds.jose.jwk.JWK implements com.nimbusds.jose.jwk.AsymmetricJWK {
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.util.Base64URL d;
    private final com.nimbusds.jose.util.Base64URL dp;
    private final com.nimbusds.jose.util.Base64URL dq;
    private final com.nimbusds.jose.util.Base64URL e;
    private final com.nimbusds.jose.util.Base64URL n;
    private final java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> oth;
    private final com.nimbusds.jose.util.Base64URL p;
    private final java.security.PrivateKey privateKey;
    private final com.nimbusds.jose.util.Base64URL q;
    private final com.nimbusds.jose.util.Base64URL qi;

    @net.jcip.annotations.Immutable
    public static class OtherPrimesInfo implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        private final com.nimbusds.jose.util.Base64URL d;
        private final com.nimbusds.jose.util.Base64URL r;
        private final com.nimbusds.jose.util.Base64URL t;

        public OtherPrimesInfo(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3) {
            if (base64URL == null) {
                throw new java.lang.IllegalArgumentException("The prime factor must not be null");
            }
            this.r = base64URL;
            if (base64URL2 == null) {
                throw new java.lang.IllegalArgumentException("The factor CRT exponent must not be null");
            }
            this.d = base64URL2;
            if (base64URL3 == null) {
                throw new java.lang.IllegalArgumentException("The factor CRT coefficient must not be null");
            }
            this.t = base64URL3;
        }

        public OtherPrimesInfo(java.security.spec.RSAOtherPrimeInfo rSAOtherPrimeInfo) {
            this.r = com.nimbusds.jose.util.Base64URL.encode(rSAOtherPrimeInfo.getPrime());
            this.d = com.nimbusds.jose.util.Base64URL.encode(rSAOtherPrimeInfo.getExponent());
            this.t = com.nimbusds.jose.util.Base64URL.encode(rSAOtherPrimeInfo.getCrtCoefficient());
        }

        public com.nimbusds.jose.util.Base64URL getPrimeFactor() {
            return this.r;
        }

        public com.nimbusds.jose.util.Base64URL getFactorCRTExponent() {
            return this.d;
        }

        public com.nimbusds.jose.util.Base64URL getFactorCRTCoefficient() {
            return this.t;
        }

        public static java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> toList(java.security.spec.RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (rSAOtherPrimeInfoArr != null) {
                for (java.security.spec.RSAOtherPrimeInfo rSAOtherPrimeInfo : rSAOtherPrimeInfoArr) {
                    arrayList.add(new com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo(rSAOtherPrimeInfo));
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes10.dex */
    public static class Builder {
        private com.nimbusds.jose.Algorithm alg;
        private com.nimbusds.jose.util.Base64URL d;
        private com.nimbusds.jose.util.Base64URL dp;
        private com.nimbusds.jose.util.Base64URL dq;
        private final com.nimbusds.jose.util.Base64URL e;
        private java.util.Date exp;
        private java.util.Date iat;
        private java.lang.String kid;
        private java.security.KeyStore ks;
        private final com.nimbusds.jose.util.Base64URL n;
        private java.util.Date nbf;
        private java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
        private java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> oth;
        private com.nimbusds.jose.util.Base64URL p;
        private java.security.PrivateKey priv;
        private com.nimbusds.jose.util.Base64URL q;
        private com.nimbusds.jose.util.Base64URL qi;
        private com.nimbusds.jose.jwk.KeyUse use;
        private java.util.List<com.nimbusds.jose.util.Base64> x5c;

        @java.lang.Deprecated
        private com.nimbusds.jose.util.Base64URL x5t;
        private com.nimbusds.jose.util.Base64URL x5t256;
        private java.net.URI x5u;

        public Builder(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2) {
            if (base64URL == null) {
                throw new java.lang.IllegalArgumentException("The modulus value must not be null");
            }
            this.n = base64URL;
            if (base64URL2 == null) {
                throw new java.lang.IllegalArgumentException("The public exponent value must not be null");
            }
            this.e = base64URL2;
        }

        public Builder(java.security.interfaces.RSAPublicKey rSAPublicKey) {
            this.n = com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getModulus());
            this.e = com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getPublicExponent());
        }

        public Builder(com.nimbusds.jose.jwk.RSAKey rSAKey) {
            this.n = rSAKey.n;
            this.e = rSAKey.e;
            this.d = rSAKey.d;
            this.p = rSAKey.p;
            this.q = rSAKey.q;
            this.dp = rSAKey.dp;
            this.dq = rSAKey.dq;
            this.qi = rSAKey.qi;
            this.oth = rSAKey.oth;
            this.priv = rSAKey.privateKey;
            this.use = rSAKey.getKeyUse();
            this.ops = rSAKey.getKeyOperations();
            this.alg = rSAKey.getAlgorithm();
            this.kid = rSAKey.getKeyID();
            this.x5u = rSAKey.getX509CertURL();
            this.x5t = rSAKey.getX509CertThumbprint();
            this.x5t256 = rSAKey.getX509CertSHA256Thumbprint();
            this.x5c = rSAKey.getX509CertChain();
            this.exp = rSAKey.getExpirationTime();
            this.nbf = rSAKey.getNotBeforeTime();
            this.iat = rSAKey.getIssueTime();
            this.ks = rSAKey.getKeyStore();
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder privateExponent(com.nimbusds.jose.util.Base64URL base64URL) {
            this.d = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder privateKey(java.security.interfaces.RSAPrivateKey rSAPrivateKey) {
            if (rSAPrivateKey instanceof java.security.interfaces.RSAPrivateCrtKey) {
                return privateKey((java.security.interfaces.RSAPrivateCrtKey) rSAPrivateKey);
            }
            if (rSAPrivateKey instanceof java.security.interfaces.RSAMultiPrimePrivateCrtKey) {
                return privateKey((java.security.interfaces.RSAMultiPrimePrivateCrtKey) rSAPrivateKey);
            }
            this.d = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateKey.getPrivateExponent());
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder privateKey(java.security.PrivateKey privateKey) {
            if (privateKey instanceof java.security.interfaces.RSAPrivateKey) {
                return privateKey((java.security.interfaces.RSAPrivateKey) privateKey);
            }
            if (!"RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
                throw new java.lang.IllegalArgumentException("The private key algorithm must be RSA");
            }
            this.priv = privateKey;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder firstPrimeFactor(com.nimbusds.jose.util.Base64URL base64URL) {
            this.p = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder secondPrimeFactor(com.nimbusds.jose.util.Base64URL base64URL) {
            this.q = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder firstFactorCRTExponent(com.nimbusds.jose.util.Base64URL base64URL) {
            this.dp = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder secondFactorCRTExponent(com.nimbusds.jose.util.Base64URL base64URL) {
            this.dq = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder firstCRTCoefficient(com.nimbusds.jose.util.Base64URL base64URL) {
            this.qi = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder otherPrimes(java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list) {
            this.oth = list;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder privateKey(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey) {
            this.d = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent());
            this.p = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeP());
            this.q = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeQ());
            this.dp = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP());
            this.dq = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ());
            this.qi = com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient());
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder privateKey(java.security.interfaces.RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey) {
            this.d = com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent());
            this.p = com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP());
            this.q = com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ());
            this.dp = com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP());
            this.dq = com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ());
            this.qi = com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient());
            this.oth = com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo());
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder keyUse(com.nimbusds.jose.jwk.KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder keyOperations(java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder algorithm(com.nimbusds.jose.Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder keyID(java.lang.String str) {
            this.kid = str;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder keyIDFromThumbprint() throws com.nimbusds.jose.JOSEException {
            return keyIDFromThumbprint("SHA-256");
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder keyIDFromThumbprint(java.lang.String str) throws com.nimbusds.jose.JOSEException {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("e", this.e.toString());
            linkedHashMap.put("kty", com.nimbusds.jose.jwk.KeyType.RSA.getValue());
            linkedHashMap.put("n", this.n.toString());
            this.kid = com.nimbusds.jose.jwk.ThumbprintUtils.compute(str, (java.util.LinkedHashMap<java.lang.String, ?>) linkedHashMap).toString();
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder x509CertURL(java.net.URI uri) {
            this.x5u = uri;
            return this;
        }

        @java.lang.Deprecated
        public com.nimbusds.jose.jwk.RSAKey.Builder x509CertThumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder x509CertChain(java.util.List<com.nimbusds.jose.util.Base64> list) {
            this.x5c = list;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder expirationTime(java.util.Date date) {
            this.exp = date;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder notBeforeTime(java.util.Date date) {
            this.nbf = date;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder issueTime(java.util.Date date) {
            this.iat = date;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey.Builder keyStore(java.security.KeyStore keyStore) {
            this.ks = keyStore;
            return this;
        }

        public com.nimbusds.jose.jwk.RSAKey build() {
            try {
                return new com.nimbusds.jose.jwk.RSAKey(this.n, this.e, this.d, this.p, this.q, this.dp, this.dq, this.qi, this.oth, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.ks);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        }
    }

    @java.lang.Deprecated
    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, null, null, null, keyStore);
    }

    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyStore);
    }

    @java.lang.Deprecated
    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, null, null, null, keyStore);
    }

    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, date, date2, date3, keyStore);
        if (base64URL3 == null) {
            throw new java.lang.IllegalArgumentException("The private exponent must not be null");
        }
    }

    @java.lang.Deprecated
    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, com.nimbusds.jose.util.Base64URL base64URL6, com.nimbusds.jose.util.Base64URL base64URL7, java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL8, com.nimbusds.jose.util.Base64URL base64URL9, java.util.List<com.nimbusds.jose.util.Base64> list2, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, null, null, null, keyStore);
    }

    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, com.nimbusds.jose.util.Base64URL base64URL6, com.nimbusds.jose.util.Base64URL base64URL7, java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL8, com.nimbusds.jose.util.Base64URL base64URL9, java.util.List<com.nimbusds.jose.util.Base64> list2, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, date, date2, date3, keyStore);
        if (base64URL3 == null) {
            throw new java.lang.IllegalArgumentException("The first prime factor must not be null");
        }
        if (base64URL4 == null) {
            throw new java.lang.IllegalArgumentException("The second prime factor must not be null");
        }
        if (base64URL5 == null) {
            throw new java.lang.IllegalArgumentException("The first factor CRT exponent must not be null");
        }
        if (base64URL6 == null) {
            throw new java.lang.IllegalArgumentException("The second factor CRT exponent must not be null");
        }
        if (base64URL7 == null) {
            throw new java.lang.IllegalArgumentException("The first CRT coefficient must not be null");
        }
    }

    @java.lang.Deprecated
    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, com.nimbusds.jose.util.Base64URL base64URL6, com.nimbusds.jose.util.Base64URL base64URL7, com.nimbusds.jose.util.Base64URL base64URL8, java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL9, com.nimbusds.jose.util.Base64URL base64URL10, java.util.List<com.nimbusds.jose.util.Base64> list2) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, null, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null);
    }

    @java.lang.Deprecated
    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, com.nimbusds.jose.util.Base64URL base64URL6, com.nimbusds.jose.util.Base64URL base64URL7, com.nimbusds.jose.util.Base64URL base64URL8, java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL9, com.nimbusds.jose.util.Base64URL base64URL10, java.util.List<com.nimbusds.jose.util.Base64> list2, java.security.KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, privateKey, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null, null, null, keyStore);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RSAKey(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5, com.nimbusds.jose.util.Base64URL base64URL6, com.nimbusds.jose.util.Base64URL base64URL7, com.nimbusds.jose.util.Base64URL base64URL8, java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL9, com.nimbusds.jose.util.Base64URL base64URL10, java.util.List<com.nimbusds.jose.util.Base64> list2, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        super(com.nimbusds.jose.jwk.KeyType.RSA, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, date, date2, date3, keyStore);
        com.nimbusds.jose.util.Base64URL base64URL11;
        com.nimbusds.jose.util.Base64URL base64URL12;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The modulus value must not be null");
        }
        this.n = base64URL;
        if (base64URL2 == null) {
            throw new java.lang.IllegalArgumentException("The public exponent value must not be null");
        }
        this.e = base64URL2;
        if (getParsedX509CertChain() != null && !matches(getParsedX509CertChain().get(0))) {
            throw new java.lang.IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
        this.d = base64URL3;
        if (base64URL4 == null || base64URL5 == null) {
            base64URL11 = base64URL7;
        } else {
            base64URL11 = base64URL7;
            if (base64URL6 != null) {
                base64URL12 = base64URL8;
                if (base64URL11 != null && base64URL12 != null) {
                    this.p = base64URL4;
                    this.q = base64URL5;
                    this.dp = base64URL6;
                    this.dq = base64URL11;
                    this.qi = base64URL12;
                    if (list != null) {
                        this.oth = java.util.Collections.unmodifiableList(list);
                        this.privateKey = privateKey;
                        return;
                    }
                    this.oth = java.util.Collections.emptyList();
                    this.privateKey = privateKey;
                    return;
                }
                if (base64URL4 != null && base64URL5 == null && base64URL6 == null && base64URL11 == null && base64URL12 == null && list == null) {
                    this.p = null;
                    this.q = null;
                    this.dp = null;
                    this.dq = null;
                    this.qi = null;
                } else {
                    if (base64URL4 == null || base64URL5 != null || base64URL6 != null || base64URL11 != null || base64URL12 != null) {
                        if (base64URL4 != null) {
                            throw new java.lang.IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                        }
                        if (base64URL5 == null) {
                            throw new java.lang.IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                        }
                        if (base64URL6 == null) {
                            throw new java.lang.IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                        }
                        if (base64URL11 == null) {
                            throw new java.lang.IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                        }
                        throw new java.lang.IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                    }
                    this.p = null;
                    this.q = null;
                    this.dp = null;
                    this.dq = null;
                    this.qi = null;
                }
                this.oth = java.util.Collections.emptyList();
                this.privateKey = privateKey;
                return;
            }
        }
        base64URL12 = base64URL8;
        if (base64URL4 != null) {
        }
        if (base64URL4 == null) {
        }
        if (base64URL4 != null) {
        }
    }

    @java.lang.Deprecated
    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(rSAPublicKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, null, null, null, keyStore);
    }

    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getModulus()), com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getPublicExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    @java.lang.Deprecated
    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.interfaces.RSAPrivateKey rSAPrivateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(rSAPublicKey, rSAPrivateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.interfaces.RSAPrivateKey rSAPrivateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getModulus()), com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getPublicExponent()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateKey.getPrivateExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    @java.lang.Deprecated
    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(rSAPublicKey, rSAPrivateCrtKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getModulus()), com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getPublicExponent()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeP()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeQ()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ()), com.nimbusds.jose.util.Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient()), null, null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    @java.lang.Deprecated
    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.interfaces.RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(rSAPublicKey, rSAMultiPrimePrivateCrtKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.interfaces.RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getModulus()), com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getPublicExponent()), com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent()), com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP()), com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ()), com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP()), com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ()), com.nimbusds.jose.util.Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient()), com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo()), null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    @java.lang.Deprecated
    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.security.KeyStore keyStore) {
        this(rSAPublicKey, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (java.util.Date) null, (java.util.Date) null, (java.util.Date) null, keyStore);
    }

    public RSAKey(java.security.interfaces.RSAPublicKey rSAPublicKey, java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set, com.nimbusds.jose.Algorithm algorithm, java.lang.String str, java.net.URI uri, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, java.util.List<com.nimbusds.jose.util.Base64> list, java.util.Date date, java.util.Date date2, java.util.Date date3, java.security.KeyStore keyStore) {
        this(com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getModulus()), com.nimbusds.jose.util.Base64URL.encode(rSAPublicKey.getPublicExponent()), null, null, null, null, null, null, null, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    public final com.nimbusds.jose.util.Base64URL getModulus() {
        return this.n;
    }

    public final com.nimbusds.jose.util.Base64URL getPublicExponent() {
        return this.e;
    }

    public final com.nimbusds.jose.util.Base64URL getPrivateExponent() {
        return this.d;
    }

    public final com.nimbusds.jose.util.Base64URL getFirstPrimeFactor() {
        return this.p;
    }

    public final com.nimbusds.jose.util.Base64URL getSecondPrimeFactor() {
        return this.q;
    }

    public final com.nimbusds.jose.util.Base64URL getFirstFactorCRTExponent() {
        return this.dp;
    }

    public final com.nimbusds.jose.util.Base64URL getSecondFactorCRTExponent() {
        return this.dq;
    }

    public final com.nimbusds.jose.util.Base64URL getFirstCRTCoefficient() {
        return this.qi;
    }

    public final java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> getOtherPrimes() {
        return this.oth;
    }

    public final java.security.interfaces.RSAPublicKey toRSAPublicKey() throws com.nimbusds.jose.JOSEException {
        try {
            return (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(this.n.decodeToBigInteger(), this.e.decodeToBigInteger()));
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public final java.security.interfaces.RSAPrivateKey toRSAPrivateKey() throws com.nimbusds.jose.JOSEException {
        java.security.spec.KeySpec rSAPrivateCrtKeySpec;
        if (this.d == null) {
            return null;
        }
        java.math.BigInteger decodeToBigInteger = this.n.decodeToBigInteger();
        java.math.BigInteger decodeToBigInteger2 = this.d.decodeToBigInteger();
        if (this.p == null) {
            rSAPrivateCrtKeySpec = new java.security.spec.RSAPrivateKeySpec(decodeToBigInteger, decodeToBigInteger2);
        } else {
            java.math.BigInteger decodeToBigInteger3 = this.e.decodeToBigInteger();
            java.math.BigInteger decodeToBigInteger4 = this.p.decodeToBigInteger();
            java.math.BigInteger decodeToBigInteger5 = this.q.decodeToBigInteger();
            java.math.BigInteger decodeToBigInteger6 = this.dp.decodeToBigInteger();
            java.math.BigInteger decodeToBigInteger7 = this.dq.decodeToBigInteger();
            java.math.BigInteger decodeToBigInteger8 = this.qi.decodeToBigInteger();
            java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list = this.oth;
            if (list != null && !list.isEmpty()) {
                java.security.spec.RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr = new java.security.spec.RSAOtherPrimeInfo[this.oth.size()];
                for (int i = 0; i < this.oth.size(); i++) {
                    com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo otherPrimesInfo = this.oth.get(i);
                    rSAOtherPrimeInfoArr[i] = new java.security.spec.RSAOtherPrimeInfo(otherPrimesInfo.getPrimeFactor().decodeToBigInteger(), otherPrimesInfo.getFactorCRTExponent().decodeToBigInteger(), otherPrimesInfo.getFactorCRTCoefficient().decodeToBigInteger());
                }
                rSAPrivateCrtKeySpec = new java.security.spec.RSAMultiPrimePrivateCrtKeySpec(decodeToBigInteger, decodeToBigInteger3, decodeToBigInteger2, decodeToBigInteger4, decodeToBigInteger5, decodeToBigInteger6, decodeToBigInteger7, decodeToBigInteger8, rSAOtherPrimeInfoArr);
            } else {
                rSAPrivateCrtKeySpec = new java.security.spec.RSAPrivateCrtKeySpec(decodeToBigInteger, decodeToBigInteger3, decodeToBigInteger2, decodeToBigInteger4, decodeToBigInteger5, decodeToBigInteger6, decodeToBigInteger7, decodeToBigInteger8);
            }
        }
        try {
            return (java.security.interfaces.RSAPrivateKey) java.security.KeyFactory.getInstance("RSA").generatePrivate(rSAPrivateCrtKeySpec);
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final java.security.PublicKey toPublicKey() throws com.nimbusds.jose.JOSEException {
        return toRSAPublicKey();
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final java.security.PrivateKey toPrivateKey() throws com.nimbusds.jose.JOSEException {
        java.security.interfaces.RSAPrivateKey rSAPrivateKey = toRSAPrivateKey();
        return rSAPrivateKey != null ? rSAPrivateKey : this.privateKey;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final java.security.KeyPair toKeyPair() throws com.nimbusds.jose.JOSEException {
        return new java.security.KeyPair(toRSAPublicKey(), toPrivateKey());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final boolean matches(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (this.e.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                return this.n.decodeToBigInteger().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final java.util.LinkedHashMap<java.lang.String, ?> getRequiredParams() {
        java.util.LinkedHashMap<java.lang.String, ?> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("e", this.e.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("n", this.n.toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean isPrivate() {
        return (this.d == null && this.p == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int size() {
        try {
            return com.nimbusds.jose.util.ByteUtils.safeBitLength(this.n.decode());
        } catch (com.nimbusds.jose.util.IntegerOverflowException e) {
            throw new java.lang.ArithmeticException(e.getMessage());
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final com.nimbusds.jose.jwk.RSAKey toPublicJWK() {
        return new com.nimbusds.jose.jwk.RSAKey(getModulus(), getPublicExponent(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getExpirationTime(), getNotBeforeTime(), getIssueTime(), getKeyStore());
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = super.toJSONObject();
        jSONObject.put("n", this.n.toString());
        jSONObject.put("e", this.e.toString());
        com.nimbusds.jose.util.Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL2 = this.p;
        if (base64URL2 != null) {
            jSONObject.put("p", base64URL2.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL3 = this.q;
        if (base64URL3 != null) {
            jSONObject.put("q", base64URL3.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL4 = this.dp;
        if (base64URL4 != null) {
            jSONObject.put("dp", base64URL4.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL5 = this.dq;
        if (base64URL5 != null) {
            jSONObject.put("dq", base64URL5.toString());
        }
        com.nimbusds.jose.util.Base64URL base64URL6 = this.qi;
        if (base64URL6 != null) {
            jSONObject.put("qi", base64URL6.toString());
        }
        java.util.List<com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
            for (com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo otherPrimesInfo : this.oth) {
                java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
                newJSONObject.put("r", otherPrimesInfo.r.toString());
                newJSONObject.put("d", otherPrimesInfo.d.toString());
                newJSONObject.put("t", otherPrimesInfo.t.toString());
                newJSONArray.add(newJSONObject);
            }
            jSONObject.put("oth", newJSONArray);
        }
        return jSONObject;
    }

    public static com.nimbusds.jose.jwk.RSAKey parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public static com.nimbusds.jose.jwk.RSAKey parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        java.util.ArrayList arrayList;
        java.util.List<java.lang.Object> jSONArray;
        if (!com.nimbusds.jose.jwk.KeyType.RSA.equals(com.nimbusds.jose.jwk.JWKMetadata.parseKeyType(map))) {
            throw new java.text.ParseException("The key type \"kty\" must be RSA", 0);
        }
        com.nimbusds.jose.util.Base64URL base64URL = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "n");
        com.nimbusds.jose.util.Base64URL base64URL2 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "e");
        com.nimbusds.jose.util.Base64URL base64URL3 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "d");
        com.nimbusds.jose.util.Base64URL base64URL4 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "p");
        com.nimbusds.jose.util.Base64URL base64URL5 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "q");
        com.nimbusds.jose.util.Base64URL base64URL6 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "dp");
        com.nimbusds.jose.util.Base64URL base64URL7 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "dq");
        com.nimbusds.jose.util.Base64URL base64URL8 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "qi");
        if (!map.containsKey("oth") || (jSONArray = com.nimbusds.jose.util.JSONObjectUtils.getJSONArray(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(jSONArray.size());
            for (java.lang.Object obj : jSONArray) {
                if (obj instanceof java.util.Map) {
                    java.util.Map map2 = (java.util.Map) obj;
                    try {
                        arrayList.add(new com.nimbusds.jose.jwk.RSAKey.OtherPrimesInfo(com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map2, "r"), com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map2, "dq"), com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map2, "t")));
                    } catch (java.lang.IllegalArgumentException e) {
                        throw new java.text.ParseException(e.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new com.nimbusds.jose.jwk.RSAKey(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, arrayList, null, com.nimbusds.jose.jwk.JWKMetadata.parseKeyUse(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyOperations(map), com.nimbusds.jose.jwk.JWKMetadata.parseAlgorithm(map), com.nimbusds.jose.jwk.JWKMetadata.parseKeyID(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertURL(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertThumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertSHA256Thumbprint(map), com.nimbusds.jose.jwk.JWKMetadata.parseX509CertChain(map), com.nimbusds.jose.jwk.JWKMetadata.parseExpirationTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseNotBeforeTime(map), com.nimbusds.jose.jwk.JWKMetadata.parseIssueTime(map), null);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.text.ParseException(e2.getMessage(), 0);
        }
    }

    public static com.nimbusds.jose.jwk.RSAKey parse(java.security.cert.X509Certificate x509Certificate) throws com.nimbusds.jose.JOSEException {
        if (!(x509Certificate.getPublicKey() instanceof java.security.interfaces.RSAPublicKey)) {
            throw new com.nimbusds.jose.JOSEException("The public key of the X.509 certificate is not RSA");
        }
        try {
            return new com.nimbusds.jose.jwk.RSAKey.Builder((java.security.interfaces.RSAPublicKey) x509Certificate.getPublicKey()).keyUse(com.nimbusds.jose.jwk.KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(java.util.Collections.singletonList(com.nimbusds.jose.util.Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL.encode(java.security.MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()))).expirationTime(x509Certificate.getNotAfter()).notBeforeTime(x509Certificate.getNotBefore()).build();
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't encode x5t parameter: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        } catch (java.security.cert.CertificateEncodingException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't encode x5c parameter: ");
            sb2.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e2);
        }
    }

    public static com.nimbusds.jose.jwk.RSAKey load(java.security.KeyStore keyStore, java.lang.String str, char[] cArr) throws java.security.KeyStoreException, com.nimbusds.jose.JOSEException {
        java.security.cert.Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof java.security.cert.X509Certificate)) {
            return null;
        }
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof java.security.interfaces.RSAPublicKey)) {
            throw new com.nimbusds.jose.JOSEException("Couldn't load RSA JWK: The key algorithm is not RSA");
        }
        com.nimbusds.jose.jwk.RSAKey build = new com.nimbusds.jose.jwk.RSAKey.Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            java.security.Key key = keyStore.getKey(str, cArr);
            if (key instanceof java.security.interfaces.RSAPrivateKey) {
                return new com.nimbusds.jose.jwk.RSAKey.Builder(build).privateKey((java.security.interfaces.RSAPrivateKey) key).build();
            }
            return ((key instanceof java.security.PrivateKey) && "RSA".equalsIgnoreCase(key.getAlgorithm())) ? new com.nimbusds.jose.jwk.RSAKey.Builder(build).privateKey((java.security.PrivateKey) key).build() : build;
        } catch (java.security.NoSuchAlgorithmException | java.security.UnrecoverableKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't retrieve private RSA key (bad pin?): ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.nimbusds.jose.jwk.RSAKey) || !super.equals(obj)) {
            return false;
        }
        com.nimbusds.jose.jwk.RSAKey rSAKey = (com.nimbusds.jose.jwk.RSAKey) obj;
        return java.util.Objects.equals(this.n, rSAKey.n) && java.util.Objects.equals(this.e, rSAKey.e) && java.util.Objects.equals(this.d, rSAKey.d) && java.util.Objects.equals(this.p, rSAKey.p) && java.util.Objects.equals(this.q, rSAKey.q) && java.util.Objects.equals(this.dp, rSAKey.dp) && java.util.Objects.equals(this.dq, rSAKey.dq) && java.util.Objects.equals(this.qi, rSAKey.qi) && java.util.Objects.equals(this.oth, rSAKey.oth) && java.util.Objects.equals(this.privateKey, rSAKey.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        int hashCode = super.hashCode();
        return java.util.Objects.hash(java.lang.Integer.valueOf(hashCode), this.n, this.e, this.d, this.p, this.q, this.dp, this.dq, this.qi, this.oth, this.privateKey);
    }
}
