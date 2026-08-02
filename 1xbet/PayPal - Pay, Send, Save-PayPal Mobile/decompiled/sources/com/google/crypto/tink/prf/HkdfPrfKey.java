package com.google.crypto.tink.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class HkdfPrfKey extends com.google.crypto.tink.prf.PrfKey {
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.prf.HkdfPrfParameters parameters;

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return null;
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes keyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.HkdfPrfParameters parameters;

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
        }

        public final com.google.crypto.tink.prf.HkdfPrfKey.Builder setParameters(com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters) {
            this.parameters = hkdfPrfParameters;
            return this;
        }

        public final com.google.crypto.tink.prf.HkdfPrfKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        public final com.google.crypto.tink.prf.HkdfPrfKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters = this.parameters;
            if (hkdfPrfParameters == null || this.keyBytes == null) {
                throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (hkdfPrfParameters.getKeySizeBytes() != this.keyBytes.size()) {
                throw new java.security.GeneralSecurityException("Key size mismatch");
            }
            return new com.google.crypto.tink.prf.HkdfPrfKey(this.parameters, this.keyBytes);
        }
    }

    private HkdfPrfKey(com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.parameters = hkdfPrfParameters;
        this.keyBytes = secretBytes;
    }

    public static com.google.crypto.tink.prf.HkdfPrfKey.Builder builder() {
        return new com.google.crypto.tink.prf.HkdfPrfKey.Builder();
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.prf.HkdfPrfParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.prf.HkdfPrfKey)) {
            return false;
        }
        com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey = (com.google.crypto.tink.prf.HkdfPrfKey) key;
        return hkdfPrfKey.parameters.equals(this.parameters) && hkdfPrfKey.keyBytes.equalsSecretBytes(this.keyBytes);
    }
}
