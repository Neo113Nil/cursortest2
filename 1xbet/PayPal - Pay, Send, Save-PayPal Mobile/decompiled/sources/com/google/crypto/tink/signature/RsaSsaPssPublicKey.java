package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPssPublicKey extends com.google.crypto.tink.signature.SignaturePublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final java.math.BigInteger modulus;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.signature.RsaSsaPssParameters parameters;

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private java.math.BigInteger modulus;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.RsaSsaPssParameters parameters;

        private Builder() {
            this.parameters = null;
            this.modulus = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPublicKey.Builder setParameters(com.google.crypto.tink.signature.RsaSsaPssParameters rsaSsaPssParameters) {
            this.parameters = rsaSsaPssParameters;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPublicKey.Builder setModulus(java.math.BigInteger bigInteger) {
            this.modulus = bigInteger;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPublicKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.LEGACY || this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown RsaSsaPssParameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.signature.RsaSsaPssPublicKey build() throws java.security.GeneralSecurityException {
            if (this.parameters == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters");
            }
            java.math.BigInteger bigInteger = this.modulus;
            if (bigInteger == null) {
                throw new java.security.GeneralSecurityException("Cannot build without modulus");
            }
            int bitLength = bigInteger.bitLength();
            int modulusSizeBits = this.parameters.getModulusSizeBits();
            if (bitLength != modulusSizeBits) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Got modulus size ");
                sb.append(bitLength);
                sb.append(", but parameters requires modulus size ");
                sb.append(modulusSizeBits);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.signature.RsaSsaPssPublicKey(this.parameters, this.modulus, getOutputPrefix(), this.idRequirement);
        }
    }

    private RsaSsaPssPublicKey(com.google.crypto.tink.signature.RsaSsaPssParameters rsaSsaPssParameters, java.math.BigInteger bigInteger, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = rsaSsaPssParameters;
        this.modulus = bigInteger;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.signature.RsaSsaPssPublicKey.Builder builder() {
        return new com.google.crypto.tink.signature.RsaSsaPssPublicKey.Builder();
    }

    public final java.math.BigInteger getModulus() {
        return this.modulus;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.RsaSsaPssParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.signature.RsaSsaPssPublicKey)) {
            return false;
        }
        com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey = (com.google.crypto.tink.signature.RsaSsaPssPublicKey) key;
        return rsaSsaPssPublicKey.parameters.equals(this.parameters) && rsaSsaPssPublicKey.modulus.equals(this.modulus) && java.util.Objects.equals(rsaSsaPssPublicKey.idRequirement, this.idRequirement);
    }
}
