package Vb;

import Hf.u;
import Ub.l;
import Ub.t;
import androidx.annotation.NonNull;
import bc.AbstractC5635k;
import dc.AbstractC6136a;

/* loaded from: classes.dex */
final class n implements l.b<Hf.o> {
    @Override // Ub.l.b
    public final void a(@NonNull u uVar, @NonNull Ub.l lVar) {
        Hf.o oVar = (Hf.o) uVar;
        t a11 = lVar.t().e().a(Hf.o.class);
        if (a11 == null) {
            lVar.b(oVar);
            return;
        }
        int length = lVar.length();
        lVar.b(oVar);
        if (length == lVar.length()) {
            lVar.d().a((char) 65532);
        }
        Ub.f t2 = lVar.t();
        boolean z11 = oVar.f() instanceof Hf.q;
        AbstractC6136a b11 = t2.b();
        String m11 = oVar.m();
        b11.getClass();
        Ub.r i11 = lVar.i();
        AbstractC5635k.f55885a.e(i11, m11);
        AbstractC5635k.f55886b.e(i11, Boolean.valueOf(z11));
        AbstractC5635k.f55887c.e(i11, null);
        lVar.a(length, a11.a(t2, i11));
    }
}
