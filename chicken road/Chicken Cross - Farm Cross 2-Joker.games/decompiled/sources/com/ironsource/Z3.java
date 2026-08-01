package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8041a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4287a4 c4287a4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f8041a, c4287a4.b(), a(c4287a4.c()), b(c4287a4));
    }

    private static String b(C4287a4 c4287a4) {
        return (c4287a4.d() == null || c4287a4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c4287a4.d(), c4287a4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
