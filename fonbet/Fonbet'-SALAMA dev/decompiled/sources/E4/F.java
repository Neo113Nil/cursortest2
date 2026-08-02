package E4;

import B4.T;
import B4.W;
import G4.C0272e;
import G4.C0279l;
import G4.C0282o;
import G4.S;
import G4.X;
import android.content.Context;
import w1.C1726n0;
import w1.P2;

/* loaded from: classes2.dex */
public final class F extends z {
    @Override // E4.z
    public final X a(C1726n0 c1726n0) {
        P6.b bVar = this.f2250c;
        p3.f.P(bVar, "persistence not initialized yet", new Object[0]);
        G4.r rVar = (G4.r) ((S) bVar).f2934h.f2918d;
        C0279l d7 = d();
        rVar.getClass();
        L4.f fVar = (L4.f) c1726n0.f17806c;
        C0282o c0282o = new C0282o();
        c0282o.f3013e = rVar;
        c0282o.f3009a = false;
        c0282o.f3010b = fVar;
        c0282o.f3011c = d7;
        return c0282o;
    }

    @Override // E4.z
    public final C0272e b(C1726n0 c1726n0) {
        P6.b bVar = this.f2250c;
        p3.f.P(bVar, "persistence not initialized yet", new Object[0]);
        return new C0272e(bVar, (L4.f) c1726n0.f17806c, d());
    }

    @Override // E4.z
    public final P6.b c(C1726n0 c1726n0) {
        long j;
        P2 p22 = (P2) this.f2249b.f3679c;
        p3.f.P(p22, "remoteSerializer not initialized yet", new Object[0]);
        R4.c cVar = new R4.c(p22, 5);
        B4.K k7 = this.f2248a;
        T t7 = k7.f1109e;
        if (t7 == null) {
            j = k7.f1108d;
        } else if (t7 instanceof W) {
            j = ((W) t7).f1134a;
        } else {
            j = -1;
        }
        y yVar = new y();
        yVar.f2247a = j;
        D3.j jVar = (D3.j) c1726n0.f17807d;
        return new S((Context) c1726n0.f17805b, (String) jVar.f1723b, (H4.f) jVar.f1725d, cVar, yVar);
    }
}
