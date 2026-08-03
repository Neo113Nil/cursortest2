package com.ironsource.mediationsdk.adapter;

/* loaded from: classes5.dex */
public abstract class AbstractInterstitialAdapter<AdNetworkAdapter> extends com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter<AdNetworkAdapter> implements com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface {
    public AbstractInterstitialAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        java.util.Map<java.lang.String, java.lang.Object> interstitialBiddingData = getInterstitialBiddingData(config, jSONObject);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(org.json.JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getInterstitialBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.sdk.InterstitialSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.sdk.InterstitialSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(org.json.JSONObject config, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(org.json.JSONObject config, org.json.JSONObject jSONObject, java.lang.String str, com.ironsource.mediationsdk.sdk.InterstitialSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(org.json.JSONObject config, com.ironsource.mediationsdk.sdk.InterstitialSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
