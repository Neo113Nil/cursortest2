package com.google.crypto.tink.aead;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class AesEaxKey extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.AesEaxParameters parameters;

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes keyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.AesEaxParameters parameters;

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.aead.AesEaxKey.Builder setParameters(com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters) {
            this.parameters = aesEaxParameters;
            return this;
        }

        public com.google.crypto.tink.aead.AesEaxKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        public com.google.crypto.tink.aead.AesEaxKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesEaxParameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown AesEaxParameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.aead.AesEaxKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters = this.parameters;
            if (aesEaxParameters == null || this.keyBytes == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesEaxParameters.getKeySizeBytes() != this.keyBytes.size()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            }
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.aead.AesEaxKey(this.parameters, this.keyBytes, getOutputPrefix(), this.idRequirement);
        }
    }

    private AesEaxKey(com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters, com.google.crypto.tink.util.SecretBytes secretBytes, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = aesEaxParameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.aead.AesEaxKey.Builder builder() {
        return new com.google.crypto.tink.aead.AesEaxKey.Builder();
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.AesEaxParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.AesEaxKey)) {
            return false;
        }
        com.google.crypto.tink.aead.AesEaxKey aesEaxKey = (com.google.crypto.tink.aead.AesEaxKey) key;
        return aesEaxKey.parameters.equals(this.parameters) && aesEaxKey.keyBytes.equalsSecretBytes(this.keyBytes) && java.util.Objects.equals(aesEaxKey.idRequirement, this.idRequirement);
    }
}
