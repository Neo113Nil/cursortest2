package com.ironsource;

/* renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3130k8 implements com.ironsource.G8 {
    private static final java.lang.String g = "loadWithUrl | webView is not null";
    private static final java.lang.String h = "k8";
    private static final java.lang.String i = "file://";

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6338a;
    private java.lang.String b;
    private android.webkit.WebView c;
    private com.ironsource.C3095i8 d;
    private com.ironsource.C3005d8 e;
    private android.content.Context f;

    /* renamed from: com.ironsource.k8$a */
    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6339a;
        final /* synthetic */ org.json.JSONObject b;
        final /* synthetic */ java.lang.String c;

        a(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
            this.f6339a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.ironsource.C3130k8.this.c != null) {
                com.ironsource.C3327v8.a(com.ironsource.C3083he.q, new com.ironsource.C3238q8().a(com.ironsource.B5.A, com.ironsource.C3130k8.g).a());
            }
            try {
                com.ironsource.C3130k8.this.b(this.f6339a);
                com.ironsource.C3130k8.this.c.loadUrl(com.ironsource.C3130k8.this.a(this.b.getString("urlForWebView")));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("adViewId", com.ironsource.C3130k8.this.f6338a);
                com.ironsource.C3130k8.this.d.a(this.c, jSONObject);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.C3130k8.this.b(this.f6339a, e.getMessage());
                com.ironsource.C3327v8.a(com.ironsource.C3083he.q, new com.ironsource.C3238q8().a(com.ironsource.B5.A, e.getMessage()).a());
            }
        }
    }

    /* renamed from: com.ironsource.k8$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6340a;
        final /* synthetic */ java.lang.String b;

        b(java.lang.String str, java.lang.String str2) {
            this.f6340a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.webkit.WebView webView = com.ironsource.C3130k8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("adViewId", com.ironsource.C3130k8.this.f6338a);
                com.ironsource.C3095i8 c3095i8 = com.ironsource.C3130k8.this.d;
                if (c3095i8 != null) {
                    c3095i8.a(this.f6340a, jSONObject);
                    com.ironsource.C3130k8.this.d.b();
                }
                com.ironsource.C3130k8 c3130k8 = com.ironsource.C3130k8.this;
                c3130k8.d = null;
                c3130k8.f = null;
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                android.util.Log.e(com.ironsource.C3130k8.h, "performCleanup | could not destroy ISNAdView webView ID: " + com.ironsource.C3130k8.this.f6338a);
                com.ironsource.C3327v8.a(com.ironsource.C3083he.r, new com.ironsource.C3238q8().a(com.ironsource.B5.A, e.getMessage()).a());
                com.ironsource.C3130k8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.k8$c */
    class c implements com.ironsource.G8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6341a;

        c(java.lang.String str) {
            this.f6341a = str;
        }

        @Override // com.ironsource.G8.a
        public void a(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.C3130k8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            com.ironsource.C3130k8.this.b(this.f6341a, str);
        }

        @Override // com.ironsource.G8.a
        public void b(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.C3130k8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((android.view.ViewGroup) com.ironsource.C3130k8.this.c.getParent()).removeView(com.ironsource.C3130k8.this.c);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            com.ironsource.C3130k8.this.d();
        }
    }

    /* renamed from: com.ironsource.k8$d */
    private class d extends android.webkit.WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
            android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
            webView2.setWebChromeClient(com.ironsource.C3130k8.this.new d());
            webView2.setWebViewClient(new com.ironsource.C3130k8.e());
            ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            com.ironsource.sdk.utils.Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* renamed from: com.ironsource.k8$e */
    private class e extends android.webkit.WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(com.ironsource.C3130k8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            android.content.Context context = webView.getContext();
            android.content.Intent a2 = new com.ironsource.sdk.controller.OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(context);
            a2.addFlags(268435456);
            context.startActivity(a2);
            return true;
        }
    }

    public C3130k8(com.ironsource.InterfaceC3059g8 interfaceC3059g8, android.content.Context context, java.lang.String str, com.ironsource.C3005d8 c3005d8) {
        this.f = context;
        com.ironsource.C3095i8 c3095i8 = new com.ironsource.C3095i8();
        this.d = c3095i8;
        c3095i8.g(str);
        this.f6338a = str;
        this.d.a(interfaceC3059g8);
        this.e = c3005d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public java.lang.String a() {
        return this.f6338a;
    }

    public com.ironsource.C3095i8 b() {
        return this.d;
    }

    public com.ironsource.C3005d8 c() {
        return this.e;
    }

    public void e(java.lang.String str) {
        this.b = str;
    }

    @Override // com.ironsource.G8
    public android.webkit.WebView getPresentingView() {
        return this.c;
    }

    @android.webkit.JavascriptInterface
    public void handleMessageFromAd(java.lang.String str) {
        this.d.c(str);
    }

    private java.lang.String d(java.lang.String str) {
        java.lang.String substring = str.substring(str.indexOf(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) + 1);
        return substring.substring(substring.indexOf(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING));
    }

    @Override // com.ironsource.G8
    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            this.d.e(str);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.sdk.utils.Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.G8
    public void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        com.ironsource.Q7.f5934a.d(new com.ironsource.C3130k8.a(str2, jSONObject, str));
    }

    @Override // com.ironsource.G8
    public void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.sdk.utils.Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.String str) {
        com.ironsource.sdk.utils.Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        android.webkit.WebView webView = new android.webkit.WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new com.ironsource.C3077h8(this), com.ironsource.C3023e8.e);
        this.c.setWebViewClient(new com.ironsource.C3112j8(new com.ironsource.C3130k8.c(str)));
        this.c.setWebChromeClient(new com.ironsource.C3130k8.d());
        com.ironsource.bh.a(this.c);
        this.d.a(this.c);
    }

    @Override // com.ironsource.G8
    public synchronized void a(java.lang.String str, java.lang.String str2) {
        if (this.f == null) {
            return;
        }
        com.ironsource.sdk.utils.Logger.i(h, "performCleanup");
        com.ironsource.Q7.f5934a.d(new com.ironsource.C3130k8.b(str, str2));
    }

    private boolean c(java.lang.String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.G8
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            b(str3, com.ironsource.X3.c.D);
            return;
        }
        com.ironsource.sdk.utils.Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(com.ironsource.X3.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (str.equals(com.ironsource.X3.i.u0)) {
                this.c.onResume();
                this.d.f(str2);
            } else {
                b(str3, com.ironsource.X3.c.C);
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            b(str3, com.ironsource.X3.c.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.b + d(str);
    }

    public void b(java.lang.String str, java.lang.String str2) {
        com.ironsource.C3095i8 c3095i8 = this.d;
        if (c3095i8 != null) {
            c3095i8.a(str, str2);
        }
    }
}
