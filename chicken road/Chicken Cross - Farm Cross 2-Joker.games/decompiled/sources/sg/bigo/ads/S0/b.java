package sg.bigo.ads.S0;

import android.util.Pair;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.Q0.n;
import sg.bigo.ads.X0.t;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.X0.z;
import sg.bigo.ads.b1.l;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class b extends f {
    public z j;

    public b(n nVar, sg.bigo.ads.U.h hVar, sg.bigo.ads.T0.g gVar, sg.bigo.ads.T0.n nVar2) {
        super(nVar, hVar, gVar, nVar2);
    }

    @Override // sg.bigo.ads.S0.f
    public final sg.bigo.ads.R0.h a() {
        return this.f12538a.f12510a.l;
    }

    @Override // sg.bigo.ads.S0.f
    public final C5447k b() {
        return AbstractRunnableC5522h.a();
    }

    @Override // sg.bigo.ads.S0.f
    public final void a(Pair pair) {
        sg.bigo.ads.U.h hVar = this.b;
        if (hVar == null || this.c == null || this.d == null) {
            return;
        }
        String appKey = ((u) hVar).f12615a.getAppKey();
        if (I.a((CharSequence) appKey) || !t.a(t.c.f12614a, appKey)) {
            return;
        }
        this.g.set(true);
        sg.bigo.ads.U.h hVar2 = this.b;
        n nVar = this.f12538a;
        sg.bigo.ads.T0.n nVar2 = this.d;
        this.c.getClass();
        l lVar = new l(hVar2, nVar, nVar2, 1000 * 30, new a(this, pair));
        lVar.i = (String) pair.first;
        lVar.b();
    }
}
