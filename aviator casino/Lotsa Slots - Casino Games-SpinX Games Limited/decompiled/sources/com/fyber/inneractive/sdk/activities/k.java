package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3528a;

    public k(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3528a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.webkit.WebView webView = this.f3528a.e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.f3528a.e.goForward();
    }
}
