package F;

/* renamed from: F.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021v extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public F.C0004d f520e;

    /* renamed from: f, reason: collision with root package name */
    public int f521f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F.P f523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021v(F.P p2, k1.d dVar) {
        super(2, dVar);
        this.f523h = p2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.C0021v c0021v = new F.C0021v(this.f523h, dVar);
        c0021v.f522g = obj;
        return c0021v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // m1.AbstractC0931b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(java.lang.Object obj) {
        C1.e eVar;
        F.k0 k0Var;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f521f;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        F.P p2 = this.f523h;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            C1.e eVar2 = (C1.e) this.f522g;
            this.f522g = eVar2;
            this.f521f = 1;
            java.lang.Object n2 = z1.AbstractC1068v.n(p2.f380c.i(), new F.I(p2, null), this);
            if (n2 == enumC0927a) {
                return enumC0927a;
            }
            eVar = eVar2;
            obj = n2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        a.AbstractC0059a.A(obj);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = this.f520e;
                eVar = (C1.e) this.f522g;
                a.AbstractC0059a.A(obj);
                C1.i iVar = new C1.i(new C.j(5, new x0.e(2, new x0.e(3, new x0.e(1, new F.C0016p(p2, null), (C1.r) p2.f385h.f88b), new F.C0017q(2, null)), new F.r(k0Var, null))), new F.C0018s(p2, (k1.d) null));
                this.f522g = null;
                this.f520e = null;
                this.f521f = 3;
                if (!(eVar instanceof C1.u)) {
                    throw ((C1.u) eVar).f180a;
                }
                java.lang.Object o2 = iVar.o(eVar, this);
                if (o2 != enumC0927a) {
                    o2 = c0177i;
                }
                return o2 == enumC0927a ? enumC0927a : c0177i;
            }
            C1.e eVar3 = (C1.e) this.f522g;
            a.AbstractC0059a.A(obj);
            eVar = eVar3;
        }
        k0Var = (F.k0) obj;
        if (k0Var instanceof F.C0004d) {
            java.lang.Object obj2 = ((F.C0004d) k0Var).f432b;
            this.f522g = eVar;
            this.f520e = (F.C0004d) k0Var;
            this.f521f = 2;
            if (eVar.a(obj2, this) == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (k0Var instanceof F.l0) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (k0Var instanceof F.d0) {
                throw ((F.d0) k0Var).f434b;
            }
            if (k0Var instanceof F.b0) {
                return c0177i;
            }
        }
        C1.i iVar2 = new C1.i(new C.j(5, new x0.e(2, new x0.e(3, new x0.e(1, new F.C0016p(p2, null), (C1.r) p2.f385h.f88b), new F.C0017q(2, null)), new F.r(k0Var, null))), new F.C0018s(p2, (k1.d) null));
        this.f522g = null;
        this.f520e = null;
        this.f521f = 3;
        if (!(eVar instanceof C1.u)) {
        }
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.C0021v) b((C1.e) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
