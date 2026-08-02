package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public class HkdfPrfKeyManager {
    private static final int MIN_KEY_SIZE = 32;
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.subtle.prf.StreamingPrf> STREAMING_HKDF_PRF_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.subtle.prf.StreamingPrf createStreamingPrf;
            createStreamingPrf = com.google.crypto.tink.prf.HkdfPrfKeyManager.createStreamingPrf((com.google.crypto.tink.prf.HkdfPrfKey) key);
            return createStreamingPrf;
        }
    }, com.google.crypto.tink.prf.HkdfPrfKey.class, com.google.crypto.tink.subtle.prf.StreamingPrf.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.prf.Prf> HKDF_PRF_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.prf.Prf createPrf;
            createPrf = com.google.crypto.tink.prf.HkdfPrfKeyManager.createPrf((com.google.crypto.tink.prf.HkdfPrfKey) key);
            return createPrf;
        }
    }, com.google.crypto.tink.prf.HkdfPrfKey.class, com.google.crypto.tink.prf.Prf.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.prf.Prf> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.prf.Prf.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.HkdfPrfKey.parser());
    static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.prf.HkdfPrfParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.prf.HkdfPrfKey newKey;
            newKey = com.google.crypto.tink.prf.HkdfPrfKeyManager.newKey((com.google.crypto.tink.prf.HkdfPrfParameters) parameters, num);
            return newKey;
        }
    };

    private static void validate(com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters) throws java.security.GeneralSecurityException {
        if (hkdfPrfParameters.getKeySizeBytes() < 32) {
            throw new java.security.GeneralSecurityException("Key size must be at least 32");
        }
        if (hkdfPrfParameters.getHashType() != com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256 && hkdfPrfParameters.getHashType() != com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512) {
            throw new java.security.GeneralSecurityException("Hash type must be SHA256 or SHA512");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.subtle.prf.StreamingPrf createStreamingPrf(com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey) throws java.security.GeneralSecurityException {
        validate(hkdfPrfKey.getParameters());
        return com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.create(hkdfPrfKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createPrf(com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.prf.PrfImpl.wrap(createStreamingPrf(hkdfPrfKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.HkdfPrfKey newKey(com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (num != null) {
            throw new java.security.GeneralSecurityException("Id Requirement is not supported for HKDF PRF keys");
        }
        validate(hkdfPrfParameters);
        return com.google.crypto.tink.prf.HkdfPrfKey.builder().setParameters(hkdfPrfParameters).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(hkdfPrfParameters.getKeySizeBytes())).build();
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("HKDF_SHA256", com.google.crypto.tink.prf.PredefinedPrfParameters.HKDF_SHA256);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering HKDF PRF is not supported in FIPS mode");
        }
        com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(HKDF_PRF_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(STREAMING_HKDF_PRF_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.prf.HkdfPrfParameters.class);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static java.lang.String staticKeyType() {
        return getKeyType();
    }

    public static final com.google.crypto.tink.KeyTemplate hkdfSha256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.prf.HkdfPrfParameters.builder().setKeySizeBytes(32).setHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256).build());
                return createFrom;
            }
        });
    }

    private HkdfPrfKeyManager() {
    }
}
