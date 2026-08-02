package com.instagram.common.viewpoint.core;

import android.view.View;
import android.webkit.WebView;

/* loaded from: assets/audience_network.dex */
public class ZE implements View.OnClickListener {
    public final /* synthetic */ ZH A00;

    public ZE(ZH zh) {
        this.A00 = zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
