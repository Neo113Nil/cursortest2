package com.fyber.inneractive.sdk.video;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.factories.g {
    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.t0);
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final com.fyber.inneractive.sdk.interfaces.f b(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f3765a;
        return (inneractiveAdSpot.getAdContent().b() && (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen())) ? new com.fyber.inneractive.sdk.renderers.x() : new com.fyber.inneractive.sdk.renderers.s();
    }
}
