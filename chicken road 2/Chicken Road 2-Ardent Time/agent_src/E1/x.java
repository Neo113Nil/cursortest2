package E1;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements s1.p {

    /* renamed from: f, reason: collision with root package name */
    public static final E1.x f306f = new E1.x(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final E1.x f307g = new E1.x(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final E1.x f308h = new E1.x(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i3) {
        super(i2);
        this.f309e = i3;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f309e) {
            case 0:
                k1.g gVar = (k1.g) obj2;
                if (!(gVar instanceof z1.g0)) {
                    return obj;
                }
                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : java.lang.Integer.valueOf(intValue + 1);
            case 1:
                z1.g0 g0Var = (z1.g0) obj;
                k1.g gVar2 = (k1.g) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (gVar2 instanceof z1.g0) {
                    return (z1.g0) gVar2;
                }
                return null;
            default:
                return (E1.z) obj;
        }
    }
}
