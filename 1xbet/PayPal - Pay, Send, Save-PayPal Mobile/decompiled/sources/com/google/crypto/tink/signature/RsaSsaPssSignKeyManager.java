package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPssSignKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.RsaSsaPssPrivateKey, com.google.crypto.tink.PublicKeySign> PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda5(), com.google.crypto.tink.signature.RsaSsaPssPrivateKey.class, com.google.crypto.tink.PublicKeySign.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.RsaSsaPssPublicKey, com.google.crypto.tink.PublicKeyVerify> PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda6(), com.google.crypto.tink.signature.RsaSsaPssPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class);
    private static final com.google.crypto.tink.PrivateKeyManager<com.google.crypto.tink.PublicKeySign> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), com.google.crypto.tink.PublicKeySign.class, com.google.crypto.tink.proto.RsaSsaPssPrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.PublicKeyVerify> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager.getKeyType(), com.google.crypto.tink.PublicKeyVerify.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.RsaSsaPssPublicKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.signature.RsaSsaPssParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.signature.RsaSsaPssPrivateKey createKey;
            createKey = com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.createKey((com.google.crypto.tink.signature.RsaSsaPssParameters) parameters, num);
            return createKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPssPrivateKey createKey(com.google.crypto.tink.signature.RsaSsaPssParameters rsaSsaPssParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.KeyPairGenerator engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
        engineFactory.initialize(new java.security.spec.RSAKeyGenParameterSpec(rsaSsaPssParameters.getModulusSizeBits(), new java.math.BigInteger(1, rsaSsaPssParameters.getPublicExponent().toByteArray())));
        java.security.KeyPair generateKeyPair = engineFactory.generateKeyPair();
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) generateKeyPair.getPrivate();
        return com.google.crypto.tink.signature.RsaSsaPssPrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.RsaSsaPssPublicKey.builder().setParameters(rsaSsaPssParameters).setModulus(rSAPublicKey.getModulus()).setIdRequirement(num).build()).setPrimes(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrivateExponent(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getCrtCoefficient(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setSaltLengthBytes(32).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).build());
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setSaltLengthBytes(32).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build());
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", com.google.crypto.tink.signature.PredefinedSignatureParameters.RSA_SSA_PSS_3072_SHA256_SHA256_32_F4);
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setSaltLengthBytes(64).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).build());
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setSaltLengthBytes(64).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build());
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", com.google.crypto.tink.signature.PredefinedSignatureParameters.RSA_SSA_PSS_4096_SHA512_SHA512_64_F4);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.signature.RsaSsaPssParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPrivateKeyManager, algorithmFipsCompatibility, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPublicKeyManager, algorithmFipsCompatibility, false);
    }

    public static final com.google.crypto.tink.KeyTemplate rsa3072PssSha256F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setSaltLengthBytes(32).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa3072PssSha256F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).setSaltLengthBytes(32).setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rsa4096PssSha512F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setSaltLengthBytes(64).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawRsa4096PssSha512F4Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setSigHashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setMgf1HashType(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).setSaltLengthBytes(64).setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.signature.RsaSsaPssParameters.F4).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private RsaSsaPssSignKeyManager() {
    }
}
