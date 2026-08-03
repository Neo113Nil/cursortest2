package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.interfaces.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.marketplace.fairbid.impl.c f4370a;

    public b(com.fyber.marketplace.fairbid.impl.c cVar) {
        this.f4370a = cVar;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.marketplace.fairbid.impl.c cVar = this.f4370a;
        cVar.e.adSpot = new com.fyber.marketplace.fairbid.impl.k(cVar.c, ((com.fyber.inneractive.sdk.flow.k) cVar.b).c);
        com.fyber.marketplace.fairbid.impl.e eVar = this.f4370a.e;
        eVar.internalOnAdLoaded(eVar, eVar.adSpot);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f4370a.d.onAdLoadFailed(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
    }
}
