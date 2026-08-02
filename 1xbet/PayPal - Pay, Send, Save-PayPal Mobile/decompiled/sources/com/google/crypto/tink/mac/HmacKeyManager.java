package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public final class HmacKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.mac.ChunkedMac> CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda3(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.Mac> MAC_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda0(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.Mac.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Mac> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create("type.googleapis.com/google.crypto.tink.HmacKey", com.google.crypto.tink.Mac.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.HmacKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.mac.HmacParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.mac.HmacKeyManager.createHmacKeyFromRandomness((com.google.crypto.tink.mac.HmacParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.mac.HmacParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            return com.google.crypto.tink.mac.HmacKeyManager.createNewHmacKey((com.google.crypto.tink.mac.HmacParameters) parameters, num);
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    static com.google.crypto.tink.mac.HmacKey createHmacKeyFromRandomness(com.google.crypto.tink.mac.HmacParameters hmacParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.mac.HmacKey.builder().setParameters(hmacParameters).setKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, hmacParameters.getKeySizeBytes(), secretKeyAccess)).setIdRequirement(num).build();
    }

    static com.google.crypto.tink.mac.HmacKey createNewHmacKey(com.google.crypto.tink.mac.HmacParameters hmacParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.mac.HmacKey.builder().setParameters(hmacParameters).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(hmacParameters.getKeySizeBytes())).setIdRequirement(num).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", com.google.crypto.tink.mac.PredefinedMacParameters.HMAC_SHA256_128BITTAG);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).build());
        hashMap.put("HMAC_SHA256_256BITTAG", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(32).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).build());
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(32).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).build());
        hashMap.put("HMAC_SHA512_128BITTAG", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build());
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(16).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build());
        hashMap.put("HMAC_SHA512_256BITTAG", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(32).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build());
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(32).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build());
        hashMap.put("HMAC_SHA512_512BITTAG", com.google.crypto.tink.mac.PredefinedMacParameters.HMAC_SHA512_512BITTAG);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(64).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.mac.internal.HmacProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(MAC_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.mac.HmacParameters.class);
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.mac.HmacParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyKeyManager, algorithmFipsCompatibility, z);
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha256HalfDigestTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(32).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha512HalfDigestTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(32).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha512Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(64).setHashType(com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).setVariant(com.google.crypto.tink.mac.HmacParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    private HmacKeyManager() {
    }
}
