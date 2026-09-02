package I;

/* loaded from: classes.dex */
public final class h extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f651e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1.AbstractC0935f f653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(s1.p pVar, k1.d dVar) {
        super(2, dVar);
        this.f653g = (m1.AbstractC0935f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        I.h hVar = new I.h(this.f653g, dVar);
        hVar.f652f = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f651e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I.b bVar = (I.b) this.f652f;
            a.AbstractC0059a.A(obj);
            return bVar;
        }
        a.AbstractC0059a.A(obj);
        I.b bVar2 = new I.b(i1.AbstractC0202u.L(((I.b) this.f652f).a()), false);
        this.f652f = bVar2;
        this.f651e = 1;
        return this.f653g.invoke(bVar2, this) == enumC0927a ? enumC0927a : bVar2;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((I.h) b((I.b) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
