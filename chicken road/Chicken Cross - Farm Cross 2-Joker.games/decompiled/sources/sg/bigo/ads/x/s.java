package sg.bigo.ads.x;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.C.t;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public final class s extends q {
    public r E;
    public boolean F;
    public boolean G;

    public s(Activity activity, InterfaceC5495a interfaceC5495a, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.C.l lVar, int i, View view, boolean z) {
        super(activity, interfaceC5495a, roundedFrameLayout, lVar, i, view, z);
        this.G = true;
        ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).e1 = false;
    }

    @Override // sg.bigo.ads.x.q, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        super.R();
        VideoController videoController = this.r.getVideoController();
        boolean z = videoController != null && videoController.isPlaying();
        this.G = z;
        if (z) {
            videoController.pause();
        }
    }

    @Override // sg.bigo.ads.x.q, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        VideoController videoController = this.r.getVideoController();
        if (videoController != null && videoController.isPaused() && this.G) {
            videoController.play();
            this.G = false;
        }
    }

    @Override // sg.bigo.ads.x.q
    public final void Y() {
        super.Y();
        sg.bigo.ads.C.l lVar = this.r;
        if (lVar instanceof t) {
            if (this.E == null) {
                this.E = new r(this);
            }
            VideoController videoController = lVar.getVideoController();
            if (videoController != null) {
                videoController.setNeedPauseWhenVisiblePercentEqual(false);
                videoController.setVideoLifeCallback(this.E);
            }
        }
    }

    @Override // sg.bigo.ads.x.q, sg.bigo.ads.h.AbstractC5151c0
    public final void f(int i) {
        super.f(i);
    }

    @Override // sg.bigo.ads.x.q, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        super.w();
        this.E = null;
    }
}
