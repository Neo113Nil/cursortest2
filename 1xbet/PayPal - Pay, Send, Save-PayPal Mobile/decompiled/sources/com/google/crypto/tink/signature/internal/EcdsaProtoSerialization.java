package com.google.crypto.tink.signature.internal;

/* loaded from: classes9.dex */
public final class EcdsaProtoSerialization {
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.EcdsaParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES;

    static {
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        com.google.crypto.tink.util.Bytes bytesFromPrintableAscii2 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = com.google.crypto.tink.internal.ParametersSerializer.create(new com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeParameters(com.google.crypto.tink.Parameters parameters) {
                com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters;
                serializeParameters = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.serializeParameters((com.google.crypto.tink.signature.EcdsaParameters) parameters);
                return serializeParameters;
            }
        }, com.google.crypto.tink.signature.EcdsaParameters.class, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PARAMETERS_PARSER = com.google.crypto.tink.internal.ParametersParser.create(new com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final com.google.crypto.tink.Parameters parseParameters(com.google.crypto.tink.internal.Serialization serialization) {
                com.google.crypto.tink.signature.EcdsaParameters parseParameters;
                parseParameters = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.parseParameters((com.google.crypto.tink.internal.ProtoParametersSerialization) serialization);
                return parseParameters;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey;
                serializePublicKey = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.serializePublicKey((com.google.crypto.tink.signature.EcdsaPublicKey) key, secretKeyAccess);
                return serializePublicKey;
            }
        }, com.google.crypto.tink.signature.EcdsaPublicKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.signature.EcdsaPublicKey parsePublicKey;
                parsePublicKey = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.parsePublicKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePublicKey;
            }
        }, bytesFromPrintableAscii2, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey;
                serializePrivateKey = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.serializePrivateKey((com.google.crypto.tink.signature.EcdsaPrivateKey) key, secretKeyAccess);
                return serializePrivateKey;
            }
        }, com.google.crypto.tink.signature.EcdsaPrivateKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = com.google.crypto.tink.internal.KeyParser.create(new com.google.crypto.tink.internal.KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final com.google.crypto.tink.Key parseKey(com.google.crypto.tink.internal.Serialization serialization, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                com.google.crypto.tink.signature.EcdsaPrivateKey parsePrivateKey;
                parsePrivateKey = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.parsePrivateKey((com.google.crypto.tink.internal.ProtoKeySerialization) serialization, secretKeyAccess);
                return parsePrivateKey;
            }
        }, bytesFromPrintableAscii, com.google.crypto.tink.internal.ProtoKeySerialization.class);
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.signature.EcdsaParameters.Variant variant) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY.equals(variant)) {
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(variant)));
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA256;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA384;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512.equals(hashType)) {
            return com.google.crypto.tink.proto.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(hashType)));
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.HashType toHashType(com.google.crypto.tink.proto.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse HashType: ");
        sb.append(hashType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY;
        }
        if (i == 3) {
            return com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY;
        }
        if (i == 4) {
            return com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse OutputPrefixType: ");
        sb.append(outputPrefixType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.EllipticCurveType toProtoCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256.equals(curveType)) {
            return com.google.crypto.tink.proto.EllipticCurveType.NIST_P256;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384.equals(curveType)) {
            return com.google.crypto.tink.proto.EllipticCurveType.NIST_P384;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521.equals(curveType)) {
            return com.google.crypto.tink.proto.EllipticCurveType.NIST_P521;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize CurveType ".concat(java.lang.String.valueOf(curveType)));
    }

    private static int getEncodingLength(com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256.equals(curveType)) {
            return 33;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384.equals(curveType)) {
            return 49;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521.equals(curveType)) {
            return 67;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize CurveType ".concat(java.lang.String.valueOf(curveType)));
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType ellipticCurveType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[ellipticCurveType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384;
        }
        if (i == 3) {
            return com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse EllipticCurveType: ");
        sb.append(ellipticCurveType.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.EcdsaSignatureEncoding toProtoSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding signatureEncoding) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363.equals(signatureEncoding)) {
            return com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363;
        }
        if (com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER.equals(signatureEncoding)) {
            return com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(java.lang.String.valueOf(signatureEncoding)));
    }

    /* renamed from: com.google.crypto.tink.signature.internal.EcdsaProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.EcdsaSignatureEncoding.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = iArr;
            try {
                iArr[com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.EllipticCurveType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[com.google.crypto.tink.proto.EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[com.google.crypto.tink.proto.EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr3;
            try {
                iArr3[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
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
            int[] iArr4 = new int[com.google.crypto.tink.proto.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr4;
            try {
                iArr4[com.google.crypto.tink.proto.HashType.SHA256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding toSignatureEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding ecdsaSignatureEncoding) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[ecdsaSignatureEncoding.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363;
        }
        if (i == 2) {
            return com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(ecdsaSignatureEncoding.getNumber());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static com.google.crypto.tink.proto.EcdsaParams getProtoParams(com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.EcdsaParams.newBuilder().setHashType(toProtoHashType(ecdsaParameters.getHashType())).setCurve(toProtoCurveType(ecdsaParameters.getCurveType())).setEncoding(toProtoSignatureEncoding(ecdsaParameters.getSignatureEncoding())).build();
    }

    private static com.google.crypto.tink.proto.EcdsaPublicKey getProtoPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey) throws java.security.GeneralSecurityException {
        int encodingLength = getEncodingLength(ecdsaPublicKey.getParameters().getCurveType());
        java.security.spec.ECPoint publicPoint = ecdsaPublicKey.getPublicPoint();
        return com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder().setParams(getProtoParams(ecdsaPublicKey.getParameters())).setX(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(publicPoint.getAffineX(), encodingLength))).setY(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(publicPoint.getAffineY(), encodingLength))).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.signature.EcdsaParameters ecdsaParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoParametersSerialization.create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder().setParams(getProtoParams(ecdsaParameters)).build().toByteString()).setOutputPrefixType(toProtoOutputPrefixType(ecdsaParameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(ecdsaPublicKey).toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, toProtoOutputPrefixType(ecdsaPublicKey.getParameters().getVariant()), ecdsaPublicKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.signature.EcdsaPrivateKey ecdsaPrivateKey, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(PRIVATE_TYPE_URL, com.google.crypto.tink.proto.EcdsaPrivateKey.newBuilder().setPublicKey(getProtoPublicKey(ecdsaPrivateKey.getPublicKey())).setKeyValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(ecdsaPrivateKey.getPrivateValue().getBigInteger(com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess)), getEncodingLength(ecdsaPrivateKey.getParameters().getCurveType())))).build().toByteString(), com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, toProtoOutputPrefixType(ecdsaPrivateKey.getParameters().getVariant()), ecdsaPrivateKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.EcdsaParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ");
            sb.append(protoParametersSerialization.getKeyTemplate().getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.EcdsaKeyFormat parseFrom = com.google.crypto.tink.proto.EcdsaKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            return com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(toHashType(parseFrom.getParams().getHashType())).setSignatureEncoding(toSignatureEncoding(parseFrom.getParams().getEncoding())).setCurveType(toCurveType(parseFrom.getParams().getCurve())).setVariant(toVariant(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.EcdsaPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.EcdsaPublicKey parseFrom = com.google.crypto.tink.proto.EcdsaPublicKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.signature.EcdsaPublicKey.builder().setParameters(com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(toHashType(parseFrom.getParams().getHashType())).setSignatureEncoding(toSignatureEncoding(parseFrom.getParams().getEncoding())).setCurveType(toCurveType(parseFrom.getParams().getCurve())).setVariant(toVariant(protoKeySerialization.getOutputPrefixType())).build()).setPublicPoint(new java.security.spec.ECPoint(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getX().toByteArray()), com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getY().toByteArray()))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.signature.EcdsaPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!protoKeySerialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ");
            sb.append(protoKeySerialization.getTypeUrl());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            com.google.crypto.tink.proto.EcdsaPrivateKey parseFrom = com.google.crypto.tink.proto.EcdsaPrivateKey.parseFrom(protoKeySerialization.getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            if (parseFrom.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.proto.EcdsaPublicKey publicKey = parseFrom.getPublicKey();
            if (publicKey.getVersion() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.signature.EcdsaPrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey.builder().setParameters(com.google.crypto.tink.signature.EcdsaParameters.builder().setHashType(toHashType(publicKey.getParams().getHashType())).setSignatureEncoding(toSignatureEncoding(publicKey.getParams().getEncoding())).setCurveType(toCurveType(publicKey.getParams().getCurve())).setVariant(toVariant(protoKeySerialization.getOutputPrefixType())).build()).setPublicPoint(new java.security.spec.ECPoint(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(publicKey.getX().toByteArray()), com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(publicKey.getY().toByteArray()))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build()).setPrivateValue(com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(parseFrom.getKeyValue().toByteArray()), com.google.crypto.tink.SecretKeyAccess.requireAccess(secretKeyAccess))).build();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
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

    private EcdsaProtoSerialization() {
    }
}
