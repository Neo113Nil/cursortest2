package D;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class M extends T {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f207h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f208i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f209j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f210k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f211l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f212c;

    /* renamed from: d, reason: collision with root package name */
    public w.c[] f213d;

    /* renamed from: e, reason: collision with root package name */
    public w.c f214e;
    public V f;

    /* renamed from: g, reason: collision with root package name */
    public w.c f215g;

    public M(V v3, WindowInsets windowInsets) {
        super(v3);
        this.f214e = null;
        this.f212c = windowInsets;
    }

    private w.c r() {
        V v3 = this.f;
        return v3 != null ? v3.f223a.g() : w.c.f10433e;
    }

    private w.c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f207h) {
            u();
        }
        Method method = f208i;
        if (method != null && f209j != null && f210k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f210k.get(f211l.get(invoke));
                if (rect != null) {
                    return w.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f208i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f209j = cls;
            f210k = cls.getDeclaredField("mVisibleInsets");
            f211l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f210k.setAccessible(true);
            f211l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f207h = true;
    }

    @Override // D.T
    public void d(View view) {
        w.c s3 = s(view);
        if (s3 == null) {
            s3 = w.c.f10433e;
        }
        v(s3);
    }

    @Override // D.T
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f215g, ((M) obj).f215g);
        }
        return false;
    }

    @Override // D.T
    public final w.c i() {
        if (this.f214e == null) {
            WindowInsets windowInsets = this.f212c;
            this.f214e = w.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f214e;
    }

    @Override // D.T
    public boolean l() {
        return this.f212c.isRound();
    }

    @Override // D.T
    public boolean m(int i3) {
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0 && !t(i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // D.T
    public void n(w.c[] cVarArr) {
        this.f213d = cVarArr;
    }

    @Override // D.T
    public void o(V v3) {
        this.f = v3;
    }

    public w.c q(int i3, boolean z3) {
        w.c g3;
        int i4;
        if (i3 == 1) {
            return z3 ? w.c.a(0, Math.max(r().f10435b, i().f10435b), 0, 0) : w.c.a(0, i().f10435b, 0, 0);
        }
        if (i3 == 2) {
            if (z3) {
                w.c r3 = r();
                w.c g4 = g();
                return w.c.a(Math.max(r3.f10434a, g4.f10434a), 0, Math.max(r3.f10436c, g4.f10436c), Math.max(r3.f10437d, g4.f10437d));
            }
            w.c i5 = i();
            V v3 = this.f;
            g3 = v3 != null ? v3.f223a.g() : null;
            int i6 = i5.f10437d;
            if (g3 != null) {
                i6 = Math.min(i6, g3.f10437d);
            }
            return w.c.a(i5.f10434a, 0, i5.f10436c, i6);
        }
        w.c cVar = w.c.f10433e;
        if (i3 == 8) {
            w.c[] cVarArr = this.f213d;
            g3 = cVarArr != null ? cVarArr[3] : null;
            if (g3 != null) {
                return g3;
            }
            w.c i7 = i();
            w.c r4 = r();
            int i8 = i7.f10437d;
            if (i8 > r4.f10437d) {
                return w.c.a(0, 0, 0, i8);
            }
            w.c cVar2 = this.f215g;
            if (cVar2 != null && !cVar2.equals(cVar) && (i4 = this.f215g.f10437d) > r4.f10437d) {
                return w.c.a(0, 0, 0, i4);
            }
        } else {
            if (i3 == 16) {
                return h();
            }
            if (i3 == 32) {
                return f();
            }
            if (i3 == 64) {
                return j();
            }
            if (i3 == 128) {
                V v4 = this.f;
                C0004e e3 = v4 != null ? v4.f223a.e() : e();
                if (e3 != null) {
                    int i9 = Build.VERSION.SDK_INT;
                    return w.c.a(i9 >= 28 ? AbstractC0003d.d(e3.f238a) : 0, i9 >= 28 ? AbstractC0003d.f(e3.f238a) : 0, i9 >= 28 ? AbstractC0003d.e(e3.f238a) : 0, i9 >= 28 ? AbstractC0003d.c(e3.f238a) : 0);
                }
            }
        }
        return cVar;
    }

    public boolean t(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !q(i3, false).equals(w.c.f10433e);
    }

    public void v(w.c cVar) {
        this.f215g = cVar;
    }
}
