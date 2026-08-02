package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtEcdsaSignKeyManager {
    private static final com.google.crypto.tink.PrivateKeyManager<java.lang.Void> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), java.lang.Void.class, com.google.crypto.tink.proto.JwtEcdsaPrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<java.lang.Void> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.getKeyType(), java.lang.Void.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.JwtEcdsaPublicKey.parser());
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.jwt.JwtEcdsaPrivateKey, com.google.crypto.tink.jwt.JwtPublicKeySign> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager.createFullPrimitive((com.google.crypto.tink.jwt.JwtEcdsaPrivateKey) key);
        }
    }, com.google.crypto.tink.jwt.JwtEcdsaPrivateKey.class, com.google.crypto.tink.jwt.JwtPublicKeySign.class);
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.jwt.JwtEcdsaParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.jwt.JwtEcdsaPrivateKey createKey;
            createKey = com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager.createKey((com.google.crypto.tink.jwt.JwtEcdsaParameters) parameters, num);
            return createKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    private static com.google.crypto.tink.signature.EcdsaPrivateKey toEcdsaPrivateKey(com.google.crypto.tink.jwt.JwtEcdsaPrivateKey jwtEcdsaPrivateKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.EcdsaPrivateKey.builder().setPublicKey(com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.toEcdsaPublicKey(jwtEcdsaPrivateKey.getPublicKey())).setPrivateValue(jwtEcdsaPrivateKey.getPrivateValue()).build();
    }

    static com.google.crypto.tink.jwt.JwtPublicKeySign createFullPrimitive(final com.google.crypto.tink.jwt.JwtEcdsaPrivateKey jwtEcdsaPrivateKey) throws java.security.GeneralSecurityException {
        final com.google.crypto.tink.PublicKeySign create = com.google.crypto.tink.subtle.EcdsaSignJce.create(toEcdsaPrivateKey(jwtEcdsaPrivateKey));
        final java.lang.String standardName = jwtEcdsaPrivateKey.getParameters().getAlgorithm().getStandardName();
        return new com.google.crypto.tink.jwt.JwtPublicKeySign() { // from class: com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager.1
            @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
            public java.lang.String signAndEncode(com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.GeneralSecurityException {
                java.lang.String createUnsignedCompact = com.google.crypto.tink.jwt.JwtFormat.createUnsignedCompact(standardName, jwtEcdsaPrivateKey.getPublicKey().getKid(), rawJwt);
                return com.google.crypto.tink.jwt.JwtFormat.createSignedCompact(createUnsignedCompact, create.sign(createUnsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII)));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtEcdsaPrivateKey createKey(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.KeyPair generateKeyPair = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(jwtEcdsaParameters.getAlgorithm().getECParameterSpec());
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) generateKeyPair.getPrivate();
        com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder publicPoint = com.google.crypto.tink.jwt.JwtEcdsaPublicKey.builder().setParameters(jwtEcdsaParameters).setPublicPoint(eCPublicKey.getW());
        if (num != null) {
            publicPoint.setIdRequirement(num);
        }
        return com.google.crypto.tink.jwt.JwtEcdsaPrivateKey.create(publicPoint.build(), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(eCPrivateKey.getS(), com.google.crypto.tink.InsecureSecretKeyAccess.get()));
    }

    private JwtEcdsaSignKeyManager() {
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtEcdsaPrivateKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("JWT_ES256_RAW", com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256).setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_ES256", com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256).setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_ES384_RAW", com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384).setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_ES384", com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384).setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_ES512_RAW", com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512).setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_ES512", com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512).setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPrivateKeyManager, algorithmFipsCompatibility, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPublicKeyManager, algorithmFipsCompatibility, false);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.jwt.JwtEcdsaParameters.class);
        com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
    }
}
