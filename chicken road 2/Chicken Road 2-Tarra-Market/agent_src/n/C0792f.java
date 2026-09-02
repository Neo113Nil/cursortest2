package n;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792f extends AbstractC0795i {

    /* renamed from: b, reason: collision with root package name */
    public static Field f6148b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f6149c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f6150d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f6151e = false;

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f6152a = c();

    private static WindowInsets c() {
        if (!f6149c) {
            try {
                f6148b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f6149c = true;
        }
        Field field = f6148b;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f6151e) {
            try {
                f6150d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f6151e = true;
        }
        Constructor constructor = f6150d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // n.AbstractC0795i
    public r b() {
        a();
        r a2 = r.a(null, this.f6152a);
        C0802p c0802p = a2.f6171a;
        c0802p.n(null);
        c0802p.p(null);
        return a2;
    }
}
