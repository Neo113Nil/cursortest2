package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesEaxKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.AesEaxKey, com.google.crypto.tink.Aead> AES_EAX_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda9(), com.google.crypto.tink.aead.AesEaxKey.class, com.google.crypto.tink.Aead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesEaxKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.AesEaxParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.AesEaxKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.aead.AesEaxKey createAesEaxKey;
            createAesEaxKey = com.google.crypto.tink.aead.AesEaxKeyManager.createAesEaxKey((com.google.crypto.tink.aead.AesEaxParameters) parameters, num);
            return createAesEaxKey;
        }
    };

    private static final void validate(com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters) throws java.security.GeneralSecurityException {
        if (aesEaxParameters.getKeySizeBytes() == 24) {
            throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_EAX", com.google.crypto.tink.aead.PredefinedAeadParameters.AES128_EAX);
        hashMap.put("AES128_EAX_RAW", com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX).build());
        hashMap.put("AES256_EAX", com.google.crypto.tink.aead.PredefinedAeadParameters.AES256_EAX);
        hashMap.put("AES256_EAX_RAW", com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.AesEaxKey createAesEaxKey(com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validate(aesEaxParameters);
        return com.google.crypto.tink.aead.AesEaxKey.builder().setParameters(aesEaxParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesEaxParameters.getKeySizeBytes())).build();
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        com.google.crypto.tink.aead.internal.AesEaxProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_EAX_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.AesEaxParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes128EaxTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesEaxKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes128EaxTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesEaxKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256EaxTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesEaxKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256EaxTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesEaxKeyManager$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(16).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private AesEaxKeyManager() {
    }
}
