package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e f4371a;
    public final /* synthetic */ com.fyber.inneractive.sdk.interfaces.c b;
    public final /* synthetic */ com.fyber.inneractive.sdk.external.InneractiveUnitController c;
    public final /* synthetic */ com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener d;
    public final /* synthetic */ com.fyber.marketplace.fairbid.impl.e e;

    public c(com.fyber.marketplace.fairbid.impl.e eVar, com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.e eVar2, com.fyber.inneractive.sdk.interfaces.c cVar) {
        this.e = eVar;
        this.f4371a = eVar2;
        this.b = cVar;
        this.c = inneractiveUnitController;
        this.d = marketplaceAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        com.fyber.marketplace.fairbid.impl.e eVar = this.e;
        com.fyber.inneractive.sdk.config.global.r featureProvider = eVar.mMarketplaceAuctionParameters.getFeatureProvider(eVar.mPlacementId);
        if (featureProvider == null) {
            featureProvider = com.fyber.inneractive.sdk.config.global.r.a();
        }
        com.fyber.inneractive.sdk.config.global.r rVar = featureProvider;
        com.fyber.inneractive.sdk.response.e eVar2 = this.f4371a;
        com.fyber.inneractive.sdk.config.global.e eVar3 = new com.fyber.inneractive.sdk.config.global.e();
        com.fyber.inneractive.sdk.external.ImpressionData impressionData = eVar2.r;
        eVar3.f3602a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            eVar3.b = java.lang.Long.valueOf(com.fyber.inneractive.sdk.config.IAConfigManager.N.d);
        } catch (java.lang.NumberFormatException unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("invalid publisherId", new java.lang.Object[0]);
        }
        rVar.a(eVar3);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.b;
        com.fyber.inneractive.sdk.response.e eVar4 = this.f4371a;
        z = this.e.mMuted;
        com.fyber.marketplace.fairbid.impl.b bVar = new com.fyber.marketplace.fairbid.impl.b(this);
        com.fyber.inneractive.sdk.flow.k kVar = (com.fyber.inneractive.sdk.flow.k) cVar;
        kVar.h = z;
        kVar.a(null, eVar4, rVar, bVar, null);
    }
}
