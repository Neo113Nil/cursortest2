package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class K6 {
    public static final org.json.JSONObject a(com.inmobi.media.J6 j6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j6, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("x", java.lang.Float.valueOf(com.inmobi.media.J3.a(j6.f4776a)));
        jSONObject.put("y", java.lang.Float.valueOf(com.inmobi.media.J3.a(j6.b)));
        jSONObject.put("width", j6.c);
        jSONObject.put("height", j6.d);
        return jSONObject;
    }
}
