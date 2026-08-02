package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public final class AesCmacKeyManager {
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.mac.AesCmacParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.mac.AesCmacKey createAesCmacKey;
            createAesCmacKey = com.google.crypto.tink.mac.AesCmacKeyManager.createAesCmacKey((com.google.crypto.tink.mac.AesCmacParameters) parameters, num);
            return createAesCmacKey;
        }
    };
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.mac.ChunkedMac> CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.mac.ChunkedMac createChunkedMac;
            createChunkedMac = com.google.crypto.tink.mac.AesCmacKeyManager.createChunkedMac((com.google.crypto.tink.mac.AesCmacKey) key);
            return createChunkedMac;
        }
    }, com.google.crypto.tink.mac.AesCmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.Mac> MAC_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.Mac createMac;
            createMac = com.google.crypto.tink.mac.AesCmacKeyManager.createMac((com.google.crypto.tink.mac.AesCmacKey) key);
            return createMac;
        }
    }, com.google.crypto.tink.mac.AesCmacKey.class, com.google.crypto.tink.Mac.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Mac> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.crypto.tink.Mac.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesCmacKey.parser());

    private static void validateParameters(com.google.crypto.tink.mac.AesCmacParameters aesCmacParameters) throws java.security.GeneralSecurityException {
        if (aesCmacParameters.getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.AesCmacKey createAesCmacKey(com.google.crypto.tink.mac.AesCmacParameters aesCmacParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validateParameters(aesCmacParameters);
        return com.google.crypto.tink.mac.AesCmacKey.builder().setParameters(aesCmacParameters).setAesKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesCmacParameters.getKeySizeBytes())).setIdRequirement(num).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.ChunkedMac createChunkedMac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        validateParameters(aesCmacKey.getParameters());
        return new com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl(aesCmacKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Mac createMac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        validateParameters(aesCmacKey.getParameters());
        return com.google.crypto.tink.subtle.PrfMac.create(aesCmacKey);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        com.google.crypto.tink.mac.internal.AesCmacProtoSerialization.register();
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.mac.AesCmacParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(MAC_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES_CMAC", com.google.crypto.tink.mac.PredefinedMacParameters.AES_CMAC);
        hashMap.put("AES256_CMAC", com.google.crypto.tink.mac.PredefinedMacParameters.AES_CMAC);
        hashMap.put("AES256_CMAC_RAW", com.google.crypto.tink.mac.AesCmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CmacTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.mac.AesCmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256CmacTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.AesCmacKeyManager$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.mac.AesCmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private AesCmacKeyManager() {
    }
}
