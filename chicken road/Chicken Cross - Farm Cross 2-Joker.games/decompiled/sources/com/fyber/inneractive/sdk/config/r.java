package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5277a = new HashMap();
    public final HashMap b = new HashMap();

    public final String a(String str, String str2) {
        return this.f5277a.containsKey(str) ? (String) this.f5277a.get(str) : str2;
    }

    public final int b(String str, int i, int i2) {
        int i3;
        try {
            i3 = Integer.parseInt(a(str, Integer.toString(i)));
        } catch (Throwable unused) {
            i3 = i;
        }
        return (i3 < i2 || i3 > 30) ? i : i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f5277a.equals(rVar.f5277a) && this.b.equals(rVar.b);
    }

    public final int hashCode() {
        return this.f5277a.hashCode();
    }

    public static r a(JSONObject jSONObject) {
        r rVar = new r();
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next, null);
                if (optString != null) {
                    rVar.f5277a.put(next, optString);
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next2);
                if (optJSONObject3 != null && optJSONObject3.length() > 0) {
                    rVar.b.put(next2, new p(optJSONObject3));
                }
            }
        }
        return rVar;
    }

    public final int a(String str, int i, int i2) {
        try {
            i = Integer.parseInt(a(str, Integer.toString(i)));
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    public final boolean a(boolean z, String str) {
        try {
            return Boolean.parseBoolean(a(str, Boolean.toString(z)));
        } catch (Throwable unused) {
            return z;
        }
    }

    public final o a(String str) {
        p pVar;
        String str2 = IAConfigManager.R.d;
        if (this.b.containsKey(str2)) {
            pVar = (p) this.b.get(str2);
        } else {
            pVar = new p();
        }
        pVar.getClass();
        return pVar.f5274a.containsKey(str) ? (o) pVar.f5274a.get(str) : new o();
    }
}
