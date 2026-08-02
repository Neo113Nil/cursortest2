package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPkcs1SignKeyManager {
    private static final com.google.crypto.tink.PrivateKeyManager<java.lang.Void> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), java.lang.Void.class, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<java.lang.Void> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.getKeyType(), java.lang.Void.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.parser());
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey, com.google.crypto.tink.jwt.JwtPublicKeySign> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.createFullPrimitive((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey) key);
        }
    }, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.jwt.JwtPublicKeySign.class);
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey createKey;
            createKey = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.createKey((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters) parameters, num);
            return createKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    static com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey toRsaSsaPkcs1PrivateKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.builder().setPublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.toRsaSsaPkcs1PublicKey(jwtRsaSsaPkcs1PrivateKey.getPublicKey())).setPrimes(jwtRsaSsaPkcs1PrivateKey.getPrimeP(), jwtRsaSsaPkcs1PrivateKey.getPrimeQ()).setPrivateExponent(jwtRsaSsaPkcs1PrivateKey.getPrivateExponent()).setPrimeExponents(jwtRsaSsaPkcs1PrivateKey.getPrimeExponentP(), jwtRsaSsaPkcs1PrivateKey.getPrimeExponentQ()).setCrtCoefficient(jwtRsaSsaPkcs1PrivateKey.getCrtCoefficient()).build();
    }

    static com.google.crypto.tink.jwt.JwtPublicKeySign createFullPrimitive(final com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) throws java.security.GeneralSecurityException {
        final com.google.crypto.tink.PublicKeySign create = com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.create(toRsaSsaPkcs1PrivateKey(jwtRsaSsaPkcs1PrivateKey));
        final java.lang.String standardName = jwtRsaSsaPkcs1PrivateKey.getParameters().getAlgorithm().getStandardName();
        return new com.google.crypto.tink.jwt.JwtPublicKeySign() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.1
            @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
            public java.lang.String signAndEncode(com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.GeneralSecurityException {
                java.lang.String createUnsignedCompact = com.google.crypto.tink.jwt.JwtFormat.createUnsignedCompact(standardName, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getKid(), rawJwt);
                return com.google.crypto.tink.jwt.JwtFormat.createSignedCompact(createUnsignedCompact, create.sign(createUnsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII)));
            }
        };
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PrivateKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey createKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters jwtRsaSsaPkcs1Parameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.KeyPairGenerator engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
        engineFactory.initialize(new java.security.spec.RSAKeyGenParameterSpec(jwtRsaSsaPkcs1Parameters.getModulusSizeBits(), new java.math.BigInteger(1, jwtRsaSsaPkcs1Parameters.getPublicExponent().toByteArray())));
        java.security.KeyPair generateKeyPair = engineFactory.generateKeyPair();
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) generateKeyPair.getPublic();
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) generateKeyPair.getPrivate();
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder modulus = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.builder().setParameters(jwtRsaSsaPkcs1Parameters).setModulus(rSAPublicKey.getModulus());
        if (num != null) {
            modulus.setIdRequirement(num);
        }
        return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey.builder().setPublicKey(modulus.build()).setPrimes(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrivateExponent(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentP(), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getPrimeExponentQ(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(rSAPrivateCrtKey.getCrtCoefficient(), com.google.crypto.tink.InsecureSecretKeyAccess.get())).build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("JWT_RS256_2048_F4_RAW", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(2048).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_RS256_2048_F4", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(2048).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_RS256_3072_F4_RAW", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_RS256_3072_F4", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_RS384_3072_F4_RAW", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS384).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_RS384_3072_F4", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(3072).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS384).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_RS512_4096_F4_RAW", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS512).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_RS512_4096_F4", com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(4096).setPublicExponent(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.F4).setAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS512).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.register();
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPrivateKeyManager, algorithmFipsCompatibility, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyPublicKeyManager, algorithmFipsCompatibility, false);
    }

    private JwtRsaSsaPkcs1SignKeyManager() {
    }
}
