package x;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* loaded from: classes.dex */
public final class E0 extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f20624l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20625m;

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        E0 e02 = new E0(cVar);
        e02.f20625m = obj;
        return e02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20624l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return obj;
        }
        G4.l.N(obj);
        t0.E e3 = (t0.E) this.f20625m;
        this.f20624l = 1;
        Object d5 = Q0.d(e3, t0.k.f19490l, this);
        return d5 == enumC0510a ? enumC0510a : d5;
    }
}
