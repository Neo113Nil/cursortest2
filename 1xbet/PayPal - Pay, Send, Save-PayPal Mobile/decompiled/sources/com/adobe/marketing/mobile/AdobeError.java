package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public class AdobeError implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    public static final com.adobe.marketing.mobile.AdobeError UNEXPECTED_ERROR = new com.adobe.marketing.mobile.AdobeError("general.unexpected", 0);
    public static final com.adobe.marketing.mobile.AdobeError CALLBACK_TIMEOUT = new com.adobe.marketing.mobile.AdobeError("general.callback.timeout", 1);
    public static final com.adobe.marketing.mobile.AdobeError CALLBACK_NULL = new com.adobe.marketing.mobile.AdobeError("general.callback.null", 2);
    public static final com.adobe.marketing.mobile.AdobeError SERVER_ERROR = new com.adobe.marketing.mobile.AdobeError("general.server.error", 4);
    public static final com.adobe.marketing.mobile.AdobeError NETWORK_ERROR = new com.adobe.marketing.mobile.AdobeError("general.network.error", 5);
    public static final com.adobe.marketing.mobile.AdobeError INVALID_REQUEST = new com.adobe.marketing.mobile.AdobeError("general.request.invalid", 6);
    public static final com.adobe.marketing.mobile.AdobeError INVALID_RESPONSE = new com.adobe.marketing.mobile.AdobeError("general.response.invalid", 7);
    public static final com.adobe.marketing.mobile.AdobeError DATABASE_ERROR = new com.adobe.marketing.mobile.AdobeError("general.database.error", 8);
    public static final com.adobe.marketing.mobile.AdobeError EXTENSION_NOT_INITIALIZED = new com.adobe.marketing.mobile.AdobeError("general.extension.not.initialized", 11);

    public AdobeError(java.lang.String str, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public java.lang.String getErrorName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getErrorCode() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
