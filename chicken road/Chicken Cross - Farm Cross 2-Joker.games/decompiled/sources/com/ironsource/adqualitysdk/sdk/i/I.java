package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes6.dex */
public final class I extends WebViewClient {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ K f117;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f120 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f119 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f118 = null;

    public I(K k) {
        this.f117 = k;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f117.mo5318(webView);
        this.f120 = false;
        this.f119 = true;
        if (this.f118 == null) {
            this.f118 = webView.getOriginalUrl();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f117.mo5318(webView);
        this.f120 = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f117.f126)) {
            this.f118 = webView.getOriginalUrl();
            String substring = str.substring(this.f117.f126.length());
            K k = this.f117;
            k.mo5320(webView, k.f126, substring);
            return true;
        }
        if (this.f118 == null) {
            this.f118 = webView.getOriginalUrl();
        }
        this.f117.mo5321(webView, str, (this.f120 && this.f119) || !(webView.getOriginalUrl() == null || this.f118 == null || webView.getOriginalUrl().equals(this.f118)));
        this.f119 = true;
        this.f120 = false;
        return false;
    }
}
