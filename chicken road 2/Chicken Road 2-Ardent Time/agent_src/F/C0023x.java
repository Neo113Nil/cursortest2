package F;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023x extends m1.AbstractC0935f implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public int f529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.H f530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023x(F.H h2, k1.d dVar) {
        super(1, dVar);
        this.f530f = h2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f529e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f529e = 1;
            obj = this.f530f.invoke(this);
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

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new F.C0023x(this.f530f, (k1.d) obj).g(h1.C0177i.f3302a);
    }
}
