package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class l extends com.ironsource.mediationsdk.demandOnly.m implements com.ironsource.mediationsdk.demandOnly.n.b, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener, com.ironsource.InterfaceC3017e2 {
    private com.ironsource.C3056g5 n;
    private com.ironsource.C3056g5 o;
    private com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener p;
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
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.ironsource.mediationsdk.demandOnly.l.this.k());
            com.ironsource.mediationsdk.demandOnly.l.this.a(new com.ironsource.mediationsdk.logger.IronSourceError(1055, "load timed out"));
        }
    }

    l(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new com.ironsource.C3016e1(networkSettings, networkSettings.getRewardedVideoSettings(), com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.s = new com.ironsource.mediationsdk.demandOnly.p.b();
        this.t = com.ironsource.Jb.Y().s();
        this.u = com.ironsource.Jb.Q().i();
        this.p = iSDemandOnlyRewardedVideoListener;
        this.f = j;
        this.r = eVar;
        this.f6429a.initRewardedVideoForDemandOnly(str, str2, this.c, this);
    }

    private void c(com.ironsource.mediationsdk.demandOnly.o oVar) {
        this.n = new com.ironsource.C3056g5();
        a(s());
        if (!n()) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.j.a.k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar = (com.ironsource.mediationsdk.d.a) oVar.a(new com.ironsource.C3145l5());
            com.ironsource.C3232q2 a2 = new com.ironsource.mediationsdk.demandOnly.a.C0158a(aVar.h()).a(h());
            if (a2 == null) {
                com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED, (java.lang.Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            java.lang.String k = a2.k();
            if (k == null) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("serverData is null");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar.a());
            a(aVar.f());
            a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (java.lang.Object[][]) null);
            this.q.a(a2.b());
            this.o = new com.ironsource.C3056g5();
            this.f6429a.loadRewardedVideoForBidding(this.c, null, k, this);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    private com.ironsource.mediationsdk.logger.IronSourceError q() {
        return a(com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS) ? new com.ironsource.mediationsdk.logger.IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS) ? new com.ironsource.mediationsdk.logger.IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new com.ironsource.mediationsdk.logger.IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.h r() {
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
        java.util.Map<java.lang.String, java.lang.Object> rewardedVideoBiddingData = this.f6429a.getRewardedVideoBiddingData(this.c, new org.json.JSONObject());
        if (rewardedVideoBiddingData != null) {
            c3106j2.b(rewardedVideoBiddingData);
        }
        hVar.a(c3106j2);
        return hVar;
    }

    private java.util.TimerTask s() {
        return new com.ironsource.mediationsdk.demandOnly.l.a();
    }

    private void t() {
        this.o = new com.ironsource.C3056g5();
        this.f6429a.loadRewardedVideo(this.c, null, this);
    }

    private void u() {
        if (!this.r.a()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new com.ironsource.mediationsdk.logger.IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (java.lang.Object[][]) null);
        com.ironsource.mediationsdk.h r = r();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("auction waterfallString = " + r.s());
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, r.s()}});
        this.r.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r, this);
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new com.ironsource.C3053g2();
    }

    private void w() {
        this.n = new com.ironsource.C3056g5();
        a(s());
        if (n()) {
            com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED, (java.lang.Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean z = false;
        if (!a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(com.ironsource.EnumC3378y5.RV_INSTANCE_READY_FALSE, (java.lang.Object[][]) null);
            return false;
        }
        try {
            z = this.f6429a.isRewardedVideoAvailable(this.c);
            a(z ? com.ironsource.EnumC3378y5.RV_INSTANCE_READY_TRUE : com.ironsource.EnumC3378y5.RV_INSTANCE_READY_FALSE, (java.lang.Object[][]) null);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception=" + e.getMessage());
        }
        return z;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(com.ironsource.mediationsdk.demandOnly.o oVar) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a a2 = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(1053, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD, (java.lang.Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(com.ironsource.EnumC3378y5.RV_INSTANCE_SHOW, (java.lang.Object[][]) null);
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED, com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS)) {
            this.f6429a.showRewardedVideo(this.c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_CLICKED, new java.lang.Object[0][]);
        this.p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(java.util.Map map) {
        onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.RV_INSTANCE_CLOSED, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(java.util.Map map) {
        onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(java.util.Map map) {
        onRewardedVideoAdEnded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_OPENED, new java.lang.Object[0][]);
        a(this.q.a(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
        this.p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdOpened(java.util.Map map) {
        onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        java.util.Map<java.lang.String, java.lang.Object> j = j();
        if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().g())) {
            j.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.ironsource.mediationsdk.p.h().g());
        }
        if (com.ironsource.mediationsdk.p.h().m() != null) {
            for (java.lang.String str : com.ironsource.mediationsdk.p.h().m().keySet()) {
                j.put("custom_" + str, com.ironsource.mediationsdk.p.h().m().get(str));
            }
        }
        com.ironsource.C3064gd a2 = com.ironsource.mediationsdk.p.h().e().c().f().a();
        if (a2 != null) {
            j.put("placement", a2.c());
            j.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, a2.f());
            j.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(a2.e()));
        } else {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("defaultPlacement is null");
        }
        com.ironsource.C3360x5 c3360x5 = new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_REWARDED, new org.json.JSONObject(j));
        c3360x5.a(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, com.ironsource.mediationsdk.utils.IronSourceUtils.a(c3360x5.d(), h()));
        com.ironsource.C3065ge.i().a(c3360x5);
        this.p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(java.util.Map map) {
        onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        a(com.ironsource.EnumC3378y5.RV_INSTANCE_SHOW_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(java.util.Map map) {
        onRewardedVideoAdStarted();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(com.ironsource.EnumC3378y5.RV_INSTANCE_VISIBLE, new java.lang.Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(java.util.Map map) {
        onRewardedVideoAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z, java.util.Map map) {
        onRewardedVideoAvailabilityChanged(z);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(java.util.Map map) {
        onRewardedVideoInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.o))}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.C3056g5.a(this.n))}});
            a(this.q.c(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            this.p.onRewardedVideoAdLoadSuccess(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadSuccess(java.util.Map map) {
        onRewardedVideoLoadSuccess();
    }

    void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED)) {
            a(ironSourceError, com.ironsource.C3056g5.a(this.n));
            a(this.q.b(), com.ironsource.mediationsdk.utils.IronSourceUtils.a());
            this.p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
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
        com.ironsource.C3065ge.i().a(new com.ironsource.C3360x5(enumC3378y5, new org.json.JSONObject(j)));
    }

    private void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_NO_FILL, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void c() {
        java.lang.String str;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a a2 = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            if (a2 == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.p.onRewardedVideoAdLoadFailed(l(), new com.ironsource.mediationsdk.logger.IronSourceError(1053, str));
            return;
        }
        v();
        a(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD, (java.lang.Object[][]) null);
        w();
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
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}});
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c0158a.b()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (c0158a.isEmpty()) {
                com.ironsource.mediationsdk.logger.IronSourceError ironSourceError = new com.ironsource.mediationsdk.logger.IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(str2);
        }
    }

    private void c(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new com.ironsource.mediationsdk.logger.IronSourceError(1062, "No available ad to load"));
            } else {
                a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (java.lang.Object[][]) null);
                this.f6429a.loadRewardedVideoForBidding(this.c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.U1
    public void a(java.util.List<com.ironsource.C3232q2> list, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.U1
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.j.a.j, "No available ad to load"));
        }
    }
}
