package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class HmacPrfKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.prf.HmacPrfKey, com.google.crypto.tink.prf.Prf> PRF_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda6(), com.google.crypto.tink.prf.HmacPrfKey.class, com.google.crypto.tink.prf.Prf.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.prf.Prf> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.prf.Prf.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.HmacPrfKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.prf.HmacPrfParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.prf.HmacPrfKey newKey;
            newKey = com.google.crypto.tink.prf.HmacPrfKeyManager.newKey((com.google.crypto.tink.prf.HmacPrfParameters) parameters, num);
            return newKey;
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.prf.HmacPrfParameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.prf.HmacPrfKeyManager.createHmacKeyFromRandomness((com.google.crypto.tink.prf.HmacPrfParameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.HmacPrfKey newKey(com.google.crypto.tink.prf.HmacPrfParameters hmacPrfParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (num != null) {
            throw new java.security.GeneralSecurityException("Id Requirement is not supported for HMAC PRF keys");
        }
        return com.google.crypto.tink.prf.HmacPrfKey.builder().setParameters(hmacPrfParameters).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(hmacPrfParameters.getKeySizeBytes())).build();
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacPrfKey";
    }

    static com.google.crypto.tink.prf.HmacPrfKey createHmacKeyFromRandomness(com.google.crypto.tink.prf.HmacPrfParameters hmacPrfParameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.prf.HmacPrfKey.builder().setParameters(hmacPrfParameters).setKeyBytes(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, hmacPrfParameters.getKeySizeBytes(), secretKeyAccess)).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("HMAC_SHA256_PRF", com.google.crypto.tink.prf.PredefinedPrfParameters.HMAC_SHA256_PRF);
        hashMap.put("HMAC_SHA512_PRF", com.google.crypto.tink.prf.PredefinedPrfParameters.HMAC_SHA512_PRF);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.prf.internal.HmacPrfProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PRF_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.prf.HmacPrfParameters.class);
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.prf.HmacPrfParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyKeyManager, algorithmFipsCompatibility, z);
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.prf.HmacPrfParameters.builder().setKeySizeBytes(32).setHashType(com.google.crypto.tink.prf.HmacPrfParameters.HashType.SHA256).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha512Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.prf.HmacPrfParameters.builder().setKeySizeBytes(64).setHashType(com.google.crypto.tink.prf.HmacPrfParameters.HashType.SHA512).build());
                return createFrom;
            }
        });
    }

    private HmacPrfKeyManager() {
    }
}
