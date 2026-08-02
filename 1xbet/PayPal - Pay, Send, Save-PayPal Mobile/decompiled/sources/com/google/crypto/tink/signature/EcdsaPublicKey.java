package com.google.crypto.tink.signature;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EcdsaPublicKey extends com.google.crypto.tink.signature.SignaturePublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.signature.EcdsaParameters parameters;
    private final java.security.spec.ECPoint publicPoint;

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.EcdsaParameters parameters;

        @javax.annotation.Nullable
        private java.security.spec.ECPoint publicPoint;

        private Builder() {
            this.parameters = null;
            this.publicPoint = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setParameters(com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters) {
            this.parameters = ecdsaParameters;
            return this;
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setPublicPoint(java.security.spec.ECPoint eCPoint) {
            this.publicPoint = eCPoint;
            return this;
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY || this.parameters.getVariant() == com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown EcdsaParameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters = this.parameters;
            if (ecdsaParameters == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters");
            }
            java.security.spec.ECPoint eCPoint = this.publicPoint;
            if (eCPoint == null) {
                throw new java.security.GeneralSecurityException("Cannot build without public point");
            }
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint, ecdsaParameters.getCurveType().toParameterSpec().getCurve());
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.signature.EcdsaPublicKey(this.parameters, this.publicPoint, getOutputPrefix(), this.idRequirement);
        }
    }

    private EcdsaPublicKey(com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters, java.security.spec.ECPoint eCPoint, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = ecdsaParameters;
        this.publicPoint = eCPoint;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.signature.EcdsaPublicKey.Builder builder() {
        return new com.google.crypto.tink.signature.EcdsaPublicKey.Builder();
    }

    public final java.security.spec.ECPoint getPublicPoint() {
        return this.publicPoint;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.EcdsaParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.signature.EcdsaPublicKey)) {
            return false;
        }
        com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey = (com.google.crypto.tink.signature.EcdsaPublicKey) key;
        return ecdsaPublicKey.parameters.equals(this.parameters) && ecdsaPublicKey.publicPoint.equals(this.publicPoint) && java.util.Objects.equals(ecdsaPublicKey.idRequirement, this.idRequirement);
    }
}
