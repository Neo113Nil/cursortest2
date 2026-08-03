package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebView f4303a;

    public o0(android.webkit.WebView webView) {
        this.f4303a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4303a.getSettings().setDisplayZoomControls(false);
    }
}
