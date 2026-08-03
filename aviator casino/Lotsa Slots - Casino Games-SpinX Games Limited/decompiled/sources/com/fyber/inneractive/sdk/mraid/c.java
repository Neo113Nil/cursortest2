package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.factories.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.mraid.IAMraidKit f3818a;

    public c(com.fyber.inneractive.sdk.mraid.IAMraidKit iAMraidKit) {
        this.f3818a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        boolean isMRaidSpotContent;
        isMRaidSpotContent = this.f3818a.isMRaidSpotContent(inneractiveAdSpot);
        return isMRaidSpotContent;
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final com.fyber.inneractive.sdk.interfaces.f b(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return new com.fyber.inneractive.sdk.renderers.v();
    }
}
