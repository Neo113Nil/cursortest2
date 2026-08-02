package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPssParameters extends com.google.crypto.tink.jwt.JwtSignatureParameters {
    public static final java.math.BigInteger F4 = java.math.BigInteger.valueOf(65537);
    private final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm algorithm;
    private final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy kidStrategy;
    private final int modulusSizeBits;
    private final java.math.BigInteger publicExponent;

    @com.google.errorprone.annotations.Immutable
    public static final class KidStrategy {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3894name;
        public static final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy BASE64_ENCODED_KEY_ID = new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy("BASE64_ENCODED_KEY_ID");
        public static final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy IGNORED = new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy("IGNORED");
        public static final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy CUSTOM = new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy("CUSTOM");

        private KidStrategy(java.lang.String str) {
            this.f3894name = str;
        }

        public final java.lang.String toString() {
            return this.f3894name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Algorithm {
        public static final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm PS256 = new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA256);
        public static final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm PS384 = new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA384);
        public static final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm PS512 = new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA512);

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3893name;

        private Algorithm(java.lang.String str) {
            this.f3893name = str;
        }

        public final java.lang.String toString() {
            return this.f3893name;
        }

        public final java.lang.String getStandardName() {
            return this.f3893name;
        }
    }

    public static final class Builder {
        private static final java.math.BigInteger PUBLIC_EXPONENT_UPPER_BOUND;
        private static final java.math.BigInteger TWO;
        java.util.Optional<com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm> algorithm;
        java.util.Optional<com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy> kidStrategy;
        java.util.Optional<java.lang.Integer> modulusSizeBits;
        java.util.Optional<java.math.BigInteger> publicExponent;

        private Builder() {
            this.modulusSizeBits = java.util.Optional.empty();
            this.publicExponent = java.util.Optional.of(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.F4);
            this.kidStrategy = java.util.Optional.empty();
            this.algorithm = java.util.Optional.empty();
        }

        public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder setModulusSizeBits(int i) {
            this.modulusSizeBits = java.util.Optional.of(java.lang.Integer.valueOf(i));
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder setPublicExponent(java.math.BigInteger bigInteger) {
            this.publicExponent = java.util.Optional.of(bigInteger);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy kidStrategy) {
            this.kidStrategy = java.util.Optional.of(kidStrategy);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm algorithm) {
            this.algorithm = java.util.Optional.of(algorithm);
            return this;
        }

        static {
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(2L);
            TWO = valueOf;
            PUBLIC_EXPONENT_UPPER_BOUND = valueOf.pow(256);
        }

        private void validatePublicExponent(java.math.BigInteger bigInteger) throws java.security.InvalidAlgorithmParameterException {
            int compareTo = bigInteger.compareTo(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.F4);
            if (compareTo != 0) {
                if (compareTo < 0) {
                    throw new java.security.InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
                }
                if (bigInteger.mod(TWO).equals(java.math.BigInteger.ZERO)) {
                    throw new java.security.InvalidAlgorithmParameterException("Invalid public exponent");
                }
                if (bigInteger.compareTo(PUBLIC_EXPONENT_UPPER_BOUND) > 0) {
                    throw new java.security.InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
                }
            }
        }

        public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters build() throws java.security.GeneralSecurityException {
            if (!this.modulusSizeBits.isPresent()) {
                throw new java.security.GeneralSecurityException("key size is not set");
            }
            if (!this.publicExponent.isPresent()) {
                throw new java.security.GeneralSecurityException("publicExponent is not set");
            }
            if (!this.algorithm.isPresent()) {
                throw new java.security.GeneralSecurityException("Algorithm must be set");
            }
            if (!this.kidStrategy.isPresent()) {
                throw new java.security.GeneralSecurityException("KidStrategy must be set");
            }
            if (this.modulusSizeBits.get().intValue() < 2048) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid modulus size in bits %d; must be at least 2048 bits", this.modulusSizeBits.get()));
            }
            validatePublicExponent(this.publicExponent.get());
            return new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters(this.modulusSizeBits.get().intValue(), this.publicExponent.get(), this.kidStrategy.get(), this.algorithm.get());
        }
    }

    private JwtRsaSsaPssParameters(int i, java.math.BigInteger bigInteger, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy kidStrategy, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm algorithm) {
        this.modulusSizeBits = i;
        this.publicExponent = bigInteger;
        this.kidStrategy = kidStrategy;
        this.algorithm = algorithm;
    }

    public static com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder();
    }

    public final int getModulusSizeBits() {
        return this.modulusSizeBits;
    }

    public final java.math.BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy getKidStrategy() {
        return this.kidStrategy;
    }

    public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm getAlgorithm() {
        return this.algorithm;
    }

    @Override // com.google.crypto.tink.jwt.JwtSignatureParameters
    public final boolean allowKidAbsent() {
        return this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.CUSTOM) || this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.IGNORED);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.jwt.JwtRsaSsaPssParameters)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtRsaSsaPssParameters jwtRsaSsaPssParameters = (com.google.crypto.tink.jwt.JwtRsaSsaPssParameters) obj;
        return jwtRsaSsaPssParameters.getModulusSizeBits() == getModulusSizeBits() && java.util.Objects.equals(jwtRsaSsaPssParameters.getPublicExponent(), getPublicExponent()) && jwtRsaSsaPssParameters.kidStrategy.equals(this.kidStrategy) && jwtRsaSsaPssParameters.algorithm.equals(this.algorithm);
    }

    public final int hashCode() {
        int i = this.modulusSizeBits;
        return java.util.Objects.hash(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.class, java.lang.Integer.valueOf(i), this.publicExponent, this.kidStrategy, this.algorithm);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.BASE64_ENCODED_KEY_ID);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JWT RSA SSA PSS Parameters (kidStrategy: ");
        sb.append(this.kidStrategy);
        sb.append(", algorithm ");
        sb.append(this.algorithm);
        sb.append(", publicExponent: ");
        sb.append(this.publicExponent);
        sb.append(", and ");
        sb.append(this.modulusSizeBits);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
