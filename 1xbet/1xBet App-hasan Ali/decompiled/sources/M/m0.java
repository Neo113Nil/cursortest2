package M;

import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class m0 extends AbstractC0548i implements i4.e {
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new m0(2, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        m0 m0Var = (m0) create((t0.v) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        m0Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return W3.o.f6046a;
    }
}
