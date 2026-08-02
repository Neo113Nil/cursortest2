package com.google.crypto.tink.signature.internal;

/* loaded from: classes9.dex */
public final class RsaSsaPssProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType> HASH_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.RsaSsaPssParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.RsaSsaPssPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.RsaSsaPssPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.signature.RsaSsaPssParameters.Variant> VARIANT_CONVERTER;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.serializeParameters((com.google.crypto.tink.signature.RsaSsaPssParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.signature.RsaSsaPssParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.signature.RsaSsaPssParameters parseParameters;
                parseParameters = com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.serializePublicKey((com.google.crypto.tink.signature.RsaSsaPssPublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.signature.RsaSsaPssPublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.signature.RsaSsaPssPublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.serializePrivateKey((com.google.crypto.tink.signature.RsaSsaPssPrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.signature.RsaSsaPssPrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.signature.RsaSsaPssPrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.signature.internal.RsaSsaPssProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        VARIANT_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.OutputPrefixType.RAW, com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).add(com.google.crypto.tink.proto.OutputPrefixType.TINK, com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.TINK).add(com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY, com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.CRUNCHY).add(com.google.crypto.tink.proto.OutputPrefixType.LEGACY, com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.LEGACY).build();
        HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256).add(com.google.crypto.tink.proto.HashType.SHA384, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384).add(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512).build();
    }

    private static com.google.crypto.tink.proto.RsaSsaPssParams getProtoParams(com.google.crypto.tink.signature.RsaSsaPssParameters rsaSsaPssParameters) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.RsaSsaPssParams.Builder newBuilder = com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder();
        com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType> enumTypeProtoConverter = HASH_TYPE_CONVERTER;
        return newBuilder.setSigHash(enumTypeProtoConverter.toProtoEnum(rsaSsaPssParameters.getSigHashType())).setMgf1Hash(enumTypeProtoConverter.toProtoEnum(rsaSsaPssParameters.getMgf1HashType())).setSaltLength(rsaSsaPssParameters.getSaltLengthBytes()).build();
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeBigInteger(java.math.BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(bigInteger));
    }

    private static com.google.crypto.tink.proto.RsaSsaPssPublicKey getProtoPublicKey(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.RsaSsaPssPublicKey.newBuilder().setParams(getProtoParams(rsaSsaPssPublicKey.getParameters())).setN(encodeBigInteger(rsaSsaPssPublicKey.getModulus())).setE(encodeBigInteger(rsaSsaPssPublicKey.getParameters().getPublicExponent())).setVersion(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.signature.RsaSsaPssParameters rsaSsaPssParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(com.google.crypto.tink.proto.RsaSsaPssKeyFormat.newBuilder().setParams(getProtoParams(rsaSsaPssParameters)).setModulusSizeInBits(rsaSsaPssParameters.getModulusSizeBits()).setPublicExponent(encodeBigInteger(rsaSsaPssParameters.getPublicExponent())).build().toByteString()).setOutputPrefixType(VARIANT_CONVERTER.toProtoEnum(rsaSsaPssParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(rsaSsaPssPublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, VARIANT_CONVERTER.toProtoEnum(rsaSsaPssPublicKey.getParameters().getVariant()), rsaSsaPssPublicKey.getIdRequirementOrNull());
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return encodeBigInteger(secretBigInteger.getBigInteger(secretKeyAccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.signature.RsaSsaPssPrivateKey rsaSsaPssPrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, com.google.crypto.tink.proto.RsaSsaPssPrivateKey.newBuilder().setVersion(0).setPublicKey(getProtoPublicKey(rsaSsaPssPrivateKey.getPublicKey())).setD(encodeSecretBigInteger(rsaSsaPssPrivateKey.getPrivateExponent(), requireAccess)).setP(encodeSecretBigInteger(rsaSsaPssPrivateKey.getPrimeP(), requireAccess)).setQ(encodeSecretBigInteger(rsaSsaPssPrivateKey.getPrimeQ(), requireAccess)).setDp(encodeSecretBigInteger(rsaSsaPssPrivateKey.getPrimeExponentP(), requireAccess)).setDq(encodeSecretBigInteger(rsaSsaPssPrivateKey.getPrimeExponentQ(), requireAccess)).setCrt(encodeSecretBigInteger(rsaSsaPssPrivateKey.getCrtCoefficient(), requireAccess)).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, VARIANT_CONVERTER.toProtoEnum(rsaSsaPssPrivateKey.getParameters().getVariant()), rsaSsaPssPrivateKey.getIdRequirementOrNull());
    }

    private static java.math.BigInteger decodeBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        return com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPssParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat parseFrom = com.google.crypto.tink.proto.RsaSsaPssKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            com.google.crypto.tink.signature.RsaSsaPssParameters.Builder builder = com.google.crypto.tink.signature.RsaSsaPssParameters.builder();
            com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType> enumTypeProtoConverter = HASH_TYPE_CONVERTER;
            return builder.setSigHashType(enumTypeProtoConverter.fromProtoEnum(parseFrom.getParams().getSigHash())).setMgf1HashType(enumTypeProtoConverter.fromProtoEnum(parseFrom.getParams().getMgf1Hash())).setPublicExponent(decodeBigInteger(parseFrom.getPublicExponent())).setModulusSizeBits(parseFrom.getModulusSizeInBits()).setSaltLengthBytes(parseFrom.getParams().getSaltLength()).setVariant(VARIANT_CONVERTER.fromProtoEnum(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPssPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPssPublicKey parseFrom = com.google.crypto.tink.proto.RsaSsaPssPublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger decodeBigInteger = decodeBigInteger(parseFrom.getN());
            int bitLength = decodeBigInteger.bitLength();
            com.google.crypto.tink.signature.RsaSsaPssParameters.Builder builder = com.google.crypto.tink.signature.RsaSsaPssParameters.builder();
            com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType> enumTypeProtoConverter = HASH_TYPE_CONVERTER;
            return com.google.crypto.tink.signature.RsaSsaPssPublicKey.builder().setParameters(builder.setSigHashType(enumTypeProtoConverter.fromProtoEnum(parseFrom.getParams().getSigHash())).setMgf1HashType(enumTypeProtoConverter.fromProtoEnum(parseFrom.getParams().getMgf1Hash())).setPublicExponent(decodeBigInteger(parseFrom.getE())).setModulusSizeBits(bitLength).setSaltLengthBytes(parseFrom.getParams().getSaltLength()).setVariant(VARIANT_CONVERTER.fromProtoEnum(protoKeySerialization.getOutputPrefixType())).build()).setModulus(decodeBigInteger).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    private static com.google.crypto.tink.util.SecretBigInteger decodeSecretBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray()), secretKeyAccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPssPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPssPrivateKey parseFrom = com.google.crypto.tink.proto.RsaSsaPssPrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.proto.RsaSsaPssPublicKey publicKey = parseFrom.getPublicKey();
            if (publicKey.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger decodeBigInteger = decodeBigInteger(publicKey.getN());
            int bitLength = decodeBigInteger.bitLength();
            java.math.BigInteger decodeBigInteger2 = decodeBigInteger(publicKey.getE());
            com.google.crypto.tink.signature.RsaSsaPssParameters.Builder builder = com.google.crypto.tink.signature.RsaSsaPssParameters.builder();
            com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType> enumTypeProtoConverter = HASH_TYPE_CONVERTER;
            com.google.crypto.tink.signature.RsaSsaPssPublicKey build = com.google.crypto.tink.signature.RsaSsaPssPublicKey.builder().setParameters(builder.setSigHashType(enumTypeProtoConverter.fromProtoEnum(publicKey.getParams().getSigHash())).setMgf1HashType(enumTypeProtoConverter.fromProtoEnum(publicKey.getParams().getMgf1Hash())).setPublicExponent(decodeBigInteger2).setModulusSizeBits(bitLength).setSaltLengthBytes(publicKey.getParams().getSaltLength()).setVariant(VARIANT_CONVERTER.fromProtoEnum(protoKeySerialization.getOutputPrefixType())).build()).setModulus(decodeBigInteger).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
            com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
            return com.google.crypto.tink.signature.RsaSsaPssPrivateKey.builder().setPublicKey(build).setPrimes(decodeSecretBigInteger(parseFrom.getP(), requireAccess), decodeSecretBigInteger(parseFrom.getQ(), requireAccess)).setPrivateExponent(decodeSecretBigInteger(parseFrom.getD(), requireAccess)).setPrimeExponents(decodeSecretBigInteger(parseFrom.getDp(), requireAccess), decodeSecretBigInteger(parseFrom.getDq(), requireAccess)).setCrtCoefficient(decodeSecretBigInteger(parseFrom.getCrt(), requireAccess)).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
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

    private RsaSsaPssProtoSerialization() {
    }
}
