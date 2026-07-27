package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f5259a;

    public o(JSONObject jSONObject) {
        this.f5259a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        if (this.f5259a.has(str)) {
            try {
                return Integer.valueOf(this.f5259a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        if (this.f5259a.has(str)) {
            try {
                return this.f5259a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        if (this.f5259a.has(str)) {
            try {
                return Boolean.valueOf(this.f5259a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = this.f5259a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        return this.f5259a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f5259a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f5259a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
