package com.ironsource;

/* loaded from: classes5.dex */
public final class Of {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.If f5885a;
    private final com.ironsource.Pf b;
    private final com.ironsource.R8 c;

    public Of(com.ironsource.If adsManager, com.ironsource.R8 uiLifeCycleListener, com.ironsource.Pf javaScriptEvaluator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f5885a = adsManager;
        this.b = javaScriptEvaluator;
        this.c = uiLifeCycleListener;
    }

    private final void a(java.lang.String str, com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.util.List<? extends java.lang.Object> list) {
        this.b.a(str, adFormat, list);
    }

    @android.webkit.JavascriptInterface
    public final void addBannerAdToScreen(double d) {
        this.f5885a.a(d);
    }

    @android.webkit.JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.c.onClosed();
    }

    @android.webkit.JavascriptInterface
    public final void destroyBannerAd() {
        this.f5885a.a();
    }

    @android.webkit.JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, com.ironsource.Yf.f6105a.a(java.lang.Boolean.valueOf(this.f5885a.c())));
    }

    @android.webkit.JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, com.ironsource.Yf.f6105a.a(java.lang.Boolean.valueOf(this.f5885a.d())));
    }

    @android.webkit.JavascriptInterface
    public final void loadBannerAd(java.lang.String adNetwork, boolean z, boolean z2, java.lang.String description, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z, z2, description, i, i2);
    }

    @android.webkit.JavascriptInterface
    public final void loadInterstitialAd(java.lang.String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z, z2);
    }

    @android.webkit.JavascriptInterface
    public final void loadRewardedVideoAd(java.lang.String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z, z2);
    }

    @android.webkit.JavascriptInterface
    public final void onDataLoaded() {
        this.c.onUIReady();
    }

    @android.webkit.JavascriptInterface
    public final void showInterstitialAd() {
        this.f5885a.e();
    }

    @android.webkit.JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f5885a.f();
    }

    @android.webkit.JavascriptInterface
    public final void loadBannerAd(java.lang.String str, java.lang.String adNetwork, boolean z, boolean z2, java.lang.String description, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        this.f5885a.a(new com.ironsource.Qf(adNetwork, z, java.lang.Boolean.valueOf(z2), str), description, i, i2);
    }

    @android.webkit.JavascriptInterface
    public final void loadInterstitialAd(java.lang.String str, java.lang.String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f5885a.b(new com.ironsource.Qf(adNetwork, z, java.lang.Boolean.valueOf(z2), str));
    }

    @android.webkit.JavascriptInterface
    public final void loadRewardedVideoAd(java.lang.String str, java.lang.String adNetwork, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f5885a.c(new com.ironsource.Qf(adNetwork, z, java.lang.Boolean.valueOf(z2), str));
    }
}
