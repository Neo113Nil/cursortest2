package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
class StreamingAeadConfigurationV0 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private StreamingAeadConfigurationV0() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda14(), com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey.class, com.google.crypto.tink.StreamingAead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda13(), com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.class, com.google.crypto.tink.StreamingAead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.streamingaead.StreamingAeadConfigurationV0$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.StreamingAead createStreamingAeadFromLegacyProtoKey;
                    createStreamingAeadFromLegacyProtoKey = com.google.crypto.tink.streamingaead.StreamingAeadConfigurationV0.createStreamingAeadFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createStreamingAeadFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.StreamingAead.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.StreamingAead createStreamingAeadFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey) {
                return com.google.crypto.tink.subtle.AesCtrHmacStreaming.create((com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey) {
                return com.google.crypto.tink.subtle.AesGcmHkdfStreaming.create((com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for StreamingAead: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected one of: AesCtrHmacStreamingKey, AesGcmHkdfStreamingKey.");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for StreamingAead", e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant StreamingAead in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }
}
