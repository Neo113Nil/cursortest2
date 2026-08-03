package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class v implements com.ironsource.sdk.controller.l, com.ironsource.Nc, android.webkit.DownloadListener {
    private static final java.lang.String d0 = "about:blank";
    public static int e0 = 0;
    public static java.lang.String f0 = "is_store";
    public static java.lang.String g0 = "external_url";
    public static java.lang.String h0 = "secondary_web_view";
    private static java.lang.String i0 = "success";
    private static java.lang.String j0 = "fail";
    private com.ironsource.InterfaceC3269s4 A;
    private java.lang.String B;
    private com.ironsource.sdk.controller.d C;
    private com.ironsource.InterfaceC3371xg D;
    private com.ironsource.C2980c1 E;
    private com.ironsource.U4 H;
    private com.ironsource.sdk.controller.o I;
    private com.ironsource.sdk.controller.q J;
    private com.ironsource.sdk.controller.u K;
    private com.ironsource.sdk.controller.i L;
    private com.ironsource.sdk.controller.a M;
    private com.ironsource.sdk.controller.j N;
    private com.ironsource.C3302u1 O;
    private com.ironsource.C3359x4 P;
    private com.ironsource.ah Q;
    private com.ironsource.sdk.controller.c R;
    private com.ironsource.R3 S;
    private org.json.JSONObject T;
    private com.ironsource.sdk.controller.l.a U;
    private com.ironsource.sdk.controller.l.b V;
    private com.ironsource.C3108j4 W;
    private boolean X;
    private final boolean Y;
    private final com.ironsource.InterfaceC3362x7 Z;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Q7 f6673a;
    com.ironsource.C2947a4 a0;
    private com.ironsource.InterfaceC3037f4 b;
    private volatile com.ironsource.C3043fa b0;
    private com.ironsource.Pc c0;
    private java.lang.String f;
    private java.lang.String g;
    private final com.ironsource.C3020e5 h;
    private boolean i;
    private com.ironsource.sdk.controller.v.q j;
    private boolean k;
    private android.os.CountDownTimer l;
    public android.os.CountDownTimer m;
    private final com.ironsource.sdk.controller.v.p r;
    private android.view.View s;
    private android.widget.FrameLayout t;
    private android.webkit.WebChromeClient.CustomViewCallback u;
    private android.widget.FrameLayout v;
    private com.ironsource.sdk.controller.v.EnumC0167v w;
    private java.lang.String x;
    private com.ironsource.InterfaceC3305u4 y;
    private com.ironsource.InterfaceC3287t4 z;
    private java.lang.String c = "v";
    private java.lang.String d = "IronSource";
    private final java.lang.String e = "We're sorry, some error occurred. we will investigate it";
    private final com.ironsource.Yg n = new com.ironsource.Yg();
    private int o = 50;
    private int p = 50;
    private java.lang.String q = com.ironsource.X3.e.b;
    private java.lang.Object F = new java.lang.Object();
    private boolean G = false;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.a(1);
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.a(1);
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3220p8 f6676a;

        c(com.ironsource.C3220p8 c3220p8) {
            this.f6676a = c3220p8;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.R.c("controller html - failed to download - " + this.f6676a.b());
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f6677a;

        d(android.content.Context context) {
            this.f6677a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.e(this.f6677a);
        }
    }

    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f6678a;

        e(android.content.Context context) {
            this.f6678a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.f(this.f6678a);
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3202o8.e f6679a;
        final /* synthetic */ java.lang.String b;

        f(com.ironsource.C3202o8.e eVar, java.lang.String str) {
            this.f6679a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.InterfaceC3251r4 a2;
            com.ironsource.C3202o8.e eVar = this.f6679a;
            if ((eVar == com.ironsource.C3202o8.e.RewardedVideo || eVar == com.ironsource.C3202o8.e.Interstitial) && (a2 = com.ironsource.sdk.controller.v.this.a(eVar)) != null) {
                a2.b(this.f6679a, this.b);
            }
        }
    }

    class h implements com.ironsource.ah {
        h() {
        }

        @Override // com.ironsource.ah
        public void a(java.lang.String str, org.json.JSONObject jSONObject) {
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.e(str, jSONObject.toString()));
        }
    }

    class i implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f6681a;
        final /* synthetic */ android.webkit.WebView b;
        final /* synthetic */ int c;
        final /* synthetic */ java.lang.String d;

        i(org.json.JSONObject jSONObject, android.webkit.WebView webView, int i, java.lang.String str) {
            this.f6681a = jSONObject;
            this.b = webView;
            this.c = i;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.a(this.f6681a, this.b);
            if (com.ironsource.sdk.controller.v.B()) {
                com.ironsource.sdk.controller.v.this.n.a(this.c, this.d);
                com.ironsource.sdk.controller.v.this.m("about:blank");
            } else {
                com.ironsource.sdk.controller.v.this.m("about:blank");
                com.ironsource.sdk.controller.v.this.m(this.d);
            }
        }
    }

    class j extends android.os.CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6682a;
        final /* synthetic */ int b;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.R.c(com.ironsource.X3.c.j);
            }
        }

        class b implements java.lang.Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Stopping WebView load before retry attempt $nextAttempt");
                    com.ironsource.sdk.controller.v.this.b0.stopLoading();
                } catch (java.lang.Exception unused) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Failed to stop WebView loading: $error");
                }
                com.ironsource.sdk.controller.v.j jVar = com.ironsource.sdk.controller.v.j.this;
                com.ironsource.sdk.controller.v.this.a(jVar.f6682a + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j, long j2, int i, int i2) {
            super(j, j2);
            this.f6682a = i;
            this.b = i2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "Loading Controller Timer Finish");
            if (this.f6682a >= this.b) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.j.a());
            } else if (com.ironsource.sdk.controller.v.B()) {
                com.ironsource.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.j.b());
            } else {
                com.ironsource.sdk.controller.v.this.a(this.f6682a + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class k implements com.ironsource.sdk.controller.v.t {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(java.lang.String str, com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4) {
            com.ironsource.sdk.controller.v.this.a(str, eVar, t4);
        }
    }

    class l implements com.ironsource.sdk.controller.v.t {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(java.lang.String str, com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4) {
            com.ironsource.sdk.controller.v.this.a(str, eVar, t4);
        }
    }

    class m implements com.ironsource.sdk.controller.v.t {
        m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(java.lang.String str, com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4) {
            com.ironsource.sdk.controller.v.this.a(str, eVar, t4);
        }
    }

    class n implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3202o8.e f6688a;
        final /* synthetic */ com.ironsource.T4 b;
        final /* synthetic */ java.lang.String c;

        n(com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4, java.lang.String str) {
            this.f6688a = eVar;
            this.b = t4;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.T4 t4;
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.RewardedVideo;
            com.ironsource.C3202o8.e eVar2 = this.f6688a;
            if ((eVar != eVar2 && com.ironsource.C3202o8.e.Interstitial != eVar2 && com.ironsource.C3202o8.e.Banner != eVar2) || (t4 = this.b) == null || android.text.TextUtils.isEmpty(t4.h())) {
                return;
            }
            com.ironsource.InterfaceC3251r4 a2 = com.ironsource.sdk.controller.v.this.a(this.f6688a);
            android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onAdProductInitFailed (message:" + this.c + ")(" + this.f6688a + ")");
            if (a2 != null) {
                a2.a(this.f6688a, this.b.h(), this.c);
            }
        }
    }

    class o implements java.lang.Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.v.this.a(1);
        }
    }

    private class p extends android.webkit.WebChromeClient {
        private p() {
        }

        @Override // android.webkit.WebChromeClient
        public android.view.View getVideoLoadingProgressView() {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.ironsource.sdk.controller.v.this.b0.getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            com.ironsource.sdk.utils.Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
            android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new com.ironsource.sdk.controller.v.r());
            ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            com.ironsource.sdk.utils.Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            com.ironsource.sdk.utils.Logger.i("Test", "onHideCustomView");
            android.view.View view = com.ironsource.sdk.controller.v.this.s;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            vVar.t.removeView(vVar.s);
            com.ironsource.sdk.controller.v vVar2 = com.ironsource.sdk.controller.v.this;
            vVar2.s = null;
            vVar2.t.setVisibility(8);
            com.ironsource.sdk.controller.v.this.u.onCustomViewHidden();
            com.ironsource.sdk.controller.v.this.b0.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            com.ironsource.sdk.utils.Logger.i("Test", "onShowCustomView");
            com.ironsource.sdk.controller.v.this.b0.setVisibility(8);
            if (com.ironsource.sdk.controller.v.this.s != null) {
                com.ironsource.sdk.utils.Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            com.ironsource.sdk.utils.Logger.i("Test", "mCustomView == null");
            com.ironsource.sdk.controller.v.this.t.addView(view);
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            vVar.s = view;
            vVar.u = customViewCallback;
            vVar.t.setVisibility(0);
        }
    }

    static class q {

        /* renamed from: a, reason: collision with root package name */
        com.ironsource.C3202o8.e f6691a;
        java.lang.String b;

        public q(com.ironsource.C3202o8.e eVar, java.lang.String str) {
            this.f6691a = eVar;
            this.b = str;
        }

        java.lang.String a() {
            return this.b;
        }

        com.ironsource.C3202o8.e b() {
            return this.f6691a;
        }
    }

    private class r extends android.webkit.WebViewClient {
        private r() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(com.ironsource.sdk.controller.v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            android.content.Context q = com.ironsource.sdk.controller.v.this.q();
            q.startActivity(new com.ironsource.sdk.controller.OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(q));
            return true;
        }
    }

    private interface t {
        void a(java.lang.String str, com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4);
    }

    static class u {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6717a;
        java.lang.String b;

        u() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public enum EnumC0167v {
        Display,
        Gone
    }

    private class w extends android.webkit.WebViewClient {
        private w() {
        }

        private void a() {
            java.lang.String b = com.ironsource.sdk.controller.v.this.n.b();
            if (b != null) {
                com.ironsource.sdk.controller.v.this.m(b);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i("onPageFinished", str);
            if (com.ironsource.sdk.controller.v.B() && com.ironsource.sdk.controller.v.this.n.c() && str.equals("about:blank")) {
                a();
            }
            if (str.contains("adUnit") || str.contains("index.html")) {
                com.ironsource.sdk.controller.v.this.D();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            com.ironsource.sdk.utils.Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            com.ironsource.sdk.controller.c cVar;
            com.ironsource.sdk.utils.Logger.i("onReceivedError", str2 + io.ktor.sse.ServerSentEventKt.SPACE + str);
            if (str2.contains(com.ironsource.X3.f) && (cVar = com.ironsource.sdk.controller.v.this.R) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            android.util.Log.e(com.ironsource.sdk.controller.v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            java.lang.String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = com.ironsource.sdk.controller.v.this.R;
            if (cVar != null) {
                cVar.b(str);
            }
            com.ironsource.sdk.controller.v.this.w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i("shouldInterceptRequest", str);
            try {
                if (new java.net.URL(str).getFile().contains(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k)) {
                    java.lang.String str2 = com.vungle.ads.internal.model.AdPayload.FILE_SCHEME + com.ironsource.sdk.controller.v.this.B + java.io.File.separator + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k;
                    try {
                        new java.io.FileInputStream(new java.io.File(str2));
                        return new android.webkit.WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                    } catch (java.io.FileNotFoundException e) {
                        com.ironsource.C3180n4.d().a(e);
                    }
                }
            } catch (java.net.MalformedURLException e2) {
                com.ironsource.C3180n4.d().a(e2);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (com.ironsource.sdk.controller.v.this.h(str)) {
                    com.ironsource.sdk.controller.v.this.A();
                    return true;
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(android.content.Context context, com.ironsource.U4 u4, com.ironsource.C2947a4 c2947a4, com.ironsource.sdk.controller.c cVar, com.ironsource.Q7 q7, int i2, com.ironsource.C3020e5 c3020e5, java.lang.String str, com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.l.b bVar, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        java.util.concurrent.CountDownLatch countDownLatch;
        java.lang.Object[] objArr = 0;
        com.ironsource.sdk.controller.v.p pVar = new com.ironsource.sdk.controller.v.p();
        this.r = pVar;
        boolean s2 = com.ironsource.Jb.Y().h().s();
        this.Y = com.ironsource.Jb.Y().h().C();
        if (s2) {
            countDownLatch = new java.util.concurrent.CountDownLatch(1);
            a(context, q7, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.Z = com.ironsource.Jb.Y().a();
        if (!s2) {
            this.b0 = new com.ironsource.C3043fa(context, new com.ironsource.InterfaceC3240qa.a());
        }
        com.ironsource.sdk.utils.Logger.i(this.c, "C'tor");
        this.a0 = c2947a4;
        this.R = cVar;
        this.f6673a = q7;
        this.H = u4;
        if (!s2) {
            a(context, this.b0);
        }
        this.B = str;
        this.E = new com.ironsource.C2980c1();
        this.T = new org.json.JSONObject();
        this.h = c3020e5;
        this.U = aVar;
        this.V = bVar;
        boolean optBoolean = com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration().optBoolean(com.ironsource.X3.a.i, false);
        this.X = optBoolean;
        if (optBoolean) {
            this.W = new com.ironsource.C3108j4(new com.ironsource.C3055g4(com.ironsource.sdk.utils.SDKUtils.getControllerUrl(), this.B, com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new com.ironsource.C2992cd(com.ironsource.sdk.utils.SDKUtils.getControllerUrl())), new kotlin.jvm.functions.Function1() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.Object d2;
                    d2 = com.ironsource.sdk.controller.v.this.d((com.ironsource.C3381y8) obj);
                    return d2;
                }
            }, c3020e5, new com.ironsource.InterfaceC3216p4.a());
        } else {
            c3020e5.a(this);
            this.C = new com.ironsource.sdk.controller.d(com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration(), this.B, com.ironsource.sdk.utils.SDKUtils.getControllerUrl(), c3020e5);
        }
        if (!s2) {
            this.b0.setWebViewClient(new com.ironsource.sdk.controller.v.w());
            this.b0.setWebChromeClient(pVar);
            com.ironsource.bh.a(this.b0);
            a(this.b0);
            this.b0.setDownloadListener(this);
        }
        this.S = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        if (s2) {
            try {
                countDownLatch.await();
                if (this.b0 == null) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("WebView initialization failed");
                    this.R.c("WebView initialization failed");
                    return;
                }
            } catch (java.lang.InterruptedException e2) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("WebView initialization was interrupted", e2);
                com.ironsource.C3180n4.d().a(e2);
                java.lang.Thread.currentThread().interrupt();
                this.R.c("WebView initialization was interrupted");
                return;
            }
        }
        this.b = com.ironsource.InterfaceC3037f4.CC.a(com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B() {
        return com.ironsource.Jb.Y().h().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        android.view.ViewParent parent = this.b0.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.b0);
        }
        this.b0.destroy();
    }

    private void J() {
    }

    private void a(final android.content.Context context, com.ironsource.Q7 q7, final java.util.concurrent.CountDownLatch countDownLatch) {
        q7.d(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.controller.v.this.a(context, countDownLatch);
            }
        });
    }

    private com.ironsource.R3 c(android.content.Context context) {
        return new com.ironsource.sdk.controller.v.g(com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] f(java.lang.String str, java.lang.String str2) {
        boolean z;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, java.lang.String> map = null;
        if (android.text.TextUtils.isEmpty(str)) {
            z = true;
        } else {
            com.ironsource.T4 a2 = this.H.a(g(str), str2);
            if (a2 != null) {
                map = a2.g();
                map.put("demandSourceName", a2.f());
                map.put("demandSourceId", a2.h());
            }
            try {
                jSONObject.put(com.ironsource.X3.i.m, str);
            } catch (org.json.JSONException e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
            try {
                java.util.Map<java.lang.String, java.lang.String> initSDKParams = com.ironsource.sdk.utils.SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = com.ironsource.sdk.utils.SDKUtils.mergeJSONObjects(jSONObject, new org.json.JSONObject(initSDKParams));
                }
            } catch (java.lang.Exception e3) {
                com.ironsource.C3180n4.d().a(e3);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
            }
            z = false;
        }
        if (!android.text.TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.f), com.ironsource.sdk.utils.SDKUtils.encodeString(this.g));
            } catch (org.json.JSONException e4) {
                com.ironsource.C3180n4.d().a(e4);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (android.text.TextUtils.isEmpty(this.f)) {
            z = true;
        } else {
            try {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.g), com.ironsource.sdk.utils.SDKUtils.encodeString(this.f));
            } catch (org.json.JSONException e5) {
                com.ironsource.C3180n4.d().a(e5);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e5.toString());
            }
        }
        if (map != null && !map.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(entry.getKey()), com.ironsource.sdk.utils.SDKUtils.encodeString(entry.getValue()));
                } catch (org.json.JSONException e6) {
                    com.ironsource.C3180n4.d().a(e6);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new java.lang.Object[]{jSONObject.toString(), java.lang.Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        c(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.controller.v.this.k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(java.lang.String str) {
        this.b0.a(new com.ironsource.sdk.controller.m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(java.lang.String str) {
        try {
            com.ironsource.sdk.utils.Logger.i(this.c, "load(): " + str);
            this.b0.loadUrl(str);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.sdk.utils.Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    private void n() {
        android.os.CountDownTimer countDownTimer;
        if (!com.ironsource.Jb.Y().h().h() || (countDownTimer = this.m) == null) {
            return;
        }
        countDownTimer.cancel();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(java.lang.String str) {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
        java.lang.String d2 = c3101ie.d("color");
        java.lang.String d3 = c3101ie.d("adViewId");
        int parseColor = !com.ironsource.X3.i.T.equalsIgnoreCase(d2) ? android.graphics.Color.parseColor(d2) : 0;
        if (d3 == null) {
            this.b0.setBackgroundColor(parseColor);
            return;
        }
        android.webkit.WebView presentingView = com.ironsource.C3148l8.a().a(d3).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(parseColor);
        }
    }

    public void A() {
        i(f(com.ironsource.X3.h.Z));
    }

    public void D() {
        i(f(com.ironsource.X3.h.A));
    }

    public void E() {
        try {
            this.b0.onPause();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.sdk.utils.Logger.i(this.c, "WebViewController: onPause() - " + th);
        }
    }

    public void F() {
        this.D = null;
    }

    public void G() {
        this.b0.a();
        this.c0 = null;
    }

    public void H() {
        this.b0.requestFocus();
    }

    public void I() {
        try {
            this.b0.onResume();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.sdk.utils.Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.ironsource.X3.c.z;
        }
        i(e(com.ironsource.X3.h.a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(com.ironsource.X3.h.t));
    }

    public void g(java.lang.String str, java.lang.String str2) {
        i(e(com.ironsource.X3.h.W, a(com.ironsource.X3.i.p, str2, com.ironsource.X3.i.m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public com.ironsource.C3202o8.c h() {
        return com.ironsource.C3202o8.c.Web;
    }

    public void j(java.lang.String str) {
        i(e(com.ironsource.X3.f.j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(java.lang.String str) {
        i(e(com.ironsource.X3.h.w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void o(java.lang.String str) {
        this.x = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2) {
        com.ironsource.sdk.utils.Logger.i(this.c, str + io.ktor.sse.ServerSentEventKt.SPACE + str4);
    }

    public com.ironsource.ah p() {
        if (this.Q == null) {
            this.Q = new com.ironsource.sdk.controller.v.h();
        }
        return this.Q;
    }

    public int r() {
        return e0;
    }

    public android.widget.FrameLayout s() {
        return this.v;
    }

    public java.lang.String t() {
        return this.x;
    }

    public com.ironsource.C2980c1 u() {
        return this.E;
    }

    public com.ironsource.sdk.controller.v.EnumC0167v v() {
        return this.w;
    }

    public void w() {
        if (this.j == null) {
            return;
        }
        o();
        com.ironsource.C3202o8.e b2 = this.j.b();
        java.lang.String a2 = this.j.a();
        if (r(b2.toString())) {
            a(b2, a2);
        }
    }

    public void x() {
        this.r.onHideCustomView();
    }

    public boolean y() {
        return this.s != null;
    }

    public void z() {
        i(f(com.ironsource.X3.f.h));
    }

    class g extends com.ironsource.R3 {
        g(org.json.JSONObject jSONObject, android.content.Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC3272s7
        public void a(java.lang.String str, org.json.JSONObject jSONObject) {
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            if (vVar.i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC3272s7
        public void b(java.lang.String str, org.json.JSONObject jSONObject) {
            if (jSONObject == null || !com.ironsource.sdk.controller.v.this.i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                com.ironsource.sdk.controller.v.this.e(jSONObject);
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.R3, com.ironsource.InterfaceC3272s7
        public void a() {
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            if (vVar.i) {
                vVar.n("none");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.Context context, java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            try {
                this.b0 = new com.ironsource.C3043fa(context, new com.ironsource.InterfaceC3240qa.a());
                a(context, this.b0);
                this.b0.setWebViewClient(new com.ironsource.sdk.controller.v.w());
                this.b0.setWebChromeClient(this.r);
                com.ironsource.bh.a(this.b0);
                a(this.b0);
                this.b0.setDownloadListener(this);
            } catch (java.lang.Exception e2) {
                this.R.c("Failed to create WebView on UI thread");
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to create WebView on UI thread", e2);
                com.ironsource.C3180n4.d().a(e2);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        com.ironsource.Pc pc = this.c0;
        if (pc != null) {
            pc.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(java.lang.String str) {
        boolean z = false;
        if (android.text.TextUtils.isEmpty(str)) {
            com.ironsource.sdk.utils.Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(com.ironsource.C3202o8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(com.ironsource.C3202o8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(com.ironsource.C3202o8.e.Banner.toString()) || this.A == null : this.y == null) : this.z != null) {
            z = true;
        }
        if (!z) {
            com.ironsource.sdk.utils.Logger.d(this.c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.X) {
            this.W.b();
            return;
        }
        this.C.a(new com.ironsource.C3238q8());
        if (this.C.k()) {
            a(1);
        }
    }

    public void c(java.lang.String str, java.lang.String str2) {
        try {
            i(e(com.ironsource.X3.h.p, a("file", str, "path", b(str2), null, null, null, null, null, false)));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            b(str, str2, e2.getMessage());
        }
    }

    public boolean h(java.lang.String str) {
        try {
            if (!new com.ironsource.Pe(str, com.ironsource.C2989ca.e().d(), com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            com.ironsource.C3210og.a(q(), str);
            return true;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public class s {

        class a implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6694a;
            final /* synthetic */ java.lang.String b;

            a(java.lang.String str, java.lang.String str2) {
                this.f6694a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f6694a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onRVShowFail(message:" + this.f6694a + ")");
                com.ironsource.sdk.controller.v.this.y.b(this.b, str);
            }
        }

        class b implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6695a;

            b(java.lang.String str) {
                this.f6695a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onInterstitialInitSuccess()");
                com.ironsource.sdk.controller.v.this.z.a(com.ironsource.C3202o8.e.Interstitial, this.f6695a, (com.ironsource.C2962b1) null);
            }
        }

        class c implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6696a;
            final /* synthetic */ java.lang.String b;

            c(java.lang.String str, java.lang.String str2) {
                this.f6696a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f6696a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onInterstitialInitFail(message:" + str + ")");
                com.ironsource.sdk.controller.v.this.z.a(com.ironsource.C3202o8.e.Interstitial, this.b, str);
            }
        }

        class d implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.InterfaceC3251r4 f6697a;
            final /* synthetic */ com.ironsource.C3202o8.e b;
            final /* synthetic */ java.lang.String c;

            d(com.ironsource.InterfaceC3251r4 interfaceC3251r4, com.ironsource.C3202o8.e eVar, java.lang.String str) {
                this.f6697a = interfaceC3251r4;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6697a.a(this.b, this.c);
            }
        }

        class e implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6698a;
            final /* synthetic */ org.json.JSONObject b;

            e(java.lang.String str, org.json.JSONObject jSONObject) {
                this.f6698a = str;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.z.a(this.f6698a, this.b);
            }
        }

        class f implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6699a;
            final /* synthetic */ java.lang.String b;

            f(java.lang.String str, java.lang.String str2) {
                this.f6699a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f6699a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                com.ironsource.sdk.controller.v.this.z.a(this.b, str);
            }
        }

        class g implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6700a;

            g(java.lang.String str) {
                this.f6700a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onBannerInitSuccess()");
                com.ironsource.sdk.controller.v.this.A.a(com.ironsource.C3202o8.e.Banner, this.f6700a, (com.ironsource.C2962b1) null);
            }
        }

        class h implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6701a;
            final /* synthetic */ java.lang.String b;

            h(java.lang.String str, java.lang.String str2) {
                this.f6701a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f6701a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onBannerInitFail(message:" + str + ")");
                com.ironsource.sdk.controller.v.this.A.a(com.ironsource.C3202o8.e.Banner, this.b, str);
            }
        }

        class i implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6702a;
            final /* synthetic */ com.ironsource.C3041f8 b;

            i(java.lang.String str, com.ironsource.C3041f8 c3041f8) {
                this.f6702a = str;
                this.b = c3041f8;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onBannerLoadSuccess()");
                com.ironsource.sdk.controller.v.this.A.a(this.f6702a, this.b);
            }
        }

        class j implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6703a;
            final /* synthetic */ java.lang.String b;

            j(java.lang.String str, java.lang.String str2) {
                this.f6703a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onLoadBannerFail()");
                java.lang.String str = this.f6703a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                com.ironsource.sdk.controller.v.this.A.c(this.b, str);
            }
        }

        class k implements java.lang.Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.I();
            }
        }

        class l implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6705a;

            l(java.lang.String str) {
                this.f6705a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new org.json.JSONObject(this.f6705a).has(com.ironsource.sdk.controller.f.b.b)) {
                        com.ironsource.sdk.controller.v.this.U.a(com.ironsource.sdk.controller.f.a.a(this.f6705a));
                    } else {
                        com.ironsource.sdk.controller.v.this.V.a(com.ironsource.Mb.a(this.f6705a));
                    }
                } catch (org.json.JSONException e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.sdk.utils.Logger.e(com.ironsource.sdk.controller.v.this.c, "failed to parse received message");
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        class m implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.C3202o8.e f6706a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ java.lang.String c;
            final /* synthetic */ org.json.JSONObject d;

            m(com.ironsource.C3202o8.e eVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
                this.f6706a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.InterfaceC3251r4 a2;
                com.ironsource.C3202o8.e eVar = this.f6706a;
                if ((eVar == com.ironsource.C3202o8.e.Interstitial || eVar == com.ironsource.C3202o8.e.RewardedVideo || eVar == com.ironsource.C3202o8.e.Banner) && (a2 = com.ironsource.sdk.controller.v.this.a(eVar)) != null) {
                    a2.a(this.f6706a, this.b, this.c, this.d);
                }
            }
        }

        class n implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6707a;

            n(java.lang.String str) {
                this.f6707a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "omidAPI(" + this.f6707a + ")");
                    com.ironsource.sdk.controller.v.this.I.a(new com.ironsource.C3101ie(this.f6707a).toString(), com.ironsource.sdk.controller.v.s.this.new w());
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                    com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        class o implements java.lang.Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.E();
            }
        }

        class p implements java.lang.Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.b0.removeJavascriptInterface(com.ironsource.X3.e);
            }
        }

        class q implements java.lang.Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.b0.getSettings().setMixedContentMode(0);
            }
        }

        class r implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f6711a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ com.ironsource.C2962b1 c;

            r(int i, java.lang.String str, com.ironsource.C2962b1 c2962b1) {
                this.f6711a = i;
                this.b = str;
                this.c = c2962b1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f6711a <= 0) {
                    com.ironsource.sdk.controller.v.this.y.c(this.b);
                } else {
                    android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onRVInitSuccess()");
                    com.ironsource.sdk.controller.v.this.y.a(com.ironsource.C3202o8.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        class RunnableC0165s implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6712a;

            RunnableC0165s(java.lang.String str) {
                this.f6712a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.ironsource.sdk.controller.v.this.N.a(new org.json.JSONObject(this.f6712a), com.ironsource.sdk.controller.v.s.this.new w());
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                    com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        class t implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6713a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ int c;

            t(java.lang.String str, java.lang.String str2, int i) {
                this.f6713a = str;
                this.b = str2;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f6713a.equalsIgnoreCase(com.ironsource.C3202o8.e.RewardedVideo.toString())) {
                    com.ironsource.sdk.controller.v.this.y.a(this.b, this.c);
                }
            }
        }

        class u implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6714a;
            final /* synthetic */ int b;

            u(java.lang.String str, int i) {
                this.f6714a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.ironsource.sdk.controller.v.this.z.onInterstitialAdRewarded(this.f6714a, this.b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        class RunnableC0166v implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f6715a;
            final /* synthetic */ java.lang.String b;

            RunnableC0166v(java.lang.String str, java.lang.String str2) {
                this.f6715a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f6715a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onRVInitFail(message:" + str + ")");
                com.ironsource.sdk.controller.v.this.y.a(com.ironsource.C3202o8.e.RewardedVideo, this.b, str);
            }
        }

        public s() {
        }

        private void a(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", com.ironsource.sdk.controller.v.this.C.f());
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.utils.Logger.d(com.ironsource.sdk.controller.v.this.c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(org.json.JSONObject jSONObject) {
            try {
                com.ironsource.sdk.controller.FeaturesManager featuresManager = com.ironsource.sdk.controller.FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(com.ironsource.X3.a.h, new org.json.JSONArray((java.util.Collection) featuresManager.a()));
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.C3327v8.a(com.ironsource.C3083he.p, new com.ironsource.C3238q8().a(com.ironsource.B5.A, e2.getMessage()).a());
                com.ironsource.sdk.utils.Logger.d(com.ironsource.sdk.controller.v.this.c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(org.json.JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, com.ironsource.sdk.utils.SDKUtils.getTesterParameters());
            if (com.ironsource.sdk.controller.v.this.X) {
                return;
            }
            a(jSONObject);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "deleteFolder(" + str + ")");
                java.lang.String d2 = new com.ironsource.C3101ie(str).d("path");
                if (d2 == null) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.g, "1");
                    return;
                }
                com.ironsource.C3381y8 c3381y8 = new com.ironsource.C3381y8(com.ironsource.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(com.ironsource.sdk.controller.v.this.B, d2));
                com.ironsource.sdk.utils.IronSourceStorageUtils.ensurePathSafety(c3381y8, com.ironsource.sdk.controller.v.this.B);
                if (!c3381y8.exists()) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.e, "1");
                } else {
                    com.ironsource.sdk.controller.v.this.a(str, com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFolder(c3381y8.getPath()), (java.lang.String) null, (java.lang.String) null);
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void n(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.controller.v.this.L.a(new com.ironsource.C3101ie(str).toString(), new com.ironsource.sdk.controller.v.s.w());
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void o(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "dsSharedSignalsAPI(" + str + ")");
                com.ironsource.sdk.controller.v.this.P.a(new com.ironsource.C3101ie(str).toString(), new com.ironsource.sdk.controller.v.s.w());
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void p(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getCachedFilesMap(" + str + ")");
            java.lang.String e2 = com.ironsource.sdk.controller.v.this.e(str);
            if (android.text.TextUtils.isEmpty(e2)) {
                return;
            }
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            if (!c3101ie.a("path")) {
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.s, (java.lang.String) null);
                return;
            }
            java.lang.String str2 = (java.lang.String) c3101ie.b("path");
            if (!com.ironsource.sdk.utils.IronSourceStorageUtils.isPathExist(com.ironsource.sdk.controller.v.this.B, str2)) {
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.t, (java.lang.String) null);
                return;
            }
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(e2, com.ironsource.sdk.utils.IronSourceStorageUtils.getCachedFilesMap(com.ironsource.sdk.controller.v.this.B, str2), com.ironsource.X3.h.s, com.ironsource.X3.h.r));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void q(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getDeviceStatus(" + str + ")");
            java.lang.String e2 = com.ironsource.sdk.controller.v.this.e(str);
            java.lang.String d2 = com.ironsource.sdk.controller.v.this.d(str);
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            java.lang.Object[] d3 = vVar.d(vVar.b0.getContext());
            java.lang.String str2 = (java.lang.String) d3[0];
            if (((java.lang.Boolean) d3[1]).booleanValue()) {
                if (!android.text.TextUtils.isEmpty(d2)) {
                    e2 = d2;
                }
                e2 = null;
            }
            if (android.text.TextUtils.isEmpty(e2)) {
                return;
            }
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(e2, str2, com.ironsource.X3.h.l, com.ironsource.X3.h.m));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void r(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.controller.v.this.K.a(new com.ironsource.C3101ie(str).toString(), new com.ironsource.sdk.controller.v.s.w());
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(java.lang.String str) {
            try {
                com.ironsource.InterfaceC3338w1 a2 = com.ironsource.InterfaceC3338w1.CC.a(str);
                com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
                com.ironsource.C3302u1.a a3 = vVar.O.a(vVar.b0.getContext(), a2);
                com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.e(a3.f(), a3.i().toString()));
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.controller.v.this.J.a(new com.ironsource.C3101ie(str).toString(), new com.ironsource.sdk.controller.v.s.w());
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @android.webkit.JavascriptInterface
        public void adClicked(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "adClicked(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.m);
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            com.ironsource.C3202o8.e g2 = com.ironsource.sdk.controller.v.this.g(d2);
            com.ironsource.InterfaceC3251r4 a2 = com.ironsource.sdk.controller.v.this.a(g2);
            if (g2 == null || a2 == null) {
                return;
            }
            com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.d(a2, g2, fetchDemandSourceId));
        }

        @android.webkit.JavascriptInterface
        public void adCredited(java.lang.String str) {
            android.util.Log.d(com.ironsource.sdk.controller.v.this.d, "adCredited(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.k);
            int parseInt = d2 != null ? java.lang.Integer.parseInt(d2) : 0;
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            java.lang.String d3 = c3101ie.d(com.ironsource.X3.i.m);
            if (android.text.TextUtils.isEmpty(d3)) {
                android.util.Log.d(com.ironsource.sdk.controller.v.this.d, "adCredited | product type is missing");
            }
            if (com.ironsource.C3202o8.e.Interstitial.toString().equalsIgnoreCase(d3)) {
                a(fetchDemandSourceId, parseInt);
            } else if (com.ironsource.sdk.controller.v.this.r(d3)) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.t(d3, fetchDemandSourceId, parseInt));
            }
        }

        @android.webkit.JavascriptInterface
        public void adUnitsReady(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "adUnitsReady(" + str + ")");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(new com.ironsource.C3101ie(str));
            com.ironsource.C2962b1 c2962b1 = new com.ironsource.C2962b1(str);
            if (!c2962b1.g()) {
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.r, (java.lang.String) null);
                return;
            }
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            java.lang.String d2 = c2962b1.d();
            if (com.ironsource.C3202o8.e.RewardedVideo.toString().equalsIgnoreCase(d2) && com.ironsource.sdk.controller.v.this.r(d2)) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.r(java.lang.Integer.parseInt(c2962b1.c()), fetchDemandSourceId, c2962b1));
            }
        }

        @android.webkit.JavascriptInterface
        public void adViewAPI(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.j(str);
                }
            }, com.ironsource.Q7.l);
        }

        @android.webkit.JavascriptInterface
        public void androidSandboxApi(final java.lang.String str) {
            com.ironsource.Q7.f5934a.b(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.k(str);
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void bannerViewAPI(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @android.webkit.JavascriptInterface
        public void cleanAdInstance(java.lang.String str) {
            com.ironsource.C3202o8.e g2;
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "cleanAdInstance(" + str + ")");
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.m);
                java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
                if (android.text.TextUtils.isEmpty(fetchDemandSourceId) || (g2 = com.ironsource.sdk.controller.v.this.g(d2)) == null) {
                    return;
                }
                com.ironsource.sdk.controller.v.this.H.b(g2, fetchDemandSourceId);
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void clearLastUpdateTimeData(java.lang.String str) {
            try {
                java.util.ArrayList<java.lang.String> a2 = com.ironsource.C2989ca.e().a();
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                if (!a2.isEmpty()) {
                    c3101ie.b(com.ironsource.X3.i.x0, a2.toString());
                }
                com.ironsource.sdk.controller.v.this.a(c3101ie.toString(), true, (java.lang.String) null, (java.lang.String) null);
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void deleteFile(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.l(str);
                }
            }, "deleteFile");
        }

        @android.webkit.JavascriptInterface
        public void deleteFolder(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.m(str);
                }
            }, "deleteFolder");
        }

        @android.webkit.JavascriptInterface
        public void destroyInlineStore(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "destroyInlineStore() called");
            try {
                com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a2 = new com.unity3d.ironsourceads.internal.services.b().a(com.ironsource.sdk.controller.v.this.q(), com.ironsource.EnumC3131k9.b.a(new com.ironsource.C3101ie(str).a(com.ironsource.X3.f.e, com.ironsource.EnumC3131k9.APP_ACTIVITY.b())));
                if (a2 instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a) {
                    com.ironsource.sdk.controller.v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a) a2).b(), (java.lang.String) null);
                } else {
                    com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getLocalizedMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void deviceDataAPI(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.n(str);
                }
            }, com.ironsource.Q7.k);
        }

        @android.webkit.JavascriptInterface
        public void displayWebView(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "displayWebView(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            boolean booleanValue = ((java.lang.Boolean) c3101ie.b("display")).booleanValue();
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.m);
            boolean c2 = c3101ie.c(com.ironsource.X3.i.u);
            java.lang.String d3 = c3101ie.d("adViewId");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            boolean c3 = c3101ie.c(com.ironsource.X3.i.z0);
            if (!booleanValue) {
                com.ironsource.sdk.controller.v.this.a(com.ironsource.sdk.controller.v.EnumC0167v.Gone);
                com.ironsource.sdk.controller.v.this.o();
                return;
            }
            com.ironsource.sdk.controller.v.this.G = c3101ie.c(com.ironsource.X3.i.v);
            boolean c4 = c3101ie.c(com.ironsource.X3.i.y);
            com.ironsource.sdk.controller.v.EnumC0167v v = com.ironsource.sdk.controller.v.this.v();
            com.ironsource.sdk.controller.v.EnumC0167v enumC0167v = com.ironsource.sdk.controller.v.EnumC0167v.Display;
            if (v == enumC0167v) {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "State: " + com.ironsource.sdk.controller.v.this.w);
                return;
            }
            com.ironsource.sdk.controller.v.this.a(enumC0167v);
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "State: " + com.ironsource.sdk.controller.v.this.w);
            android.content.Context q2 = com.ironsource.sdk.controller.v.this.q();
            java.lang.String t2 = com.ironsource.sdk.controller.v.this.t();
            int L = com.ironsource.sdk.controller.v.this.Z.L(q2);
            if (c2) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(q2);
                hVar.addView(com.ironsource.sdk.controller.v.this.v);
                hVar.a(com.ironsource.sdk.controller.v.this);
                return;
            }
            android.content.Intent intent = c4 ? new android.content.Intent(q2, (java.lang.Class<?>) com.ironsource.sdk.controller.InterstitialActivity.class) : new android.content.Intent(q2, (java.lang.Class<?>) com.ironsource.sdk.controller.ControllerActivity.class);
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d2)) {
                if ("application".equals(t2)) {
                    t2 = com.ironsource.sdk.utils.SDKUtils.translateRequestedOrientation(com.ironsource.sdk.controller.v.this.Z.N(q2));
                }
                intent.putExtra(com.ironsource.X3.i.m, eVar.toString());
                com.ironsource.sdk.controller.v.this.E.a(eVar.ordinal());
                com.ironsource.sdk.controller.v.this.E.f(fetchDemandSourceId);
                if (com.ironsource.sdk.controller.v.this.r(eVar.toString())) {
                    com.ironsource.sdk.controller.v.this.y.c(eVar, fetchDemandSourceId);
                }
            } else {
                com.ironsource.C3202o8.e eVar2 = com.ironsource.C3202o8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(d2)) {
                    if ("application".equals(t2)) {
                        t2 = com.ironsource.sdk.utils.SDKUtils.translateRequestedOrientation(com.ironsource.sdk.controller.v.this.Z.N(q2));
                    }
                    intent.putExtra(com.ironsource.X3.i.m, eVar2.toString());
                }
            }
            if (d3 != null) {
                intent.putExtra("adViewId", d3);
            }
            intent.putExtra(com.ironsource.X3.i.z0, c3);
            intent.setFlags(536870912);
            intent.putExtra(com.ironsource.X3.i.v, com.ironsource.sdk.controller.v.this.G);
            intent.putExtra(com.ironsource.X3.i.A, t2);
            intent.putExtra(com.ironsource.X3.i.B, L);
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            vVar.j = new com.ironsource.sdk.controller.v.q(vVar.g(d2), fetchDemandSourceId);
            q2.startActivity(intent);
        }

        @android.webkit.JavascriptInterface
        public void dsSharedSignalsAPI(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.o(str);
                }
            }, com.ironsource.Q7.f);
        }

        @android.webkit.JavascriptInterface
        public void fileSystemAPI(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "fileSystemAPI(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(new com.ironsource.sdk.controller.v.s.RunnableC0165s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) == false) goto L11;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getApplicationInfo(" + str + ")");
            java.lang.String e2 = com.ironsource.sdk.controller.v.this.e(str);
            java.lang.String d2 = com.ironsource.sdk.controller.v.this.d(str);
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.Object[] f2 = com.ironsource.sdk.controller.v.this.f(c3101ie.d(com.ironsource.X3.i.m), com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie));
            java.lang.String str2 = (java.lang.String) f2[0];
            if (((java.lang.Boolean) f2[1]).booleanValue()) {
                if (!android.text.TextUtils.isEmpty(d2)) {
                    e2 = d2;
                }
                e2 = null;
            }
            if (android.text.TextUtils.isEmpty(e2)) {
                return;
            }
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(e2, str2, com.ironsource.X3.h.n, com.ironsource.X3.h.o));
        }

        @android.webkit.JavascriptInterface
        public void getCachedFilesMap(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.p(str);
                }
            }, com.ironsource.Q7.i);
        }

        @android.webkit.JavascriptInterface
        public void getConnectivityInfo(java.lang.String str) {
            java.lang.String e2;
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getConnectivityInfo(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d(com.ironsource.sdk.controller.v.i0);
            java.lang.String d3 = c3101ie.d(com.ironsource.sdk.controller.v.j0);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            com.ironsource.R3 r3 = vVar.S;
            if (r3 != null) {
                jSONObject = r3.a(vVar.b0.getContext());
            }
            if (jSONObject.length() > 0) {
                e2 = com.ironsource.sdk.controller.v.this.e(d2, jSONObject.toString());
            } else {
                e2 = com.ironsource.sdk.controller.v.this.e(d3, com.ironsource.sdk.controller.v.this.a("errMsg", com.ironsource.X3.c.A, null, null, null, null, null, null, null, false));
            }
            com.ironsource.sdk.controller.v.this.i(e2);
        }

        @android.webkit.JavascriptInterface
        public void getControllerConfig(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getControllerConfig(" + str + ")");
            java.lang.String d2 = new com.ironsource.C3101ie(str).d(com.ironsource.sdk.controller.v.i0);
            if (android.text.TextUtils.isEmpty(d2)) {
                return;
            }
            org.json.JSONObject controllerConfigAsJSONObject = com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.e(d2, controllerConfigAsJSONObject.toString()));
        }

        @android.webkit.JavascriptInterface
        public void getDemandSourceState(java.lang.String str) {
            java.lang.String d2;
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getMediationState(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d3 = c3101ie.d("demandSourceName");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            java.lang.String d4 = c3101ie.d(com.ironsource.X3.i.m);
            if (d4 == null || d3 == null) {
                return;
            }
            try {
                com.ironsource.C3202o8.e productType = com.ironsource.sdk.utils.SDKUtils.getProductType(d4);
                if (productType != null) {
                    com.ironsource.T4 a2 = com.ironsource.sdk.controller.v.this.H.a(productType, fetchDemandSourceId);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.ironsource.X3.i.m, d4);
                    jSONObject.put("demandSourceName", d3);
                    jSONObject.put("demandSourceId", fetchDemandSourceId);
                    if (a2 == null || a2.a(-1)) {
                        d2 = com.ironsource.sdk.controller.v.this.d(str);
                    } else {
                        d2 = com.ironsource.sdk.controller.v.this.e(str);
                        jSONObject.put("state", a2.j());
                    }
                    a(d2, jSONObject.toString());
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void getDeviceStatus(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.q(str);
                }
            }, com.ironsource.Q7.d);
        }

        @android.webkit.JavascriptInterface
        public void getDeviceVolume(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getDeviceVolume(" + str + ")");
            try {
                android.content.Context context = com.ironsource.sdk.controller.v.this.b0.getContext();
                float a2 = com.ironsource.X4.b(context).a(context);
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                c3101ie.b(com.ironsource.X3.j.P, java.lang.String.valueOf(a2));
                com.ironsource.sdk.controller.v.this.a(c3101ie.toString(), true, (java.lang.String) null, (java.lang.String) null);
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void getInitSummery(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getInitSummery(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            c3101ie.a(com.ironsource.X3.j.s0, com.ironsource.sdk.controller.v.this.T);
            com.ironsource.sdk.controller.v.this.a(c3101ie.toString(), true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void getOrientation(java.lang.String str) {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.z, new com.ironsource.C3238q8().a(com.ironsource.B5.y, str).a());
            java.lang.String e2 = com.ironsource.sdk.controller.v.this.e(str);
            java.lang.String jSONObject = com.ironsource.sdk.utils.SDKUtils.getOrientation(com.ironsource.sdk.controller.v.this.b0.getContext()).toString();
            if (android.text.TextUtils.isEmpty(e2)) {
                return;
            }
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(e2, jSONObject, com.ironsource.X3.h.X, com.ironsource.X3.h.Y));
        }

        @android.webkit.JavascriptInterface
        public void getUserData(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "getUserData(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            if (!c3101ie.a(com.ironsource.X3.i.W)) {
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.F, (java.lang.String) null);
                return;
            }
            java.lang.String e2 = com.ironsource.sdk.controller.v.this.e(str);
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.W);
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.e(e2, com.ironsource.sdk.controller.v.this.a(d2, com.ironsource.C2989ca.e().a(d2), null, null, null, null, null, null, null, false)));
        }

        @android.webkit.JavascriptInterface
        public void iabTokenAPI(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.r(str);
                }
            }, com.ironsource.Q7.e);
        }

        @android.webkit.JavascriptInterface
        public void initController(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "initController(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            android.os.CountDownTimer countDownTimer = com.ironsource.sdk.controller.v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                com.ironsource.sdk.controller.v.this.m = null;
            }
            if (c3101ie.a(com.ironsource.X3.i.q)) {
                java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.q);
                if (com.ironsource.X3.i.s.equalsIgnoreCase(d2)) {
                    com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
                    vVar.i = true;
                    vVar.R.d();
                } else {
                    if (com.ironsource.X3.i.r.equalsIgnoreCase(d2)) {
                        com.ironsource.sdk.controller.v.this.R.c();
                        return;
                    }
                    if (!com.ironsource.X3.i.t.equalsIgnoreCase(d2)) {
                        com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "No STAGE mentioned! should not get here!");
                        return;
                    }
                    java.lang.String d3 = c3101ie.d("errMsg");
                    com.ironsource.sdk.controller.v.this.R.c("controller js failed to initialize : " + d3);
                }
            }
        }

        @android.webkit.JavascriptInterface
        public void omidAPI(java.lang.String str) {
            com.ironsource.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.s.n(str));
        }

        @android.webkit.JavascriptInterface
        public void onAdWindowsClosed(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onAdWindowsClosed(" + str + ")");
            com.ironsource.sdk.controller.v.this.E.a();
            com.ironsource.sdk.controller.v.this.E.f(null);
            com.ironsource.sdk.controller.v.this.j = null;
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.m);
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            com.ironsource.C3202o8.e g2 = com.ironsource.sdk.controller.v.this.g(d2);
            android.util.Log.d(com.ironsource.sdk.controller.v.this.d, "onAdClosed() with type " + g2);
            if (com.ironsource.sdk.controller.v.this.r(d2)) {
                com.ironsource.sdk.controller.v.this.a(g2, fetchDemandSourceId);
            }
        }

        @android.webkit.JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @android.webkit.JavascriptInterface
        public void onGetApplicationInfoFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onGetApplicationInfoFail(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetApplicationInfoSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onGetApplicationInfoSuccess(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetCachedFilesMapFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onGetCachedFilesMapFail(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetCachedFilesMapSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onGetCachedFilesMapSuccess(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetDeviceStatusFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onGetDeviceStatusFail(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetDeviceStatusSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onGetDeviceStatusSuccess(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onInitBannerFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitBannerFail(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("errMsg");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitBannerFail failed with no demand source");
                return;
            }
            com.ironsource.U4 u4 = com.ironsource.sdk.controller.v.this.H;
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Banner;
            com.ironsource.T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (com.ironsource.sdk.controller.v.this.r(eVar.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.h(d2, fetchDemandSourceId));
            }
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onInitBannerSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitBannerSuccess()");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(new com.ironsource.C3101ie(str));
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitBannerSuccess failed with no demand source");
            } else if (com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Banner.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.g(fetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onInitInterstitialFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitInterstitialFail(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("errMsg");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.U4 u4 = com.ironsource.sdk.controller.v.this.H;
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Interstitial;
            com.ironsource.T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (com.ironsource.sdk.controller.v.this.r(eVar.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.c(d2, fetchDemandSourceId));
            }
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onInitInterstitialSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitInterstitialSuccess()");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(new com.ironsource.C3101ie(str));
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Interstitial.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.b(fetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onInitRewardedVideoFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("errMsg");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            com.ironsource.U4 u4 = com.ironsource.sdk.controller.v.this.H;
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.RewardedVideo;
            com.ironsource.T4 a2 = u4.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.b(3);
            }
            if (com.ironsource.sdk.controller.v.this.r(eVar.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.RunnableC0166v(d2, fetchDemandSourceId));
            }
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onLoadBannerFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onLoadBannerFail()");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("errMsg");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (!android.text.TextUtils.isEmpty(fetchDemandSourceId) && com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Banner.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.j(d2, fetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onLoadBannerSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onLoadBannerSuccess()");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            java.lang.String d2 = c3101ie.d("adViewId");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            com.ironsource.G8 a2 = com.ironsource.C3148l8.a().a(d2);
            if (a2 == null) {
                com.ironsource.sdk.controller.v.this.A.c(fetchDemandSourceId, "not found view for the current adViewId= " + d2);
                return;
            }
            if (a2 instanceof com.ironsource.C3041f8) {
                com.ironsource.C3041f8 c3041f8 = (com.ironsource.C3041f8) a2;
                if (com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Banner.toString())) {
                    com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.i(fetchDemandSourceId, c3041f8));
                }
            }
        }

        @android.webkit.JavascriptInterface
        public void onLoadInterstitialFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("errMsg");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Interstitial.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.f(d2, fetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onLoadInterstitialSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            org.json.JSONObject a2 = c3101ie.a();
            a(fetchDemandSourceId, true);
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Interstitial.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.e(fetchDemandSourceId, a2));
            }
        }

        @android.webkit.JavascriptInterface
        public void onReceivedMessage(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onReceivedMessage(" + str + ")");
            com.ironsource.Q7.f5934a.b(new com.ironsource.sdk.controller.v.s.l(str));
        }

        @android.webkit.JavascriptInterface
        public void onShowInterstitialFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onShowInterstitialFail(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            final java.lang.String d2 = c3101ie.d("errMsg");
            final java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            final boolean r2 = com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.Interstitial.toString());
            com.ironsource.sdk.controller.v.this.b(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.a(r2, d2, fetchDemandSourceId);
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void onShowInterstitialSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onShowInterstitialSuccess(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            final java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(new com.ironsource.C3101ie(str));
            if (android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            com.ironsource.C2980c1 c2980c1 = com.ironsource.sdk.controller.v.this.E;
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Interstitial;
            c2980c1.a(eVar.ordinal());
            com.ironsource.sdk.controller.v.this.E.f(fetchDemandSourceId);
            final boolean r2 = com.ironsource.sdk.controller.v.this.r(eVar.toString());
            com.ironsource.sdk.controller.v.this.b(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.a(r2, fetchDemandSourceId);
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void onShowRewardedVideoFail(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("errMsg");
            java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
            if (com.ironsource.sdk.controller.v.this.r(com.ironsource.C3202o8.e.RewardedVideo.toString())) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.a(d2, fetchDemandSourceId));
            }
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onShowRewardedVideoSuccess(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onShowRewardedVideoSuccess(" + str + ")");
            com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onVideoStatusChanged(java.lang.String str) {
            android.util.Log.d(com.ironsource.sdk.controller.v.this.c, "onVideoStatusChanged(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.m);
            if (com.ironsource.sdk.controller.v.this.D == null || android.text.TextUtils.isEmpty(d2)) {
                return;
            }
            java.lang.String d3 = c3101ie.d("status");
            if (com.ironsource.X3.i.d0.equalsIgnoreCase(d3)) {
                com.ironsource.sdk.controller.v.this.D.onVideoStarted();
                return;
            }
            if (com.ironsource.X3.i.e0.equalsIgnoreCase(d3)) {
                com.ironsource.sdk.controller.v.this.D.onVideoPaused();
                return;
            }
            if (com.ironsource.X3.i.f0.equalsIgnoreCase(d3)) {
                com.ironsource.sdk.controller.v.this.D.onVideoResumed();
                return;
            }
            if (com.ironsource.X3.i.g0.equalsIgnoreCase(d3)) {
                com.ironsource.sdk.controller.v.this.D.onVideoEnded();
                return;
            }
            if (com.ironsource.X3.i.h0.equalsIgnoreCase(d3)) {
                com.ironsource.sdk.controller.v.this.D.onVideoStopped();
                return;
            }
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onVideoStatusChanged: unknown status: " + d3);
        }

        @android.webkit.JavascriptInterface
        public void openInlineStore(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "openInlineStore(" + str + ")");
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a2 = new com.unity3d.ironsourceads.internal.services.b().a(com.ironsource.sdk.controller.v.this.q(), new com.ironsource.C3096i9(c3101ie.d("url"), c3101ie.d(com.ironsource.X3.f.c), com.ironsource.EnumC3131k9.b.a(c3101ie.a(com.ironsource.X3.f.e, com.ironsource.EnumC3131k9.APP_ACTIVITY.b())), (!c3101ie.a(com.ironsource.X3.f.d) || c3101ie.e(com.ironsource.X3.f.d)) ? null : (org.json.JSONObject) c3101ie.b(com.ironsource.X3.f.d)));
                if (a2 instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a) {
                    com.ironsource.sdk.controller.v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a) a2).b(), (java.lang.String) null);
                } else {
                    com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getLocalizedMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void openUrl(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "openUrl(" + str + ")");
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                com.ironsource.sdk.controller.p.c a2 = new com.ironsource.sdk.controller.p.a(c3101ie.d("method"), new com.ironsource.Rc(com.ironsource.sdk.controller.v.this.G, 805306368)).a(c3101ie.c(com.ironsource.X3.i.L0) ? com.ironsource.sdk.controller.v.this.b0.getContext() : com.ironsource.sdk.controller.v.this.q(), new com.ironsource.Qc(c3101ie.d("url"), c3101ie.d("package_name")));
                if (a2 instanceof com.ironsource.sdk.controller.p.c.a) {
                    com.ironsource.sdk.controller.v.this.a(str, false, ((com.ironsource.sdk.controller.p.c.a) a2).b(), (java.lang.String) null);
                } else {
                    com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getLocalizedMessage(), (java.lang.String) null);
            }
        }

        @android.webkit.JavascriptInterface
        public void pauseControllerWebview() {
            com.ironsource.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.s.o());
        }

        @android.webkit.JavascriptInterface
        public void permissionsAPI(final java.lang.String str) {
            com.ironsource.sdk.controller.v.this.f6673a.a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.sdk.controller.v.s.this.s(str);
                }
            }, com.ironsource.Q7.j);
        }

        @android.webkit.JavascriptInterface
        public void postAdEventNotification(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "postAdEventNotification(" + str + ")");
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.j0);
                if (android.text.TextUtils.isEmpty(d2)) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.w, (java.lang.String) null);
                    return;
                }
                java.lang.String d3 = c3101ie.d(com.ironsource.X3.i.k0);
                java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(c3101ie);
                java.lang.String str2 = !android.text.TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d3;
                org.json.JSONObject jSONObject = (org.json.JSONObject) c3101ie.b(com.ironsource.X3.i.l0);
                java.lang.String d4 = c3101ie.d(com.ironsource.X3.i.m);
                com.ironsource.C3202o8.e g2 = com.ironsource.sdk.controller.v.this.g(d4);
                if (!com.ironsource.sdk.controller.v.this.r(d4)) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.v, (java.lang.String) null);
                    return;
                }
                java.lang.String e2 = com.ironsource.sdk.controller.v.this.e(str);
                if (!android.text.TextUtils.isEmpty(e2)) {
                    com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(e2, com.ironsource.sdk.controller.v.this.a(com.ironsource.X3.i.m, d4, com.ironsource.X3.i.j0, d2, "demandSourceName", d3, "demandSourceId", str2, null, false), com.ironsource.X3.h.c0, com.ironsource.X3.h.d0));
                }
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.m(g2, str2, d2, jSONObject));
            } catch (java.lang.Exception e3) {
                com.ironsource.C3180n4.d().a(e3);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void removeCloseEventHandler(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "removeCloseEventHandler(" + str + ")");
            android.os.CountDownTimer countDownTimer = com.ironsource.sdk.controller.v.this.l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            com.ironsource.sdk.controller.v.this.k = true;
        }

        @android.webkit.JavascriptInterface
        public void removeMessagingInterface(java.lang.String str) {
            com.ironsource.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.s.p());
        }

        @android.webkit.JavascriptInterface
        public void requestToDestroyBanner(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @android.webkit.JavascriptInterface
        public void resumeControllerWebview() {
            com.ironsource.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.s.k());
        }

        @android.webkit.JavascriptInterface
        public void saveFile(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "saveFile(" + str + ")");
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                java.lang.String d2 = c3101ie.d("path");
                java.lang.String d3 = c3101ie.d("file");
                if (android.text.TextUtils.isEmpty(d3)) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.g, "1");
                    return;
                }
                com.ironsource.C3381y8 c3381y8 = new com.ironsource.C3381y8(com.ironsource.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(com.ironsource.sdk.controller.v.this.B, d2), com.ironsource.sdk.utils.SDKUtils.getFileName(d3));
                com.ironsource.sdk.utils.IronSourceStorageUtils.ensurePathSafety(c3381y8, com.ironsource.sdk.controller.v.this.B);
                com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
                if (vVar.Z.a(vVar.B) <= 0) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.Z3.A, (java.lang.String) null);
                    return;
                }
                if (c3381y8.exists()) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.Z3.z, (java.lang.String) null);
                    return;
                }
                if (!com.ironsource.T3.h(com.ironsource.sdk.controller.v.this.b0.getContext())) {
                    com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.Z3.C, (java.lang.String) null);
                    return;
                }
                com.ironsource.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
                com.ironsource.sdk.controller.v.this.h.a(c3381y8, d3, c3101ie.a("connectionTimeout", 0), c3101ie.a("readTimeout", 0));
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void setBackButtonState(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setBackButtonState(" + str + ")");
            com.ironsource.C2989ca.e().c(new com.ironsource.C3101ie(str).d("state"));
        }

        @android.webkit.JavascriptInterface
        public void setForceClose(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setForceClose(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            java.lang.String d2 = c3101ie.d("width");
            java.lang.String d3 = c3101ie.d("height");
            com.ironsource.sdk.controller.v.this.o = java.lang.Integer.parseInt(d2);
            com.ironsource.sdk.controller.v.this.p = java.lang.Integer.parseInt(d3);
            com.ironsource.sdk.controller.v.this.q = c3101ie.d("position");
        }

        @android.webkit.JavascriptInterface
        public void setMixedContentAlwaysAllow(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setMixedContentAlwaysAllow(" + str + ")");
            com.ironsource.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.s.q());
        }

        @android.webkit.JavascriptInterface
        public void setOrientation(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setOrientation(" + str + ")");
                java.lang.String d2 = new com.ironsource.C3101ie(str).d("orientation");
                com.ironsource.sdk.controller.v.this.o(d2);
                com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
                if (vVar.c0 != null) {
                    com.ironsource.sdk.controller.v.this.c0.onOrientationChanged(d2, vVar.Z.L(vVar.b0.getContext()));
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void setStoreSearchKeys(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setStoreSearchKeys(" + str + ")");
            com.ironsource.C2989ca.e().e(str);
        }

        @android.webkit.JavascriptInterface
        public void setUserData(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setUserData(" + str + ")");
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
            if (!c3101ie.a(com.ironsource.X3.i.W)) {
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.F, (java.lang.String) null);
                return;
            }
            if (!c3101ie.a("value")) {
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.G, (java.lang.String) null);
                return;
            }
            java.lang.String d2 = c3101ie.d(com.ironsource.X3.i.W);
            java.lang.String d3 = c3101ie.d("value");
            com.ironsource.C2989ca.e().a(d2, d3);
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.e(com.ironsource.sdk.controller.v.this.e(str), com.ironsource.sdk.controller.v.this.a(d2, d3, null, null, null, null, null, null, null, false)));
        }

        @android.webkit.JavascriptInterface
        public void setWebviewBackgroundColor(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "setWebviewBackgroundColor(" + str + ")");
            com.ironsource.sdk.controller.v.this.q(str);
        }

        @android.webkit.JavascriptInterface
        public void stillAlive(java.lang.String str) {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "stillAlive(" + str + ")");
            com.ironsource.sdk.controller.v.this.b.a();
        }

        void u(java.lang.String str) {
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(com.ironsource.X3.h.d, str, (java.lang.String) null, (java.lang.String) null));
        }

        void v(java.lang.String str) {
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.a(com.ironsource.X3.h.e, str, (java.lang.String) null, (java.lang.String) null));
        }

        public class w implements com.ironsource.InterfaceC3168ma {
            public w() {
            }

            @Override // com.ironsource.InterfaceC3168ma
            public void a(boolean z, java.lang.String str, java.lang.String str2) {
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
                c3101ie.b(z ? com.ironsource.sdk.controller.v.i0 : com.ironsource.sdk.controller.v.j0, str);
                c3101ie.b("data", str2);
                com.ironsource.sdk.controller.v.this.a(c3101ie.toString(), z, (java.lang.String) null, (java.lang.String) null);
            }

            @Override // com.ironsource.InterfaceC3168ma
            public void a(boolean z, java.lang.String str, com.ironsource.C3101ie c3101ie) {
                c3101ie.b(z ? com.ironsource.sdk.controller.v.i0 : com.ironsource.sdk.controller.v.j0, str);
                com.ironsource.sdk.controller.v.this.a(c3101ie.toString(), z, (java.lang.String) null, (java.lang.String) null);
            }

            @Override // com.ironsource.InterfaceC3168ma
            public void a(boolean z, java.lang.String str, org.json.JSONObject jSONObject) {
                java.lang.String str2;
                try {
                    if (z) {
                        str2 = com.ironsource.sdk.controller.v.i0;
                    } else {
                        str2 = com.ironsource.sdk.controller.v.j0;
                    }
                    jSONObject.put(str2, str);
                    com.ironsource.sdk.controller.v.this.a(jSONObject.toString(), z, (java.lang.String) null, (java.lang.String) null);
                } catch (org.json.JSONException e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        private void a(org.json.JSONObject jSONObject, java.lang.String str) {
            if (b(str)) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (org.json.JSONException e2) {
                    com.ironsource.C3180n4.d().a(e2);
                    com.ironsource.sdk.utils.Logger.d(com.ironsource.sdk.controller.v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "deleteFile(" + str + ")");
                com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(str);
                java.lang.String d2 = c3101ie.d("file");
                java.lang.String d3 = c3101ie.d("path");
                if (d3 != null && !android.text.TextUtils.isEmpty(d2)) {
                    com.ironsource.C3381y8 c3381y8 = new com.ironsource.C3381y8(com.ironsource.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(com.ironsource.sdk.controller.v.this.B, d3), d2);
                    com.ironsource.sdk.utils.IronSourceStorageUtils.ensurePathSafety(c3381y8, com.ironsource.sdk.controller.v.this.B);
                    if (!c3381y8.exists()) {
                        com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.f, "1");
                        return;
                    } else {
                        com.ironsource.sdk.controller.v.this.a(str, com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(c3381y8), (java.lang.String) null, (java.lang.String) null);
                        return;
                    }
                }
                com.ironsource.sdk.controller.v.this.a(str, false, com.ironsource.X3.c.g, "1");
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        private void a(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.ironsource.sdk.controller.v.this.i(com.ironsource.sdk.controller.v.this.e(str, str2));
        }

        private void a(java.lang.String str, int i2) {
            com.ironsource.T4 a2;
            com.ironsource.sdk.controller.v vVar = com.ironsource.sdk.controller.v.this;
            com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (a2 = com.ironsource.sdk.controller.v.this.H.a(eVar, str)) != null && a2.k()) {
                com.ironsource.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.s.u(str, i2));
            }
        }

        boolean b(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str) || str.contains(com.ironsource.C2945a2.f)) {
                return false;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (org.json.JSONException e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, java.lang.String str) {
            if (z) {
                com.ironsource.sdk.controller.v.this.z.c(com.ironsource.C3202o8.e.Interstitial, str);
                com.ironsource.sdk.controller.v.this.z.b(str);
            }
            a(str, false);
        }

        private void a(java.lang.String str, boolean z) {
            com.ironsource.T4 a2 = com.ironsource.sdk.controller.v.this.H.a(com.ironsource.C3202o8.e.Interstitial, str);
            if (a2 != null) {
                a2.a(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, java.lang.String str, java.lang.String str2) {
            if (z) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                com.ironsource.sdk.controller.v.this.z.d(str2, str);
            }
            a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void j(java.lang.String str) {
            try {
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "adViewAPI(" + str + ")");
                com.ironsource.sdk.controller.v.this.M.a(new com.ironsource.C3101ie(str).toString(), new com.ironsource.sdk.controller.v.s.w());
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String e(java.lang.String str) {
        return new com.ironsource.C3101ie(str).d(i0);
    }

    public void e(org.json.JSONObject jSONObject) {
        com.ironsource.sdk.utils.Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(com.ironsource.X3.h.y, a(com.ironsource.X3.j.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    public void n(java.lang.String str) {
        try {
            java.lang.String d2 = com.ironsource.U3.d(this.b0.getContext());
            com.ironsource.sdk.utils.Logger.i(this.c, "device status changed, connection type " + str);
            com.ironsource.C3291t8.a(str);
            com.ironsource.C3291t8.b(d2);
            i(e(com.ironsource.X3.h.x, a("connectionType", str, "rawConnectionType", d2, null, null, null, null, null, false)));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Exception: " + android.util.Log.getStackTraceString(e2));
        }
    }

    public void b(int i2) {
        e0 = i2;
    }

    private void p(java.lang.String str) {
        if (str.equalsIgnoreCase("0")) {
            this.b0.getSettings().setCacheMode(2);
        } else {
            this.b0.getSettings().setCacheMode(-1);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        a(t4, map);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(com.ironsource.T4 t4) {
        java.util.Map<java.lang.String, java.lang.String> b2 = t4.b();
        if (b2 != null) {
            i(e(com.ironsource.X3.h.T, com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(b2)));
        }
        this.H.b(com.ironsource.C3202o8.e.Interstitial, t4.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.C3202o8.e g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        com.ironsource.C3202o8.e eVar2 = com.ironsource.C3202o8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        com.ironsource.C3202o8.e eVar3 = com.ironsource.C3202o8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public android.content.Context q() {
        return this.a0.a();
    }

    private java.lang.String d(org.json.JSONObject jSONObject) {
        com.ironsource.X4 b2 = com.ironsource.X4.b(this.b0.getContext());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String sDKVersion = com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
        if (!android.text.TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append(com.ironsource.X3.j.c);
        }
        java.lang.String e2 = b2.e();
        if (!android.text.TextUtils.isEmpty(e2)) {
            sb.append("deviceOs=");
            sb.append(e2);
        }
        android.net.Uri parse = android.net.Uri.parse(com.ironsource.sdk.utils.SDKUtils.getControllerUrl());
        if (parse != null) {
            java.lang.String str = parse.getScheme() + ":";
            java.lang.String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol=");
            sb.append(str);
            sb.append("&domain=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    java.lang.String jSONObject2 = new org.json.JSONObject(jSONObject, new java.lang.String[]{com.ironsource.X3.j.Z, com.ironsource.X3.j.g}).toString();
                    if (!android.text.TextUtils.isEmpty(jSONObject2)) {
                        sb.append(com.ironsource.X3.j.c);
                        sb.append("controllerConfig");
                        sb.append(com.ironsource.X3.j.b);
                        sb.append(jSONObject2);
                    }
                } catch (org.json.JSONException e3) {
                    com.ironsource.C3180n4.d().a(e3);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
                }
            }
            sb.append("&debug=");
            sb.append(r());
            boolean featureFlagLoadControllerAndPlayerFromBundle = com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean b3 = com.ironsource.C3019e4.b(this.b0.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && b3) {
                sb.append("&chfb=true");
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb.toString();
    }

    private void c(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("gpi"), com.ironsource.C2974bd.e(this.b0.getContext()));
        jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.p0), com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.C2974bd.b(this.b0.getContext())));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(org.json.JSONObject jSONObject) {
        i(e(com.ironsource.X3.h.e0, jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(com.ironsource.X3.h.u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(android.content.Context context) {
        try {
            com.ironsource.R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.b(context);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    private void a(android.webkit.WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), com.ironsource.X3.d);
        webView.addJavascriptInterface(b(sVar), com.ironsource.X3.e);
    }

    private java.lang.String b(java.lang.String str) {
        java.lang.String str2 = this.B + java.io.File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            i(e(com.ironsource.X3.h.q, a("file", str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
    }

    private boolean c(com.ironsource.C3381y8 c3381y8) {
        int i2;
        boolean copyFileFromBundleToStorage = com.ironsource.sdk.utils.SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c3381y8);
        if (!copyFileFromBundleToStorage) {
            return false;
        }
        byte[] a2 = com.ironsource.C3019e4.a(this.b0.getContext(), com.ironsource.X3.g);
        java.lang.String a3 = com.ironsource.C3019e4.a(this.b0.getContext());
        if (a3 != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(c3381y8.getParent());
            java.lang.String str = java.io.File.separator;
            sb.append(str);
            sb.append("controller_");
            sb.append(a3);
            sb.append(str);
            sb.append(com.ironsource.X3.g);
            java.lang.String sb2 = sb.toString();
            if (a2 == null || a2.length == 0) {
                return copyFileFromBundleToStorage;
            }
            try {
                i2 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(a2, sb2);
            } catch (java.lang.Exception e2) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception: " + e2.getMessage());
                copyFileFromBundleToStorage = false;
                i2 = 0;
            }
            if (i2 != 0) {
                return copyFileFromBundleToStorage;
            }
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("failed to read bytes for " + c3381y8.getName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        return new com.ironsource.sdk.controller.m.a(str, str2).a();
    }

    com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new com.ironsource.sdk.controller.v.s()), sVar);
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.I = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.J = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.K = uVar;
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.L = iVar;
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.M = aVar;
        aVar.a(p());
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.N = jVar;
    }

    public void b(boolean z, java.lang.String str) {
        i(e(com.ironsource.X3.h.V, a(com.ironsource.X3.i.K, str, null, null, null, null, null, null, com.ironsource.X3.i.o, z)));
    }

    public void a(com.ironsource.C3302u1 c3302u1) {
        this.O = c3302u1;
    }

    private void a(android.content.Context context, android.webkit.WebView webView) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        this.v = new android.widget.FrameLayout(context);
        this.t = new android.widget.FrameLayout(context);
        this.t.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.t.setVisibility(8);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.v.addView(this.t, layoutParams);
        this.v.addView(frameLayout);
    }

    private java.lang.String b(java.lang.String str, java.lang.String str2) {
        return a(str, str2, "errMsg");
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(android.content.Context context) {
        a(new com.ironsource.sdk.controller.v.d(context));
    }

    void b(java.lang.Runnable runnable) {
        com.ironsource.Q7 q7 = this.f6673a;
        if (q7 != null) {
            q7.c(runnable);
        }
    }

    public void c(java.lang.String str) {
        if (str.equals(com.ironsource.X3.i.i)) {
            o();
        }
        i(e(com.ironsource.X3.h.z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    private void a(android.webkit.WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    private java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.ironsource.sdk.controller.m.a(str, null, str2, str3).a();
    }

    public void a(com.ironsource.C3359x4 c3359x4) {
        this.P = c3359x4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.InterfaceC3251r4 a(com.ironsource.C3202o8.e eVar) {
        if (eVar == com.ironsource.C3202o8.e.Interstitial) {
            return this.z;
        }
        if (eVar == com.ironsource.C3202o8.e.RewardedVideo) {
            return this.y;
        }
        if (eVar == com.ironsource.C3202o8.e.Banner) {
            return this.A;
        }
        return null;
    }

    void c(java.lang.Runnable runnable) {
        com.ironsource.Q7 q7 = this.f6673a;
        if (q7 != null) {
            q7.d(runnable);
        }
    }

    public void a(com.ironsource.InterfaceC3371xg interfaceC3371xg) {
        this.D = interfaceC3371xg;
    }

    public void a(int i2) {
        java.lang.String uri;
        if (!this.X && !this.C.m()) {
            com.ironsource.sdk.utils.Logger.i(this.c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        org.json.JSONObject controllerConfigAsJSONObject = com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject();
        java.lang.String d2 = d(controllerConfigAsJSONObject);
        java.util.Map<java.lang.String, java.lang.String> initSDKParams = com.ironsource.sdk.utils.SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            d2 = java.lang.String.format("%s&sessionid=%s", d2, initSDKParams.get("sessionid"));
        }
        if (this.X) {
            uri = this.W.c().toURI().toString();
        } else {
            uri = this.C.g().toURI().toString();
        }
        this.f6673a.d(new com.ironsource.sdk.controller.v.i(controllerConfigAsJSONObject, this.b0, i2, uri + "?" + d2));
        n();
        this.m = new com.ironsource.sdk.controller.v.j(com.ironsource.Jb.Y().h().G() * 1000, 1000L, i2, com.ironsource.Jb.Y().h().c()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(android.content.Context context) {
        try {
            com.ironsource.R3 r3 = this.S;
            if (r3 == null) {
                return;
            }
            r3.c(context);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String d(java.lang.String str) {
        return new com.ironsource.C3101ie(str).d(j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] d(android.content.Context context) {
        boolean z;
        com.ironsource.X4 b2 = com.ironsource.X4.b(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.X3.j.z, "none");
            jSONObject.put(com.ironsource.X3.j.A, com.ironsource.sdk.utils.SDKUtils.translateDeviceOrientation(this.Z.A(context)));
            java.lang.String d2 = b2.d();
            if (d2 != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("deviceOEM"), com.ironsource.sdk.utils.SDKUtils.encodeString(d2));
            }
            java.lang.String c2 = b2.c();
            if (c2 != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("deviceModel"), com.ironsource.sdk.utils.SDKUtils.encodeString(c2));
                z = false;
            } else {
                z = true;
            }
            try {
                com.ironsource.sdk.utils.SDKUtils.loadGoogleAdvertiserInfo(context);
                java.lang.String advertiserId = com.ironsource.sdk.utils.SDKUtils.getAdvertiserId();
                if (!android.text.TextUtils.isEmpty(advertiserId)) {
                    com.ironsource.sdk.utils.Logger.i(this.c, "add AID");
                    jSONObject.put("deviceIds[AID]", com.ironsource.sdk.utils.SDKUtils.encodeString(advertiserId));
                }
                java.lang.String limitAdTracking = com.ironsource.sdk.utils.SDKUtils.getLimitAdTracking();
                if (!android.text.TextUtils.isEmpty(limitAdTracking)) {
                    com.ironsource.sdk.utils.Logger.i(this.c, "add LAT");
                    jSONObject.put(com.ironsource.X3.j.M, java.lang.Boolean.parseBoolean(limitAdTracking));
                }
                java.lang.String e2 = b2.e();
                if (e2 != null) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.m), com.ironsource.sdk.utils.SDKUtils.encodeString(e2));
                } else {
                    z = true;
                }
                java.lang.String f2 = b2.f();
                if (f2 != null) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.n), f2.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                java.lang.String f3 = b2.f();
                if (f3 != null) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.o), com.ironsource.sdk.utils.SDKUtils.encodeString(f3));
                }
                java.lang.String valueOf = java.lang.String.valueOf(b2.a());
                if (valueOf != null) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.p), valueOf);
                } else {
                    z = true;
                }
                jSONObject.put(com.ironsource.M6.j0, java.lang.String.valueOf(com.ironsource.C3140l0.a()));
                java.lang.String sDKVersion = com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.q), com.ironsource.sdk.utils.SDKUtils.encodeString(sDKVersion));
                }
                if (b2.b() != null && b2.b().length() > 0) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.r), com.ironsource.sdk.utils.SDKUtils.encodeString(b2.b()));
                }
                java.lang.String b3 = com.ironsource.U3.b(context);
                if (b3.equals("none")) {
                    z = true;
                } else {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("connectionType"), com.ironsource.sdk.utils.SDKUtils.encodeString(b3));
                }
                java.lang.String d3 = com.ironsource.U3.d(context);
                if (d3 != null) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("rawConnectionType"), com.ironsource.sdk.utils.SDKUtils.encodeString(d3));
                } else {
                    z = true;
                }
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.v), com.ironsource.U3.e(context));
                }
                jSONObject.put("uxt", com.ironsource.sdk.utils.IronSourceStorageUtils.isUxt());
                java.lang.String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!android.text.TextUtils.isEmpty(language)) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.x), com.ironsource.sdk.utils.SDKUtils.encodeString(language.toUpperCase(java.util.Locale.getDefault())));
                }
                jSONObject.put(com.ironsource.X3.j.y, com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.Z.a(this.B))));
                java.lang.String valueOf2 = java.lang.String.valueOf(this.Z.o());
                if (android.text.TextUtils.isEmpty(valueOf2)) {
                    z = true;
                } else {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.G) + com.ironsource.X3.j.d + com.ironsource.sdk.utils.SDKUtils.encodeString("width") + com.ironsource.X3.j.e, com.ironsource.sdk.utils.SDKUtils.encodeString(valueOf2));
                }
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.G) + com.ironsource.X3.j.d + com.ironsource.sdk.utils.SDKUtils.encodeString("height") + com.ironsource.X3.j.e, com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.Z.b())));
                java.lang.String g2 = com.ironsource.E1.g(this.b0.getContext());
                if (!android.text.TextUtils.isEmpty(g2)) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("bundleId"), com.ironsource.sdk.utils.SDKUtils.encodeString(g2));
                }
                java.lang.String valueOf3 = java.lang.String.valueOf(this.Z.r());
                if (!android.text.TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.K), com.ironsource.sdk.utils.SDKUtils.encodeString(valueOf3));
                }
                java.lang.String valueOf4 = java.lang.String.valueOf(this.Z.p());
                if (!android.text.TextUtils.isEmpty(valueOf4)) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.O), com.ironsource.sdk.utils.SDKUtils.encodeString(valueOf4));
                }
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.P), com.ironsource.X4.b(context).a(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.Y), this.Z.l(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("mcc"), com.ironsource.T3.b(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("mnc"), com.ironsource.T3.c(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.S), com.ironsource.T3.f(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.R), com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.T3.g(context)));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.V), com.ironsource.E1.f(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.X), com.ironsource.E1.d(context));
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("appVersion"), com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.E1.b(context)));
                java.lang.String e3 = com.ironsource.E1.e(context);
                if (!android.text.TextUtils.isEmpty(e3)) {
                    jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.c0), com.ironsource.sdk.utils.SDKUtils.encodeString(e3));
                }
                c(jSONObject);
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.q0), this.Z.u(context));
            } catch (org.json.JSONException e4) {
                e = e4;
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                return new java.lang.Object[]{jSONObject.toString(), java.lang.Boolean.valueOf(z)};
            }
        } catch (org.json.JSONException e5) {
            e = e5;
            z = false;
        }
        return new java.lang.Object[]{jSONObject.toString(), java.lang.Boolean.valueOf(z)};
    }

    private java.lang.String f(java.lang.String str) {
        return new com.ironsource.sdk.controller.m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(org.json.JSONObject jSONObject, android.webkit.WebView webView) {
        boolean optBoolean = jSONObject.optBoolean("inspectWebview");
        if (optBoolean) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(optBoolean);
        }
    }

    private void a(java.lang.String str, com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4, com.ironsource.sdk.controller.v.t tVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, t4);
        } else {
            i(a(eVar, t4).b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
        this.f = str;
        this.g = str2;
        this.y = interfaceC3305u4;
        this.E.i(str);
        this.E.j(str2);
        a(str, com.ironsource.C3202o8.e.RewardedVideo, t4, new com.ironsource.sdk.controller.v.k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        this.f = str;
        this.g = str2;
        this.z = interfaceC3287t4;
        this.E.g(str);
        this.E.h(this.g);
        a(this.f, com.ironsource.C3202o8.e.Interstitial, t4, new com.ironsource.sdk.controller.v.l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("demandSourceName", str);
        java.lang.String flatMapToJsonAsString = com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(hashMap);
        this.E.d(str, true);
        i(a(com.ironsource.X3.h.E, flatMapToJsonAsString, com.ironsource.X3.h.F, com.ironsource.X3.h.G));
    }

    private void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> mergeHashMaps = com.ironsource.sdk.utils.SDKUtils.mergeHashMaps(new java.util.Map[]{map, t4.b()});
        if (map.containsKey("adm")) {
            this.b.a(new com.ironsource.InterfaceC3037f4.d() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda2
                @Override // com.ironsource.InterfaceC3037f4.d
                public final void a(com.ironsource.InterfaceC2950a7 interfaceC2950a7) {
                    com.ironsource.sdk.controller.v.this.a(interfaceC2950a7);
                }
            });
        }
        this.E.d(t4.h(), true);
        i(a(com.ironsource.X3.h.E, com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(mergeHashMaps), com.ironsource.X3.h.F, com.ironsource.X3.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.InterfaceC2950a7 interfaceC2950a7) {
        interfaceC2950a7.a(new com.ironsource.InterfaceC2968b7() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda4
            @Override // com.ironsource.InterfaceC2968b7
            public final void a(com.ironsource.X6 x6) {
                com.ironsource.sdk.controller.v.this.a(x6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.X6 x6) {
        try {
            this.R.a(x6);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.sdk.utils.Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        i(a(com.ironsource.C3202o8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        i(a(com.ironsource.C3202o8.e.Interstitial, new org.json.JSONObject(com.ironsource.sdk.utils.SDKUtils.mergeHashMaps(new java.util.Map[]{map, t4.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(java.lang.String str) {
        com.ironsource.T4 a2 = this.H.a(com.ironsource.C3202o8.e.Interstitial, str);
        return a2 != null && a2.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        this.f = str;
        this.g = str2;
        this.A = interfaceC3269s4;
        a(str, com.ironsource.C3202o8.e.Banner, t4, new com.ironsource.sdk.controller.v.m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        java.util.Map<java.lang.String, java.lang.String> mergeHashMaps = com.ironsource.sdk.utils.SDKUtils.mergeHashMaps(new java.util.Map[]{map, t4.b()});
        if (map != null) {
            i(a(com.ironsource.X3.h.N, com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(mergeHashMaps), com.ironsource.X3.h.O, com.ironsource.X3.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4) {
        java.util.Map<java.lang.String, java.lang.String> b2 = t4.b();
        if (b2 != null) {
            i(a(com.ironsource.X3.h.S, com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(b2), com.ironsource.X3.h.P, com.ironsource.X3.h.Q));
        }
        this.H.b(com.ironsource.C3202o8.e.Banner, t4.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        i(a(com.ironsource.X3.h.N, jSONObject.toString(), com.ironsource.X3.h.O, com.ironsource.X3.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        i(a(cVar.e(), cVar.h(), com.ironsource.X3.h.U, com.ironsource.X3.h.U));
    }

    private com.ironsource.sdk.controller.v.u a(com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4) {
        com.ironsource.sdk.controller.v.u uVar = new com.ironsource.sdk.controller.v.u();
        if (eVar == com.ironsource.C3202o8.e.RewardedVideo || eVar == com.ironsource.C3202o8.e.Interstitial || eVar == com.ironsource.C3202o8.e.Banner) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.ironsource.X3.j.g, this.f);
            if (!android.text.TextUtils.isEmpty(this.g)) {
                hashMap.put(com.ironsource.X3.j.f, this.g);
            }
            if (t4 != null) {
                if (t4.g() != null) {
                    hashMap.putAll(t4.g());
                    hashMap.put(com.ironsource.X3.i.y0, java.lang.String.valueOf(com.ironsource.N.f5845a.c(t4.h())));
                }
                hashMap.put("demandSourceName", t4.f());
                hashMap.put("demandSourceId", t4.h());
            }
            java.lang.String flatMapToJsonAsString = com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(hashMap);
            com.ironsource.X3.h a2 = com.ironsource.X3.h.a(eVar);
            java.lang.String a3 = a(a2.f6067a, flatMapToJsonAsString, a2.b, a2.c);
            uVar.f6717a = a2.f6067a;
            uVar.b = a3;
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object d(com.ironsource.C3381y8 c3381y8) {
        this.h.a(this);
        if (c3381y8 != null && c3381y8.exists()) {
            a(c3381y8);
            return null;
        }
        a(new com.ironsource.C3381y8(com.ironsource.X3.f), new com.ironsource.C3220p8(1, "Unable to download Html file"));
        return null;
    }

    private java.lang.String a(com.ironsource.C3202o8.e eVar, org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sessionDepth", java.lang.Integer.toString(jSONObject.optInt("sessionDepth")));
        java.lang.String optString = jSONObject.optString("demandSourceName");
        java.lang.String fetchDemandSourceId = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.T4 a2 = this.H.a(eVar, fetchDemandSourceId);
        if (a2 != null) {
            if (a2.g() != null) {
                hashMap.putAll(a2.g());
            }
            if (!android.text.TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!android.text.TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        java.lang.String flatMapToJsonAsString = com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(hashMap);
        com.ironsource.X3.h b2 = com.ironsource.X3.h.b(eVar);
        return a(b2.f6067a, flatMapToJsonAsString, b2.b, b2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4) {
        if (r(eVar.toString())) {
            b(new com.ironsource.sdk.controller.v.n(eVar, t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
        i(a(com.ironsource.C3202o8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.T = jSONObject;
        }
    }

    public void a(boolean z, java.lang.String str) {
        i(e(com.ironsource.X3.h.V, a(com.ironsource.X3.i.M0, str, null, null, null, null, null, null, com.ironsource.X3.i.o, z)));
    }

    public void a(int i2, boolean z) {
        i(e(com.ironsource.X3.f.i, a(com.ironsource.X3.f.f, java.lang.String.valueOf(i2), null, null, null, null, null, null, com.ironsource.X3.f.g, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        java.lang.String d2 = new com.ironsource.C3101ie(str).d(z ? i0 : j0);
        if (android.text.TextUtils.isEmpty(d2)) {
            return;
        }
        i(e(d2, a(b(str, str2), str3)));
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        return a(str, str2, com.ironsource.X3.i.g);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            return new org.json.JSONObject(str).put(str3, str2).toString();
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                jSONObject.put(str, com.ironsource.sdk.utils.SDKUtils.encodeString(str2));
            }
            if (!android.text.TextUtils.isEmpty(str3) && !android.text.TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, com.ironsource.sdk.utils.SDKUtils.encodeString(str4));
            }
            if (!android.text.TextUtils.isEmpty(str5) && !android.text.TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, com.ironsource.sdk.utils.SDKUtils.encodeString(str6));
            }
            if (!android.text.TextUtils.isEmpty(str7) && !android.text.TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, com.ironsource.sdk.utils.SDKUtils.encodeString(str8));
            }
            if (!android.text.TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.Nc
    public void a(com.ironsource.C3381y8 c3381y8) {
        if (this.X && this.W.a(c3381y8)) {
            a(1);
        } else {
            if (c3381y8.getName().contains(com.ironsource.X3.f)) {
                com.ironsource.C3019e4.a(this.b0.getContext(), false);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.C.a(new com.ironsource.sdk.controller.v.o());
                return;
            }
            c(c3381y8.getName(), c3381y8.getParent());
        }
    }

    @Override // com.ironsource.Nc
    public void a(com.ironsource.C3381y8 c3381y8, com.ironsource.C3220p8 c3220p8) {
        if (this.X && this.W.a(c3381y8)) {
            this.R.c("controller html - failed to download - " + c3220p8.b());
            return;
        }
        if (c3381y8.getName().contains(com.ironsource.X3.f)) {
            if (com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c3381y8.getName().equals(com.ironsource.X3.f)) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("copying from bundle to storage " + c3381y8.getName() + " and sdk_controller.min.gz.js");
                if (c(c3381y8)) {
                    com.ironsource.C3327v8.a(com.ironsource.C3083he.C);
                    com.ironsource.C3019e4.a(this.b0.getContext(), true);
                    this.C.a(new com.ironsource.sdk.controller.v.a());
                    return;
                }
            }
            this.C.a(new com.ironsource.sdk.controller.v.b(), new com.ironsource.sdk.controller.v.c(c3220p8));
            return;
        }
        if (com.ironsource.sdk.controller.FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((java.io.File) c3381y8)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("copying from bundle to storage " + c3381y8.getName());
            if (com.ironsource.sdk.utils.SDKUtils.copyFileFromBundleToStorage(this.b0.getContext(), c3381y8)) {
                c(c3381y8.getName(), c3381y8.getParent());
                return;
            }
        }
        b(c3381y8.getName(), c3381y8.getParent(), c3220p8.b());
    }

    private boolean a(java.io.File file) {
        return com.ironsource.C3019e4.a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(android.content.Context context) {
        a(new com.ironsource.sdk.controller.v.e(context));
    }

    public void a(com.ironsource.Pc pc) {
        this.c0 = pc;
        this.b0.a(pc);
    }

    public void a(com.ironsource.sdk.controller.v.EnumC0167v enumC0167v) {
        this.w = enumC0167v;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        if (this.Y) {
            if (this.b0 != null) {
                this.f6673a.d(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.sdk.controller.v.this.C();
                    }
                });
            }
        } else if (this.b0 != null) {
            this.b0.destroy();
        }
        com.ironsource.C3020e5 c3020e5 = this.h;
        if (c3020e5 != null) {
            c3020e5.d();
        }
        com.ironsource.R3 r3 = this.S;
        if (r3 != null) {
            r3.b();
        }
        android.os.CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.ironsource.sdk.controller.m.a(str, str2, str3, str4).a();
    }

    void a(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        b(new com.ironsource.sdk.controller.v.f(eVar, str));
    }

    public void a(com.ironsource.C2980c1 c2980c1) {
        synchronized (this.F) {
            if (c2980c1.j() && this.i) {
                android.util.Log.d(this.c, "restoreState(state:" + c2980c1 + ")");
                int c2 = c2980c1.c();
                if (c2 != -1) {
                    com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.RewardedVideo;
                    if (c2 == eVar.ordinal()) {
                        android.util.Log.d(this.c, "onRVAdClosed()");
                        java.lang.String b2 = c2980c1.b();
                        com.ironsource.InterfaceC3251r4 a2 = a(eVar);
                        if (a2 != null && !android.text.TextUtils.isEmpty(b2)) {
                            a2.b(eVar, b2);
                        }
                    } else {
                        com.ironsource.C3202o8.e eVar2 = com.ironsource.C3202o8.e.Interstitial;
                        if (c2 == eVar2.ordinal()) {
                            android.util.Log.d(this.c, "onInterstitialAdClosed()");
                            java.lang.String b3 = c2980c1.b();
                            com.ironsource.InterfaceC3251r4 a3 = a(eVar2);
                            if (a3 != null && !android.text.TextUtils.isEmpty(b3)) {
                                a3.b(eVar2, b3);
                            }
                        }
                    }
                    c2980c1.a(-1);
                    c2980c1.f(null);
                } else {
                    android.util.Log.d(this.c, "No ad was opened");
                }
                java.lang.String d2 = c2980c1.d();
                java.lang.String f2 = c2980c1.f();
                for (com.ironsource.T4 t4 : this.H.a(com.ironsource.C3202o8.e.Interstitial)) {
                    if (t4.e() == 2) {
                        android.util.Log.d(this.c, "initInterstitial(appKey:" + d2 + ", userId:" + f2 + ", demandSource:" + t4.f() + ")");
                        a(d2, f2, t4, this.z);
                    }
                }
                java.lang.String g2 = c2980c1.g();
                java.lang.String h2 = c2980c1.h();
                for (com.ironsource.T4 t42 : this.H.a(com.ironsource.C3202o8.e.RewardedVideo)) {
                    if (t42.e() == 2) {
                        java.lang.String f3 = t42.f();
                        android.util.Log.d(this.c, "onRVNoMoreOffers()");
                        this.y.c(f3);
                        android.util.Log.d(this.c, "initRewardedVideo(appKey:" + g2 + ", userId:" + h2 + ", demandSource:" + f3 + ")");
                        a(g2, h2, t42, this.y);
                    }
                }
                c2980c1.a(false);
            }
            this.E = c2980c1;
        }
    }

    void a(java.lang.Runnable runnable) {
        com.ironsource.Q7 q7 = this.f6673a;
        if (q7 != null) {
            q7.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(android.app.Activity activity) {
        this.a0.a(activity);
    }
}
