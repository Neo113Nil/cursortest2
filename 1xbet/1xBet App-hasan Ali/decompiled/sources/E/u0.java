package E;

import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import y.C2654j;

/* loaded from: classes.dex */
public final class u0 extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public int f1343k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ x.T f1344l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f1345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2280u f1346n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f1347o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2654j f1348p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(InterfaceC2280u interfaceC2280u, InterfaceC0289e0 interfaceC0289e0, C2654j c2654j, a4.c cVar) {
        super(3, cVar);
        this.f1346n = interfaceC2280u;
        this.f1347o = interfaceC0289e0;
        this.f1348p = c2654j;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j5 = ((C1988b) obj2).f17191a;
        u0 u0Var = new u0(this.f1346n, this.f1347o, this.f1348p, (a4.c) obj3);
        u0Var.f1344l = (x.T) obj;
        u0Var.f1345m = j5;
        return u0Var.invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1343k;
        InterfaceC2280u interfaceC2280u = this.f1346n;
        if (i == 0) {
            G4.l.N(obj);
            x.T t5 = this.f1344l;
            AbstractC2282w.p(interfaceC2280u, null, new s0(this.f1347o, this.f1345m, this.f1348p, null), 3);
            this.f1343k = 1;
            obj = t5.b(this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        AbstractC2282w.p(interfaceC2280u, null, new t0(this.f1347o, ((Boolean) obj).booleanValue(), this.f1348p, null), 3);
        return W3.o.f6046a;
    }
}
