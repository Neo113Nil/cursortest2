package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
class HybridConfigurationV0 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private HybridConfigurationV0() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.hybrid.HybridEncryptWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda15(), com.google.crypto.tink.hybrid.EciesPublicKey.class, com.google.crypto.tink.HybridEncrypt.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda17(), com.google.crypto.tink.hybrid.HpkePublicKey.class, com.google.crypto.tink.HybridEncrypt.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.hybrid.HybridConfigurationV0$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.HybridEncrypt createHybridEncryptFromLegacyProtoKey;
                    createHybridEncryptFromLegacyProtoKey = com.google.crypto.tink.hybrid.HybridConfigurationV0.createHybridEncryptFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createHybridEncryptFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.HybridEncrypt.class));
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda16(), com.google.crypto.tink.hybrid.EciesPrivateKey.class, com.google.crypto.tink.HybridDecrypt.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda18(), com.google.crypto.tink.hybrid.HpkePrivateKey.class, com.google.crypto.tink.HybridDecrypt.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.hybrid.HybridConfigurationV0$$ExternalSyntheticLambda1
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.HybridDecrypt createHybridDecryptFromLegacyProtoKey;
                    createHybridDecryptFromLegacyProtoKey = com.google.crypto.tink.hybrid.HybridConfigurationV0.createHybridDecryptFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createHybridDecryptFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.HybridDecrypt.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.HybridEncrypt createHybridEncryptFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.hybrid.EciesPublicKey) {
                return com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt.create((com.google.crypto.tink.hybrid.EciesPublicKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.hybrid.HpkePublicKey) {
                return com.google.crypto.tink.hybrid.internal.HpkeEncrypt.create((com.google.crypto.tink.hybrid.HpkePublicKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for HybridEncrypt: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected .");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for HybridEncrypt", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.HybridDecrypt createHybridDecryptFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.hybrid.EciesPrivateKey) {
                return com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt.create((com.google.crypto.tink.hybrid.EciesPrivateKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.hybrid.HpkePrivateKey) {
                return com.google.crypto.tink.hybrid.internal.HpkeDecrypt.create((com.google.crypto.tink.hybrid.HpkePrivateKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for HybridDecrypt: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected .");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for HybridDecrypt", e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV0 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }
}
