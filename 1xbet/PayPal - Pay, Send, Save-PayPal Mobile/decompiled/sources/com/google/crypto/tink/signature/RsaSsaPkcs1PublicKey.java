package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPkcs1PublicKey extends com.google.crypto.tink.signature.SignaturePublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final java.math.BigInteger modulus;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters parameters;

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private java.math.BigInteger modulus;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.RsaSsaPkcs1Parameters parameters;

        private Builder() {
            this.parameters = null;
            this.modulus = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.Builder setParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters rsaSsaPkcs1Parameters) {
            this.parameters = rsaSsaPkcs1Parameters;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.Builder setModulus(java.math.BigInteger bigInteger) {
            this.modulus = bigInteger;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.LEGACY || this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown RsaSsaPkcs1Parameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey build() throws java.security.GeneralSecurityException {
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
            return new com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey(this.parameters, this.modulus, getOutputPrefix(), this.idRequirement);
        }
    }

    private RsaSsaPkcs1PublicKey(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters rsaSsaPkcs1Parameters, java.math.BigInteger bigInteger, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = rsaSsaPkcs1Parameters;
        this.modulus = bigInteger;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.Builder builder() {
        return new com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.Builder();
    }

    public final java.math.BigInteger getModulus() {
        return this.modulus;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.RsaSsaPkcs1Parameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey)) {
            return false;
        }
        com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey) key;
        return rsaSsaPkcs1PublicKey.parameters.equals(this.parameters) && rsaSsaPkcs1PublicKey.modulus.equals(this.modulus) && java.util.Objects.equals(rsaSsaPkcs1PublicKey.idRequirement, this.idRequirement);
    }
}
