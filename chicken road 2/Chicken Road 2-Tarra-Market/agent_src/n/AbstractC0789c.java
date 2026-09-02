package n;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0789c {
    public static r a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        r a2 = r.a(null, rootWindowInsets);
        C0802p c0802p = a2.f6171a;
        c0802p.o(a2);
        c0802p.d(view.getRootView());
        return a2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
