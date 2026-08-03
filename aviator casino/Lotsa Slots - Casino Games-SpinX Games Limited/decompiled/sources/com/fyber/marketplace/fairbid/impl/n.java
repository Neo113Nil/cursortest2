package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class n extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridge {
    public final com.fyber.marketplace.fairbid.impl.g c = new com.fyber.marketplace.fairbid.impl.g(new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a()));
    public boolean d = false;

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters getAuctionParameters(java.lang.String str) {
        com.fyber.marketplace.fairbid.impl.g gVar = this.c;
        gVar.c = str;
        return gVar;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final boolean isMuted() {
        return this.d;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void loadBannerAd(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map map, com.fyber.marketplace.fairbid.bridge.MarketplaceBannerListener marketplaceBannerListener) {
        com.fyber.inneractive.sdk.util.IAlog.a("Request Banner with spotId = %s", str);
        com.fyber.inneractive.sdk.config.IAConfigManager.addListener(new com.fyber.marketplace.fairbid.impl.m(this, new com.fyber.marketplace.fairbid.impl.j(str, jSONObject, map, this.d, marketplaceBannerListener, this.c), marketplaceBannerListener));
        com.fyber.inneractive.sdk.config.IAConfigManager.a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void loadInterstitialAd(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map map, com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialListener marketplaceInterstitialListener) {
        com.fyber.inneractive.sdk.util.IAlog.a("Request Interstitial with spotId = %s", str);
        com.fyber.inneractive.sdk.config.IAConfigManager.addListener(new com.fyber.marketplace.fairbid.impl.m(this, new com.fyber.marketplace.fairbid.impl.p(str, jSONObject, map, this.d, marketplaceInterstitialListener, this.c), marketplaceInterstitialListener));
        com.fyber.inneractive.sdk.config.IAConfigManager.a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void loadRewardedAd(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map map, com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedListener marketplaceRewardedListener) {
        com.fyber.inneractive.sdk.util.IAlog.a("Request Interstitial with spotId = %s", str);
        com.fyber.inneractive.sdk.config.IAConfigManager.addListener(new com.fyber.marketplace.fairbid.impl.m(this, new com.fyber.marketplace.fairbid.impl.q(str, jSONObject, map, this.d, marketplaceRewardedListener, this.c), marketplaceRewardedListener));
        com.fyber.inneractive.sdk.config.IAConfigManager.a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final java.lang.String requestUserAgent(com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.marketplace.fairbid.impl.l(marketplaceOnUserAgentAvailableListener));
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.x.a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void setMuted(boolean z) {
        this.d = z;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters getAuctionParameters() {
        com.fyber.marketplace.fairbid.impl.g gVar = this.c;
        gVar.c = "";
        return gVar;
    }
}
