package com.paypal.android.threeds.security;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0006*\u00020\u000f0\u000f2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&R(\u0010(\u001a\u00020'8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010\u0003\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010/\u001a\u00020'8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b/\u0010)\u0012\u0004\b2\u0010\u0003\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u0014\u00106\u001a\u0002038\u0002X\u0083D¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Lcom/paypal/android/threeds/security/AcsCryptographer;", "", "<init>", "()V", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "challengeRequest", "Ljavax/crypto/SecretKey;", "secretKey", "", "encrypt$three_ds_release", "(Lcom/paypal/android/threeds/data/model/ChallengeRequest;Ljavax/crypto/SecretKey;)Ljava/lang/String;", "message", "Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "decrypt$three_ds_release", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "errorMessage", "getErrorDetails", "(Lcom/paypal/android/threeds/data/model/ErrorMessage;)Ljava/lang/String;", "decryptMessage", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Ljava/lang/String;", "", "Lcom/nimbusds/jose/util/Base64URL;", "parsedParts", "", "validateBase64Url", "([Lcom/nimbusds/jose/util/Base64URL;)V", "keyId", "Lcom/nimbusds/jose/JWEHeader;", "createEncryptionHeader", "(Ljava/lang/String;)Lcom/nimbusds/jose/JWEHeader;", "Lcom/nimbusds/jose/EncryptionMethod;", "encryptionMethod", "", "getEncryptionKey", "(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B", "jsonString", "convertJsonToErrorMessage", "(Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/ErrorMessage;", "", "counterSdkToAcs", "B", "getCounterSdkToAcs", "()B", "setCounterSdkToAcs", "(B)V", "getCounterSdkToAcs$annotations", "counterAcsToSdk", "getCounterAcsToSdk", "setCounterAcsToSdk", "getCounterAcsToSdk$annotations", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AcsCryptographer {
    public static final int $stable = 8;
    private byte counterAcsToSdk;
    private byte counterSdkToAcs;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor = 8;

    public static /* synthetic */ void getCounterAcsToSdk$annotations() {
    }

    public static /* synthetic */ void getCounterSdkToAcs$annotations() {
    }

    public final byte getCounterSdkToAcs() {
        return this.counterSdkToAcs;
    }

    public final void setCounterSdkToAcs(byte b) {
        this.counterSdkToAcs = b;
    }

    public final byte getCounterAcsToSdk() {
        return this.counterAcsToSdk;
    }

    public final void setCounterAcsToSdk(byte b) {
        this.counterAcsToSdk = b;
    }

    public final java.lang.String encrypt$three_ds_release(com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest, javax.crypto.SecretKey secretKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secretKey, "");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "%03d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(this.counterSdkToAcs)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        challengeRequest.setSdkCounterStoA(format);
        com.nimbusds.jose.JWEHeader createEncryptionHeader = createEncryptionHeader(challengeRequest.getAcsTransactionId());
        com.nimbusds.jose.JWEObject jWEObject = new com.nimbusds.jose.JWEObject(createEncryptionHeader, new com.nimbusds.jose.Payload(new com.google.gson.Gson().toJson(challengeRequest)));
        com.nimbusds.jose.EncryptionMethod encryptionMethod = createEncryptionHeader.getEncryptionMethod();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encryptionMethod, "");
        jWEObject.encrypt(new com.paypal.android.threeds.security.TransactionEncrypter(getEncryptionKey(secretKey, encryptionMethod), this.counterSdkToAcs));
        byte b = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b;
        if (b == 0) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "SDK to ACS Counter is ".concat(java.lang.String.valueOf((int) this.counterSdkToAcs)), null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException("SDK to ACS Counter 0", null, null, 6, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("SDK to ACS Counter 0", null, null, 6, null);
        }
        java.lang.String serialize = jWEObject.serialize();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialize, "");
        return serialize;
    }

    public final com.paypal.android.threeds.data.model.ChallengeResponse decrypt$three_ds_release(java.lang.String message, javax.crypto.SecretKey secretKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secretKey, "");
        java.lang.String decryptMessage = decryptMessage(message, secretKey);
        com.google.gson.Gson create = new com.google.gson.GsonBuilder().registerTypeAdapter(com.paypal.android.threeds.data.model.ChallengeResponse.class, com.paypal.android.threeds.utils.SerializationUtil.INSTANCE.getDeserializer()).create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        java.lang.Object fromJson = create.fromJson(decryptMessage, (java.lang.Class<java.lang.Object>) com.paypal.android.threeds.data.model.ChallengeResponse.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "");
        com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse = (com.paypal.android.threeds.data.model.ChallengeResponse) fromJson;
        if (kotlin.jvm.internal.Intrinsics.areEqual(challengeResponse.getMessageType(), "Erro")) {
            com.paypal.android.threeds.data.model.ErrorMessage convertJsonToErrorMessage = convertJsonToErrorMessage(decryptMessage);
            kotlin.jvm.internal.Intrinsics.checkNotNull(convertJsonToErrorMessage);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(getErrorDetails(convertJsonToErrorMessage), null, null, 6, null);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(challengeResponse.getMessageType(), "Erro") && !kotlin.jvm.internal.Intrinsics.areEqual(challengeResponse.getMessageType(), "CRes")) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol.INSTANCE.getErrorDescription(), null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol.INSTANCE.getErrorDescription(), null, com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol.INSTANCE, 2, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol.INSTANCE.getErrorDescription(), null, com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol.INSTANCE, 2, null);
        }
        if (this.counterAcsToSdk != java.lang.Byte.parseByte(challengeResponse.getAcsCounterAtoS())) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge Response ACS counter not equal to SDK Acs counter", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("counterAcsToSdk", java.lang.Byte.valueOf(this.counterAcsToSdk)), kotlin.TuplesKt.to("challengeResponse.acsCounterAtoS", java.lang.Byte.valueOf(java.lang.Byte.parseByte(challengeResponse.getAcsCounterAtoS())))), null, new com.paypal.android.threeds.exceptions.SDKRuntimeException("Challenge Response ACS counter not equal to SDK Acs counter", null, com.paypal.android.threeds.data.model.ProtocolErrorType.CounterMismatch.INSTANCE, 2, null), 4, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("Challenge Response ACS counter not equal to SDK Acs counter", null, com.paypal.android.threeds.data.model.ProtocolErrorType.CounterMismatch.INSTANCE, 2, null);
        }
        if (!com.paypal.android.threeds.transaction.MessageVersion.INSTANCE.isSupportedMessageVersion(challengeResponse.getMessageVersion())) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported.INSTANCE.getErrorDescription(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Message Version", challengeResponse.getMessageVersion())), null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported.INSTANCE.getErrorDescription(), null, com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported.INSTANCE, 2, null), 4, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported.INSTANCE.getErrorDescription(), null, com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported.INSTANCE, 2, null);
        }
        byte b = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b;
        if (b != 0) {
            return challengeResponse;
        }
        throw new com.paypal.android.threeds.exceptions.SDKRuntimeException("ACS to SDK counter is zero", null, com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementInvalid.INSTANCE, 2, null);
    }

    public final java.lang.String getErrorDetails(com.paypal.android.threeds.data.model.ErrorMessage errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        java.lang.String errorDescription = errorMessage.getErrorDescription();
        if (errorDescription != null && errorDescription.length() != 0) {
            return errorMessage.getErrorDescription();
        }
        java.lang.String errorDetail = errorMessage.getErrorDetail();
        if (errorDetail != null && errorDetail.length() != 0) {
            return errorMessage.getErrorDetail();
        }
        return com.paypal.android.threeds.utils.NetworkUtil.SOMETHING_WENT_WRONG;
    }

    public final java.lang.String decryptMessage(java.lang.String message, javax.crypto.SecretKey secretKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secretKey, "");
        try {
            com.nimbusds.jose.JWEObject parse = com.nimbusds.jose.JWEObject.parse(message);
            com.nimbusds.jose.util.Base64URL[] parsedParts = parse.getParsedParts();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parsedParts, "");
            validateBase64Url(parsedParts);
            com.nimbusds.jose.EncryptionMethod encryptionMethod = parse.getHeader().getEncryptionMethod();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encryptionMethod, "");
            byte[] encoded = secretKey.getEncoded();
            if (com.nimbusds.jose.EncryptionMethod.A128GCM == encryptionMethod) {
                encoded = java.util.Arrays.copyOfRange(encoded, encoded.length - (com.nimbusds.jose.EncryptionMethod.A128GCM.cekBitLength() / this.getHighSpeedVideoFpsRangesFor), encoded.length);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(encoded);
            parse.decrypt(new com.nimbusds.jose.crypto.DirectDecrypter(encoded));
            java.lang.String obj = parse.getPayload().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        } catch (com.paypal.android.threeds.exceptions.SDKRuntimeException e) {
            com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            java.lang.String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "SDKRuntimeException in decryptMessage";
            }
            com.paypal.android.logger.Logger.e$default(logger, message2, null, null, e, 6, null);
            throw e;
        } catch (java.lang.Exception e2) {
            if ((e2 instanceof java.text.ParseException) && !kotlin.text.StringsKt.contentEquals(e2.getMessage(), "Unexpected number of Base64URL parts, must be five", true)) {
                com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure decryptionFailure = com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure.INSTANCE;
                com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure decryptionFailure2 = decryptionFailure;
                com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, decryptionFailure.getErrorDescription(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", "Unexpected number of Base64URL parts, must be five")), null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(decryptionFailure.getErrorDescription(), null, decryptionFailure2, 2, null), 4, null);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(decryptionFailure.getErrorDescription(), null, decryptionFailure2, 2, null);
            }
            try {
                com.paypal.android.threeds.data.model.ErrorMessage errorMessage = (com.paypal.android.threeds.data.model.ErrorMessage) new com.google.gson.Gson().fromJson(message, com.paypal.android.threeds.data.model.ErrorMessage.class);
                com.paypal.android.threeds.data.model.ProtocolErrorType.ACSError aCSError = com.paypal.android.threeds.data.model.ProtocolErrorType.ACSError.INSTANCE;
                aCSError.setErrorMessage(errorMessage);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(aCSError.getErrorDescription(), null, aCSError, 2, null);
            } catch (com.google.gson.JsonSyntaxException e3) {
                com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure decryptionFailure3 = com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure.INSTANCE;
                com.paypal.android.logger.Logger logger2 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
                java.lang.String errorDescription = decryptionFailure3.getErrorDescription();
                java.lang.String message3 = e3.getMessage();
                if (message3 == null) {
                    message3 = "JsonSyntaxException in decryptMessage";
                }
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", message3));
                com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure decryptionFailure4 = decryptionFailure3;
                com.paypal.android.logger.Logger.e$default(logger2, errorDescription, mapOf, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(decryptionFailure3.getErrorDescription(), null, decryptionFailure4, 2, null), 4, null);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(decryptionFailure3.getErrorDescription(), null, decryptionFailure4, 2, null);
            }
        }
    }

    public final void validateBase64Url(com.nimbusds.jose.util.Base64URL[] parsedParts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parsedParts, "");
        for (com.nimbusds.jose.util.Base64URL base64URL : parsedParts) {
            com.paypal.android.threeds.utils.CryptoUtils cryptoUtils = com.paypal.android.threeds.utils.CryptoUtils.INSTANCE;
            java.lang.String obj = base64URL.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            if (!cryptoUtils.isValidBase64URLEncodedString(obj)) {
                com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure decryptionFailure = com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure.INSTANCE;
                com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure decryptionFailure2 = decryptionFailure;
                com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, decryptionFailure.getErrorDescription(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", "Invalid Base64URL encoded string")), null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(decryptionFailure.getErrorDescription(), null, decryptionFailure2, 2, null), 4, null);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(decryptionFailure.getErrorDescription(), null, decryptionFailure2, 2, null);
            }
        }
    }

    public final com.nimbusds.jose.JWEHeader createEncryptionHeader(java.lang.String keyId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyId, "");
        com.nimbusds.jose.JWEHeader build = new com.nimbusds.jose.JWEHeader.Builder(com.nimbusds.jose.JWEAlgorithm.DIR, com.nimbusds.jose.EncryptionMethod.A128CBC_HS256).keyID(keyId).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public final byte[] getEncryptionKey(javax.crypto.SecretKey secretKey, com.nimbusds.jose.EncryptionMethod encryptionMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secretKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptionMethod, "");
        byte[] encoded = secretKey.getEncoded();
        if (com.nimbusds.jose.EncryptionMethod.A128GCM == encryptionMethod) {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(encoded, 0, com.nimbusds.jose.EncryptionMethod.A128GCM.cekBitLength() / this.getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.internal.Intrinsics.checkNotNull(copyOfRange);
            return copyOfRange;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(encoded);
        return encoded;
    }

    public final com.paypal.android.threeds.data.model.ErrorMessage convertJsonToErrorMessage(java.lang.String jsonString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
        return (com.paypal.android.threeds.data.model.ErrorMessage) new com.google.gson.Gson().fromJson(jsonString, com.paypal.android.threeds.data.model.ErrorMessage.class);
    }
}
