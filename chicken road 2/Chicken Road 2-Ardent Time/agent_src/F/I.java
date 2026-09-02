package F;

/* loaded from: classes.dex */
public final class I extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.P f355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(F.P p2, k1.d dVar) {
        super(2, dVar);
        this.f355f = p2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new F.I(this.f355f, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f354e;
        F.P p2 = this.f355f;
        try {
            if (i2 == 0) {
                a.AbstractC0059a.A(obj);
                if (p2.f385h.l() instanceof F.b0) {
                    return p2.f385h.l();
                }
                this.f354e = 1;
                if (p2.h(this) == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.AbstractC0059a.A(obj);
                    return (F.k0) obj;
                }
                a.AbstractC0059a.A(obj);
            }
            this.f354e = 2;
            obj = F.P.d(p2, false, this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
            return (F.k0) obj;
        } catch (java.lang.Throwable th) {
            return new F.d0(th, -1);
        }
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.I) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
