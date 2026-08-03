package com.unity3d.ironsourceads.interstitial;

/* loaded from: classes5.dex */
public final class InterstitialAd implements com.ironsource.InterfaceC3346w9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3328v9 f8023a;
    private com.unity3d.ironsourceads.interstitial.InterstitialAdListener b;

    public InterstitialAd(com.ironsource.C3328v9 interstitialAdInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.f8023a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    public final com.unity3d.ironsourceads.interstitial.InterstitialAdInfo getAdInfo() {
        return this.f8023a.b();
    }

    public final com.unity3d.ironsourceads.interstitial.InterstitialAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        com.ironsource.mediationsdk.logger.IronLog.API.info();
        return this.f8023a.d();
    }

    @Override // com.ironsource.InterfaceC3346w9
    public void onAdInstanceDidBecomeVisible() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC3346w9
    public void onAdInstanceDidClick() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC3346w9
    public void onAdInstanceDidDismiss() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC3346w9
    public void onAdInstanceDidFailedToShow(com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC3346w9
    public void onAdInstanceDidReward(java.lang.String str, int i) {
    }

    @Override // com.ironsource.InterfaceC3346w9
    public void onAdInstanceDidShow() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(com.unity3d.ironsourceads.interstitial.InterstitialAdListener interstitialAdListener) {
        this.b = interstitialAdListener;
    }

    public final void show(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.mediationsdk.logger.IronLog.API.info();
        this.f8023a.a(activity);
    }
}
