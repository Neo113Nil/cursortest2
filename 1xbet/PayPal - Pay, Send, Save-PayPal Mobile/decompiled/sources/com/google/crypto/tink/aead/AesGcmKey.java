package com.google.crypto.tink.aead;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class AesGcmKey extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.AesGcmParameters parameters;

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes keyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.AesGcmParameters parameters;

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.aead.AesGcmKey.Builder setParameters(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters) {
            this.parameters = aesGcmParameters;
            return this;
        }

        public com.google.crypto.tink.aead.AesGcmKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        public com.google.crypto.tink.aead.AesGcmKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesGcmParameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown AesGcmParameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.aead.AesGcmKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters = this.parameters;
            if (aesGcmParameters == null || this.keyBytes == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesGcmParameters.getKeySizeBytes() != this.keyBytes.size()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            }
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.aead.AesGcmKey(this.parameters, this.keyBytes, getOutputPrefix(), this.idRequirement);
        }
    }

    private AesGcmKey(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters, com.google.crypto.tink.util.SecretBytes secretBytes, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = aesGcmParameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.aead.AesGcmKey.Builder builder() {
        return new com.google.crypto.tink.aead.AesGcmKey.Builder();
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.AesGcmParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.AesGcmKey)) {
            return false;
        }
        com.google.crypto.tink.aead.AesGcmKey aesGcmKey = (com.google.crypto.tink.aead.AesGcmKey) key;
        return aesGcmKey.parameters.equals(this.parameters) && aesGcmKey.keyBytes.equalsSecretBytes(this.keyBytes) && java.util.Objects.equals(aesGcmKey.idRequirement, this.idRequirement);
    }
}
