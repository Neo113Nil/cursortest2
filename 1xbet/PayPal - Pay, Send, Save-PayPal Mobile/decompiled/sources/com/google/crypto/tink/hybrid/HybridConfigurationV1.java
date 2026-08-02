package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
class HybridConfigurationV1 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private HybridConfigurationV1() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.hybrid.HybridEncryptWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda15(), com.google.crypto.tink.hybrid.EciesPublicKey.class, com.google.crypto.tink.HybridEncrypt.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda17(), com.google.crypto.tink.hybrid.HpkePublicKey.class, com.google.crypto.tink.HybridEncrypt.class));
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda16(), com.google.crypto.tink.hybrid.EciesPrivateKey.class, com.google.crypto.tink.HybridDecrypt.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda18(), com.google.crypto.tink.hybrid.HpkePrivateKey.class, com.google.crypto.tink.HybridDecrypt.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }
}
