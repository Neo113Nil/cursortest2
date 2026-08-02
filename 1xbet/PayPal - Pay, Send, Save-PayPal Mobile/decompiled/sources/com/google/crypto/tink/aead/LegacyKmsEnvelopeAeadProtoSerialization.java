package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class LegacyKmsEnvelopeAeadProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization.serializeParameters((com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters parseParameters;
                parseParameters = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization.serializeKey((com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey parseKey;
                parseKey = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant variant) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.TINK.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.NO_PREFIX.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(variant)));
    }

    /* renamed from: com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.TINK;
        }
        if (i == 2) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.NO_PREFIX;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse OutputPrefixType: ");
        sb.append(outputPrefixType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(serializeParametersToKmsEnvelopeAeadKeyFormat(legacyKmsEnvelopeAeadParameters).toByteString()).setOutputPrefixType(toProtoOutputPrefixType(legacyKmsEnvelopeAeadParameters.getVariant())).build());
    }

    private static com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat serializeParametersToKmsEnvelopeAeadKeyFormat(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.newBuilder().setKekUri(legacyKmsEnvelopeAeadParameters.getKekUri()).setDekTemplate(com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(legacyKmsEnvelopeAeadParameters.getDekParametersForNewKeys()), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey legacyKmsEnvelopeAeadKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.KmsEnvelopeAeadKey.newBuilder().setParams(serializeParametersToKmsEnvelopeAeadKeyFormat(legacyKmsEnvelopeAeadKey.getParameters())).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE, toProtoOutputPrefixType(legacyKmsEnvelopeAeadKey.getParameters().getVariant()), legacyKmsEnvelopeAeadKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return parseParameters(com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()), protoParametersSerialization.getKeyTemplate().getOutputPrefixType());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters parseParameters(com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy dekParsingStrategy;
        com.google.crypto.tink.Parameters parse = com.google.crypto.tink.TinkProtoParametersFormat.parse(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(kmsEnvelopeAeadKeyFormat.getDekTemplate().getTypeUrl()).setValue(kmsEnvelopeAeadKeyFormat.getDekTemplate().getValue()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build().toByteArray());
        if (parse instanceof com.google.crypto.tink.aead.AesGcmParameters) {
            dekParsingStrategy = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_GCM;
        } else if (parse instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Parameters) {
            dekParsingStrategy = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_CHACHA20POLY1305;
        } else if (parse instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) {
            dekParsingStrategy = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_XCHACHA20POLY1305;
        } else if (parse instanceof com.google.crypto.tink.aead.AesCtrHmacAeadParameters) {
            dekParsingStrategy = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_CTR_HMAC;
        } else if (parse instanceof com.google.crypto.tink.aead.AesEaxParameters) {
            dekParsingStrategy = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_EAX;
        } else if (parse instanceof com.google.crypto.tink.aead.AesGcmSivParameters) {
            dekParsingStrategy = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_GCM_SIV;
        } else {
            throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(java.lang.String.valueOf(parse)));
        }
        return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.builder().setVariant(toVariant(outputPrefixType)).setKekUri(kmsEnvelopeAeadKeyFormat.getKekUri()).setDekParametersForNewKeys((com.google.crypto.tink.aead.AeadParameters) parse).setDekParsingStrategy(dekParsingStrategy).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            com.google.crypto.tink.proto.KmsEnvelopeAeadKey parseFrom = com.google.crypto.tink.proto.KmsEnvelopeAeadKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                sb.append(parseFrom);
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey.create(parseParameters(parseFrom.getParams(), protoKeySerialization.getOutputPrefixType()), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
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

    private LegacyKmsEnvelopeAeadProtoSerialization() {
    }
}
