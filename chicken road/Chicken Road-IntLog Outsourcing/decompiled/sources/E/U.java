package E;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import x.C1528c;

/* loaded from: classes.dex */
public abstract class U extends Z {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f580h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f581i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f582j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f583k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f584l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f585c;

    /* renamed from: d, reason: collision with root package name */
    public C1528c[] f586d;

    /* renamed from: e, reason: collision with root package name */
    public C1528c f587e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f588f;

    /* renamed from: g, reason: collision with root package name */
    public C1528c f589g;

    public U(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var);
        this.f587e = null;
        this.f585c = windowInsets;
    }

    private C1528c r() {
        b0 b0Var = this.f588f;
        return b0Var != null ? b0Var.f601a.g() : C1528c.f12231e;
    }

    private C1528c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f580h) {
            u();
        }
        Method method = f581i;
        if (method != null && f582j != null && f583k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f583k.get(f584l.get(invoke));
                if (rect != null) {
                    return C1528c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f581i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f582j = cls;
            f583k = cls.getDeclaredField("mVisibleInsets");
            f584l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f583k.setAccessible(true);
            f584l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f580h = true;
    }

    @Override // E.Z
    public void d(View view) {
        C1528c s2 = s(view);
        if (s2 == null) {
            s2 = C1528c.f12231e;
        }
        v(s2);
    }

    @Override // E.Z
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f589g, ((U) obj).f589g);
        }
        return false;
    }

    @Override // E.Z
    public final C1528c i() {
        if (this.f587e == null) {
            WindowInsets windowInsets = this.f585c;
            this.f587e = C1528c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f587e;
    }

    @Override // E.Z
    public boolean l() {
        return this.f585c.isRound();
    }

    @Override // E.Z
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // E.Z
    public void n(C1528c[] c1528cArr) {
        this.f586d = c1528cArr;
    }

    @Override // E.Z
    public void o(b0 b0Var) {
        this.f588f = b0Var;
    }

    public C1528c q(int i2, boolean z) {
        C1528c g6;
        int i3;
        if (i2 == 1) {
            return z ? C1528c.a(0, Math.max(r().f12233b, i().f12233b), 0, 0) : C1528c.a(0, i().f12233b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                C1528c r5 = r();
                C1528c g7 = g();
                return C1528c.a(Math.max(r5.f12232a, g7.f12232a), 0, Math.max(r5.f12234c, g7.f12234c), Math.max(r5.f12235d, g7.f12235d));
            }
            C1528c i6 = i();
            b0 b0Var = this.f588f;
            g6 = b0Var != null ? b0Var.f601a.g() : null;
            int i7 = i6.f12235d;
            if (g6 != null) {
                i7 = Math.min(i7, g6.f12235d);
            }
            return C1528c.a(i6.f12232a, 0, i6.f12234c, i7);
        }
        C1528c c1528c = C1528c.f12231e;
        if (i2 == 8) {
            C1528c[] c1528cArr = this.f586d;
            g6 = c1528cArr != null ? c1528cArr[3] : null;
            if (g6 != null) {
                return g6;
            }
            C1528c i8 = i();
            C1528c r6 = r();
            int i9 = i8.f12235d;
            if (i9 > r6.f12235d) {
                return C1528c.a(0, 0, 0, i9);
            }
            C1528c c1528c2 = this.f589g;
            return (c1528c2 == null || c1528c2.equals(c1528c) || (i3 = this.f589g.f12235d) <= r6.f12235d) ? c1528c : C1528c.a(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return h();
        }
        if (i2 == 32) {
            return f();
        }
        if (i2 == 64) {
            return j();
        }
        if (i2 != 128) {
            return c1528c;
        }
        b0 b0Var2 = this.f588f;
        C0031f e3 = b0Var2 != null ? b0Var2.f601a.e() : e();
        if (e3 == null) {
            return c1528c;
        }
        int i10 = Build.VERSION.SDK_INT;
        return C1528c.a(i10 >= 28 ? AbstractC0030e.d(e3.f614a) : 0, i10 >= 28 ? AbstractC0030e.f(e3.f614a) : 0, i10 >= 28 ? AbstractC0030e.e(e3.f614a) : 0, i10 >= 28 ? AbstractC0030e.c(e3.f614a) : 0);
    }

    public boolean t(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !q(i2, false).equals(C1528c.f12231e);
    }

    public void v(C1528c c1528c) {
        this.f589g = c1528c;
    }
}
