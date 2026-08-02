package com.google.crypto.tink.mac.internal;

/* loaded from: classes4.dex */
public final class HmacProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.mac.HmacParameters.HashType> HASH_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.mac.HmacParameters.Variant> OUTPUT_PREFIX_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.HmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.HmacKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        OUTPUT_PREFIX_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.OutputPrefixType.RAW, com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX).add(com.google.crypto.tink.proto.OutputPrefixType.TINK, com.google.crypto.tink.mac.HmacParameters.Variant.TINK).add(com.google.crypto.tink.proto.OutputPrefixType.LEGACY, com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY).add(com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY, com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY).build();
        HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HashType.SHA1, com.google.crypto.tink.mac.HmacParameters.HashType.SHA1).add(com.google.crypto.tink.proto.HashType.SHA224, com.google.crypto.tink.mac.HmacParameters.HashType.SHA224).add(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.mac.HmacParameters.HashType.SHA256).add(com.google.crypto.tink.proto.HashType.SHA384, com.google.crypto.tink.mac.HmacParameters.HashType.SHA384).add(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.mac.HmacParameters.HashType.SHA512).build();
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.mac.internal.HmacProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.mac.internal.HmacProtoSerialization.serializeParameters((com.google.crypto.tink.mac.HmacParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.mac.HmacParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.mac.internal.HmacProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.mac.HmacParameters parseParameters;
                parseParameters = com.google.crypto.tink.mac.internal.HmacProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.mac.internal.HmacProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.mac.internal.HmacProtoSerialization.serializeKey((com.google.crypto.tink.mac.HmacKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.mac.internal.HmacProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.mac.HmacKey parseKey;
                parseKey = com.google.crypto.tink.mac.internal.HmacProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.HmacParams getProtoParams(com.google.crypto.tink.mac.HmacParameters hmacParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.HmacParams.newBuilder().setTagSize(hmacParameters.getCryptographicTagSizeBytes()).setHash(HASH_TYPE_CONVERTER.toProtoEnum(hmacParameters.getHashType())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.mac.HmacParameters hmacParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.HmacKeyFormat.newBuilder().setParams(getProtoParams(hmacParameters)).setKeySize(hmacParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(OUTPUT_PREFIX_TYPE_CONVERTER.toProtoEnum(hmacParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.mac.HmacKey hmacKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.HmacKey.newBuilder().setParams(getProtoParams(hmacKey.getParameters())).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(hmacKey.getKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, OUTPUT_PREFIX_TYPE_CONVERTER.toProtoEnum(hmacKey.getParameters().getVariant()), hmacKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.HmacParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to HmacProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.HmacKeyFormat parseFrom = com.google.crypto.tink.proto.HmacKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Parsing HmacParameters failed: unknown Version ");
                sb2.append(parseFrom.getVersion());
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
            return com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(parseFrom.getKeySize()).setTagSizeBytes(parseFrom.getParams().getTagSize()).setHashType(HASH_TYPE_CONVERTER.fromProtoEnum(parseFrom.getParams().getHash())).setVariant(OUTPUT_PREFIX_TYPE_CONVERTER.fromProtoEnum(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.HmacKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            com.google.crypto.tink.proto.HmacKey parseFrom = com.google.crypto.tink.proto.HmacKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.mac.HmacKey.builder().setParameters(com.google.crypto.tink.mac.HmacParameters.builder().setKeySizeBytes(parseFrom.getKeyValue().size()).setTagSizeBytes(parseFrom.getParams().getTagSize()).setHashType(HASH_TYPE_CONVERTER.fromProtoEnum(parseFrom.getParams().getHash())).setVariant(OUTPUT_PREFIX_TYPE_CONVERTER.fromProtoEnum(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void register() throws java.security.GeneralSecurityException {
        register(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance());
    }

    public static void register(com.google.crypto.tink.internal.MutableSerializationRegistry mutableSerializationRegistry) throws java.security.GeneralSecurityException {
        mutableSerializationRegistry.registerParametersSerializer(PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(KEY_PARSER);
    }

    private HmacProtoSerialization() {
    }
}
