package m0;

import n0.InterfaceC1296a;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267b implements InterfaceC1273h {

    /* renamed from: c, reason: collision with root package name */
    public static final C1267b f11090c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1267b f11091d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1267b f11092e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1267b f11093f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1267b f11094g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1267b f11095h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11096a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11097b;

    static {
        int i2 = 0;
        f11090c = new C1267b("NONE", i2);
        f11091d = new C1267b("FULL", i2);
        int i3 = 1;
        f11092e = new C1267b("FLAT", i3);
        f11093f = new C1267b("HALF_OPENED", i3);
        int i6 = 2;
        f11094g = new C1267b("FOLD", i6);
        f11095h = new C1267b("HINGE", i6);
    }

    public /* synthetic */ C1267b(String str, int i2) {
        this.f11096a = i2;
        this.f11097b = str;
    }

    public String toString() {
        switch (this.f11096a) {
            case 0:
                return (String) this.f11097b;
            case 1:
                return (String) this.f11097b;
            case 2:
                return (String) this.f11097b;
            default:
                return super.toString();
        }
    }

    public C1267b(InterfaceC1296a interfaceC1296a) {
        this.f11096a = 3;
        int i2 = n.f11121b;
        this.f11097b = interfaceC1296a;
    }
}
