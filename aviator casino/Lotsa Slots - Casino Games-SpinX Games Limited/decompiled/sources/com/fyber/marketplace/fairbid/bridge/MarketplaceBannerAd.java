package com.fyber.marketplace.fairbid.bridge;

/* loaded from: classes3.dex */
public interface MarketplaceBannerAd extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd {
    boolean canRefresh();

    int getAdHeight();

    int getAdWidth();

    boolean isUsingFullWidth();

    void showInView(android.view.ViewGroup viewGroup, com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener);
}
