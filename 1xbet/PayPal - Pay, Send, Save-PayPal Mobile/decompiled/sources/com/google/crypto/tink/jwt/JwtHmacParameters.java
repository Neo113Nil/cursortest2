package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public class JwtHmacParameters extends com.google.crypto.tink.jwt.JwtMacParameters {
    private final com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm algorithm;
    private final int keySizeBytes;
    private final com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy kidStrategy;

    @com.google.errorprone.annotations.Immutable
    public static final class KidStrategy {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3890name;
        public static final com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy BASE64_ENCODED_KEY_ID = new com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy("BASE64_ENCODED_KEY_ID");
        public static final com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy IGNORED = new com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy("IGNORED");
        public static final com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy CUSTOM = new com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy("CUSTOM");

        private KidStrategy(java.lang.String str) {
            this.f3890name = str;
        }

        public final java.lang.String toString() {
            return this.f3890name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Algorithm {
        public static final com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm HS256 = new com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA256);
        public static final com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm HS384 = new com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA384);
        public static final com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm HS512 = new com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA512);

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3889name;

        private Algorithm(java.lang.String str) {
            this.f3889name = str;
        }

        public final java.lang.String toString() {
            return this.f3889name;
        }

        public final java.lang.String getStandardName() {
            return this.f3889name;
        }
    }

    public static final class Builder {
        java.util.Optional<com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm> algorithm;
        java.util.Optional<java.lang.Integer> keySizeBytes;
        java.util.Optional<com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy> kidStrategy;

        public final com.google.crypto.tink.jwt.JwtHmacParameters.Builder setKeySizeBytes(int i) {
            this.keySizeBytes = java.util.Optional.of(java.lang.Integer.valueOf(i));
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtHmacParameters.Builder setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy kidStrategy) {
            this.kidStrategy = java.util.Optional.of(kidStrategy);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtHmacParameters.Builder setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm algorithm) {
            this.algorithm = java.util.Optional.of(algorithm);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtHmacParameters build() throws java.security.GeneralSecurityException {
            if (!this.keySizeBytes.isPresent()) {
                throw new java.security.GeneralSecurityException("Key Size must be set");
            }
            if (!this.algorithm.isPresent()) {
                throw new java.security.GeneralSecurityException("Algorithm must be set");
            }
            if (!this.kidStrategy.isPresent()) {
                throw new java.security.GeneralSecurityException("KidStrategy must be set");
            }
            if (this.keySizeBytes.get().intValue() < 16) {
                throw new java.security.GeneralSecurityException("Key size must be at least 16 bytes");
            }
            return new com.google.crypto.tink.jwt.JwtHmacParameters(this.keySizeBytes.get().intValue(), this.kidStrategy.get(), this.algorithm.get());
        }

        private Builder() {
            this.keySizeBytes = java.util.Optional.empty();
            this.kidStrategy = java.util.Optional.empty();
            this.algorithm = java.util.Optional.empty();
        }
    }

    public static com.google.crypto.tink.jwt.JwtHmacParameters.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtHmacParameters.Builder();
    }

    private JwtHmacParameters(int i, com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy kidStrategy, com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm algorithm) {
        this.keySizeBytes = i;
        this.kidStrategy = kidStrategy;
        this.algorithm = algorithm;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy getKidStrategy() {
        return this.kidStrategy;
    }

    public com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm getAlgorithm() {
        return this.algorithm;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID);
    }

    @Override // com.google.crypto.tink.jwt.JwtMacParameters
    public boolean allowKidAbsent() {
        return this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.CUSTOM) || this.kidStrategy.equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.jwt.JwtHmacParameters)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters = (com.google.crypto.tink.jwt.JwtHmacParameters) obj;
        return jwtHmacParameters.keySizeBytes == this.keySizeBytes && jwtHmacParameters.kidStrategy.equals(this.kidStrategy) && jwtHmacParameters.algorithm.equals(this.algorithm);
    }

    public int hashCode() {
        int i = this.keySizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.jwt.JwtHmacParameters.class, java.lang.Integer.valueOf(i), this.kidStrategy, this.algorithm);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JWT HMAC Parameters (kidStrategy: ");
        sb.append(this.kidStrategy);
        sb.append(", Algorithm ");
        sb.append(this.algorithm);
        sb.append(", and ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
