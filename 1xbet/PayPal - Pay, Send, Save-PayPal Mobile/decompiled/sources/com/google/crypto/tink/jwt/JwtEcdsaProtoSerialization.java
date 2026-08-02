package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtEcdsaProtoSerialization {
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.jwt.JwtEcdsaParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtEcdsaPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtEcdsaPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPrivateKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.serializeParameters((com.google.crypto.tink.jwt.JwtEcdsaParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.jwt.JwtEcdsaParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.jwt.JwtEcdsaParameters parseParameters;
                parseParameters = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.serializePublicKey((com.google.crypto.tink.jwt.JwtEcdsaPublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.jwt.JwtEcdsaPublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtEcdsaPublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.serializePrivateKey((com.google.crypto.tink.jwt.JwtEcdsaPrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.jwt.JwtEcdsaPrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtEcdsaPrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.JwtEcdsaAlgorithm toProtoAlgorithm(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256.equals(algorithm)) {
            return com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256;
        }
        if (com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384.equals(algorithm)) {
            return com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384;
        }
        if (com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512.equals(algorithm)) {
            return com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize algorithm: ".concat(java.lang.String.valueOf(algorithm)));
    }

    /* renamed from: com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = iArr;
            try {
                iArr[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm toAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm jwtEcdsaAlgorithm) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.jwt.JwtEcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[jwtEcdsaAlgorithm.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256;
        }
        if (i == 2) {
            return com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384;
        }
        if (i == 3) {
            return com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse algorithm: ");
        sb.append(jwtEcdsaAlgorithm.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.JwtEcdsaKeyFormat serializeToJwtEcdsaKeyFormat(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters) throws java.security.GeneralSecurityException {
        if (!jwtEcdsaParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED) && !jwtEcdsaParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to serialize Parameters object with KidStrategy ");
            sb.append(jwtEcdsaParameters.getKidStrategy());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return com.google.crypto.tink.proto.JwtEcdsaKeyFormat.newBuilder().setVersion(0).setAlgorithm(toProtoAlgorithm(jwtEcdsaParameters.getAlgorithm())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.TINK;
        if (jwtEcdsaParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED)) {
            outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(serializeToJwtEcdsaKeyFormat(jwtEcdsaParameters).toByteString()).setOutputPrefixType(outputPrefixType).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtEcdsaParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtEcdsaParameters.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtEcdsaKeyFormat parseFrom = com.google.crypto.tink.proto.JwtEcdsaKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Parsing HmacParameters failed: unknown Version ");
                sb2.append(parseFrom.getVersion());
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
            com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy kidStrategy = protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.TINK) ? com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID : null;
            if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
                kidStrategy = com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED;
            }
            if (kidStrategy == null) {
                throw new java.security.GeneralSecurityException("Invalid OutputPrefixType for JwtHmacKeyFormat");
            }
            return com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setAlgorithm(toAlgorithm(parseFrom.getAlgorithm())).setKidStrategy(kidStrategy).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing JwtEcdsaKeyFormat failed: ", e);
        }
    }

    private static int getEncodingLength(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256)) {
            return 33;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384)) {
            return 49;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512)) {
            return 67;
        }
        throw new java.security.GeneralSecurityException("Unknown algorithm: ".concat(java.lang.String.valueOf(algorithm)));
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters) {
        if (jwtEcdsaParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        return com.google.crypto.tink.proto.OutputPrefixType.RAW;
    }

    private static com.google.crypto.tink.proto.JwtEcdsaPublicKey serializePublicKey(com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey) throws java.security.GeneralSecurityException {
        int encodingLength = getEncodingLength(jwtEcdsaPublicKey.getParameters().getAlgorithm());
        java.security.spec.ECPoint publicPoint = jwtEcdsaPublicKey.getPublicPoint();
        com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder y = com.google.crypto.tink.proto.JwtEcdsaPublicKey.newBuilder().setVersion(0).setAlgorithm(toProtoAlgorithm(jwtEcdsaPublicKey.getParameters().getAlgorithm())).setX(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(publicPoint.getAffineX(), encodingLength))).setY(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(publicPoint.getAffineY(), encodingLength)));
        if (jwtEcdsaPublicKey.getParameters().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.CUSTOM)) {
            y.setCustomKid(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.newBuilder().setValue(jwtEcdsaPublicKey.getKid().get()).build());
        }
        return y.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, serializePublicKey(jwtEcdsaPublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, toProtoOutputPrefixType(jwtEcdsaPublicKey.getParameters()), jwtEcdsaPublicKey.getIdRequirementOrNull());
    }

    private static com.google.crypto.tink.jwt.JwtEcdsaPublicKey parsePublicKeyFromProto(com.google.crypto.tink.proto.JwtEcdsaPublicKey jwtEcdsaPublicKey, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (jwtEcdsaPublicKey.getVersion() != 0) {
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        }
        com.google.crypto.tink.jwt.JwtEcdsaParameters.Builder builder = com.google.crypto.tink.jwt.JwtEcdsaParameters.builder();
        com.google.crypto.tink.jwt.JwtEcdsaPublicKey.Builder builder2 = com.google.crypto.tink.jwt.JwtEcdsaPublicKey.builder();
        if (outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.TINK)) {
            if (jwtEcdsaPublicKey.hasCustomKid()) {
                throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK should not have a custom kid");
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK need an ID Requirement");
            }
            builder.setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.BASE64_ENCODED_KEY_ID);
            builder2.setIdRequirement(num);
        } else if (outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
            if (jwtEcdsaPublicKey.hasCustomKid()) {
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.CUSTOM);
                builder2.setCustomKid(jwtEcdsaPublicKey.getCustomKid().getValue());
            } else {
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED);
            }
        }
        builder.setAlgorithm(toAlgorithm(jwtEcdsaPublicKey.getAlgorithm()));
        builder2.setPublicPoint(new java.security.spec.ECPoint(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(jwtEcdsaPublicKey.getX().toByteArray()), com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(jwtEcdsaPublicKey.getY().toByteArray())));
        return builder2.setParameters(builder.build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtEcdsaPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return parsePublicKeyFromProto(com.google.crypto.tink.proto.JwtEcdsaPublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()), protoKeySerialization.getOutputPrefixType(), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    private static com.google.crypto.tink.proto.JwtEcdsaPrivateKey serializePrivateKeyToProto(com.google.crypto.tink.jwt.JwtEcdsaPrivateKey jwtEcdsaPrivateKey, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.JwtEcdsaPrivateKey.newBuilder().setPublicKey(serializePublicKey(jwtEcdsaPrivateKey.getPublicKey())).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(jwtEcdsaPrivateKey.getPrivateValue().getBigInteger(secretKeyAccess), getEncodingLength(jwtEcdsaPrivateKey.getParameters().getAlgorithm())))).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.jwt.JwtEcdsaPrivateKey jwtEcdsaPrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, serializePrivateKeyToProto(jwtEcdsaPrivateKey, com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, toProtoOutputPrefixType(jwtEcdsaPrivateKey.getParameters()), jwtEcdsaPrivateKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtEcdsaPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtEcdsaPrivateKey parseFrom = com.google.crypto.tink.proto.JwtEcdsaPrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.jwt.JwtEcdsaPrivateKey.create(parsePublicKeyFromProto(parseFrom.getPublicKey(), protoKeySerialization.getOutputPrefixType(), protoKeySerialization.getIdRequirementOrNull()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getKeyValue().toByteArray()), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)));
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static void register() throws java.security.GeneralSecurityException {
        register(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance());
    }

    public static void register(com.google.crypto.tink.internal.MutableSerializationRegistry mutableSerializationRegistry) throws java.security.GeneralSecurityException {
        mutableSerializationRegistry.registerParametersSerializer(PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(PUBLIC_KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(PUBLIC_KEY_PARSER);
        mutableSerializationRegistry.registerKeySerializer(PRIVATE_KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(PRIVATE_KEY_PARSER);
    }

    private JwtEcdsaProtoSerialization() {
    }
}
