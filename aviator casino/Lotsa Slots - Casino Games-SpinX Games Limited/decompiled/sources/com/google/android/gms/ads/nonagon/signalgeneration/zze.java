package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.internal.ads.zzbqm {
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zza;
    private final java.util.concurrent.Executor zzb;
    private final java.lang.Object zzc = new java.lang.Object();
    private java.util.concurrent.Future zzd;
    private android.webkit.WebViewClient zze;
    private android.webkit.WebView zzf;

    public zze(android.webkit.WebView webView, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zzf = webView;
        this.zza = zzaVar;
        this.zzb = zzhcgVar;
    }

    private final void zzd() {
        synchronized (this.zzc) {
            android.webkit.WebView webView = this.zzf;
            if (webView == null) {
                return;
            }
            webView.evaluateJavascript(java.lang.String.format(java.util.Locale.getDefault(), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzli), this.zza.zzb()), null);
        }
    }

    private final boolean zze() {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zza.zze()).booleanValue()) {
            return false;
        }
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(java.lang.Thread.currentThread())) {
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (java.lang.StackTraceElement stackTraceElement : allStackTraces.get(java.lang.Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(getClass().getName())) {
                if (z && z2) {
                    return true;
                }
                z = true;
            } else if (z) {
                z2 = true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z) {
        if (zze()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    protected final android.webkit.WebViewClient getDelegate() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onFormResubmission(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        if (zze()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        if (zze()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        if (zze()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        if (zze()) {
            return;
        }
        zzd();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (zze()) {
            return;
        }
        zzd();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        if (zze()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        if (zze()) {
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        if (zze()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        if (zze()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (zze()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        if (zze()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!zze()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        synchronized (this.zzc) {
            android.webkit.WebView webView2 = this.zzf;
            if (webView2 != null) {
                webView2.setWebViewClient(new android.webkit.WebViewClient());
                this.zzf = null;
            }
        }
        java.util.concurrent.Future future = this.zzd;
        if (future == null) {
            return true;
        }
        future.cancel(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i, android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        if (zze()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
        if (zze()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onTooManyRedirects(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        if (zze()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        if (zze()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (zze()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        if (zze()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (zze()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.zzd = com.google.android.gms.internal.ads.zzcfr.zzd.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.zze.this.zzb();
            }
        }, 0L, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlh)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public final void zzb() {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.zze.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        android.webkit.WebViewClient webViewClient;
        synchronized (this.zzc) {
            android.webkit.WebView webView = this.zzf;
            if (webView == null) {
                return;
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (android.os.Build.VERSION.SDK_INT < 26) {
                    if (androidx.webkit.WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT")) {
                        try {
                            webViewClient = androidx.webkit.WebViewCompat.getWebViewClient(webView);
                        } catch (java.lang.RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getWebViewClient");
                        }
                    }
                    throw new java.lang.IllegalStateException("getWebViewClient not supported");
                }
                webViewClient = webView.getWebViewClient();
                if (webViewClient == this) {
                    return;
                }
                if (webViewClient != null) {
                    this.zze = webViewClient;
                }
                webView.setWebViewClient(this);
                zzd();
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        if (zze()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        if (zze()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqm, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (zze()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
