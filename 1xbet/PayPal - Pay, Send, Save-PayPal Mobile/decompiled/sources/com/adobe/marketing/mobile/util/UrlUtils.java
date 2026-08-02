package com.adobe.marketing.mobile.util;

/* loaded from: classes7.dex */
public final class UrlUtils {
    private UrlUtils() {
    }

    public static boolean isValidUrl(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return false;
        }
        try {
            new java.net.URL(str);
            return true;
        } catch (java.net.MalformedURLException unused) {
            return false;
        }
    }

    public static java.lang.String urlEncode(java.lang.String str) {
        return com.adobe.marketing.mobile.internal.util.UrlEncoder.urlEncode(str);
    }

    public static java.util.Map<java.lang.String, java.lang.String> extractQueryParameters(java.lang.String str) {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            android.net.Uri parse = android.net.Uri.parse(str);
            for (java.lang.String str2 : parse.getQueryParameterNames()) {
                java.lang.String queryParameter = parse.getQueryParameter(str2);
                if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(queryParameter)) {
                    hashMap.put(str2, queryParameter);
                }
            }
            return hashMap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
