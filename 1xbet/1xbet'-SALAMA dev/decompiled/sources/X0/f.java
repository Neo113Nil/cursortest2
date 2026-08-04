package X0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends t6.i implements s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7441a = new f(0);

    @Override // s6.a
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentA;
        Object cVar;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new C1010l1(classLoader)) : null;
            if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                return null;
            }
            t6.h.d(classLoader, "loader");
            C1010l1 c1010l1 = new C1010l1(classLoader);
            int iA = U0.e.a();
            if (iA >= 2) {
                cVar = new Z0.d(windowLayoutComponentA);
            } else {
                cVar = iA == 1 ? new Z0.c(windowLayoutComponentA, c1010l1) : new Z0.a();
            }
            return cVar;
        } catch (Throwable unused) {
            g gVar = g.f7442a;
            return null;
        }
    }
}
