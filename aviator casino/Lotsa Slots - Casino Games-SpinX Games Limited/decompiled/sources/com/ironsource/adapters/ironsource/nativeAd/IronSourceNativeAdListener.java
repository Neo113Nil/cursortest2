package com.ironsource.adapters.ironsource.nativeAd;

/* loaded from: classes5.dex */
public final class IronSourceNativeAdListener implements com.ironsource.E8.a {
    private final com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder binder;
    private final com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder binder, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener smashListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binder, "binder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.E8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.E8.a
    public void onNativeAdLoadFailed(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "Load failed - " + reason));
    }

    @Override // com.ironsource.E8.a
    public void onNativeAdLoadSuccess(com.ironsource.C8 adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        this.smashListener.onNativeAdLoaded(new com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.E8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
