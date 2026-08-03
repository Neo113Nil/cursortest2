package com.fyber.inneractive.sdk.flow.storepromo.controller;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest f3733a;
    public final com.fyber.inneractive.sdk.response.e b;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.c c;
    public com.fyber.inneractive.sdk.flow.storepromo.ui.c d;
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b e;
    public com.fyber.inneractive.sdk.flow.storepromo.b f;
    public boolean g = false;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a h;
    public com.fyber.inneractive.sdk.flow.endcard.k i;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar, com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        this.h = aVar;
        this.c = new com.fyber.inneractive.sdk.flow.storepromo.controller.c(cVar, this, this);
        this.f = bVar;
        this.f3733a = inneractiveAdRequest;
        this.b = eVar;
        this.e = bVar2;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = this.d;
        if (cVar != null) {
            if (cVar.b != null && cVar.f3755a != null) {
                cVar.d.setAnimationListener(cVar.i);
                cVar.f3755a.setAnimation(cVar.d);
                cVar.f3755a.setVisibility(8);
            }
            com.fyber.inneractive.sdk.flow.endcard.k kVar = this.i;
            if (kVar == null || kVar.b.a() == null || kVar.b.a().f().b() == null) {
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sonStorePromoDismissed restoring endcard focus", com.fyber.inneractive.sdk.util.IAlog.a(kVar));
            kVar.b.a().f().b().requestFocus();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        this.d = new com.fyber.inneractive.sdk.flow.storepromo.ui.c(com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a(), aVar, this.f);
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_LOADED;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.f3733a;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        java.lang.String str = cVar.h;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
        com.fyber.inneractive.sdk.util.IAlog.a("StorePromoController: onContentLoadedSuccess", new java.lang.Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, java.lang.String str2) {
        this.g = true;
        a();
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.h;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
        }
    }
}
