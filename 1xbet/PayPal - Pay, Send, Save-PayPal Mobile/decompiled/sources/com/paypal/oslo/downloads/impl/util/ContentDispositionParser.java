package com.paypal.oslo.downloads.impl.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/downloads/impl/util/ContentDispositionParser;", "", "<init>", "()V", "", "headerValue", "extractFilename", "(Ljava/lang/String;)Ljava/lang/String;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Z", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContentDispositionParser {
    public static final com.paypal.oslo.downloads.impl.util.ContentDispositionParser INSTANCE = new com.paypal.oslo.downloads.impl.util.ContentDispositionParser();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("filename\\s*=\\s*\"?([^\";]+)\"?", kotlin.text.RegexOption.IGNORE_CASE);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("filename\\*\\s*=\\s*([^']*)'([^']*)'(.+)", kotlin.text.RegexOption.IGNORE_CASE);

    private ContentDispositionParser() {
    }

    public final java.lang.String extractFilename(java.lang.String headerValue) {
        java.lang.String str = headerValue;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return null;
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(headerValue);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(getHighSpeedVideoFpsRanges, str, 0, 2, null);
        if (find$default == null) {
            return null;
        }
        return getHighSpeedVideoFpsRanges(kotlin.text.StringsKt.trim(find$default.getGroupValues().get(1)).toString());
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        java.lang.String highSpeedVideoFpsRangesFor;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(getHighSpeedVideoSizes, p0, 0, 2, null);
        if (find$default == null) {
            return null;
        }
        java.lang.String str = find$default.getGroupValues().get(1);
        if (str.length() == 0) {
            str = "UTF-8";
        }
        java.lang.String str2 = str;
        java.lang.String str3 = find$default.getGroupValues().get(3);
        try {
            highSpeedVideoFpsRangesFor = java.net.URLDecoder.decode(str3, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Unsupported charset for filename decoding", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, str2), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str3);
        } catch (java.lang.IllegalArgumentException e2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Failed to decode filename", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, str2), kotlin.TuplesKt.to("error", e2.getMessage())), null, 4, null);
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str3);
        }
        return getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.downloads.impl.util.ContentDispositionParser contentDispositionParser = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.net.URLDecoder.decode(p0, java.nio.charset.StandardCharsets.UTF_8.name()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (java.lang.String) m23436constructorimpl;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0) {
        java.lang.String str = p0;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (Camera2StreamConfigurationMap(p0)) {
            return p0;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Rejected unsafe filename from Content-Disposition header", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("filename", p0)), null, 4, null);
        return null;
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String p0) {
        boolean z;
        java.lang.String str = p0;
        boolean z2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "..", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(p0, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\\", false, 2, (java.lang.Object) null);
        boolean z3 = p0.length() > 255;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (java.lang.Character.isISOControl(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        return (z2 || z3 || z) ? false : true;
    }
}
