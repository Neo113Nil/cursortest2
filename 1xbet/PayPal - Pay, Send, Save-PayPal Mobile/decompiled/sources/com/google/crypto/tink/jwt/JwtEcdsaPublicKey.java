package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class JwtEcdsaPublicKey extends com.google.crypto.tink.jwt.JwtSignaturePublicKey {
    private final java.util.Optional<java.lang.Integer> idRequirement;
    private final java.util.Optional<java.lang.String> kid;
    private final com.google.crypto.tink.jwt.JwtEcdsaParameters parameters;
    private final java.security.spec.ECPoint publicPoint;

    public static class Builder {
        private java.util.Optional<java.lang.String> customKid;
        private java.util.Optional<java.lang.Integer> idRequirement;
        private java.util.Optional<com.google.crypto.tink.jwt.JwtEcdsaParameters> parameters;
        private java.util.Optional<java.security.spec.ECPoint> publicPoint;

        private Builder() {
            this.parameters = java.util.Optional.empty();
            this.publicPoint = java.util.Optional.empty();
            this.idRequirement = java.util.Optional.empty();
            this.customKid = java.util.Optional.empty();
        }

        public com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder setParameters(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters) {
            this.parameters = java.util.Optional.of(jwtEcdsaParameters);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder setPublicPoint(java.security.spec.ECPoint eCPoint) {
            this.publicPoint = java.util.Optional.of(eCPoint);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder setIdRequirement(java.lang.Integer num) {
            this.idRequirement = java.util.Optional.of(num);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder setCustomKid(java.lang.String str) {
            this.customKid = java.util.Optional.of(str);
            return this;
        }

        private java.util.Optional<java.lang.String> computeKid() throws java.security.GeneralSecurityException {
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
                if (this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid must not be set for KidStrategy BASE64_ENCODED_KEY_ID");
                }
                return java.util.Optional.of(com.google.crypto.tink.subtle.Base64.urlSafeEncode(java.nio.ByteBuffer.allocate(4).putInt(this.idRequirement.get().intValue()).array()));
            }
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.CUSTOM)) {
                if (!this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid needs to be set for KidStrategy CUSTOM");
                }
                return this.customKid;
            }
            if (this.parameters.get().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED)) {
                if (this.customKid.isPresent()) {
                    throw new java.security.GeneralSecurityException("customKid must not be set for KidStrategy IGNORED");
                }
                return java.util.Optional.empty();
            }
            throw new java.lang.IllegalStateException("Unknown kid strategy");
        }

        public com.google.crypto.tink.jwt.JwtEcdsaPublicKey build() throws java.security.GeneralSecurityException {
            if (!this.parameters.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters");
            }
            if (!this.publicPoint.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without public point");
            }
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(this.publicPoint.get(), this.parameters.get().getAlgorithm().getECParameterSpec().getCurve());
            if (this.parameters.get().hasIdRequirement() && !this.idRequirement.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.get().hasIdRequirement() && this.idRequirement.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.jwt.JwtEcdsaPublicKey(this.parameters.get(), this.publicPoint.get(), computeKid(), this.idRequirement);
        }
    }

    private JwtEcdsaPublicKey(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters, java.security.spec.ECPoint eCPoint, java.util.Optional<java.lang.String> optional, java.util.Optional<java.lang.Integer> optional2) {
        this.parameters = jwtEcdsaParameters;
        this.publicPoint = eCPoint;
        this.kid = optional;
        this.idRequirement = optional2;
    }

    public static com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder();
    }

    public final java.security.spec.ECPoint getPublicPoint() {
        return this.publicPoint;
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePublicKey
    public final java.util.Optional<java.lang.String> getKid() {
        return this.kid;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement.orElse(null);
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.jwt.JwtEcdsaParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.jwt.JwtEcdsaPublicKey)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey = (com.google.crypto.tink.jwt.JwtEcdsaPublicKey) key;
        return jwtEcdsaPublicKey.parameters.equals(this.parameters) && jwtEcdsaPublicKey.publicPoint.equals(this.publicPoint) && jwtEcdsaPublicKey.kid.equals(this.kid);
    }
}
