package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class EcdsaSignKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.EcdsaPrivateKey, com.google.crypto.tink.PublicKeySign> PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda7(), com.google.crypto.tink.signature.EcdsaPrivateKey.class, com.google.crypto.tink.PublicKeySign.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.signature.EcdsaPublicKey, com.google.crypto.tink.PublicKeyVerify> PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda8(), com.google.crypto.tink.signature.EcdsaPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class);
    private static final com.google.crypto.tink.PrivateKeyManager<com.google.crypto.tink.PublicKeySign> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), com.google.crypto.tink.PublicKeySign.class, com.google.crypto.tink.proto.EcdsaPrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.PublicKeyVerify> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.signature.EcdsaVerifyKeyManager.getKeyType(), com.google.crypto.tink.PublicKeyVerify.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.EcdsaPublicKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.signature.EcdsaParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.signature.EcdsaSignKeyManager$$ExternalSyntheticLambda2
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.signature.EcdsaPrivateKey createKey;
            createKey = com.google.crypto.tink.signature.EcdsaSignKeyManager.createKey((com.google.crypto.tink.signature.EcdsaParameters) parameters, num);
            return createKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.EcdsaPrivateKey createKey(com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.KeyPair generateKeyPair = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(ecdsaParameters.getCurveType().toParameterSpec());
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) generateKeyPair.getPrivate();
        return com.google.crypto.tink.signature.EcdsaPrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey.builder().setParameters(ecdsaParameters).setIdRequirement(num).setPublicPoint(eCPublicKey.getW()).build()).setPrivateValue(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(eCPrivateKey.getS(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ECDSA_P256", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P256);
        hashMap.put("ECDSA_P256_IEEE_P1363", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P256_IEEE_P1363);
        hashMap.put("ECDSA_P256_RAW", com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX).build());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX);
        hashMap.put("ECDSA_P384", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P384);
        hashMap.put("ECDSA_P384_IEEE_P1363", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P384_IEEE_P1363);
        hashMap.put("ECDSA_P384_SHA512", com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build());
        hashMap.put("ECDSA_P384_SHA384", com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384).setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build());
        hashMap.put("ECDSA_P521", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P521);
        hashMap.put("ECDSA_P521_IEEE_P1363", com.google.crypto.tink.signature.PredefinedSignatureParameters.ECDSA_P521_IEEE_P1363);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_SIGN_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PUBLIC_KEY_VERIFY_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.signature.EcdsaParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPrivateKeyManager, algorithmFipsCompatibility, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPublicKeyManager, algorithmFipsCompatibility, false);
    }

    public static final com.google.crypto.tink.KeyTemplate ecdsaP256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.EcdsaSignKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.EcdsaParameters.builder().setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawEcdsaP256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.signature.EcdsaSignKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.signature.EcdsaParameters.builder().setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).setVariant(com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX).build());
                return createFrom;
            }
        });
    }

    private EcdsaSignKeyManager() {
    }
}
