package sg.bigo.ads.b1;

import com.tiktok.util.UrlConst;
import java.util.Map;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class r extends i {
    public r(Map map, sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.P0.b bVar) {
        super(map, hVar, nVar, bVar);
    }

    @Override // sg.bigo.ads.b1.i, sg.bigo.ads.b1.AbstractC5032e
    public final void a(C5030c c5030c) {
        super.a(c5030c);
        c5030c.a(((u) this.b).c.m, "token");
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
    public final InterfaceC5501a i() {
        String str = this.i;
        return str != null ? new sg.bigo.ads.B0.d(UrlConst.HTTPS + str + "/Ad/ReportUniBaina") : new sg.bigo.ads.B0.d("https://rep.maxesads.com/Ad/ReportUniBaina");
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final boolean j() {
        return false;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void k() {
    }
}
