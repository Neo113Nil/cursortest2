package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class c1 {
    public static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof com.fyber.inneractive.sdk.util.b1) {
                    jSONObject.putOpt(str, ((com.fyber.inneractive.sdk.util.b1) obj).a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
