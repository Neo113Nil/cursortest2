package n1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import g1.C1968b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class P extends Y {

    /* renamed from: g, reason: collision with root package name */
    public static Field f18388g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f18389h = false;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f18390j = false;

    /* renamed from: e, reason: collision with root package name */
    public WindowInsets f18391e;
    public C1968b f;

    public P() {
        this.f18391e = j();
    }

    private static WindowInsets j() {
        if (!f18389h) {
            try {
                f18388g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f18389h = true;
        }
        Field field = f18388g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f18390j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f18390j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // n1.Y
    public k0 b() {
        a();
        k0 c5 = k0.c(null, this.f18391e);
        C1968b[] c1968bArr = this.f18394b;
        h0 h0Var = c5.f18442a;
        h0Var.w(c1968bArr);
        h0Var.z(this.f);
        h0Var.v(null);
        h0Var.B(this.f18395c);
        h0Var.C(this.f18396d);
        return c5;
    }

    @Override // n1.Y
    public void f(C1968b c1968b) {
        this.f = c1968b;
    }

    @Override // n1.Y
    public void h(C1968b c1968b) {
        WindowInsets windowInsets = this.f18391e;
        if (windowInsets != null) {
            this.f18391e = windowInsets.replaceSystemWindowInsets(c1968b.f17073a, c1968b.f17074b, c1968b.f17075c, c1968b.f17076d);
        }
    }

    public P(k0 k0Var) {
        super(k0Var);
        this.f18391e = k0Var.b();
    }
}
