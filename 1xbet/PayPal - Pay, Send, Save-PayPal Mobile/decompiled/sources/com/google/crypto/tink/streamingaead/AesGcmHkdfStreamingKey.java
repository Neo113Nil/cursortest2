package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public final class AesGcmHkdfStreamingKey extends com.google.crypto.tink.streamingaead.StreamingAeadKey {
    private final com.google.crypto.tink.util.SecretBytes initialKeymaterial;
    private final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters parameters;

    private AesGcmHkdfStreamingKey(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters aesGcmHkdfStreamingParameters, com.google.crypto.tink.util.SecretBytes secretBytes) {
        this.parameters = aesGcmHkdfStreamingParameters;
        this.initialKeymaterial = secretBytes;
    }

    public static com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey create(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters aesGcmHkdfStreamingParameters, com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        if (aesGcmHkdfStreamingParameters.getKeySizeBytes() != secretBytes.size()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        return new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey(aesGcmHkdfStreamingParameters, secretBytes);
    }

    public final com.google.crypto.tink.util.SecretBytes getInitialKeyMaterial() {
        return this.initialKeymaterial;
    }

    @Override // com.google.crypto.tink.streamingaead.StreamingAeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey)) {
            return false;
        }
        com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = (com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey) key;
        return aesGcmHkdfStreamingKey.parameters.equals(this.parameters) && aesGcmHkdfStreamingKey.initialKeymaterial.equalsSecretBytes(this.initialKeymaterial);
    }
}
