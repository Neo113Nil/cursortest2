package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class NativeAdUnitController extends com.fyber.inneractive.sdk.flow.s0 implements com.fyber.inneractive.sdk.flow.nativead.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f3657a = new java.util.HashSet();
    public android.view.ViewGroup b;

    public final void a() {
        android.view.ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            this.b = null;
            com.fyber.inneractive.sdk.util.IAlog.a("%s: unbindView called with %s", logPrefix(), viewGroup);
            com.fyber.inneractive.sdk.util.IAlog.a("%s: spot is %s", logPrefix(), getAdSpot());
            java.util.Iterator it = new java.util.HashSet(this.f3657a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                    if (dVar.b(viewGroup)) {
                        com.fyber.inneractive.sdk.util.IAlog.a("%s: unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                        dVar.s();
                        break;
                    }
                }
            }
        }
        java.util.Iterator it2 = new java.util.HashSet(this.f3657a).iterator();
        while (it2.hasNext()) {
            ((com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it2.next()).destroy();
        }
        this.f3657a.clear();
        this.b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.a
    public void bind(com.fyber.inneractive.sdk.external.MediaView mediaView) {
        com.fyber.inneractive.sdk.renderers.y yVar;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.util.IAlog.a("%s: bindView called with parent: %s", logPrefix(), mediaView);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot = getAdSpot();
        com.fyber.inneractive.sdk.response.e eVar = null;
        if (adSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("NativeAdUnitController was not attached to an ad spot", new java.lang.Object[0]);
        } else {
            java.util.Iterator it = new java.util.HashSet(this.f3657a).iterator();
            while (true) {
                if (it.hasNext()) {
                    com.fyber.inneractive.sdk.external.InneractiveAdRenderer inneractiveAdRenderer = (com.fyber.inneractive.sdk.external.InneractiveAdRenderer) it.next();
                    if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                        com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                        if (dVar.b(mediaView)) {
                            dVar.l();
                            com.fyber.inneractive.sdk.util.IAlog.a("%s: bindView returning an already attached renderer %s", logPrefix(), dVar);
                            break;
                        }
                    }
                } else {
                    this.b = mediaView;
                    java.util.Iterator it2 = com.fyber.inneractive.sdk.factories.j.f3671a.f3672a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            yVar = null;
                            break;
                        }
                        ((com.fyber.inneractive.sdk.nativead.d) it2.next()).getClass();
                        if (adSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.w0) {
                            com.fyber.inneractive.sdk.flow.x adContent = adSpot.getAdContent();
                            yVar = ((adContent instanceof com.fyber.inneractive.sdk.flow.w0) && adContent.isVideoAd()) ? new com.fyber.inneractive.sdk.renderers.e0() : new com.fyber.inneractive.sdk.renderers.c0();
                        }
                    }
                    if (yVar != null) {
                        ((com.fyber.inneractive.sdk.flow.w0) adSpot.getAdContent()).u.b = yVar;
                        yVar.initialize(adSpot);
                        selectContentController();
                        yVar.b(mediaView);
                        this.f3657a.add(yVar);
                        com.fyber.inneractive.sdk.util.IAlog.a("%s: created renderer %s", logPrefix(), yVar);
                    } else {
                        com.fyber.inneractive.sdk.util.IAlog.f("%s: Could not find a renderer for the given spot!", logPrefix());
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.flow.i0 i0Var = this.mAdSpot.get();
        if (i0Var == null || i0Var.getAdContent() == null) {
            rVar = null;
        } else {
            com.fyber.inneractive.sdk.flow.x adContent2 = i0Var.getAdContent();
            eVar = adContent2.b;
            rVar = adContent2.c;
        }
        android.view.View createPrivacyView = createPrivacyView(mediaView.getContext(), eVar, rVar);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        mediaView.addView(createPrivacyView, layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        return false;
    }

    public android.view.View createPrivacyView(android.content.Context context, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.fyber.inneractive.sdk.R.layout.ia_layout_fyber_ad_identifier_relative, (android.view.ViewGroup) null, false);
        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, null, eVar, rVar);
        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner = com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.BOTTOM_LEFT;
        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier iFyberAdIdentifier = gVar.d;
        iFyberAdIdentifier.k = corner;
        iFyberAdIdentifier.a(viewGroup);
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (android.os.Looper.myLooper() == null || android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.external.h(this));
        } else {
            a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.external.NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
