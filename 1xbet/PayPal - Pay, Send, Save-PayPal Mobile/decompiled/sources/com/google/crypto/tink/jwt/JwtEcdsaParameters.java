package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtEcdsaParameters extends com.google.crypto.tink.jwt.JwtSignatureParameters {
    private final com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm;
    private final com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy kidStrategy;

    @com.google.errorprone.annotations.Immutable
    public static final class KidStrategy {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3888name;
        public static final com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy BASE64_ENCODED_KEY_ID = new com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy("BASE64_ENCODED_KEY_ID");
        public static final com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy IGNORED = new com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy("IGNORED");
        public static final com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy CUSTOM = new com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy("CUSTOM");

        private KidStrategy(java.lang.String str) {
            this.f3888name = str;
        }

        public final java.lang.String toString() {
            return this.f3888name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Algorithm {
        public static final com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm ES256 = new com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256, com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS);
        public static final com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm ES384 = new com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P384_CURVE_AND_SHA384, com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS);
        public static final com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm ES512 = new com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P521_CURVE_AND_SHA512, com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS);
        private final java.security.spec.ECParameterSpec ecParameterSpec;

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3887name;

        private Algorithm(java.lang.String str, java.security.spec.ECParameterSpec eCParameterSpec) {
            this.f3887name = str;
            this.ecParameterSpec = eCParameterSpec;
        }

        public final java.lang.String toString() {
            return this.f3887name;
        }

        public final java.lang.String getStandardName() {
            return this.f3887name;
        }

        final java.security.spec.ECParameterSpec getECParameterSpec() {
            return this.ecParameterSpec;
        }
    }

    public static final class Builder {
        java.util.Optional<com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm> algorithm;
        java.util.Optional<com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy> kidStrategy;

        public final com.google.crypto.tink.jwt.JwtEcdsaParameters.Builder setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy kidStrategy) {
            this.kidStrategy = java.util.Optional.of(kidStrategy);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtEcdsaParameters.Builder setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm) {
            this.algorithm = java.util.Optional.of(algorithm);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtEcdsaParameters build() throws java.security.GeneralSecurityException {
            if (!this.algorithm.isPresent()) {
                throw new java.security.GeneralSecurityException("Algorithm must be set");
            }
            if (!this.kidStrategy.isPresent()) {
                throw new java.security.GeneralSecurityException("KidStrategy must be set");
            }
            return new com.google.crypto.tink.jwt.JwtEcdsaParameters(this.kidStrategy.get(), this.algorithm.get());
        }

        private Builder() {
            this.kidStrategy = java.util.Optional.empty();
            this.algorithm = java.util.Optional.empty();
        }
    }

    public static com.google.crypto.tink.jwt.JwtEcdsaParameters.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtEcdsaParameters.Builder();
    }

    private JwtEcdsaParameters(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy kidStrategy, com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm) {
        this.kidStrategy = kidStrategy;
        this.algorithm = algorithm;
    }

    public final com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy getKidStrategy() {
        return this.kidStrategy;
    }

    public final com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm getAlgorithm() {
        return this.algorithm;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID);
    }

    @Override // com.google.crypto.tink.jwt.JwtSignatureParameters
    public final boolean allowKidAbsent() {
        return this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.CUSTOM) || this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.jwt.JwtEcdsaParameters)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters = (com.google.crypto.tink.jwt.JwtEcdsaParameters) obj;
        return jwtEcdsaParameters.kidStrategy.equals(this.kidStrategy) && jwtEcdsaParameters.algorithm.equals(this.algorithm);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.jwt.JwtEcdsaParameters.class, this.kidStrategy, this.algorithm);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JWT ECDSA Parameters (kidStrategy: ");
        sb.append(this.kidStrategy);
        sb.append(", Algorithm ");
        sb.append(this.algorithm);
        sb.append(")");
        return sb.toString();
    }
}
