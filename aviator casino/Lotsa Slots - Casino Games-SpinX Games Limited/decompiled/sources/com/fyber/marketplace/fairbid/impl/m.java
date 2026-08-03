package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class m implements com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd f4377a;
    public final /* synthetic */ com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener b;
    public final /* synthetic */ com.fyber.marketplace.fairbid.impl.n c;

    public m(com.fyber.marketplace.fairbid.impl.n nVar, com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd marketplaceBridgeAd, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener marketplaceAdLoadListener) {
        this.c = nVar;
        this.f4377a = marketplaceBridgeAd;
        this.b = marketplaceAdLoadListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager, boolean z, java.lang.Exception exc) {
        com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(this);
        if (!com.fyber.inneractive.sdk.config.IAConfigManager.d()) {
            com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener marketplaceAdLoadListener = this.b;
            if (marketplaceAdLoadListener != null) {
                marketplaceAdLoadListener.onAdLoadFailed(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.FMP_NOT_READY_TO_LOAD_ADS);
                return;
            }
            return;
        }
        this.c.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("maybeInitOmidSdk", new java.lang.Object[0]);
        if (com.fyber.inneractive.sdk.config.IAConfigManager.g()) {
            android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
            com.fyber.inneractive.sdk.util.IAlog.c("initOmidSdk", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.config.a0(com.fyber.inneractive.sdk.config.IAConfigManager.N, application));
        }
        this.f4377a.load();
    }
}
