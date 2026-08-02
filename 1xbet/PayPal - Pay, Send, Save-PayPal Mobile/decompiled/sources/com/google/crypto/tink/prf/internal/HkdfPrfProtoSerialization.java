package com.google.crypto.tink.prf.internal;

/* loaded from: classes9.dex */
public final class HkdfPrfProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.prf.HkdfPrfParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization.serializeParameters((com.google.crypto.tink.prf.HkdfPrfParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.prf.HkdfPrfParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.prf.HkdfPrfParameters parseParameters;
                parseParameters = com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization.serializeKey((com.google.crypto.tink.prf.HkdfPrfKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.prf.HkdfPrfKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.prf.HkdfPrfKey parseKey;
                parseKey = com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA1;
        }
        if (com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA224;
        }
        if (com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA256;
        }
        if (com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA384;
        }
        if (com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(hashType)));
    }

    /* renamed from: com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization$1, reason: invalid class name */
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
        }
    }

    private static com.google.crypto.tink.prf.HkdfPrfParameters.HashType toHashType(com.google.crypto.tink.proto.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.prf.internal.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1;
        }
        if (i == 2) {
            return com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224;
        }
        if (i == 3) {
            return com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256;
        }
        if (i == 4) {
            return com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384;
        }
        if (i == 5) {
            return com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse HashType: ");
        sb.append(hashType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.HkdfPrfParams getProtoParams(com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.HkdfPrfParams.Builder hash = com.google.crypto.tink.proto.HkdfPrfParams.newBuilder().setHash(toProtoHashType(hkdfPrfParameters.getHashType()));
        if (hkdfPrfParameters.getSalt() != null && hkdfPrfParameters.getSalt().size() > 0) {
            hash.setSalt(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(hkdfPrfParameters.getSalt().toByteArray()));
        }
        return hash.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder().setParams(getProtoParams(hkdfPrfParameters)).setKeySize(hkdfPrfParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.HkdfPrfKey.newBuilder().setParams(getProtoParams(hkdfPrfKey.getParameters())).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(hkdfPrfKey.getKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.OutputPrefixType.RAW, hkdfPrfKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.HkdfPrfParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.HkdfPrfKeyFormat parseFrom = com.google.crypto.tink.proto.HkdfPrfKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Parsing HkdfPrfParameters failed: unknown Version ");
                sb2.append(parseFrom.getVersion());
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
            if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType() != com.google.crypto.tink.proto.OutputPrefixType.RAW) {
                throw new java.security.GeneralSecurityException("Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted");
            }
            return com.google.crypto.tink.prf.HkdfPrfParameters.builder().setKeySizeBytes(parseFrom.getKeySize()).setHashType(toHashType(parseFrom.getParams().getHash())).setSalt(com.google.crypto.tink.util.Bytes.copyFrom(parseFrom.getParams().getSalt().toByteArray())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing HkdfPrfParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.HkdfPrfKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseKey");
        }
        try {
            com.google.crypto.tink.proto.HkdfPrfKey parseFrom = com.google.crypto.tink.proto.HkdfPrfKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (protoKeySerialization.getIdRequirementOrNull() != null) {
                throw new java.security.GeneralSecurityException("ID requirement must be null.");
            }
            return com.google.crypto.tink.prf.HkdfPrfKey.builder().setParameters(com.google.crypto.tink.prf.HkdfPrfParameters.builder().setKeySizeBytes(parseFrom.getKeyValue().size()).setHashType(toHashType(parseFrom.getParams().getHash())).setSalt(com.google.crypto.tink.util.Bytes.copyFrom(parseFrom.getParams().getSalt().toByteArray())).build()).setKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing HkdfPrfKey failed");
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

    private HkdfPrfProtoSerialization() {
    }
}
