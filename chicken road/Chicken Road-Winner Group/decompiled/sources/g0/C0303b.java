package g0;

import h0.InterfaceC0324a;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303b implements InterfaceC0309h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0303b f4949c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0303b f4950d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0303b f4951e;
    public static final C0303b f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0303b f4952g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0303b f4953h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4954a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4955b;

    static {
        int i3 = 0;
        f4949c = new C0303b("NONE", i3);
        f4950d = new C0303b("FULL", i3);
        int i4 = 1;
        f4951e = new C0303b("FLAT", i4);
        f = new C0303b("HALF_OPENED", i4);
        int i5 = 2;
        f4952g = new C0303b("FOLD", i5);
        f4953h = new C0303b("HINGE", i5);
    }

    public /* synthetic */ C0303b(String str, int i3) {
        this.f4954a = i3;
        this.f4955b = str;
    }

    public String toString() {
        switch (this.f4954a) {
            case 0:
                return (String) this.f4955b;
            case 1:
                return (String) this.f4955b;
            case 2:
                return (String) this.f4955b;
            default:
                return super.toString();
        }
    }

    public C0303b(InterfaceC0324a interfaceC0324a) {
        this.f4954a = 3;
        int i3 = C0314m.f4974b;
        this.f4955b = interfaceC0324a;
    }
}
