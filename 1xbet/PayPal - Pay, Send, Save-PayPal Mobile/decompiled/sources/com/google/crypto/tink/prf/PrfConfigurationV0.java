package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
class PrfConfigurationV0 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();
    private static final int MIN_HKDF_PRF_KEY_SIZE = 32;

    private PrfConfigurationV0() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.prf.PrfSetWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda6(), com.google.crypto.tink.prf.HmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.PrfConfigurationV0$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.prf.Prf createHkdfPrf;
                    createHkdfPrf = com.google.crypto.tink.prf.PrfConfigurationV0.createHkdfPrf((com.google.crypto.tink.prf.HkdfPrfKey) key);
                    return createHkdfPrf;
                }
            }, com.google.crypto.tink.prf.HkdfPrfKey.class, com.google.crypto.tink.prf.Prf.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.PrfConfigurationV0$$ExternalSyntheticLambda1
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.prf.Prf createAesCmacPrf;
                    createAesCmacPrf = com.google.crypto.tink.prf.PrfConfigurationV0.createAesCmacPrf((com.google.crypto.tink.prf.AesCmacPrfKey) key);
                    return createAesCmacPrf;
                }
            }, com.google.crypto.tink.prf.AesCmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.PrfConfigurationV0$$ExternalSyntheticLambda2
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.prf.Prf createPrfFromLegacyProtoKey;
                    createPrfFromLegacyProtoKey = com.google.crypto.tink.prf.PrfConfigurationV0.createPrfFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createPrfFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.prf.Prf.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant PrfConfigurationV0 in FIPS mode");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createPrfFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.prf.AesCmacPrfKey) {
                return createAesCmacPrf((com.google.crypto.tink.prf.AesCmacPrfKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.prf.HkdfPrfKey) {
                return createHkdfPrf((com.google.crypto.tink.prf.HkdfPrfKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.prf.HmacPrfKey) {
                return com.google.crypto.tink.subtle.PrfHmacJce.create((com.google.crypto.tink.prf.HmacPrfKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for Prf: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected one of: AesCmacPrfKey, HkdfPrfKey, HmacPrfKey.");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for Prf", e);
        }
    }
}
