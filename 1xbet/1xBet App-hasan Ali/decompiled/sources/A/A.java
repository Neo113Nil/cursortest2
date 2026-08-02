package A;

import P.C0299j0;
import c4.AbstractC0548i;
import x.U;
import z0.C2731G;

/* loaded from: classes.dex */
public final class A extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E f0k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(E e3, int i, a4.c cVar) {
        super(2, cVar);
        this.f0k = e3;
        this.f1l = i;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new A(this.f0k, this.f1l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        A a5 = (A) create((U) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        a5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        E e3 = this.f0k;
        v vVar = e3.f12d;
        int h3 = ((C0299j0) vVar.f133b).h();
        int i = this.f1l;
        if (h3 != i || ((C0299j0) vVar.f134c).h() != 0) {
            e3.f19m.c();
        }
        vVar.k(i, 0);
        vVar.f135d = null;
        C2731G c2731g = e3.f16j;
        if (c2731g != null) {
            c2731g.k();
        }
        return W3.o.f6046a;
    }
}
