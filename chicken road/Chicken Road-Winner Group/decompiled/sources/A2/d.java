package A2;

import d2.C0279i;
import g2.C0320d;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.AbstractC1242v;
import w2.B;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class d extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f94e;
    public /* synthetic */ InterfaceC1241u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z2.e f95g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f96h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z2.e eVar, f fVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f95g = eVar;
        this.f96h = fVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        d dVar = new d(this.f95g, this.f96h, interfaceC0319c);
        dVar.f = (InterfaceC1241u) obj;
        return dVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f94e;
        C0279i c0279i = C0279i.f4852a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            return c0279i;
        }
        X0.a.L(obj);
        InterfaceC1241u interfaceC1241u = this.f;
        f fVar = this.f96h;
        int i4 = fVar.f100b;
        if (i4 == -3) {
            i4 = -2;
        }
        o2.p eVar = new e(fVar, null);
        y2.b a3 = y2.i.a(i4, fVar.f101c, 4);
        g2.h b3 = AbstractC1242v.b(interfaceC1241u.d(), fVar.f99a, true);
        D2.d dVar = B.f10462a;
        if (b3 != dVar && b3.k(C0320d.f4980a) == null) {
            b3 = b3.h(dVar);
        }
        y2.n nVar = new y2.n(b3, a3);
        nVar.U(3, nVar, eVar);
        this.f94e = 1;
        Object b4 = z2.q.b(this.f95g, nVar, true, this);
        if (b4 != enumC0326a) {
            b4 = c0279i;
        }
        return b4 == enumC0326a ? enumC0326a : c0279i;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
