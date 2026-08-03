package com.ironsource.mediationsdk.utils;

/* loaded from: classes5.dex */
public class ErrorBuilder {
    private static com.ironsource.mediationsdk.logger.IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError adContainerIsNull(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, str + " banner container is null");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildCappedPerPlacementError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildCappedPerSessionError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION, str + " Show Fail - Networks have reached their cap per session");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildGenericError(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(510, str);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildInitFailedError(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str)) {
            str3 = str2 + " init failed due to an unknown error";
        } else {
            str3 = str2 + " - " + str;
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED, str3);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildInvalidConfigurationError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, "" + str + " Init Fail - Configurations from the server are not valid");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildInvalidCredentialsError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Init Fail - ");
        sb.append(str);
        sb.append(" value ");
        sb.append(str2);
        sb.append(" is not valid");
        if (android.text.TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = " - " + str3;
        }
        sb.append(str4);
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sb.toString());
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildInvalidKeyValueError(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str)) {
            return a();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mediation - ");
        sb.append(str);
        sb.append(" value is not valid ");
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " - " + str2;
        }
        sb.append(str3);
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sb.toString());
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildKeyNotSetError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return a();
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_KEY_NOT_SET, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append(str);
        sb.append(" Load Fail");
        if (!android.text.TextUtils.isEmpty(str2)) {
            str4 = io.ktor.sse.ServerSentEventKt.SPACE + str2;
        }
        sb.append(str4);
        sb.append(" - ");
        java.lang.String sb2 = sb.toString();
        if (android.text.TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(510, sb2 + str3);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildNoAdsToShowError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, str + " Show Fail - No ads to show");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildNoConfigurationAvailableError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, "" + str + " Init Fail - Unable to retrieve configurations from the server");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildNoInternetConnectionInitFailError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Init Fail - No Internet connection");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildNoInternetConnectionLoadFailError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Load Fail - No Internet connection");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildNoInternetConnectionShowFailError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Show Fail - No Internet connection");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE, str + " The requested instance does not exist");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildShowFailedError(java.lang.String str, java.lang.String str2) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, str + " Show Fail - " + str2);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildUsingCachedConfigurationError(java.lang.String str, java.lang.String str2) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError unsupportedBannerSize(java.lang.String str) {
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, str + " unsupported banner size");
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildInitFailedError(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Init failed - ");
        if (android.text.TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb.append(str);
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED, sb.toString());
    }

    public static com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            str2 = "Load failed due to an unknown error";
        } else {
            str2 = "Load failed - " + str;
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(510, str2);
    }
}
