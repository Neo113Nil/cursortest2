package p042f4;

import B3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f12907c = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f12908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12909b;

    public A() {
        s sVar = s.f12970d;
        if (g.f1061d == null) {
            g gVar = new g(5);
            gVar.f1063b = false;
            g.f1061d = gVar;
        }
        g gVar2 = g.f1061d;
        this.f12908a = sVar;
        this.f12909b = gVar2;
    }

    public final void a(androidx.fragment.app.A a2) {
        s sVar = this.f12908a;
        sVar.getClass();
        s.d(a2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        sVar.f12972b = 0L;
    }
}
