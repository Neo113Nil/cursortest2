package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.web.m {
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b h;

    public a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b bVar) {
        this.h = bVar;
        setWebViewClient(bVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOverScrollMode(2);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b bVar = this.h;
        bVar.f3735a = null;
        bVar.b = null;
        super.destroy();
    }
}
