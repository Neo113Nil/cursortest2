package I;

import A0.C0040k0;
import P.AbstractC0329z;
import P.d1;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.C2451c;
import u2.C2496k;

/* loaded from: classes.dex */
public final class F extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2397k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2398l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1 f2399m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2451c f2400n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(d1 d1Var, C2451c c2451c, a4.c cVar) {
        super(2, cVar);
        this.f2399m = d1Var;
        this.f2400n = c2451c;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        F f = new F(this.f2399m, this.f2400n, cVar);
        f.f2398l = obj;
        return f;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2397k;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f2398l;
            C2496k z3 = AbstractC0329z.z(new C0040k0(12, this.f2399m));
            E e3 = new E(0, this.f2400n, interfaceC2280u);
            this.f2397k = 1;
            if (z3.a(e3, this) == enumC0510a) {
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
