package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class c0 extends com.fyber.inneractive.sdk.renderers.e implements com.fyber.inneractive.sdk.renderers.y, com.fyber.inneractive.sdk.util.m0 {
    public android.view.ViewGroup l;
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a n;
    public android.widget.ImageView o;
    public boolean m = false;
    public final com.fyber.inneractive.sdk.renderers.a0 p = new com.fyber.inneractive.sdk.renderers.a0(this);

    static {
        com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.renderers.c0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean C() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f, android.graphics.Rect rect) {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).a(f);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.y
    public final void b(android.view.ViewGroup viewGroup) {
        if (this.f3675a == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sYou must set the spot to render before calling renderAd", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        this.l = viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.widget.ImageView imageView = new android.widget.ImageView(this.l.getContext());
        this.o = imageView;
        imageView.setImageURI(((com.fyber.inneractive.sdk.flow.w0) this.b).m);
        this.o.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.l.setLayoutParams(layoutParams);
        this.l.addView(this.o, layoutParams);
        com.fyber.inneractive.sdk.ui.controller.a aVar = new com.fyber.inneractive.sdk.ui.controller.a();
        this.k = aVar;
        aVar.f4276a = this.p;
        com.fyber.inneractive.sdk.util.n0 n0Var = com.fyber.inneractive.sdk.util.l0.f4298a;
        android.view.ViewGroup viewGroup2 = this.l;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
        c(this.l);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.n;
        if (aVar != null) {
            aVar.a();
            this.n = null;
        }
        android.widget.ImageView imageView = this.o;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.o = null;
        }
        com.fyber.inneractive.sdk.util.l0.f4298a.a(this.l);
        com.fyber.inneractive.sdk.util.v.a(this.l);
        this.l = null;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f4276a = null;
        }
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        com.fyber.inneractive.sdk.util.l0.f4298a.b(com.fyber.inneractive.sdk.util.o.a(x()).getApplicationContext());
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final android.view.View x() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            com.fyber.inneractive.sdk.flow.w0 w0Var = (com.fyber.inneractive.sdk.flow.w0) xVar;
            if (w0Var.n != null) {
                return w0Var.n;
            }
        }
        return this.l;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(java.lang.String str, boolean z, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        if (!this.m) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.renderers.b0(this));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
            if (bVar instanceof com.fyber.inneractive.sdk.ui.controller.a) {
                ((com.fyber.inneractive.sdk.ui.controller.a) bVar).b.set(true);
            }
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.flow.y(this, com.fyber.inneractive.sdk.util.o.a(x()), str, new com.fyber.inneractive.sdk.util.g1(), gVar, z, oVar));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.n;
        if (aVar != null) {
            aVar.a();
        }
    }
}
