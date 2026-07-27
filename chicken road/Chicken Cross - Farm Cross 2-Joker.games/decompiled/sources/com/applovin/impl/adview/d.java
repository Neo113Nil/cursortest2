package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.p;

/* loaded from: classes5.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4132a;
    private final WebViewRenderProcessClient b = new a();

    class a extends WebViewRenderProcessClient {
        a() {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f4132a.Q();
                if (p.a()) {
                    d.this.f4132a.Q().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(com.applovin.impl.sdk.l lVar) {
        this.f4132a = lVar;
    }

    WebViewRenderProcessClient a() {
        return this.b;
    }
}
