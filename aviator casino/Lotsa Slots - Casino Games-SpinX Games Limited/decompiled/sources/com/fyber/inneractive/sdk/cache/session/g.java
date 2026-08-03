package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f3567a;
    public int b;
    public int c;
    public final long d;

    public g(int i, int i2, int i3, long j) {
        this.d = j;
        this.f3567a = i;
        this.b = i2;
        this.c = i3;
    }

    public final org.json.JSONObject a(boolean z, boolean z2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.d);
            } catch (org.json.JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f3567a);
        if (z2) {
            jSONObject.put("com", this.c);
        }
        jSONObject.put("cli", this.b);
        return jSONObject;
    }

    public static com.fyber.inneractive.sdk.cache.session.g a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            long optLong = jSONObject.optLong("time");
            int optInt = jSONObject.optInt("cli", -1);
            int optInt2 = jSONObject.optInt("imp", -1);
            int optInt3 = jSONObject.optInt("com", -1);
            if (optLong != 0 && optInt >= 0 && optInt2 >= 0 && optInt3 >= 0) {
                return new com.fyber.inneractive.sdk.cache.session.g(optInt2, optInt, optInt3, optLong);
            }
        }
        return null;
    }
}
