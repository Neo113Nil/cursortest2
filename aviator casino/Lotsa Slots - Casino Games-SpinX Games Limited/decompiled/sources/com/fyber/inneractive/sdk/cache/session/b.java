package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f3561a;
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.c b;

    public b(com.fyber.inneractive.sdk.cache.session.c cVar, org.json.JSONObject jSONObject) {
        this.b = cVar;
        this.f3561a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.session.g gVar;
        com.fyber.inneractive.sdk.cache.session.e eVar = this.b.f3562a;
        org.json.JSONObject jSONObject = this.f3561a;
        eVar.getClass();
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                java.lang.String name = cVar.name();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                try {
                    jSONArray = jSONObject.getJSONArray(name);
                } catch (org.json.JSONException unused) {
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    com.fyber.inneractive.sdk.cache.session.g a2 = com.fyber.inneractive.sdk.cache.session.g.a(jSONArray.optJSONObject(i));
                    if (a2 != null && a2.f3567a != 0) {
                        eVar.a(cVar, a2);
                    }
                }
            }
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("currentSession");
        if (optJSONObject != null) {
            com.fyber.inneractive.sdk.cache.session.h hVar = new com.fyber.inneractive.sdk.cache.session.h();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            try {
                jSONArray2 = optJSONObject.getJSONArray("content");
            } catch (org.json.JSONException unused2) {
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i2);
                } catch (org.json.JSONException unused3) {
                }
                com.fyber.inneractive.sdk.cache.session.enums.c a3 = com.fyber.inneractive.sdk.cache.session.enums.c.a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                com.fyber.inneractive.sdk.cache.session.g a4 = com.fyber.inneractive.sdk.cache.session.g.a(jSONObject2.optJSONObject("session_data"));
                if (a4 != null) {
                    hVar.put(a3, a4);
                }
            }
            for (com.fyber.inneractive.sdk.cache.session.enums.c cVar2 : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                if (cVar2 != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) hVar.get(cVar2)) != null && gVar.f3567a != 0) {
                    eVar.a(cVar2, gVar);
                }
            }
        }
        this.b.f3562a.getClass();
    }
}
