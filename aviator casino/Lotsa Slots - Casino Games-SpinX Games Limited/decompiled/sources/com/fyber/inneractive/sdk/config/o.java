package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3622a = new java.util.HashMap();
    public final java.util.HashMap b = new java.util.HashMap();

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        return this.f3622a.containsKey(str) ? (java.lang.String) this.f3622a.get(str) : str2;
    }

    public final int b(java.lang.String str, int i, int i2) {
        int i3;
        try {
            i3 = java.lang.Integer.parseInt(a(str, java.lang.Integer.toString(i)));
        } catch (java.lang.Throwable unused) {
            i3 = i;
        }
        return (i3 < i2 || i3 > 30) ? i : i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.config.o.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.config.o oVar = (com.fyber.inneractive.sdk.config.o) obj;
        return this.f3622a.equals(oVar.f3622a) && this.b.equals(oVar.b);
    }

    public final int hashCode() {
        return this.f3622a.hashCode();
    }

    public static com.fyber.inneractive.sdk.config.o a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.o oVar = new com.fyber.inneractive.sdk.config.o();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("params");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        org.json.JSONArray names = optJSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            java.lang.String optString = names.optString(i, null);
            java.lang.String optString2 = optJSONObject.optString(optString, null);
            if (optString != null && optString2 != null) {
                oVar.f3622a.put(optString, optString2);
            }
        }
        if (optJSONObject2 != null) {
            org.json.JSONArray names2 = optJSONObject2.names();
            for (int i2 = 0; i2 < names2.length(); i2++) {
                java.lang.String optString3 = names2.optString(i2, null);
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString3);
                if (optString3 != null && optJSONObject3 != null) {
                    oVar.b.put(optString3, new com.fyber.inneractive.sdk.config.m(optJSONObject3));
                }
            }
        }
        return oVar;
    }

    public final int a(java.lang.String str, int i, int i2) {
        try {
            i = java.lang.Integer.parseInt(a(str, java.lang.Integer.toString(i)));
        } catch (java.lang.Throwable unused) {
        }
        return java.lang.Math.max(i, i2);
    }

    public final boolean a(boolean z, java.lang.String str) {
        try {
            return java.lang.Boolean.parseBoolean(a(str, java.lang.Boolean.toString(z)));
        } catch (java.lang.Throwable unused) {
            return z;
        }
    }

    public final com.fyber.inneractive.sdk.config.l a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.m mVar;
        java.lang.String str2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.d;
        if (this.b.containsKey(str2)) {
            mVar = (com.fyber.inneractive.sdk.config.m) this.b.get(str2);
        } else {
            mVar = new com.fyber.inneractive.sdk.config.m();
        }
        mVar.getClass();
        return mVar.f3620a.containsKey(str) ? (com.fyber.inneractive.sdk.config.l) mVar.f3620a.get(str) : new com.fyber.inneractive.sdk.config.l();
    }
}
