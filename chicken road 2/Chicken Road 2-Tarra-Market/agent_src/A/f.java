package A;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements U0.a {

    /* renamed from: e, reason: collision with root package name */
    public static final f f18e = new f(0);

    @Override // U0.a
    public final Object invoke() {
        WindowLayoutComponent a2;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new w.b(loader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.j.d(loader, "loader");
            w.b bVar = new w.b(loader);
            int a3 = x.e.a();
            return a3 >= 2 ? new C.d(a2) : a3 == 1 ? new C.c(a2, bVar) : new C.a();
        } catch (Throwable unused) {
            g gVar = g.f19a;
            return null;
        }
    }
}
