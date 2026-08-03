package y;

/* renamed from: y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1029q {
    public static y.Q a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        y.Q a2 = y.Q.a(rootWindowInsets, null);
        y.O o2 = a2.f8448a;
        o2.o(a2);
        o2.d(view.getRootView());
        return a2;
    }

    public static int b(android.view.View view) {
        return view.getScrollIndicators();
    }

    public static void c(android.view.View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(android.view.View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
