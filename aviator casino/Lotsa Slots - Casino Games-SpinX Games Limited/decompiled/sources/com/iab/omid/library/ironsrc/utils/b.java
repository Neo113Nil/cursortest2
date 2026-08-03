package com.iab.omid.library.ironsrc.utils;

/* loaded from: classes5.dex */
public final class b {
    public static java.lang.String a() {
        return android.os.Build.MANUFACTURER + "; " + android.os.Build.MODEL;
    }

    public static java.lang.String b() {
        return com.ironsource.X3.d;
    }

    public static java.lang.String c() {
        return java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT);
    }

    public static org.json.JSONObject d() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, "deviceType", a());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, "osVersion", c());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, com.ironsource.M6.F, b());
        return jSONObject;
    }
}
