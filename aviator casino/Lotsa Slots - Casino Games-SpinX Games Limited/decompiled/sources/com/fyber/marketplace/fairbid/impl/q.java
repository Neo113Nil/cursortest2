package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class q extends com.fyber.marketplace.fairbid.impl.o implements com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedAd, com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener {
    public q(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, boolean z, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd<com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedDisplayEventsListener>> marketplaceAdLoadListener, com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, z, marketplaceAdLoadListener, marketplaceAuctionParameters);
        this.mController.setRewardedListener(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener marketplaceFullscreenDisplayEventsListener = this.mEventsListener;
        if (marketplaceFullscreenDisplayEventsListener != null) {
            ((com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedDisplayEventsListener) marketplaceFullscreenDisplayEventsListener).onReward();
        }
    }
}
