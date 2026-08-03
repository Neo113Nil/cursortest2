package com.ironsource;

/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2983c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f6169a = "SSA_CORE.SDKController.runFunction";

    public static java.lang.String a(com.ironsource.C3001d4 c3001d4) {
        return java.lang.String.format("%1$s('%2$s%3$s'%4$s)", f6169a, c3001d4.b(), a(c3001d4.c()), b(c3001d4));
    }

    private static java.lang.String b(com.ironsource.C3001d4 c3001d4) {
        return (c3001d4.d() == null || c3001d4.a() == null) ? "" : java.lang.String.format(", '%1$s', '%2$s'", c3001d4.d(), c3001d4.a());
    }

    private static java.lang.String a(org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
