package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveAdViewVideoContentController extends com.fyber.inneractive.sdk.flow.u0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.t0;
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(com.fyber.inneractive.sdk.renderers.x xVar) {
        new java.lang.ref.WeakReference(xVar);
    }
}
