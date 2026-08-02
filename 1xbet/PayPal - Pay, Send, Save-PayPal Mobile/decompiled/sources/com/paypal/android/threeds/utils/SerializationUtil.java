package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R,\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020\f0\f0\u00168\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/android/threeds/utils/SerializationUtil;", "", "<init>", "()V", "", "", "p0", "Camera2StreamConfigurationMap", "(Ljava/util/Map;)Ljava/lang/String;", "", "p1", "getHighSpeedVideoSizes", "Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "response", "validateOobChallengeParameters", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;)Ljava/lang/String;", "validateTextChallengeParameters", "validateSelectionChallengeParameters", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/google/gson/JsonDeserializer;", "deserializer", "Lcom/google/gson/JsonDeserializer;", "getDeserializer", "()Lcom/google/gson/JsonDeserializer;", "setDeserializer", "(Lcom/google/gson/JsonDeserializer;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SerializationUtil {
    public static final com.paypal.android.threeds.utils.SerializationUtil INSTANCE = new com.paypal.android.threeds.utils.SerializationUtil();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.emptyList();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE.getValue(), com.paypal.android.threeds.utils.Indicator.No.INSTANCE.getValue()});
    private static com.google.gson.JsonDeserializer<com.paypal.android.threeds.data.model.ChallengeResponse> deserializer = new com.google.gson.JsonDeserializer() { // from class: com.paypal.android.threeds.utils.SerializationUtil$$ExternalSyntheticLambda0
        @Override // com.google.gson.JsonDeserializer
        public final java.lang.Object deserialize(com.google.gson.JsonElement jsonElement, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext jsonDeserializationContext) {
            com.paypal.android.threeds.data.model.ChallengeResponse Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = com.paypal.android.threeds.utils.SerializationUtil.Camera2StreamConfigurationMap(jsonElement);
            return Camera2StreamConfigurationMap2;
        }
    };
    public static final int $stable = 8;

    private SerializationUtil() {
    }

    public final com.google.gson.JsonDeserializer<com.paypal.android.threeds.data.model.ChallengeResponse> getDeserializer() {
        return deserializer;
    }

    public final void setDeserializer(com.google.gson.JsonDeserializer<com.paypal.android.threeds.data.model.ChallengeResponse> jsonDeserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonDeserializer, "");
        deserializer = jsonDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        r12 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        r4 = r10.getName();
        r5 = new java.lang.StringBuilder("Required field validation failed: ");
        r5.append(r4);
        r5.append(" is null or empty");
        com.paypal.android.logger.Logger.e$default(r12, r5.toString(), null, null, null, 14, null);
        r4 = r10.getName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.android.threeds.data.model.ChallengeResponse Camera2StreamConfigurationMap(com.google.gson.JsonElement jsonElement) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String transStatus;
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting challenge response deserialization", null, null, 6, null);
        com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures validationFailures = com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures.INSTANCE;
        try {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Parsing JSON to ChallengeResponse object", null, null, 6, null);
            com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse = (com.paypal.android.threeds.data.model.ChallengeResponse) new com.google.gson.Gson().fromJson(jsonElement, com.paypal.android.threeds.data.model.ChallengeResponse.class);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JSON parsing completed successfully", null, null, 6, null);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting validation process for challenge response", null, null, 6, null);
            com.paypal.android.threeds.utils.SerializationUtil serializationUtil = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(challengeResponse);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating required parameters using reflection", null, null, 6, null);
            java.lang.reflect.Field[] declaredFields = challengeResponse.getClass().getDeclaredFields();
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredFields);
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                str = null;
                if (i < length) {
                    java.lang.reflect.Field field = declaredFields[i];
                    if (((com.paypal.android.threeds.interfaces.Required) field.getAnnotation(com.paypal.android.threeds.interfaces.Required.class)) != null) {
                        field.setAccessible(true);
                        if (field.get(challengeResponse) == null || field.get(challengeResponse).toString().length() == 0) {
                            break;
                        }
                    }
                    i++;
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "All required parameter validations passed", null, null, 6, null);
                    str2 = null;
                    break;
                }
            }
            if (str2 != null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Required parameter validation failed for field: ".concat(java.lang.String.valueOf(str2)), null, null, null, 14, null);
                com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementMissing dataElementMissing = com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementMissing.INSTANCE;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{str2, "Required element not found"}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                dataElementMissing.setErrorDescription(format);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(dataElementMissing.getErrorDescription(), null, dataElementMissing, 2, null);
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Required parameter validation passed", null, null, 6, null);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating conditional parameters based on challengeCompletionInd: ".concat(java.lang.String.valueOf(challengeResponse.getChallengeCompletionInd())), null, null, 6, null);
            java.lang.String challengeCompletionInd = challengeResponse.getChallengeCompletionInd();
            if (kotlin.jvm.internal.Intrinsics.areEqual(challengeCompletionInd, com.paypal.android.threeds.utils.Indicator.No.INSTANCE.getValue())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge not completed, validating ACS UI type parameters", null, null, 6, null);
                java.lang.String acsUiType = challengeResponse.getAcsUiType();
                java.lang.String str3 = acsUiType;
                if (str3 == null || str3.length() == 0) {
                    str = "acsUIType";
                } else {
                    if (com.paypal.android.threeds.utils.ChallengeUiType.INSTANCE.getUiType(acsUiType) == null) {
                        com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures validationFailures2 = com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures.INSTANCE;
                        validationFailures2.setErrorDescription("Validation failed at acsUIType. Reason: Invalid acsUIType");
                        throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures2.getErrorDescription(), null, validationFailures2, 2, null);
                    }
                    com.paypal.android.threeds.utils.ChallengeUiType uiType = com.paypal.android.threeds.utils.ChallengeUiType.INSTANCE.getUiType(challengeResponse.getAcsUiType());
                    if (kotlin.jvm.internal.Intrinsics.areEqual(uiType, com.paypal.android.threeds.utils.ChallengeUiType.OOB.INSTANCE)) {
                        str = serializationUtil.validateOobChallengeParameters(challengeResponse);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(uiType, com.paypal.android.threeds.utils.ChallengeUiType.Text.INSTANCE)) {
                        str = serializationUtil.validateTextChallengeParameters(challengeResponse);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(uiType, com.paypal.android.threeds.utils.ChallengeUiType.SingleSelect.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(uiType, com.paypal.android.threeds.utils.ChallengeUiType.MultiSelect.INSTANCE)) {
                        str = serializationUtil.validateSelectionChallengeParameters(challengeResponse);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(uiType, com.paypal.android.threeds.utils.ChallengeUiType.HTML.INSTANCE)) {
                        java.lang.String acsHtml = challengeResponse.getAcsHtml();
                        if (acsHtml == null || acsHtml.length() == 0) {
                            str = "acsHTML";
                        }
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(uiType, com.paypal.android.threeds.utils.ChallengeUiType.OnBoardingProgress.INSTANCE) && uiType != null) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(challengeCompletionInd, com.paypal.android.threeds.utils.Indicator.Yes.INSTANCE.getValue()) && ((transStatus = challengeResponse.getTransStatus()) == null || transStatus.length() == 0)) {
                str = "transStatus";
            }
            if (str != null) {
                com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementMissing dataElementMissing2 = com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementMissing.INSTANCE;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format2 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{str, "Required element not found or empty"}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
                dataElementMissing2.setErrorDescription(format2);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(dataElementMissing2.getErrorDescription(), null, dataElementMissing2, 2, null);
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Conditional parameter validation passed", null, null, 6, null);
            java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((java.util.Map<java.lang.String, java.lang.String>) kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("acsTransID", challengeResponse.getAcsTransId()), kotlin.TuplesKt.to("sdkTransID", challengeResponse.getSdkTransId()), kotlin.TuplesKt.to("threeDsServerTransID", challengeResponse.getThreeDsServerTransId())));
            if (Camera2StreamConfigurationMap2 != null) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format3 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{Camera2StreamConfigurationMap2, "Expected a valid UUID"}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
                validationFailures.setErrorDetail(format3);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "UUID validation passed for transaction IDs", null, null, 6, null);
            java.lang.String whitelistingInfoText = challengeResponse.getWhitelistingInfoText();
            if (whitelistingInfoText != null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating whitelistingInfoText length: ".concat(java.lang.String.valueOf(whitelistingInfoText.length())), null, null, 6, null);
                java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("whitelistingInfoText", whitelistingInfoText)));
                if (highSpeedVideoSizes != null) {
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format4 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{highSpeedVideoSizes, "Expected max string length: 64"}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "");
                    validationFailures.setErrorDetail(format4);
                    throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
                }
            }
            java.lang.String challengeInfoTextIndicator = challengeResponse.getChallengeInfoTextIndicator();
            if (challengeInfoTextIndicator != null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating challengeInfoTextIndicator: ".concat(java.lang.String.valueOf(challengeInfoTextIndicator)), null, null, 6, null);
                if (challengeInfoTextIndicator.length() == 0 || !getHighResolutionOutputSizeshNQ4ISI.contains(challengeInfoTextIndicator)) {
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format5 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{"challengeInfoTextIndicator", "Expected `Y`, `N` or `null` but received ``"}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "");
                    validationFailures.setErrorDetail(format5);
                    throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
                }
            }
            java.lang.String challengeCompletionInd2 = challengeResponse.getChallengeCompletionInd();
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating challengeCompletionInd: ".concat(java.lang.String.valueOf(challengeCompletionInd2)), null, null, 6, null);
            if (challengeCompletionInd2.length() == 0 || !getHighResolutionOutputSizeshNQ4ISI.contains(challengeCompletionInd2)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format6 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{"challengeCompletionIndicator", "Expected `Y`, `N` or `null` but received ``"}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format6, "");
                validationFailures.setErrorDetail(format6);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
            }
            java.lang.String resendInformationLabel = challengeResponse.getResendInformationLabel();
            if (resendInformationLabel != null && resendInformationLabel.length() == 0) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format7 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{"resendInformationLabel", "Unexpected empty string"}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format7, "");
                validationFailures.setErrorDetail(format7);
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<com.paypal.android.threeds.data.model.MessageExtension> messageExtension = challengeResponse.getMessageExtension();
            if (messageExtension != null) {
                if (messageExtension.size() > 10) {
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format8 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{"messageExtension", "Message extension cannot be more than 10"}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format8, "");
                    validationFailures.setErrorDetail(format8);
                    throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
                }
                java.util.ListIterator<com.paypal.android.threeds.data.model.MessageExtension> listIterator = messageExtension.listIterator();
                while (listIterator.hasNext()) {
                    com.paypal.android.threeds.data.model.MessageExtension next = listIterator.next();
                    java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("messageExtension.id", next.getId()), kotlin.TuplesKt.to("messageExtension.name", next.getName())));
                    if (highSpeedVideoSizes2 != null) {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String format9 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{highSpeedVideoSizes2, "Expected max string length: 64."}, 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format9, "");
                        validationFailures.setErrorDetail(format9);
                        throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
                    }
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = next.getData().entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().length() > 8059) {
                            kotlin.jvm.internal.StringCompanionObject stringCompanionObject10 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                            java.lang.String format10 = java.lang.String.format("Validation failed at %s. Reason: %s", java.util.Arrays.copyOf(new java.lang.Object[]{"messageExtension.data", "Arbitrary json object exceeds maximum length or is not valid json"}, 2));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format10, "");
                            validationFailures.setErrorDetail(format10);
                            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures, 2, null);
                        }
                    }
                    if (next.getCriticalityIndicator() && !Camera2StreamConfigurationMap.contains(next.getId())) {
                        arrayList.add(next.getId());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                com.paypal.android.threeds.data.model.ProtocolErrorType.UnrecognizedMessageExtension unrecognizedMessageExtension = com.paypal.android.threeds.data.model.ProtocolErrorType.UnrecognizedMessageExtension.INSTANCE;
                unrecognizedMessageExtension.setErrorDetail(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(unrecognizedMessageExtension.getErrorDescription(), null, unrecognizedMessageExtension, 2, null);
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge response deserialization and validation completed successfully", null, null, 6, null);
            return challengeResponse;
        } catch (com.google.gson.JsonSyntaxException e) {
            java.lang.String localizedMessage = e.getLocalizedMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localizedMessage, "");
            validationFailures.setErrorDetail(localizedMessage);
            com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures validationFailures3 = validationFailures;
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "JSON syntax error during deserialization}", null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures3, 2, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(validationFailures.getErrorDescription(), null, validationFailures3, 2, null);
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.String> p0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating UUIDs", null, null, 6, null);
        java.lang.String str = null;
        try {
            java.lang.String str2 = null;
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : p0.entrySet()) {
                try {
                    str2 = entry.getKey();
                    java.util.UUID.fromString(entry.getValue());
                } catch (java.lang.IllegalArgumentException unused) {
                    str = str2;
                    return str;
                }
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "All UUID validations passed", null, null, 6, null);
            return null;
        } catch (java.lang.IllegalArgumentException unused2) {
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.String> map) {
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Validating field lengths with max length: 64", null, null, 6, null);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String value = entry.getValue();
            if (value != null && value.length() > 64) {
                return entry.getKey();
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "All length validations passed", null, null, 6, null);
        return null;
    }

    public final java.lang.String validateOobChallengeParameters(com.paypal.android.threeds.data.model.ChallengeResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String oobContinueLabel = response.getOobContinueLabel();
        if (oobContinueLabel == null || oobContinueLabel.length() == 0) {
            return "oobContinueLabel";
        }
        java.lang.String challengeInfoHeader = response.getChallengeInfoHeader();
        if (challengeInfoHeader == null || challengeInfoHeader.length() == 0) {
            return "challengeInfoHeader";
        }
        java.lang.String challengeInfoText = response.getChallengeInfoText();
        if (challengeInfoText == null || challengeInfoText.length() == 0) {
            return "challengeInfoText";
        }
        return null;
    }

    public final java.lang.String validateTextChallengeParameters(com.paypal.android.threeds.data.model.ChallengeResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String submitAuthenticationLabel = response.getSubmitAuthenticationLabel();
        if (submitAuthenticationLabel == null || submitAuthenticationLabel.length() == 0) {
            return "submitAuthenticationLabel";
        }
        java.lang.String challengeInfoHeader = response.getChallengeInfoHeader();
        if (challengeInfoHeader == null || challengeInfoHeader.length() == 0) {
            return "challengeInfoHeader";
        }
        java.lang.String challengeInfoText = response.getChallengeInfoText();
        if (challengeInfoText == null || challengeInfoText.length() == 0) {
            return "challengeInfoText";
        }
        java.lang.String challengeInfoLabel = response.getChallengeInfoLabel();
        if (challengeInfoLabel == null || challengeInfoLabel.length() == 0) {
            return "challengeInfoLabel";
        }
        return null;
    }

    public final java.lang.String validateSelectionChallengeParameters(com.paypal.android.threeds.data.model.ChallengeResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String submitAuthenticationLabel = response.getSubmitAuthenticationLabel();
        if (submitAuthenticationLabel == null || submitAuthenticationLabel.length() == 0) {
            return "submitAuthenticationLabel";
        }
        java.lang.String challengeInfoHeader = response.getChallengeInfoHeader();
        if (challengeInfoHeader == null || challengeInfoHeader.length() == 0) {
            return "challengeInfoHeader";
        }
        java.lang.String challengeInfoText = response.getChallengeInfoText();
        if (challengeInfoText == null || challengeInfoText.length() == 0) {
            return "challengeInfoText";
        }
        java.lang.String challengeInfoLabel = response.getChallengeInfoLabel();
        if (challengeInfoLabel == null || challengeInfoLabel.length() == 0) {
            return "challengeInfoLabel";
        }
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> challengeSelectInfo = response.getChallengeSelectInfo();
        if (challengeSelectInfo == null || challengeSelectInfo.isEmpty()) {
            return "challengeSelectInfo";
        }
        return null;
    }
}
