package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public final class XChaCha20Poly1305ProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.XChaCha20Poly1305Key, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.XChaCha20Poly1305Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization.serializeParameters((com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.aead.XChaCha20Poly1305Parameters parseParameters;
                parseParameters = com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization.serializeKey((com.google.crypto.tink.aead.XChaCha20Poly1305Key) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.aead.XChaCha20Poly1305Key.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.aead.XChaCha20Poly1305Key parseKey;
                parseKey = com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant variant) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.CRUNCHY.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        if (com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(variant)));
    }

    /* renamed from: com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization$1, reason: invalid class name */
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
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private static com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.aead.internal.XChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK;
        }
        if (i == 2 || i == 3) {
            return com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.CRUNCHY;
        }
        if (i == 4) {
            return com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse OutputPrefixType: ");
        sb.append(outputPrefixType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters xChaCha20Poly1305Parameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat.getDefaultInstance().toByteString()).setOutputPrefixType(toProtoOutputPrefixType(xChaCha20Poly1305Parameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.XChaCha20Poly1305Key xChaCha20Poly1305Key, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.XChaCha20Poly1305Key.newBuilder().setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(xChaCha20Poly1305Key.getKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, toProtoOutputPrefixType(xChaCha20Poly1305Key.getParameters().getVariant()), xChaCha20Poly1305Key.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.XChaCha20Poly1305Parameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            if (com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()).getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            return com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(toVariant(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()));
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.XChaCha20Poly1305Key parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            com.google.crypto.tink.proto.XChaCha20Poly1305Key parseFrom = com.google.crypto.tink.proto.XChaCha20Poly1305Key.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.aead.XChaCha20Poly1305Key.create(toVariant(protoKeySerialization.getOutputPrefixType()), com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
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

    public static void register(com.google.crypto.tink.internal.SerializationRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerParametersSerializer(PARAMETERS_SERIALIZER);
        builder.registerParametersParser(PARAMETERS_PARSER);
        builder.registerKeySerializer(KEY_SERIALIZER);
        builder.registerKeyParser(KEY_PARSER);
    }

    private XChaCha20Poly1305ProtoSerialization() {
    }
}
