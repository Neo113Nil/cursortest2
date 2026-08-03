package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3611a = "";
    public final java.util.HashMap b;
    public org.json.JSONArray c;

    public r() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.v.class, new com.fyber.inneractive.sdk.config.global.features.v());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.s.class, new com.fyber.inneractive.sdk.config.global.features.s());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.o.class, new com.fyber.inneractive.sdk.config.global.features.o());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.h.class, new com.fyber.inneractive.sdk.config.global.features.h());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        this.b = hashMap;
        this.c = null;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((java.lang.Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.i) entry.getValue()).b());
        }
        this.b = hashMap2;
        com.fyber.inneractive.sdk.util.IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", hashMap2);
    }

    public static com.fyber.inneractive.sdk.config.global.r a() {
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z = false;
        if (!android.text.TextUtils.isEmpty(property)) {
            try {
                com.fyber.inneractive.sdk.config.IAConfigManager.N.y.f3599a = com.fyber.inneractive.sdk.config.global.l.a(new org.json.JSONObject(property));
                z = true;
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed parsing local features json", new java.lang.Object[0]);
            }
        }
        com.fyber.inneractive.sdk.config.global.r rVar = new com.fyber.inneractive.sdk.config.global.r();
        if (z) {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            iAConfigManager.L.a(true, "");
            iAConfigManager.D.a(iAConfigManager.L);
        }
        return rVar;
    }

    public final org.json.JSONArray b() {
        org.json.JSONArray jSONArray = this.c;
        if (jSONArray == null || jSONArray.length() == 0) {
            org.json.JSONArray a2 = com.fyber.inneractive.sdk.config.global.g.a(this.b, false);
            this.c = a2;
            com.fyber.inneractive.sdk.util.IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a2);
        }
        return this.c;
    }

    public final void a(com.fyber.inneractive.sdk.config.global.e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            iVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(iVar.c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                com.fyber.inneractive.sdk.config.global.b bVar = (com.fyber.inneractive.sdk.config.global.b) arrayList.get(size);
                java.util.ArrayList arrayList2 = bVar.d;
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.fyber.inneractive.sdk.config.global.d dVar = (com.fyber.inneractive.sdk.config.global.d) it.next();
                        if (dVar.a(eVar)) {
                            iVar.c.remove(bVar.f3600a);
                            iVar.d.remove(bVar.f3600a);
                            this.c = null;
                            com.fyber.inneractive.sdk.util.IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f3600a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.i a(java.lang.Class cls) {
        if (this.b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) this.b.get(cls);
            if (cls.isInstance(iVar)) {
                return iVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.i) cls.getConstructor(null).newInstance(null);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    public final void a(boolean z, java.lang.String str) {
        char c;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.util.w wVar;
        com.fyber.inneractive.sdk.config.global.e eVar;
        this.f3611a = str;
        com.fyber.inneractive.sdk.config.global.a aVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.y;
        aVar.b = this;
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            boolean z2 = iVar instanceof com.fyber.inneractive.sdk.config.global.features.p;
            if ((z2 && z) || (!z2 && !z)) {
                com.fyber.inneractive.sdk.config.global.l lVar = aVar.f3599a;
                if (iVar != null && lVar != null) {
                    com.fyber.inneractive.sdk.config.global.q qVar = (com.fyber.inneractive.sdk.config.global.q) lVar.f3608a.get(iVar.b);
                    char c2 = 2;
                    int i = 1;
                    if (qVar != null) {
                        iVar.f3610a = qVar.f3610a;
                        com.fyber.inneractive.sdk.util.IAlog.a("%s: Feature before variant merge: %s", "a", iVar);
                        java.util.HashMap hashMap = qVar.c;
                        java.util.Iterator it = hashMap.keySet().iterator();
                        while (it.hasNext()) {
                            com.fyber.inneractive.sdk.config.global.b bVar = (com.fyber.inneractive.sdk.config.global.b) hashMap.get((java.lang.String) it.next());
                            if (bVar != null) {
                                int nextInt = new java.util.Random().nextInt(100) + i;
                                if (bVar.b < nextInt) {
                                    java.lang.String str2 = bVar.f3600a;
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(nextInt);
                                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(bVar.b);
                                    java.lang.Object[] objArr = new java.lang.Object[4];
                                    objArr[0] = "a";
                                    objArr[i] = str2;
                                    objArr[c2] = valueOf;
                                    objArr[3] = valueOf2;
                                    com.fyber.inneractive.sdk.util.IAlog.a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", objArr);
                                } else {
                                    java.util.ArrayList arrayList = bVar.d;
                                    if (arrayList != null) {
                                        java.util.Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            com.fyber.inneractive.sdk.config.global.d dVar = (com.fyber.inneractive.sdk.config.global.d) it2.next();
                                            try {
                                                java.lang.Long valueOf3 = java.lang.Long.valueOf(com.fyber.inneractive.sdk.config.IAConfigManager.N.d);
                                                eVar = new com.fyber.inneractive.sdk.config.global.e();
                                                eVar.b = valueOf3;
                                                eVar.c = com.fyber.inneractive.sdk.serverapi.b.a(aVar.b.f3611a);
                                            } catch (java.lang.NumberFormatException unused) {
                                                com.fyber.inneractive.sdk.util.IAlog.a("%s: invalid publisherId", "a");
                                            }
                                            if (dVar.a(eVar)) {
                                                com.fyber.inneractive.sdk.util.IAlog.a("%s: Experiment '%s' filtered! with %s", "a", bVar.f3600a, dVar);
                                                break;
                                            }
                                        }
                                    }
                                    if (iVar instanceof com.fyber.inneractive.sdk.config.global.features.v) {
                                        java.util.Iterator it3 = bVar.c.iterator();
                                        while (it3.hasNext()) {
                                            com.fyber.inneractive.sdk.config.global.k kVar2 = (com.fyber.inneractive.sdk.config.global.k) it3.next();
                                            com.fyber.inneractive.sdk.config.global.n nVar = kVar2.f3610a;
                                            if (nVar != null && nVar.a() != null && kVar2.f3610a.a().containsKey("use_fmp_cache_mechanism") && ((wVar = (com.fyber.inneractive.sdk.util.w) com.fyber.inneractive.sdk.config.IAConfigManager.N.G.get(com.fyber.inneractive.sdk.util.x.Video)) == null || !wVar.a())) {
                                                break;
                                            }
                                        }
                                    }
                                    com.fyber.inneractive.sdk.util.IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.f3600a, java.lang.Integer.valueOf(nextInt), java.lang.Integer.valueOf(bVar.b));
                                    java.util.ArrayList arrayList2 = bVar.c;
                                    int nextInt2 = new java.util.Random().nextInt(100) + 1;
                                    int i2 = 2;
                                    com.fyber.inneractive.sdk.util.IAlog.a("%s: selectVariant for experiment '%s' generated random number: %d", "a", bVar.f3600a, java.lang.Integer.valueOf(nextInt2));
                                    java.util.Iterator it4 = arrayList2.iterator();
                                    int i3 = 0;
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            c = 1;
                                            kVar = null;
                                            break;
                                        }
                                        kVar = (com.fyber.inneractive.sdk.config.global.k) it4.next();
                                        i3 += kVar.c;
                                        java.lang.Object[] objArr2 = new java.lang.Object[i2];
                                        objArr2[0] = "a";
                                        c = 1;
                                        objArr2[1] = kVar;
                                        com.fyber.inneractive.sdk.util.IAlog.a("%s: selectVariant variant found: %s", objArr2);
                                        if (i3 >= nextInt2) {
                                            break;
                                        }
                                        java.lang.String str3 = kVar.b;
                                        java.lang.Object[] objArr3 = new java.lang.Object[i2];
                                        objArr3[0] = "a";
                                        objArr3[1] = str3;
                                        com.fyber.inneractive.sdk.util.IAlog.a("%s: selectVariant variant '%s' percentage outside selected range", objArr3);
                                        i2 = 2;
                                    }
                                    if (kVar != null) {
                                        java.lang.String str4 = bVar.f3600a;
                                        java.lang.Object[] objArr4 = new java.lang.Object[3];
                                        objArr4[0] = "a";
                                        objArr4[c] = str4;
                                        objArr4[2] = kVar;
                                        com.fyber.inneractive.sdk.util.IAlog.a("%s: experiment '%s' variant selected! %s", objArr4);
                                    } else {
                                        java.lang.String str5 = bVar.f3600a;
                                        java.lang.Object[] objArr5 = new java.lang.Object[2];
                                        objArr5[0] = "a";
                                        objArr5[c] = str5;
                                        com.fyber.inneractive.sdk.util.IAlog.a("%s: experiment '%s' no variant was selected! using control group", objArr5);
                                    }
                                    iVar.c.put(bVar.f3600a, bVar);
                                    if (kVar != null) {
                                        iVar.d.put(bVar.f3600a, kVar);
                                    }
                                }
                                c2 = 2;
                                i = 1;
                            }
                        }
                    }
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: Feature after variant merge: %s", "a", iVar);
                }
            }
        }
    }
}
