package H1;

import G1.C0140k;
import G1.H;
import G1.N;
import G1.O;
import java.util.Iterator;
import java.util.List;
import s4.M;

@N("dialog")
/* loaded from: classes.dex */
public final class o extends O {
    @Override // G1.O
    public final G1.y a() {
        X.d dVar = e.f2214a;
        return new n(this);
    }

    @Override // G1.O
    public final void d(List list, H h3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C0140k) it.next());
        }
    }

    @Override // G1.O
    public final void e(C0140k c0140k, boolean z3) {
        b().e(c0140k, z3);
        int a02 = X3.m.a0((Iterable) ((M) b().f.f19316k).getValue(), c0140k);
        int i = 0;
        for (Object obj : (Iterable) ((M) b().f.f19316k).getValue()) {
            int i5 = i + 1;
            if (i < 0) {
                X3.n.R();
                throw null;
            }
            C0140k c0140k2 = (C0140k) obj;
            if (i > a02) {
                b().b(c0140k2);
            }
            i = i5;
        }
    }
}
