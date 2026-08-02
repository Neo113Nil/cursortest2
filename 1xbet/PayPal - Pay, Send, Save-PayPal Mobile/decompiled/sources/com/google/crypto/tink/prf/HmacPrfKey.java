package com.google.crypto.tink.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class HmacPrfKey extends com.google.crypto.tink.prf.PrfKey {
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.prf.HmacPrfParameters parameters;

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return null;
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes keyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.HmacPrfParameters parameters;

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
        }

        public final com.google.crypto.tink.prf.HmacPrfKey.Builder setParameters(com.google.crypto.tink.prf.HmacPrfParameters hmacPrfParameters) {
            this.parameters = hmacPrfParameters;
            return this;
        }

        public final com.google.crypto.tink.prf.HmacPrfKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        public final com.google.crypto.tink.prf.HmacPrfKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.HmacPrfParameters hmacPrfParameters = this.parameters;
            if (hmacPrfParameters == null || this.keyBytes == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (hmacPrfParameters.getKeySizeBytes() != this.keyBytes.size()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            }
            return new com.google.crypto.tink.prf.HmacPrfKey(this.parameters, this.keyBytes);
        }
    }

    private HmacPrfKey(com.google.crypto.tink.prf.HmacPrfParameters hmacPrfParameters, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.parameters = hmacPrfParameters;
        this.keyBytes = secretBytes;
    }

    public static com.google.crypto.tink.prf.HmacPrfKey.Builder builder() {
        return new com.google.crypto.tink.prf.HmacPrfKey.Builder();
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.prf.HmacPrfParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.prf.HmacPrfKey)) {
            return false;
        }
        com.google.crypto.tink.prf.HmacPrfKey hmacPrfKey = (com.google.crypto.tink.prf.HmacPrfKey) key;
        return hmacPrfKey.parameters.equals(this.parameters) && hmacPrfKey.keyBytes.equalsSecretBytes(this.keyBytes);
    }
}
