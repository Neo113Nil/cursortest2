package com.google.crypto.tink.streamingaead.internal;

/* loaded from: classes9.dex */
public final class AesCtrHmacStreamingProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization.serializeParameters((com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters parseParameters;
                parseParameters = com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization.serializeKey((com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey parseKey;
                parseKey = com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA1.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA1;
        }
        if (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA256;
        }
        if (com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA512.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(hashType)));
    }

    /* renamed from: com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.HashType.SHA1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA256.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType toHashType(com.google.crypto.tink.proto.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.streamingaead.internal.AesCtrHmacStreamingProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA1;
        }
        if (i == 2) {
            return com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA256;
        }
        if (i == 3) {
            return com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse HashType: ");
        sb.append(hashType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.AesCtrHmacStreamingParams toProtoParams(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters aesCtrHmacStreamingParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.AesCtrHmacStreamingParams.newBuilder().setCiphertextSegmentSize(aesCtrHmacStreamingParameters.getCiphertextSegmentSizeBytes()).setDerivedKeySize(aesCtrHmacStreamingParameters.getDerivedKeySizeBytes()).setHkdfHashType(toProtoHashType(aesCtrHmacStreamingParameters.getHkdfHashType())).setHmacParams(com.google.crypto.tink.proto.HmacParams.newBuilder().setHash(toProtoHashType(aesCtrHmacStreamingParameters.getHmacHashType())).setTagSize(aesCtrHmacStreamingParameters.getHmacTagSizeBytes())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters aesCtrHmacStreamingParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.newBuilder().setKeySize(aesCtrHmacStreamingParameters.getKeySizeBytes()).setParams(toProtoParams(aesCtrHmacStreamingParameters)).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey aesCtrHmacStreamingKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.AesCtrHmacStreamingKey.newBuilder().setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(aesCtrHmacStreamingKey.getInitialKeyMaterial().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).setParams(toProtoParams(aesCtrHmacStreamingKey.getParameters())).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.OutputPrefixType.RAW, aesCtrHmacStreamingKey.getIdRequirementOrNull());
    }

    private static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters toParametersObject(com.google.crypto.tink.proto.AesCtrHmacStreamingParams aesCtrHmacStreamingParams, int i) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters.builder().setKeySizeBytes(i).setDerivedKeySizeBytes(aesCtrHmacStreamingParams.getDerivedKeySize()).setCiphertextSegmentSizeBytes(aesCtrHmacStreamingParams.getCiphertextSegmentSize()).setHkdfHashType(toHashType(aesCtrHmacStreamingParams.getHkdfHashType())).setHmacHashType(toHashType(aesCtrHmacStreamingParams.getHmacParams().getHash())).setHmacTagSizeBytes(java.lang.Integer.valueOf(aesCtrHmacStreamingParams.getHmacParams().getTagSize())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat parseFrom = com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            return toParametersObject(parseFrom.getParams(), parseFrom.getKeySize());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
        }
        try {
            com.google.crypto.tink.proto.AesCtrHmacStreamingKey parseFrom = com.google.crypto.tink.proto.AesCtrHmacStreamingKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.create(toParametersObject(parseFrom.getParams(), parseFrom.getKeyValue().size()), com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)));
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
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

    private AesCtrHmacStreamingProtoSerialization() {
    }
}
