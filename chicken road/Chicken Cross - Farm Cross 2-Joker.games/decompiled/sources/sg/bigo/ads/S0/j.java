package sg.bigo.ads.S0;

import android.text.TextUtils;
import android.util.Pair;
import sg.bigo.ads.Q0.n;
import sg.bigo.ads.b1.q;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class j extends f {
    public Pair j;
    public final i k;

    public j(n nVar, sg.bigo.ads.U.h hVar, sg.bigo.ads.T0.g gVar, sg.bigo.ads.T0.n nVar2) {
        super(nVar, hVar, gVar, nVar2);
        this.j = null;
        this.k = new i(this);
    }

    @Override // sg.bigo.ads.S0.f
    public final sg.bigo.ads.R0.h a() {
        return this.f12538a.f12510a.j;
    }

    @Override // sg.bigo.ads.S0.f
    public final C5447k b() {
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

    @Override // sg.bigo.ads.S0.f
    public final void a(Pair pair) {
        this.g.set(true);
        this.j = pair;
        n nVar = this.f12538a;
        String str = (String) pair.first;
        i iVar = this.k;
        nVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        q qVar = new q(nVar.b, nVar, new sg.bigo.ads.Q0.f(nVar, nVar.f12510a.j, iVar));
        qVar.i = str;
        qVar.b();
    }
}
