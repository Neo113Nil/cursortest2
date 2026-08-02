package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class XChaCha20Poly1305KeyManager {
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.XChaCha20Poly1305Key, com.google.crypto.tink.Aead> X_CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.Aead createAead;
            createAead = com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.createAead((com.google.crypto.tink.aead.XChaCha20Poly1305Key) key);
            return createAead;
        }
    }, com.google.crypto.tink.aead.XChaCha20Poly1305Key.class, com.google.crypto.tink.Aead.class);
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.XChaCha20Poly1305Key.parser());
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.aead.XChaCha20Poly1305Parameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.createXChaChaKeyFromRandomness((com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.XChaCha20Poly1305Parameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            return com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.createXChaChaKey((com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) parameters, num);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Aead createAead(com.google.crypto.tink.aead.XChaCha20Poly1305Key xChaCha20Poly1305Key) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.internal.XChaCha20Poly1305Jce.isSupported()) {
            return com.google.crypto.tink.aead.internal.XChaCha20Poly1305Jce.create(xChaCha20Poly1305Key);
        }
        return com.google.crypto.tink.subtle.XChaCha20Poly1305.create(xChaCha20Poly1305Key);
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    static com.google.crypto.tink.aead.XChaCha20Poly1305Key createXChaChaKeyFromRandomness(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters xChaCha20Poly1305Parameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.XChaCha20Poly1305Key.create(xChaCha20Poly1305Parameters.getVariant(), com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, 32, secretKeyAccess), num);
    }

    static com.google.crypto.tink.aead.XChaCha20Poly1305Key createXChaChaKey(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters xChaCha20Poly1305Parameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.XChaCha20Poly1305Key.create(xChaCha20Poly1305Parameters.getVariant(), com.google.crypto.tink.util.SecretBytes.randomBytes(32), num);
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("XCHACHA20_POLY1305", com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK));
        hashMap.put("XCHACHA20_POLY1305_RAW", com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX));
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(X_CHA_CHA_20_POLY_1305_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.class);
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    public static final com.google.crypto.tink.KeyTemplate xChaCha20Poly1305Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK));
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawXChaCha20Poly1305Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX));
                return createFrom;
            }
        });
    }

    private XChaCha20Poly1305KeyManager() {
    }
}
