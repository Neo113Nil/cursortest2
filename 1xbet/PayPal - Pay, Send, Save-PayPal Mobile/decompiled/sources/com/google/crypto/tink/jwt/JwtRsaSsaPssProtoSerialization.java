package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtRsaSsaPssProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm> ALGORITHM_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.jwt.JwtRsaSsaPssParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization.serializeParameters((com.google.crypto.tink.jwt.JwtRsaSsaPssParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.jwt.JwtRsaSsaPssParameters parseParameters;
                parseParameters = com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization.serializePublicKey((com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization.serializePrivateKey((com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.jwt.JwtRsaSsaPssProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        ALGORITHM_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS256, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS256).add(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS384, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS384).add(com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS512, com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS512).build();
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters jwtRsaSsaPssParameters) {
        if (jwtRsaSsaPssParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        return com.google.crypto.tink.proto.OutputPrefixType.RAW;
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeBigInteger(java.math.BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(bigInteger));
    }

    private static com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat getProtoKeyFormat(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters jwtRsaSsaPssParameters) throws java.security.GeneralSecurityException {
        if (!jwtRsaSsaPssParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.IGNORED) && !jwtRsaSsaPssParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to serialize Parameters object with KidStrategy ");
            sb.append(jwtRsaSsaPssParameters.getKidStrategy());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat.newBuilder().setVersion(0).setAlgorithm(ALGORITHM_CONVERTER.toProtoEnum(jwtRsaSsaPssParameters.getAlgorithm())).setModulusSizeInBits(jwtRsaSsaPssParameters.getModulusSizeBits()).setPublicExponent(encodeBigInteger(jwtRsaSsaPssParameters.getPublicExponent())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters jwtRsaSsaPssParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(getProtoKeyFormat(jwtRsaSsaPssParameters).toByteString()).setOutputPrefixType(toProtoOutputPrefixType(jwtRsaSsaPssParameters)).build());
    }

    private static com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey getProtoPublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.Builder e = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.newBuilder().setVersion(0).setAlgorithm(ALGORITHM_CONVERTER.toProtoEnum(jwtRsaSsaPssPublicKey.getParameters().getAlgorithm())).setN(encodeBigInteger(jwtRsaSsaPssPublicKey.getModulus())).setE(encodeBigInteger(jwtRsaSsaPssPublicKey.getParameters().getPublicExponent()));
        if (jwtRsaSsaPssPublicKey.getParameters().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.CUSTOM)) {
            e.setCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKid.newBuilder().setValue(jwtRsaSsaPssPublicKey.getKid().get()).build());
        }
        return e.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(jwtRsaSsaPssPublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, toProtoOutputPrefixType(jwtRsaSsaPssPublicKey.getParameters()), jwtRsaSsaPssPublicKey.getIdRequirementOrNull());
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return encodeBigInteger(secretBigInteger.getBigInteger(secretKeyAccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.newBuilder().setVersion(0).setPublicKey(getProtoPublicKey(jwtRsaSsaPssPrivateKey.getPublicKey())).setD(encodeSecretBigInteger(jwtRsaSsaPssPrivateKey.getPrivateExponent(), requireAccess)).setP(encodeSecretBigInteger(jwtRsaSsaPssPrivateKey.getPrimeP(), requireAccess)).setQ(encodeSecretBigInteger(jwtRsaSsaPssPrivateKey.getPrimeQ(), requireAccess)).setDp(encodeSecretBigInteger(jwtRsaSsaPssPrivateKey.getPrimeExponentP(), requireAccess)).setDq(encodeSecretBigInteger(jwtRsaSsaPssPrivateKey.getPrimeExponentQ(), requireAccess)).setCrt(encodeSecretBigInteger(jwtRsaSsaPssPrivateKey.getCrtCoefficient(), requireAccess)).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, toProtoOutputPrefixType(jwtRsaSsaPssPrivateKey.getParameters()), jwtRsaSsaPssPrivateKey.getIdRequirementOrNull());
    }

    private static java.math.BigInteger decodeBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        return com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray());
    }

    private static void validateVersion(int i) throws java.security.GeneralSecurityException {
        if (i != 0) {
            throw new java.security.GeneralSecurityException("Parsing failed: unknown version ".concat(java.lang.String.valueOf(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtRsaSsaPssParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtRsaSsaPssProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat parseFrom = com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            validateVersion(parseFrom.getVersion());
            com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy kidStrategy = protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.TINK) ? com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.BASE64_ENCODED_KEY_ID : null;
            if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
                kidStrategy = com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.IGNORED;
            }
            if (kidStrategy == null) {
                throw new java.security.GeneralSecurityException("Invalid OutputPrefixType for JwtHmacKeyFormat");
            }
            return com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.builder().setKidStrategy(kidStrategy).setAlgorithm(ALGORITHM_CONVERTER.fromProtoEnum(parseFrom.getAlgorithm())).setPublicExponent(decodeBigInteger(parseFrom.getPublicExponent())).setModulusSizeBits(parseFrom.getModulusSizeInBits()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing JwtRsaSsaPssParameters failed: ", e);
        }
    }

    private static com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey getPublicKeyFromProto(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validateVersion(jwtRsaSsaPssPublicKey.getVersion());
        com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Builder builder = com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.builder();
        com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey.Builder builder2 = com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey.builder();
        if (outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.TINK)) {
            if (jwtRsaSsaPssPublicKey.hasCustomKid()) {
                throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK should not have a custom kid");
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK need an ID Requirement");
            }
            builder.setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.BASE64_ENCODED_KEY_ID);
            builder2.setIdRequirement(num);
        } else if (outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
            if (jwtRsaSsaPssPublicKey.hasCustomKid()) {
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.CUSTOM);
                builder2.setCustomKid(jwtRsaSsaPssPublicKey.getCustomKid().getValue());
            } else {
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.IGNORED);
            }
        }
        java.math.BigInteger decodeBigInteger = decodeBigInteger(jwtRsaSsaPssPublicKey.getN());
        builder.setAlgorithm(ALGORITHM_CONVERTER.fromProtoEnum(jwtRsaSsaPssPublicKey.getAlgorithm())).setPublicExponent(decodeBigInteger(jwtRsaSsaPssPublicKey.getE())).setModulusSizeBits(decodeBigInteger.bitLength());
        builder2.setModulus(decodeBigInteger).setParameters(builder.build());
        return builder2.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtRsaSsaPssProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return getPublicKeyFromProto(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()), protoKeySerialization.getOutputPrefixType(), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing JwtRsaSsaPssPublicKey failed");
        }
    }

    private static com.google.crypto.tink.util.SecretBigInteger decodeSecretBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray()), secretKeyAccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtRsaSsaPssProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            validateVersion(parseFrom.getVersion());
            com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey publicKeyFromProto = getPublicKeyFromProto(parseFrom.getPublicKey(), protoKeySerialization.getOutputPrefixType(), protoKeySerialization.getIdRequirementOrNull());
            com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
            return com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.builder().setPublicKey(publicKeyFromProto).setPrimes(decodeSecretBigInteger(parseFrom.getP(), requireAccess), decodeSecretBigInteger(parseFrom.getQ(), requireAccess)).setPrivateExponent(decodeSecretBigInteger(parseFrom.getD(), requireAccess)).setPrimeExponents(decodeSecretBigInteger(parseFrom.getDp(), requireAccess), decodeSecretBigInteger(parseFrom.getDq(), requireAccess)).setCrtCoefficient(decodeSecretBigInteger(parseFrom.getCrt(), requireAccess)).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing JwtRsaSsaPssPrivateKey failed");
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

    private JwtRsaSsaPssProtoSerialization() {
    }
}
