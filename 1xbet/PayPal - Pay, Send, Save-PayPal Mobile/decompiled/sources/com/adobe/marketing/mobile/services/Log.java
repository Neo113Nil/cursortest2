package com.adobe.marketing.mobile.services;

/* loaded from: classes.dex */
public class Log {
    public static final java.lang.String INVALID_FORMAT = "Invalid Format";
    public static final java.lang.String UNEXPECTED_EMPTY_VALUE = "Unexpected Empty Value";
    public static final java.lang.String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    private static com.adobe.marketing.mobile.LoggingMode getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.LoggingMode.ERROR;

    private Log() {
    }

    public static void setLogLevel(com.adobe.marketing.mobile.LoggingMode loggingMode) {
        getHighSpeedVideoFpsRanges = loggingMode;
    }

    public static com.adobe.marketing.mobile.LoggingMode getLogLevel() {
        return getHighSpeedVideoFpsRanges;
    }

    public static void trace(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        com.adobe.marketing.mobile.services.Logging loggingService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getLoggingService();
        if (loggingService == null || getHighSpeedVideoFpsRanges.id < com.adobe.marketing.mobile.LoggingMode.VERBOSE.id) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(str2);
            loggingService.trace(sb.toString(), java.lang.String.format(str3, objArr));
        } catch (java.lang.Exception unused) {
            loggingService.trace(str2, str3);
        }
    }

    public static void debug(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        com.adobe.marketing.mobile.services.Logging loggingService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getLoggingService();
        if (loggingService == null || getHighSpeedVideoFpsRanges.id < com.adobe.marketing.mobile.LoggingMode.DEBUG.id) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(str2);
            loggingService.debug(sb.toString(), java.lang.String.format(str3, objArr));
        } catch (java.lang.Exception unused) {
            loggingService.debug(str2, str3);
        }
    }

    public static void warning(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        com.adobe.marketing.mobile.services.Logging loggingService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getLoggingService();
        if (loggingService == null || getHighSpeedVideoFpsRanges.ordinal() < com.adobe.marketing.mobile.LoggingMode.WARNING.id) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(str2);
            loggingService.warning(sb.toString(), java.lang.String.format(str3, objArr));
        } catch (java.lang.Exception unused) {
            loggingService.warning(str2, str3);
        }
    }

    public static void error(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object... objArr) {
        com.adobe.marketing.mobile.services.Logging loggingService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getLoggingService();
        if (loggingService == null || getHighSpeedVideoFpsRanges.ordinal() < com.adobe.marketing.mobile.LoggingMode.ERROR.id) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(str2);
            loggingService.error(sb.toString(), java.lang.String.format(str3, objArr));
        } catch (java.lang.Exception unused) {
            loggingService.error(str2, str3);
        }
    }
}
