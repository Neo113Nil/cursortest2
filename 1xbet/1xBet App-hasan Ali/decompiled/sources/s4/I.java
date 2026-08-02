package s4;

import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class I extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19238k;

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        I i = new I(2, cVar);
        i.f19238k = obj;
        return i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return Boolean.valueOf(((E) this.f19238k) != E.f19227k);
    }
}
