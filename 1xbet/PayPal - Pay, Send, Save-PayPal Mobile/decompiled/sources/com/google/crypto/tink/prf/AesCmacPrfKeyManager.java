package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class AesCmacPrfKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.prf.AesCmacPrfKey, com.google.crypto.tink.prf.Prf> PRF_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.prf.Prf createPrimitive;
            createPrimitive = com.google.crypto.tink.prf.AesCmacPrfKeyManager.createPrimitive((com.google.crypto.tink.prf.AesCmacPrfKey) key);
            return createPrimitive;
        }
    }, com.google.crypto.tink.prf.AesCmacPrfKey.class, com.google.crypto.tink.prf.Prf.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.prf.Prf> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.prf.Prf.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesCmacPrfKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.prf.AesCmacPrfParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.prf.AesCmacPrfKey newKey;
            newKey = com.google.crypto.tink.prf.AesCmacPrfKeyManager.newKey((com.google.crypto.tink.prf.AesCmacPrfParameters) parameters, num);
            return newKey;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createPrimitive(com.google.crypto.tink.prf.AesCmacPrfKey aesCmacPrfKey) throws java.security.GeneralSecurityException {
        validate(aesCmacPrfKey.getParameters());
        return com.google.crypto.tink.subtle.PrfAesCmac.create(aesCmacPrfKey);
    }

    private static void validate(com.google.crypto.tink.prf.AesCmacPrfParameters aesCmacPrfParameters) throws java.security.GeneralSecurityException {
        if (aesCmacPrfParameters.getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("Key size must be 32 bytes");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.AesCmacPrfKey newKey(com.google.crypto.tink.prf.AesCmacPrfParameters aesCmacPrfParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (num != null) {
            throw new java.security.GeneralSecurityException("Id Requirement is not supported for AES CMAC PRF keys");
        }
        validate(aesCmacPrfParameters);
        return com.google.crypto.tink.prf.AesCmacPrfKey.create(aesCmacPrfParameters, com.google.crypto.tink.util.SecretBytes.randomBytes(aesCmacPrfParameters.getKeySizeBytes()));
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacPrfKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES256_CMAC_PRF", com.google.crypto.tink.prf.PredefinedPrfParameters.AES_CMAC_PRF);
        hashMap.put("AES_CMAC_PRF", com.google.crypto.tink.prf.PredefinedPrfParameters.AES_CMAC_PRF);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC PRF is not supported in FIPS mode");
        }
        com.google.crypto.tink.prf.internal.AesCmacPrfProtoSerialization.register();
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.prf.AesCmacPrfParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PRF_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CmacTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.prf.AesCmacPrfParameters.create(32));
                return createFrom;
            }
        });
    }

    private AesCmacPrfKeyManager() {
    }
}
