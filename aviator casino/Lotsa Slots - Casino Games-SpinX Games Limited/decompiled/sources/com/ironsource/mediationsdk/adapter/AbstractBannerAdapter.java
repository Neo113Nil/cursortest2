package com.ironsource.mediationsdk.adapter;

/* loaded from: classes5.dex */
public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter<AdNetworkAdapter> implements com.ironsource.mediationsdk.sdk.BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        java.util.Map<java.lang.String, java.lang.Object> bannerBiddingData = getBannerBiddingData(config, jSONObject);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i) {
        return -1;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    public com.ironsource.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        return com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(org.json.JSONObject config, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(org.json.JSONObject config, org.json.JSONObject jSONObject, java.lang.String str, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(org.json.JSONObject config, java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.ironsource.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }
}
