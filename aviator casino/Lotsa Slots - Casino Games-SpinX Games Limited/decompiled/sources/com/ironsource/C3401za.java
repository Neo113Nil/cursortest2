package com.ironsource;

/* renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3401za implements com.ironsource.InterfaceC3393z2 {
    public static final com.ironsource.C3401za.a n = new com.ironsource.C3401za.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.util.UUID f6861a;
    private final java.lang.String b;
    private final com.ironsource.W2 c;
    private final com.unity3d.mediation.banner.LevelPlayBannerAdView.Config d;
    private final com.ironsource.C3212p0 e;
    private final com.ironsource.Q8 f;
    private final com.unity3d.mediation.LevelPlayAdSize g;
    private com.unity3d.mediation.banner.LevelPlayBannerAdViewListener h;
    private final java.lang.String i;
    private com.ironsource.C3347wa j;
    private java.lang.Boolean k;
    private com.ironsource.C3064gd l;
    private boolean m;

    /* renamed from: com.ironsource.za$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.Pair<java.lang.String, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config> a(android.content.Context context, android.util.AttributeSet attributeSet) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.lang.String str = "";
            if (attributeSet == null) {
                return kotlin.TuplesKt.to("", com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Companion.empty());
            }
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.ironsource.sdk.mediation.R.styleable.LevelPlayBannerAdView);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Builder builder = new com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Builder();
                if (obtainStyledAttributes.hasValue(com.ironsource.sdk.mediation.R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(obtainStyledAttributes.getFloat(com.ironsource.sdk.mediation.R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                java.lang.String string = obtainStyledAttributes.getString(com.ironsource.sdk.mediation.R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(com.unity3d.mediation.LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                java.lang.String string2 = obtainStyledAttributes.getString(com.ironsource.sdk.mediation.R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return kotlin.TuplesKt.to(str, builder.build());
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public C3401za(java.util.UUID adId, java.lang.String adUnitId, com.ironsource.W2 bannerContainer, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config config, com.ironsource.C3212p0 adTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f6861a = adId;
        this.b = adUnitId;
        this.c = bannerContainer;
        this.d = config;
        this.e = adTools;
        this.f = com.ironsource.Jb.u.d().A();
        com.unity3d.mediation.LevelPlayAdSize adSize = config.getAdSize();
        this.g = adSize == null ? com.unity3d.mediation.LevelPlayAdSize.BANNER : adSize;
        java.lang.String placementName = config.getPlacementName();
        this.i = placementName == null ? "" : placementName;
        adTools.e().a(new com.ironsource.C3175n(com.ironsource.mediationsdk.IronSource.a.BANNER, adId, adUnitId));
        java.lang.Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.m) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(com.ironsource.C3212p0.a(this$0.e, "Banner not loaded", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        if (this$0.j == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(com.ironsource.C3212p0.a(this$0.e, "Banner already destroyed", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        com.ironsource.C3312ub.a(this$0.e, new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.b(com.ironsource.C3401za.this);
            }
        }, 0L, 2, (java.lang.Object) null);
        com.ironsource.C3347wa c3347wa = this$0.j;
        if (c3347wa != null) {
            c3347wa.c();
        }
        this$0.j = null;
        this$0.k = null;
        this$0.h = null;
    }

    private final boolean h() {
        if (this.b.length() == 0) {
            java.lang.String uuid = this.f6861a.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
            a(new com.unity3d.mediation.LevelPlayAdError(uuid, this.b, com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.e.g()) {
            java.lang.String uuid2 = this.f6861a.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid2, "adId.toString()");
            a(new com.unity3d.mediation.LevelPlayAdError(uuid2, this.b, com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        com.ironsource.Ua a2 = com.ironsource.Jb.u.d().f().a();
        if (a2 != null && a2.a(this.b, com.unity3d.mediation.LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.h;
        if (levelPlayBannerAdViewListener != null) {
            java.lang.String uuid3 = this.f6861a.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new com.unity3d.mediation.LevelPlayAdError(uuid3, this.b, com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final void b() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.e.d(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.a(com.ironsource.C3401za.this);
            }
        });
    }

    public final java.util.UUID c() {
        return this.f6861a;
    }

    public final com.unity3d.mediation.LevelPlayAdSize d() {
        return this.g;
    }

    public final java.lang.String e() {
        return this.b;
    }

    public final com.unity3d.mediation.banner.LevelPlayBannerAdViewListener f() {
        return this.h;
    }

    public final java.lang.String g() {
        return this.i;
    }

    public final void i() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.e.d(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.c(com.ironsource.C3401za.this);
            }
        });
    }

    public final void j() {
        kotlin.Unit unit;
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final com.ironsource.C3347wa c3347wa = this.j;
        if (c3347wa != null) {
            this.e.d(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3401za.a(com.ironsource.C3401za.this, c3347wa);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = java.lang.Boolean.FALSE;
        }
    }

    public final void k() {
        kotlin.Unit unit;
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final com.ironsource.C3347wa c3347wa = this.j;
        if (c3347wa != null) {
            this.e.d(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3401za.b(com.ironsource.C3401za.this, c3347wa);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.k = java.lang.Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(com.ironsource.C3212p0.a(this$0.e, "Banner load already called", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        this$0.m = true;
        if (this$0.h()) {
            com.ironsource.C3347wa a2 = this$0.a();
            this$0.j = a2;
            java.lang.Boolean bool = this$0.k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    a2.f();
                } else {
                    a2.d();
                }
            }
            a2.b();
        }
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void d(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.a(com.unity3d.mediation.LevelPlayAdInfo.this, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void e(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.c(com.unity3d.mediation.LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c.removeAllViews();
        android.view.ViewParent parent = this$0.c.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3401za this$0, com.ironsource.C3347wa it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void b(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.b(com.unity3d.mediation.LevelPlayAdInfo.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    public final void a(final com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.e.d(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.a(com.ironsource.C3401za.this, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3401za this$0, com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3401za this$0, com.ironsource.C3347wa it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e.e().f().b();
        it.d();
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void c(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.d(com.unity3d.mediation.LevelPlayAdInfo.this, this);
            }
        });
    }

    private final com.ironsource.C3347wa a() {
        com.ironsource.C3064gd c3064gd;
        this.l = this.e.a(this.i);
        android.content.Context context = this.c.getContext();
        if (context instanceof android.app.Activity) {
            com.ironsource.environment.ContextProvider.getInstance().updateActivity((android.app.Activity) context);
        }
        java.util.UUID uuid = this.f6861a;
        java.lang.String str = this.b;
        com.ironsource.C3064gd c3064gd2 = this.l;
        com.ironsource.C3064gd c3064gd3 = null;
        if (c3064gd2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            c3064gd = null;
        } else {
            c3064gd = c3064gd2;
        }
        com.ironsource.J2 j2 = new com.ironsource.J2(uuid, str, c3064gd, this.g, null, null, this.f.a(), this.d.getBidFloor(), 48, null);
        this.e.e().a(new com.ironsource.D0(this.e, j2, null, 4, null));
        com.ironsource.mediationsdk.ISBannerSize a2 = this.e.a(j2.i());
        com.ironsource.C3396z5 e = this.e.e();
        com.ironsource.C3212p0 c3212p0 = this.e;
        com.ironsource.C3064gd c3064gd4 = this.l;
        if (c3064gd4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            c3064gd3 = c3064gd4;
        }
        e.a(new com.ironsource.Y2(c3212p0, a2, c3064gd3.c()));
        return new com.ironsource.C3347wa(this, this.e, j2, this.c);
    }

    public /* synthetic */ C3401za(java.util.UUID uuid, java.lang.String str, com.ironsource.W2 w2, com.unity3d.mediation.banner.LevelPlayBannerAdView.Config config, com.ironsource.C3212p0 c3212p0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.ironsource.C3326v7.f6774a.a() : uuid, str, w2, config, (i & 16) != 0 ? new com.ironsource.C3212p0(com.ironsource.mediationsdk.IronSource.a.BANNER, com.ironsource.F0.b.MEDIATION) : c3212p0);
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z, com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void a(final com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3401za.a(com.unity3d.mediation.LevelPlayAdError.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayAdError it, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo, final com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3401za.a(com.unity3d.mediation.LevelPlayAdInfo.this, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayAdInfo adInfo, com.unity3d.mediation.LevelPlayAdError it, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.C3401za this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3393z2
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.e(new java.lang.Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3401za.e(com.unity3d.mediation.LevelPlayAdInfo.this, this);
            }
        });
    }
}
