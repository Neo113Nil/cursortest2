package com.google.crypto.tink.daead;

/* loaded from: classes9.dex */
class DeterministicAeadConfigurationV1 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();
    private static final int KEY_SIZE_IN_BYTES = 64;

    private DeterministicAeadConfigurationV1() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.daead.DeterministicAeadWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.daead.DeterministicAeadConfigurationV1$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.DeterministicAead createAesSiv;
                    createAesSiv = com.google.crypto.tink.daead.DeterministicAeadConfigurationV1.createAesSiv((com.google.crypto.tink.daead.AesSivKey) key);
                    return createAesSiv;
                }
            }, com.google.crypto.tink.daead.AesSivKey.class, com.google.crypto.tink.DeterministicAead.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant DeterministicAeadConfigurationV1 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.DeterministicAead createAesSiv(com.google.crypto.tink.daead.AesSivKey aesSivKey) throws java.security.GeneralSecurityException {
        if (aesSivKey.getParameters().getKeySizeBytes() != 64) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key size: ");
            sb.append(aesSivKey.getParameters().getKeySizeBytes());
            sb.append(". Valid keys must have 64 bytes.");
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        return com.google.crypto.tink.subtle.AesSiv.create(aesSivKey);
    }
}
