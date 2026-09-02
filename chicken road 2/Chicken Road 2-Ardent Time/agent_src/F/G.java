package F;

/* loaded from: classes.dex */
public final class G extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f343e;

    /* renamed from: f, reason: collision with root package name */
    public int f344f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F.P f346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(F.P p2, int i2, k1.d dVar) {
        super(2, dVar);
        this.f346h = p2;
        this.f347i = i2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.G g2 = new F.G(this.f346h, this.f347i, dVar);
        g2.f345g = ((java.lang.Boolean) obj).booleanValue();
        return g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // m1.AbstractC0931b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(java.lang.Object obj) {
        boolean z2;
        java.lang.Object obj2;
        int i2;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i3 = this.f344f;
        F.P p2 = this.f346h;
        if (i3 == 0) {
            a.AbstractC0059a.A(obj);
            z2 = this.f345g;
            this.f345g = z2;
            this.f344f = 1;
            obj = p2.i(this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f343e;
                a.AbstractC0059a.A(obj);
                i2 = ((java.lang.Number) obj).intValue();
                return new F.C0004d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
            }
            z2 = this.f345g;
            a.AbstractC0059a.A(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f347i;
            return new F.C0004d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
        }
        F.j0 g2 = p2.g();
        this.f343e = obj;
        this.f344f = 2;
        java.lang.Integer a2 = g2.a();
        if (a2 == enumC0927a) {
            return enumC0927a;
        }
        obj2 = obj;
        obj = a2;
        i2 = ((java.lang.Number) obj).intValue();
        return new F.C0004d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return ((F.G) b(bool, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
