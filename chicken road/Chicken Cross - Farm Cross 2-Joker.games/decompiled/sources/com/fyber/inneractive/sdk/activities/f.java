package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class f extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f5172a;

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f5172a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f5172a.setTitle("Page is Loading...");
        this.f5172a.setProgress(i * 100);
        if (i == 100) {
            this.f5172a.setTitle(webView.getUrl());
        }
    }
}
