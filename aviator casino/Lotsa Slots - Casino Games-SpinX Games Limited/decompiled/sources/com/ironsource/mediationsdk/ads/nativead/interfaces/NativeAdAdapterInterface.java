package com.ironsource.mediationsdk.ads.nativead.interfaces;

/* loaded from: classes5.dex */
public interface NativeAdAdapterInterface extends com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface {
    void collectNativeAdBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback);

    void destroyNativeAd(org.json.JSONObject jSONObject);

    java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2);

    void initNativeAdForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener);

    void initNativeAds(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener);

    void loadNativeAd(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener);

    void loadNativeAdForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener);
}
