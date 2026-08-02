package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPkcs1SignKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey, com.google.crypto.tink.PublicKeySign> PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda3(), com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.PublicKeySign.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey, com.google.crypto.tink.PublicKeyVerify> PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda4(), com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class);
    private static final com.google.crypto.tink.PrivateKeyManager<com.google.crypto.tink.PublicKeySign> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), com.google.crypto.tink.PublicKeySign.class, com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.PublicKeyVerify> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager.getKeyType(), com.google.crypto.tink.PublicKeyVerify.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.signature.RsaSsaPkcs1Parameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey createKey;
            createKey = com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.createKey((com.google.crypto.tink.signature.RsaSsaPkcs1Parameters) parameters, num);
            return createKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey createKey(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters rsaSsaPkcs1Parameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.KeyPairGenerator engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
        engineFactory.initialize(new java.security.spec.RSAKeyGenParameterSpec(rsaSsaPkcs1Parameters.getModulusSizeBits(), new java.math.BigInteger(1, rsaSsaPkcs1Parameters.getPublicExponent().toByteArray())));
        java.security.KeyPair generateKeyPair = engineFactory.generateKeyPair();
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) generateKeyPair.getPrivate();
        return com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.builder().setParameters(rsaSsaPkcs1Parameters).setModulus(rSAPublicKey.getModulus()).setIdRequirement(num).build()).setPrimes(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrivateExponent(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getCrtCoefficient(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", com.google.crypto.tink.signature.PredefinedSignatureParameters.RSA_SSA_PKCS1_3072_SHA256_F4);
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build());
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", com.google.crypto.tink.signature.PredefinedSignatureParameters.RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", com.google.crypto.tink.signature.PredefinedSignatureParameters.RSA_SSA_PKCS1_4096_SHA512_F4);
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build());
        return hashMap;
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPrivateKeyManager, algorithmFipsCompatibility, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPublicKeyManager, algorithmFipsCompatibility, false);
    }

    public static final com.google.crypto.tink.KeyTemplate rsa3072SsaPkcs1Sha256F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa3072SsaPkcs1Sha256F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rsa4096SsaPkcs1Sha512F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa4096SsaPkcs1Sha512F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.F4).setHashType(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private RsaSsaPkcs1SignKeyManager() {
    }
}
