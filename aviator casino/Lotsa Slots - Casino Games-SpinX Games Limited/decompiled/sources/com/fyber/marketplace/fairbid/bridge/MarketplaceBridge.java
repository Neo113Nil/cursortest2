package com.fyber.marketplace.fairbid.bridge;

/* loaded from: classes3.dex */
public abstract class MarketplaceBridge {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.fyber.marketplace.fairbid.impl.n f4368a;
    public static final java.lang.Object b = new java.lang.Object();

    public static void currentAudienceAppliesCoppa() {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.currentAudienceAppliesToCoppa();
    }

    public static void currentAudienceIsAChild() {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.currentAudienceIsAChild();
    }

    public static com.fyber.marketplace.fairbid.bridge.MarketplaceBridge getInstance() {
        com.fyber.marketplace.fairbid.impl.n nVar = f4368a;
        if (nVar == null) {
            synchronized (b) {
                nVar = f4368a;
                if (nVar == null) {
                    nVar = new com.fyber.marketplace.fairbid.impl.n();
                    f4368a = nVar;
                }
            }
        }
        return nVar;
    }

    public static java.lang.String getVersion() {
        return com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion();
    }

    public static com.fyber.marketplace.fairbid.bridge.MarketplaceBridge initialize(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.initialize(context, str);
        com.fyber.inneractive.sdk.config.IAConfigManager.N.s = str2;
        com.fyber.inneractive.sdk.util.IAlog.f4283a = z ? 2 : 5;
        return getInstance();
    }

    public static boolean isChild() {
        return com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild();
    }

    public abstract com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters getAuctionParameters();

    public abstract com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters getAuctionParameters(java.lang.String str);

    public abstract boolean isMuted();

    public abstract void loadBannerAd(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, com.fyber.marketplace.fairbid.bridge.MarketplaceBannerListener marketplaceBannerListener);

    public abstract void loadInterstitialAd(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialListener marketplaceInterstitialListener);

    public abstract void loadRewardedAd(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedListener marketplaceRewardedListener);

    public abstract java.lang.String requestUserAgent(com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener);

    public abstract void setMuted(boolean z);
}
