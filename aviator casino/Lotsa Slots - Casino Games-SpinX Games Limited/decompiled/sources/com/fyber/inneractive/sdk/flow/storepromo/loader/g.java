package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.v f3741a;
    public java.util.concurrent.CountDownLatch b;
    public final com.fyber.inneractive.sdk.flow.storepromo.b c;
    public final com.fyber.inneractive.sdk.flow.storepromo.model.c d;
    public final int f;
    public final java.util.ArrayList e = new java.util.ArrayList();
    public int g = 0;
    public boolean h = false;
    public boolean i = false;

    public g(com.fyber.inneractive.sdk.model.vast.v vVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        this.f3741a = vVar;
        this.f = vVar.f.size();
        this.c = bVar;
        this.d = new com.fyber.inneractive.sdk.flow.storepromo.model.c(vVar);
    }

    public final void a(com.fyber.inneractive.sdk.flow.storepromo.events.a aVar, boolean z, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.flow.storepromo.loader.f fVar;
        this.b.countDown();
        if (this.i) {
            return;
        }
        if (z) {
            this.i = true;
            this.h = true;
            a();
            if (android.text.TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.c;
            if (bVar != null) {
                if (aVar == null) {
                    aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
                }
                bVar.a(aVar.name(), str, str2);
                return;
            }
            return;
        }
        if (this.b.getCount() != 0 || this.h) {
            return;
        }
        this.i = true;
        java.util.Collections.sort(this.d.f3750a);
        this.e.clear();
        com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = this.c;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = this.d;
            com.fyber.inneractive.sdk.util.IAlog.a("StorePromoManager : onPromoLoadSucceed", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.controller.b(cVar, bVar2, bVar2, bVar2, bVar2.b, bVar2.c);
            bVar2.d = bVar3;
            bVar2.g = cVar.i;
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar3.c;
            if (cVar2 == null || (fVar = cVar2.d) == null) {
                return;
            }
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.storepromo.loader.e(fVar, new com.fyber.inneractive.sdk.flow.storepromo.loader.d(fVar)));
        }
    }

    public final void a() {
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.network.t0 t0Var = (com.fyber.inneractive.sdk.network.t0) it.next();
            com.fyber.inneractive.sdk.network.l0 l0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.r;
            java.lang.String str = t0Var.g;
            l0Var.getClass();
            t0Var.c();
        }
        this.e.clear();
    }
}
