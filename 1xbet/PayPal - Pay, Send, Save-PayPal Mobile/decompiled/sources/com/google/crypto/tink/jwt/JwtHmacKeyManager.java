package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtHmacKeyManager {
    private static final com.google.crypto.tink.KeyManager<java.lang.Void> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create("type.googleapis.com/google.crypto.tink.JwtHmacKey", java.lang.Void.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.JwtHmacKey.parser());
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.jwt.JwtHmacKey, com.google.crypto.tink.jwt.JwtMac> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager$$ExternalSyntheticLambda3
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.jwt.JwtMac createFullJwtHmac;
            createFullJwtHmac = com.google.crypto.tink.jwt.JwtHmacKeyManager.createFullJwtHmac((com.google.crypto.tink.jwt.JwtHmacKey) key);
            return createFullJwtHmac;
        }
    }, com.google.crypto.tink.jwt.JwtHmacKey.class, com.google.crypto.tink.jwt.JwtMac.class);
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.jwt.JwtHmacParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.jwt.JwtHmacKey createKey;
            createKey = com.google.crypto.tink.jwt.JwtHmacKeyManager.createKey((com.google.crypto.tink.jwt.JwtHmacParameters) parameters, num);
            return createKey;
        }
    };
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    @com.google.errorprone.annotations.Immutable
    static final class JwtHmac implements com.google.crypto.tink.jwt.JwtMac {
        private final java.lang.String algorithm;
        private final com.google.crypto.tink.jwt.JwtHmacKey jwtHmacKey;
        private final com.google.crypto.tink.Mac mac;

        private JwtHmac(com.google.crypto.tink.Mac mac, com.google.crypto.tink.jwt.JwtHmacKey jwtHmacKey) {
            this.algorithm = jwtHmacKey.getParameters().getAlgorithm().getStandardName();
            this.mac = mac;
            this.jwtHmacKey = jwtHmacKey;
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public final java.lang.String computeMacAndEncode(com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.GeneralSecurityException {
            java.lang.String createUnsignedCompact = com.google.crypto.tink.jwt.JwtFormat.createUnsignedCompact(this.algorithm, this.jwtHmacKey.getKid(), rawJwt);
            return com.google.crypto.tink.jwt.JwtFormat.createSignedCompact(createUnsignedCompact, this.mac.computeMac(createUnsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII)));
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public final com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact = com.google.crypto.tink.jwt.JwtFormat.splitSignedCompact(str);
            this.mac.verifyMac(splitSignedCompact.signatureOrMac, splitSignedCompact.unsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
            com.google.gson.JsonObject parseJson = com.google.crypto.tink.jwt.JsonUtil.parseJson(splitSignedCompact.header);
            com.google.crypto.tink.jwt.JwtFormat.validateHeader(parseJson, this.jwtHmacKey.getParameters().getAlgorithm().getStandardName(), this.jwtHmacKey.getKid(), this.jwtHmacKey.getParameters().allowKidAbsent());
            return jwtValidator.validate(com.google.crypto.tink.jwt.RawJwt.fromJsonPayload(com.google.crypto.tink.jwt.JwtFormat.getTypeHeader(parseJson), splitSignedCompact.payload));
        }
    }

    private static void validate(com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters) throws java.security.GeneralSecurityException {
        int i = jwtHmacParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256) ? 32 : Integer.MAX_VALUE;
        if (jwtHmacParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384)) {
            i = 48;
        }
        if (jwtHmacParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512)) {
            i = 64;
        }
        if (jwtHmacParameters.getKeySizeBytes() < i) {
            throw new java.security.GeneralSecurityException("Key size must be at least ".concat(java.lang.String.valueOf(i)));
        }
    }

    private static int getTagLength(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256)) {
            return 32;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384)) {
            return 48;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512)) {
            return 64;
        }
        throw new java.security.GeneralSecurityException("Unsupported algorithm: ".concat(java.lang.String.valueOf(algorithm)));
    }

    private static com.google.crypto.tink.mac.HmacParameters.HashType getHmacHashType(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256)) {
            return com.google.crypto.tink.mac.HmacParameters.HashType.SHA256;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384)) {
            return com.google.crypto.tink.mac.HmacParameters.HashType.SHA384;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512)) {
            return com.google.crypto.tink.mac.HmacParameters.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unsupported algorithm: ".concat(java.lang.String.valueOf(algorithm)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtMac createFullJwtHmac(com.google.crypto.tink.jwt.JwtHmacKey jwtHmacKey) throws java.security.GeneralSecurityException {
        validate(jwtHmacKey.getParameters());
        return new com.google.crypto.tink.jwt.JwtHmacKeyManager.JwtHmac(com.google.crypto.tink.subtle.PrfMac.create(com.google.crypto.tink.mac.HmacKey.builder().setParameters(com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(jwtHmacKey.getParameters().getKeySizeBytes()).setHashType(getHmacHashType(jwtHmacKey.getParameters().getAlgorithm())).setTagSizeBytes(getTagLength(jwtHmacKey.getParameters().getAlgorithm())).build()).setKeyBytes(jwtHmacKey.getKeyBytes()).build()), jwtHmacKey);
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtHmacKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtHmacKey createKey(com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validate(jwtHmacParameters);
        com.google.crypto.tink.jwt.JwtHmacKey.Builder keyBytes = com.google.crypto.tink.jwt.JwtHmacKey.builder().setParameters(jwtHmacParameters).setKeyBytes(com.google.crypto.tink.util.SecretBytes.randomBytes(jwtHmacParameters.getKeySizeBytes()));
        if (jwtHmacParameters.hasIdRequirement()) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            keyBytes.setIdRequirement(num.intValue());
        }
        return keyBytes.build();
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("JWT_HS256_RAW", com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(32).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_HS256", com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(32).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_HS384_RAW", com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(48).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_HS384", com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(48).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        hashMap.put("JWT_HS512_RAW", com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(64).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED).build());
        hashMap.put("JWT_HS512", com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(64).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return FIPS;
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = FIPS;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.jwt.JwtHmacProtoSerialization.register();
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.jwt.JwtHmacParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManagerWithFipsCompatibility(legacyKeyManager, algorithmFipsCompatibility, z);
    }

    public static final com.google.crypto.tink.KeyTemplate hs256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(32).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate hs384Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(48).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate hs512Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.jwt.JwtHmacKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.jwt.JwtHmacParameters.builder().setKeySizeBytes(64).setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED).setAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512).build());
                return createFrom;
            }
        });
    }

    private JwtHmacKeyManager() {
    }
}
