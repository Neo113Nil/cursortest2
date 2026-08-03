package com.fyber.inneractive.sdk.flow.storepromo;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.b, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a {
    public static final java.lang.Object k = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.loader.g f3732a;
    public final com.fyber.inneractive.sdk.response.e b;
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest c;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b d;
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b e;
    public final java.lang.String f;
    public int g = 0;
    public final java.util.concurrent.CopyOnWriteArrayList h = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean i = false;
    public com.fyber.inneractive.sdk.flow.storepromo.a j = new com.fyber.inneractive.sdk.flow.storepromo.a();

    public b(com.fyber.inneractive.sdk.model.vast.v vVar, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        this.f3732a = new com.fyber.inneractive.sdk.flow.storepromo.loader.g(vVar, this);
        this.f = vVar.c;
        this.b = eVar;
        this.c = inneractiveAdRequest;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.d;
        if (bVar != null) {
            com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = bVar.d;
            if (cVar != null) {
                if (cVar.b != null && cVar.f3755a != null) {
                    cVar.d.setAnimationListener(cVar.i);
                    cVar.f3755a.setAnimation(cVar.d);
                    cVar.f3755a.setVisibility(8);
                }
                android.view.View view = cVar.f3755a;
                if (view != null) {
                    view.setAnimation(null);
                    com.fyber.inneractive.sdk.util.v.a(cVar.f3755a);
                }
                android.view.ViewGroup viewGroup = cVar.b;
                if (viewGroup != null) {
                    viewGroup.removeAllViewsInLayout();
                    com.fyber.inneractive.sdk.util.v.a(cVar.b);
                }
                cVar.f3755a = null;
                cVar.b = null;
                com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = cVar.e;
                if (bVar2 != null) {
                    try {
                        com.fyber.inneractive.sdk.util.o.f4302a.unregisterReceiver(bVar2);
                    } catch (java.lang.Exception unused) {
                    }
                    cVar.e.f3754a.clear();
                    cVar.e = null;
                }
                cVar.f = null;
                bVar.d = null;
            }
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar.c;
            if (cVar2 != null) {
                com.fyber.inneractive.sdk.flow.storepromo.loader.f fVar = cVar2.d;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f3740a;
                    if (aVar != null) {
                        com.fyber.inneractive.sdk.util.v.a(aVar);
                        fVar.f3740a.destroy();
                        fVar.f3740a = null;
                    }
                    fVar.e = null;
                    fVar.d = null;
                    fVar.c = null;
                    fVar.f = null;
                    fVar.b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = cVar2.b;
                if (aVar2 != null) {
                    com.fyber.inneractive.sdk.util.v.a(aVar2);
                    cVar2.b.destroy();
                    cVar2.b = null;
                }
                cVar2.f = null;
                cVar2.g = null;
                cVar2.c = null;
                cVar2.d = null;
                bVar.c = null;
            }
            bVar.i = null;
            bVar.e = null;
            bVar.f = null;
            bVar.h = null;
            this.d = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar;
        android.view.View view;
        this.i = true;
        com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar = this.e;
        if (bVar != null) {
            bVar.a(g1Var);
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = this.d;
        com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.d) == null || cVar.b == null || (view = cVar.f3755a) == null || view.getParent() == null || cVar.b.getVisibility() != 0) ? false : true, this.i);
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, java.lang.String str2) {
        a(bVar.name(), str, str2);
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.fyber.inneractive.sdk.util.IAlog.b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.j != null) {
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.c;
            com.fyber.inneractive.sdk.response.e eVar = this.b;
            java.util.HashMap hashMap = new java.util.HashMap(1);
            if (!android.text.TextUtils.isEmpty(str2)) {
                hashMap.put("error", str2);
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                hashMap.put("failedURL", str3);
            }
            com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.ERROR_STORE_PROMO_FAILURE, str, (java.lang.String) null, inneractiveAdRequest, eVar, hashMap, (java.lang.Boolean) null);
            this.j = null;
        }
    }
}
