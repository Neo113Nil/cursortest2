package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3737a;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.storepromo.loader.d b;

    public c(com.fyber.inneractive.sdk.flow.storepromo.loader.d dVar, java.lang.String str) {
        this.b = dVar;
        this.f3737a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.loader.f fVar = this.b.f3738a;
        java.lang.String str = this.f3737a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f3740a;
        if (aVar != null) {
            try {
                aVar.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            } catch (java.lang.Throwable th) {
                if (fVar.e != null) {
                    fVar.e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th.getMessage(), "");
                }
            }
        }
    }
}
