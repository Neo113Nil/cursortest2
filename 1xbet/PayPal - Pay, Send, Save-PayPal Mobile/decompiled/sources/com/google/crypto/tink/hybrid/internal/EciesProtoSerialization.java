package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class EciesProtoSerialization {
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.EllipticCurveType, com.google.crypto.tink.hybrid.EciesParameters.CurveType> CURVE_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.HashType, com.google.crypto.tink.hybrid.EciesParameters.HashType> HASH_TYPE_CONVERTER;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.hybrid.EciesParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.EcPointFormat, com.google.crypto.tink.hybrid.EciesParameters.PointFormat> POINT_FORMAT_CONVERTER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.hybrid.EciesPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.hybrid.EciesPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.proto.OutputPrefixType, com.google.crypto.tink.hybrid.EciesParameters.Variant> VARIANT_CONVERTER;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.hybrid.internal.EciesProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.serializeParameters((com.google.crypto.tink.hybrid.EciesParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.hybrid.EciesParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.hybrid.internal.EciesProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.hybrid.EciesParameters parseParameters;
                parseParameters = com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.hybrid.internal.EciesProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.serializePublicKey((com.google.crypto.tink.hybrid.EciesPublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.hybrid.EciesPublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.hybrid.internal.EciesProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.hybrid.EciesPublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.hybrid.internal.EciesProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.serializePrivateKey((com.google.crypto.tink.hybrid.EciesPrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.hybrid.EciesPrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.hybrid.internal.EciesProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.hybrid.EciesPrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        VARIANT_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.OutputPrefixType.RAW, com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).add(com.google.crypto.tink.proto.OutputPrefixType.TINK, com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).add(com.google.crypto.tink.proto.OutputPrefixType.LEGACY, com.google.crypto.tink.hybrid.EciesParameters.Variant.CRUNCHY).add(com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY, com.google.crypto.tink.hybrid.EciesParameters.Variant.CRUNCHY).build();
        HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.HashType.SHA1, com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA1).add(com.google.crypto.tink.proto.HashType.SHA224, com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA224).add(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).add(com.google.crypto.tink.proto.HashType.SHA384, com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA384).add(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA512).build();
        CURVE_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).add(com.google.crypto.tink.proto.EllipticCurveType.NIST_P384, com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P384).add(com.google.crypto.tink.proto.EllipticCurveType.NIST_P521, com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P521).add(com.google.crypto.tink.proto.EllipticCurveType.CURVE25519, com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519).build();
        POINT_FORMAT_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED, com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).add(com.google.crypto.tink.proto.EcPointFormat.COMPRESSED, com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).add(com.google.crypto.tink.proto.EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, com.google.crypto.tink.hybrid.EciesParameters.PointFormat.LEGACY_UNCOMPRESSED).build();
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

    private static com.google.crypto.tink.proto.EciesAeadHkdfParams toProtoParameters(com.google.crypto.tink.hybrid.EciesParameters eciesParameters) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.EciesHkdfKemParams.Builder hkdfHashType = com.google.crypto.tink.proto.EciesHkdfKemParams.newBuilder().setCurveType(CURVE_TYPE_CONVERTER.toProtoEnum(eciesParameters.getCurveType())).setHkdfHashType(HASH_TYPE_CONVERTER.toProtoEnum(eciesParameters.getHashType()));
        if (eciesParameters.getSalt() != null && eciesParameters.getSalt().size() > 0) {
            hkdfHashType.setHkdfSalt(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(eciesParameters.getSalt().toByteArray()));
        }
        com.google.crypto.tink.proto.EciesHkdfKemParams build = hkdfHashType.build();
        try {
            com.google.crypto.tink.proto.KeyTemplate parseFrom = com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(eciesParameters.getDemParameters()), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            com.google.crypto.tink.proto.EciesAeadDemParams build2 = com.google.crypto.tink.proto.EciesAeadDemParams.newBuilder().setAeadDem(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(parseFrom.getTypeUrl()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).setValue(parseFrom.getValue()).build()).build();
            com.google.crypto.tink.hybrid.EciesParameters.PointFormat nistCurvePointFormat = eciesParameters.getNistCurvePointFormat();
            if (nistCurvePointFormat == null) {
                nistCurvePointFormat = com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED;
            }
            return com.google.crypto.tink.proto.EciesAeadHkdfParams.newBuilder().setKemParams(build).setDemParams(build2).setEcPointFormat(POINT_FORMAT_CONVERTER.toProtoEnum(nistCurvePointFormat)).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    private static com.google.crypto.tink.hybrid.EciesParameters fromProtoParameters(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, com.google.crypto.tink.proto.EciesAeadHkdfParams eciesAeadHkdfParams) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.EciesParameters.Builder salt = com.google.crypto.tink.hybrid.EciesParameters.builder().setVariant(VARIANT_CONVERTER.fromProtoEnum(outputPrefixType)).setCurveType(CURVE_TYPE_CONVERTER.fromProtoEnum(eciesAeadHkdfParams.getKemParams().getCurveType())).setHashType(HASH_TYPE_CONVERTER.fromProtoEnum(eciesAeadHkdfParams.getKemParams().getHkdfHashType())).setDemParameters(com.google.crypto.tink.TinkProtoParametersFormat.parse(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(eciesAeadHkdfParams.getDemParams().getAeadDem().getTypeUrl()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).setValue(eciesAeadHkdfParams.getDemParams().getAeadDem().getValue()).build().toByteArray())).setSalt(com.google.crypto.tink.util.Bytes.copyFrom(eciesAeadHkdfParams.getKemParams().getHkdfSalt().toByteArray()));
        if (!eciesAeadHkdfParams.getKemParams().getCurveType().equals(com.google.crypto.tink.proto.EllipticCurveType.CURVE25519)) {
            salt.setNistCurvePointFormat(POINT_FORMAT_CONVERTER.fromProtoEnum(eciesAeadHkdfParams.getEcPointFormat()));
        } else if (!eciesAeadHkdfParams.getEcPointFormat().equals(com.google.crypto.tink.proto.EcPointFormat.COMPRESSED)) {
            throw new java.security.GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return salt.build();
    }

    private static int getEncodingLength(com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256.equals(curveType)) {
            return 33;
        }
        if (com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P384.equals(curveType)) {
            return 49;
        }
        if (com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P521.equals(curveType)) {
            return 67;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize CurveType ".concat(java.lang.String.valueOf(curveType)));
    }

    private static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey toProtoPublicKey(com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey) throws java.security.GeneralSecurityException {
        if (eciesPublicKey.getParameters().getCurveType().equals(com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519)) {
            return com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.newBuilder().setVersion(0).setParams(toProtoParameters(eciesPublicKey.getParameters())).setX(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(eciesPublicKey.getX25519CurvePointBytes().toByteArray())).setY(com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY).build();
        }
        int encodingLength = getEncodingLength(eciesPublicKey.getParameters().getCurveType());
        java.security.spec.ECPoint nistCurvePoint = eciesPublicKey.getNistCurvePoint();
        if (nistCurvePoint == null) {
            throw new java.security.GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        return com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.newBuilder().setVersion(0).setParams(toProtoParameters(eciesPublicKey.getParameters())).setX(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(nistCurvePoint.getAffineX(), encodingLength))).setY(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(nistCurvePoint.getAffineY(), encodingLength))).build();
    }

    private static com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey toProtoPrivateKey(com.google.crypto.tink.hybrid.EciesPrivateKey eciesPrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey.Builder publicKey = com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey.newBuilder().setVersion(0).setPublicKey(toProtoPublicKey(eciesPrivateKey.getPublicKey()));
        if (eciesPrivateKey.getParameters().getCurveType().equals(com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519)) {
            publicKey.setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(eciesPrivateKey.getX25519PrivateKeyBytes().toByteArray(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))));
        } else {
            publicKey.setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(eciesPrivateKey.getNistPrivateKeyValue().getBigInteger(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)), getEncodingLength(eciesPrivateKey.getParameters().getCurveType()))));
        }
        return publicKey.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.hybrid.EciesParameters eciesParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.newBuilder().setParams(toProtoParameters(eciesParameters)).build().toByteString()).setOutputPrefixType(VARIANT_CONVERTER.toProtoEnum(eciesParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, toProtoPublicKey(eciesPublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, VARIANT_CONVERTER.toProtoEnum(eciesPublicKey.getParameters().getVariant()), eciesPublicKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.hybrid.EciesPrivateKey eciesPrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, toProtoPrivateKey(eciesPrivateKey, secretKeyAccess).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, VARIANT_CONVERTER.toProtoEnum(eciesPrivateKey.getParameters().getVariant()), eciesPrivateKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.EciesParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EciesProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return fromProtoParameters(protoParametersSerialization.getKeyTemplate().getOutputPrefixType(), com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()).getParams());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.EciesPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.hybrid.EciesParameters fromProtoParameters = fromProtoParameters(protoKeySerialization.getOutputPrefixType(), parseFrom.getParams());
            if (fromProtoParameters.getCurveType().equals(com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519)) {
                if (!parseFrom.getY().isEmpty()) {
                    throw new java.security.GeneralSecurityException("Y must be empty for X25519 points");
                }
                return com.google.crypto.tink.hybrid.EciesPublicKey.createForCurveX25519(fromProtoParameters, com.google.crypto.tink.util.Bytes.copyFrom(parseFrom.getX().toByteArray()), protoKeySerialization.getIdRequirementOrNull());
            }
            return com.google.crypto.tink.hybrid.EciesPublicKey.createForNistCurve(fromProtoParameters, new java.security.spec.ECPoint(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getX().toByteArray()), com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getY().toByteArray())), protoKeySerialization.getIdRequirementOrNull());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.EciesPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey parseFrom = com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey publicKey = parseFrom.getPublicKey();
            if (publicKey.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.hybrid.EciesParameters fromProtoParameters = fromProtoParameters(protoKeySerialization.getOutputPrefixType(), publicKey.getParams());
            if (fromProtoParameters.getCurveType().equals(com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519)) {
                return com.google.crypto.tink.hybrid.EciesPrivateKey.createForCurveX25519(com.google.crypto.tink.hybrid.EciesPublicKey.createForCurveX25519(fromProtoParameters, com.google.crypto.tink.util.Bytes.copyFrom(publicKey.getX().toByteArray()), protoKeySerialization.getIdRequirementOrNull()), com.google.crypto.tink.util.SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)));
            }
            return com.google.crypto.tink.hybrid.EciesPrivateKey.createForNistCurve(com.google.crypto.tink.hybrid.EciesPublicKey.createForNistCurve(fromProtoParameters, new java.security.spec.ECPoint(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(publicKey.getX().toByteArray()), com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(publicKey.getY().toByteArray())), protoKeySerialization.getIdRequirementOrNull()), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getKeyValue().toByteArray()), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)));
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private EciesProtoSerialization() {
    }
}
