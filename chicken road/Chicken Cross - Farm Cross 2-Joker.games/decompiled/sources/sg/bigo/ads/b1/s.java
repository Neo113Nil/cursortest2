package sg.bigo.ads.b1;

import java.util.Map;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class s extends i {
    public s(Map map, sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.V0.l lVar) {
        super(map, hVar, nVar, lVar);
    }

    @Override // sg.bigo.ads.b1.i, sg.bigo.ads.b1.AbstractC5032e
    public final void a(C5030c c5030c) {
        super.a(c5030c);
        c5030c.a(((u) this.b).c.m, "token");
        c5030c.a(Integer.valueOf(sg.bigo.ads.a0.o.b()), "req_status");
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final C5447k f() {
        int i;
        boolean z;
        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i = jVar.b;
            z = jVar.a(13);
        } else {
            i = 2;
            z = false;
        }
        return AbstractRunnableC5522h.a("ReportNet", i, z);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final long h() {
        sg.bigo.ads.Q0.n nVar = this.c;
        if (nVar != null) {
            return nVar.f12510a.o.e;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final InterfaceC5501a i() {
        return this.c.a("/Ad/ReportUniBaina", (String) null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final boolean j() {
        return sg.bigo.ads.O.g.f12472a.B.a(5) && ((Boolean) sg.bigo.ads.F0.b.a("sp_ads", "sp_ads_encryptreport_request", Boolean.TRUE, 4)).booleanValue();
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void k() {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_ads_encryptreport_request", Boolean.FALSE, 4);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final boolean l() {
        return false;
    }
}
