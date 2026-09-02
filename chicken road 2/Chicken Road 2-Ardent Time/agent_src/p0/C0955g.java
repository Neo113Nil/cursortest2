package p0;

/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955g implements p0.InterfaceC0950b {

    /* renamed from: b, reason: collision with root package name */
    public static p0.C0955g f8253b;

    /* renamed from: c, reason: collision with root package name */
    public static final p0.C0956h f8254c = new p0.C0956h(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f8255a;

    public /* synthetic */ C0955g(java.lang.Object obj) {
        this.f8255a = obj;
    }

    public static synchronized p0.C0955g b() {
        p0.C0955g c0955g;
        synchronized (p0.C0955g.class) {
            try {
                if (f8253b == null) {
                    f8253b = new p0.C0955g();
                }
                c0955g = f8253b;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0955g;
    }

    @Override // p0.InterfaceC0950b
    public void a(m0.b bVar) {
        boolean z2 = bVar.f8043b == 0;
        C0.a aVar = (C0.a) this.f8255a;
        if (z2) {
            aVar.l(null, aVar.f2620w);
            return;
        }
        p0.C0955g c0955g = aVar.f2613o;
        if (c0955g != null) {
            ((n0.h) c0955g.f8255a).b(bVar);
        }
    }
}
