package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesGcmKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.AesGcmKey, com.google.crypto.tink.Aead> AES_GCM_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda5(), com.google.crypto.tink.aead.AesGcmKey.class, com.google.crypto.tink.Aead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesGcmKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.aead.AesGcmParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.aead.AesGcmKeyManager.createAesGcmKeyFromRandomness((com.google.crypto.tink.aead.AesGcmParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.AesGcmParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.aead.AesGcmKey createAesGcmKey;
            createAesGcmKey = com.google.crypto.tink.aead.AesGcmKeyManager.createAesGcmKey((com.google.crypto.tink.aead.AesGcmParameters) parameters, num);
            return createAesGcmKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    private static final void validate(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters) throws java.security.GeneralSecurityException {
        if (aesGcmParameters.getKeySizeBytes() == 24) {
            throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_GCM", com.google.crypto.tink.aead.PredefinedAeadParameters.AES128_GCM);
        hashMap.put("AES128_GCM_RAW", com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build());
        hashMap.put("AES256_GCM", com.google.crypto.tink.aead.PredefinedAeadParameters.AES256_GCM);
        hashMap.put("AES256_GCM_RAW", com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    static com.google.crypto.tink.aead.AesGcmKey createAesGcmKeyFromRandomness(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        validate(aesGcmParameters);
        return com.google.crypto.tink.aead.AesGcmKey.builder().setParameters(aesGcmParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, aesGcmParameters.getKeySizeBytes(), secretKeyAccess)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.AesGcmKey createAesGcmKey(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validate(aesGcmParameters);
        return com.google.crypto.tink.aead.AesGcmKey.builder().setParameters(aesGcmParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesGcmParameters.getKeySizeBytes())).build();
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.aead.internal.AesGcmProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_GCM_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.aead.AesGcmParameters.class);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.AesGcmParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyKeyManager, algorithmFipsCompatibility, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes128GcmTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256GcmTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private AesGcmKeyManager() {
    }
}
