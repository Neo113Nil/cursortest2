package com.ironsource.mediationsdk.sdk;

/* loaded from: classes5.dex */
public interface BannerAdapterInterface extends com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface {
    void collectBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback);

    void destroyBanner(org.json.JSONObject jSONObject);

    int getAdaptiveHeight(int i);

    java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2);

    void initBannerForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener);

    void initBanners(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener);

    void loadBanner(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener);

    void loadBannerForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener);

    void loadBannerForDemandOnlyForBidding(org.json.JSONObject jSONObject, java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener);

    void onBannerViewBound(org.json.JSONObject jSONObject);

    void onBannerViewWillBind(org.json.JSONObject jSONObject);
}
