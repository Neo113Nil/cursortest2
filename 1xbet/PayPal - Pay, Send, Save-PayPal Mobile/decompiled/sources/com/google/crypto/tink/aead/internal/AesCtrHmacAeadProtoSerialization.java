package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public final class AesCtrHmacAeadProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.AesCtrHmacAeadKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.AesCtrHmacAeadParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.serializeParameters((com.google.crypto.tink.aead.AesCtrHmacAeadParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.aead.AesCtrHmacAeadParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.aead.AesCtrHmacAeadParameters parseParameters;
                parseParameters = com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.serializeKey((com.google.crypto.tink.aead.AesCtrHmacAeadKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.aead.AesCtrHmacAeadKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.aead.AesCtrHmacAeadKey parseKey;
                parseKey = com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant variant) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.CRUNCHY.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(variant)));
    }

    private static com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK;
        }
        if (i == 2 || i == 3) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.CRUNCHY;
        }
        if (i == 4) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse OutputPrefixType: ");
        sb.append(outputPrefixType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA1.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA1;
        }
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA224.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA224;
        }
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA256;
        }
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA384.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA384;
        }
        if (com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA512.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(hashType)));
    }

    /* renamed from: com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.HashType.SHA1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA224.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA256.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA384.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA512.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    private static com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType toHashType(com.google.crypto.tink.proto.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.aead.internal.AesCtrHmacAeadProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA1;
        }
        if (i == 2) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA224;
        }
        if (i == 3) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256;
        }
        if (i == 4) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA384;
        }
        if (i == 5) {
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse HashType: ");
        sb.append(hashType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.HmacParams getHmacProtoParams(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.HmacParams.newBuilder().setTagSize(aesCtrHmacAeadParameters.getTagSizeBytes()).setHash(toProtoHashType(aesCtrHmacAeadParameters.getHashType())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.newBuilder().setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.AesCtrParams.newBuilder().setIvSize(aesCtrHmacAeadParameters.getIvSizeBytes()).build()).setKeySize(aesCtrHmacAeadParameters.getAesKeySizeBytes()).build()).setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat.newBuilder().setParams(getHmacProtoParams(aesCtrHmacAeadParameters)).setKeySize(aesCtrHmacAeadParameters.getHmacKeySizeBytes()).build()).build().toByteString()).setOutputPrefixType(toProtoOutputPrefixType(aesCtrHmacAeadParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.AesCtrHmacAeadKey aesCtrHmacAeadKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.AesCtrHmacAeadKey.newBuilder().setAesCtrKey(com.google.crypto.tink.proto.AesCtrKey.newBuilder().setParams(com.google.crypto.tink.proto.AesCtrParams.newBuilder().setIvSize(aesCtrHmacAeadKey.getParameters().getIvSizeBytes()).build()).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(aesCtrHmacAeadKey.getAesKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build()).setHmacKey(com.google.crypto.tink.proto.HmacKey.newBuilder().setParams(getHmacProtoParams(aesCtrHmacAeadKey.getParameters())).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(aesCtrHmacAeadKey.getHmacKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build()).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, toProtoOutputPrefixType(aesCtrHmacAeadKey.getParameters().getVariant()), aesCtrHmacAeadKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.AesCtrHmacAeadParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getHmacKeyFormat().getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(parseFrom.getAesCtrKeyFormat().getKeySize()).setHmacKeySizeBytes(parseFrom.getHmacKeyFormat().getKeySize()).setIvSizeBytes(parseFrom.getAesCtrKeyFormat().getParams().getIvSize()).setTagSizeBytes(parseFrom.getHmacKeyFormat().getParams().getTagSize()).setHashType(toHashType(parseFrom.getHmacKeyFormat().getParams().getHash())).setVariant(toVariant(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.AesCtrHmacAeadKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            com.google.crypto.tink.proto.AesCtrHmacAeadKey parseFrom = com.google.crypto.tink.proto.AesCtrHmacAeadKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (parseFrom.getAesCtrKey().getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (parseFrom.getHmacKey().getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return com.google.crypto.tink.aead.AesCtrHmacAeadKey.builder().setParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(parseFrom.getAesCtrKey().getKeyValue().size()).setHmacKeySizeBytes(parseFrom.getHmacKey().getKeyValue().size()).setIvSizeBytes(parseFrom.getAesCtrKey().getParams().getIvSize()).setTagSizeBytes(parseFrom.getHmacKey().getParams().getTagSize()).setHashType(toHashType(parseFrom.getHmacKey().getParams().getHash())).setVariant(toVariant(protoKeySerialization.getOutputPrefixType())).build()).setAesKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getAesCtrKey().getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).setHmacKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getHmacKey().getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
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

    private AesCtrHmacAeadProtoSerialization() {
    }
}
