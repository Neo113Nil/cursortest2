package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
class StreamingAeadConfigurationV1 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private StreamingAeadConfigurationV1() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda14(), com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey.class, com.google.crypto.tink.StreamingAead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda13(), com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.class, com.google.crypto.tink.StreamingAead.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant StreamingAead in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }
}
