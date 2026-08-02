package I3;

import java.util.BitSet;
import n.AbstractC2107A;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public class Q extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        boolean z3;
        BitSet bitSet = new BitSet();
        aVar.b();
        int K = aVar.K();
        int i = 0;
        while (K != 2) {
            int b3 = AbstractC2462i.b(K);
            if (b3 == 5 || b3 == 6) {
                int v4 = aVar.v();
                if (v4 == 0) {
                    z3 = false;
                } else {
                    if (v4 != 1) {
                        StringBuilder v5 = AbstractC2107A.v(v4, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        v5.append(aVar.m(true));
                        throw new F3.p(v5.toString());
                    }
                    z3 = true;
                }
            } else {
                if (b3 != 7) {
                    throw new F3.p("Invalid bitset value type: " + L1.a.u(K) + "; at path " + aVar.m(false));
                }
                z3 = aVar.s();
            }
            if (z3) {
                bitSet.set(i);
            }
            i++;
            K = aVar.K();
        }
        aVar.i();
        return bitSet;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.d();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            bVar.v(bitSet.get(i) ? 1L : 0L);
        }
        bVar.i();
    }
}
