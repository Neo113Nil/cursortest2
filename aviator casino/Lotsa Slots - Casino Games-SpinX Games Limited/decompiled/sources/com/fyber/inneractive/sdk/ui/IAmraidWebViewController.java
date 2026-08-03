package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public class IAmraidWebViewController extends com.fyber.inneractive.sdk.web.i0 {
    public final com.fyber.inneractive.sdk.ui.e r0;

    public static class MraidVideoFailedToDisplayError extends com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError() {
            super("an MRAID video has not started playing in a timely fashion");
        }
    }

    public IAmraidWebViewController(boolean z, com.fyber.inneractive.sdk.web.c0 c0Var, com.fyber.inneractive.sdk.web.z zVar, com.fyber.inneractive.sdk.web.d0 d0Var, boolean z2, com.fyber.inneractive.sdk.measurement.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z, c0Var, zVar, d0Var, eVar, rVar);
        this.r0 = new com.fyber.inneractive.sdk.ui.e(this);
        this.F = z2;
        this.b.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_webview_mraid);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final boolean a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.mraid.f gVar;
        com.fyber.inneractive.sdk.web.m mVar;
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String uri = parse.toString();
        parse.getScheme();
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith("success")) {
                com.fyber.inneractive.sdk.util.IAlog.e("received iaadfinishedloading success", new java.lang.Object[0]);
                if (!this.f4339a && this.f != null && (mVar = this.b) != null) {
                    mVar.a();
                    this.f4339a = true;
                    q();
                }
            }
            return true;
        }
        java.lang.String scheme = android.net.Uri.parse(str).getScheme();
        com.fyber.inneractive.sdk.web.m mVar2 = this.b;
        if (mVar2 != null && mVar2.isShown() && this.N != com.fyber.inneractive.sdk.mraid.f0.HIDDEN) {
            if (!"mraid".equals(scheme)) {
                return false;
            }
            java.net.URI create = java.net.URI.create(str);
            java.lang.String host = create.getHost();
            try {
                java.util.LinkedHashMap a2 = com.fyber.inneractive.sdk.web.i0.a(create);
                switch (com.fyber.inneractive.sdk.mraid.j.f3825a[com.fyber.inneractive.sdk.mraid.k.a(host).ordinal()]) {
                    case 1:
                        gVar = new com.fyber.inneractive.sdk.mraid.g(a2, this, g1Var);
                        break;
                    case 2:
                        gVar = new com.fyber.inneractive.sdk.mraid.i(a2, this, g1Var);
                        break;
                    case 3:
                        gVar = new com.fyber.inneractive.sdk.mraid.w(a2, this, g1Var);
                        break;
                    case 4:
                        gVar = new com.fyber.inneractive.sdk.mraid.q(a2, this, g1Var);
                        break;
                    case 5:
                        gVar = new com.fyber.inneractive.sdk.mraid.s(a2, this, g1Var);
                        break;
                    case 6:
                        gVar = new com.fyber.inneractive.sdk.mraid.o(a2, this, g1Var);
                        break;
                    case 7:
                        gVar = new com.fyber.inneractive.sdk.mraid.u(a2, this, g1Var);
                        break;
                    case 8:
                        gVar = new com.fyber.inneractive.sdk.mraid.t(a2, this, g1Var);
                        break;
                    case 9:
                        gVar = new com.fyber.inneractive.sdk.mraid.r(a2, this, g1Var);
                        break;
                    case 10:
                        gVar = new com.fyber.inneractive.sdk.mraid.v(a2, this, g1Var);
                        break;
                    case 11:
                        gVar = new com.fyber.inneractive.sdk.mraid.l(a2, this, g1Var);
                        break;
                    case 12:
                        gVar = new com.fyber.inneractive.sdk.mraid.m(a2, this, g1Var);
                        break;
                    case 13:
                        gVar = new com.fyber.inneractive.sdk.mraid.n(a2, this, g1Var);
                        break;
                    case 14:
                        gVar = new com.fyber.inneractive.sdk.mraid.p(a2, this, g1Var);
                        break;
                    case 15:
                        gVar = new com.fyber.inneractive.sdk.mraid.h(a2, this, g1Var);
                        break;
                    default:
                        gVar = null;
                        break;
                }
                if (gVar == null || ((gVar instanceof com.fyber.inneractive.sdk.mraid.i) && this.Q == com.fyber.inneractive.sdk.web.c0.INTERSTITIAL)) {
                    com.fyber.inneractive.sdk.web.m mVar3 = this.b;
                    if (mVar3 != null) {
                        mVar3.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                } else {
                    gVar.f3823a = host;
                    com.fyber.inneractive.sdk.util.IAlog.e("Processing MRaid command: %s", host);
                    if (gVar instanceof com.fyber.inneractive.sdk.mraid.e) {
                        a(new com.fyber.inneractive.sdk.web.f0(this, (com.fyber.inneractive.sdk.mraid.e) gVar));
                    } else {
                        if (gVar.b()) {
                            i();
                        }
                        gVar.a();
                    }
                    com.fyber.inneractive.sdk.web.m mVar4 = this.b;
                    if (mVar4 != null) {
                        mVar4.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void e() {
        b(false);
        android.os.Handler handler = com.fyber.inneractive.sdk.util.r.b;
        handler.removeCallbacks(this.r0);
        handler.removeCallbacks(this.J);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return this.I;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(4:5|6|7|(8:9|10|11|12|13|(1:20)|17|18))|25|10|11|12|13|(1:15)|20|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r0 = "";
     */
    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z;
        super.k();
        com.fyber.inneractive.sdk.web.m mVar = this.b;
        if (mVar != null && mVar.getContext() != null) {
            if (com.fyber.inneractive.sdk.util.o.f4302a.getPackageManager().queryIntentActivities(new android.content.Intent(this.b.getContext(), (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.class), 0).size() > 0) {
                z = true;
                com.fyber.inneractive.sdk.mraid.e0 e0Var = new com.fyber.inneractive.sdk.mraid.e0();
                e0Var.b = com.fyber.inneractive.sdk.util.k.n();
                e0Var.f3822a = com.fyber.inneractive.sdk.util.k.n();
                e0Var.c = true;
                e0Var.e = z;
                java.lang.String str = android.os.Environment.getExternalStorageState();
                e0Var.d = !"mounted".equals(str) && com.fyber.inneractive.sdk.util.o.f4302a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                a(e0Var);
            }
        }
        z = false;
        com.fyber.inneractive.sdk.mraid.e0 e0Var2 = new com.fyber.inneractive.sdk.mraid.e0();
        e0Var2.b = com.fyber.inneractive.sdk.util.k.n();
        e0Var2.f3822a = com.fyber.inneractive.sdk.util.k.n();
        e0Var2.c = true;
        e0Var2.e = z;
        java.lang.String str2 = android.os.Environment.getExternalStorageState();
        e0Var2.d = !"mounted".equals(str2) && com.fyber.inneractive.sdk.util.o.f4302a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        a(e0Var2);
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void n() {
        com.fyber.inneractive.sdk.web.m mVar;
        if (this.C && this.D && this.A && (mVar = this.b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            com.fyber.inneractive.sdk.ui.e eVar = this.r0;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.b.postDelayed(eVar, 5000L);
            }
            if (this.E) {
                this.b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final boolean a(android.webkit.WebView webView, java.lang.String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.util.IAlog.a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.b == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new java.lang.Object[0]);
            return false;
        }
        java.lang.String lowerCase = str != null ? str.toLowerCase(java.util.Locale.US) : null;
        if (lowerCase != null) {
            java.util.Locale locale = java.util.Locale.US;
            if (lowerCase.startsWith("FyMraidVideo".toLowerCase(locale))) {
                if (lowerCase.endsWith("fyMraidVideoAd".toLowerCase(locale))) {
                    com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
                    com.fyber.inneractive.sdk.config.o oVar = sVar != null ? sVar.b : null;
                    if (oVar != null && oVar.a(false, "e_61")) {
                        com.fyber.inneractive.sdk.util.IAlog.e("Dispatching MRAID Video detection event", new java.lang.Object[0]);
                        com.fyber.inneractive.sdk.response.e eVar = this.t;
                        if (eVar == null) {
                            com.fyber.inneractive.sdk.flow.x xVar = this.s;
                            eVar = xVar == null ? null : xVar.b;
                        }
                        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_VIDEO_DETECTED;
                        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.r;
                        com.fyber.inneractive.sdk.flow.x xVar2 = this.s;
                        org.json.JSONArray b = (xVar2 == null || (rVar = xVar2.c) == null) ? null : rVar.b();
                        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                        wVar.c = uVar;
                        wVar.f3860a = inneractiveAdRequest;
                        wVar.d = b;
                        wVar.a((java.lang.String) null);
                    } else {
                        com.fyber.inneractive.sdk.util.IAlog.a("%sEvent 61 is disabled", com.fyber.inneractive.sdk.util.IAlog.a(this));
                    }
                    this.D = true;
                    n();
                } else if (lowerCase.endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase(locale))) {
                    com.fyber.inneractive.sdk.util.IAlog.b("MRAID Video has not started in a timely fashion, showing close button", new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.web.j1 j1Var = this.g;
                    if (j1Var != null) {
                        this.X = false;
                        if (j1Var != null) {
                            ((com.fyber.inneractive.sdk.web.b0) j1Var).b(false);
                        }
                        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = this.r;
                        com.fyber.inneractive.sdk.flow.x xVar3 = this.s;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3 == null ? null : xVar3.b;
                        org.json.JSONArray b2 = xVar3 == null ? null : xVar3.c.b();
                        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar2);
                        wVar2.b = tVar;
                        wVar2.f3860a = inneractiveAdRequest2;
                        wVar2.d = b2;
                        wVar2.a("video_timeout_in_msecs", java.lang.String.valueOf(5000)).a((java.lang.String) null);
                    }
                    com.fyber.inneractive.sdk.web.j1 j1Var2 = this.g;
                    if (j1Var2 != null) {
                        ((com.fyber.inneractive.sdk.web.b0) j1Var2).a(new com.fyber.inneractive.sdk.ui.IAmraidWebViewController.MraidVideoFailedToDisplayError());
                    }
                } else if (str.toLowerCase(locale).endsWith("fyMraidVideoAdCompleted".toLowerCase(locale))) {
                    com.fyber.inneractive.sdk.web.j1 j1Var3 = this.g;
                    if (j1Var3 instanceof com.fyber.inneractive.sdk.web.g0) {
                        ((com.fyber.inneractive.sdk.web.g0) j1Var3).b();
                    }
                }
                return true;
            }
        }
        return super.a(webView, str);
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public final void a(boolean z) {
        com.fyber.inneractive.sdk.web.m mVar;
        super.a(z);
        if (this.D && this.C && this.A && (mVar = this.b) != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FyberMraidVideoController.");
            sb.append(z ? "play" : "pause");
            sb.append("();");
            mVar.a(sb.toString());
        }
        if (this.b == null || !z) {
            return;
        }
        android.os.Handler handler = com.fyber.inneractive.sdk.util.r.b;
        handler.postDelayed(new com.fyber.inneractive.sdk.ui.f(this), 1L);
        handler.postDelayed(new com.fyber.inneractive.sdk.ui.f(this), 100L);
        handler.postDelayed(new com.fyber.inneractive.sdk.ui.f(this), 250L);
        handler.postDelayed(new com.fyber.inneractive.sdk.ui.f(this), 1000L);
    }
}
