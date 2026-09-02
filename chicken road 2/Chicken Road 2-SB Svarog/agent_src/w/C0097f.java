package w;

import androidx.window.extensions.layout.WindowLayoutComponent;
import y.C0100a;
import y.C0102c;
import y.C0103d;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097f extends g0.i implements f0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0097f f1294c = new C0097f(0);

    @Override // f0.a
    public final Object a() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            C0096e c0096e = classLoader != null ? new C0096e(classLoader, new s.b(classLoader)) : null;
            if (c0096e == null || (a2 = c0096e.a()) == null) {
                return null;
            }
            g0.h.d(classLoader, "loader");
            s.b bVar = new s.b(classLoader);
            int a3 = t.e.a();
            return a3 >= 2 ? new C0103d(a2) : a3 == 1 ? new C0102c(a2, bVar) : new C0100a();
        } catch (Throwable unused) {
            C0098g c0098g = C0098g.f1295a;
            return null;
        }
    }
}
