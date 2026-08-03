package com.fyber.inneractive.sdk.web.remoteui;

/* loaded from: classes3.dex */
public final class c extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f4354a;
    public com.fyber.inneractive.sdk.player.ui.remote.a b;

    public c(com.fyber.inneractive.sdk.web.remoteui.a aVar, com.fyber.inneractive.sdk.player.ui.remote.a aVar2) {
        this.f4354a = aVar;
        this.b = aVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.fyber.inneractive.sdk.util.IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "RemoteUiWebViewClient", str, java.lang.Integer.valueOf(i), str2);
        java.lang.String str3 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!com.fyber.inneractive.sdk.util.h0.e(str2)) {
            str2 = null;
        }
        a(bVar, str3, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        int i;
        java.lang.String str;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            i = webResourceResponse != null ? webResourceResponse.getStatusCode() : -1;
            str = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onReceivedHttpError: errorCode: %d, failing url: %s", "RemoteUiWebViewClient", java.lang.Integer.valueOf(i), str);
        } else {
            i = -999;
            str = "unknown";
        }
        a(com.fyber.inneractive.sdk.network.events.b.HTTP_ERROR, java.lang.String.valueOf(i), str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        java.lang.String url = sslError != null ? sslError.getUrl() : "";
        com.fyber.inneractive.sdk.util.IAlog.a("%s: onReceivedSslError: failing url: %s", "RemoteUiWebViewClient", url);
        a(com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, null, url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "RemoteUiWebViewClient", str);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse != null && !android.text.TextUtils.isEmpty(parse.getScheme()) && !android.text.TextUtils.isEmpty(parse.getAuthority()) && !android.text.TextUtils.isEmpty(parse.getHost())) {
            java.util.Locale locale = java.util.Locale.US;
            if ("FyRemote://".toLowerCase(locale).contains(parse.getScheme().toLowerCase(locale))) {
                java.util.HashMap a2 = com.fyber.inneractive.sdk.util.h0.a(parse);
                java.lang.String host = parse.getHost();
                com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.b;
                if (aVar != null) {
                    aVar.a(host, a2);
                }
            }
        }
        return true;
    }

    public final void a(java.lang.String str, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        java.lang.String str2;
        str2 = "unknown";
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            str2 = renderProcessGoneDetail != null ? java.lang.String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "RemoteUiWebViewClient", str2, str);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onRenderProcessGone: handled, view: %s", "RemoteUiWebViewClient", str);
        }
        a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Webview did crash: " + str2 + " on webview: " + str, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        java.lang.String str;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        str = "";
        java.lang.String str2 = "unknown";
        int i = -999;
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (webResourceError != null) {
                str = webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "";
                i = webResourceError.getErrorCode();
            }
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                str2 = webResourceRequest.getUrl().toString();
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "RemoteUiWebViewClient", str, java.lang.Integer.valueOf(i), str2);
        }
        java.lang.String str3 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!com.fyber.inneractive.sdk.util.h0.e(str2)) {
            str2 = null;
        }
        a(bVar, str3, str2);
    }

    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap;
        if (this.f4354a != null) {
            if (android.text.TextUtils.isEmpty(str2)) {
                hashMap = null;
            } else {
                java.util.HashMap hashMap2 = new java.util.HashMap(1);
                hashMap2.put("failedURL", str2);
                hashMap = hashMap2;
            }
            this.f4354a.a(bVar, str, true, hashMap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.net.Uri url = webResourceRequest.getUrl();
        java.lang.String uri = url != null ? url.toString() : "unknown";
        if (url != null && !android.text.TextUtils.isEmpty(url.getScheme()) && !android.text.TextUtils.isEmpty(url.getAuthority()) && !android.text.TextUtils.isEmpty(url.getHost())) {
            java.util.Locale locale = java.util.Locale.US;
            if ("FyRemote://".toLowerCase(locale).contains(url.getScheme().toLowerCase(locale))) {
                java.util.HashMap a2 = com.fyber.inneractive.sdk.util.h0.a(url);
                java.lang.String host = url.getHost();
                com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.b;
                if (aVar != null) {
                    aVar.a(host, a2);
                }
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "RemoteUiWebViewClient", uri);
        return true;
    }
}
