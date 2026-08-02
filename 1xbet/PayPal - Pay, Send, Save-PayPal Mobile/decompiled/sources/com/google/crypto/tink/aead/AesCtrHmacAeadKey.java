package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesCtrHmacAeadKey extends com.google.crypto.tink.aead.AeadKey {
    private final com.google.crypto.tink.util.SecretBytes aesKeyBytes;
    private final com.google.crypto.tink.util.SecretBytes hmacKeyBytes;

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.AesCtrHmacAeadParameters parameters;

    public static class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes aesKeyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes hmacKeyBytes;

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.AesCtrHmacAeadParameters parameters;

        private Builder() {
            this.parameters = null;
            this.aesKeyBytes = null;
            this.hmacKeyBytes = null;
            this.idRequirement = null;
        }

        public com.google.crypto.tink.aead.AesCtrHmacAeadKey.Builder setParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters) {
            this.parameters = aesCtrHmacAeadParameters;
            return this;
        }

        public com.google.crypto.tink.aead.AesCtrHmacAeadKey.Builder setAesKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.aesKeyBytes = secretBytes;
            return this;
        }

        public com.google.crypto.tink.aead.AesCtrHmacAeadKey.Builder setHmacKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.hmacKeyBytes = secretBytes;
            return this;
        }

        public com.google.crypto.tink.aead.AesCtrHmacAeadKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer num) {
            this.idRequirement = num;
            return this;
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.CRUNCHY) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(this.idRequirement.intValue());
            }
            if (this.parameters.getVariant() == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK) {
                return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(this.idRequirement.intValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown AesCtrHmacAeadParameters.Variant: ");
            sb.append(this.parameters.getVariant());
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public com.google.crypto.tink.aead.AesCtrHmacAeadKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters = this.parameters;
            if (aesCtrHmacAeadParameters == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters");
            }
            if (this.aesKeyBytes == null || this.hmacKeyBytes == null) {
                throw new java.security.GeneralSecurityException("Cannot build without key material");
            }
            if (aesCtrHmacAeadParameters.getAesKeySizeBytes() != this.aesKeyBytes.size()) {
                throw new java.security.GeneralSecurityException("AES key size mismatch");
            }
            if (this.parameters.getHmacKeySizeBytes() != this.hmacKeyBytes.size()) {
                throw new java.security.GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new com.google.crypto.tink.aead.AesCtrHmacAeadKey(this.parameters, this.aesKeyBytes, this.hmacKeyBytes, getOutputPrefix(), this.idRequirement);
        }
    }

    private AesCtrHmacAeadKey(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters, com.google.crypto.tink.util.SecretBytes secretBytes, com.google.crypto.tink.util.SecretBytes secretBytes2, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = aesCtrHmacAeadParameters;
        this.aesKeyBytes = secretBytes;
        this.hmacKeyBytes = secretBytes2;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.aead.AesCtrHmacAeadKey.Builder builder() {
        return new com.google.crypto.tink.aead.AesCtrHmacAeadKey.Builder();
    }

    public final com.google.crypto.tink.util.SecretBytes getAesKeyBytes() {
        return this.aesKeyBytes;
    }

    public final com.google.crypto.tink.util.SecretBytes getHmacKeyBytes() {
        return this.hmacKeyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.AesCtrHmacAeadKey)) {
            return false;
        }
        com.google.crypto.tink.aead.AesCtrHmacAeadKey aesCtrHmacAeadKey = (com.google.crypto.tink.aead.AesCtrHmacAeadKey) key;
        return aesCtrHmacAeadKey.parameters.equals(this.parameters) && aesCtrHmacAeadKey.aesKeyBytes.equalsSecretBytes(this.aesKeyBytes) && aesCtrHmacAeadKey.hmacKeyBytes.equalsSecretBytes(this.hmacKeyBytes) && java.util.Objects.equals(aesCtrHmacAeadKey.idRequirement, this.idRequirement);
    }
}
