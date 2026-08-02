package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesGcmSivKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.AesGcmSivKey, com.google.crypto.tink.Aead> AES_GCM_SIV_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda10(), com.google.crypto.tink.aead.AesGcmSivKey.class, com.google.crypto.tink.Aead.class);
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.AesGcmSivParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.aead.AesGcmSivKey createAesGcmSivKey;
            createAesGcmSivKey = com.google.crypto.tink.aead.AesGcmSivKeyManager.createAesGcmSivKey((com.google.crypto.tink.aead.AesGcmSivParameters) parameters, num);
            return createAesGcmSivKey;
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.aead.AesGcmSivParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.aead.AesGcmSivKeyManager.createAesGcmSivKeyFromRandomness((com.google.crypto.tink.aead.AesGcmSivParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesGcmSivKey.parser());

    static com.google.crypto.tink.aead.AesGcmSivKey createAesGcmSivKeyFromRandomness(com.google.crypto.tink.aead.AesGcmSivParameters aesGcmSivParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesGcmSivKey.builder().setParameters(aesGcmSivParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, aesGcmSivParameters.getKeySizeBytes(), secretKeyAccess)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.AesGcmSivKey createAesGcmSivKey(com.google.crypto.tink.aead.AesGcmSivParameters aesGcmSivParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesGcmSivKey.builder().setParameters(aesGcmSivParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesGcmSivParameters.getKeySizeBytes())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_GCM_SIV", com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.TINK).build());
        hashMap.put("AES128_GCM_SIV_RAW", com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX).build());
        hashMap.put("AES256_GCM_SIV", com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(32).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.TINK).build());
        hashMap.put("AES256_GCM_SIV_RAW", com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(32).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        com.google.crypto.tink.aead.internal.AesGcmSivProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.aead.AesGcmSivParameters.class);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.AesGcmSivParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_GCM_SIV_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmSivTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes128GcmSivTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmSivTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(32).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256GcmSivTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(32).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private AesGcmSivKeyManager() {
    }
}
