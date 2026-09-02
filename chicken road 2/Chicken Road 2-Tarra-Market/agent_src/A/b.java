package A;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f3e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f4f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f5g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f6h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f7i;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9c;

    static {
        int i2 = 0;
        f2d = new b("NONE", i2);
        f3e = new b("FULL", i2);
        int i3 = 1;
        f4f = new b("FLAT", i3);
        f5g = new b("HALF_OPENED", i3);
        int i4 = 2;
        f6h = new b("FOLD", i4);
        f7i = new b("HINGE", i4);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f8b = i2;
        this.f9c = str;
    }

    public String toString() {
        switch (this.f8b) {
            case 0:
                return (String) this.f9c;
            case 1:
                return (String) this.f9c;
            case 2:
                return (String) this.f9c;
            default:
                return super.toString();
        }
    }

    public b(B.a aVar) {
        this.f8b = 3;
        int i2 = p.f35b;
        this.f9c = aVar;
    }
}
