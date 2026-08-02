package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class JWKMatcher {
    private final java.util.Set<com.nimbusds.jose.Algorithm> algs;
    private final java.util.Set<com.nimbusds.jose.jwk.Curve> curves;
    private final boolean hasID;
    private final boolean hasUse;
    private final boolean hasX5C;
    private final java.util.Set<java.lang.String> ids;
    private final int maxSizeBits;
    private final int minSizeBits;
    private final java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
    private final boolean privateOnly;
    private final boolean publicOnly;
    private final java.util.Set<java.lang.Integer> sizesBits;
    private final java.util.Set<com.nimbusds.jose.jwk.KeyType> types;
    private final java.util.Set<com.nimbusds.jose.jwk.KeyUse> uses;
    private final java.util.Set<com.nimbusds.jose.util.Base64URL> x5tS256s;

    public static class Builder {
        private java.util.Set<com.nimbusds.jose.Algorithm> algs;
        private java.util.Set<com.nimbusds.jose.jwk.Curve> curves;
        private java.util.Set<java.lang.String> ids;
        private java.util.Set<com.nimbusds.jose.jwk.KeyOperation> ops;
        private java.util.Set<java.lang.Integer> sizesBits;
        private java.util.Set<com.nimbusds.jose.jwk.KeyType> types;
        private java.util.Set<com.nimbusds.jose.jwk.KeyUse> uses;
        private java.util.Set<com.nimbusds.jose.util.Base64URL> x5tS256s;
        private boolean hasUse = false;
        private boolean hasID = false;
        private boolean privateOnly = false;
        private boolean publicOnly = false;
        private int minSizeBits = 0;
        private int maxSizeBits = 0;
        private boolean hasX5C = false;

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyType(com.nimbusds.jose.jwk.KeyType keyType) {
            if (keyType == null) {
                this.types = null;
                return this;
            }
            this.types = new java.util.HashSet(java.util.Collections.singletonList(keyType));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyTypes(com.nimbusds.jose.jwk.KeyType... keyTypeArr) {
            keyTypes(new java.util.LinkedHashSet(java.util.Arrays.asList(keyTypeArr)));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyTypes(java.util.Set<com.nimbusds.jose.jwk.KeyType> set) {
            this.types = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyUse(com.nimbusds.jose.jwk.KeyUse keyUse) {
            if (keyUse == null) {
                this.uses = null;
                return this;
            }
            this.uses = new java.util.HashSet(java.util.Collections.singletonList(keyUse));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyUses(com.nimbusds.jose.jwk.KeyUse... keyUseArr) {
            keyUses(new java.util.LinkedHashSet(java.util.Arrays.asList(keyUseArr)));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyUses(java.util.Set<com.nimbusds.jose.jwk.KeyUse> set) {
            this.uses = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyOperation(com.nimbusds.jose.jwk.KeyOperation keyOperation) {
            if (keyOperation == null) {
                this.ops = null;
                return this;
            }
            this.ops = new java.util.HashSet(java.util.Collections.singletonList(keyOperation));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyOperations(com.nimbusds.jose.jwk.KeyOperation... keyOperationArr) {
            keyOperations(new java.util.LinkedHashSet(java.util.Arrays.asList(keyOperationArr)));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyOperations(java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder algorithm(com.nimbusds.jose.Algorithm algorithm) {
            if (algorithm == null) {
                this.algs = null;
                return this;
            }
            this.algs = new java.util.HashSet(java.util.Collections.singletonList(algorithm));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder algorithms(com.nimbusds.jose.Algorithm... algorithmArr) {
            algorithms(new java.util.LinkedHashSet(java.util.Arrays.asList(algorithmArr)));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder algorithms(java.util.Set<com.nimbusds.jose.Algorithm> set) {
            this.algs = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyID(java.lang.String str) {
            if (str == null) {
                this.ids = null;
                return this;
            }
            this.ids = new java.util.HashSet(java.util.Collections.singletonList(str));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyIDs(java.lang.String... strArr) {
            keyIDs(new java.util.LinkedHashSet(java.util.Arrays.asList(strArr)));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keyIDs(java.util.Set<java.lang.String> set) {
            this.ids = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder hasKeyUse(boolean z) {
            this.hasUse = z;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder hasKeyID(boolean z) {
            this.hasID = z;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder privateOnly(boolean z) {
            this.privateOnly = z;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder publicOnly(boolean z) {
            this.publicOnly = z;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder minKeySize(int i) {
            this.minSizeBits = i;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder maxKeySize(int i) {
            this.maxSizeBits = i;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keySize(int i) {
            if (i <= 0) {
                this.sizesBits = null;
                return this;
            }
            this.sizesBits = java.util.Collections.singleton(java.lang.Integer.valueOf(i));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keySizes(int... iArr) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i : iArr) {
                linkedHashSet.add(java.lang.Integer.valueOf(i));
            }
            keySizes(linkedHashSet);
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder keySizes(java.util.Set<java.lang.Integer> set) {
            this.sizesBits = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder curve(com.nimbusds.jose.jwk.Curve curve) {
            if (curve == null) {
                this.curves = null;
                return this;
            }
            this.curves = java.util.Collections.singleton(curve);
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder curves(com.nimbusds.jose.jwk.Curve... curveArr) {
            curves(new java.util.LinkedHashSet(java.util.Arrays.asList(curveArr)));
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder curves(java.util.Set<com.nimbusds.jose.jwk.Curve> set) {
            this.curves = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder x509CertSHA256Thumbprint(com.nimbusds.jose.util.Base64URL base64URL) {
            if (base64URL == null) {
                this.x5tS256s = null;
                return this;
            }
            this.x5tS256s = java.util.Collections.singleton(base64URL);
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder x509CertSHA256Thumbprints(com.nimbusds.jose.util.Base64URL... base64URLArr) {
            return x509CertSHA256Thumbprints(new java.util.LinkedHashSet(java.util.Arrays.asList(base64URLArr)));
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder x509CertSHA256Thumbprints(java.util.Set<com.nimbusds.jose.util.Base64URL> set) {
            this.x5tS256s = set;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher.Builder hasX509CertChain(boolean z) {
            this.hasX5C = z;
            return this;
        }

        public com.nimbusds.jose.jwk.JWKMatcher build() {
            return new com.nimbusds.jose.jwk.JWKMatcher(this.types, this.uses, this.ops, this.algs, this.ids, this.hasUse, this.hasID, this.privateOnly, this.publicOnly, this.minSizeBits, this.maxSizeBits, this.sizesBits, this.curves, this.x5tS256s, this.hasX5C);
        }
    }

    @java.lang.Deprecated
    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2) {
        this(set, set2, set3, set4, set5, z, z2, 0, 0);
    }

    @java.lang.Deprecated
    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2, int i, int i2) {
        this(set, set2, set3, set4, set5, z, z2, i, i2, null);
    }

    @java.lang.Deprecated
    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2, int i, int i2, java.util.Set<com.nimbusds.jose.jwk.Curve> set6) {
        this(set, set2, set3, set4, set5, z, z2, i, i2, null, set6);
    }

    @java.lang.Deprecated
    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2, int i, int i2, java.util.Set<java.lang.Integer> set6, java.util.Set<com.nimbusds.jose.jwk.Curve> set7) {
        this(set, set2, set3, set4, set5, false, false, z, z2, i, i2, set6, set7);
    }

    @java.lang.Deprecated
    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, java.util.Set<java.lang.Integer> set6, java.util.Set<com.nimbusds.jose.jwk.Curve> set7) {
        this(set, set2, set3, set4, set5, z, z2, z3, z4, i, i2, set6, set7, null);
    }

    @java.lang.Deprecated
    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, java.util.Set<java.lang.Integer> set6, java.util.Set<com.nimbusds.jose.jwk.Curve> set7, java.util.Set<com.nimbusds.jose.util.Base64URL> set8) {
        this(set, set2, set3, set4, set5, z, z2, z3, z4, i, i2, set6, set7, set8, false);
    }

    public JWKMatcher(java.util.Set<com.nimbusds.jose.jwk.KeyType> set, java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3, java.util.Set<com.nimbusds.jose.Algorithm> set4, java.util.Set<java.lang.String> set5, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, java.util.Set<java.lang.Integer> set6, java.util.Set<com.nimbusds.jose.jwk.Curve> set7, java.util.Set<com.nimbusds.jose.util.Base64URL> set8, boolean z5) {
        this.types = set;
        this.uses = set2;
        this.ops = set3;
        this.algs = set4;
        this.ids = set5;
        this.hasUse = z;
        this.hasID = z2;
        this.privateOnly = z3;
        this.publicOnly = z4;
        this.minSizeBits = i;
        this.maxSizeBits = i2;
        this.sizesBits = set6;
        this.curves = set7;
        this.x5tS256s = set8;
        this.hasX5C = z5;
    }

    public static com.nimbusds.jose.jwk.JWKMatcher forJWEHeader(com.nimbusds.jose.JWEHeader jWEHeader) {
        return new com.nimbusds.jose.jwk.JWKMatcher.Builder().keyType(com.nimbusds.jose.jwk.KeyType.forAlgorithm(jWEHeader.getAlgorithm())).keyID(jWEHeader.getKeyID()).keyUses(com.nimbusds.jose.jwk.KeyUse.ENCRYPTION, null).algorithms(jWEHeader.getAlgorithm(), null).build();
    }

    public static com.nimbusds.jose.jwk.JWKMatcher forJWSHeader(com.nimbusds.jose.JWSHeader jWSHeader) {
        com.nimbusds.jose.JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (com.nimbusds.jose.JWSAlgorithm.Family.RSA.contains(algorithm) || com.nimbusds.jose.JWSAlgorithm.Family.EC.contains(algorithm)) {
            return new com.nimbusds.jose.jwk.JWKMatcher.Builder().keyType(com.nimbusds.jose.jwk.KeyType.forAlgorithm(algorithm)).keyID(jWSHeader.getKeyID()).keyUses(com.nimbusds.jose.jwk.KeyUse.SIGNATURE, null).algorithms(algorithm, null).x509CertSHA256Thumbprint(jWSHeader.getX509CertSHA256Thumbprint()).build();
        }
        if (com.nimbusds.jose.JWSAlgorithm.Family.HMAC_SHA.contains(algorithm)) {
            return new com.nimbusds.jose.jwk.JWKMatcher.Builder().keyType(com.nimbusds.jose.jwk.KeyType.forAlgorithm(algorithm)).keyID(jWSHeader.getKeyID()).privateOnly(true).algorithms(algorithm, null).build();
        }
        if (com.nimbusds.jose.JWSAlgorithm.Family.ED.contains(algorithm)) {
            return new com.nimbusds.jose.jwk.JWKMatcher.Builder().keyType(com.nimbusds.jose.jwk.KeyType.forAlgorithm(algorithm)).keyID(jWSHeader.getKeyID()).keyUses(com.nimbusds.jose.jwk.KeyUse.SIGNATURE, null).algorithms(algorithm, null).curves(com.nimbusds.jose.jwk.Curve.forJWSAlgorithm(algorithm)).build();
        }
        return null;
    }

    public java.util.Set<com.nimbusds.jose.jwk.KeyType> getKeyTypes() {
        return this.types;
    }

    public java.util.Set<com.nimbusds.jose.jwk.KeyUse> getKeyUses() {
        return this.uses;
    }

    public java.util.Set<com.nimbusds.jose.jwk.KeyOperation> getKeyOperations() {
        return this.ops;
    }

    public java.util.Set<com.nimbusds.jose.Algorithm> getAlgorithms() {
        return this.algs;
    }

    public java.util.Set<java.lang.String> getKeyIDs() {
        return this.ids;
    }

    public boolean hasKeyUse() {
        return this.hasUse;
    }

    public boolean hasKeyID() {
        return this.hasID;
    }

    public boolean isPrivateOnly() {
        return this.privateOnly;
    }

    public boolean isPublicOnly() {
        return this.publicOnly;
    }

    @java.lang.Deprecated
    public int getMinSize() {
        return getMinKeySize();
    }

    public int getMinKeySize() {
        return this.minSizeBits;
    }

    @java.lang.Deprecated
    public int getMaxSize() {
        return getMaxKeySize();
    }

    public int getMaxKeySize() {
        return this.maxSizeBits;
    }

    public java.util.Set<java.lang.Integer> getKeySizes() {
        return this.sizesBits;
    }

    public java.util.Set<com.nimbusds.jose.jwk.Curve> getCurves() {
        return this.curves;
    }

    public java.util.Set<com.nimbusds.jose.util.Base64URL> getX509CertSHA256Thumbprints() {
        return this.x5tS256s;
    }

    public boolean hasX509CertChain() {
        return this.hasX5C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean matches(com.nimbusds.jose.jwk.JWK jwk) {
        boolean z;
        if (this.hasUse && jwk.getKeyUse() == null) {
            return false;
        }
        if (this.hasID && (jwk.getKeyID() == null || jwk.getKeyID().trim().isEmpty())) {
            return false;
        }
        if (this.privateOnly && !jwk.isPrivate()) {
            return false;
        }
        if (this.publicOnly && jwk.isPrivate()) {
            return false;
        }
        java.util.Set<com.nimbusds.jose.jwk.KeyType> set = this.types;
        if (set != null && !set.contains(jwk.getKeyType())) {
            return false;
        }
        java.util.Set<com.nimbusds.jose.jwk.KeyUse> set2 = this.uses;
        if (set2 != null && !set2.contains(jwk.getKeyUse())) {
            return false;
        }
        java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set3 = this.ops;
        if (set3 != null && ((!set3.contains(null) || jwk.getKeyOperations() != null) && (jwk.getKeyOperations() == null || !this.ops.containsAll(jwk.getKeyOperations())))) {
            return false;
        }
        java.util.Set<com.nimbusds.jose.Algorithm> set4 = this.algs;
        if (set4 != null && !set4.contains(jwk.getAlgorithm())) {
            return false;
        }
        java.util.Set<java.lang.String> set5 = this.ids;
        if (set5 != null && !set5.contains(jwk.getKeyID())) {
            return false;
        }
        if (this.minSizeBits > 0 && jwk.size() < this.minSizeBits) {
            return false;
        }
        if (this.maxSizeBits > 0 && jwk.size() > this.maxSizeBits) {
            return false;
        }
        java.util.Set<java.lang.Integer> set6 = this.sizesBits;
        if (set6 != null && !set6.contains(java.lang.Integer.valueOf(jwk.size()))) {
            return false;
        }
        java.util.Set<com.nimbusds.jose.jwk.Curve> set7 = this.curves;
        if (set7 != null && (!(jwk instanceof com.nimbusds.jose.jwk.CurveBasedJWK) || !set7.contains(((com.nimbusds.jose.jwk.CurveBasedJWK) jwk).getCurve()))) {
            return false;
        }
        if (this.x5tS256s != null) {
            if (jwk.getX509CertChain() != null && !jwk.getX509CertChain().isEmpty()) {
                try {
                    z = this.x5tS256s.contains(com.nimbusds.jose.util.X509CertUtils.computeSHA256Thumbprint(com.nimbusds.jose.util.X509CertUtils.parseWithException(jwk.getX509CertChain().get(0).decode())));
                } catch (java.security.cert.CertificateException unused) {
                }
                boolean contains = this.x5tS256s.contains(jwk.getX509CertSHA256Thumbprint());
                if (!z && !contains) {
                    return false;
                }
            }
            z = false;
            boolean contains2 = this.x5tS256s.contains(jwk.getX509CertSHA256Thumbprint());
            if (!z) {
                return false;
            }
        }
        if (this.hasX5C) {
            return (jwk.getX509CertChain() == null || jwk.getX509CertChain().isEmpty()) ? false : true;
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        append(sb, "kty", this.types);
        append(sb, "use", this.uses);
        append(sb, "key_ops", this.ops);
        append(sb, "alg", this.algs);
        append(sb, "kid", this.ids);
        if (this.hasUse) {
            sb.append("has_use=true ");
        }
        if (this.hasID) {
            sb.append("has_id=true ");
        }
        if (this.privateOnly) {
            sb.append("private_only=true ");
        }
        if (this.publicOnly) {
            sb.append("public_only=true ");
        }
        if (this.minSizeBits > 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("min_size=");
            sb2.append(this.minSizeBits);
            sb2.append(" ");
            sb.append(sb2.toString());
        }
        if (this.maxSizeBits > 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("max_size=");
            sb3.append(this.maxSizeBits);
            sb3.append(" ");
            sb.append(sb3.toString());
        }
        append(sb, io.ktor.http.ContentDisposition.Parameters.Size, this.sizesBits);
        append(sb, "crv", this.curves);
        append(sb, "x5t#S256", this.x5tS256s);
        if (this.hasX5C) {
            sb.append("has_x5c=true");
        }
        return sb.toString().trim();
    }

    private static void append(java.lang.StringBuilder sb, java.lang.String str, java.util.Set<?> set) {
        if (set != null) {
            sb.append(str);
            sb.append('=');
            if (set.size() == 1) {
                java.lang.Object next = set.iterator().next();
                if (next == null) {
                    sb.append("ANY");
                } else {
                    sb.append(next.toString().trim());
                }
            } else {
                sb.append(set.toString().trim());
            }
            sb.append(' ');
        }
    }
}
