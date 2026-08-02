package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/WebSdkResultConverter;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowResult;", "results", "", "convertDocumentResults", "(Ljava/util/List;)Ljava/lang/String;", "p0", "Lorg/json/JSONArray;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Lorg/json/JSONArray;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;", "result", "convertLivenessResult", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;)Ljava/lang/String;", "convertCancel", "()Ljava/lang/String;", "convertTimeout", "errorCode", "errorMessage", "convertError", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "buildFaceTecFinalResult", "(Ljava/lang/String;)Ljava/lang/String;", "buildFaceTecErrorPayload", "buildAppInfoPayload", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebSdkResultConverter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter INSTANCE = new com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter();

    private WebSdkResultConverter() {
    }

    public final java.lang.String convertDocumentResults(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> results) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONArray highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(results);
            if (highResolutionOutputSizeshNQ4ISI.length() == 0) {
                jSONObject = new org.json.JSONObject();
                jSONObject.put("errorCode", 400);
                jSONObject.put("errorMessage", "No results");
            } else {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("idCaptureResults", highResolutionOutputSizeshNQ4ISI);
                jSONObject3.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "file");
                jSONObject = jSONObject3;
            }
            jSONObject2.put("action", "result");
            jSONObject2.put("result", jSONObject);
            java.lang.String jSONObject4 = jSONObject2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "");
            return getHighSpeedVideoFpsRanges(jSONObject4);
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("Failed to convert document results to WebSDK format", e);
            return "\"Json exception\"";
        }
    }

    private static org.json.JSONArray getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> p0) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult workflowResult : p0) {
            byte[] documentContext = workflowResult.getDocumentContext();
            if (documentContext != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("docContext", android.util.Base64.encodeToString(documentContext, 2));
                jSONObject.put("retryNumber", workflowResult.getRetryCount());
                java.lang.String documentId = workflowResult.getDocumentId();
                if (documentId == null) {
                    documentId = "";
                }
                jSONObject.put("uniqueId", documentId);
                jSONObject.put("isManualUpload", java.lang.String.valueOf(workflowResult.isManualCapture()));
                java.lang.String metaData = workflowResult.getMetaData();
                if (metaData != null) {
                    try {
                        jSONObject.put("metadata", new org.json.JSONObject(metaData));
                    } catch (org.json.JSONException e) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Failed to parse metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
                    }
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public final java.lang.String convertLivenessResult(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("faceScan", result.getFaceScanData());
            jSONObject2.put("retryNumber", 0);
            jSONObject2.put("uniqueId", "");
            jSONObject2.put("isManualUpload", "false");
            java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) result.getAuditTrailImages());
            if (str == null) {
                str = "";
            }
            jSONObject2.put("auditTrailImage", str);
            java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) result.getLowQualityAuditTrailImages());
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("lowQualityAuditTrailImage", str2);
            jSONObject2.put("sessionId", result.getSessionId());
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("idCaptureResults", new org.json.JSONArray().put(jSONObject2));
            jSONObject3.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "file");
            jSONObject.put("action", "facetec_pending_result");
            jSONObject.put("result", jSONObject3);
            java.lang.String jSONObject4 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "");
            return getHighSpeedVideoFpsRanges(jSONObject4);
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("Failed to convert liveness result to WebSDK format", e);
            return "\"Json exception\"";
        }
    }

    public final java.lang.String convertCancel() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return getHighSpeedVideoFpsRanges(jSONObject2);
    }

    public final java.lang.String convertTimeout() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return getHighSpeedVideoFpsRanges(jSONObject2);
    }

    public final java.lang.String convertError(java.lang.String errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("errorCode", errorCode);
            jSONObject2.put("errorMessage", errorMessage);
            jSONObject.put("action", "error");
            jSONObject.put("result", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
            return getHighSpeedVideoFpsRanges(jSONObject3);
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("Failed to convert error to WebSDK format", e);
            return "\"Json exception\"";
        }
    }

    public final java.lang.String buildFaceTecFinalResult(java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, flowName);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("context", jSONObject);
            jSONObject2.put("idCaptureResults", new org.json.JSONArray());
            jSONObject2.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "file");
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("action", "result");
            jSONObject3.put("result", jSONObject2);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "");
            return getHighSpeedVideoFpsRanges(jSONObject4);
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("Failed to build FaceTec final result payload", e);
            return "\"Json exception\"";
        }
    }

    public final java.lang.String buildFaceTecErrorPayload(java.lang.String errorCode, java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, flowName);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("context", jSONObject);
            jSONObject2.put("idCaptureResults", new org.json.JSONArray());
            jSONObject2.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "file");
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("action", errorCode);
            jSONObject3.put("result", jSONObject2);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "");
            return getHighSpeedVideoFpsRanges(jSONObject4);
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("Failed to build FaceTec error payload", e);
            return "\"Json exception\"";
        }
    }

    public final java.lang.String buildAppInfoPayload() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Android");
            jSONObject.put("apiVersion", "1.0.0");
            jSONObject.put("bundleName", "PayPal");
            jSONObject.put("bundleVersion", "9.0.0");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", "info");
            jSONObject2.put("info", jSONObject);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
            return getHighSpeedVideoFpsRanges(jSONObject3);
        } catch (org.json.JSONException e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("Failed to build app info payload", e);
            return "\"Json exception\"";
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0) {
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(p0, "\\", "\\\\", false, 4, (java.lang.Object) null), "\"", "\\\"", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
        sb.append(replace$default);
        sb.append("\"");
        return sb.toString();
    }
}
