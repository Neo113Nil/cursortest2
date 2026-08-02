package I;

import A0.o1;

/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163p implements InterfaceC0157j {

    /* renamed from: b, reason: collision with root package name */
    public static final C0163p f2508b = new C0163p(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0163p f2509c = new C0163p(1);

    /* renamed from: d, reason: collision with root package name */
    public static final o1 f2510d = new o1(1);

    /* renamed from: e, reason: collision with root package name */
    public static final o1 f2511e = new o1(2);
    public static final o1 f = new o1(3);

    /* renamed from: g, reason: collision with root package name */
    public static final o1 f2512g = new o1(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2513a;

    public /* synthetic */ C0163p(int i) {
        this.f2513a = i;
    }

    @Override // I.InterfaceC0157j
    public long a(C0160m c0160m, int i) {
        switch (this.f2513a) {
            case 0:
                String str = ((K0.L) c0160m.f2501e).f2792a.f2784a.f2829l;
                return K0.F.b(E.W.o(str, i), E.W.n(str, i));
            default:
                return ((K0.L) c0160m.f2501e).k(i);
        }
    }
}
