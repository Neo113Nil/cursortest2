package s4;

import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class r extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f19304k;

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        r rVar = new r(2, cVar);
        rVar.f19304k = ((Number) obj).intValue();
        return rVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create(Integer.valueOf(((Number) obj).intValue()), (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return Boolean.valueOf(this.f19304k > 0);
    }
}
