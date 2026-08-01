package sg.bigo.ads.M;

import android.view.ViewGroup;
import sg.bigo.ads.ad.splash.AdSplashActivity;
import sg.bigo.ads.api.VideoController;

/* renamed from: sg.bigo.ads.M.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4993j implements VideoController.VideoLifeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5002t f12447a;

    public C4993j(C5002t c5002t) {
        this.f12447a = c5002t;
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onMuteChange(boolean z) {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoEnd() {
        boolean z;
        ViewGroup viewGroup;
        if (!this.f12447a.j.y()) {
            sg.bigo.ads.L.N n = this.f12447a.j;
            sg.bigo.ads.T0.q qVar = n.Y;
            if (qVar != null) {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.is_auto_close"));
                if (1 == (a2 != null ? a2.intValue() : 0) && !n.C()) {
                    z = true;
                    if (z && (viewGroup = n.a0) != null && (viewGroup.getContext() instanceof AdSplashActivity)) {
                        n.c(9);
                    }
                }
            }
            z = false;
            if (z) {
                n.c(9);
            }
        }
        sg.bigo.ads.L.N n2 = this.f12447a.j;
        sg.bigo.ads.T0.q qVar2 = n2.Y;
        if (qVar2 != null) {
            Integer a3 = sg.bigo.ads.K0.z.a(qVar2.a("endpage.endpage_timing"));
            if ((a3 != null ? a3.intValue() : 0) == 2) {
                n2.a(8, 1);
            }
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPause() {
        this.f12447a.j.D();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPlay() {
        this.f12447a.j.E();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoStart() {
        if (this.f12447a.i.compareAndSet(true, false)) {
            this.f12447a.h();
            sg.bigo.ads.K0.E e = this.f12447a.f12454a;
            if (e != null) {
                e.a();
                this.f12447a.f12454a = null;
            }
            this.f12447a.j.G();
            sg.bigo.ads.K0.E e2 = this.f12447a.g;
            if (e2 != null) {
                e2.a();
                this.f12447a.g = null;
            }
        }
    }
}
