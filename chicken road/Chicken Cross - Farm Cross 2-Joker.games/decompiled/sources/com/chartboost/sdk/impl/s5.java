package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.tracking.g;

/* loaded from: classes4.dex */
public class s5 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final t5 f5006a;
    public final h7 b;
    public final da c;
    public final com.chartboost.sdk.internal.Model.a d;

    public s5(t5 t5Var, h7 h7Var, da daVar, com.chartboost.sdk.internal.Model.a aVar) {
        this.f5006a = t5Var;
        this.b = h7Var;
        this.c = daVar;
        this.d = aVar;
    }

    public final void a(String str) {
        t5 t5Var = this.f5006a;
        if (t5Var != null) {
            t5Var.a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        t5 t5Var = this.f5006a;
        if (t5Var != null) {
            t5Var.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                mb.a("WebView version: " + currentWebViewPackage.versionName, null);
            } else {
                a("Device was not set up correctly.");
            }
        }
        this.f5006a.b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        mb.a("Error loading " + webResourceRequest.getUrl().toString() + ": " + (webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase()), null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        h7 h7Var = this.b;
        if (!Chartboost.isSdkStarted() || h7Var == null) {
            mb.b("SDK is not initialized. Cannot track SSL error: " + sslError, null);
        } else {
            try {
                h7Var.mo4759track(com.chartboost.sdk.tracking.b.a(g.i.i, sslError.toString()));
            } catch (Exception e) {
                mb.b("Failed to track SSL error: " + sslError, e);
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        a(renderProcessGoneDetail.didCrash() ? "Webview crashed: " + renderProcessGoneDetail : "Webview killed, likely due to low memory");
        if (webView == null || !(webView.getContext() instanceof Activity)) {
            return true;
        }
        ((Activity) webView.getContext()).finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.d.A) {
            return false;
        }
        this.c.b(new k3(str, Boolean.FALSE));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            a("Error loading " + webResourceRequest.getUrl().toString() + ": " + ((Object) webResourceError.getDescription()));
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.d.A) {
            return false;
        }
        this.c.b(new k3(webResourceRequest.getUrl().toString(), Boolean.FALSE));
        return true;
    }
}
