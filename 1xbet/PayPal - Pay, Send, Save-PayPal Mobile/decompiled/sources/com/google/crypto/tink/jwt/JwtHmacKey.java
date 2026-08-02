package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtHmacKey extends com.google.crypto.tink.jwt.JwtMacKey {
    private final java.util.Optional<java.lang.Integer> idRequirement;
    private final com.google.crypto.tink.util.SecretBytes key;
    private final java.util.Optional<java.lang.String> kid;
    private final com.google.crypto.tink.jwt.JwtHmacParameters parameters;

    public static class Builder {
        private java.util.Optional<java.lang.String> customKid;
        private java.util.Optional<java.lang.Integer> idRequirement;
        private java.util.Optional<com.google.crypto.tink.util.SecretBytes> keyBytes;
        private java.util.Optional<com.google.crypto.tink.jwt.JwtHmacParameters> parameters;

        private Builder() {
            this.parameters = java.util.Optional.empty();
            this.keyBytes = java.util.Optional.empty();
            this.idRequirement = java.util.Optional.empty();
            this.customKid = java.util.Optional.empty();
        }

        public com.google.crypto.tink.jwt.JwtHmacKey.Builder setParameters(com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters) {
            this.parameters = java.util.Optional.of(jwtHmacParameters);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtHmacKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.keyBytes = java.util.Optional.of(secretBytes);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtHmacKey.Builder setIdRequirement(int i) {
            this.idRequirement = java.util.Optional.of(java.lang.Integer.valueOf(i));
            return this;
        }

        public com.google.crypto.tink.jwt.JwtHmacKey.Builder setCustomKid(java.lang.String str) {
            this.customKid = java.util.Optional.of(str);
            return this;
        }

        private java.util.Optional<java.lang.String> computeKid() throws java.security.GeneralSecurityException {
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
                byte[] array = java.nio.ByteBuffer.allocate(4).putInt(this.idRequirement.get().intValue()).array();
                if (this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid must not be set for KidStrategy BASE64_ENCODED_KEY_ID");
                }
                return java.util.Optional.of(com.google.crypto.tink.subtle.Base64.urlSafeEncode(array));
            }
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.CUSTOM)) {
                if (!this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid needs to be set for KidStrategy CUSTOM");
                }
                return this.customKid;
            }
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED)) {
                if (this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid must not be set for KidStrategy IGNORED");
                }
                return java.util.Optional.empty();
            }
            throw new java.lang.IllegalStateException("Unknown kid strategy");
        }

        public com.google.crypto.tink.jwt.JwtHmacKey build() throws java.security.GeneralSecurityException {
            if (!this.parameters.isPresent()) {
                throw new java.security.GeneralSecurityException("Parameters are required");
            }
            if (!this.keyBytes.isPresent()) {
                throw new java.security.GeneralSecurityException("KeyBytes are required");
            }
            if (this.parameters.get().getKeySizeBytes() != this.keyBytes.get().size()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            }
            if (this.parameters.get().hasIdRequirement() && !this.idRequirement.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.get().hasIdRequirement() && this.idRequirement.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.jwt.JwtHmacKey(this.parameters.get(), this.keyBytes.get(), this.idRequirement, computeKid());
        }
    }

    public static com.google.crypto.tink.jwt.JwtHmacKey.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtHmacKey.Builder();
    }

    private JwtHmacKey(com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters, com.google.crypto.tink.util.SecretBytes secretBytes, java.util.Optional<java.lang.Integer> optional, java.util.Optional<java.lang.String> optional2) {
        this.parameters = jwtHmacParameters;
        this.key = secretBytes;
        this.idRequirement = optional;
        this.kid = optional2;
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.key;
    }

    @Override // com.google.crypto.tink.jwt.JwtMacKey
    public final java.util.Optional<java.lang.String> getKid() {
        return this.kid;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement.orElse(null);
    }

    @Override // com.google.crypto.tink.jwt.JwtMacKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.jwt.JwtHmacParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.jwt.JwtHmacKey)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtHmacKey jwtHmacKey = (com.google.crypto.tink.jwt.JwtHmacKey) key;
        return jwtHmacKey.parameters.equals(this.parameters) && jwtHmacKey.key.equalsSecretBytes(this.key) && jwtHmacKey.kid.equals(this.kid) && jwtHmacKey.idRequirement.equals(this.idRequirement);
    }
}
