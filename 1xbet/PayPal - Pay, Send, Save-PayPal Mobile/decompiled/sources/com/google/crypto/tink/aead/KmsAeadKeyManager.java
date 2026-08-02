package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class KmsAeadKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.LegacyKmsAeadKey, com.google.crypto.tink.Aead> LEGACY_KMS_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.KmsAeadKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.Aead create;
            create = com.google.crypto.tink.aead.KmsAeadKeyManager.create((com.google.crypto.tink.aead.LegacyKmsAeadKey) key);
            return create;
        }
    }, com.google.crypto.tink.aead.LegacyKmsAeadKey.class, com.google.crypto.tink.Aead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE, com.google.crypto.tink.proto.KmsAeadKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.LegacyKmsAeadParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.KmsAeadKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.aead.LegacyKmsAeadKey newKey;
            newKey = com.google.crypto.tink.aead.KmsAeadKeyManager.newKey((com.google.crypto.tink.aead.LegacyKmsAeadParameters) parameters, num);
            return newKey;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.LegacyKmsAeadKey legacyKmsAeadKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.internal.LegacyFullAead.create(com.google.crypto.tink.KmsClients.get(legacyKmsAeadKey.getParameters().keyUri()).getAead(legacyKmsAeadKey.getParameters().keyUri()), legacyKmsAeadKey.getOutputPrefix());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.LegacyKmsAeadKey newKey(com.google.crypto.tink.aead.LegacyKmsAeadParameters legacyKmsAeadParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.LegacyKmsAeadKey.create(legacyKmsAeadParameters, num);
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        com.google.crypto.tink.aead.LegacyKmsAeadProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_KMS_AEAD_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.LegacyKmsAeadParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static com.google.crypto.tink.KeyTemplate createKeyTemplate(java.lang.String str) {
        try {
            return com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.LegacyKmsAeadParameters.create(str));
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    private KmsAeadKeyManager() {
    }
}
