package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzcfk extends zzcfj {
    public zzcfk(zzceb zzcebVar, zzbaw zzbawVar, boolean z4, zzeaq zzeaqVar) {
        super(zzcebVar, zzbawVar, z4, zzeaqVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzW(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
