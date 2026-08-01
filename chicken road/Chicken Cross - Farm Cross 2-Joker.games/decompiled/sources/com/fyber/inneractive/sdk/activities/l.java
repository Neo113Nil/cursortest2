package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f5178a;

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f5178a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f5178a.e;
        if (webView != null) {
            webView.reload();
            int i = IAlog.f5940a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f5178a.e.getUrl());
        }
    }
}
