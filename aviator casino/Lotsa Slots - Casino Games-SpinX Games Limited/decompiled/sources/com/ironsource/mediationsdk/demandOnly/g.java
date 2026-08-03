package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class g extends com.ironsource.mediationsdk.demandOnly.m implements com.ironsource.mediationsdk.demandOnly.n.a, com.ironsource.mediationsdk.sdk.InterstitialSmashListener, com.ironsource.InterfaceC3017e2 {
    private com.ironsource.C3056g5 n;
    private com.ironsource.C3056g5 o;
    private com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener p;
    private com.ironsource.C3053g2 q;
    private com.ironsource.mediationsdk.e r;
    private com.ironsource.mediationsdk.demandOnly.p s;
    private final com.ironsource.L8 t;
    private final com.ironsource.L8.a u;

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.ironsource.mediationsdk.demandOnly.g.this.k());
            com.ironsource.mediationsdk.demandOnly.g.this.a(new com.ironsource.mediationsdk.logger.IronSourceError(1052, "load timed out"));
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.ironsource.mediationsdk.demandOnly.g.this.k());
            com.ironsource.mediationsdk.demandOnly.g.this.a(new com.ironsource.mediationsdk.logger.IronSourceError(1052, "load timed out"));
        }
    }

    public g(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new com.ironsource.C3016e1(networkSettings, networkSettings.getInterstitialSettings(), com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL), abstractAdapter);
        this.s = new com.ironsource.mediationsdk.demandOnly.p.b();
        this.t = com.ironsource.Jb.Y().s();
        this.u = com.ironsource.Jb.Q().i();
        this.p = iSDemandOnlyInterstitialListener;
        this.f = j;
        this.r = eVar;
        this.f6429a.initInterstitial(str, str2, this.c, this);
    }

    private void c(com.ironsource.mediationsdk.demandOnly.o oVar) {
        this.n = new com.ironsource.C3056g5();
        a(new com.ironsource.mediationsdk.demandOnly.g.a());
        if (!n()) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar = (com.ironsource.mediationsdk.d.a) oVar.a(new com.ironsource.C3145l5());
            com.ironsource.C3232q2 a2 = new com.ironsource.mediationsdk.demandOnly.a.C0158a(aVar.h()).a(h());
            if (a2 == null) {
                com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_FAILED, (java.lang.Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            java.lang.String k = a2.k();
            if (k == null) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("serverData is null");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.i, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar.a());
            a(aVar.f());
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (java.lang.Object[][]) null);
            this.q.a(a2.b());
            this.o = new com.ironsource.C3056g5();
            this.f6429a.loadInterstitialForBidding(this.c, null, k, this);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e.getMessage()));
        }
    }

    private com.ironsource.mediationsdk.h q() {
        java.lang.String str = i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.m);
        hVar.b(com.ironsource.mediationsdk.utils.IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.e(str);
        hVar.c(l());
        hVar.a(this.t.a(this.m));
        com.ironsource.C3106j2 c3106j2 = new com.ironsource.C3106j2(h(), false);
        c3106j2.a(this.s.value());
        java.util.Map<java.lang.String, java.lang.Object> interstitialBiddingData = this.f6429a.getInterstitialBiddingData(this.c, new org.json.JSONObject());
        if (interstitialBiddingData != null) {
            c3106j2.b(interstitialBiddingData);
        }
        hVar.a(c3106j2);
        return hVar;
    }

    private void r() {
        this.o = new com.ironsource.C3056g5();
        this.f6429a.loadInterstitial(this.c, null, this);
    }

    private void s() {
        if (!this.r.a()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new com.ironsource.mediationsdk.logger.IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (java.lang.Object[][]) null);
        com.ironsource.mediationsdk.h q = q();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("auction waterfallString = " + q.s());
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, q.s()}});
        this.r.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), q, this);
    }

    private void t() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new com.ironsource.C3053g2();
    }

    private void u() {
        this.n = new com.ironsource.C3056g5();
        a(new com.ironsource.mediationsdk.demandOnly.g.b());
        if (n()) {
            com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_FAILED, (java.lang.Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(com.ironsource.mediationsdk.demandOnly.o oVar) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a a2 = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(1050, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD, (java.lang.Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a a2 = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            this.p.onInterstitialAdLoadFailed(l(), new com.ironsource.mediationsdk.logger.IronSourceError(1050, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD, (java.lang.Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void e() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_SHOW, (java.lang.Object[][]) null);
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f6429a.showInterstitial(this.c, this);
        } else {
            onInterstitialAdShowFailed(a(aVar2) ? new com.ironsource.mediationsdk.logger.IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS) ? new com.ironsource.mediationsdk.logger.IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new com.ironsource.mediationsdk.logger.IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_CLICKED, new java.lang.Object[0][]);
        this.p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(java.util.Map map) {
        onInterstitialAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_CLOSED, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(java.util.Map map) {
        onInterstitialAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_OPENED, new java.lang.Object[0][]);
        a(this.q.a(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
        this.p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdOpened(java.util.Map map) {
        onInterstitialAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.o))}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.n))}});
            a(this.q.c(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            this.p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdReady(java.util.Map map) {
        onInterstitialAdReady();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_SHOW_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowSucceeded(java.util.Map map) {
        onInterstitialAdShowSucceeded();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.IS_INSTANCE_VISIBLE, new java.lang.Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(java.util.Map map) {
        onInterstitialAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(java.util.Map map) {
        onInterstitialInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        com.ironsource.EnumC3378y5 enumC3378y5;
        boolean z = false;
        if (!a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(com.ironsource.EnumC3378y5.IS_INSTANCE_READY_FALSE, (java.lang.Object[][]) null);
            return false;
        }
        try {
            z = this.f6429a.isInterstitialReady(this.c);
            if (z) {
                enumC3378y5 = com.ironsource.EnumC3378y5.IS_INSTANCE_READY_TRUE;
            } else {
                enumC3378y5 = com.ironsource.EnumC3378y5.IS_INSTANCE_READY_FALSE;
            }
            a(enumC3378y5, (java.lang.Object[][]) null);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception=" + e.getMessage());
        }
        return z;
    }

    void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED)) {
            a(ironSourceError, com.ironsource.C3056g5.a(this.n));
            a(this.q.b(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            this.p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(com.ironsource.EnumC3378y5 enumC3378y5, java.lang.Object[][] objArr) {
        java.util.Map<java.lang.String, java.lang.Object> j = j();
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    j.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Exception: " + android.util.Log.getStackTraceString(e));
            }
        }
        com.ironsource.F9.i().a(new com.ironsource.C3360x5(enumC3378y5, new org.json.JSONObject(j)));
    }

    private void c(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.i, "No available ad to load"));
            } else {
                a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (java.lang.Object[][]) null);
                this.f6429a.loadInterstitialForBidding(this.c, null, str, this);
            }
        }
    }

    private void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_NO_FILL, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_FAILED, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(java.util.List<java.lang.String> list, java.lang.String str) {
        a(list, h(), i(), this.j, str);
    }

    @Override // com.ironsource.InterfaceC3017e2
    public void a(com.ironsource.mediationsdk.d.a aVar, int i, long j, int i2, java.lang.String str) {
        java.lang.String str2;
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        this.s = aVar.a(l());
        com.ironsource.mediationsdk.demandOnly.a.C0158a c0158a = new com.ironsource.mediationsdk.demandOnly.a.C0158a(aVar.h());
        if (c0158a.isEmpty()) {
            str2 = "";
        } else {
            com.ironsource.C3232q2 c3232q2 = c0158a.get(0);
            this.q.a(c3232q2.b());
            this.q.c(c3232q2.h());
            this.q.b(c3232q2.g());
            str2 = c3232q2.k();
            b(str2);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(i2)}, new java.lang.Object[]{"reason", str}});
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}});
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c0158a.b()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (c0158a.isEmpty()) {
                com.ironsource.mediationsdk.logger.IronSourceError ironSourceError = new com.ironsource.mediationsdk.logger.IronSourceError(1158, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(str2);
        }
    }

    @Override // com.ironsource.U1
    public void a(java.util.List<com.ironsource.C3232q2> list, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.U1
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.j, "No available ad to load"));
        }
    }
}
