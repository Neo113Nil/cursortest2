package com.fyber.inneractive.sdk.web.remoteui;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.web.m implements com.fyber.inneractive.sdk.web.remoteui.a, com.fyber.inneractive.sdk.player.ui.remote.a {
    public com.fyber.inneractive.sdk.web.remoteui.a h;
    public com.fyber.inneractive.sdk.player.ui.remote.a i;
    public boolean j = false;
    public final com.fyber.inneractive.sdk.web.remoteui.c k;

    public b() {
        com.fyber.inneractive.sdk.web.remoteui.c cVar = new com.fyber.inneractive.sdk.web.remoteui.c(this, this);
        this.k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, boolean z, java.util.HashMap hashMap) {
        this.j = false;
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.h;
        if (aVar != null) {
            aVar.a(bVar, str, z, hashMap);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.h = null;
        this.i = null;
        com.fyber.inneractive.sdk.web.remoteui.c cVar = this.k;
        cVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.b = null;
        cVar.f4354a = null;
        super.destroy();
    }

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.i = aVar;
    }

    public void setResultFailureListener(com.fyber.inneractive.sdk.web.remoteui.a aVar) {
        this.h = aVar;
    }

    public void setUiReady(boolean z) {
        this.j = z;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(java.lang.String str, java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.i;
        if (aVar != null) {
            aVar.a(str, hashMap);
        }
    }
}
