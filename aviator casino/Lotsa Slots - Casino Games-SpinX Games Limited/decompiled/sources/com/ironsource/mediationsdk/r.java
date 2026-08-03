package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public final class r extends com.ironsource.mediationsdk.a<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener> implements com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID adUnitObjectId) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.a.NATIVE_AD, adUnitObjectId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitObjectId, "adUnitObjectId");
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject config, org.json.JSONObject adUnitData, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        java.lang.Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f6395a.loadNativeAdForBidding(config, adUnitData, adData.getServerData(), this);
        } else {
            this.f6395a.loadNativeAd(config, adUnitData, this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.a b() {
        return com.ironsource.mediationsdk.IronSource.a.NATIVE_AD;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        int errorCode = ironSourceError != null ? ironSourceError.getErrorCode() : 1000;
        java.lang.String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        if (this.b.get() != null) {
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType = a(ironSourceError) ? com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
            if (nativeAdListener != null) {
                nativeAdListener.onAdLoadFailed(adapterErrorType, errorCode, errorMessage);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadSuccess(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f6395a.destroyNativeAd(config);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        com.ironsource.mediationsdk.AbstractAdapter abstractAdapter = this.f6395a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jSONObject);
        abstractAdapter.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    private final boolean a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError != null && ironSourceError.getErrorCode() == 706;
    }
}
