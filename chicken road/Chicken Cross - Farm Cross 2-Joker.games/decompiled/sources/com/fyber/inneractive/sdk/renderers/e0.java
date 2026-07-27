package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n0;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class e0 extends r implements y {
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a w;
    public WeakReference x;

    static {
        IAlog.a(e0.class);
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
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || (xVar = this.b) == null || ((t0) xVar).j) {
            return;
        }
        IAlog.a("%sTracking impression", IAlog.a(this));
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) this.f5328a.getAdContent());
        this.w = aVar;
        aVar.a(this);
        f0 f0Var = this.q;
        if (f0Var != null && (nVar = f0Var.c) != null) {
            if (nVar.x.compareAndSet(false, true)) {
                nVar.a(nVar.q, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(nVar));
            }
        }
        super.I();
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final f0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar != null) {
            return new z(tVar);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.y
    public final void b(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        a(viewGroup);
        ImageView c = c(viewGroup);
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
        WeakReference weakReference = this.x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            tVar.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        l0.f5956a.a(this.p);
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        if (inneractiveAdSpot.getAdContent() instanceof w0) {
            this.b = ((w0) inneractiveAdSpot.getAdContent()).s;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        l0.f5956a.b(c((View) this.p).getApplicationContext());
        WeakReference weakReference = this.x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            com.fyber.inneractive.sdk.util.r.b.postDelayed(new com.fyber.inneractive.sdk.player.ui.d(tVar, z), 500L);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.flow.b0
    public final View x() {
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        MediaView mediaView = (inneractiveAdSpot == null || !(inneractiveAdSpot.getAdContent() instanceof w0)) ? null : ((w0) this.f5328a.getAdContent()).n;
        return mediaView != null ? mediaView : this.p;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof NativeAdUnitController;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof NativeAdVideoContentController)) {
            IAlog.f("%s: Content controller expected to be NativeAdVideoContentController but it: %s", IAlog.a(this), inneractiveContentController);
            return null;
        }
        return (VideoContentListener) ((NativeAdVideoContentController) inneractiveContentController).getEventsListener();
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
    public final void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.t tVar;
        com.fyber.inneractive.sdk.player.n nVar;
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.p = viewGroup;
        if (inneractiveAdSpot != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            if (!a(selectedUnitController)) {
                IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
            } else {
                this.n = a(selectedUnitController.getSelectedContentController());
            }
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        Float f = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar != null ? ((t0) xVar).i : null;
        Context context = viewGroup.getContext();
        f0 a2 = a(tVar2);
        this.q = a2;
        if (a2 != null) {
            com.fyber.inneractive.sdk.player.ui.m a3 = a2.a(context, ((t0) this.b).c);
            this.m = a3;
            if (a3 instanceof com.fyber.inneractive.sdk.player.ui.t) {
                tVar = (com.fyber.inneractive.sdk.player.ui.t) a3;
                tVar.getViewTreeObserver().addOnWindowFocusChangeListener(this);
            } else {
                tVar = null;
            }
            this.x = new WeakReference(tVar);
            this.k = (com.fyber.inneractive.sdk.player.controller.s) this.q.a(this.f5328a, (t0) this.b);
            viewGroup.addView((View) this.m, new ViewGroup.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.k;
            q qVar = this.v;
            sVar.getClass();
            sVar.g = qVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.k;
            this.q.b();
            sVar2.b(false);
            this.q.a(this.o);
            InneractiveAdSpot inneractiveAdSpot2 = this.f5328a;
            if (inneractiveAdSpot2 != null && (inneractiveAdSpot2.getAdContent() instanceof w0)) {
                w0 w0Var = (w0) this.f5328a.getAdContent();
                f0 f0Var = this.q;
                com.fyber.inneractive.sdk.player.controller.q qVar2 = (f0Var == null || (nVar = f0Var.c) == null) ? null : nVar.f5792a;
                if (qVar2 != null && qVar2.e() > 0 && qVar2.f() > 0) {
                    f = Float.valueOf(qVar2.f() / qVar2.e());
                }
                w0Var.p = f;
            }
            n0 n0Var = l0.f5956a;
            ViewGroup viewGroup2 = this.p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
            return;
        }
        IAlog.f("%s : can't render - video renderer is missing", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        com.fyber.inneractive.sdk.flow.x xVar;
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && (xVar = this.b) != null && !((t0) xVar).j) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
            if (bVar instanceof com.fyber.inneractive.sdk.player.controller.c0) {
                ((com.fyber.inneractive.sdk.player.controller.c0) bVar).F.set(true);
            }
            com.fyber.inneractive.sdk.util.r.b.post(new d0(this));
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.flow.y(this, c((View) this.p), str, new g1(), gVar, z, oVar));
    }
}
