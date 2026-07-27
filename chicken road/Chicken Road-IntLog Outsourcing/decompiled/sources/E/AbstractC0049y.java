package E;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: E.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0049y {
    public static b0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        b0 a6 = b0.a(rootWindowInsets, null);
        Z z = a6.f601a;
        z.o(a6);
        z.d(view.getRootView());
        return a6;
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
