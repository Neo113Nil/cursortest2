package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class j0 implements com.fyber.inneractive.sdk.external.InneractiveContentController {
    protected java.lang.ref.WeakReference<com.fyber.inneractive.sdk.external.InneractiveAdSpot> mAdSpot;
    protected com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener mEventsListener;

    public abstract boolean canControl(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void destroy() {
        this.mEventsListener = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot getAdSpot() {
        return (com.fyber.inneractive.sdk.external.InneractiveAdSpot) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
    }

    public com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener getEventsListener() {
        return this.mEventsListener;
    }

    public void setAdSpot(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.mAdSpot = new java.lang.ref.WeakReference<>(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void setEventsListener(com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener eventsListener) {
        this.mEventsListener = eventsListener;
    }
}
