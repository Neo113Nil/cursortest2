package x;

import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class x0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T f20895k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(T t5, a4.c cVar) {
        super(2, cVar);
        this.f20895k = t5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new x0(this.f20895k, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        x0 x0Var = (x0) create((InterfaceC2280u) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        x0Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        T t5 = this.f20895k;
        t5.f20725m = true;
        t5.f20726n.d(null);
        return W3.o.f6046a;
    }
}
