package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3527a;

    public j(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3527a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.webkit.WebView webView = this.f3527a.e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f3527a.e.goBack();
    }
}
