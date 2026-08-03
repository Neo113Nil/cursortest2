package com.fyber.inneractive.sdk.measurement.tracker;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.measurement.tracker.e f3790a;

    public c(com.fyber.inneractive.sdk.measurement.tracker.e eVar) {
        this.f3790a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.a("clearing webview", new java.lang.Object[0]);
        android.webkit.WebView webView = this.f3790a.e;
        if (webView != null) {
            webView.destroy();
            this.f3790a.e = null;
        }
    }
}
