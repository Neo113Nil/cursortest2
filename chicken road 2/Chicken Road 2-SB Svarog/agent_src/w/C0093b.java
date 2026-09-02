package w;

import x.InterfaceC0099a;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0093b f1278d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0093b f1279e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0093b f1280f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0093b f1281g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0093b f1282h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0093b f1283i;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1284b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1285c;

    static {
        int i2 = 0;
        f1278d = new C0093b("NONE", i2);
        f1279e = new C0093b("FULL", i2);
        int i3 = 1;
        f1280f = new C0093b("FLAT", i3);
        f1281g = new C0093b("HALF_OPENED", i3);
        int i4 = 2;
        f1282h = new C0093b("FOLD", i4);
        f1283i = new C0093b("HINGE", i4);
    }

    public /* synthetic */ C0093b(String str, int i2) {
        this.f1284b = i2;
        this.f1285c = str;
    }

    public String toString() {
        switch (this.f1284b) {
            case 0:
                return (String) this.f1285c;
            case 1:
                return (String) this.f1285c;
            case 2:
                return (String) this.f1285c;
            default:
                return super.toString();
        }
    }

    public C0093b(InterfaceC0099a interfaceC0099a) {
        this.f1284b = 3;
        int i2 = n.f1309b;
        this.f1285c = interfaceC0099a;
    }
}
