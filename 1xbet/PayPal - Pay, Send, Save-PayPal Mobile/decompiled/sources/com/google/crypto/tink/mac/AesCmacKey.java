package com.google.crypto.tink.mac;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class AesCmacKey extends com.google.crypto.tink.mac.MacKey {
    private final com.google.crypto.tink.util.SecretBytes aesKeyBytes;

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.mac.AesCmacParameters parameters;

    public static class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes aesKeyBytes;

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.mac.AesCmacParameters parameters;

        private Builder() {
            this.parameters = null;
            this.aesKeyBytes = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.mac.AesCmacKey.Builder setParameters(com.google.crypto.tink.mac.AesCmacParameters aesCmacParameters) {
            this.parameters = aesCmacParameters;
            return this;
        }

        public com.google.crypto.tink.mac.AesCmacKey.Builder setAesKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
            this.aesKeyBytes = secretBytes;
            return this;
        }

        public com.google.crypto.tink.mac.AesCmacKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY || this.parameters.getVariant() == com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown AesCmacParametersParameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.mac.AesCmacKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.AesCmacParameters aesCmacParameters = this.parameters;
            if (aesCmacParameters == null || this.aesKeyBytes == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesCmacParameters.getKeySizeBytes() != this.aesKeyBytes.size()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            }
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.mac.AesCmacKey(this.parameters, this.aesKeyBytes, getOutputPrefix(), this.idRequirement);
        }
    }

    private AesCmacKey(com.google.crypto.tink.mac.AesCmacParameters aesCmacParameters, com.google.crypto.tink.util.SecretBytes secretBytes, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = aesCmacParameters;
        this.aesKeyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.mac.AesCmacKey.Builder builder() {
        return new com.google.crypto.tink.mac.AesCmacKey.Builder();
    }

    public final com.google.crypto.tink.util.SecretBytes getAesKey() {
        return this.aesKeyBytes;
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.mac.AesCmacParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.mac.AesCmacKey)) {
            return false;
        }
        com.google.crypto.tink.mac.AesCmacKey aesCmacKey = (com.google.crypto.tink.mac.AesCmacKey) key;
        return aesCmacKey.parameters.equals(this.parameters) && aesCmacKey.aesKeyBytes.equalsSecretBytes(this.aesKeyBytes) && java.util.Objects.equals(aesCmacKey.idRequirement, this.idRequirement);
    }
}
