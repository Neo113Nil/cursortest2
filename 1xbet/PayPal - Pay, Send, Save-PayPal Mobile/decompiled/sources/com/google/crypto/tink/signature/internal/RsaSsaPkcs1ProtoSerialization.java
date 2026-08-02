package com.google.crypto.tink.signature.internal;

/* loaded from: classes9.dex */
public final class RsaSsaPkcs1ProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType> HASH_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.RsaSsaPkcs1Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant> VARIANT_CONVERTER;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.serializeParameters((com.google.crypto.tink.signature.RsaSsaPkcs1Parameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.signature.RsaSsaPkcs1Parameters parseParameters;
                parseParameters = com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.serializePublicKey((com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.serializePrivateKey((com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.signature.internal.RsaSsaPkcs1ProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        VARIANT_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.OutputPrefixType.RAW, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).add(com.google.crypto.tink.proto.OutputPrefixType.TINK, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.TINK).add(com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.CRUNCHY).add(com.google.crypto.tink.proto.OutputPrefixType.LEGACY, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.LEGACY).build();
        HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256).add(com.google.crypto.tink.proto.HashType.SHA384, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384).add(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512).build();
    }

    private static com.google.crypto.tink.proto.RsaSsaPkcs1Params getProtoParams(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters rsaSsaPkcs1Parameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder().setHashType(HASH_TYPE_CONVERTER.toProtoEnum(rsaSsaPkcs1Parameters.getHashType())).build();
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeBigInteger(java.math.BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(bigInteger));
    }

    private static com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey getProtoPublicKey(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.newBuilder().setParams(getProtoParams(rsaSsaPkcs1PublicKey.getParameters())).setN(encodeBigInteger(rsaSsaPkcs1PublicKey.getModulus())).setE(encodeBigInteger(rsaSsaPkcs1PublicKey.getParameters().getPublicExponent())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters rsaSsaPkcs1Parameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.newBuilder().setParams(getProtoParams(rsaSsaPkcs1Parameters)).setModulusSizeInBits(rsaSsaPkcs1Parameters.getModulusSizeBits()).setPublicExponent(encodeBigInteger(rsaSsaPkcs1Parameters.getPublicExponent())).build().toByteString()).setOutputPrefixType(VARIANT_CONVERTER.toProtoEnum(rsaSsaPkcs1Parameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(rsaSsaPkcs1PublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, VARIANT_CONVERTER.toProtoEnum(rsaSsaPkcs1PublicKey.getParameters().getVariant()), rsaSsaPkcs1PublicKey.getIdRequirementOrNull());
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString encodeSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return encodeBigInteger(secretBigInteger.getBigInteger(secretKeyAccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.newBuilder().setVersion(0).setPublicKey(getProtoPublicKey(rsaSsaPkcs1PrivateKey.getPublicKey())).setD(encodeSecretBigInteger(rsaSsaPkcs1PrivateKey.getPrivateExponent(), requireAccess)).setP(encodeSecretBigInteger(rsaSsaPkcs1PrivateKey.getPrimeP(), requireAccess)).setQ(encodeSecretBigInteger(rsaSsaPkcs1PrivateKey.getPrimeQ(), requireAccess)).setDp(encodeSecretBigInteger(rsaSsaPkcs1PrivateKey.getPrimeExponentP(), requireAccess)).setDq(encodeSecretBigInteger(rsaSsaPkcs1PrivateKey.getPrimeExponentQ(), requireAccess)).setCrt(encodeSecretBigInteger(rsaSsaPkcs1PrivateKey.getCrtCoefficient(), requireAccess)).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, VARIANT_CONVERTER.toProtoEnum(rsaSsaPkcs1PrivateKey.getParameters().getVariant()), rsaSsaPkcs1PrivateKey.getIdRequirementOrNull());
    }

    private static java.math.BigInteger decodeBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        return com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPkcs1Parameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat parseFrom = com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(HASH_TYPE_CONVERTER.fromProtoEnum(parseFrom.getParams().getHashType())).setPublicExponent(decodeBigInteger(parseFrom.getPublicExponent())).setModulusSizeBits(parseFrom.getModulusSizeInBits()).setVariant(VARIANT_CONVERTER.fromProtoEnum(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey parseFrom = com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger decodeBigInteger = decodeBigInteger(parseFrom.getN());
            return com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(HASH_TYPE_CONVERTER.fromProtoEnum(parseFrom.getParams().getHashType())).setPublicExponent(decodeBigInteger(parseFrom.getE())).setModulusSizeBits(decodeBigInteger.bitLength()).setVariant(VARIANT_CONVERTER.fromProtoEnum(protoKeySerialization.getOutputPrefixType())).build()).setModulus(decodeBigInteger).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    private static com.google.crypto.tink.util.SecretBigInteger decodeSecretBigInteger(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        return com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(byteString.toByteArray()), secretKeyAccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey parseFrom = com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey publicKey = parseFrom.getPublicKey();
            if (publicKey.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.math.BigInteger decodeBigInteger = decodeBigInteger(publicKey.getN());
            com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey build = com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setHashType(HASH_TYPE_CONVERTER.fromProtoEnum(publicKey.getParams().getHashType())).setPublicExponent(decodeBigInteger(publicKey.getE())).setModulusSizeBits(decodeBigInteger.bitLength()).setVariant(VARIANT_CONVERTER.fromProtoEnum(protoKeySerialization.getOutputPrefixType())).build()).setModulus(decodeBigInteger).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
            com.google.crypto.tink.SecretKeyAccess requireAccess = com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess);
            return com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.builder().setPublicKey(build).setPrimes(decodeSecretBigInteger(parseFrom.getP(), requireAccess), decodeSecretBigInteger(parseFrom.getQ(), requireAccess)).setPrivateExponent(decodeSecretBigInteger(parseFrom.getD(), requireAccess)).setPrimeExponents(decodeSecretBigInteger(parseFrom.getDp(), requireAccess), decodeSecretBigInteger(parseFrom.getDq(), requireAccess)).setCrtCoefficient(decodeSecretBigInteger(parseFrom.getCrt(), requireAccess)).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
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

    private RsaSsaPkcs1ProtoSerialization() {
    }
}
