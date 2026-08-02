package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import n1.l0;
import n1.m0;
import n1.n0;
import n1.o0;

/* loaded from: classes.dex */
public class r extends q {
    @Override // c.p, c.u
    public void b(C0521H c0521h, C0521H c0521h2, Window window, View view, boolean z3, boolean z5) {
        kotlin.jvm.internal.l.f("statusBarStyle", c0521h);
        kotlin.jvm.internal.l.f("navigationBarStyle", c0521h2);
        kotlin.jvm.internal.l.f("window", window);
        kotlin.jvm.internal.l.f("view", view);
        G4.d.K(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        N4.b o0Var = i >= 35 ? new o0(window) : i >= 30 ? new n0(window) : i >= 26 ? new m0(window) : new l0(window);
        o0Var.P(!z3);
        o0Var.O(!z5);
    }
}
