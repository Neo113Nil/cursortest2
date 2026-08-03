package F;

/* loaded from: classes.dex */
public final class O extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.o f371e;

    /* renamed from: f, reason: collision with root package name */
    public int f372f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F.P f375i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f376j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f377k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(kotlin.jvm.internal.o oVar, F.P p2, java.lang.Object obj, boolean z2, k1.d dVar) {
        super(2, dVar);
        this.f374h = oVar;
        this.f375i = p2;
        this.f376j = obj;
        this.f377k = z2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.O o2 = new F.O(this.f374h, this.f375i, this.f376j, this.f377k, dVar);
        o2.f373g = obj;
        return o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // m1.AbstractC0931b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(java.lang.Object obj) {
        kotlin.jvm.internal.o oVar;
        F.a0 a0Var;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f372f;
        kotlin.jvm.internal.o oVar2 = this.f374h;
        java.lang.Object obj2 = this.f376j;
        F.P p2 = this.f375i;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            F.a0 a0Var2 = (F.a0) this.f373g;
            F.j0 g2 = p2.g();
            this.f373g = a0Var2;
            this.f371e = oVar2;
            this.f372f = 1;
            java.lang.Integer num = new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) g2.f472b.f88b).incrementAndGet());
            if (num == enumC0927a) {
                return enumC0927a;
            }
            oVar = oVar2;
            a0Var = a0Var2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.AbstractC0059a.A(obj);
                if (this.f377k) {
                    p2.f385h.p(new F.C0004d(obj2 != null ? obj2.hashCode() : 0, oVar2.f7959a, obj2));
                }
                return h1.C0177i.f3302a;
            }
            oVar = this.f371e;
            a0Var = (F.a0) this.f373g;
            a.AbstractC0059a.A(obj);
        }
        oVar.f7959a = ((java.lang.Number) obj).intValue();
        this.f373g = null;
        this.f371e = null;
        this.f372f = 2;
        if (a0Var.b(obj2, this) == enumC0927a) {
            return enumC0927a;
        }
        if (this.f377k) {
        }
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.O) b((F.a0) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
