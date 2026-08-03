package com.ironsource.environment;

/* loaded from: classes5.dex */
public class StringUtils {
    public static java.lang.String toLowerCase(java.lang.String str) {
        return str == null ? "" : str.toLowerCase(java.util.Locale.ENGLISH);
    }

    public static java.lang.String toUpperCase(java.lang.String str) {
        return str == null ? "" : str.toUpperCase(java.util.Locale.ENGLISH);
    }

    public static java.lang.String decodeURI(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    public static java.lang.String encodeURI(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str, "UTF-8").replace(org.slf4j.Marker.ANY_NON_NULL_MARKER, "%20");
        } catch (java.io.UnsupportedEncodingException e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }
}
