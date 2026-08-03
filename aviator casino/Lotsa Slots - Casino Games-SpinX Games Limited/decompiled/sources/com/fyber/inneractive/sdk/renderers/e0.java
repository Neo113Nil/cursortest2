package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class e0 extends com.fyber.inneractive.sdk.renderers.r implements com.fyber.inneractive.sdk.renderers.y {
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a w;
    public java.lang.ref.WeakReference x;

    static {
        com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.renderers.e0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean C() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean D() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final void I() {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.player.n nVar;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || (xVar = this.b) == null || ((com.fyber.inneractive.sdk.flow.t0) xVar).j) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sTracking impression", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((com.fyber.inneractive.sdk.flow.w0) this.f3675a.getAdContent());
        this.w = aVar;
        aVar.a(this);
        com.fyber.inneractive.sdk.renderers.f0 f0Var = this.q;
        if (f0Var != null && (nVar = f0Var.c) != null) {
            if (nVar.w.compareAndSet(false, true)) {
                nVar.a(nVar.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("%sreportPlayStartEvents called, but start events was already reported", com.fyber.inneractive.sdk.util.IAlog.a(nVar));
            }
        }
        super.I();
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final com.fyber.inneractive.sdk.renderers.f0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar != null) {
            return new com.fyber.inneractive.sdk.renderers.z(tVar);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.y
    public final void b(android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        a(viewGroup);
        android.widget.ImageView c = c(viewGroup);
        if (c == null || (mVar = this.m) == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.ui.e) mVar).setWatermarkView(c);
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
            this.w = null;
        }
        java.lang.ref.WeakReference weakReference = this.x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            tVar.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        com.fyber.inneractive.sdk.util.l0.f4298a.a(this.p);
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        if (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.w0) {
            this.b = ((com.fyber.inneractive.sdk.flow.w0) inneractiveAdSpot.getAdContent()).s;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        com.fyber.inneractive.sdk.util.l0.f4298a.b(c((android.view.View) this.p).getApplicationContext());
        java.lang.ref.WeakReference weakReference = this.x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.player.ui.d(tVar, z), 500L);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.flow.b0
    public final android.view.View x() {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        com.fyber.inneractive.sdk.external.MediaView mediaView = (inneractiveAdSpot == null || !(inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.w0)) ? null : ((com.fyber.inneractive.sdk.flow.w0) this.f3675a.getAdContent()).n;
        return mediaView != null ? mediaView : this.p;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof com.fyber.inneractive.sdk.external.NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final boolean a(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof com.fyber.inneractive.sdk.external.NativeAdUnitController;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final com.fyber.inneractive.sdk.external.VideoContentListener a(com.fyber.inneractive.sdk.external.InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof com.fyber.inneractive.sdk.external.NativeAdVideoContentController)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s: Content controller expected to be NativeAdVideoContentController but it: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), inneractiveContentController);
            return null;
        }
        return (com.fyber.inneractive.sdk.external.VideoContentListener) ((com.fyber.inneractive.sdk.external.NativeAdVideoContentController) inneractiveContentController).getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
            this.w = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.interfaces.d
    public final void a(android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.t tVar;
        com.fyber.inneractive.sdk.player.n nVar;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        if (inneractiveAdSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sYou must set the spot to render before calling renderAd", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        this.p = viewGroup;
        if (inneractiveAdSpot != null) {
            com.fyber.inneractive.sdk.external.InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            if (!a(selectedUnitController)) {
                com.fyber.inneractive.sdk.util.IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", com.fyber.inneractive.sdk.util.IAlog.a(this));
            } else {
                this.n = a(selectedUnitController.getSelectedContentController());
            }
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        java.lang.Float f = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar != null ? ((com.fyber.inneractive.sdk.flow.t0) xVar).i : null;
        android.content.Context context = viewGroup.getContext();
        com.fyber.inneractive.sdk.renderers.f0 a2 = a(tVar2);
        this.q = a2;
        if (a2 == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s : can't render - video renderer is missing", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.ui.m a3 = a2.a(context, ((com.fyber.inneractive.sdk.flow.t0) this.b).c);
        this.m = a3;
        if (a3 instanceof com.fyber.inneractive.sdk.player.ui.t) {
            tVar = (com.fyber.inneractive.sdk.player.ui.t) a3;
            tVar.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        } else {
            tVar = null;
        }
        this.x = new java.lang.ref.WeakReference(tVar);
        this.k = (com.fyber.inneractive.sdk.player.controller.s) this.q.a(this.f3675a, (com.fyber.inneractive.sdk.flow.t0) this.b);
        viewGroup.addView((android.view.View) this.m, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.k;
        com.fyber.inneractive.sdk.renderers.q qVar = this.v;
        sVar.getClass();
        sVar.g = qVar;
        com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.k;
        this.q.b();
        sVar2.b(false);
        this.q.a(this.o);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot2 = this.f3675a;
        if (inneractiveAdSpot2 != null && (inneractiveAdSpot2.getAdContent() instanceof com.fyber.inneractive.sdk.flow.w0)) {
            com.fyber.inneractive.sdk.flow.w0 w0Var = (com.fyber.inneractive.sdk.flow.w0) this.f3675a.getAdContent();
            com.fyber.inneractive.sdk.renderers.f0 f0Var = this.q;
            com.fyber.inneractive.sdk.player.controller.q qVar2 = (f0Var == null || (nVar = f0Var.c) == null) ? null : nVar.f4138a;
            if (qVar2 != null && qVar2.e() > 0 && qVar2.f() > 0) {
                f = java.lang.Float.valueOf(qVar2.f() / qVar2.e());
            }
            w0Var.p = f;
        }
        com.fyber.inneractive.sdk.util.n0 n0Var = com.fyber.inneractive.sdk.util.l0.f4298a;
        android.view.ViewGroup viewGroup2 = this.p;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(java.lang.String str, boolean z, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && (xVar = this.b) != null && !((com.fyber.inneractive.sdk.flow.t0) xVar).j) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
            if (bVar instanceof com.fyber.inneractive.sdk.player.controller.c0) {
                ((com.fyber.inneractive.sdk.player.controller.c0) bVar).F.set(true);
            }
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.renderers.d0(this));
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.flow.y(this, c((android.view.View) this.p), str, new com.fyber.inneractive.sdk.util.g1(), gVar, z, oVar));
    }
}
