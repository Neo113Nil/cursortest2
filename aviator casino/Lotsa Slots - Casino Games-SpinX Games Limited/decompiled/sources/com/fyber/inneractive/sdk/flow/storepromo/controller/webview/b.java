package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

/* loaded from: classes3.dex */
public final class b extends android.webkit.WebViewClient {
    public static final java.lang.String[] c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a f3735a;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a b;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.f3735a = aVar;
        this.b = aVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.fyber.inneractive.sdk.util.IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, java.lang.Integer.valueOf(i), str2);
        if (a(str2)) {
            return;
        }
        java.lang.String str3 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!com.fyber.inneractive.sdk.util.h0.e(str2)) {
            str2 = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, str2);
        }
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
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", str);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse != null && !android.text.TextUtils.isEmpty(parse.getScheme()) && !android.text.TextUtils.isEmpty(parse.getAuthority()) && !android.text.TextUtils.isEmpty(parse.getHost()) && "FyRemote://".toLowerCase().contains(parse.getScheme())) {
            java.util.HashMap a2 = com.fyber.inneractive.sdk.util.h0.a(parse);
            java.lang.String host = parse.getHost();
            com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.f3735a;
            if (aVar != null) {
                aVar.a(host, a2);
            }
        }
        return true;
    }

    public final void a(java.lang.String str, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        java.lang.String str2;
        str2 = "unknown";
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            str2 = renderProcessGoneDetail != null ? java.lang.String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", str2, str);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        java.lang.String str3 = "Webview did crash: " + str2 + " on webview: " + str;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, null);
        }
    }

    public static boolean a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.s sVar;
        if (str == null || (sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.o oVar = sVar.b;
        java.lang.String[] strArr = c;
        java.lang.String a2 = oVar.a("font_urls", (java.lang.String) null);
        if (a2 != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(a2);
                java.lang.String[] strArr2 = new java.lang.String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr2[i] = jSONArray.getString(i);
                }
                strArr = strArr2;
            } catch (org.json.JSONException unused) {
            }
        }
        for (java.lang.String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
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
            com.fyber.inneractive.sdk.util.IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, java.lang.Integer.valueOf(i), str2);
        }
        if (a(str2)) {
            return;
        }
        java.lang.String str3 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!com.fyber.inneractive.sdk.util.h0.e(str2)) {
            str2 = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, str2);
        }
    }
}
