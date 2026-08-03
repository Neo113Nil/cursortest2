package com.fyber.inneractive.sdk.video;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.factories.a {
    @Override // com.fyber.inneractive.sdk.factories.a
    public final boolean a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.t0);
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final com.fyber.inneractive.sdk.interfaces.d a() {
        return new com.fyber.inneractive.sdk.renderers.r();
    }
}
