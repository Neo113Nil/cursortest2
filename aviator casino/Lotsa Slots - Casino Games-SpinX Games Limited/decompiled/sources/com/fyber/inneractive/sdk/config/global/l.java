package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3608a = new java.util.HashMap();

    public static com.fyber.inneractive.sdk.config.global.l a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.global.l lVar = new com.fyber.inneractive.sdk.config.global.l();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.X3.a.v);
        char c = 0;
        int i = 0;
        while (i < optJSONArray.length()) {
            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            com.fyber.inneractive.sdk.config.global.q qVar = new com.fyber.inneractive.sdk.config.global.q();
            qVar.b = jSONObject2.getString("id");
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.f3610a = new com.fyber.inneractive.sdk.config.global.o(optJSONObject);
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[c] = qVar.b;
                com.fyber.inneractive.sdk.util.IAlog.a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray(com.ironsource.C3369xe.d);
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                    com.fyber.inneractive.sdk.config.global.b bVar = new com.fyber.inneractive.sdk.config.global.b();
                    bVar.f3600a = jSONObject3.getString("id");
                    bVar.b = jSONObject3.optInt("perc", 10);
                    org.json.JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        com.fyber.inneractive.sdk.config.global.k kVar = new com.fyber.inneractive.sdk.config.global.k();
                        kVar.b = jSONObject4.getString("id");
                        kVar.c = jSONObject4.getInt("perc");
                        org.json.JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.f3610a = new com.fyber.inneractive.sdk.config.global.o(optJSONObject2);
                        }
                        bVar.c.add(kVar);
                    }
                    com.fyber.inneractive.sdk.config.global.b.a(bVar, jSONObject3.optJSONObject("include"), true);
                    com.fyber.inneractive.sdk.config.global.b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.c.put(bVar.f3600a, bVar);
                }
            }
            lVar.f3608a.put(qVar.b, qVar);
            i++;
            c = 0;
        }
        return lVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.config.global.l.class != obj.getClass()) {
            return false;
        }
        return this.f3608a.equals(((com.fyber.inneractive.sdk.config.global.l) obj).f3608a);
    }

    public final int hashCode() {
        return this.f3608a.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("remoteConfig - features: %s", this.f3608a.values());
    }
}
