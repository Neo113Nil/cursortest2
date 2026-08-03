package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {
    public static final java.lang.String m = com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.flow.nativead.f.class);
    public static final java.lang.Object n = new java.lang.Object();
    public final com.fyber.inneractive.sdk.response.nativead.i c;
    public com.fyber.inneractive.sdk.flow.t0 e;
    public com.fyber.inneractive.sdk.flow.nativead.d f;
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest h;
    public final com.fyber.inneractive.sdk.config.global.r i;
    public final java.lang.String j;
    public final com.fyber.inneractive.sdk.response.nativead.j k;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f3712a = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final com.fyber.inneractive.sdk.flow.nativead.e l = new com.fyber.inneractive.sdk.flow.nativead.e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, com.fyber.inneractive.sdk.flow.nativead.d dVar, java.lang.String str) {
        this.i = rVar;
        this.k = jVar;
        this.h = inneractiveAdRequest;
        this.c = iVar;
        this.f = dVar;
        this.j = str;
    }

    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError, java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.f("%sonMainAssetLoadFailed: %s", m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        java.util.Iterator it = this.f3712a.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.flow.nativead.c cVar = (com.fyber.inneractive.sdk.flow.nativead.c) it.next();
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        java.lang.String description = inneractiveInfrastructureError.description();
        if (this.g.compareAndSet(false, true)) {
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError2 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(description));
            com.fyber.inneractive.sdk.flow.nativead.d dVar = this.f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.b, dVar.f3705a, "send_failed_native_creatives", dVar.g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        com.fyber.inneractive.sdk.config.s0 a2;
        java.util.Iterator it;
        com.fyber.inneractive.sdk.flow.nativead.i iVar;
        java.lang.String str;
        float parseFloat;
        java.lang.String b;
        java.lang.String b2;
        synchronized (n) {
            try {
                if (!this.f3712a.isEmpty()) {
                    java.util.Iterator it2 = this.f3712a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((com.fyber.inneractive.sdk.flow.nativead.c) it2.next()).a()) {
                                break;
                            }
                        } else if (!this.b.get() && !this.g.get()) {
                            z = false;
                        }
                    }
                }
                z = true;
            } catch (java.lang.Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.c("%s : onResourceFinished", m);
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.h;
        com.fyber.inneractive.sdk.response.nativead.j jVar = this.k;
        if (inneractiveAdRequest != null) {
            a2 = inneractiveAdRequest.getSelectedUnitConfig();
        } else {
            a2 = com.fyber.inneractive.sdk.config.a.a(jVar.m);
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.i;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.fyber.inneractive.sdk.response.nativead.i iVar2 = this.c;
        java.lang.String str2 = com.fyber.inneractive.sdk.flow.nativead.q.f3723a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (com.fyber.inneractive.sdk.flow.nativead.q.a(iVar2.d) && (b2 = com.fyber.inneractive.sdk.flow.nativead.q.b(iVar2.d)) != null) {
            arrayList3.add(b2);
        }
        java.util.ArrayList arrayList4 = iVar2.e;
        if (arrayList4 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.g gVar = (com.fyber.inneractive.sdk.response.nativead.g) it3.next();
                if (gVar != null && gVar.f4259a == 1 && gVar.b == 2) {
                    arrayList5.add(gVar.c);
                }
            }
            java.util.Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                java.lang.String str3 = (java.lang.String) it4.next();
                if (com.fyber.inneractive.sdk.flow.nativead.q.a(str3) && (b = com.fyber.inneractive.sdk.flow.nativead.q.b(str3)) != null) {
                    arrayList3.add(b);
                }
            }
        }
        arrayList2.addAll(arrayList3);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = iVar2.c;
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            arrayList6.addAll(iVar2.c);
        }
        java.util.ArrayList arrayList8 = iVar2.e;
        if (arrayList8 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.util.Iterator it5 = arrayList8.iterator();
            while (it5.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.g gVar2 = (com.fyber.inneractive.sdk.response.nativead.g) it5.next();
                if (gVar2 != null && gVar2.f4259a == 1 && gVar2.b == 1) {
                    arrayList9.add(gVar2.c);
                }
            }
            arrayList6.addAll(arrayList9);
        }
        arrayList.addAll(arrayList6);
        com.fyber.inneractive.sdk.flow.t0 t0Var = this.e;
        java.util.ArrayList arrayList10 = this.d;
        com.fyber.inneractive.sdk.response.nativead.h hVar = this.c.b;
        com.fyber.inneractive.sdk.flow.nativead.i iVar3 = (hVar == null || (android.text.TextUtils.isEmpty(hVar.f4260a) && android.text.TextUtils.isEmpty(hVar.c) && hVar.b.isEmpty())) ? null : new com.fyber.inneractive.sdk.flow.nativead.i(hVar.f4260a, hVar.c, hVar.b);
        if (iVar3 != null) {
            hashMap.put("ROOT", iVar3);
        }
        java.util.Iterator it6 = this.c.f4261a.iterator();
        java.lang.String str4 = null;
        com.fyber.inneractive.sdk.flow.t0 t0Var2 = null;
        java.lang.Float f = null;
        java.lang.Float f2 = null;
        android.net.Uri uri = null;
        android.net.Uri uri2 = null;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        while (it6.hasNext()) {
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it6.next();
            com.fyber.inneractive.sdk.response.nativead.h hVar2 = fVar.f;
            if (hVar2 == null || (android.text.TextUtils.isEmpty(hVar2.f4260a) && android.text.TextUtils.isEmpty(hVar2.c) && hVar2.b.isEmpty())) {
                it = it6;
                iVar = null;
            } else {
                it = it6;
                iVar = new com.fyber.inneractive.sdk.flow.nativead.i(hVar2.f4260a, hVar2.c, hVar2.b);
            }
            com.fyber.inneractive.sdk.response.nativead.d dVar = fVar.b;
            if (dVar != null && !android.text.TextUtils.isEmpty(dVar.f4256a)) {
                java.lang.String str7 = fVar.b.f4256a;
                if (iVar != null) {
                    hashMap.put("TITLE", iVar);
                }
                str6 = str7;
            } else {
                com.fyber.inneractive.sdk.response.nativead.b bVar = fVar.e;
                if (bVar != null && !android.text.TextUtils.isEmpty(bVar.f4254a)) {
                    java.lang.String str8 = fVar.e.f4254a;
                    int i = fVar.f4258a;
                    if (i == 5) {
                        str = "DESCRIPTION";
                        str5 = str8;
                    } else if (i != 6) {
                        if (i == 7) {
                            str = com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA;
                            str4 = str8;
                        }
                        str = null;
                    } else {
                        if (!android.text.TextUtils.isEmpty(str8)) {
                            try {
                                parseFloat = java.lang.Float.parseFloat(str8);
                            } catch (java.lang.NumberFormatException unused) {
                            }
                            if (parseFloat >= 0.0f) {
                                f2 = java.lang.Float.valueOf(parseFloat);
                                str = com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.RATING;
                            }
                            str = null;
                        }
                        parseFloat = -1.0f;
                        if (parseFloat >= 0.0f) {
                        }
                        str = null;
                    }
                    if (!android.text.TextUtils.isEmpty(str)) {
                        hashMap.put(str, iVar);
                    }
                } else {
                    java.util.Iterator it7 = arrayList10.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            com.fyber.inneractive.sdk.flow.nativead.g gVar3 = (com.fyber.inneractive.sdk.flow.nativead.g) it7.next();
                            if (gVar3 != null) {
                                int i2 = gVar3.f3713a;
                                java.util.Iterator it8 = it7;
                                if (i2 == fVar.f4258a) {
                                    if (i2 == 2) {
                                        android.net.Uri uri3 = gVar3.b;
                                        f = com.fyber.inneractive.sdk.util.u.a(uri3);
                                        if (iVar != null) {
                                            hashMap.put(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                        }
                                        uri = uri3;
                                    } else if (i2 == 4) {
                                        android.net.Uri uri4 = gVar3.b;
                                        if (iVar != null) {
                                            hashMap.put(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.AD_ICON, iVar);
                                        }
                                        uri2 = uri4;
                                    }
                                }
                                it7 = it8;
                            }
                        } else {
                            com.fyber.inneractive.sdk.response.nativead.e eVar = fVar.c;
                            if (eVar == null || android.text.TextUtils.isEmpty(eVar.f4257a) || t0Var == null) {
                                com.fyber.inneractive.sdk.util.IAlog.c("%s : handleAsset failed: %d: ", m, java.lang.Integer.valueOf(fVar.f4258a));
                            } else {
                                if (iVar != null) {
                                    hashMap.put(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                }
                                t0Var2 = t0Var;
                            }
                        }
                    }
                }
            }
            it6 = it;
        }
        com.fyber.inneractive.sdk.flow.w0 w0Var = new com.fyber.inneractive.sdk.flow.w0(a2, rVar);
        w0Var.g = str6;
        w0Var.h = str5;
        w0Var.i = str4;
        w0Var.j = null;
        w0Var.k = null;
        w0Var.l = uri2;
        w0Var.m = uri;
        w0Var.o = f2;
        w0Var.p = f;
        w0Var.s = t0Var2;
        w0Var.t.putAll(hashMap);
        w0Var.u = new com.fyber.inneractive.sdk.flow.nativead.j((com.fyber.inneractive.sdk.flow.nativead.i) hashMap.get("ROOT"));
        w0Var.w.addAll(arrayList);
        w0Var.x.addAll(arrayList2);
        hashMap.clear();
        this.b.set(true);
        w0Var.b = this.k;
        com.fyber.inneractive.sdk.flow.nativead.d dVar2 = this.f;
        dVar2.c = w0Var;
        dVar2.f();
    }
}
