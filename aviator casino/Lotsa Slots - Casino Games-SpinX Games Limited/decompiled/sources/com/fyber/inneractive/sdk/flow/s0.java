package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class s0 implements com.fyber.inneractive.sdk.external.InneractiveUnitController {
    protected java.lang.ref.WeakReference<com.fyber.inneractive.sdk.flow.i0> mAdSpot;
    protected java.util.Set<com.fyber.inneractive.sdk.external.InneractiveContentController> mContentControllers = new java.util.HashSet();
    protected com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener mEventsListener;
    protected com.fyber.inneractive.sdk.external.InneractiveContentController mSelectedContentController;

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void addContentController(com.fyber.inneractive.sdk.external.InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        java.util.Iterator<com.fyber.inneractive.sdk.external.InneractiveContentController> it = this.mContentControllers.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot getAdSpot() {
        return (com.fyber.inneractive.sdk.flow.i0) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener getEventsListener() {
        return this.mEventsListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public com.fyber.inneractive.sdk.external.InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public java.lang.String logPrefix() {
        return com.fyber.inneractive.sdk.util.IAlog.a(this);
    }

    public void selectContentController() {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = (com.fyber.inneractive.sdk.external.InneractiveAdSpot) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("selectContentController called, but ad spot is null", new java.lang.Object[0]);
            return;
        }
        for (com.fyber.inneractive.sdk.external.InneractiveContentController inneractiveContentController : this.mContentControllers) {
            com.fyber.inneractive.sdk.flow.j0 j0Var = (com.fyber.inneractive.sdk.flow.j0) inneractiveContentController;
            if (j0Var.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = inneractiveContentController;
                j0Var.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void setAdSpot(com.fyber.inneractive.sdk.flow.i0 i0Var) {
        this.mAdSpot = new java.lang.ref.WeakReference<>(i0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void setEventsListener(com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener) {
        this.mEventsListener = eventsListener;
    }

    public abstract boolean supports(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();
}
