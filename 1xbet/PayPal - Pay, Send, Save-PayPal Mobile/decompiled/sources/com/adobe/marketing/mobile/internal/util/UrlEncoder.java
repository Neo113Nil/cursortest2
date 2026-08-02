package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/UrlEncoder;", "", "<init>", "()V", "", "unencodedString", "urlEncode", "(Ljava/lang/String;)Ljava/lang/String;", "", "getHighSpeedVideoFpsRanges", "[Ljava/lang/String;", "", "getHighResolutionOutputSizeshNQ4ISI", "[Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class UrlEncoder {
    public static final com.adobe.marketing.mobile.internal.util.UrlEncoder INSTANCE = new com.adobe.marketing.mobile.internal.util.UrlEncoder();
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"%00", "%01", "%02", "%03", "%04", "%05", "%06", "%07", "%08", "%09", "%0A", "%0B", "%0C", "%0D", "%0E", "%0F", "%10", "%11", "%12", "%13", "%14", "%15", "%16", "%17", "%18", "%19", "%1A", "%1B", "%1C", "%1D", "%1E", "%1F", "%20", "%21", "%22", "%23", "%24", "%25", "%26", "%27", "%28", "%29", "%2A", "%2B", "%2C", "-", ".", "%2F", "0", "1", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "%3A", "%3B", "%3C", "%3D", "%3E", "%3F", "%40", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "G", "H", com.visa.cbp.getEncExpo.warmup, "J", "K", "L", "M", "N", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "P", com.visa.cbp.getEncExpo.updateVisuals, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "S", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "V", "W", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "Y", "Z", "%5B", "%5C", "%5D", "%5E", "_", "%60", "a", util.h.xy.cb.b.f1091, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", lib.android.paypal.com.magnessdk.g.n2, "t", "u", "v", "w", "x", "y", "z", "%7B", "%7C", "%7D", "~", "%7F", "%80", "%81", "%82", "%83", "%84", "%85", "%86", "%87", "%88", "%89", "%8A", "%8B", "%8C", "%8D", "%8E", "%8F", "%90", "%91", "%92", "%93", "%94", "%95", "%96", "%97", "%98", "%99", "%9A", "%9B", "%9C", "%9D", "%9E", "%9F", "%A0", "%A1", "%A2", "%A3", "%A4", "%A5", "%A6", "%A7", "%A8", "%A9", "%AA", "%AB", "%AC", "%AD", "%AE", "%AF", "%B0", "%B1", "%B2", "%B3", "%B4", "%B5", "%B6", "%B7", "%B8", "%B9", "%BA", "%BB", "%BC", "%BD", "%BE", "%BF", "%C0", "%C1", "%C2", "%C3", "%C4", "%C5", "%C6", "%C7", "%C8", "%C9", "%CA", "%CB", "%CC", "%CD", "%CE", "%CF", "%D0", "%D1", "%D2", "%D3", "%D4", "%D5", "%D6", "%D7", "%D8", "%D9", "%DA", "%DB", "%DC", "%DD", "%DE", "%DF", "%E0", "%E1", "%E2", "%E3", "%E4", "%E5", "%E6", "%E7", "%E8", "%E9", "%EA", "%EB", "%EC", "%ED", "%EE", "%EF", "%F0", "%F1", "%F2", "%F3", "%F4", "%F5", "%F6", "%F7", "%F8", "%F9", "%FA", "%FB", "%FC", "%FD", "%FE", "%FF"};
    private static final boolean[] getHighResolutionOutputSizeshNQ4ISI = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    private UrlEncoder() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String urlEncode(java.lang.String unencodedString) {
        if (unencodedString == null) {
            return null;
        }
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
            byte[] bytes = unencodedString.getBytes(forName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            int length = bytes.length;
            int i = 0;
            while (i < length && getHighResolutionOutputSizeshNQ4ISI[bytes[i] & 255]) {
                i++;
            }
            if (i == length) {
                return unencodedString;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(bytes.length << 1);
            if (i > 0) {
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
                sb.append(new java.lang.String(bytes, 0, i, charset));
            }
            while (i < length) {
                sb.append(getHighSpeedVideoFpsRanges[bytes[i] & 255]);
                i++;
            }
            return sb.toString();
        } catch (java.io.UnsupportedEncodingException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to url encode string ");
            sb2.append(unencodedString);
            sb2.append(' ');
            sb2.append(e);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "UrlUtilities", sb2.toString(), new java.lang.Object[0]);
            return null;
        }
    }
}
