package sg.bigo.ads.I;

import sg.bigo.ads.K0.z;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.h.Y0;
import sg.bigo.ads.l.C5287c;
import sg.bigo.ads.l.C5289e;
import sg.bigo.ads.n.U0;

/* loaded from: classes3.dex */
public final class v implements k {

    /* renamed from: a, reason: collision with root package name */
    public int f12334a = -1;
    public boolean b = false;
    public boolean c = false;
    public final /* synthetic */ VideoController d;
    public final /* synthetic */ w e;

    public v(w wVar, VideoController videoController) {
        this.e = wVar;
        this.d = videoController;
    }

    @Override // sg.bigo.ads.I.k
    public final void a() {
        F1 X = this.e.X();
        if (X instanceof U0) {
            U0 u0 = (U0) X;
            int a2 = u0.C.a(u0.J.e);
            if (a2 < 0 || a2 == u0.C.getCurrentItem()) {
                return;
            }
            ViewFlow viewFlow = u0.C;
            viewFlow.e = a2;
            if (viewFlow.K) {
                viewFlow.requestLayout();
            } else {
                viewFlow.a(a2, -20, true);
            }
        }
    }

    @Override // sg.bigo.ads.I.k
    public final void b() {
        this.c = true;
        w wVar = this.e;
        wVar.w0 = true;
        if (wVar.G0() || this.e.s0()) {
            this.e.C();
        } else {
            Y0 y0 = this.e.J;
            if (y0 == null || !y0.I.a()) {
                w wVar2 = this.e;
                if (!wVar2.v) {
                    Integer a2 = z.a(wVar2.s.a("interstitial_video_style.video_play_page.skip_type"));
                    if ((a2 != null ? a2.intValue() : 0) != 2) {
                        this.e.C();
                    }
                }
                if (this.e.d0() == 3) {
                    this.e.l(this.f12334a);
                }
                this.e.o(6);
            } else if (this.e.d0() == 3) {
                this.e.l(this.f12334a);
            }
        }
        C5289e c5289e = this.e.j0;
        C5287c c5287c = c5289e.f;
        if (c5287c != null) {
            c5287c.a();
        }
        c5289e.g = null;
    }

    @Override // sg.bigo.ads.I.k
    public final void c() {
        VideoController videoController;
        if (this.e.d0() == 3) {
            this.e.l(this.f12334a);
        }
        if (!this.c && this.b && (videoController = this.d) != null && videoController.isPaused()) {
            this.d.play();
        }
        this.e.X().b();
        this.e.j0.b(false);
    }

    @Override // sg.bigo.ads.I.k
    public final void d() {
        w wVar = this.e;
        wVar.w0 = false;
        this.f12334a = wVar.d0();
        this.e.l(3);
        VideoController videoController = this.d;
        if (videoController != null && videoController.isPlaying()) {
            this.d.pause();
            this.b = true;
        }
        x xVar = this.e.s0;
        if (xVar != null) {
            sg.bigo.ads.s1.b.a((InterfaceC5087a) xVar.W.e(), this.e.d0(), 2);
        }
        this.e.X().a();
        this.e.j0.a(false);
    }
}
