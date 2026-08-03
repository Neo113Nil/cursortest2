package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class eb {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.util.Map<java.lang.String, java.lang.String> f1927 = new java.util.HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static java.lang.String m7682(java.lang.String str) {
        java.lang.String str2 = f1927.get(str);
        if (str2 != null) {
            return str2;
        }
        f1927.put(str, str);
        return str;
    }
}
