package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
class SignatureConfigurationV1 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private SignatureConfigurationV1() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.signature.PublicKeySignWrapper.registerToInternalPrimitiveRegistry(builder);
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda7(), com.google.crypto.tink.signature.EcdsaPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda8(), com.google.crypto.tink.signature.EcdsaPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda5(), com.google.crypto.tink.signature.RsaSsaPssPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda6(), com.google.crypto.tink.signature.RsaSsaPssPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda3(), com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda4(), com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda1(), com.google.crypto.tink.signature.Ed25519PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda2(), com.google.crypto.tink.signature.Ed25519PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant SignatureConfigurationV1 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }
}
