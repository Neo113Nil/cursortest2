package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class HpkeProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HpkeAead, com.google.crypto.tink.hybrid.HpkeParameters.AeadId> AEAD_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HpkeKdf, com.google.crypto.tink.hybrid.HpkeParameters.KdfId> KDF_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HpkeKem, com.google.crypto.tink.hybrid.HpkeParameters.KemId> KEM_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.hybrid.HpkeParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.hybrid.HpkePrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.hybrid.HpkePublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.hybrid.HpkeParameters.Variant> VARIANT_TYPE_CONVERTER;
    private static final int VERSION = 0;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.hybrid.HpkeProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.hybrid.HpkeProtoSerialization.serializeParameters((com.google.crypto.tink.hybrid.HpkeParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.hybrid.HpkeParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.hybrid.HpkeProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.hybrid.HpkeParameters parseParameters;
                parseParameters = com.google.crypto.tink.hybrid.HpkeProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.hybrid.HpkeProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.hybrid.HpkeProtoSerialization.serializePublicKey((com.google.crypto.tink.hybrid.HpkePublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.hybrid.HpkePublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.hybrid.HpkeProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.hybrid.HpkePublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.hybrid.HpkeProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.hybrid.HpkeProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.hybrid.HpkeProtoSerialization.serializePrivateKey((com.google.crypto.tink.hybrid.HpkePrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.hybrid.HpkePrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.hybrid.HpkeProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.hybrid.HpkePrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.hybrid.HpkeProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        VARIANT_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.OutputPrefixType.RAW, com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).add(com.google.crypto.tink.proto.OutputPrefixType.TINK, com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).add(com.google.crypto.tink.proto.OutputPrefixType.LEGACY, com.google.crypto.tink.hybrid.HpkeParameters.Variant.CRUNCHY).add(com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY, com.google.crypto.tink.hybrid.HpkeParameters.Variant.CRUNCHY).build();
        KEM_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256, com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256).add(com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384, com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384).add(com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512, com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512).add(com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256, com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).build();
        KDF_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA256, com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).add(com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA384, com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA384).add(com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA512, com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA512).build();
        AEAD_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HpkeAead.AES_128_GCM, com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).add(com.google.crypto.tink.proto.HpkeAead.AES_256_GCM, com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).add(com.google.crypto.tink.proto.HpkeAead.CHACHA20_POLY1305, com.google.crypto.tink.hybrid.HpkeParameters.AeadId.CHACHA20_POLY1305).build();
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

    private static com.google.crypto.tink.proto.HpkeParams toProtoParameters(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.HpkeParams.newBuilder().setKem(KEM_TYPE_CONVERTER.toProtoEnum(hpkeParameters.getKemId())).setKdf(KDF_TYPE_CONVERTER.toProtoEnum(hpkeParameters.getKdfId())).setAead(AEAD_TYPE_CONVERTER.toProtoEnum(hpkeParameters.getAeadId())).build();
    }

    private static com.google.crypto.tink.proto.HpkePublicKey toProtoPublicKey(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.HpkePublicKey.newBuilder().setVersion(0).setParams(toProtoParameters(hpkePublicKey.getParameters())).setPublicKey(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(hpkePublicKey.getPublicKeyBytes().toByteArray())).build();
    }

    private static com.google.crypto.tink.proto.HpkePrivateKey toProtoPrivateKey(com.google.crypto.tink.hybrid.HpkePrivateKey hpkePrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.HpkePrivateKey.newBuilder().setVersion(0).setPublicKey(toProtoPublicKey(hpkePrivateKey.getPublicKey())).setPrivateKey(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(hpkePrivateKey.getPrivateKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)))).build();
    }

    private static com.google.crypto.tink.hybrid.HpkeParameters fromProtoParameters(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, com.google.crypto.tink.proto.HpkeParams hpkeParams) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(VARIANT_TYPE_CONVERTER.fromProtoEnum(outputPrefixType)).setKemId(KEM_TYPE_CONVERTER.fromProtoEnum(hpkeParams.getKem())).setKdfId(KDF_TYPE_CONVERTER.fromProtoEnum(hpkeParams.getKdf())).setAeadId(AEAD_TYPE_CONVERTER.fromProtoEnum(hpkeParams.getAead())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(com.google.crypto.tink.proto.HpkeKeyFormat.newBuilder().setParams(toProtoParameters(hpkeParameters)).build().toByteString()).setOutputPrefixType(VARIANT_TYPE_CONVERTER.toProtoEnum(hpkeParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, toProtoPublicKey(hpkePublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, VARIANT_TYPE_CONVERTER.toProtoEnum(hpkePublicKey.getParameters().getVariant()), hpkePublicKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.hybrid.HpkePrivateKey hpkePrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, toProtoPrivateKey(hpkePrivateKey, secretKeyAccess).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, VARIANT_TYPE_CONVERTER.toProtoEnum(hpkePrivateKey.getParameters().getVariant()), hpkePrivateKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.HpkeParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return fromProtoParameters(protoParametersSerialization.getKeyTemplate().getOutputPrefixType(), com.google.crypto.tink.proto.HpkeKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()).getParams());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing HpkeParameters failed: ", e);
        }
    }

    private static com.google.crypto.tink.util.Bytes encodePublicKeyBytes(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.util.Bytes.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr), com.google.crypto.tink.hybrid.internal.HpkeUtil.getEncodedPublicKeyLength(kemId)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.HpkePublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.HpkePublicKey parseFrom = com.google.crypto.tink.proto.HpkePublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.hybrid.HpkeParameters fromProtoParameters = fromProtoParameters(protoKeySerialization.getOutputPrefixType(), parseFrom.getParams());
            return com.google.crypto.tink.hybrid.HpkePublicKey.create(fromProtoParameters, encodePublicKeyBytes(fromProtoParameters.getKemId(), parseFrom.getPublicKey().toByteArray()), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }

    private static com.google.crypto.tink.util.SecretBytes encodePrivateKeyBytes(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, byte[] bArr, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.util.SecretBytes.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr), com.google.crypto.tink.hybrid.internal.HpkeUtil.getEncodedPrivateKeyLength(kemId)), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.HpkePrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.HpkePrivateKey parseFrom = com.google.crypto.tink.proto.HpkePrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.proto.HpkePublicKey publicKey = parseFrom.getPublicKey();
            if (publicKey.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.hybrid.HpkeParameters fromProtoParameters = fromProtoParameters(protoKeySerialization.getOutputPrefixType(), publicKey.getParams());
            return com.google.crypto.tink.hybrid.HpkePrivateKey.create(com.google.crypto.tink.hybrid.HpkePublicKey.create(fromProtoParameters, encodePublicKeyBytes(fromProtoParameters.getKemId(), publicKey.getPublicKey().toByteArray()), protoKeySerialization.getIdRequirementOrNull()), encodePrivateKeyBytes(fromProtoParameters.getKemId(), parseFrom.getPrivateKey().toByteArray(), secretKeyAccess));
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    private HpkeProtoSerialization() {
    }
}
