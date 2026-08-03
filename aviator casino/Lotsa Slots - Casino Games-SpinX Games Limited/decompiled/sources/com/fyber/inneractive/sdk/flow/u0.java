package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class u0 extends com.fyber.inneractive.sdk.flow.j0 implements com.fyber.inneractive.sdk.external.VideoContentListener {
    protected boolean isOverlayOutside = true;

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.VideoContentListener) eventsListener).onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.VideoContentListener) eventsListener).onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i, int i2) {
        com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((com.fyber.inneractive.sdk.external.VideoContentListener) eventsListener).onProgress(i, i2);
        }
    }

    public com.fyber.inneractive.sdk.flow.u0 setOverlayOutside(boolean z) {
        this.isOverlayOutside = z;
        return this;
    }
}
