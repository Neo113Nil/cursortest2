package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class m0 extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 f4344a;

    public m0(com.fyber.inneractive.sdk.web.v0 v0Var) {
        this.f4344a = v0Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        android.app.Activity activity = (android.app.Activity) com.fyber.inneractive.sdk.util.v.a(this.f4344a.q);
        if (activity != null) {
            activity.finish();
        }
        com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.web.l0(this), 1000L);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str.endsWith("success")) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f4344a;
            com.fyber.inneractive.sdk.web.n0 n0Var = v0Var.p;
            if (n0Var != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(n0Var);
                v0Var.p = null;
            }
            com.fyber.inneractive.sdk.web.v0 v0Var2 = this.f4344a;
            v0Var2.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", com.fyber.inneractive.sdk.util.IAlog.a(v0Var2), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f4344a.o));
            this.f4344a.l = true;
            return true;
        }
        if (!str.startsWith("exit")) {
            return false;
        }
        android.app.Activity activity = (android.app.Activity) com.fyber.inneractive.sdk.util.v.a(this.f4344a.q);
        if (activity == null) {
            return true;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            java.lang.String queryParameter = parse.getQueryParameter("target");
            boolean equals = android.text.TextUtils.equals("mail", parse.getAuthority());
            android.content.Intent intent = new android.content.Intent(equals ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", android.net.Uri.parse(queryParameter));
            if (equals) {
                intent = android.content.Intent.createChooser(intent, "Choose an application");
            }
            com.fyber.inneractive.sdk.util.h0.a(activity, intent);
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.network.z.a(th, null, null);
        }
        return true;
    }
}
