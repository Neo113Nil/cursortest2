package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xb extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private final InternalNativeAdListener f8011a;

    public Xb(InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f8011a = mNativeAdListener;
    }

    @Override // com.ironsource.K0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f8011a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.K0
    public void d(AdInfo adInfo) {
        this.f8011a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.K0
    public void a(IronSourceError ironSourceError) {
        this.f8011a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.K0
    public void a(C4411fd placement, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f8011a.onNativeAdClicked(adInfo);
    }
}
