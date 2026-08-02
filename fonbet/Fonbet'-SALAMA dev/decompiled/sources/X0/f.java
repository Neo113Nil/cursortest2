package X0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class f extends t6.i implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7441a = new f(0);

    @Override // s6.a
    public final Object invoke() {
        WindowLayoutComponent a2;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new C1719l1(classLoader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            t6.h.d(classLoader, "loader");
            C1719l1 c1719l1 = new C1719l1(classLoader);
            int a4 = U0.e.a();
            return a4 >= 2 ? new Z0.d(a2) : a4 == 1 ? new Z0.c(a2, c1719l1) : new Z0.a();
        } catch (Throwable unused) {
            g gVar = g.f7442a;
            return null;
        }
    }
}
