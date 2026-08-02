package f4;

/* renamed from: f4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1084A {

    /* renamed from: c, reason: collision with root package name */
    public static final C1084A f12901c = new C1084A();

    /* renamed from: a, reason: collision with root package name */
    public final s f12902a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.g f12903b;

    public C1084A() {
        s sVar = s.f12964d;
        if (B3.g.f1061d == null) {
            B3.g gVar = new B3.g(5);
            gVar.f1063b = false;
            B3.g.f1061d = gVar;
        }
        B3.g gVar2 = B3.g.f1061d;
        this.f12902a = sVar;
        this.f12903b = gVar2;
    }

    public final void a(androidx.fragment.app.A a2) {
        s sVar = this.f12902a;
        sVar.getClass();
        s.d(a2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        sVar.f12966b = 0L;
    }
}
