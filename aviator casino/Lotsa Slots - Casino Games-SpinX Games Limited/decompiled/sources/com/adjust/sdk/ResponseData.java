package com.adjust.sdk;

/* loaded from: classes2.dex */
public class ResponseData {
    public com.adjust.sdk.ActivityKind activityKind;
    public com.adjust.sdk.ActivityPackage activityPackage;
    public java.lang.String adid;
    public java.lang.Long askIn;
    public com.adjust.sdk.AdjustAttribution attribution;
    public java.lang.Long continueIn;
    public org.json.JSONObject controlParams;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String resolvedDeeplink;
    public java.lang.Long retryIn;
    public java.util.Map<java.lang.String, java.lang.String> sendingParameters;
    public java.util.Map<java.lang.String, java.lang.String> signedParameters;
    public java.lang.String timestamp;
    public com.adjust.sdk.TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    /* renamed from: com.adjust.sdk.ResponseData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3438a;

        static {
            int[] iArr = new int[com.adjust.sdk.ActivityKind.values().length];
            f3438a = iArr;
            try {
                iArr[com.adjust.sdk.ActivityKind.SESSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3438a[com.adjust.sdk.ActivityKind.CLICK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3438a[com.adjust.sdk.ActivityKind.ATTRIBUTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f3438a[com.adjust.sdk.ActivityKind.EVENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f3438a[com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static com.adjust.sdk.ResponseData buildResponseData(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        com.adjust.sdk.ActivityKind activityKind = activityPackage.getActivityKind();
        int i = com.adjust.sdk.ResponseData.AnonymousClass1.f3438a[activityKind.ordinal()];
        com.adjust.sdk.ResponseData responseData = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.adjust.sdk.ResponseData() : new com.adjust.sdk.PurchaseVerificationResponseData() : new com.adjust.sdk.EventResponseData(activityPackage) : new com.adjust.sdk.AttributionResponseData() : new com.adjust.sdk.SdkClickResponseData() : new com.adjust.sdk.SessionResponseData(activityPackage);
        responseData.activityKind = activityKind;
        responseData.activityPackage = activityPackage;
        responseData.sendingParameters = map;
        responseData.signedParameters = map2;
        return responseData;
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
