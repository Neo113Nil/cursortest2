package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebView f4361a;
    public final com.fyber.inneractive.sdk.ignite.h b;
    public final java.lang.String c;
    public com.fyber.inneractive.sdk.ignite.m d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final com.fyber.inneractive.sdk.flow.v h;
    public com.fyber.inneractive.sdk.web.t0 i;
    public java.lang.String k;
    public final com.fyber.inneractive.sdk.config.global.r m;
    public long o;
    public com.fyber.inneractive.sdk.web.n0 p;
    public java.lang.ref.WeakReference q;
    public java.lang.String j = "invalid_task_id";
    public boolean l = false;
    public long n = 10;
    public boolean r = false;
    public boolean s = false;
    public final java.util.concurrent.atomic.AtomicInteger t = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicBoolean u = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean v = new java.util.concurrent.atomic.AtomicBoolean(false);
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final com.fyber.inneractive.sdk.web.m0 E = new com.fyber.inneractive.sdk.web.m0(this);

    public v0(com.fyber.inneractive.sdk.web.w0 w0Var) {
        this.c = w0Var.f4363a;
        this.d = w0Var.b;
        this.e = w0Var.c;
        this.m = w0Var.d;
        this.f = w0Var.e;
        this.g = w0Var.f;
        this.h = w0Var.g;
        com.fyber.inneractive.sdk.ignite.h hVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.D;
        this.b = hVar;
        hVar.h.add(this);
        this.f4361a = new android.webkit.WebView(com.fyber.inneractive.sdk.util.o.f4302a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || !str2.equals(this.c)) {
            return;
        }
        this.j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(java.lang.String str) {
        this.z = false;
        this.A = true;
        if (this.j.equals(str)) {
            this.b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(java.lang.String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI iIgniteServiceAPI;
        if (this.v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.t.getAndIncrement() < 2) {
                    this.b.a(new com.fyber.inneractive.sdk.web.q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.b;
                    if (hVar2.i || (vVar = this.h) == null) {
                        return;
                    }
                    hVar2.i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(java.lang.String str) {
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.o0(this, str));
    }

    public final void e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.k = str;
        android.webkit.WebSettings settings = this.f4361a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.f4361a.setInitialScale(1);
        this.f4361a.setBackgroundColor(-1);
        this.f4361a.setWebViewClient(this.E);
        android.webkit.WebView webView = this.f4361a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        this.f4361a.addJavascriptInterface(new com.fyber.inneractive.sdk.web.u0(this), "nativeInterface");
        this.f4361a.loadUrl(str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.m;
        if (rVar != null) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            java.lang.Integer a2 = ((com.fyber.inneractive.sdk.config.global.features.r) rVar.a(com.fyber.inneractive.sdk.config.global.features.r.class)).a("load_timeout");
            int i = 10;
            int intValue = a2 != null ? a2.intValue() : 10;
            if (intValue < 30 && intValue > 2) {
                i = intValue;
            }
            long millis = timeUnit.toMillis(i);
            this.n = millis;
            com.fyber.inneractive.sdk.util.IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", java.lang.Long.valueOf(millis));
        }
        this.o = java.lang.System.currentTimeMillis();
        com.fyber.inneractive.sdk.web.n0 n0Var = new com.fyber.inneractive.sdk.web.n0(this);
        this.p = n0Var;
        com.fyber.inneractive.sdk.util.r.b.postDelayed(n0Var, this.n);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(java.lang.String str) {
        this.z = true;
        if (this.j.equals(str)) {
            this.b.m();
            d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(java.lang.String str, int i, double d) {
        if (this.j.equals(str)) {
            if (i == 0) {
                d(java.lang.String.format("onDownloadProgress(%f);", java.lang.Double.valueOf(d)));
            } else {
                if (i != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.z = false;
            if (this.j.equals(str)) {
                this.b.m();
                if (!this.v.get() && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.b.n()) {
                if (this.t.getAndIncrement() < 2) {
                    this.b.a(new com.fyber.inneractive.sdk.web.p0(this, str2, str3));
                    return;
                }
                this.b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.b;
                    if (!hVar2.i && (vVar = this.h) != null) {
                        hVar2.i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!android.text.TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.d;
            if (mVar != null) {
                this.h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }
}
