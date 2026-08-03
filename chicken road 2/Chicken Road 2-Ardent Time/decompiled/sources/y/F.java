package y;

/* loaded from: classes.dex */
public final class F extends y.I {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f8424c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8425d = false;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Constructor f8426e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f8427f = false;

    /* renamed from: a, reason: collision with root package name */
    public android.view.WindowInsets f8428a = e();

    /* renamed from: b, reason: collision with root package name */
    public r.c f8429b;

    private static android.view.WindowInsets e() {
        if (!f8425d) {
            try {
                f8424c = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException e2) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f8425d = true;
        }
        java.lang.reflect.Field field = f8424c;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException e3) {
                android.util.Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f8427f) {
            try {
                f8426e = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException e4) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f8427f = true;
        }
        java.lang.reflect.Constructor constructor = f8426e;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException e5) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // y.I
    public y.Q b() {
        a();
        y.Q a2 = y.Q.a(this.f8428a, null);
        y.O o2 = a2.f8448a;
        o2.n(null);
        o2.p(this.f8429b);
        return a2;
    }

    @Override // y.I
    public void c(r.c cVar) {
        this.f8429b = cVar;
    }

    @Override // y.I
    public void d(r.c cVar) {
        android.view.WindowInsets windowInsets = this.f8428a;
        if (windowInsets != null) {
            this.f8428a = windowInsets.replaceSystemWindowInsets(cVar.f8326a, cVar.f8327b, cVar.f8328c, cVar.f8329d);
        }
    }
}
