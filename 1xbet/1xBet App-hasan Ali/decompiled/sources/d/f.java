package d;

import W3.o;
import c4.AbstractC0548i;
import s4.InterfaceC2368e;

/* loaded from: classes.dex */
public final class f extends AbstractC0548i implements i4.e {
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new f(2, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((InterfaceC2368e) obj, (a4.c) obj2);
        o oVar = o.f6046a;
        fVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return o.f6046a;
    }
}
