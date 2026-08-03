package com.amazon.device.iap.internal.util;

/* loaded from: classes2.dex */
public class MetricsHelper {
    private static final java.lang.String DESCRIPTION = "description";
    private static final java.lang.String EXCEPTION_MESSAGE = "exceptionMessage";
    private static final java.lang.String EXCEPTION_METRIC = "GenericException";
    private static final java.lang.String JSON_PARSING_EXCEPTION_METRIC = "JsonParsingFailed";
    private static final java.lang.String JSON_STRING = "jsonString";
    private static final java.lang.String RECEIPT_VERIFICATION_FAILED_METRIC = "IapReceiptVerificationFailed";
    private static final java.lang.String SIGNATURE = "signature";
    private static final java.lang.String STRING_TO_SIGN = "stringToSign";
    private static final java.lang.String TAG = "MetricsHelper";

    protected static void submitMetric(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        new com.amazon.device.iap.internal.b.h.a(new com.amazon.device.iap.internal.b.e(com.amazon.device.iap.model.RequestId.fromString(str)), str2, jSONObject.toString()).a_();
    }

    public static void submitReceiptVerificationFailureMetrics(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(STRING_TO_SIGN, str2);
            jSONObject.put("signature", str3);
            submitMetric(str, RECEIPT_VERIFICATION_FAILED_METRIC, jSONObject);
        } catch (java.lang.Exception e) {
            com.amazon.device.iap.internal.util.e.b(TAG, "error calling submitMetric: " + e);
        }
    }

    public static void submitJsonParsingExceptionMetrics(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(JSON_STRING, str2);
            jSONObject.put("description", str3);
            submitMetric(str, JSON_PARSING_EXCEPTION_METRIC, jSONObject);
        } catch (java.lang.Exception e) {
            com.amazon.device.iap.internal.util.e.b(TAG, "error calling submitMetric: " + e);
        }
    }

    public static void submitExceptionMetrics(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(EXCEPTION_MESSAGE, exc.getMessage());
            jSONObject.put("description", str2);
            submitMetric(str, EXCEPTION_METRIC, jSONObject);
        } catch (java.lang.Exception e) {
            com.amazon.device.iap.internal.util.e.b(TAG, "error calling submitMetric: " + e);
        }
    }
}
