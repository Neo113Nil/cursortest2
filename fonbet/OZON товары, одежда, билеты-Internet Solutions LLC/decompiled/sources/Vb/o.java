package Vb;

import Hf.AbstractC3139b;
import Hf.t;
import Hf.u;
import Hf.v;
import Ub.l;
import Vb.q;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class o implements l.b<t> {
    @Override // Ub.l.b
    public final void a(@NonNull u uVar, @NonNull Ub.l lVar) {
        t tVar = (t) uVar;
        int length = lVar.length();
        lVar.b(tVar);
        AbstractC3139b m11 = tVar.m();
        if (m11 instanceof v) {
            v vVar = (v) m11;
            int q11 = vVar.q();
            q.f28492a.e(lVar.i(), q.a.ORDERED);
            q.f28494c.e(lVar.i(), Integer.valueOf(q11));
            vVar.s(vVar.q() + 1);
        } else {
            q.f28492a.e(lVar.i(), q.a.BULLET);
            Ub.p<Integer> pVar = q.f28493b;
            Ub.r i11 = lVar.i();
            int i12 = 0;
            for (u f7 = tVar.f(); f7 != null; f7 = f7.f()) {
                if (f7 instanceof t) {
                    i12++;
                }
            }
            pVar.e(i11, Integer.valueOf(i12));
        }
        lVar.E(tVar, length);
        if (lVar.A(tVar)) {
            lVar.w();
        }
    }
}
