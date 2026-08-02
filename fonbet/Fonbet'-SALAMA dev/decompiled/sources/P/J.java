package P;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class J {
    public static q0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q0 g3 = q0.g(rootWindowInsets, null);
        p0 p0Var = g3.f5101a;
        p0Var.m(g3);
        p0Var.d(view.getRootView());
        return g3;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i7) {
        view.setScrollIndicators(i7);
    }

    public static void d(View view, int i7, int i8) {
        view.setScrollIndicators(i7, i8);
    }
}
