package D1;

/* loaded from: classes.dex */
public final class d extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f223e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1.e f225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D1.f f226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1.e eVar, D1.f fVar, k1.d dVar) {
        super(2, dVar);
        this.f225g = eVar;
        this.f226h = fVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        D1.d dVar2 = new D1.d(this.f225g, this.f226h, dVar);
        dVar2.f224f = obj;
        return dVar2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f223e;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            z1.InterfaceC1067u interfaceC1067u = (z1.InterfaceC1067u) this.f224f;
            D1.f fVar = this.f226h;
            int i3 = fVar.f231b;
            if (i3 == -3) {
                i3 = -2;
            }
            s1.p eVar = new D1.e(fVar, null);
            B1.c a2 = B1.j.a(i3, fVar.f232c, 4);
            k1.i a3 = z1.AbstractC1068v.a(interfaceC1067u.i(), fVar.f230a, true);
            G1.d dVar = z1.B.f8521a;
            if (a3 != dVar && a3.m(k1.e.f7950a) == null) {
                a3 = a3.g(dVar);
            }
            B1.q qVar = new B1.q(a3, a2);
            qVar.V(3, qVar, eVar);
            this.f223e = 1;
            java.lang.Object b2 = C1.s.b(this.f225g, qVar, true, this);
            if (b2 != enumC0927a) {
                b2 = c0177i;
            }
            if (b2 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        return c0177i;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((D1.d) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
