package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
class URLUtils {
    URLUtils() {
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(getHighSpeedVideoSizes(null, "TS", str), "MCMID", str2), "MCORGID", str3);
            sb.append("adobe_mc");
            sb.append("=");
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(highSpeedVideoSizes)) {
                sb.append("null");
            } else {
                sb.append(java.net.URLEncoder.encode(highSpeedVideoSizes, java.nio.charset.Charset.forName("UTF-8").name()));
            }
        } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException e) {
            sb.append("null");
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "URLUtils", java.lang.String.format("Failed to encode urlVariable string: %s", e), new java.lang.Object[0]);
        }
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str3)) {
            return str;
        }
        java.lang.String format = java.lang.String.format("%s=%s", str2, str3);
        return com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) ? format : java.lang.String.format("%s|%s", str, format);
    }
}
