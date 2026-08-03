package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.flow.nativead.c, com.fyber.inneractive.sdk.flow.nativead.s {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f3714a;
    public final com.fyber.inneractive.sdk.flow.nativead.e b;
    public final java.util.List d;
    public java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList e = new java.util.ArrayList();
    public final java.util.ArrayList f = new java.util.ArrayList();
    public com.fyber.inneractive.sdk.flow.nativead.b g = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    public h(java.util.ArrayList arrayList, com.fyber.inneractive.sdk.flow.nativead.e eVar) {
        this.d = arrayList;
        this.b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.g == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        java.lang.String str;
        if (this.d.isEmpty()) {
            this.g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            c();
            return;
        }
        java.util.Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
            if (fVar == null || (cVar = fVar.d) == null || (str = cVar.f4255a) == null || str.trim().isEmpty()) {
                com.fyber.inneractive.sdk.util.IAlog.f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(fVar.f4258a), fVar.d);
                this.e.add(fVar);
            } else {
                java.util.ArrayList arrayList = this.c;
                if (arrayList != null) {
                    arrayList.add(new com.fyber.inneractive.sdk.network.u0(new com.fyber.inneractive.sdk.flow.nativead.t(fVar, this), com.fyber.inneractive.sdk.config.IAConfigManager.N.u.f3614a, new com.fyber.inneractive.sdk.cache.d(fVar.d.f4255a)));
                }
            }
        }
        java.util.ArrayList arrayList2 = this.c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            c();
            return;
        }
        this.g = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
        this.f3714a = new java.util.concurrent.CountDownLatch(this.c.size());
        java.util.Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a((com.fyber.inneractive.sdk.network.u0) it2.next());
        }
    }

    public final void c() {
        com.fyber.inneractive.sdk.flow.nativead.e eVar = this.b;
        if (eVar != null) {
            java.util.ArrayList arrayList = this.f;
            java.util.ArrayList<com.fyber.inneractive.sdk.response.nativead.f> arrayList2 = this.e;
            if (!arrayList.isEmpty()) {
                eVar.f3711a.d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (com.fyber.inneractive.sdk.response.nativead.f fVar : arrayList2) {
                    com.fyber.inneractive.sdk.util.IAlog.f("%sFailed to load image asset. id: %s, imageObj: %s", com.fyber.inneractive.sdk.flow.nativead.f.m, java.lang.Integer.valueOf(fVar.f4258a), fVar.d);
                }
            }
            eVar.f3711a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        java.util.ArrayList arrayList = this.c;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.network.u0) it.next()).f3857a = true;
            }
            this.c.clear();
        }
        this.c = null;
        this.g = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(com.fyber.inneractive.sdk.flow.nativead.g gVar, java.lang.Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) {
        if (gVar != null) {
            this.f.add(gVar);
        } else {
            this.e.add(fVar);
        }
        java.util.concurrent.CountDownLatch countDownLatch = this.f3714a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f3714a.getCount() == 0) {
            this.g = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
            c();
        }
    }
}
