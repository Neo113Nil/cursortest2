package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class j extends com.fyber.marketplace.fairbid.impl.e implements com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener {
    private android.widget.FrameLayout mContainer;
    private final com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController mController;
    private com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener mEventsListener;
    private boolean mInternalBrowserPossiblyOpen;
    private final com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd> mLoadListener;

    public j(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, boolean z, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd> marketplaceAdLoadListener, com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, z, marketplaceAuctionParameters);
        this.mInternalBrowserPossiblyOpen = false;
        this.mLoadListener = marketplaceAdLoadListener;
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = new com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController(true);
        this.mController = inneractiveAdViewUnitController;
        inneractiveAdViewUnitController.setEventsListener(this);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd
    public boolean canRefresh() {
        return !this.mInternalBrowserPossiblyOpen && this.mController.canRefreshAd();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd
    public void destroy() {
        if (this.mController != null) {
            android.widget.FrameLayout frameLayout = this.mContainer;
            if (frameLayout != null) {
                android.view.ViewParent parent = frameLayout.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeAllViews();
                }
                this.mController.unbindView(this.mContainer);
                this.mContainer = null;
            }
            com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot = this.mController.getAdSpot();
            if (adSpot != null) {
                adSpot.destroy();
            }
        }
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd
    public int getAdHeight() {
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = this.mController;
        if (inneractiveAdViewUnitController != null) {
            return inneractiveAdViewUnitController.getAdContentHeight();
        }
        return 0;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd
    public int getAdWidth() {
        return this.mController != null ? -1 : 0;
    }

    @Override // com.fyber.marketplace.fairbid.impl.e
    public void internalOnAdLoaded(com.fyber.marketplace.fairbid.impl.e eVar, com.fyber.marketplace.fairbid.impl.k kVar) {
        if (this.mController != null && kVar != null) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().bindSpot(kVar);
            this.mController.setAdSpot(kVar);
        }
        com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd> marketplaceAdLoadListener = this.mLoadListener;
        if (marketplaceAdLoadListener != null) {
            marketplaceAdLoadListener.onAdLoaded(this);
        }
    }

    @Override // com.fyber.marketplace.fairbid.impl.e
    public boolean isFullscreen() {
        return false;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd
    public boolean isUsingFullWidth() {
        return true;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd
    public void load() {
        loadAd(this.mController, this.mLoadListener);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.mInternalBrowserPossiblyOpen = true;
        com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener = this.mEventsListener;
        if (marketplaceBannerDisplayEventsListener != null) {
            marketplaceBannerDisplayEventsListener.onClick();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener;
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = this.mController;
        if (inneractiveAdViewUnitController == null || (marketplaceBannerDisplayEventsListener = this.mEventsListener) == null) {
            return;
        }
        marketplaceBannerDisplayEventsListener.onSizeChange(inneractiveAdViewUnitController.getAdContentWidth(), this.mController.getAdContentHeight());
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener;
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = this.mController;
        if (inneractiveAdViewUnitController == null || (marketplaceBannerDisplayEventsListener = this.mEventsListener) == null) {
            return;
        }
        marketplaceBannerDisplayEventsListener.onSizeChange(inneractiveAdViewUnitController.getAdContentWidth(), this.mController.getAdContentHeight());
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener = this.mEventsListener;
        if (marketplaceBannerDisplayEventsListener != null) {
            marketplaceBannerDisplayEventsListener.onShow();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener;
        com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController inneractiveAdViewUnitController = this.mController;
        if (inneractiveAdViewUnitController == null || (marketplaceBannerDisplayEventsListener = this.mEventsListener) == null) {
            return;
        }
        marketplaceBannerDisplayEventsListener.onSizeChange(inneractiveAdViewUnitController.getAdContentWidth(), this.mController.getAdContentHeight());
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.mInternalBrowserPossiblyOpen = false;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.mInternalBrowserPossiblyOpen = false;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBannerAd
    public void showInView(android.view.ViewGroup viewGroup, com.fyber.marketplace.fairbid.bridge.MarketplaceBannerDisplayEventsListener marketplaceBannerDisplayEventsListener) {
        if (this.mController == null || this.adSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("Banner is not ready to be shown", new java.lang.Object[0]);
            return;
        }
        this.mContainer = new com.fyber.marketplace.fairbid.impl.i(viewGroup.getContext());
        viewGroup.removeAllViews();
        viewGroup.addView(this.mContainer);
        this.mController.bindView(this.mContainer);
        this.mEventsListener = marketplaceBannerDisplayEventsListener;
    }
}
