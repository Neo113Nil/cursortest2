package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
class PrfConfigurationV1 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();
    private static final int MIN_HKDF_PRF_KEY_SIZE = 32;

    private PrfConfigurationV1() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.prf.PrfSetWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda6(), com.google.crypto.tink.prf.HmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.PrfConfigurationV1$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.prf.Prf createHkdfPrf;
                    createHkdfPrf = com.google.crypto.tink.prf.PrfConfigurationV1.createHkdfPrf((com.google.crypto.tink.prf.HkdfPrfKey) key);
                    return createHkdfPrf;
                }
            }, com.google.crypto.tink.prf.HkdfPrfKey.class, com.google.crypto.tink.prf.Prf.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.PrfConfigurationV1$$ExternalSyntheticLambda1
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.prf.Prf createAesCmacPrf;
                    createAesCmacPrf = com.google.crypto.tink.prf.PrfConfigurationV1.createAesCmacPrf((com.google.crypto.tink.prf.AesCmacPrfKey) key);
                    return createAesCmacPrf;
                }
            }, com.google.crypto.tink.prf.AesCmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant PrfConfigurationV1 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createHkdfPrf(com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey) throws java.security.GeneralSecurityException {
        if (hkdfPrfKey.getParameters().getKeySizeBytes() < 32) {
            throw new java.security.GeneralSecurityException("HkdfPrf key size must be at least 32");
        }
        if (hkdfPrfKey.getParameters().getHashType() != com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256 && hkdfPrfKey.getParameters().getHashType() != com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512) {
            throw new java.security.GeneralSecurityException("HkdfPrf hash type must be SHA256 or SHA512");
        }
        return com.google.crypto.tink.subtle.prf.PrfImpl.wrap(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.create(hkdfPrfKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createAesCmacPrf(com.google.crypto.tink.prf.AesCmacPrfKey aesCmacPrfKey) throws java.security.GeneralSecurityException {
        if (aesCmacPrfKey.getParameters().getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AesCmacPrf key size must be 32 bytes");
        }
        return com.google.crypto.tink.subtle.PrfAesCmac.create(aesCmacPrfKey);
    }
}
