package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/WebSdkPayloadParser;", "", "<init>", "()V", "", "flowConfig", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "parse", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "Lorg/json/JSONObject;", "p0", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;", "Camera2StreamConfigurationMap", "(Lorg/json/JSONObject;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "(Lorg/json/JSONObject;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "toCaptureConfig", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "options", "Lcom/paypal/oslo/feature/verificationcapture/webview/WebSdkPayloadParser$OptionsFields;", "parseOptionsFields$verification_capture_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/webview/WebSdkPayloadParser$OptionsFields;", "OptionsFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebSdkPayloadParser {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser INSTANCE = new com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser();

    private WebSdkPayloadParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext parse(java.lang.String flowConfig) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType;
        java.lang.String str8;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType2;
        int i;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType;
        java.lang.String optString;
        java.lang.String str12 = "docType";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowConfig, "");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(flowConfig);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("idCaptureConfigurations");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("vendor");
                if (optJSONObject != null && kotlin.jvm.internal.Intrinsics.areEqual(optJSONObject.optString("id"), "63296e67-fef3-4753-98ff-5de8974e1bf1")) {
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("session");
                    str3 = optJSONObject2 != null ? optJSONObject2.optString(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY) : null;
                    org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("config");
                    org.json.JSONObject optJSONObject4 = optJSONObject3 != null ? optJSONObject3.optJSONObject(com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE) : null;
                    if (optJSONObject4 == null || (str4 = optJSONObject4.optString("productionKey")) == null || str4.length() <= 0) {
                        str4 = null;
                    }
                    if (optJSONObject4 == null || (str5 = optJSONObject4.optString(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate)) == null || str5.length() <= 0) {
                        str5 = null;
                    }
                    if (optJSONObject4 == null || (str2 = optJSONObject4.optString("deviceKeyIdentifier")) == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    str = "FACETEC";
                } else {
                    str = "DAON";
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                }
                org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("context");
                if (optJSONObject5 == null || (str6 = optJSONObject5.optString(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "WEB")) == null) {
                    str6 = "WEB";
                }
                if (optJSONObject5 == null || (str7 = optJSONObject5.optString("partyId")) == null || str7.length() <= 0) {
                    str7 = null;
                }
                if (kotlin.text.StringsKt.equals(jSONObject.optString(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE), "VP_ID", true)) {
                    resultType = com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.VP_ID;
                } else {
                    resultType = com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.FILE;
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("idCaptureConfigurations");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (optJSONArray2 != null) {
                    int length = optJSONArray2.length();
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = length;
                        org.json.JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                        org.json.JSONArray jSONArray = optJSONArray2;
                        java.lang.String optString2 = jSONObject2.optString(str12);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "");
                        if (optString2.length() != 0) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(jSONObject2);
                            java.lang.String optString3 = jSONObject2.optString(str12, "DRIVING_LICENSE");
                            str8 = str12;
                            resultType2 = resultType;
                            if (kotlin.text.StringsKt.equals(optString3, "SELFIE", true) || kotlin.text.StringsKt.equals(optString3, "FACE", true)) {
                                str9 = "FACE";
                            } else {
                                str9 = "FACE";
                                if (!kotlin.text.StringsKt.equals(jSONObject2.optString("workflowType"), "SELFIE", true)) {
                                    workflowType = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(optString3);
                                    java.lang.String optString4 = jSONObject2.optString("docSide");
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(optString4);
                                    if (optString4.length() <= 0) {
                                        optString4 = null;
                                    }
                                    str11 = optString3;
                                    str10 = optString4;
                                    int optInt = jSONObject2.optInt("retryLimit", 0);
                                    boolean optBoolean = jSONObject2.optBoolean("isAllowManualCapture", false);
                                    boolean optBoolean2 = jSONObject2.optBoolean("handleTimeout", false);
                                    int optInt2 = jSONObject2.optInt(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 30);
                                    optString = jSONObject2.optString("captureMode", "AUTO");
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                                    if (optString.length() <= 0) {
                                        optString = null;
                                    }
                                    java.lang.String str13 = optString != null ? "AUTO" : optString;
                                    java.lang.String optString5 = jSONObject2.optString("options", "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(optString5);
                                    i = i3;
                                    arrayList.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType, optInt, optBoolean, optBoolean2, optInt2, str11, str10, str13, optString5.length() > 0 ? null : optString5, 0, str, str3, str4, str2, str5, 512, null));
                                }
                            }
                            workflowType = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE;
                            str10 = com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT;
                            str11 = str9;
                            int optInt3 = jSONObject2.optInt("retryLimit", 0);
                            boolean optBoolean3 = jSONObject2.optBoolean("isAllowManualCapture", false);
                            boolean optBoolean22 = jSONObject2.optBoolean("handleTimeout", false);
                            int optInt22 = jSONObject2.optInt(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 30);
                            optString = jSONObject2.optString("captureMode", "AUTO");
                            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                            if (optString.length() <= 0) {
                            }
                            if (optString != null) {
                            }
                            java.lang.String optString52 = jSONObject2.optString("options", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNull(optString52);
                            i = i3;
                            arrayList.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType, optInt3, optBoolean3, optBoolean22, optInt22, str11, str10, str13, optString52.length() > 0 ? null : optString52, 0, str, str3, str4, str2, str5, 512, null));
                        } else {
                            str8 = str12;
                            resultType2 = resultType;
                            i = i3;
                        }
                        i2++;
                        length = i;
                        optJSONArray2 = jSONArray;
                        str12 = str8;
                        resultType = resultType2;
                    }
                }
                return new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext(arrayList, 0, str6, null, null, null, str7, resultType, null, true, false, null, null, null, true, null, 0, null, 245050, null);
            }
            java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(jSONObject);
            java.lang.String optString6 = jSONObject.optString(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "WEB");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString6, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext(Camera2StreamConfigurationMap, 0, optString6, null, null, null, null, com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.WEB, null, jSONObject.optBoolean("canGoBack", true), false, null, null, null, true, null, 0, null, 245114, null);
        } catch (org.json.JSONException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to parse flowConfig", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return null;
        }
    }

    private static java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> Camera2StreamConfigurationMap(org.json.JSONObject p0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray optJSONArray = p0.optJSONArray("workflows");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    arrayList.add(getHighResolutionOutputSizeshNQ4ISI(jSONObject));
                }
                return arrayList;
            }
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(p0));
            return arrayList;
        } catch (org.json.JSONException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "Failed to parse legacy workflow configs", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD, 0, false, false, 0, "DRIVERS_LICENSE", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, null, null, 0, null, null, null, null, null, 32670, null));
        }
    }

    private static com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig getHighResolutionOutputSizeshNQ4ISI(org.json.JSONObject p0) {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType;
        java.lang.String optString = p0.optString("workflowType", "DOCUMENT_UPLOAD");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "");
        java.lang.String upperCase = optString.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "SELFIE")) {
            workflowType = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE;
        } else {
            workflowType = kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "POA") ? com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.POA : com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType2 = workflowType;
        int optInt = p0.optInt("retryLimits", 0);
        boolean optBoolean = p0.optBoolean("isAllowManualCapture", false);
        boolean optBoolean2 = p0.optBoolean("isHandleManualCapture", false);
        int optInt2 = p0.optInt(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 30);
        java.lang.String optString2 = p0.optString("documentType", "DRIVERS_LICENSE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "");
        java.lang.String optString3 = p0.optString("documentSide", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT);
        kotlin.jvm.internal.Intrinsics.checkNotNull(optString3);
        if (optString3.length() <= 0) {
            optString3 = null;
        }
        java.lang.String optString4 = p0.optString("captureMode", "AUTO");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString4, "");
        java.lang.String optString5 = p0.optString("options", "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(optString5);
        java.lang.String str = optString5.length() <= 0 ? null : optString5;
        java.lang.String optString6 = p0.optString("vendor", "DAON");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString6, "");
        java.lang.String optString7 = p0.optString("sessionToken", "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(optString7);
        return new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType2, optInt, optBoolean, optBoolean2, optInt2, optString2, optString3, optString4, str, 0, optString6, optString7.length() <= 0 ? null : optString7, null, null, null, 29184, null);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig toCaptureConfig(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowConfig, "");
        com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields parseOptionsFields$verification_capture_prodRelease = parseOptionsFields$verification_capture_prodRelease(workflowConfig.getOptions());
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig(workflowConfig.getTimeout(), parseOptionsFields$verification_capture_prodRelease.getBarcodeTimeoutSeconds(), parseOptionsFields$verification_capture_prodRelease.getEnableBarcode(), parseOptionsFields$verification_capture_prodRelease.getLightCheckTimeoutSeconds(), parseOptionsFields$verification_capture_prodRelease.getLightCheckThreshold(), parseOptionsFields$verification_capture_prodRelease.getFallbackEdgeDetectionDuration(), parseOptionsFields$verification_capture_prodRelease.getSwitchCaptureContent(), workflowConfig.getCaptureMode(), workflowConfig.getRetryLimits(), workflowConfig.isHandleManualCapture(), parseOptionsFields$verification_capture_prodRelease.getImmediateTimeout());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|(6:6|7|(5:9|(1:11)(1:71)|13|14|(1:16))(1:72)|17|(5:19|(1:21)(1:67)|22|(2:24|(1:27))|66)(1:68)|(2:28|29))|(2:33|(8:35|36|37|(1:60)(1:41)|42|43|(3:45|(1:47)(1:51)|(1:49))|52))|63|36|37|(1:39)|60|42|43|(0)|52) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:5|6|7|(5:9|(1:11)(1:71)|13|14|(1:16))(1:72)|17|(5:19|(1:21)(1:67)|22|(2:24|(1:27))|66)(1:68)|(2:28|29)|(2:33|(8:35|36|37|(1:60)(1:41)|42|43|(3:45|(1:47)(1:51)|(1:49))|52))|63|36|37|(1:39)|60|42|43|(0)|52) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[Catch: NumberFormatException -> 0x0134, TryCatch #0 {NumberFormatException -> 0x0134, blocks: (B:43:0x0103, B:45:0x010a, B:47:0x0120), top: B:42:0x0103 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields parseOptionsFields$verification_capture_prodRelease(java.lang.String options) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        float f;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        java.lang.Integer intOrNull;
        java.lang.Integer intOrNull2;
        int i8 = 0;
        float f2 = 0.0f;
        if (options != null) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) options, new java.lang.String[]{"#"}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() >= 2) {
                java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) split$default.get(1), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                try {
                    if (split$default2.size() >= 2) {
                        java.lang.Integer intOrNull3 = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(0)).toString());
                        i5 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                        try {
                            java.lang.Float floatOrNull = kotlin.text.StringsKt.toFloatOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(1)).toString());
                            if (floatOrNull != null) {
                                f2 = floatOrNull.floatValue();
                            }
                        } catch (java.lang.NumberFormatException unused) {
                            i7 = 0;
                            z4 = false;
                            i6 = 0;
                            z5 = false;
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[WebSdkPayloadParser] Failed to parse options fields", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("options", options)), null, 4, null);
                            i4 = i8;
                            i8 = i7;
                            z2 = i4;
                            i = i8;
                            f = f2;
                            i2 = i5;
                            z3 = z4;
                            i3 = i6;
                            z = z5;
                            return new com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields(z, i, i2, f, i3, z2, z3);
                        }
                    } else {
                        i5 = 0;
                    }
                    if (split$default2.size() >= 4) {
                        java.lang.Integer intOrNull4 = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(2)).toString());
                        i7 = intOrNull4 != null ? intOrNull4.intValue() : 0;
                        java.lang.Integer intOrNull5 = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(3)).toString());
                        if (intOrNull5 != null) {
                            if (intOrNull5.intValue() == 1 && i7 > 0) {
                                z5 = true;
                            }
                        }
                        z5 = false;
                    } else {
                        i7 = 0;
                        z5 = false;
                    }
                    try {
                    } catch (java.lang.NumberFormatException unused2) {
                        z4 = false;
                        i6 = 0;
                    }
                } catch (java.lang.NumberFormatException unused3) {
                    i5 = 0;
                }
                if (split$default2.size() >= 5 && (intOrNull2 = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(4)).toString())) != null) {
                    if (intOrNull2.intValue() == 3) {
                        z4 = true;
                        i6 = (split$default2.size() >= 6 || (intOrNull = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(5)).toString())) == null) ? 0 : intOrNull.intValue();
                        if (split$default2.size() >= 7) {
                            java.lang.Integer intOrNull6 = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(6)).toString());
                            if ((intOrNull6 != null ? intOrNull6.intValue() : 0) == 2) {
                                i8 = 1;
                            }
                        }
                        i4 = i8;
                        i8 = i7;
                    }
                }
                z4 = false;
                if (split$default2.size() >= 6) {
                }
                if (split$default2.size() >= 7) {
                }
                i4 = i8;
                i8 = i7;
            } else {
                i4 = 0;
                i5 = 0;
                z4 = false;
                i6 = 0;
                z5 = false;
            }
            z2 = i4;
            i = i8;
            f = f2;
            i2 = i5;
            z3 = z4;
            i3 = i6;
            z = z5;
        } else {
            z = false;
            i = 0;
            i2 = 0;
            i3 = 0;
            z2 = 0;
            z3 = false;
            f = 0.0f;
        }
        return new com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields(z, i, i2, f, i3, z2, z3);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b(\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b*\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/WebSdkPayloadParser$OptionsFields;", "", "", "enableBarcode", "", "barcodeTimeoutSeconds", "lightCheckTimeoutSeconds", "", "lightCheckThreshold", "fallbackEdgeDetectionDuration", "switchCaptureContent", "immediateTimeout", "<init>", "(ZIIFIZZ)V", "component1", "()Z", "component2", "()I", "component3", "component4", "()F", "component5", "component6", "component7", "copy", "(ZIIFIZZ)Lcom/paypal/oslo/feature/verificationcapture/webview/WebSdkPayloadParser$OptionsFields;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getEnableBarcode", com.visa.cbp.getEncExpo.warmup, "getBarcodeTimeoutSeconds", "getLightCheckTimeoutSeconds", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLightCheckThreshold", "getFallbackEdgeDetectionDuration", "getSwitchCaptureContent", "getImmediateTimeout"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OptionsFields {
        public static final int $stable = 0;
        private final int barcodeTimeoutSeconds;
        private final boolean enableBarcode;
        private final int fallbackEdgeDetectionDuration;
        private final boolean immediateTimeout;
        private final float lightCheckThreshold;
        private final int lightCheckTimeoutSeconds;
        private final boolean switchCaptureContent;

        public OptionsFields(boolean z, int i, int i2, float f, int i3, boolean z2, boolean z3) {
            this.enableBarcode = z;
            this.barcodeTimeoutSeconds = i;
            this.lightCheckTimeoutSeconds = i2;
            this.lightCheckThreshold = f;
            this.fallbackEdgeDetectionDuration = i3;
            this.switchCaptureContent = z2;
            this.immediateTimeout = z3;
        }

        public final boolean getEnableBarcode() {
            return this.enableBarcode;
        }

        public final int getBarcodeTimeoutSeconds() {
            return this.barcodeTimeoutSeconds;
        }

        public final int getLightCheckTimeoutSeconds() {
            return this.lightCheckTimeoutSeconds;
        }

        public final float getLightCheckThreshold() {
            return this.lightCheckThreshold;
        }

        public final int getFallbackEdgeDetectionDuration() {
            return this.fallbackEdgeDetectionDuration;
        }

        public final boolean getSwitchCaptureContent() {
            return this.switchCaptureContent;
        }

        public final boolean getImmediateTimeout() {
            return this.immediateTimeout;
        }

        public final java.lang.String toString() {
            boolean z = this.enableBarcode;
            int i = this.barcodeTimeoutSeconds;
            int i2 = this.lightCheckTimeoutSeconds;
            float f = this.lightCheckThreshold;
            int i3 = this.fallbackEdgeDetectionDuration;
            boolean z2 = this.switchCaptureContent;
            boolean z3 = this.immediateTimeout;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionsFields(enableBarcode=");
            sb.append(z);
            sb.append(", barcodeTimeoutSeconds=");
            sb.append(i);
            sb.append(", lightCheckTimeoutSeconds=");
            sb.append(i2);
            sb.append(", lightCheckThreshold=");
            sb.append(f);
            sb.append(", fallbackEdgeDetectionDuration=");
            sb.append(i3);
            sb.append(", switchCaptureContent=");
            sb.append(z2);
            sb.append(", immediateTimeout=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((java.lang.Boolean.hashCode(this.enableBarcode) * 31) + java.lang.Integer.hashCode(this.barcodeTimeoutSeconds)) * 31) + java.lang.Integer.hashCode(this.lightCheckTimeoutSeconds)) * 31) + java.lang.Float.hashCode(this.lightCheckThreshold)) * 31) + java.lang.Integer.hashCode(this.fallbackEdgeDetectionDuration)) * 31) + java.lang.Boolean.hashCode(this.switchCaptureContent)) * 31) + java.lang.Boolean.hashCode(this.immediateTimeout);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields optionsFields = (com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields) other;
            return this.enableBarcode == optionsFields.enableBarcode && this.barcodeTimeoutSeconds == optionsFields.barcodeTimeoutSeconds && this.lightCheckTimeoutSeconds == optionsFields.lightCheckTimeoutSeconds && java.lang.Float.compare(this.lightCheckThreshold, optionsFields.lightCheckThreshold) == 0 && this.fallbackEdgeDetectionDuration == optionsFields.fallbackEdgeDetectionDuration && this.switchCaptureContent == optionsFields.switchCaptureContent && this.immediateTimeout == optionsFields.immediateTimeout;
        }

        public final com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields copy(boolean enableBarcode, int barcodeTimeoutSeconds, int lightCheckTimeoutSeconds, float lightCheckThreshold, int fallbackEdgeDetectionDuration, boolean switchCaptureContent, boolean immediateTimeout) {
            return new com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields(enableBarcode, barcodeTimeoutSeconds, lightCheckTimeoutSeconds, lightCheckThreshold, fallbackEdgeDetectionDuration, switchCaptureContent, immediateTimeout);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getImmediateTimeout() {
            return this.immediateTimeout;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSwitchCaptureContent() {
            return this.switchCaptureContent;
        }

        /* renamed from: component5, reason: from getter */
        public final int getFallbackEdgeDetectionDuration() {
            return this.fallbackEdgeDetectionDuration;
        }

        /* renamed from: component4, reason: from getter */
        public final float getLightCheckThreshold() {
            return this.lightCheckThreshold;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLightCheckTimeoutSeconds() {
            return this.lightCheckTimeoutSeconds;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBarcodeTimeoutSeconds() {
            return this.barcodeTimeoutSeconds;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnableBarcode() {
            return this.enableBarcode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields copy$default(com.paypal.oslo.feature.verificationcapture.webview.WebSdkPayloadParser.OptionsFields optionsFields, boolean z, int i, int i2, float f, int i3, boolean z2, boolean z3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                z = optionsFields.enableBarcode;
            }
            if ((i4 & 2) != 0) {
                i = optionsFields.barcodeTimeoutSeconds;
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = optionsFields.lightCheckTimeoutSeconds;
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                f = optionsFields.lightCheckThreshold;
            }
            float f2 = f;
            if ((i4 & 16) != 0) {
                i3 = optionsFields.fallbackEdgeDetectionDuration;
            }
            int i7 = i3;
            if ((i4 & 32) != 0) {
                z2 = optionsFields.switchCaptureContent;
            }
            boolean z4 = z2;
            if ((i4 & 64) != 0) {
                z3 = optionsFields.immediateTimeout;
            }
            return optionsFields.copy(z, i5, i6, f2, i7, z4, z3);
        }
    }
}
