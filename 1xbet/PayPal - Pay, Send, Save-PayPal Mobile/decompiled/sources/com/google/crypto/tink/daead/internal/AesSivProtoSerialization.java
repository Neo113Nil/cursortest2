package com.google.crypto.tink.daead.internal;

/* loaded from: classes4.dex */
public final class AesSivProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.daead.AesSivKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.daead.AesSivParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesSivKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;
    private static final java.util.Map<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.daead.AesSivParameters.Variant> outputPrefixToVariantMap;
    private static final java.util.Map<com.google.crypto.tink.daead.AesSivParameters.Variant, com.google.crypto.tink.proto.OutputPrefixType> variantsToOutputPrefixMap;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.daead.internal.AesSivProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.daead.internal.AesSivProtoSerialization.serializeParameters((com.google.crypto.tink.daead.AesSivParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.daead.AesSivParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.daead.internal.AesSivProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.daead.AesSivParameters parseParameters;
                parseParameters = com.google.crypto.tink.daead.internal.AesSivProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.daead.internal.AesSivProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.daead.internal.AesSivProtoSerialization.serializeKey((com.google.crypto.tink.daead.AesSivKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.daead.AesSivKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.daead.internal.AesSivProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.daead.AesSivKey parseKey;
                parseKey = com.google.crypto.tink.daead.internal.AesSivProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        variantsToOutputPrefixMap = createVariantToOutputPrefixMap();
        outputPrefixToVariantMap = createOutputPrefixToVariantMap();
    }

    private static java.util.Map<com.google.crypto.tink.daead.AesSivParameters.Variant, com.google.crypto.tink.proto.OutputPrefixType> createVariantToOutputPrefixMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.google.crypto.tink.daead.AesSivParameters.Variant.NO_PREFIX, com.google.crypto.tink.proto.OutputPrefixType.RAW);
        hashMap.put(com.google.crypto.tink.daead.AesSivParameters.Variant.TINK, com.google.crypto.tink.proto.OutputPrefixType.TINK);
        hashMap.put(com.google.crypto.tink.daead.AesSivParameters.Variant.CRUNCHY, com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    private static java.util.Map<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.daead.AesSivParameters.Variant> createOutputPrefixToVariantMap() {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.crypto.tink.proto.OutputPrefixType.class);
        enumMap.put((java.util.EnumMap) com.google.crypto.tink.proto.OutputPrefixType.RAW, (com.google.crypto.tink.proto.OutputPrefixType) com.google.crypto.tink.daead.AesSivParameters.Variant.NO_PREFIX);
        enumMap.put((java.util.EnumMap) com.google.crypto.tink.proto.OutputPrefixType.TINK, (com.google.crypto.tink.proto.OutputPrefixType) com.google.crypto.tink.daead.AesSivParameters.Variant.TINK);
        enumMap.put((java.util.EnumMap) com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY, (com.google.crypto.tink.proto.OutputPrefixType) com.google.crypto.tink.daead.AesSivParameters.Variant.CRUNCHY);
        enumMap.put((java.util.EnumMap) com.google.crypto.tink.proto.OutputPrefixType.LEGACY, (com.google.crypto.tink.proto.OutputPrefixType) com.google.crypto.tink.daead.AesSivParameters.Variant.CRUNCHY);
        return java.util.Collections.unmodifiableMap(enumMap);
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.daead.AesSivParameters.Variant variant) throws java.security.GeneralSecurityException {
        java.util.Map<com.google.crypto.tink.daead.AesSivParameters.Variant, com.google.crypto.tink.proto.OutputPrefixType> map = variantsToOutputPrefixMap;
        if (map.containsKey(variant)) {
            return map.get(variant);
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(variant)));
    }

    private static com.google.crypto.tink.daead.AesSivParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        java.util.Map<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.daead.AesSivParameters.Variant> map = outputPrefixToVariantMap;
        if (map.containsKey(outputPrefixType)) {
            return map.get(outputPrefixType);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse OutputPrefixType: ");
        sb.append(outputPrefixType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.daead.AesSivParameters aesSivParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.AesSivKeyFormat.newBuilder().setKeySize(aesSivParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(toProtoOutputPrefixType(aesSivParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.daead.AesSivKey aesSivKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.AesSivKey.newBuilder().setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(aesSivKey.getKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, toProtoOutputPrefixType(aesSivKey.getParameters().getVariant()), aesSivKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.daead.AesSivParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to AesSivParameters.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.AesSivKeyFormat parseFrom = com.google.crypto.tink.proto.AesSivKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(parseFrom.getKeySize()).setVariant(toVariant(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing AesSivParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.daead.AesSivKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            com.google.crypto.tink.proto.AesSivKey parseFrom = com.google.crypto.tink.proto.AesSivKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.daead.AesSivKey.builder().setParameters(com.google.crypto.tink.daead.AesSivParameters.builder().setKeySizeBytes(parseFrom.getKeyValue().size()).setVariant(toVariant(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesSivKey failed");
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

    private AesSivProtoSerialization() {
    }
}
