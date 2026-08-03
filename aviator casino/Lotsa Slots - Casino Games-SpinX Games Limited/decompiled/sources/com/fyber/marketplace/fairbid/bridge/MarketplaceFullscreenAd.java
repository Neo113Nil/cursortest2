package com.fyber.marketplace.fairbid.bridge;

/* loaded from: classes3.dex */
public interface MarketplaceFullscreenAd<T extends com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener> extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd {
    boolean isAvailable();

    void show(android.app.Activity activity, T t);
}
