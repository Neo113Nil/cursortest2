package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class q0 {
    public static void a(com.fyber.inneractive.sdk.web.m mVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        mVar.evaluateJavascript(str, valueCallback);
    }

    public static void a(android.webkit.WebView webView, java.lang.String str) {
        webView.evaluateJavascript(str, null);
    }
}
