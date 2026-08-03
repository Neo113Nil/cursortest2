package com.ironsource;

/* loaded from: classes5.dex */
public final class Xa implements com.ironsource.InterfaceC3021e6 {
    public static final com.ironsource.Xa.a o = new com.ironsource.Xa.a(null);
    public static final java.lang.String p = "Fullscreen Ad Internal";

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.mediation.LevelPlay.AdFormat f6076a;
    private final java.lang.String b;
    private final com.ironsource.Xa.b c;
    private final com.ironsource.C3212p0 d;
    private final com.ironsource.C3003d6 e;
    private final com.ironsource.Z0 f;
    private final com.ironsource.InterfaceC3373y0 g;
    private final com.ironsource.H7 h;
    private final com.ironsource.InterfaceC3216p4 i;
    private final kotlin.Lazy j;
    private com.ironsource.Ya k;
    private final java.util.UUID l;
    private com.ironsource.InterfaceC3200o6 m;
    private com.ironsource.C3056g5 n;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            com.ironsource.C3212p0 a2 = com.ironsource.C3212p0.a.a(com.unity3d.mediation.a.a(adFormat), com.ironsource.F0.b.MEDIATION);
            if (!a2.g()) {
                a2.e().a().a(placementName, com.ironsource.Y0.b, false);
                return false;
            }
            com.ironsource.G3 a3 = com.ironsource.Jb.u.d().p().a(placementName, adFormat);
            boolean d = a3.d();
            a2.e().a().a(placementName, a3.e(), d);
            return d;
        }

        private a() {
        }
    }

    public interface b {
        java.lang.Double getBidFloor();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C3212p0 f6077a;
        private final com.ironsource.C3003d6 b;
        private final com.ironsource.H7 c;
        private final com.ironsource.InterfaceC3216p4 d;
        private final com.ironsource.C3326v7 e;
        private final com.ironsource.Xa.b f;
        private final com.ironsource.Z0 g;

        public c(com.ironsource.C3212p0 adTools, com.ironsource.C3003d6 adControllerFactory, com.ironsource.H7 provider, com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.C3326v7 idFactory, com.ironsource.Xa.b config, com.ironsource.Z0 adUnitValidator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
            this.f6077a = adTools;
            this.b = adControllerFactory;
            this.c = provider;
            this.d = currentTimeProvider;
            this.e = idFactory;
            this.f = config;
            this.g = adUnitValidator;
        }

        public final com.ironsource.C3003d6 a() {
            return this.b;
        }

        public final com.ironsource.C3212p0 b() {
            return this.f6077a;
        }

        public final com.ironsource.Z0 c() {
            return this.g;
        }

        public final com.ironsource.Xa.b d() {
            return this.f;
        }

        public final com.ironsource.InterfaceC3216p4 e() {
            return this.d;
        }

        public final com.ironsource.C3326v7 f() {
            return this.e;
        }

        public final com.ironsource.H7 g() {
            return this.c;
        }
    }

    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.C2985c6> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C2985c6 invoke() {
            return com.ironsource.Xa.this.b();
        }
    }

    public static final class e implements com.ironsource.InterfaceC3236q6 {
        final /* synthetic */ com.ironsource.C3069h0 b;

        e(com.ironsource.C3069h0 c3069h0) {
            this.b = c3069h0;
        }

        @Override // com.ironsource.InterfaceC3236q6
        public com.ironsource.C3218p6 a(boolean z, com.ironsource.InterfaceC3271s6 listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            com.ironsource.AbstractC3355x0 a2 = com.ironsource.Xa.this.g().a(z, this.b);
            return new com.ironsource.C3218p6(com.ironsource.Jb.u.c(), new com.ironsource.V0(com.ironsource.Xa.this.f(), a2, com.ironsource.F0.b.MEDIATION), a2, listener, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Xa(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String adUnitId, com.ironsource.Xa.b config, com.ironsource.C3212p0 adTools, com.ironsource.C3003d6 fullscreenAdControllerFactory, com.ironsource.Z0 adUnitValidator, com.ironsource.InterfaceC3373y0 adUnitDataFactory, com.ironsource.H7 mediationServicesProvider, com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.C3326v7 idFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f6076a = adFormat;
        this.b = adUnitId;
        this.c = config;
        this.d = adTools;
        this.e = fullscreenAdControllerFactory;
        this.f = adUnitValidator;
        this.g = adUnitDataFactory;
        this.h = mediationServicesProvider;
        this.i = currentTimeProvider;
        this.j = kotlin.LazyKt.lazy(new com.ironsource.Xa.d());
        java.util.UUID a2 = idFactory.a();
        this.l = a2;
        this.m = new com.ironsource.C3039f6(this, null, 2, 0 == true ? 1 : 0);
        adTools.e().a(new com.ironsource.C3175n(com.unity3d.mediation.a.a(adFormat), a2, adUnitId));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.Xa this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.e().f().a();
        this$0.m.loadAd();
    }

    private final void p() {
        java.lang.Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.e().f().a(bidFloor.doubleValue());
        }
    }

    public final com.ironsource.C2985c6 c() {
        return (com.ironsource.C2985c6) this.j.getValue();
    }

    public final com.unity3d.mediation.LevelPlay.AdFormat d() {
        return this.f6076a;
    }

    public final java.util.UUID e() {
        return this.l;
    }

    public final com.ironsource.C3212p0 f() {
        return this.d;
    }

    public final com.ironsource.InterfaceC3373y0 g() {
        return this.g;
    }

    public final java.lang.String h() {
        return this.b;
    }

    public final com.ironsource.Xa.b i() {
        return this.c;
    }

    public final com.ironsource.InterfaceC3216p4 j() {
        return this.i;
    }

    public final com.ironsource.Ya k() {
        return this.k;
    }

    public final com.ironsource.H7 l() {
        return this.h;
    }

    public final boolean m() {
        com.ironsource.InterfaceC3122k0 c2 = this.m.c();
        this.d.e().e().a(java.lang.Boolean.valueOf(c2.a()), c2 instanceof com.ironsource.InterfaceC3122k0.a ? ((com.ironsource.InterfaceC3122k0.a) c2).c() : null);
        return c2.a();
    }

    public final void n() {
        this.n = new com.ironsource.C3056g5();
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.b(com.ironsource.Xa.this);
            }
        });
    }

    public final void o() {
        a(new com.ironsource.C3146l6(this, this.i));
        c().m();
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void onAdClicked() {
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.c(com.ironsource.Xa.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void onAdClosed() {
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.d(com.ironsource.Xa.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void onAdDisplayed(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.b(com.ironsource.Xa.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void onAdInfoChanged(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.c(com.ironsource.Xa.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void onAdLoadFailed(final com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.c(com.ironsource.Xa.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void onAdLoaded(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.d(com.ironsource.Xa.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdLoaded(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.ironsource.Xa this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.a();
    }

    public final void a(com.ironsource.Ya ya) {
        this.k = ya;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.Xa this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.Xa this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.onAdClosed();
    }

    public final void a(com.ironsource.InterfaceC3200o6 state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.m = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdInfoChanged(adInfo);
    }

    public final void a(final android.app.Activity activity, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(android.app.Activity activity, com.ironsource.Xa this$0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.environment.ContextProvider.getInstance().updateActivity(activity);
        this$0.d.e().h().d();
        this$0.m.a(activity, str);
    }

    public final void b(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.d.e().h().f("Fullscreen Ad Internal - " + message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ironsource.C2985c6 b() {
        com.ironsource.C3069h0 c3069h0 = new com.ironsource.C3069h0(com.unity3d.mediation.a.a(this.f6076a), this.l, this.b, null, this.h.A().a(), this.c.getBidFloor(), 8, null);
        com.ironsource.Xa.e eVar = new com.ironsource.Xa.e(c3069h0);
        com.ironsource.C3396z5 e2 = this.d.e();
        com.ironsource.C3212p0 c3212p0 = this.d;
        e2.a(new com.ironsource.D0(c3212p0, c3069h0, c3212p0.b(this.f6076a, this.b).b().b()));
        return this.e.a(this, this.d, c3069h0, eVar);
    }

    public final void a(com.ironsource.C3039f6.a status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.m = new com.ironsource.C3039f6(this, status);
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void a(final com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.b(com.ironsource.Xa.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void a() {
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.e(com.ironsource.Xa.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3021e6
    public void a(final com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.d, "onAdRewarded state.getAdInfo: " + this.m.b() + " reward: " + reward, (java.lang.String) null, 2, (java.lang.Object) null));
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final com.ironsource.Xa this$0, final com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "$reward");
        final com.unity3d.mediation.LevelPlayAdInfo b2 = this$0.m.b();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this$0.d, "onAdRewarded adInfo: " + b2 + " reward: " + reward, (java.lang.String) null, 2, (java.lang.Object) null));
        this$0.d.e(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, reward, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Xa this$0, com.unity3d.mediation.rewarded.LevelPlayReward reward, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "$reward");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.ironsource.Ya ya = this$0.k;
        if (ya != null) {
            ya.onAdRewarded(reward, adInfo);
        }
    }

    public final void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.d, "onAdLoaded adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        final long a2 = com.ironsource.C3056g5.a(this.n);
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, a2);
            }
        });
        this.d.e(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, adInfo);
            }
        });
    }

    public /* synthetic */ Xa(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String str, com.ironsource.Xa.b bVar, com.ironsource.C3212p0 c3212p0, com.ironsource.C3003d6 c3003d6, com.ironsource.Z0 z0, com.ironsource.InterfaceC3373y0 interfaceC3373y0, com.ironsource.H7 h7, com.ironsource.InterfaceC3216p4 interfaceC3216p4, com.ironsource.C3326v7 c3326v7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c3212p0, c3003d6, z0, interfaceC3373y0, (i & 128) != 0 ? com.ironsource.Jb.u.d() : h7, interfaceC3216p4, c3326v7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Xa this$0, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.e().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.ironsource.Ya ya = this$0.k;
        if (ya != null) {
            ya.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(com.ironsource.Xa xa, com.unity3d.mediation.LevelPlayAdError levelPlayAdError, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        xa.a(levelPlayAdError, j);
    }

    public final void a(final com.unity3d.mediation.LevelPlayAdError levelPlayAdError, final long j) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (java.lang.String) null, 2, (java.lang.Object) null));
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, j, levelPlayAdError);
            }
        });
        this.d.e(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.unity3d.mediation.LevelPlayAdError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Xa this$0, long j, com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Sc f = this$0.d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f.a(j, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError, com.ironsource.Xa this$0) {
        com.ironsource.Ya ya;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (ya = this$0.k) == null) {
            return;
        }
        ya.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(final com.unity3d.mediation.LevelPlayAdError error, final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        this.d.d(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, error);
            }
        });
        this.d.e(new java.lang.Runnable() { // from class: com.ironsource.Xa$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Xa.a(com.ironsource.Xa.this, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        this$0.d.e().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Xa this$0, com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.ironsource.Ya ya = this$0.k;
        if (ya != null) {
            ya.onAdDisplayFailed(error, adInfo);
        }
    }

    public final com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String str) {
        com.ironsource.N7 C = this.h.C();
        com.ironsource.H8 f = this.h.f();
        com.ironsource.Sc f2 = this.d.e().f();
        com.ironsource.X0 a2 = this.f.a(this.b, this.f6076a, f);
        if (a2 instanceof com.ironsource.X0.a) {
            com.ironsource.X0.a aVar = (com.ironsource.X0.a) a2;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(com.ironsource.C3212p0.a(this.d, "getReward() returned a default reward. Reason: " + aVar.b(), (java.lang.String) null, 2, (java.lang.Object) null));
            com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward = new com.unity3d.mediation.rewarded.LevelPlayReward("", 0);
            f2.a(levelPlayReward, str, aVar.b());
            return levelPlayReward;
        }
        com.unity3d.mediation.rewarded.LevelPlayReward a3 = C.a(str, this.b);
        com.ironsource.Sc.a(f2, a3, str, null, 4, null);
        return a3;
    }
}
