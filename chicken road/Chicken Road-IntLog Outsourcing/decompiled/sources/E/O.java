package E;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import x.C1528c;

/* loaded from: classes.dex */
public final class O extends T {

    /* renamed from: c, reason: collision with root package name */
    public static Field f573c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f574d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f575e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f576f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f577a = e();

    /* renamed from: b, reason: collision with root package name */
    public C1528c f578b;

    private static WindowInsets e() {
        if (!f574d) {
            try {
                f573c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f574d = true;
        }
        Field field = f573c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e6);
            }
        }
        if (!f576f) {
            try {
                f575e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
            }
            f576f = true;
        }
        Constructor constructor = f575e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e8);
            }
        }
        return null;
    }

    @Override // E.T
    public b0 b() {
        a();
        b0 a6 = b0.a(this.f577a, null);
        Z z = a6.f601a;
        z.n(null);
        z.p(this.f578b);
        return a6;
    }

    @Override // E.T
    public void c(C1528c c1528c) {
        this.f578b = c1528c;
    }

    @Override // E.T
    public void d(C1528c c1528c) {
        WindowInsets windowInsets = this.f577a;
        if (windowInsets != null) {
            this.f577a = windowInsets.replaceSystemWindowInsets(c1528c.f12232a, c1528c.f12233b, c1528c.f12234c, c1528c.f12235d);
        }
    }
}
