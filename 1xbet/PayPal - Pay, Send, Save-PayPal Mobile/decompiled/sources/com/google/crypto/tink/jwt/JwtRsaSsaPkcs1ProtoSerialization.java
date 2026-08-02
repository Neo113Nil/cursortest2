package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtRsaSsaPkcs1ProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm> ALGORITHM_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.serializeParameters((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters parseParameters;
                parseParameters = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.serializePublicKey((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.serializePrivateKey((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1ProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        ALGORITHM_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256).add(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS384).add(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS512).build();
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters jwtRsaSsaPkcs1Parameters) {
        if (jwtRsaSsaPkcs1Parameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        return com.google.crypto.tink.proto.OutputPrefixType.RAW;
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeBigInteger(java.math.BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(bigInteger));
    }

    private static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat getProtoKeyFormat(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters jwtRsaSsaPkcs1Parameters) throws java.security.GeneralSecurityException {
        if (!jwtRsaSsaPkcs1Parameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED) && !jwtRsaSsaPkcs1Parameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to serialize Parameters object with KidStrategy ");
            sb.append(jwtRsaSsaPkcs1Parameters.getKidStrategy());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.newBuilder().setVersion(0).setAlgorithm(ALGORITHM_CONVERTER.toProtoEnum(jwtRsaSsaPkcs1Parameters.getAlgorithm())).setModulusSizeInBits(jwtRsaSsaPkcs1Parameters.getModulusSizeBits()).setPublicExponent(encodeBigInteger(jwtRsaSsaPkcs1Parameters.getPublicExponent())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters jwtRsaSsaPkcs1Parameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(getProtoKeyFormat(jwtRsaSsaPkcs1Parameters).toByteString()).setOutputPrefixType(toProtoOutputPrefixType(jwtRsaSsaPkcs1Parameters)).build());
    }

    private static com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey getProtoPublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.Builder e = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.newBuilder().setVersion(0).setAlgorithm(ALGORITHM_CONVERTER.toProtoEnum(jwtRsaSsaPkcs1PublicKey.getParameters().getAlgorithm())).setN(encodeBigInteger(jwtRsaSsaPkcs1PublicKey.getModulus())).setE(encodeBigInteger(jwtRsaSsaPkcs1PublicKey.getParameters().getPublicExponent()));
        if (jwtRsaSsaPkcs1PublicKey.getParameters().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.CUSTOM)) {
            e.setCustomKid(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder().setValue(jwtRsaSsaPkcs1PublicKey.getKid().get()).build());
        }
        return e.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(jwtRsaSsaPkcs1PublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, toProtoOutputPrefixType(jwtRsaSsaPkcs1PublicKey.getParameters()), jwtRsaSsaPkcs1PublicKey.getIdRequirementOrNull());
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return encodeBigInteger(secretBigInteger.getBigInteger(secretKeyAccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKey.newBuilder().setVersion(0).setPublicKey(getProtoPublicKey(jwtRsaSsaPkcs1PrivateKey.getPublicKey())).setD(encodeSecretBigInteger(jwtRsaSsaPkcs1PrivateKey.getPrivateExponent(), requireAccess)).setP(encodeSecretBigInteger(jwtRsaSsaPkcs1PrivateKey.getPrimeP(), requireAccess)).setQ(encodeSecretBigInteger(jwtRsaSsaPkcs1PrivateKey.getPrimeQ(), requireAccess)).setDp(encodeSecretBigInteger(jwtRsaSsaPkcs1PrivateKey.getPrimeExponentP(), requireAccess)).setDq(encodeSecretBigInteger(jwtRsaSsaPkcs1PrivateKey.getPrimeExponentQ(), requireAccess)).setCrt(encodeSecretBigInteger(jwtRsaSsaPkcs1PrivateKey.getCrtCoefficient(), requireAccess)).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, toProtoOutputPrefixType(jwtRsaSsaPkcs1PrivateKey.getParameters()), jwtRsaSsaPkcs1PrivateKey.getIdRequirementOrNull());
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
    public static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtRsaSsaPkcs1ProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            validateVersion(parseFrom.getVersion());
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy kidStrategy = protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.TINK) ? com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID : null;
            if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
                kidStrategy = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED;
            }
            if (kidStrategy == null) {
                throw new java.security.GeneralSecurityException("Invalid OutputPrefixType for JwtHmacKeyFormat");
            }
            return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setKidStrategy(kidStrategy).setAlgorithm(ALGORITHM_CONVERTER.fromProtoEnum(parseFrom.getAlgorithm())).setPublicExponent(decodeBigInteger(parseFrom.getPublicExponent())).setModulusSizeBits(parseFrom.getModulusSizeInBits()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing JwtRsaSsaPkcs1Parameters failed: ", e);
        }
    }

    private static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey getPublicKeyFromProto(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validateVersion(jwtRsaSsaPkcs1PublicKey.getVersion());
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Builder builder = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder();
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.Builder builder2 = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.builder();
        if (outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.TINK)) {
            if (jwtRsaSsaPkcs1PublicKey.hasCustomKid()) {
                throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK should not have a custom kid");
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK need an ID Requirement");
            }
            builder.setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.BASE64_ENCODED_KEY_ID);
            builder2.setIdRequirement(num);
        } else if (outputPrefixType.equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
            if (jwtRsaSsaPkcs1PublicKey.hasCustomKid()) {
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.CUSTOM);
                builder2.setCustomKid(jwtRsaSsaPkcs1PublicKey.getCustomKid().getValue());
            } else {
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED);
            }
        }
        java.math.BigInteger decodeBigInteger = decodeBigInteger(jwtRsaSsaPkcs1PublicKey.getN());
        builder.setAlgorithm(ALGORITHM_CONVERTER.fromProtoEnum(jwtRsaSsaPkcs1PublicKey.getAlgorithm())).setPublicExponent(decodeBigInteger(jwtRsaSsaPkcs1PublicKey.getE())).setModulusSizeBits(decodeBigInteger.bitLength());
        builder2.setModulus(decodeBigInteger).setParameters(builder.build());
        return builder2.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtRsaSsaPkcs1ProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return getPublicKeyFromProto(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()), protoKeySerialization.getOutputPrefixType(), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing JwtRsaSsaPkcs1PublicKey failed");
        }
    }

    private static com.google.crypto.tink.util.SecretBigInteger decodeSecretBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray()), secretKeyAccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtRsaSsaPkcs1ProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKey parseFrom = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            validateVersion(parseFrom.getVersion());
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey publicKeyFromProto = getPublicKeyFromProto(parseFrom.getPublicKey(), protoKeySerialization.getOutputPrefixType(), protoKeySerialization.getIdRequirementOrNull());
            com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
            return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PrivateKey.builder().setPublicKey(publicKeyFromProto).setPrimes(decodeSecretBigInteger(parseFrom.getP(), requireAccess), decodeSecretBigInteger(parseFrom.getQ(), requireAccess)).setPrivateExponent(decodeSecretBigInteger(parseFrom.getD(), requireAccess)).setPrimeExponents(decodeSecretBigInteger(parseFrom.getDp(), requireAccess), decodeSecretBigInteger(parseFrom.getDq(), requireAccess)).setCrtCoefficient(decodeSecretBigInteger(parseFrom.getCrt(), requireAccess)).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing JwtRsaSsaPkcs1PrivateKey failed");
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

    private JwtRsaSsaPkcs1ProtoSerialization() {
    }
}
