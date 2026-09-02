package m;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public static Field f858b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f859c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f860d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f861e = false;

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f862a = c();

    private static WindowInsets c() {
        if (!f859c) {
            try {
                f858b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f859c = true;
        }
        Field field = f858b;
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
        if (!f861e) {
            try {
                f860d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f861e = true;
        }
        Constructor constructor = f860d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // m.i
    public r b() {
        a();
        r a2 = r.a(null, this.f862a);
        p pVar = a2.f881a;
        pVar.n(null);
        pVar.p(null);
        return a2;
    }
}
