package D1;

/* loaded from: classes.dex */
public final class g extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f233e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D1.h f235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(D1.h hVar, k1.d dVar) {
        super(2, dVar);
        this.f235g = hVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        D1.g gVar = new D1.g(this.f235g, dVar);
        gVar.f234f = obj;
        return gVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f233e;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            C1.e eVar = (C1.e) this.f234f;
            this.f233e = 1;
            java.lang.Object o2 = this.f235g.f236d.o(eVar, this);
            if (o2 != enumC0927a) {
                o2 = c0177i;
            }
            if (o2 == enumC0927a) {
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
        return ((D1.g) b((C1.e) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
