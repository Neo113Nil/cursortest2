package com.ironsource.mediationsdk.sdk;

/* loaded from: classes5.dex */
public interface RewardedVideoAdapterInterface extends com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface {
    void collectRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback);

    void destroyRewardedVideoAd(org.json.JSONObject jSONObject);

    java.util.Map<java.lang.String, java.lang.Object> getRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2);

    void initAndLoadRewardedVideo(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener);

    void initRewardedVideoForDemandOnly(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener);

    void initRewardedVideoWithCallback(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener);

    boolean isRewardedVideoAvailable(org.json.JSONObject jSONObject);

    void loadRewardedVideo(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener);

    void loadRewardedVideoForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener);

    void showRewardedVideo(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener);
}
