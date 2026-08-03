package com.fyber.marketplace.fairbid.bridge;

/* loaded from: classes3.dex */
public interface MarketplaceAdLoadListener<T extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd> {
    void onAdLoadFailed(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError marketplaceAdLoadError);

    void onAdLoaded(T t);
}
