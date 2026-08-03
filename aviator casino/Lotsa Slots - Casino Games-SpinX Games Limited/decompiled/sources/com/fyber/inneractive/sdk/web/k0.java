package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class k0 extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4341a;
    public final int b;
    public final int c;
    public final int d;
    public com.fyber.inneractive.sdk.web.j e;

    public k0(com.fyber.inneractive.sdk.web.j jVar, boolean z, int i, int i2, int i3) {
        this.e = jVar;
        this.f4341a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        com.fyber.inneractive.sdk.util.IAlog.e("Resources to load: %s", str);
        com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "RESOURCES", str);
        com.fyber.inneractive.sdk.web.j jVar = this.e;
        if (jVar != null) {
            com.fyber.inneractive.sdk.web.i iVar = (com.fyber.inneractive.sdk.web.i) jVar;
            if (android.text.TextUtils.isEmpty(str) || !str.startsWith("http://") || com.fyber.inneractive.sdk.util.s.a()) {
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%s Found a portential unsecure resource url: %s", com.fyber.inneractive.sdk.util.IAlog.a(iVar), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        com.fyber.inneractive.sdk.util.IAlog.e("onPageFinished - url: %s", str);
        com.fyber.inneractive.sdk.web.j jVar = this.e;
        if (jVar != null) {
            jVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.fyber.inneractive.sdk.util.IAlog.e("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.fyber.inneractive.sdk.util.IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        com.fyber.inneractive.sdk.web.j jVar = this.e;
        if (jVar != null) {
            jVar.a();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.net.URL url;
        java.net.HttpURLConnection httpURLConnection;
        if (this.f4341a && webResourceRequest != null) {
            com.fyber.inneractive.sdk.util.IAlog.e("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            com.fyber.inneractive.sdk.web.b1 b1Var = com.fyber.inneractive.sdk.web.b1.c;
            int i = this.b;
            int i2 = this.c;
            int i3 = this.d;
            b1Var.getClass();
            android.webkit.WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP) && android.text.TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                com.fyber.inneractive.sdk.web.c1 c1Var = (com.fyber.inneractive.sdk.web.c1) b1Var.f4326a.get(new com.fyber.inneractive.sdk.web.d1(webResourceRequest));
                if (c1Var != null) {
                    webResourceResponse = new android.webkit.WebResourceResponse(c1Var.c, c1Var.d, c1Var.e, c1Var.f, c1Var.b, new java.io.ByteArrayInputStream(c1Var.f4328a));
                } else {
                    try {
                        url = new java.net.URL(webResourceRequest.getUrl().toString());
                    } catch (java.net.MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.fyber.inneractive.sdk.util.f.b.f4291a.poll();
                        if (byteBuffer == null) {
                            byteBuffer = java.nio.ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                com.fyber.inneractive.sdk.web.b1.a(webResourceRequest, httpURLConnection);
                            } catch (java.lang.Throwable unused2) {
                            }
                        } catch (java.lang.Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            com.fyber.inneractive.sdk.web.c1 c1Var2 = null;
                            while (i3 > 0) {
                                try {
                                    c1Var2 = com.fyber.inneractive.sdk.web.b1.a(httpURLConnection, byteBuffer);
                                } catch (java.net.SocketTimeoutException | java.net.UnknownHostException unused4) {
                                } catch (java.lang.Throwable unused5) {
                                    i3 = 0;
                                }
                                if (c1Var2 != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (c1Var2 != null) {
                                try {
                                    if (c1Var2.a()) {
                                        b1Var.f4326a.put(new com.fyber.inneractive.sdk.web.d1(webResourceRequest), c1Var2);
                                    }
                                    android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(c1Var2.c, c1Var2.d, c1Var2.e, c1Var2.f, c1Var2.b, new java.io.ByteArrayInputStream(c1Var2.f4328a));
                                    httpURLConnection.disconnect();
                                    com.fyber.inneractive.sdk.util.f.b.f4291a.offer(byteBuffer);
                                    webResourceResponse = webResourceResponse2;
                                } catch (java.lang.Throwable unused6) {
                                    httpURLConnection.disconnect();
                                }
                            } else {
                                httpURLConnection.disconnect();
                            }
                            com.fyber.inneractive.sdk.util.f.b.f4291a.offer(byteBuffer);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            com.fyber.inneractive.sdk.util.IAlog.e("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        super.shouldOverrideUrlLoading(webView, str);
        com.fyber.inneractive.sdk.web.j jVar = this.e;
        return jVar != null && jVar.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.e("%sError: code = %d text = %s WebView = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
        com.fyber.inneractive.sdk.web.j jVar = this.e;
        if (jVar != null) {
            jVar.d();
        }
    }
}
