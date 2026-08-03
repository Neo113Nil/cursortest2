package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {
    public final java.lang.String m = "Native";
    public com.fyber.inneractive.sdk.flow.nativead.f n;

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        com.fyber.inneractive.sdk.flow.x xVar = this.c;
        if (xVar != null) {
            ((com.fyber.inneractive.sdk.flow.w0) xVar).destroy();
        }
        com.fyber.inneractive.sdk.flow.nativead.f fVar = this.n;
        if (fVar != null) {
            fVar.d.clear();
            fVar.f = null;
            java.util.Iterator it = fVar.f3712a.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.flow.nativead.c) it.next()).destroy();
            }
            fVar.f3712a.clear();
            this.n = null;
        }
        this.k.a();
        com.fyber.inneractive.sdk.util.IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.l);
        this.f3705a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final java.lang.String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).Q.K == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.g;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.f3705a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.b;
        com.fyber.inneractive.sdk.flow.nativead.f fVar = new com.fyber.inneractive.sdk.flow.nativead.f(rVar, inneractiveAdRequest, jVar, jVar.Q.K, this, this.m);
        this.n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d a2 = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.i, fVar.k, fVar.h, fVar.c, fVar.j, fVar);
        if (a2 == null) {
            if (fVar.g.compareAndSet(false, true)) {
                com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                com.fyber.inneractive.sdk.flow.nativead.d dVar = fVar.f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.b, dVar.f3705a, "send_failed_native_creatives", dVar.g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.f3712a.add(a2);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = fVar.f3712a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = fVar.c.f4261a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            java.util.Iterator it = fVar.c.f4261a.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.f fVar2 = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
                if (fVar2 != null && fVar2.f4258a != 2 && fVar2.d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new com.fyber.inneractive.sdk.flow.nativead.h(arrayList, fVar.l));
        java.util.Iterator it2 = fVar.f3712a.iterator();
        while (it2.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.nativead.c) it2.next()).b();
        }
    }
}
