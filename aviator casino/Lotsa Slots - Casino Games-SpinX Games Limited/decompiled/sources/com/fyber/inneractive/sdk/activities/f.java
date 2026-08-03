package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class f extends android.webkit.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3523a;

    public f(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3523a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        this.f3523a.setTitle("Page is Loading...");
        this.f3523a.setProgress(i * 100);
        if (i == 100) {
            this.f3523a.setTitle(webView.getUrl());
        }
    }
}
