package P;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class B0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f4249k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4250l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E0 f4251m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0281a0 f4252n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(E0 e02, InterfaceC0281a0 interfaceC0281a0, a4.c cVar) {
        super(2, cVar);
        this.f4251m = e02;
        this.f4252n = interfaceC0281a0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        B0 b02 = new B0(this.f4251m, this.f4252n, cVar);
        b02.f4250l = obj;
        return b02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4249k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return W3.o.f6046a;
        }
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f4250l;
        this.f4249k = 1;
        this.f4251m.b(interfaceC2280u, this.f4252n, this);
        return enumC0510a;
    }
}
