package sg.bigo.ads.b1;

import java.util.Map;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class o extends i {
    public o(Map map, sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.V0.f fVar) {
        super(map, hVar, nVar, fVar);
    }

    @Override // sg.bigo.ads.b1.i, sg.bigo.ads.b1.AbstractC5032e
    public final void a(C5030c c5030c) {
        super.a(c5030c);
        c5030c.a(((u) this.b).c.m, "token");
        c5030c.a(Integer.valueOf(sg.bigo.ads.a0.o.b()), "req_status");
        ((u) this.b).getClass();
        c5030c.a(sg.bigo.ads.F0.a.e(), "uuid");
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final C5447k f() {
        int i;
        boolean z;
        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i = jVar.d;
            z = jVar.a(11);
        } else {
            i = 3;
            z = false;
        }
        return AbstractRunnableC5522h.a("CallbackNet", i, z);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final long h() {
        sg.bigo.ads.Q0.n nVar = this.c;
        if (nVar != null) {
            return nVar.f12510a.o.c;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final InterfaceC5501a i() {
        return this.c.a("/AdExt/UniCallback", (String) null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final boolean j() {
        return sg.bigo.ads.O.g.f12472a.B.a(4) && ((Boolean) sg.bigo.ads.F0.b.a("sp_ads", "sp_ads_encryptcallback_request", Boolean.TRUE, 4)).booleanValue();
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void k() {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_ads_encryptcallback_request", Boolean.FALSE, 4);
    }
}
