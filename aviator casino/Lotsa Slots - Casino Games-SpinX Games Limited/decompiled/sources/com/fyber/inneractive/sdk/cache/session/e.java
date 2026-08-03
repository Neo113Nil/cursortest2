package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.cache.session.i f3564a = new com.fyber.inneractive.sdk.cache.session.i();
    public final java.lang.Object c = new java.lang.Object();
    public final java.lang.Object d = new java.lang.Object();
    public final com.fyber.inneractive.sdk.cache.session.a b = new com.fyber.inneractive.sdk.cache.session.a();

    public static org.json.JSONObject a(com.fyber.inneractive.sdk.cache.session.e eVar) {
        eVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("currentSession", eVar.f3564a.a());
            for (java.util.Map.Entry entry : eVar.b.entrySet()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                com.fyber.inneractive.sdk.cache.session.enums.c cVar = (com.fyber.inneractive.sdk.cache.session.enums.c) entry.getKey();
                java.util.Iterator it = ((java.util.PriorityQueue) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((com.fyber.inneractive.sdk.cache.session.g) it.next()).a(true, true));
                }
                jSONObject.put(cVar.name(), jSONArray);
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public final void a(com.fyber.inneractive.sdk.cache.session.enums.c cVar, com.fyber.inneractive.sdk.cache.session.g gVar) {
        synchronized (this.d) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) this.b.get(cVar);
            if (kVar != null) {
                kVar.add(gVar);
            }
        }
    }
}
