package B;

import A.C0004d;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import v.d0;

/* loaded from: classes.dex */
public final class E extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f615k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f617m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, int i, a4.c cVar) {
        super(2, cVar);
        this.f616l = f;
        this.f617m = i;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new E(this.f616l, this.f617m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f615k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        C0004d c0004d = this.f616l.f624z;
        this.f615k = 1;
        c0004d.getClass();
        v3.g gVar = A.E.f8w;
        A.E e3 = c0004d.f45a;
        e3.getClass();
        Object e5 = e3.e(d0.f20222k, new A.A(e3, this.f617m, null), this);
        if (e5 != enumC0510a) {
            e5 = oVar;
        }
        if (e5 != enumC0510a) {
            e5 = oVar;
        }
        return e5 == enumC0510a ? enumC0510a : oVar;
    }
}
