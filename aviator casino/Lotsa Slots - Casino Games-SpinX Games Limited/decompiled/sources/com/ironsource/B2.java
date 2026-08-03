package com.ironsource;

/* loaded from: classes5.dex */
public final class B2 extends com.ironsource.B implements com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener {
    private android.view.View y;
    private android.widget.FrameLayout.LayoutParams z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(com.ironsource.V0 adTools, com.ironsource.C instanceData, com.ironsource.I adInstancePayload, com.ironsource.D2 listener) {
        super(adTools, instanceData, adInstancePayload, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        a(listener);
    }

    private final com.ironsource.D2 K() {
        com.ironsource.F s = s();
        if (s instanceof com.ironsource.D2) {
            return (com.ironsource.D2) s;
        }
        return null;
    }

    private final com.ironsource.mediationsdk.ISBannerSize L() {
        com.ironsource.V0 f = f();
        com.ironsource.AbstractC3355x0 j = n().j();
        kotlin.jvm.internal.Intrinsics.checkNotNull(j, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return f.a(((com.ironsource.M2) j).b().i());
    }

    private final void M() {
        com.ironsource.C3064gd j = j();
        if (j != null) {
            f().e().a().f(j.c());
        }
        com.ironsource.D2 K = K();
        if (K != null) {
            K.a(this);
        }
    }

    private final void N() {
        com.ironsource.C3064gd j = j();
        if (j != null) {
            f().e().a().c(j.c());
        }
        com.ironsource.D2 K = K();
        if (K != null) {
            K.b(this);
        }
    }

    private final void O() {
        com.ironsource.C3064gd j = j();
        if (j != null) {
            f().e().a().h(j.c());
        }
        com.ironsource.D2 K = K();
        if (K != null) {
            K.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.B2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        com.ironsource.mediationsdk.adunit.adapter.utility.AdData i = i();
        com.ironsource.mediationsdk.ISBannerSize L = L();
        java.util.Map<java.lang.String, java.lang.Object> adUnitData = i.getAdUnitData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put(com.ironsource.K2.t, new com.ironsource.mediationsdk.o(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), L));
        java.lang.Object g = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) g).loadAd(i, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity(), L, this);
    }

    @Override // com.ironsource.B
    public void a(com.ironsource.K adInstancePresenter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(q());
        com.ironsource.C3312ub.a(f(), new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.a(com.ironsource.B2.this);
            }
        }, 0L, 2, (java.lang.Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.B
    public void c() {
        try {
            if (g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) {
                java.lang.Object g = g();
                kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) g).destroyAd(i());
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
    }

    @Override // com.ironsource.B
    public com.unity3d.mediation.LevelPlayAdInfo e() {
        java.lang.String uuid = n().j().b().b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        java.lang.String c = n().j().b().c();
        java.lang.String aVar = n().i().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        com.ironsource.C3232q2 o = n().o();
        com.ironsource.AbstractC3355x0 j = n().j();
        kotlin.jvm.internal.Intrinsics.checkNotNull(j, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new com.unity3d.mediation.LevelPlayAdInfo(uuid, c, aVar, o, ((com.ironsource.M2) j).b().i(), n().j().l(), kotlin.collections.MapsKt.toMap(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.b(com.ironsource.B2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLeftApplication(java.util.Map map) {
        onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(android.view.View adView, android.widget.FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        onAdLoadSuccess(adView, frameLayoutParams, new java.util.LinkedHashMap());
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final java.util.Map<java.lang.String, java.lang.Object> extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.a(com.ironsource.B2.this, extraData);
            }
        });
        super.onAdOpened(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.c(com.ironsource.B2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenDismissed(java.util.Map map) {
        onAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.d(com.ironsource.B2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenPresented(java.util.Map map) {
        onAdScreenPresented();
    }

    public final void a(final com.ironsource.InterfaceC3389yg viewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        com.ironsource.C3312ub.a(f(), new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.a(com.ironsource.B2.this, viewBinder);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final android.view.View adView, final android.widget.FrameLayout.LayoutParams frameLayoutParams, java.util.Map<java.lang.String, java.lang.Object> extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "extraData");
        com.ironsource.C3312ub.a(f(), new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.a(com.ironsource.B2.this, adView, frameLayoutParams);
            }
        }, 0L, 2, (java.lang.Object) null);
        super.onAdLoadSuccess(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final com.ironsource.B2 this$0, com.ironsource.InterfaceC3389yg viewBinder) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        android.view.View view = this$0.y;
        if (view == null || (layoutParams = this$0.z) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this$0.f(), "Bind banner view", (java.lang.String) null, 2, (java.lang.Object) null));
        this$0.f().d(new java.lang.Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B2.e(com.ironsource.B2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.B2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y = null;
        this$0.z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.B2 this$0, android.view.View adView, android.widget.FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "$adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.y = adView;
        this$0.z = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.ironsource.B2 this$0) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.O a2 = this$0.f().e().a();
        com.ironsource.C3064gd j = this$0.j();
        if (j == null || (str = j.c()) == null) {
            str = "";
        }
        a2.j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.B2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.B2 this$0, java.util.Map extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.l().putAll(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.B2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }
}
