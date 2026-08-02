package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import n1.l0;
import n1.m0;
import n1.n0;
import n1.o0;

/* loaded from: classes.dex */
public final class o extends u {
    @Override // c.u
    public void b(C0521H c0521h, C0521H c0521h2, Window window, View view, boolean z3, boolean z5) {
        kotlin.jvm.internal.l.f("statusBarStyle", c0521h);
        kotlin.jvm.internal.l.f("navigationBarStyle", c0521h2);
        kotlin.jvm.internal.l.f("window", window);
        kotlin.jvm.internal.l.f("view", view);
        G4.d.K(window, false);
        window.setStatusBarColor(z3 ? c0521h.f7310b : c0521h.f7309a);
        window.setNavigationBarColor(c0521h2.f7310b);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new o0(window) : i >= 30 ? new n0(window) : i >= 26 ? new m0(window) : new l0(window)).P(!z3);
    }
}
