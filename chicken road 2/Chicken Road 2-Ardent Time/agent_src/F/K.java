package F;

/* loaded from: classes.dex */
public final class K extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f359e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m1.AbstractC0935f f362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(F.P p2, s1.p pVar, k1.d dVar) {
        super(2, dVar);
        this.f361g = p2;
        this.f362h = (m1.AbstractC0935f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.K k2 = new F.K(this.f361g, this.f362h, dVar);
        k2.f360f = obj;
        return k2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f359e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            z1.InterfaceC1067u interfaceC1067u = (z1.InterfaceC1067u) this.f360f;
            z1.C1059l c1059l = new z1.C1059l(true);
            c1059l.G(null);
            F.P p2 = this.f361g;
            F.c0 c0Var = new F.c0(this.f362h, c1059l, p2.f385h.l(), interfaceC1067u.i());
            F.C0014n c0014n = p2.f389l;
            java.lang.Object h2 = ((B1.c) c0014n.f500c).h(c0Var);
            if (h2 instanceof B1.h) {
                B1.h hVar = h2 instanceof B1.h ? (B1.h) h2 : null;
                java.lang.Throwable th = hVar != null ? hVar.f44a : null;
                if (th == null) {
                    throw new B1.m("Channel was closed normally");
                }
                throw th;
            }
            if (h2 instanceof B1.i) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (((java.util.concurrent.atomic.AtomicInteger) ((C.j) c0014n.f501d).f88b).getAndIncrement() == 0) {
                z1.AbstractC1068v.g((z1.InterfaceC1067u) c0014n.f498a, new F.f0(c0014n, null));
            }
            this.f359e = 1;
            obj = c1059l.T(this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        return obj;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.K) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
