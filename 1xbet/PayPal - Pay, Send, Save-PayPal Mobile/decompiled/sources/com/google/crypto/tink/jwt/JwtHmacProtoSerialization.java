package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtHmacProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.jwt.JwtHmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.jwt.JwtHmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtHmacKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtHmacProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.jwt.JwtHmacProtoSerialization.serializeParameters((com.google.crypto.tink.jwt.JwtHmacParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.jwt.JwtHmacParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtHmacProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.jwt.JwtHmacParameters parseParameters;
                parseParameters = com.google.crypto.tink.jwt.JwtHmacProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.jwt.JwtHmacProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializeKey;
                serializeKey = com.google.crypto.tink.jwt.JwtHmacProtoSerialization.serializeKey((com.google.crypto.tink.jwt.JwtHmacKey) key, secretKeyAccess);
                return serializeKey;
            }
        }, com.google.crypto.tink.jwt.JwtHmacKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.jwt.JwtHmacProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.jwt.JwtHmacKey parseKey;
                parseKey = com.google.crypto.tink.jwt.JwtHmacProtoSerialization.parseKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parseKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.JwtHmacAlgorithm toProtoAlgorithm(com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256.equals(algorithm)) {
            return com.google.crypto.tink.proto.JwtHmacAlgorithm.HS256;
        }
        if (com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384.equals(algorithm)) {
            return com.google.crypto.tink.proto.JwtHmacAlgorithm.HS384;
        }
        if (com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512.equals(algorithm)) {
            return com.google.crypto.tink.proto.JwtHmacAlgorithm.HS512;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(algorithm)));
    }

    /* renamed from: com.google.crypto.tink.jwt.JwtHmacProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.JwtHmacAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm = iArr;
            try {
                iArr[com.google.crypto.tink.proto.JwtHmacAlgorithm.HS256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[com.google.crypto.tink.proto.JwtHmacAlgorithm.HS384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[com.google.crypto.tink.proto.JwtHmacAlgorithm.HS512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm toAlgorithm(com.google.crypto.tink.proto.JwtHmacAlgorithm jwtHmacAlgorithm) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.jwt.JwtHmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm[jwtHmacAlgorithm.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS256;
        }
        if (i == 2) {
            return com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS384;
        }
        if (i == 3) {
            return com.google.crypto.tink.jwt.JwtHmacParameters.Algorithm.HS512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse HashType: ");
        sb.append(jwtHmacAlgorithm.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.JwtHmacKeyFormat serializeToJwtHmacKeyFormat(com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters) throws java.security.GeneralSecurityException {
        if (jwtHmacParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.CUSTOM)) {
            throw new java.security.GeneralSecurityException("Unable to serialize Parameters object with KidStrategy CUSTOM");
        }
        return com.google.crypto.tink.proto.JwtHmacKeyFormat.newBuilder().setVersion(0).setAlgorithm(toProtoAlgorithm(jwtHmacParameters.getAlgorithm())).setKeySize(jwtHmacParameters.getKeySizeBytes()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.jwt.JwtHmacParameters jwtHmacParameters) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.TINK;
        if (jwtHmacParameters.getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED)) {
            outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(serializeToJwtHmacKeyFormat(jwtHmacParameters).toByteString()).setOutputPrefixType(outputPrefixType).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.jwt.JwtHmacKey jwtHmacKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
        com.google.crypto.tink.proto.JwtHmacKey.Builder newBuilder = com.google.crypto.tink.proto.JwtHmacKey.newBuilder();
        newBuilder.setVersion(0).setAlgorithm(toProtoAlgorithm(jwtHmacKey.getParameters().getAlgorithm())).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(jwtHmacKey.getKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))));
        if (jwtHmacKey.getParameters().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.CUSTOM)) {
            newBuilder.setCustomKid(com.google.crypto.tink.proto.JwtHmacKey.CustomKid.newBuilder().setValue(jwtHmacKey.getKid().get()));
            outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        } else {
            outputPrefixType = null;
        }
        if (jwtHmacKey.getParameters().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED)) {
            outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (jwtHmacKey.getParameters().getKidStrategy().equals(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID)) {
            outputPrefixType = com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (outputPrefixType == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown KID Strategy in ");
            sb.append(jwtHmacKey.getParameters().getKidStrategy());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(TYPE_URL, newBuilder.build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, outputPrefixType, jwtHmacKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtHmacParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to JwtHmacProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.JwtHmacKeyFormat parseFrom = com.google.crypto.tink.proto.JwtHmacKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Parsing HmacParameters failed: unknown Version ");
                sb2.append(parseFrom.getVersion());
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
            com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy kidStrategy = protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.TINK) ? com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID : null;
            if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
                kidStrategy = com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED;
            }
            if (kidStrategy == null) {
                throw new java.security.GeneralSecurityException("Invalid OutputPrefixType for JwtHmacKeyFormat");
            }
            return com.google.crypto.tink.jwt.JwtHmacParameters.builder().setAlgorithm(toAlgorithm(parseFrom.getAlgorithm())).setKeySizeBytes(parseFrom.getKeySize()).setKidStrategy(kidStrategy).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.jwt.JwtHmacKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            com.google.crypto.tink.proto.JwtHmacKey parseFrom = com.google.crypto.tink.proto.JwtHmacKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.jwt.JwtHmacParameters.Builder builder = com.google.crypto.tink.jwt.JwtHmacParameters.builder();
            com.google.crypto.tink.jwt.JwtHmacKey.Builder builder2 = com.google.crypto.tink.jwt.JwtHmacKey.builder();
            if (protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.TINK)) {
                if (parseFrom.hasCustomKid()) {
                    throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK should not have a custom kid");
                }
                java.lang.Integer idRequirementOrNull = protoKeySerialization.getIdRequirementOrNull();
                if (idRequirementOrNull == null) {
                    throw new java.security.GeneralSecurityException("Keys serialized with OutputPrefixType TINK need an ID Requirement");
                }
                builder.setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.BASE64_ENCODED_KEY_ID);
                builder2.setIdRequirement(idRequirementOrNull.intValue());
            } else if (protoKeySerialization.getOutputPrefixType().equals(com.google.crypto.tink.proto.OutputPrefixType.RAW)) {
                if (parseFrom.hasCustomKid()) {
                    builder.setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.CUSTOM);
                    builder2.setCustomKid(parseFrom.getCustomKid().getValue());
                } else {
                    builder.setKidStrategy(com.google.crypto.tink.jwt.JwtHmacParameters.KidStrategy.IGNORED);
                }
            }
            builder.setAlgorithm(toAlgorithm(parseFrom.getAlgorithm()));
            builder.setKeySizeBytes(parseFrom.getKeyValue().size());
            return builder2.setKeyBytes(com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).setParameters(builder.build()).build();
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

    private JwtHmacProtoSerialization() {
    }
}
