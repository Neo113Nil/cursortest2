package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public class r extends com.fyber.inneractive.sdk.renderers.e implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer, com.fyber.inneractive.sdk.util.m0 {
    public android.widget.FrameLayout l;
    public com.fyber.inneractive.sdk.player.ui.m m;
    public com.fyber.inneractive.sdk.external.VideoContentListener n;
    public android.view.ViewGroup p;
    public com.fyber.inneractive.sdk.renderers.f0 q;
    public com.fyber.inneractive.sdk.renderers.p t;
    public final com.fyber.inneractive.sdk.renderers.o o = new com.fyber.inneractive.sdk.renderers.o(this);
    public float r = 0.0f;
    public final android.graphics.Rect s = new android.graphics.Rect();
    public boolean u = false;
    public final com.fyber.inneractive.sdk.renderers.q v = new com.fyber.inneractive.sdk.renderers.q(this);

    public void I() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            com.fyber.inneractive.sdk.flow.t0 t0Var = (com.fyber.inneractive.sdk.flow.t0) xVar;
            if (t0Var.j) {
                return;
            }
            t0Var.j = true;
            E();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(android.view.View view) {
        return view != null && view.equals(this.p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int d() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.n = null;
        s();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void l() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int n() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void p() {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            sVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sfullscreenExited called", com.fyber.inneractive.sdk.util.IAlog.a(sVar));
            sVar.E = false;
            sVar.j(sVar.D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.f3899a;
            if (fVar == null || (qVar = fVar.f4138a) == null) {
                return;
            }
            sVar.a(qVar.e);
            sVar.a(sVar.f3899a.f4138a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void s() {
        android.view.ViewGroup viewGroup;
        com.fyber.inneractive.sdk.renderers.p pVar = this.t;
        if (pVar != null && (viewGroup = this.p) != null) {
            viewGroup.removeCallbacks(pVar);
            this.t = null;
        }
        com.fyber.inneractive.sdk.util.l0.f4298a.a(this.p);
        com.fyber.inneractive.sdk.util.IAlog.a("%sunbind called. root is %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.p);
        if (this.k != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sdestroying video ui controller", com.fyber.inneractive.sdk.util.IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.k;
            sVar.getClass();
            sVar.g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.k).destroy();
            this.k = null;
        }
        if (this.m != null) {
            android.view.ViewGroup viewGroup2 = this.p;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(null);
                this.p.removeView(this.l);
            }
            this.m.destroy();
            this.m = null;
        }
        this.l = null;
        this.q = null;
        this.p = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final android.content.Context w() {
        return c((android.view.View) this.p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public android.view.View x() {
        return this.l;
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof com.fyber.inneractive.sdk.flow.t0;
    }

    public void a(android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.flow.x xVar;
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
        this.u = false;
        this.l = new android.widget.FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        com.fyber.inneractive.sdk.player.t tVar = xVar2 != null ? ((com.fyber.inneractive.sdk.flow.t0) xVar2).i : null;
        android.content.Context context = viewGroup.getContext();
        com.fyber.inneractive.sdk.renderers.f0 a2 = a(tVar);
        this.q = a2;
        if (a2 == null || (xVar = this.b) == null) {
            return;
        }
        this.m = a2.a(context, ((com.fyber.inneractive.sdk.flow.t0) xVar).c);
        this.k = (com.fyber.inneractive.sdk.player.controller.s) this.q.a(this.f3675a, (com.fyber.inneractive.sdk.flow.t0) this.b);
        android.view.ViewGroup viewGroup2 = this.p;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.l, new android.view.ViewGroup.LayoutParams(-1, -2));
            this.p.setLayoutTransition(null);
        }
        this.l.addView((android.view.View) this.m, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.k;
        com.fyber.inneractive.sdk.renderers.q qVar = this.v;
        sVar.getClass();
        sVar.g = qVar;
        com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.k;
        this.q.b();
        sVar2.b(false);
        this.q.a(this.o);
        android.view.ViewGroup viewGroup3 = this.p;
        if (viewGroup3 != null) {
            com.fyber.inneractive.sdk.util.n0 n0Var = com.fyber.inneractive.sdk.util.l0.f4298a;
            n0Var.getClass();
            n0Var.a(viewGroup3.getContext(), viewGroup3, this);
        }
    }

    public boolean a(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
    }

    public com.fyber.inneractive.sdk.external.VideoContentListener a(com.fyber.inneractive.sdk.external.InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController) {
            return (com.fyber.inneractive.sdk.external.VideoContentListener) ((com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
        }
        com.fyber.inneractive.sdk.util.IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", com.fyber.inneractive.sdk.util.IAlog.a(this), inneractiveContentController != null ? inneractiveContentController.getClass().getSimpleName() : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        return null;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f, android.graphics.Rect rect) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        if (this.r == f && this.s.equals(rect)) {
            return;
        }
        this.r = f;
        this.s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.m).f();
            ((com.fyber.inneractive.sdk.player.controller.s) this.k).a(f);
        }
        if (f > 0.0f) {
            com.fyber.inneractive.sdk.renderers.p pVar = this.t;
            if (pVar != null && (viewGroup2 = this.p) != null) {
                viewGroup2.removeCallbacks(pVar);
                this.t = null;
            }
            com.fyber.inneractive.sdk.renderers.p pVar2 = new com.fyber.inneractive.sdk.renderers.p(this);
            this.t = pVar2;
            android.view.ViewGroup viewGroup3 = this.p;
            if (viewGroup3 != null) {
                viewGroup3.postDelayed(pVar2, 100L);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.renderers.p pVar3 = this.t;
        if (pVar3 == null || (viewGroup = this.p) == null) {
            return;
        }
        viewGroup.removeCallbacks(pVar3);
        this.t = null;
    }

    public com.fyber.inneractive.sdk.renderers.f0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.renderers.a(tVar);
    }
}
