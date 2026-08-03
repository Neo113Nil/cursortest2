package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a f3740a;
    public com.fyber.inneractive.sdk.flow.storepromo.model.c b;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b c;
    public com.fyber.inneractive.sdk.flow.storepromo.loader.a e;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b d = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);
    public com.fyber.inneractive.sdk.flow.storepromo.loader.i f = new com.fyber.inneractive.sdk.flow.storepromo.loader.i();

    public f(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar) {
        this.e = aVar;
        this.c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, this.e);
        try {
            this.f3740a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a(this.c);
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed to create a promo webview", new java.lang.Object[0]);
            this.e.a(com.fyber.inneractive.sdk.network.events.b.NO_WEBVIEW_INSTALLED, th.getLocalizedMessage(), null);
        }
        this.b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = this.f3740a;
        if (aVar2 == null || (cVar = this.b) == null || (aVar = this.e) == null) {
            return;
        }
        aVar.a(aVar2, cVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i, com.fyber.inneractive.sdk.util.g1 g1Var) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f3740a;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(java.util.HashMap hashMap) {
        java.lang.String str = (java.lang.String) hashMap.get("error");
        if (android.text.TextUtils.isEmpty(str)) {
            str = "Unknown error occurred on Store Promo side";
        }
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar = this.e;
        if (aVar != null) {
            aVar.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, str, null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(java.lang.String str, java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f3740a;
        if (aVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("StorePromoContentLoader: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.d;
        if (bVar != null) {
            bVar.a(str, hashMap, aVar.getLastClickedLocation());
        }
    }
}
