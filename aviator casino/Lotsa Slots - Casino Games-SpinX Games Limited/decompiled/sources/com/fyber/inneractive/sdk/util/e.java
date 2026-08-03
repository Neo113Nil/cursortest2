package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4290a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e b;

    public e(com.fyber.inneractive.sdk.web.e eVar, java.lang.String str) {
        this.b = eVar;
        this.f4290a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.b;
        java.lang.Object obj = this.f4290a;
        eVar.getClass();
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = com.fyber.inneractive.sdk.util.s.a() ? "http://" : "https://";
        if (!android.text.TextUtils.isEmpty(str) && !eVar.f4331a.isTerminated() && !eVar.f4331a.isShutdown()) {
            if (android.text.TextUtils.isEmpty(eVar.k)) {
                eVar.l.p = str2.concat("wv.inner-active.mobi/");
            } else {
                eVar.l.p = str2 + eVar.k;
            }
            if (eVar.f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar = eVar.l;
            com.fyber.inneractive.sdk.web.m mVar = iVar.b;
            if (mVar != null) {
                mVar.loadDataWithBaseURL(iVar.p, str, "text/html", com.ironsource.B5.O, null);
                eVar.l.q = str;
            } else {
                com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar.f;
                if (gVar != null) {
                    gVar.a(iVar, inneractiveInfrastructureError);
                }
                iVar.b(true);
            }
        } else if (!eVar.f4331a.isTerminated() && !eVar.f4331a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.l;
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError2 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar2.f;
            if (gVar2 != null) {
                gVar2.a(iVar2, inneractiveInfrastructureError2);
            }
            iVar2.b(true);
        }
        eVar.f = true;
        eVar.f4331a.shutdownNow();
        android.os.Handler handler = eVar.b;
        if (handler != null) {
            com.fyber.inneractive.sdk.util.d dVar = eVar.d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            com.fyber.inneractive.sdk.util.e eVar2 = eVar.c;
            if (eVar2 != null) {
                eVar.b.removeCallbacks(eVar2);
            }
            eVar.b = null;
        }
        eVar.l.o = null;
    }
}
