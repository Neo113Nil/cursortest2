package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveNativeVideoContentController extends com.fyber.inneractive.sdk.flow.u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f3654a;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer) com.fyber.inneractive.sdk.util.v.a(this.f3654a)) != null) {
            ((com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer) this.f3654a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer renderer = (com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer) com.fyber.inneractive.sdk.util.v.a(this.f3654a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer renderer) {
        this.f3654a = new java.lang.ref.WeakReference(renderer);
    }
}
