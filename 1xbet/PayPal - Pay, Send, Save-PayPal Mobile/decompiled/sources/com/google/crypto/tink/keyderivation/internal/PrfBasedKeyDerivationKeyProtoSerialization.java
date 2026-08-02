package com.google.crypto.tink.keyderivation.internal;

/* loaded from: classes9.dex */
final class PrfBasedKeyDerivationKeyProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.PrfBasedDeriverKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization.serializeParameters((com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters parseParameters;
                parseParameters = com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization.serializeKey((com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey parseKey;
                parseKey = com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to PrfBasedKeyDerivationKeyProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat parseFrom = com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            com.google.crypto.tink.Parameters parse = com.google.crypto.tink.TinkProtoParametersFormat.parse(parseFrom.getParams().getDerivedKeyTemplate().toByteArray());
            com.google.crypto.tink.Parameters parse2 = com.google.crypto.tink.TinkProtoParametersFormat.parse(parseFrom.getPrfKeyTemplate().toByteArray());
            if (!(parse2 instanceof com.google.crypto.tink.prf.PrfParameters)) {
                throw new java.security.GeneralSecurityException("Non-PRF parameters stored in the field prf_key_template");
            }
            if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType() != parseFrom.getParams().getDerivedKeyTemplate().getOutputPrefixType()) {
                throw new java.security.GeneralSecurityException("Output-Prefix mismatch in parameters while parsing ".concat(java.lang.String.valueOf(parseFrom)));
            }
            return com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.builder().setPrfParameters((com.google.crypto.tink.prf.PrfParameters) parse2).setDerivedKeyParameters(parse).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing PrfBasedDeriverKeyFormat failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters prfBasedKeyDerivationParameters) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.proto.KeyTemplate parseFrom = com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(prfBasedKeyDerivationParameters.getPrfParameters()), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            com.google.crypto.tink.proto.KeyTemplate parseFrom2 = com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(prfBasedKeyDerivationParameters.getDerivedKeyParameters()), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.newBuilder().setPrfKeyTemplate(parseFrom).setParams(com.google.crypto.tink.proto.PrfBasedDeriverParams.newBuilder().setDerivedKeyTemplate(parseFrom2)).build().toByteString()).setOutputPrefixType(parseFrom2.getOutputPrefixType()).build());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Serializing PrfBasedKeyDerivationParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey prfBasedKeyDerivationKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization = (com.google.crypto.tink.internal.ProtoKeySerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeKey(prfBasedKeyDerivationKey.getPrfKey(), com.google.crypto.tink.internal.ProtoKeySerialization.class, secretKeyAccess);
        com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization = (com.google.crypto.tink.internal.ProtoParametersSerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeParameters(prfBasedKeyDerivationKey.getParameters().getDerivedKeyParameters(), com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.PrfBasedDeriverKey.newBuilder().setPrfKey(com.google.crypto.tink.proto.KeyData.newBuilder().setValue(protoKeySerialization.getValue()).setTypeUrl(protoKeySerialization.getTypeUrl()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType())).setParams(com.google.crypto.tink.proto.PrfBasedDeriverParams.newBuilder().setDerivedKeyTemplate(protoParametersSerialization.getKeyTemplate())).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, protoParametersSerialization.getKeyTemplate().getOutputPrefixType(), prfBasedKeyDerivationKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to PrfBasedKeyDerivationKey.parseKey");
        }
        try {
            com.google.crypto.tink.proto.PrfBasedDeriverKey parseFrom = com.google.crypto.tink.proto.PrfBasedDeriverKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(com.google.crypto.tink.internal.ProtoKeySerialization.create(parseFrom.getPrfKey().getTypeUrl(), parseFrom.getPrfKey().getValue(), parseFrom.getPrfKey().getKeyMaterialType(), com.google.crypto.tink.proto.OutputPrefixType.RAW, null), secretKeyAccess);
            if (!(parseKey instanceof com.google.crypto.tink.prf.PrfKey)) {
                throw new java.security.GeneralSecurityException("Non-PRF key stored in the field prf_key");
            }
            com.google.crypto.tink.prf.PrfKey prfKey = (com.google.crypto.tink.prf.PrfKey) parseKey;
            com.google.crypto.tink.internal.ProtoParametersSerialization checkedCreate = com.google.crypto.tink.internal.ProtoParametersSerialization.checkedCreate(parseFrom.getParams().getDerivedKeyTemplate());
            com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters build = com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.builder().setDerivedKeyParameters(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseParameters(checkedCreate)).setPrfParameters(prfKey.getParameters()).build();
            if (protoKeySerialization.getOutputPrefixType() != checkedCreate.getKeyTemplate().getOutputPrefixType()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Output-Prefix mismatch in parameters while parsing PrfBasedKeyDerivationKey with parameters ");
                sb.append(build);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            return com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey.create(build, prfKey, protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
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

    private PrfBasedKeyDerivationKeyProtoSerialization() {
    }
}
