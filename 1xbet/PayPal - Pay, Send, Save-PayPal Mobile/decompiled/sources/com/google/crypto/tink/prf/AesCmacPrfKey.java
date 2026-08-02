package com.google.crypto.tink.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class AesCmacPrfKey extends com.google.crypto.tink.prf.PrfKey {
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.prf.AesCmacPrfParameters parameters;

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return null;
    }

    private AesCmacPrfKey(com.google.crypto.tink.prf.AesCmacPrfParameters aesCmacPrfParameters, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.parameters = aesCmacPrfParameters;
        this.keyBytes = secretBytes;
    }

    public static com.google.crypto.tink.prf.AesCmacPrfKey create(com.google.crypto.tink.prf.AesCmacPrfParameters aesCmacPrfParameters, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        if (aesCmacPrfParameters.getKeySizeBytes() != secretBytes.size()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        return new com.google.crypto.tink.prf.AesCmacPrfKey(aesCmacPrfParameters, secretBytes);
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.prf.AesCmacPrfParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.prf.AesCmacPrfKey)) {
            return false;
        }
        com.google.crypto.tink.prf.AesCmacPrfKey aesCmacPrfKey = (com.google.crypto.tink.prf.AesCmacPrfKey) key;
        return aesCmacPrfKey.parameters.equals(this.parameters) && aesCmacPrfKey.keyBytes.equalsSecretBytes(this.keyBytes);
    }
}
