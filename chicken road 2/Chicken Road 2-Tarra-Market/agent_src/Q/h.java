package Q;

import d0.C0052a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0004b {

    /* renamed from: b, reason: collision with root package name */
    public static h f437b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f438c = new i(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f439a;

    public /* synthetic */ h(Object obj) {
        this.f439a = obj;
    }

    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f437b == null) {
                    f437b = new h();
                }
                hVar = f437b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // Q.InterfaceC0004b
    public void a(N.b bVar) {
        boolean z2 = bVar.f231b == 0;
        C0052a c0052a = (C0052a) this.f439a;
        if (z2) {
            c0052a.e(null, c0052a.f754w);
            return;
        }
        h hVar = c0052a.f746o;
        if (hVar != null) {
            ((O.h) hVar.f439a).a(bVar);
        }
    }
}
