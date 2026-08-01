package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f5177a;

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f5177a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f5177a.e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.f5177a.e.goForward();
    }
}
