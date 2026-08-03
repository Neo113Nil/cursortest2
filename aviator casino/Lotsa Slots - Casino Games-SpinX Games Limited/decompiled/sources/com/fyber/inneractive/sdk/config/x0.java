package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.cache.session.e f3644a;
    public com.fyber.inneractive.sdk.config.e b;
    public com.fyber.inneractive.sdk.config.v0 e;
    public final java.util.HashMap c = new java.util.HashMap();
    public final java.util.HashMap d = new java.util.HashMap();
    public boolean f = false;

    public final java.lang.String a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, java.lang.String str) {
        java.util.Map map = (java.util.Map) this.c.get(unitDisplayType);
        return (map == null || map.get(str) == null) ? "" : (java.lang.String) map.get(str);
    }

    public final void a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, java.lang.String str, java.lang.String str2) {
        java.util.Map map = (java.util.Map) this.c.get(unitDisplayType);
        if (map == null) {
            map = new java.util.HashMap();
            this.c.put(unitDisplayType, map);
        }
        map.put(str, str2);
        com.fyber.inneractive.sdk.config.v0 v0Var = this.e;
        if (v0Var == null || !this.f) {
            return;
        }
        ((com.fyber.inneractive.sdk.bidder.b) v0Var).d();
    }

    public final org.json.JSONArray a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType) {
        int i;
        com.fyber.inneractive.sdk.cache.session.e eVar = this.f3644a;
        if (eVar == null) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (unitDisplayType == null || cVar.a() == unitDisplayType)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", cVar.a().value());
                    jSONObject.put("subType", cVar.name().toLowerCase(java.util.Locale.US).contains("video") ? "video" : "display");
                    com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.b.get(cVar);
                    try {
                        i = java.lang.Integer.parseInt(com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("number_of_sessions", java.lang.Integer.toString(5)));
                    } catch (java.lang.Throwable unused) {
                        i = 5;
                    }
                    int i2 = i >= 0 ? i : 5;
                    if (i2 > 0 && kVar != null && kVar.size() >= i2) {
                        boolean b = cVar.b();
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kVar);
                        java.util.Collections.sort(arrayList, new com.fyber.inneractive.sdk.cache.session.j());
                        java.util.Iterator it = arrayList.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(((com.fyber.inneractive.sdk.cache.session.g) it.next()).a(false, b));
                            i3++;
                            if (i3 >= i2) {
                                break;
                            }
                        }
                        jSONObject.put("sessionData", jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (java.lang.Exception unused2) {
            return jSONArray;
        }
    }
}
