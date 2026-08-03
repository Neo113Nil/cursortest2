package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.factories.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.mraid.IAMraidKit f3820a;

    public d(com.fyber.inneractive.sdk.mraid.IAMraidKit iAMraidKit) {
        this.f3820a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final boolean a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        boolean isMRaidSpotContent;
        isMRaidSpotContent = this.f3820a.isMRaidSpotContent(inneractiveAdSpot);
        return isMRaidSpotContent;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final com.fyber.inneractive.sdk.interfaces.d a() {
        return new com.fyber.inneractive.sdk.renderers.n();
    }
}
