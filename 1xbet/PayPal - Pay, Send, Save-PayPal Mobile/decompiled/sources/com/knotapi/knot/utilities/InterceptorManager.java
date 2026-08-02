package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class InterceptorManager {
    public static java.lang.String replaceUrlParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            android.net.Uri parse = android.net.Uri.parse(java.net.URLDecoder.decode(str, java.nio.charset.StandardCharsets.UTF_8.name()));
            java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
            android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (java.lang.String str4 : queryParameterNames) {
                clearQuery.appendQueryParameter(str4, str4.equals(str2) ? str3 : parse.getQueryParameter(str4));
            }
            return clearQuery.build().toString();
        } catch (java.lang.Exception unused) {
            return str;
        }
    }
}
