package D;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class r {
    public static V a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        V a3 = V.a(rootWindowInsets, null);
        T t3 = a3.f223a;
        t3.o(a3);
        t3.d(view.getRootView());
        return a3;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
