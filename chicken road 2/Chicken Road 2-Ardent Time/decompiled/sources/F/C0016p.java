package F;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016p extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.P f508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0016p(F.P p2, k1.d dVar) {
        super(2, dVar);
        this.f508f = p2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new F.C0016p(this.f508f, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f507e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f507e = 1;
            if (F.P.c(this.f508f, this) == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.C0016p) b((C1.e) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
