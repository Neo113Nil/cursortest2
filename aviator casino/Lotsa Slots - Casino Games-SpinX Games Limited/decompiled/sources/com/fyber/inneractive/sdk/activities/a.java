package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class a extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.FyberReportAdActivity f3518a;

    public a(com.fyber.inneractive.sdk.activities.FyberReportAdActivity fyberReportAdActivity) {
        this.f3518a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", java.lang.Integer.valueOf(i), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.fyber.inneractive.sdk.network.z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        com.fyber.inneractive.sdk.activities.FyberReportAdActivity fyberReportAdActivity = this.f3518a;
        if (fyberReportAdActivity.b == webView) {
            fyberReportAdActivity.b = null;
        }
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        this.f3518a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.fyber.inneractive.sdk.flow.h hVar;
        if (str == null) {
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            android.webkit.WebView webView2 = this.f3518a.b;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        if (!str.startsWith("fybermarketplace://reportAd?") || (hVar = com.fyber.inneractive.sdk.activities.FyberReportAdActivity.f) == null) {
            return false;
        }
        java.lang.String substring = str.substring(28);
        com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) hVar;
        gVar.getClass();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.FYBER_REPORT_AD, gVar.b, gVar.c);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("message", substring);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "message", substring);
        }
        wVar.f.put(jSONObject);
        wVar.g = true;
        wVar.a((java.lang.String) null);
        android.webkit.WebView webView3 = this.f3518a.b;
        if (webView3 != null) {
            com.fyber.inneractive.sdk.util.q0.a(webView3, "reportSent();");
        }
        return true;
    }
}
