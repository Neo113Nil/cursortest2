package Wb;

import Ub.r;
import Ub.t;
import Vb.q;
import Xb.C4883b;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class g implements t {
    @Override // Ub.t
    public final Object a(@NonNull Ub.f fVar, @NonNull r rVar) {
        if (q.a.BULLET == q.f28492a.d(rVar)) {
            return new C4883b(fVar.g(), q.f28493b.d(rVar).intValue());
        }
        return new Xb.i(fVar.g(), String.valueOf(q.f28494c.d(rVar)).concat(". "));
    }
}
