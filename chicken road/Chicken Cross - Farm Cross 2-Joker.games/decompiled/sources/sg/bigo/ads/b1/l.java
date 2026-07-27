package sg.bigo.ads.b1;

import com.chartboost.sdk.privacy.model.COPPA;
import java.util.Map;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class l extends AbstractC5032e {
    public final sg.bigo.ads.P0.b k;
    public final sg.bigo.ads.T0.n l;

    public l(sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.T0.n nVar2, long j, sg.bigo.ads.P0.b bVar) {
        super(hVar, nVar, j);
        this.k = bVar;
        this.l = nVar2;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(C5030c c5030c) {
        c5030c.a(Integer.valueOf(sg.bigo.ads.a0.o.b()), "req_status");
        sg.bigo.ads.U.b d = ((u) this.b).d();
        c5030c.a(d != null ? String.valueOf(d.c) : "", "bat_stat");
        c5030c.a(d != null ? String.valueOf(d.f12560a) : "", "bat_num");
        c5030c.a(d != null ? String.valueOf(d.b) : "", "bat_scale");
        c5030c.a(Integer.valueOf(sg.bigo.ads.F0.a.b()), COPPA.COPPA_STANDARD);
        c5030c.a(((u) this.b).c.W, "global_md5");
        c5030c.a(this.l.f, "slots_md5");
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final C5447k f() {
        return AbstractRunnableC5522h.a();
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final long h() {
        sg.bigo.ads.Q0.n nVar = this.c;
        if (nVar != null) {
            return nVar.f12510a.o.d;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final InterfaceC5501a i() {
        String str = this.i;
        return str != null ? this.c.a("/Ad/GetUniConfig", str) : this.c.a("/Ad/GetUniConfig", (String) null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final boolean j() {
        return sg.bigo.ads.O.g.f12472a.B.a(6) && ((Boolean) sg.bigo.ads.F0.b.a("sp_ads", "sp_ads_encryptsdkconfig_request", Boolean.TRUE, 4)).booleanValue();
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void k() {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_ads_encryptsdkconfig_request", Boolean.FALSE, 4);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(int i, int i2, String str) {
        this.k.a(this.f12697a, i, i2, str, null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(Map map, String str) {
        sg.bigo.ads.P0.b bVar = this.k;
        bVar.getClass();
        bVar.a(this.f12697a, (String) A.b(new String[]{str}));
    }
}
