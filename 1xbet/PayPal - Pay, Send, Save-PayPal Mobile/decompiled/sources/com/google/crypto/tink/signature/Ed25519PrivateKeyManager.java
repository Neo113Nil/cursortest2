package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class Ed25519PrivateKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.Ed25519PrivateKey, com.google.crypto.tink.PublicKeySign> PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda1(), com.google.crypto.tink.signature.Ed25519PrivateKey.class, com.google.crypto.tink.PublicKeySign.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.Ed25519PublicKey, com.google.crypto.tink.PublicKeyVerify> PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda2(), com.google.crypto.tink.signature.Ed25519PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class);
    private static final com.google.crypto.tink.PrivateKeyManager<com.google.crypto.tink.PublicKeySign> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), com.google.crypto.tink.PublicKeySign.class, com.google.crypto.tink.proto.Ed25519PrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.PublicKeyVerify> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.signature.Ed25519PublicKeyManager.getKeyType(), com.google.crypto.tink.PublicKeyVerify.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.Ed25519PublicKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator<com.google.crypto.tink.signature.Ed25519Parameters> KEY_DERIVER = new com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator() { // from class: com.google.crypto.tink.signature.Ed25519PrivateKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyDerivationRegistry.InsecureKeyCreator
        public final com.google.crypto.tink.Key createKeyFromRandomness(com.google.crypto.tink.Parameters parameters, java.io.InputStream inputStream, java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
            return com.google.crypto.tink.signature.Ed25519PrivateKeyManager.createEd25519KeyFromRandomness((com.google.crypto.tink.signature.Ed25519Parameters) parameters, inputStream, num, secretKeyAccess);
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.signature.Ed25519Parameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.signature.Ed25519PrivateKeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            return com.google.crypto.tink.signature.Ed25519PrivateKeyManager.createEd25519Key((com.google.crypto.tink.signature.Ed25519Parameters) parameters, num);
        }
    };

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    static com.google.crypto.tink.signature.Ed25519PrivateKey createEd25519KeyFromRandomness(com.google.crypto.tink.signature.Ed25519Parameters ed25519Parameters, java.io.InputStream inputStream, @javax.annotation.Nullable java.lang.Integer num, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPairFromSeed = com.google.crypto.tink.subtle.Ed25519Sign.KeyPair.newKeyPairFromSeed(com.google.crypto.tink.internal.Util.readIntoSecretBytes(inputStream, 32, secretKeyAccess).toByteArray(secretKeyAccess));
        return com.google.crypto.tink.signature.Ed25519PrivateKey.create(com.google.crypto.tink.signature.Ed25519PublicKey.create(ed25519Parameters.getVariant(), com.google.crypto.tink.util.Bytes.copyFrom(newKeyPairFromSeed.getPublicKey()), num), com.google.crypto.tink.util.SecretBytes.copyFrom(newKeyPairFromSeed.getPrivateKey(), secretKeyAccess));
    }

    static com.google.crypto.tink.signature.Ed25519PrivateKey createEd25519Key(com.google.crypto.tink.signature.Ed25519Parameters ed25519Parameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPair = com.google.crypto.tink.subtle.Ed25519Sign.KeyPair.newKeyPair();
        return com.google.crypto.tink.signature.Ed25519PrivateKey.create(com.google.crypto.tink.signature.Ed25519PublicKey.create(ed25519Parameters.getVariant(), com.google.crypto.tink.util.Bytes.copyFrom(newKeyPair.getPublicKey()), num), com.google.crypto.tink.util.SecretBytes.copyFrom(newKeyPair.getPrivateKey(), com.google.crypto.tink.InsecureSecretKeyAccess.get()));
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ED25519", com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.TINK));
        hashMap.put("ED25519_RAW", com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX));
        hashMap.put("ED25519WithRawOutput", com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX));
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        com.google.crypto.tink.signature.internal.Ed25519ProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.signature.Ed25519Parameters.class);
        com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().add(KEY_DERIVER, com.google.crypto.tink.signature.Ed25519Parameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyPrivateKeyManager, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyPublicKeyManager, false);
    }

    public static final com.google.crypto.tink.KeyTemplate ed25519Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.Ed25519PrivateKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.TINK));
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawEd25519Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.Ed25519PrivateKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.Ed25519Parameters.create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX));
                return createFrom;
            }
        });
    }

    private Ed25519PrivateKeyManager() {
    }
}
