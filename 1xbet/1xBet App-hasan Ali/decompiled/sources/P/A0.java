package P;

import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class A0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4247k;

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        A0 a02 = new A0(2, cVar);
        a02.f4247k = obj;
        return a02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A0) create((EnumC0330z0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return Boolean.valueOf(((EnumC0330z0) this.f4247k) == EnumC0330z0.f4607k);
    }
}
