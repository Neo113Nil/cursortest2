package com.ironsource.mediationsdk.adapter;

/* loaded from: classes5.dex */
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter<AdNetworkAdapter> implements com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        java.util.Map<java.lang.String, java.lang.Object> nativeAdBiddingData = getNativeAdBiddingData(config, jSONObject);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    public java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties getNativeAdProperties(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties(config);
    }

    public void initNativeAdForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(org.json.JSONObject config, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadNativeAdForBidding(org.json.JSONObject config, org.json.JSONObject jSONObject, java.lang.String str, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
