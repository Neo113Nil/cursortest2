package m;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class c {
    public static r a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        r a2 = r.a(null, rootWindowInsets);
        p pVar = a2.f881a;
        pVar.o(a2);
        pVar.d(view.getRootView());
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
