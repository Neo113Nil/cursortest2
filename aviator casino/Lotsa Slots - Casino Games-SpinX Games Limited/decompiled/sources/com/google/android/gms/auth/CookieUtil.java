package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static java.lang.String getCookieUrl(java.lang.String str, java.lang.Boolean bool) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return (true != zza(bool) ? androidx.webkit.ProxyConfig.MATCH_HTTP : "https") + "://" + str;
    }

    public static java.lang.String getCookieValue(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(com.ironsource.B5.U);
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (zza(bool)) {
            sb.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb.append(";Secure");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        if (!android.text.TextUtils.isEmpty(null)) {
            sb.append(";Priority=null");
        }
        if (!android.text.TextUtils.isEmpty(null)) {
            sb.append(";SameSite=null");
        }
        if (zza(null)) {
            sb.append(";SameParty");
        }
        return sb.toString();
    }

    private static boolean zza(java.lang.Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
