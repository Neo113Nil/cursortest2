package com.fyber.inneractive.sdk.flow.storepromo.controller;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.flow.storepromo.loader.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b f3734a;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a b;
    public com.fyber.inneractive.sdk.flow.storepromo.loader.f d;
    public com.fyber.inneractive.sdk.flow.storepromo.loader.a f;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b g;
    public boolean e = false;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);

    public c(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar) {
        this.f = aVar;
        this.g = bVar;
        this.f3734a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, aVar);
        this.d = new com.fyber.inneractive.sdk.flow.storepromo.loader.f(cVar, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(java.util.HashMap hashMap) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.b;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(java.lang.String str, java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.b;
        if (aVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("StorePromoWebViewController: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        com.fyber.inneractive.sdk.util.g1 lastClickedLocation = aVar.getLastClickedLocation();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.c;
        if (bVar != null) {
            bVar.a(str, hashMap, lastClickedLocation);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i, com.fyber.inneractive.sdk.util.g1 g1Var) {
        if (i != 0) {
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.g;
            if (bVar != null) {
                com.fyber.inneractive.sdk.flow.storepromo.controller.a aVar = com.fyber.inneractive.sdk.flow.storepromo.controller.a.INSTALL;
                com.fyber.inneractive.sdk.util.IAlog.a("StorePromoView: onClick: type: " + aVar, new java.lang.Object[0]);
                if (aVar == com.fyber.inneractive.sdk.flow.storepromo.controller.a.CLOSE) {
                    bVar.a();
                    return;
                }
                com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2 = bVar.e;
                if (bVar2 != null) {
                    bVar2.a(g1Var);
                    return;
                }
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = this.g;
        if (bVar3 != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("StorePromoView: onClick: type: " + com.fyber.inneractive.sdk.flow.storepromo.controller.a.CLOSE, new java.lang.Object[0]);
            bVar3.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        com.fyber.inneractive.sdk.util.IAlog.a("StorePromoWebViewController: onContentLoadedSuccess: content is loaded successfully", new java.lang.Object[0]);
        this.e = true;
        this.b = aVar;
        aVar.setWebViewClient(this.f3734a);
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a(this.b, cVar);
            this.f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, java.lang.String str2) {
        this.e = false;
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar = this.f;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
            this.f = null;
        }
    }
}
