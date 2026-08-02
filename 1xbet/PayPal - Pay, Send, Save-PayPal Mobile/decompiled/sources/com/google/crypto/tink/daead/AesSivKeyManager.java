package com.google.crypto.tink.daead;

/* loaded from: classes4.dex */
public final class AesSivKeyManager {
    private static final int KEY_SIZE_IN_BYTES = 64;
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.daead.AesSivKey, com.google.crypto.tink.DeterministicAead> AES_SIV_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.DeterministicAead createDeterministicAead;
            createDeterministicAead = com.google.crypto.tink.daead.AesSivKeyManager.createDeterministicAead((com.google.crypto.tink.daead.AesSivKey) key);
            return createDeterministicAead;
        }
    }, com.google.crypto.tink.daead.AesSivKey.class, com.google.crypto.tink.DeterministicAead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.DeterministicAead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.DeterministicAead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.AesSivKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.daead.AesSivParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.daead.AesSivKeyManager.createAesSivKeyFromRandomness((com.google.crypto.tink.daead.AesSivParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.daead.AesSivParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            return com.google.crypto.tink.daead.AesSivKeyManager.newKey((com.google.crypto.tink.daead.AesSivParameters) parameters, num);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.DeterministicAead createDeterministicAead(com.google.crypto.tink.daead.AesSivKey aesSivKey) throws java.security.GeneralSecurityException {
        validateParameters(aesSivKey.getParameters());
        return com.google.crypto.tink.subtle.AesSiv.create(aesSivKey);
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    private static void validateParameters(com.google.crypto.tink.daead.AesSivParameters aesSivParameters) throws java.security.GeneralSecurityException {
        if (aesSivParameters.getKeySizeBytes() == 64) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key size: ");
        sb.append(aesSivParameters.getKeySizeBytes());
        sb.append(". Valid keys must have 64 bytes.");
        throw new java.security.InvalidAlgorithmParameterException(sb.toString());
    }

    static com.google.crypto.tink.daead.AesSivKey createAesSivKeyFromRandomness(com.google.crypto.tink.daead.AesSivParameters aesSivParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        validateParameters(aesSivParameters);
        return com.google.crypto.tink.daead.AesSivKey.builder().setParameters(aesSivParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, aesSivParameters.getKeySizeBytes(), secretKeyAccess)).build();
    }

    static com.google.crypto.tink.daead.AesSivKey newKey(com.google.crypto.tink.daead.AesSivParameters aesSivParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validateParameters(aesSivParameters);
        return com.google.crypto.tink.daead.AesSivKey.builder().setParameters(aesSivParameters).setIdRequirement(num).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(aesSivParameters.getKeySizeBytes())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AES256_SIV", com.google.crypto.tink.daead.PredefinedDeterministicAeadParameters.AES256_SIV);
        hashMap.put("AES256_SIV_RAW", com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(64).setVariant(com.google.crypto.tink.daead.AesSivParameters.Variant.NO_PREFIX).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        com.google.crypto.tink.daead.internal.AesSivProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(AES_SIV_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.daead.AesSivParameters.class);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.daead.AesSivParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate aes256SivTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(64).setVariant(com.google.crypto.tink.daead.AesSivParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256SivTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(64).setVariant(com.google.crypto.tink.daead.AesSivParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private AesSivKeyManager() {
    }
}
