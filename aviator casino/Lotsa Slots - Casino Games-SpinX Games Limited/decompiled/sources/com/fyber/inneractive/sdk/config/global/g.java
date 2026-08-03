package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public abstract class g {
    public static org.json.JSONArray a(java.util.Map map, boolean z) {
        com.fyber.inneractive.sdk.config.global.d dVar;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.i iVar : map.values()) {
                iVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList(iVar.c.values());
                java.util.HashMap hashMap = iVar.d;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.config.global.b bVar = (com.fyber.inneractive.sdk.config.global.b) it.next();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str = bVar != null ? bVar.f3600a : null;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        com.fyber.inneractive.sdk.config.global.k kVar = (com.fyber.inneractive.sdk.config.global.k) hashMap.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z) {
                            java.util.Iterator it2 = bVar.d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    dVar = null;
                                    break;
                                }
                                dVar = (com.fyber.inneractive.sdk.config.global.d) it2.next();
                                if (com.fyber.inneractive.sdk.config.global.c.class.equals(dVar.getClass())) {
                                    break;
                                }
                            }
                            if (dVar != null && ((com.fyber.inneractive.sdk.config.global.c) dVar).b) {
                                java.util.HashSet hashSet = ((com.fyber.inneractive.sdk.config.global.c) dVar).f3601a;
                                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                                java.util.Iterator it3 = hashSet.iterator();
                                while (it3.hasNext()) {
                                    jSONArray2.put((java.lang.Long) it3.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (org.json.JSONException e) {
            com.fyber.inneractive.sdk.util.IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new java.lang.Object[0]);
            if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
