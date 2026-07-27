package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i1.C0331a;
import java.util.concurrent.atomic.AtomicInteger;
import w2.AbstractC1242v;
import w2.C1233l;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class K extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f766e;
    public /* synthetic */ InterfaceC1241u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i2.g f768h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(O o3, o2.p pVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f767g = o3;
        this.f768h = (i2.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        K k3 = new K(this.f767g, this.f768h, interfaceC0319c);
        k3.f = (InterfaceC1241u) obj;
        return k3;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f766e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            return obj;
        }
        X0.a.L(obj);
        InterfaceC1241u interfaceC1241u = this.f;
        C1233l c1233l = new C1233l(true);
        c1233l.F(null);
        O o3 = this.f767g;
        b0 b0Var = new b0(this.f768h, c1233l, o3.f786h.u(), interfaceC1241u.d());
        D0.a aVar = o3.f790l;
        Object j3 = ((y2.b) aVar.f263c).j(b0Var);
        if (j3 instanceof y2.g) {
            y2.g gVar = j3 != null ? (y2.g) j3 : null;
            Throwable th = gVar != null ? gVar.f10622a : null;
            if (th == null) {
                throw new C0331a("Channel was closed normally");
            }
            throw th;
        }
        if (j3 instanceof y2.h) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((J1.i) aVar.f264d).f729b).getAndIncrement() == 0) {
            AbstractC1242v.g((InterfaceC1241u) aVar.f261a, null, new e0(aVar, null), 3);
        }
        this.f766e = 1;
        Object S2 = c1233l.S(this);
        return S2 == enumC0326a ? enumC0326a : S2;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
