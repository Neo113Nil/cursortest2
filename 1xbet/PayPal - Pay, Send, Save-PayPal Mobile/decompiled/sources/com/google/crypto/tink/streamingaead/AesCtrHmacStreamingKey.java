package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public final class AesCtrHmacStreamingKey extends com.google.crypto.tink.streamingaead.StreamingAeadKey {
    private final com.google.crypto.tink.util.SecretBytes initialKeymaterial;
    private final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters parameters;

    private AesCtrHmacStreamingKey(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters aesCtrHmacStreamingParameters, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.parameters = aesCtrHmacStreamingParameters;
        this.initialKeymaterial = secretBytes;
    }

    public static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey create(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters aesCtrHmacStreamingParameters, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        if (aesCtrHmacStreamingParameters.getKeySizeBytes() != secretBytes.size()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        return new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey(aesCtrHmacStreamingParameters, secretBytes);
    }

    public final com.google.crypto.tink.util.SecretBytes getInitialKeyMaterial() {
        return this.initialKeymaterial;
    }

    @Override // com.google.crypto.tink.streamingaead.StreamingAeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey)) {
            return false;
        }
        com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey aesCtrHmacStreamingKey = (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey) key;
        return aesCtrHmacStreamingKey.parameters.equals(this.parameters) && aesCtrHmacStreamingKey.initialKeymaterial.equalsSecretBytes(this.initialKeymaterial);
    }
}
