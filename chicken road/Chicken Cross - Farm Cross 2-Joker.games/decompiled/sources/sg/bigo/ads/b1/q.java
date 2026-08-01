package sg.bigo.ads.b1;

import com.ironsource.C4761z5;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.x0.C5506f;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class q extends AbstractC5032e {
    public final p k;

    public q(sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, p pVar) {
        super(hVar, nVar, 15000L);
        this.k = pVar;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(int i, int i2, String str) {
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(Map map, String str) {
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(C5030c c5030c) {
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final C5447k f() {
        int i;
        boolean z;
        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i = jVar.f12521a;
            z = jVar.a(13);
        } else {
            i = 3;
            z = false;
        }
        return AbstractRunnableC5522h.a("ConfigNet", i, z);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final C5506f g() {
        return C5506f.a(C4761z5.M);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final long h() {
        sg.bigo.ads.Q0.n nVar = this.c;
        if (nVar != null) {
            return nVar.f12510a.o.f12525a;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final InterfaceC5501a i() {
        String str = this.i;
        return str != null ? this.c.a("/Ad/GetSDKConfig", str) : this.c.a("/Ad/GetSDKConfig", (String) null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final boolean j() {
        return false;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void k() {
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(String str, int i, int i2, String str2, HashMap hashMap) {
        p pVar = this.k;
        if (pVar != null) {
            pVar.a(str, this.f12697a, i, i2, str2, hashMap);
        }
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(String str, String str2, HashMap hashMap) {
        p pVar = this.k;
        if (pVar != null) {
            pVar.a(str, this.f12697a, str2, hashMap);
        }
    }
}
