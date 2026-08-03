package com.ironsource;

/* loaded from: classes5.dex */
public final class Xb extends com.ironsource.L0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener f6080a;

    public Xb(com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener mNativeAdListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f6080a = mNativeAdListener;
    }

    @Override // com.ironsource.L0
    public void a(com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f6080a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.L0
    public void d(com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        this.f6080a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.L0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f6080a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.L0
    public void a(com.ironsource.C3064gd placement, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.f6080a.onNativeAdClicked(adInfo);
    }
}
