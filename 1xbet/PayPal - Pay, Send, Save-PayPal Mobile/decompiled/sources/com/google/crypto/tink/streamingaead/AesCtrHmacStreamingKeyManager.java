package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public final class AesCtrHmacStreamingKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey, com.google.crypto.tink.StreamingAead> AES_CTR_HMAC_STREAMING_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda13(), com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.class, com.google.crypto.tink.StreamingAead.class);
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey createAesCtrHmacStreamingKey;
            createAesCtrHmacStreamingKey = com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.createAesCtrHmacStreamingKey((com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) parameters, num);
            return createAesCtrHmacStreamingKey;
        }
    };
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.StreamingAead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.StreamingAead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesCtrHmacStreamingKey.parser());

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey createAesCtrHmacStreamingKey(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters aesCtrHmacStreamingParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.create(aesCtrHmacStreamingParameters, com.google.crypto.tink.util.SecretBytes.randomBytes(aesCtrHmacStreamingParameters.getKeySizeBytes()));
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256_4KB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES128_CTR_HMAC_SHA256_4KB);
        hashMap.put("AES128_CTR_HMAC_SHA256_1MB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES128_CTR_HMAC_SHA256_1MB);
        hashMap.put("AES256_CTR_HMAC_SHA256_4KB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES256_CTR_HMAC_SHA256_4KB);
        hashMap.put("AES256_CTR_HMAC_SHA256_1MB", com.google.crypto.tink.streamingaead.PredefinedStreamingAeadParameters.AES256_CTR_HMAC_SHA256_1MB);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_CTR_HMAC_STREAMING_AEAD_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes128CtrHmacSha2564KBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(16).setDerivedKeySizeBytes(16).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(4096).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes128CtrHmacSha2561MBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(16).setDerivedKeySizeBytes(16).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(1048576).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CtrHmacSha2564KBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(32).setDerivedKeySizeBytes(32).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(4096).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CtrHmacSha2561MBTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(32).setDerivedKeySizeBytes(32).setHkdfHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256).setHmacTagSizeBytes(32).setCiphertextSegmentSizeBytes(1048576).build());
                return createFrom;
            }
        });
    }

    private AesCtrHmacStreamingKeyManager() {
    }
}
