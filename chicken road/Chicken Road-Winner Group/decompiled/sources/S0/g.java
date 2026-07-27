package S0;

import h1.C0325a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0059b {

    /* renamed from: b, reason: collision with root package name */
    public static g f1327b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f1328c = new h(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f1329a;

    public /* synthetic */ g(Object obj) {
        this.f1329a = obj;
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f1327b == null) {
                    f1327b = new g();
                }
                gVar = f1327b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // S0.InterfaceC0059b
    public void a(P0.b bVar) {
        boolean z3 = bVar.f1122b == 0;
        C0325a c0325a = (C0325a) this.f1329a;
        if (z3) {
            c0325a.l(null, c0325a.f2593w);
            return;
        }
        g gVar = c0325a.f2585o;
        if (gVar != null) {
            ((Q0.h) gVar.f1329a).a(bVar);
        }
    }
}
