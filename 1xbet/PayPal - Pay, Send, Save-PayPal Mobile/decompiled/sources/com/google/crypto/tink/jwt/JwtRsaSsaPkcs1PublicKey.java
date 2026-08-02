package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPkcs1PublicKey extends com.google.crypto.tink.jwt.JwtSignaturePublicKey {
    private final java.util.Optional<java.lang.Integer> idRequirement;
    private final java.util.Optional<java.lang.String> kid;
    private final java.math.BigInteger modulus;
    private final com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters parameters;

    public static class Builder {
        private java.util.Optional<java.lang.String> customKid;
        private java.util.Optional<java.lang.Integer> idRequirement;
        private java.util.Optional<java.math.BigInteger> modulus;
        private java.util.Optional<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters> parameters;

        private Builder() {
            this.parameters = java.util.Optional.empty();
            this.modulus = java.util.Optional.empty();
            this.idRequirement = java.util.Optional.empty();
            this.customKid = java.util.Optional.empty();
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder setParameters(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters jwtRsaSsaPkcs1Parameters) {
            this.parameters = java.util.Optional.of(jwtRsaSsaPkcs1Parameters);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder setModulus(java.math.BigInteger bigInteger) {
            this.modulus = java.util.Optional.of(bigInteger);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder setIdRequirement(java.lang.Integer num) {
            this.idRequirement = java.util.Optional.of(num);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder setCustomKid(java.lang.String str) {
            this.customKid = java.util.Optional.of(str);
            return this;
        }

        private java.util.Optional<java.lang.String> computeKid() throws java.security.GeneralSecurityException {
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
                if (this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid must not be set for KidStrategy BASE64_ENCODED_KEY_ID");
                }
                return java.util.Optional.of(com.google.crypto.tink.subtle.Base64.urlSafeEncode(java.nio.ByteBuffer.allocate(4).putInt(this.idRequirement.get().intValue()).array()));
            }
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.CUSTOM)) {
                if (!this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid needs to be set for KidStrategy CUSTOM");
                }
                return this.customKid;
            }
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED)) {
                if (this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid must not be set for KidStrategy IGNORED");
                }
                return java.util.Optional.empty();
            }
            throw new java.lang.IllegalStateException("Unknown kid strategy");
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey build() throws java.security.GeneralSecurityException {
            if (!this.parameters.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters");
            }
            if (!this.modulus.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without modulus");
            }
            int bitLength = this.modulus.get().bitLength();
            int modulusSizeBits = this.parameters.get().getModulusSizeBits();
            if (bitLength != modulusSizeBits) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Got modulus size ");
                sb.append(bitLength);
                sb.append(", but parameters requires modulus size ");
                sb.append(modulusSizeBits);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (this.parameters.get().hasIdRequirement() && !this.idRequirement.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.get().hasIdRequirement() && this.idRequirement.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey(this.parameters.get(), this.modulus.get(), this.idRequirement, computeKid());
        }
    }

    private JwtRsaSsaPkcs1PublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters jwtRsaSsaPkcs1Parameters, java.math.BigInteger bigInteger, java.util.Optional<java.lang.Integer> optional, java.util.Optional<java.lang.String> optional2) {
        this.parameters = jwtRsaSsaPkcs1Parameters;
        this.modulus = bigInteger;
        this.idRequirement = optional;
        this.kid = optional2;
    }

    public static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder();
    }

    public final java.math.BigInteger getModulus() {
        return this.modulus;
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePublicKey
    public final java.util.Optional<java.lang.String> getKid() {
        return this.kid;
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement.orElse(null);
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = (com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey) key;
        return jwtRsaSsaPkcs1PublicKey.parameters.equals(this.parameters) && jwtRsaSsaPkcs1PublicKey.modulus.equals(this.modulus) && jwtRsaSsaPkcs1PublicKey.kid.equals(this.kid) && jwtRsaSsaPkcs1PublicKey.idRequirement.equals(this.idRequirement);
    }
}
