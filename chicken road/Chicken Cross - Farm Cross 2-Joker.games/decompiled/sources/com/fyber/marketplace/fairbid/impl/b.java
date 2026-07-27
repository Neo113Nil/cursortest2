package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;

/* loaded from: classes4.dex */
public final class b implements com.fyber.inneractive.sdk.interfaces.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6027a;

    public b(c cVar) {
        this.f6027a = cVar;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveAdRequest inneractiveAdRequest) {
        c cVar = this.f6027a;
        cVar.e.adSpot = new k(cVar.c, ((com.fyber.inneractive.sdk.flow.k) cVar.b).c);
        e eVar = this.f6027a.e;
        eVar.internalOnAdLoaded(eVar, eVar.adSpot);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f6027a.d.onAdLoadFailed(MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
    }
}
