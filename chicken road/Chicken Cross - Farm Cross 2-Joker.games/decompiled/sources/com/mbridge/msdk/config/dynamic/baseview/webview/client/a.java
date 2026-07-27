package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: MBWebChromeClient.java */
/* loaded from: classes6.dex */
public class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final String f9107a = "MBWebChromeClient";
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i);
        }
    }
}
