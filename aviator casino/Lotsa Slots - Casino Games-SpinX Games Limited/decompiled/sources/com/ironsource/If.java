package com.ironsource;

/* loaded from: classes5.dex */
public final class If {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Q8.a f5761a;
    private final java.lang.ref.WeakReference<com.ironsource.mediationsdk.testSuite.TestSuiteActivity> b;
    private final android.os.Handler c;
    private final java.util.concurrent.atomic.AtomicReference<com.unity3d.mediation.banner.LevelPlayBannerAdView> d;
    private final java.util.concurrent.atomic.AtomicReference<com.unity3d.mediation.interstitial.LevelPlayInterstitialAd> e;
    private final java.util.concurrent.atomic.AtomicReference<com.unity3d.mediation.rewarded.LevelPlayRewardedAd> f;

    public If(com.ironsource.mediationsdk.testSuite.TestSuiteActivity activity, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5761a = com.ironsource.Jb.u.a().d();
        this.b = new java.lang.ref.WeakReference<>(activity);
        this.c = handler;
        this.d = new java.util.concurrent.atomic.AtomicReference<>();
        this.e = new java.util.concurrent.atomic.AtomicReference<>();
        this.f = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public final void a(com.ironsource.Qf loadAdConfig, java.lang.String description, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        a();
        com.ironsource.mediationsdk.testSuite.TestSuiteActivity b = b();
        if (b != null) {
            this.f5761a.a(loadAdConfig);
            a(loadAdConfig);
            com.unity3d.mediation.banner.LevelPlayBannerAdView.Config build = new com.unity3d.mediation.banner.LevelPlayBannerAdView.Config.Builder().setAdSize(com.ironsource.Tf.f5986a.b(description, i, i2)).build();
            java.util.concurrent.atomic.AtomicReference<com.unity3d.mediation.banner.LevelPlayBannerAdView> atomicReference = this.d;
            java.lang.String b2 = loadAdConfig.b();
            if (b2 == null) {
                b2 = "";
            }
            com.unity3d.mediation.banner.LevelPlayBannerAdView levelPlayBannerAdView = new com.unity3d.mediation.banner.LevelPlayBannerAdView(b, b2, build);
            levelPlayBannerAdView.setBannerListener(new com.ironsource.Jf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    public final void b(com.ironsource.Qf loadAdConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f5761a.a(loadAdConfig);
        a(loadAdConfig);
        java.util.concurrent.atomic.AtomicReference<com.unity3d.mediation.interstitial.LevelPlayInterstitialAd> atomicReference = this.e;
        java.lang.String b = loadAdConfig.b();
        if (b == null) {
            b = "";
        }
        com.unity3d.mediation.interstitial.LevelPlayInterstitialAd levelPlayInterstitialAd = new com.unity3d.mediation.interstitial.LevelPlayInterstitialAd(b);
        levelPlayInterstitialAd.setListener(new com.ironsource.Nf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final boolean c() {
        com.unity3d.mediation.interstitial.LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        com.unity3d.mediation.rewarded.LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    public final void e() {
        com.ironsource.mediationsdk.testSuite.TestSuiteActivity b = b();
        if (b != null) {
            com.unity3d.mediation.interstitial.LevelPlayInterstitialAd levelPlayInterstitialAd = this.e.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            com.unity3d.mediation.interstitial.LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, b, null, 2, null);
        }
    }

    public final void f() {
        com.ironsource.mediationsdk.testSuite.TestSuiteActivity b = b();
        if (b != null) {
            com.unity3d.mediation.rewarded.LevelPlayRewardedAd levelPlayRewardedAd = this.f.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            com.unity3d.mediation.rewarded.LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, b, null, 2, null);
        }
    }

    public final void c(com.ironsource.Qf loadAdConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f5761a.a(loadAdConfig);
        a(loadAdConfig);
        java.util.concurrent.atomic.AtomicReference<com.unity3d.mediation.rewarded.LevelPlayRewardedAd> atomicReference = this.f;
        java.lang.String b = loadAdConfig.b();
        if (b == null) {
            b = "";
        }
        com.unity3d.mediation.rewarded.LevelPlayRewardedAd levelPlayRewardedAd = new com.unity3d.mediation.rewarded.LevelPlayRewardedAd(b);
        levelPlayRewardedAd.setListener(new com.ironsource.Wf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.mediationsdk.testSuite.TestSuiteActivity testSuiteActivity, com.unity3d.mediation.banner.LevelPlayBannerAdView it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    private final com.ironsource.mediationsdk.testSuite.TestSuiteActivity b() {
        return this.b.get();
    }

    public final void a(double d) {
        final com.unity3d.mediation.banner.LevelPlayBannerAdView levelPlayBannerAdView;
        final com.ironsource.mediationsdk.testSuite.TestSuiteActivity b = b();
        if (b == null || (levelPlayBannerAdView = this.d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.c.post(new java.lang.Runnable() { // from class: com.ironsource.If$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.If.a(com.ironsource.mediationsdk.testSuite.TestSuiteActivity.this, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.testSuite.TestSuiteActivity testSuiteActivity, com.unity3d.mediation.banner.LevelPlayBannerAdView banner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, com.ironsource.Yf.f6105a.a((android.content.Context) testSuiteActivity));
    }

    public final void a() {
        final com.unity3d.mediation.banner.LevelPlayBannerAdView andSet;
        final com.ironsource.mediationsdk.testSuite.TestSuiteActivity b = b();
        if (b == null || (andSet = this.d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.c.post(new java.lang.Runnable() { // from class: com.ironsource.If$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.If.b(com.ironsource.mediationsdk.testSuite.TestSuiteActivity.this, andSet);
            }
        });
    }

    private final void a(com.ironsource.Qf qf) {
        kotlin.Unit unit;
        java.lang.String a2 = qf.a();
        if (a2 != null) {
            com.ironsource.mediationsdk.c.b().a(qf.c(), a2);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("applyTestMode: adNetworkName is null");
        }
    }
}
