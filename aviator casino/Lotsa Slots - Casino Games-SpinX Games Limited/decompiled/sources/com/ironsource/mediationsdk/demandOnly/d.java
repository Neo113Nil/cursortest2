package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class d extends com.ironsource.mediationsdk.demandOnly.m implements com.ironsource.mediationsdk.sdk.BannerSmashListener, com.ironsource.InterfaceC3017e2 {
    private com.ironsource.C3056g5 n;
    private com.ironsource.C3056g5 o;
    private java.lang.String p;
    private java.lang.String q;
    private com.ironsource.C3053g2 r;
    private com.ironsource.mediationsdk.e s;
    private com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout t;
    private final com.ironsource.L8 u;
    private final com.ironsource.L8.a v;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.h f6418a;

        a(com.ironsource.mediationsdk.h hVar) {
            this.f6418a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.demandOnly.d.this.a(83500, (java.lang.Object[][]) null);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("auction waterfallString = " + this.f6418a.s());
            com.ironsource.mediationsdk.demandOnly.d.this.a(83510, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.f6418a.s()}});
            android.content.Context applicationContext = com.ironsource.environment.ContextProvider.getInstance().getApplicationContext();
            com.ironsource.mediationsdk.demandOnly.d dVar = com.ironsource.mediationsdk.demandOnly.d.this;
            dVar.s.a(applicationContext, this.f6418a, dVar);
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.ironsource.mediationsdk.demandOnly.d.this.k());
            com.ironsource.mediationsdk.demandOnly.d.this.a(new com.ironsource.mediationsdk.logger.IronSourceError(608, "load timed out"));
        }
    }

    public d(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, long j, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new com.ironsource.C3016e1(networkSettings, networkSettings.getBannerSettings(), com.ironsource.mediationsdk.IronSource.a.BANNER), abstractAdapter);
        this.u = com.ironsource.Jb.Y().s();
        this.v = com.ironsource.Jb.Q().i();
        this.f = j;
        this.p = str;
        this.q = str2;
        this.r = new com.ironsource.C3053g2();
        this.f6429a.initBannerForBidding(str, str2, this.c, this);
        this.s = eVar;
    }

    private void c(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (java.lang.Object[][]) null);
                this.o = new com.ironsource.C3056g5();
                this.f6429a.initBannerForBidding(this.p, this.q, this.c, this);
                this.f6429a.loadBannerForDemandOnlyForBidding(this.c, str, this.t, this);
            }
        }
    }

    private boolean t() {
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.demandOnly.d.a(q()));
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.r = new com.ironsource.C3053g2();
    }

    private void w() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        a(new com.ironsource.mediationsdk.demandOnly.d.b());
    }

    public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.ironsource.mediationsdk.demandOnly.o oVar) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.e, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        com.ironsource.mediationsdk.demandOnly.m.a[] aVarArr = {com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED, com.ironsource.mediationsdk.demandOnly.m.a.LOADED};
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a a2 = a(aVarArr, aVar);
        if (a2 == aVar || a2 == com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.e, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            } else {
                java.lang.String str = "banner layout in blocking state | state: " + k();
                iSDemandOnlyBannerLayout.getListener().a(l(), new com.ironsource.mediationsdk.logger.IronSourceError(619, str));
                a(com.ironsource.mediationsdk.demandOnly.b.c.e, new java.lang.Object[][]{new java.lang.Object[]{"reason", str}});
                return;
            }
        }
        v();
        a(3002, (java.lang.Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        if (!n()) {
            com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (java.lang.Object[][]) null);
            a(buildLoadFailedError);
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar2 = (com.ironsource.mediationsdk.d.a) oVar.a(new com.ironsource.C3145l5());
            com.ironsource.C3232q2 a3 = new com.ironsource.mediationsdk.demandOnly.a.C0158a(aVar2.h()).a(h());
            if (a3 == null) {
                com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (java.lang.Object[][]) null);
                a(buildLoadFailedError2);
                return;
            }
            java.lang.String k = a3.k();
            if (k == null) {
                ironLog.error("serverData is null");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(618, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (java.lang.Object[][]) null);
            this.r.a(a3.b());
            this.n = new com.ironsource.C3056g5();
            w();
            this.f6429a.initBannerForBidding(this.p, this.q, this.c, this);
            this.f6429a.loadBannerForDemandOnlyForBidding(this.c, k, iSDemandOnlyBannerLayout, this);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public java.util.Map<java.lang.String, java.lang.Object> j() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (t()) {
                hashMap.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.j.a(hashMap, this.t.getSize());
            }
            com.ironsource.mediationsdk.AbstractAdapter abstractAdapter = this.f6429a;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            com.ironsource.mediationsdk.AbstractAdapter abstractAdapter2 = this.f6429a;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.i());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", java.lang.Integer.valueOf(this.b.d()));
            if (!android.text.TextUtils.isEmpty(this.g)) {
                hashMap.put("auctionId", this.g);
            }
            org.json.JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.h);
            }
            if (!android.text.TextUtils.isEmpty(this.j)) {
                hashMap.put("dynamicDemandSource", this.j);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Instance: " + h() + io.ktor.sse.ServerSentEventKt.SPACE + e.getMessage());
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (java.lang.Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(java.util.Map map) {
        onBannerAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
        a(com.ironsource.mediationsdk.demandOnly.b.C0159b.g, (java.lang.Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(java.util.Map map) {
        onBannerAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash = " + s());
        com.ironsource.L8 l8 = this.u;
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.BANNER;
        int a2 = l8.a(aVar);
        a(com.ironsource.mediationsdk.demandOnly.b.c.d, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(a2)}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.o))}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            p();
            if (!t()) {
                this.t.a(view, layoutParams);
            }
            a(3005, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(a2)}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.n))}});
            this.v.b(aVar);
            a(this.r.c(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, java.util.Map map) {
        onBannerAdLoaded(view, layoutParams);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(java.util.Map map) {
        onBannerAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(java.util.Map map) {
        onBannerAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED, com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (java.lang.Object[][]) null);
            a(this.r.a(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdShown(java.util.Map map) {
        onBannerAdShown();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s() + io.ktor.sse.ServerSentEventKt.SPACE + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onBannerInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(java.util.Map map) {
        onBannerInitSuccess();
    }

    com.ironsource.mediationsdk.h q() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(h());
        java.lang.String str = "" + i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(com.ironsource.mediationsdk.IronSource.a.BANNER);
        hVar.a(arrayList);
        hVar.e(str);
        hVar.c(l());
        hVar.b(com.ironsource.mediationsdk.utils.IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.a(this.t.getSize());
        return hVar;
    }

    public void r() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        a(new com.ironsource.mediationsdk.demandOnly.m.a[]{com.ironsource.mediationsdk.demandOnly.m.a.LOADED, com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS}, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.t = null;
        com.ironsource.mediationsdk.AbstractAdapter abstractAdapter = this.f6429a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.c);
        }
        a(3305, (java.lang.Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public java.lang.String s() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }

    public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.e, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        com.ironsource.mediationsdk.demandOnly.m.a[] aVarArr = {com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED, com.ironsource.mediationsdk.demandOnly.m.a.LOADED};
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a a2 = a(aVarArr, aVar);
        if (a2 != aVar && a2 != com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS) {
            v();
            a(3002, (java.lang.Object[][]) null);
            if (!o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.t = iSDemandOnlyBannerLayout;
            this.n = new com.ironsource.C3056g5();
            w();
            if (this.s.a()) {
                u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.e, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
        } else {
            java.lang.String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new com.ironsource.mediationsdk.logger.IronSourceError(619, str));
            a(com.ironsource.mediationsdk.demandOnly.b.c.e, new java.lang.Object[][]{new java.lang.Object[]{"reason", str}});
        }
    }

    @Override // com.ironsource.U1
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(com.ironsource.mediationsdk.demandOnly.b.c.g, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.U1
    public void a(java.util.List<com.ironsource.C3232q2> list, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, com.ironsource.C3056g5.a(this.n));
            a(this.r.b(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}});
        } else {
            a(3300, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, java.lang.Object[][] objArr) {
        java.util.Map<java.lang.String, java.lang.Object> j = j();
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        j.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
        com.ironsource.F9.i().a(new com.ironsource.C3360x5(i, new org.json.JSONObject(j)));
    }

    private void a(java.util.List<java.lang.String> list, java.lang.String str) {
        a(list, h(), i(), this.j, str);
    }

    @Override // com.ironsource.InterfaceC3017e2
    public void a(com.ironsource.mediationsdk.d.a aVar, int i, long j, int i2, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        com.ironsource.mediationsdk.demandOnly.a.C0158a c0158a = new com.ironsource.mediationsdk.demandOnly.a.C0158a(aVar.h());
        if (!android.text.TextUtils.isEmpty(str)) {
            a(88002, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(i2)}, new java.lang.Object[]{"reason", str}});
        }
        a(com.ironsource.mediationsdk.demandOnly.b.c.h, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}});
        a(com.ironsource.mediationsdk.demandOnly.b.c.j, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c0158a.b()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (c0158a.isEmpty()) {
                com.ironsource.mediationsdk.logger.IronSourceError ironSourceError = new com.ironsource.mediationsdk.logger.IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            com.ironsource.C3232q2 c3232q2 = c0158a.get(0);
            this.r.a(c3232q2.b());
            this.r.c(c3232q2.h());
            this.r.b(c3232q2.g());
            java.lang.String k = c3232q2.k();
            b(k);
            c(k);
        }
    }
}
