package com.startapp.sdk.internal;

import android.util.Base64;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d2 {
    public static String a(boolean z3) {
        JSONObject jSONObject = new JSONObject();
        if (z3) {
            jSONObject.put("isTestAd", z3);
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.j.d(jSONObject2, "toString(...)");
        byte[] bytes = jSONObject2.getBytes(v2.a.f10417a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.j.b(encodeToString);
        return encodeToString;
    }
}
