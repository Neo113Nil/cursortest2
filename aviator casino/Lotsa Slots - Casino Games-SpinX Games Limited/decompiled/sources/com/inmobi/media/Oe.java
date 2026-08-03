package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Oe implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f4877a;

    public Oe(android.webkit.WebView webView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        this.f4877a = new java.lang.ref.WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.webkit.WebSettings settings;
        android.webkit.WebView webView = (android.webkit.WebView) this.f4877a.get();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
