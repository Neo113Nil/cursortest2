package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveAdViewUnitController extends com.fyber.inneractive.sdk.flow.s0 implements com.fyber.inneractive.sdk.flow.g0, com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f3651a;
    public boolean b;
    public android.view.ViewGroup c;
    public final int d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public InneractiveAdViewUnitController() {
        this.b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.d = 0;
        this.f3651a = new java.util.HashSet();
    }

    public final void a() {
        this.b = true;
        java.util.Iterator it = new java.util.HashSet(this.f3651a).iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next()).destroy();
        }
        this.f3651a.clear();
        this.c = null;
        super.destroy();
    }

    public void bindView(android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.d dVar;
        com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        java.util.Iterator it = new java.util.HashSet(this.f3651a).iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar2 = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar2.b(viewGroup)) {
                    dVar2.l();
                    com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), dVar2);
                    return;
                }
            }
        }
        this.c = viewGroup;
        java.util.Iterator it2 = com.fyber.inneractive.sdk.factories.b.f3665a.f3666a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                dVar = null;
                break;
            }
            com.fyber.inneractive.sdk.factories.a aVar = (com.fyber.inneractive.sdk.factories.a) it2.next();
            if (aVar.a(adSpot)) {
                dVar = aVar.a();
                break;
            }
        }
        int i = this.d;
        if (i != 0) {
            dVar.a(i);
        }
        if (dVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
            return;
        }
        dVar.initialize(adSpot);
        selectContentController();
        dVar.a(viewGroup);
        this.f3651a.add(dVar);
        com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), dVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        java.util.Iterator it = this.f3651a.iterator();
        while (it.hasNext()) {
            if (!((com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (android.os.Looper.myLooper() == null || android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.external.f(this));
        } else {
            a();
        }
    }

    public int getAdContentHeight() {
        int n;
        java.util.Iterator it = this.f3651a.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (n = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).n()) > 0) {
                return n;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int d;
        java.util.Iterator it = this.f3651a.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (d = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).d()) > 0) {
                return d;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        com.fyber.inneractive.sdk.interfaces.f fVar;
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = (com.fyber.inneractive.sdk.external.InneractiveAdSpot) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
        java.util.Iterator it = com.fyber.inneractive.sdk.factories.h.f3669a.f3670a.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = null;
                break;
            }
            com.fyber.inneractive.sdk.factories.g gVar = (com.fyber.inneractive.sdk.factories.g) it.next();
            if (gVar.a(inneractiveAdSpot)) {
                fVar = gVar.b(inneractiveAdSpot);
                break;
            }
        }
        this.f3651a.add(fVar);
        return fVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public com.fyber.inneractive.sdk.external.InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshFailed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
        java.util.Iterator it = new java.util.HashSet(this.f3651a).iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).p();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.d dVar;
        java.util.Iterator it = new java.util.HashSet(this.f3651a).iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (dVar != null) {
            dVar.a((android.view.ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof com.fyber.inneractive.sdk.flow.h0) {
                int i = com.fyber.inneractive.sdk.util.IAlog.f4283a;
                com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "AD_REFRESH", ((com.fyber.inneractive.sdk.flow.h0) inneractiveAdSpot).h.d.b());
            }
        } catch (java.lang.Exception unused) {
        }
        com.fyber.inneractive.sdk.util.IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new java.lang.Object[0]);
    }

    public void refreshAd() {
        com.fyber.inneractive.sdk.util.IAlog.a("InneractiveFullscreenUnitController refreshAd called", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = (com.fyber.inneractive.sdk.external.InneractiveAdSpot) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof com.fyber.inneractive.sdk.flow.r0)) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.r0) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) inneractiveAdSpot.getAdContent().d;
        if (r0Var.e != null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.c;
        if (l0Var != null) {
            if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER.equals(l0Var.b) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT.equals(l0Var.b)) {
                return true;
            }
            if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.equals(l0Var.b)) {
                return inneractiveAdSpot.getCurrentProcessedRequest() != null && inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f;
        return t0Var != null && (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.LANDSCAPE.equals(t0Var.j) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.SQUARE.equals(t0Var.j) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT.equals(t0Var.j));
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.f fVar) {
        java.lang.ref.WeakReference<com.fyber.inneractive.sdk.flow.i0> weakReference;
        com.fyber.inneractive.sdk.util.IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), fVar);
        java.util.HashSet hashSet = this.f3651a;
        if (hashSet != null) {
            hashSet.remove(fVar);
        }
        if (this.b) {
            return;
        }
        java.util.Iterator it = new java.util.HashSet(this.f3651a).iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).q();
                if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                    ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                }
            }
        }
    }

    public void unbindView(android.view.View view) {
        if (this.c != view) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.c, view);
        } else {
            this.c = null;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        java.util.Iterator it = new java.util.HashSet(this.f3651a).iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(view)) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    dVar.s();
                    this.f3651a.remove(dVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", java.lang.Integer.valueOf(i));
            this.d = i;
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", java.lang.Integer.valueOf(i), 30);
            this.d = 30;
        }
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.d = -1;
        }
    }
}
