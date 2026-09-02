package h;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f3264a;

    static {
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            f3264a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(android.view.View view) {
        java.lang.reflect.Field field = y.x.f8478a;
        return view.getLayoutDirection() == 1;
    }
}
