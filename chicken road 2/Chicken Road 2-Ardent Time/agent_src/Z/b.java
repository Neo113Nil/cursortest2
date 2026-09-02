package Z;

/* loaded from: classes.dex */
public final class b implements Z.h {

    /* renamed from: c, reason: collision with root package name */
    public static final Z.b f1836c;

    /* renamed from: d, reason: collision with root package name */
    public static final Z.b f1837d;

    /* renamed from: e, reason: collision with root package name */
    public static final Z.b f1838e;

    /* renamed from: f, reason: collision with root package name */
    public static final Z.b f1839f;

    /* renamed from: g, reason: collision with root package name */
    public static final Z.b f1840g;

    /* renamed from: h, reason: collision with root package name */
    public static final Z.b f1841h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1842a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1843b;

    static {
        int i2 = 0;
        f1836c = new Z.b("NONE", i2);
        f1837d = new Z.b("FULL", i2);
        int i3 = 1;
        f1838e = new Z.b("FLAT", i3);
        f1839f = new Z.b("HALF_OPENED", i3);
        int i4 = 2;
        f1840g = new Z.b("FOLD", i4);
        f1841h = new Z.b("HINGE", i4);
    }

    public /* synthetic */ b(java.lang.String str, int i2) {
        this.f1842a = i2;
        this.f1843b = str;
    }

    public java.lang.String toString() {
        switch (this.f1842a) {
            case 0:
                return (java.lang.String) this.f1843b;
            case 1:
                return (java.lang.String) this.f1843b;
            case 2:
                return (java.lang.String) this.f1843b;
            default:
                return super.toString();
        }
    }

    public b(a0.InterfaceC0060a interfaceC0060a) {
        this.f1842a = 3;
        int i2 = Z.m.f1865b;
        this.f1843b = interfaceC0060a;
    }
}
