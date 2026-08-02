package com.visa.cbp.sdk.facade.error;

/* loaded from: classes5.dex */
public class CBPErrorFactoryCommons {
    private static final java.lang.String CONTENT_TYPE_JSON = "application/json;charset=UTF-8";
    private static final java.lang.String TAG = "com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons";

    public static com.visa.cbp.sdk.facade.error.CbpError error(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        return error(setdevicecerts.BuildConfig(), setdevicecerts.valueOf(), reasonCode);
    }

    public static com.visa.cbp.sdk.facade.error.CbpError error(int i, java.lang.String str, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        return new com.visa.cbp.sdk.facade.error.CbpError(i, str, reasonCode, "");
    }

    public static com.visa.cbp.sdk.facade.error.CbpError error(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        return new com.visa.cbp.sdk.facade.error.CbpError(setdevicecerts.BuildConfig(), setdevicecerts.ConfirmReplenishRequest(str), reasonCode, "");
    }

    public static com.visa.cbp.sdk.facade.error.CbpError error(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str2) {
        return new com.visa.cbp.sdk.facade.error.CbpError(setdevicecerts.BuildConfig(), setdevicecerts.ConfirmReplenishRequest(str), reasonCode, str2);
    }

    public static com.visa.cbp.sdk.facade.error.TokenStatusError tokenError(com.visa.cbp.setDeviceCerts setdevicecerts, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode) {
        return new com.visa.cbp.sdk.facade.error.TokenStatusError(setdevicecerts.BuildConfig(), setdevicecerts.valueOf(), reasonCode, "");
    }

    public static com.visa.cbp.sdk.facade.error.TokenStatusError tokenError(com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        return new com.visa.cbp.sdk.facade.error.TokenStatusError(cbpError.getErrorCode(), cbpError.getErrorMessage(), cbpError.getReasonCode(), cbpError.getCorrelationId());
    }

    static java.lang.String convertStreamToString(java.io.InputStream inputStream) {
        java.util.Scanner useDelimiter = new java.util.Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }
}
