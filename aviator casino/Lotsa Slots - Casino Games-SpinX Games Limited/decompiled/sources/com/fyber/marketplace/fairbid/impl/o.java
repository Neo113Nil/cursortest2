package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public abstract class o extends com.fyber.marketplace.fairbid.impl.e implements com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener {
    protected final com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController mController;
    protected com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener mEventsListener;
    private final com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener>> mLoadListener;

    public o(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, boolean z, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener>> marketplaceAdLoadListener, com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, z, marketplaceAuctionParameters);
        this.mLoadListener = marketplaceAdLoadListener;
        com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController();
        this.mController = inneractiveFullscreenUnitController;
        inneractiveFullscreenUnitController.setEventsListener(this);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd
    public void destroy() {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot;
        com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.mController;
        if (inneractiveFullscreenUnitController == null || (adSpot = inneractiveFullscreenUnitController.getAdSpot()) == null) {
            return;
        }
        adSpot.destroy();
    }

    @Override // com.fyber.marketplace.fairbid.impl.e
    public void internalOnAdLoaded(com.fyber.marketplace.fairbid.impl.e eVar, com.fyber.marketplace.fairbid.impl.k kVar) {
        if (this.mController != null && kVar != null) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().bindSpot(kVar);
            this.mController.setAdSpot(kVar);
        }
        com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd<com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener>> marketplaceAdLoadListener = this.mLoadListener;
        if (marketplaceAdLoadListener != null) {
            marketplaceAdLoadListener.onAdLoaded(this);
        }
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd
    public boolean isAvailable() {
        com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.mController;
        return inneractiveFullscreenUnitController != null && inneractiveFullscreenUnitController.isAvailable();
    }

    @Override // com.fyber.marketplace.fairbid.impl.e
    public boolean isFullscreen() {
        return true;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd
    public void load() {
        loadAd(this.mController, this.mLoadListener);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener marketplaceFullscreenDisplayEventsListener = this.mEventsListener;
        if (marketplaceFullscreenDisplayEventsListener != null) {
            marketplaceFullscreenDisplayEventsListener.onClick();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener marketplaceFullscreenDisplayEventsListener = this.mEventsListener;
        if (marketplaceFullscreenDisplayEventsListener != null) {
            marketplaceFullscreenDisplayEventsListener.onClose();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener marketplaceFullscreenDisplayEventsListener = this.mEventsListener;
        if (marketplaceFullscreenDisplayEventsListener != null) {
            marketplaceFullscreenDisplayEventsListener.onShow();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd
    public void show(android.app.Activity activity, com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener marketplaceFullscreenDisplayEventsListener) {
        if (this.mController == null) {
            if (marketplaceFullscreenDisplayEventsListener != null) {
                marketplaceFullscreenDisplayEventsListener.onShowError(com.fyber.marketplace.fairbid.bridge.MarketplaceAdShowError.GENERIC_SHOW_ERROR);
            }
        } else {
            this.mEventsListener = marketplaceFullscreenDisplayEventsListener;
            if (this.adSpot.isReady()) {
                this.mController.show(activity);
            } else {
                marketplaceFullscreenDisplayEventsListener.onShowError(com.fyber.marketplace.fairbid.bridge.MarketplaceAdShowError.EXPIRED_AD_ERROR);
            }
        }
    }
}
