package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f5961a;

    public o0(WebView webView) {
        this.f5961a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5961a.getSettings().setDisplayZoomControls(false);
    }
}
