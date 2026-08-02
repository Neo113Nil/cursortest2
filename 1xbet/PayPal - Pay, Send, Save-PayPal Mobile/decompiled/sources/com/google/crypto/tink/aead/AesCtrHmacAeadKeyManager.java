package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesCtrHmacAeadKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.AesCtrHmacAeadKey, com.google.crypto.tink.Aead> AES_CTR_HMAC_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda4(), com.google.crypto.tink.aead.AesCtrHmacAeadKey.class, com.google.crypto.tink.Aead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesCtrHmacAeadKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.aead.AesCtrHmacAeadParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.createAesCtrHmacAeadKeyFromRandomness((com.google.crypto.tink.aead.AesCtrHmacAeadParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.AesCtrHmacAeadParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.createAesCtrHmacAeadKey((com.google.crypto.tink.aead.AesCtrHmacAeadParameters) parameters, num);
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    private static void validate(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters) throws java.security.GeneralSecurityException {
        if (aesCtrHmacAeadParameters.getAesKeySizeBytes() != 16 && aesCtrHmacAeadParameters.getAesKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    static com.google.crypto.tink.aead.AesCtrHmacAeadKey createAesCtrHmacAeadKeyFromRandomness(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesCtrHmacAeadKey.builder().setParameters(aesCtrHmacAeadParameters).setIdRequirement(num).setAesKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, aesCtrHmacAeadParameters.getAesKeySizeBytes(), secretKeyAccess)).setHmacKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, aesCtrHmacAeadParameters.getHmacKeySizeBytes(), secretKeyAccess)).build();
    }

    static com.google.crypto.tink.aead.AesCtrHmacAeadKey createAesCtrHmacAeadKey(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validate(aesCtrHmacAeadParameters);
        return com.google.crypto.tink.aead.AesCtrHmacAeadKey.builder().setParameters(aesCtrHmacAeadParameters).setIdRequirement(num).setAesKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesCtrHmacAeadParameters.getAesKeySizeBytes())).setHmacKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesCtrHmacAeadParameters.getHmacKeySizeBytes())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", com.google.crypto.tink.aead.PredefinedAeadParameters.AES128_CTR_HMAC_SHA256);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build());
        hashMap.put("AES256_CTR_HMAC_SHA256", com.google.crypto.tink.aead.PredefinedAeadParameters.AES256_CTR_HMAC_SHA256);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(32).setHmacKeySizeBytes(32).setTagSizeBytes(32).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_CTR_HMAC_AEAD_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.aead.AesCtrHmacAeadParameters.class);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.AesCtrHmacAeadParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyKeyManager, algorithmFipsCompatibility, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes128CtrHmacSha256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setIvSizeBytes(16).setTagSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate aes256CtrHmacSha256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(32).setHmacKeySizeBytes(32).setIvSizeBytes(16).setTagSizeBytes(32).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    private AesCtrHmacAeadKeyManager() {
    }
}
