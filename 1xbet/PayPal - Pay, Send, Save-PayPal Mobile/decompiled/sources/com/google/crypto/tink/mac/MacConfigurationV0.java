package com.google.crypto.tink.mac;

/* loaded from: classes9.dex */
class MacConfigurationV0 {
    private static final int AES_CMAC_KEY_SIZE_BYTES = 32;
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private MacConfigurationV0() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.mac.MacWrapper.registerToInternalPrimitiveRegistry(builder);
            com.google.crypto.tink.mac.ChunkedMacWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.MacConfigurationV0$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.Mac createAesCmac;
                    createAesCmac = com.google.crypto.tink.mac.MacConfigurationV0.createAesCmac((com.google.crypto.tink.mac.AesCmacKey) key);
                    return createAesCmac;
                }
            }, com.google.crypto.tink.mac.AesCmacKey.class, com.google.crypto.tink.Mac.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda0(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.Mac.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.MacConfigurationV0$$ExternalSyntheticLambda1
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.mac.ChunkedMac createChunkedAesCmac;
                    createChunkedAesCmac = com.google.crypto.tink.mac.MacConfigurationV0.createChunkedAesCmac((com.google.crypto.tink.mac.AesCmacKey) key);
                    return createChunkedAesCmac;
                }
            }, com.google.crypto.tink.mac.AesCmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda3(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.MacConfigurationV0$$ExternalSyntheticLambda2
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.Mac createMacFromLegacyProtoKey;
                    createMacFromLegacyProtoKey = com.google.crypto.tink.mac.MacConfigurationV0.createMacFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createMacFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.Mac.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.MacConfigurationV0$$ExternalSyntheticLambda3
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.mac.ChunkedMac createChunkedMacFromLegacyProtoKey;
                    createChunkedMacFromLegacyProtoKey = com.google.crypto.tink.mac.MacConfigurationV0.createChunkedMacFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createChunkedMacFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.mac.ChunkedMac.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant MacConfigurationV0 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.ChunkedMac createChunkedAesCmac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        if (aesCmacKey.getParameters().getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AesCmac key size is not 32 bytes");
        }
        return new com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl(aesCmacKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Mac createAesCmac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        if (aesCmacKey.getParameters().getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AesCmac key size is not 32 bytes");
        }
        return com.google.crypto.tink.subtle.PrfMac.create(aesCmacKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Mac createMacFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.mac.AesCmacKey) {
                return createAesCmac((com.google.crypto.tink.mac.AesCmacKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.mac.HmacKey) {
                return com.google.crypto.tink.subtle.PrfMac.create((com.google.crypto.tink.mac.HmacKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for Mac: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected HmacKey or AesCmacKey");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for Mac", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.ChunkedMac createChunkedMacFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.mac.AesCmacKey) {
                return createChunkedAesCmac((com.google.crypto.tink.mac.AesCmacKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.mac.HmacKey) {
                return new com.google.crypto.tink.mac.internal.ChunkedHmacImpl((com.google.crypto.tink.mac.HmacKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for ChunkedMac: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected HmacKey or AesCmacKey");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for ChunkedMac", e);
        }
    }
}
