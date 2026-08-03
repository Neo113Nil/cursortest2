package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3529a;

    public l(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3529a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.webkit.WebView webView = this.f3529a.e;
        if (webView != null) {
            webView.reload();
            int i = com.fyber.inneractive.sdk.util.IAlog.f4283a;
            com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f3529a.e.getUrl());
        }
    }
}
