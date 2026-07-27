package sg.bigo.ads.E;

import android.text.TextUtils;
import sg.bigo.ads.D.k;
import sg.bigo.ads.P.j;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.n1.n;

/* loaded from: classes3.dex */
public final class f extends k implements sg.bigo.ads.Q.d {
    public final d v0;
    public boolean w0;
    public boolean x0;

    public f(j jVar, d dVar) {
        super(jVar);
        this.w0 = false;
        this.x0 = true;
        this.v0 = dVar;
    }

    @Override // sg.bigo.ads.C.t
    public final void a(VideoController videoController, boolean z) {
        if (videoController != null) {
            if (c() == 2 && !this.w0) {
                z = true;
            }
            videoController.mute(z);
        }
    }

    @Override // sg.bigo.ads.e.h
    public final void b(sg.bigo.ads.U.j jVar, int i, int i2, sg.bigo.ads.P.f fVar) {
        d dVar = this.v0;
        if (dVar != null) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
            ((sg.bigo.ads.U0.k) interfaceC5087a).c1.set(dVar.b(this));
        }
        super.b(jVar, i, i2, fVar);
    }

    @Override // sg.bigo.ads.Q.d
    public final int c() {
        d dVar = this.v0;
        if (dVar != null) {
            return dVar.y0;
        }
        return 3;
    }

    @Override // sg.bigo.ads.Q.d
    public final void d() {
        AdInteractionListener adInteractionListener;
        d dVar = this.v0;
        if (dVar == null || (adInteractionListener = dVar.j) == null) {
            return;
        }
        adInteractionListener.onAdClicked();
    }

    @Override // sg.bigo.ads.D.k, sg.bigo.ads.C.t, sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        sg.bigo.ads.P.c cVar = this.k.f12482a;
        if (cVar != null) {
            n nVar = n.n;
            String h = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).h();
            if (nVar.g == null || TextUtils.isEmpty(h)) {
                return;
            }
            nVar.g.remove(h);
        }
    }

    @Override // sg.bigo.ads.e.h
    public final int m() {
        return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.k.f12482a)).c1.get();
    }

    @Override // sg.bigo.ads.e.h
    public final int n() {
        return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.k.f12482a)).b1.get();
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void u() {
        d dVar = this.v0;
        if (dVar != null) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
            ((sg.bigo.ads.U0.k) interfaceC5087a).b1.set(dVar.c(this));
        }
        super.u();
    }

    @Override // sg.bigo.ads.Q.d
    public final void a() {
        d dVar = this.v0;
        if (dVar != null) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
            ((sg.bigo.ads.U0.k) interfaceC5087a).c1.set(dVar.b(this));
        }
    }

    @Override // sg.bigo.ads.C.t
    public final boolean c(int i) {
        return this.x0;
    }

    @Override // sg.bigo.ads.Q.d
    public final boolean b() {
        return this.w0;
    }
}
