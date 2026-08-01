package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public final class J extends WebChromeClient {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ K f121;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f122 = false;

    public J(K k) {
        this.f121 = k;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f121.mo5319(webView, str2);
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (i != 100 || this.f122) {
            return;
        }
        this.f122 = true;
        this.f121.mo5318(webView);
    }
}
