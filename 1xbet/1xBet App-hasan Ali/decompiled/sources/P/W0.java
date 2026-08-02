package P;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class W0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f4415k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.e f4417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f4418n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(i4.e eVar, InterfaceC0289e0 interfaceC0289e0, a4.c cVar) {
        super(2, cVar);
        this.f4417m = eVar;
        this.f4418n = interfaceC0289e0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        W0 w02 = new W0(this.f4417m, this.f4418n, cVar);
        w02.f4416l = obj;
        return w02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4415k;
        if (i == 0) {
            G4.l.N(obj);
            C0318t0 c0318t0 = new C0318t0(this.f4418n, ((InterfaceC2280u) this.f4416l).i());
            this.f4415k = 1;
            if (this.f4417m.invoke(c0318t0, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
