package com.fyber.marketplace.fairbid.impl;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.e0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;

/* loaded from: classes4.dex */
public final class m implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketplaceBridgeAd f6034a;
    public final /* synthetic */ MarketplaceAdLoadListener b;
    public final /* synthetic */ n c;

    public m(n nVar, MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener marketplaceAdLoadListener) {
        this.c = nVar;
        this.f6034a = marketplaceBridgeAd;
        this.b = marketplaceAdLoadListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (!IAConfigManager.d()) {
            MarketplaceAdLoadListener marketplaceAdLoadListener = this.b;
            if (marketplaceAdLoadListener != null) {
                marketplaceAdLoadListener.onAdLoadFailed(MarketplaceAdLoadError.FMP_NOT_READY_TO_LOAD_ADS);
                return;
            }
            return;
        }
        this.c.getClass();
        IAlog.a("maybeInitOmidSdk", new Object[0]);
        if (IAConfigManager.g()) {
            Application application = com.fyber.inneractive.sdk.util.o.f5960a;
            IAlog.c("initOmidSdk", new Object[0]);
            r.f5965a.execute(new e0(IAConfigManager.R, application));
        }
        this.f6034a.load();
    }
}
