package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public final class AesGcmHkdfStreamingKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey, com.google.crypto.tink.StreamingAead> AES_GCM_HKDF_STREAMING_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda14(), com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey.class, com.google.crypto.tink.StreamingAead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.StreamingAead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.StreamingAead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesGcmHkdfStreamingKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey creatAesGcmHkdfStreamingKey;
            creatAesGcmHkdfStreamingKey = com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.creatAesGcmHkdfStreamingKey((com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) parameters, num);
            return creatAesGcmHkdfStreamingKey;
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.createAesGcmHkdfStreamingKeyFromRandomness((com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey creatAesGcmHkdfStreamingKey(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters aesGcmHkdfStreamingParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey.create(aesGcmHkdfStreamingParameters, com.google.crypto.tink.util.SecretBytes.randomBytes(aesGcmHkdfStreamingParameters.getKeySizeBytes()));
    }

    static com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey createAesGcmHkdfStreamingKeyFromRandomness(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters aesGcmHkdfStreamingParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey.create(aesGcmHkdfStreamingParameters, com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, aesGcmHkdfStreamingParameters.getKeySizeBytes(), secretKeyAccess));
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_GCM_HKDF_4KB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES128_GCM_HKDF_4KB);
        hashMap.put("AES128_GCM_HKDF_1MB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES128_GCM_HKDF_1MB);
        hashMap.put("AES256_GCM_HKDF_4KB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES256_GCM_HKDF_4KB);
        hashMap.put("AES256_GCM_HKDF_1MB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES256_GCM_HKDF_1MB);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        com.google.crypto.tink.streamingaead.internal.AesGcmHkdfStreamingProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.class);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_GCM_HKDF_STREAMING_AEAD_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmHkdf4KBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(16).setDerivedAesGcmKeySizeBytes(16).setCiphertextSegmentSizeBytes(4096).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmHkdf1MBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(16).setDerivedAesGcmKeySizeBytes(16).setCiphertextSegmentSizeBytes(1048576).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmHkdf4KBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(32).setDerivedAesGcmKeySizeBytes(32).setCiphertextSegmentSizeBytes(4096).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmHkdf1MBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.builder().setKeySizeBytes(32).setDerivedAesGcmKeySizeBytes(32).setCiphertextSegmentSizeBytes(1048576).setHkdfHashType(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingParameters.HashType.SHA256).build());
                return createFrom;
            }
        });
    }

    private AesGcmHkdfStreamingKeyManager() {
    }
}
