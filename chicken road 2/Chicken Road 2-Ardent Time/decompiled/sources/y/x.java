package y;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Field f8478a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8479b = false;

    static {
        new java.util.WeakHashMap();
    }

    public static void a(android.view.ViewGroup viewGroup, y.C1014b c1014b) {
        android.view.View.AccessibilityDelegate accessibilityDelegate;
        if (c1014b == null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = y.AbstractC1032u.a(viewGroup);
            } else {
                if (!f8479b) {
                    if (f8478a == null) {
                        try {
                            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                            f8478a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (java.lang.Throwable unused) {
                            f8479b = true;
                        }
                    }
                    try {
                        java.lang.Object obj = f8478a.get(viewGroup);
                        if (obj instanceof android.view.View.AccessibilityDelegate) {
                            accessibilityDelegate = (android.view.View.AccessibilityDelegate) obj;
                        }
                    } catch (java.lang.Throwable unused2) {
                        f8479b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof y.C1013a) {
                c1014b = new y.C1014b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c1014b != null ? c1014b.f8455b : null);
    }
}
