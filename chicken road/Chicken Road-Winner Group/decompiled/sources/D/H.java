package D;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class H extends L {

    /* renamed from: c, reason: collision with root package name */
    public static Field f201c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f202d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f203e = null;
    public static boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f204a = e();

    /* renamed from: b, reason: collision with root package name */
    public w.c f205b;

    private static WindowInsets e() {
        if (!f202d) {
            try {
                f201c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f202d = true;
        }
        Field field = f201c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f) {
            try {
                f203e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f = true;
        }
        Constructor constructor = f203e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // D.L
    public V b() {
        a();
        V a3 = V.a(this.f204a, null);
        T t3 = a3.f223a;
        t3.n(null);
        t3.p(this.f205b);
        return a3;
    }

    @Override // D.L
    public void c(w.c cVar) {
        this.f205b = cVar;
    }

    @Override // D.L
    public void d(w.c cVar) {
        WindowInsets windowInsets = this.f204a;
        if (windowInsets != null) {
            this.f204a = windowInsets.replaceSystemWindowInsets(cVar.f10434a, cVar.f10435b, cVar.f10436c, cVar.f10437d);
        }
    }
}
