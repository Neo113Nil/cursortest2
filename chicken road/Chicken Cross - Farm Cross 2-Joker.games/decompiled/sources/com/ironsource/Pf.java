package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pf {

    /* renamed from: a, reason: collision with root package name */
    private final Jf f7851a;
    private final Qf b;
    private final P8 c;

    public Pf(Jf adsManager, P8 uiLifeCycleListener, Qf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f7851a = adsManager;
        this.b = javaScriptEvaluator;
        this.c = uiLifeCycleListener;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d) {
        this.f7851a.a(d);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f7851a.a();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Zf.f8052a.a(Boolean.valueOf(this.f7851a.c())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Zf.f8052a.a(Boolean.valueOf(this.f7851a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z, z2, description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f7851a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f7851a.f();
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f7851a.a(new Rf(adNetwork, z, Boolean.valueOf(z2), str), description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f7851a.b(new Rf(adNetwork, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f7851a.c(new Rf(adNetwork, z, Boolean.valueOf(z2), str));
    }
}
