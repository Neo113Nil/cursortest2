package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class o implements com.fyber.inneractive.sdk.config.global.n {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f3609a;

    public o(org.json.JSONObject jSONObject) {
        this.f3609a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final java.lang.Integer a(java.lang.String str) {
        if (this.f3609a.has(str)) {
            try {
                return java.lang.Integer.valueOf(this.f3609a.getInt(str));
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final java.lang.String b(java.lang.String str) {
        if (this.f3609a.has(str)) {
            try {
                return this.f3609a.getString(str);
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final java.lang.Boolean c(java.lang.String str) {
        if (this.f3609a.has(str)) {
            try {
                return java.lang.Boolean.valueOf(this.f3609a.getBoolean(str));
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    public final java.lang.String toString() {
        org.json.JSONObject jSONObject = this.f3609a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        return this.f3609a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final java.util.Map a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = this.f3609a.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                hashMap.put(next, this.f3609a.get(next));
            } catch (java.lang.Exception unused) {
            }
        }
        return hashMap;
    }
}
