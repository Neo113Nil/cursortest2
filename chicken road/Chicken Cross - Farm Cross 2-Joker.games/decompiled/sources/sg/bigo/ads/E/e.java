package sg.bigo.ads.E;

import sg.bigo.ads.D.i;
import sg.bigo.ads.P.j;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class e extends i implements sg.bigo.ads.Q.d {
    public final d l0;
    public boolean m0;

    public e(j jVar, d dVar) {
        super(jVar);
        this.m0 = false;
        this.l0 = dVar;
    }

    @Override // sg.bigo.ads.Q.d
    public final void a() {
        d dVar = this.l0;
        if (dVar != null) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
            ((k) interfaceC5087a).c1.set(dVar.b(this));
        }
    }

    @Override // sg.bigo.ads.e.h
    public final void b(sg.bigo.ads.U.j jVar, int i, int i2, sg.bigo.ads.P.f fVar) {
        d dVar = this.l0;
        if (dVar != null) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
            ((k) interfaceC5087a).c1.set(dVar.b(this));
        }
        super.b(jVar, i, i2, fVar);
    }

    @Override // sg.bigo.ads.Q.d
    public final int c() {
        d dVar = this.l0;
        if (dVar != null) {
            return dVar.y0;
        }
        return 3;
    }

    @Override // sg.bigo.ads.Q.d
    public final void d() {
        AdInteractionListener adInteractionListener;
        d dVar = this.l0;
        if (dVar == null || (adInteractionListener = dVar.j) == null) {
            return;
        }
        adInteractionListener.onAdClicked();
    }

    @Override // sg.bigo.ads.e.h
    public final int m() {
        return ((k) ((InterfaceC5087a) this.k.f12482a)).c1.get();
    }

    @Override // sg.bigo.ads.e.h
    public final int n() {
        return ((k) ((InterfaceC5087a) this.k.f12482a)).b1.get();
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void u() {
        d dVar = this.l0;
        if (dVar != null) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
            ((k) interfaceC5087a).b1.set(dVar.c(this));
        }
        super.u();
    }

    @Override // sg.bigo.ads.Q.d
    public final boolean b() {
        return this.m0;
    }
}
