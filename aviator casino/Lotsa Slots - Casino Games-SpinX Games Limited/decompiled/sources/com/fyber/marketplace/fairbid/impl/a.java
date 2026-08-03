package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener f4369a;
    public final /* synthetic */ com.fyber.inneractive.sdk.response.a b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.util.Map d;
    public final /* synthetic */ com.fyber.inneractive.sdk.external.InneractiveUnitController e;
    public final /* synthetic */ com.fyber.marketplace.fairbid.impl.e f;

    public a(com.fyber.marketplace.fairbid.impl.e eVar, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar, java.lang.String str, java.util.Map map, com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
        this.f = eVar;
        this.f4369a = marketplaceAdLoadListener;
        this.b = aVar;
        this.c = str;
        this.d = map;
        this.e = inneractiveUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.marketplace.fairbid.impl.e.access$000(this.f, this.e, this.f4369a, this.f.parseResponseData(this.f4369a, this.b, this.c, this.d), this.f.getAdContentLoader(this.f4369a, this.b));
    }
}
