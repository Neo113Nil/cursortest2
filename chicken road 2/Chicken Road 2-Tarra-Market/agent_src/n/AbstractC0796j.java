package n;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j.C0774a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0796j extends C0802p {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f6154h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f6155i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f6156j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f6157k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f6158l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f6159c;

    /* renamed from: d, reason: collision with root package name */
    public C0774a[] f6160d;

    /* renamed from: e, reason: collision with root package name */
    public C0774a f6161e;

    /* renamed from: f, reason: collision with root package name */
    public r f6162f;

    /* renamed from: g, reason: collision with root package name */
    public C0774a f6163g;

    public AbstractC0796j(r rVar, WindowInsets windowInsets) {
        super(rVar);
        this.f6161e = null;
        this.f6159c = windowInsets;
    }

    private C0774a r() {
        r rVar = this.f6162f;
        return rVar != null ? rVar.f6171a.g() : C0774a.f6044e;
    }

    private C0774a s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f6154h) {
            u();
        }
        Method method = f6155i;
        if (method != null && f6156j != null && f6157k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6157k.get(f6158l.get(invoke));
                if (rect != null) {
                    return C0774a.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f6155i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6156j = cls;
            f6157k = cls.getDeclaredField("mVisibleInsets");
            f6158l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6157k.setAccessible(true);
            f6158l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f6154h = true;
    }

    @Override // n.C0802p
    public void d(View view) {
        C0774a s2 = s(view);
        if (s2 == null) {
            s2 = C0774a.f6044e;
        }
        v(s2);
    }

    @Override // n.C0802p
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f6163g, ((AbstractC0796j) obj).f6163g);
        }
        return false;
    }

    @Override // n.C0802p
    public final C0774a i() {
        if (this.f6161e == null) {
            WindowInsets windowInsets = this.f6159c;
            this.f6161e = C0774a.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6161e;
    }

    @Override // n.C0802p
    public boolean l() {
        return this.f6159c.isRound();
    }

    @Override // n.C0802p
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // n.C0802p
    public void n(C0774a[] c0774aArr) {
        this.f6160d = c0774aArr;
    }

    @Override // n.C0802p
    public void o(r rVar) {
        this.f6162f = rVar;
    }

    public C0774a q(int i2, boolean z2) {
        C0774a g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0774a.a(0, Math.max(r().f6046b, i().f6046b), 0, 0) : C0774a.a(0, i().f6046b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0774a r2 = r();
                C0774a g3 = g();
                return C0774a.a(Math.max(r2.f6045a, g3.f6045a), 0, Math.max(r2.f6047c, g3.f6047c), Math.max(r2.f6048d, g3.f6048d));
            }
            C0774a i4 = i();
            r rVar = this.f6162f;
            g2 = rVar != null ? rVar.f6171a.g() : null;
            int i5 = i4.f6048d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f6048d);
            }
            return C0774a.a(i4.f6045a, 0, i4.f6047c, i5);
        }
        C0774a c0774a = C0774a.f6044e;
        if (i2 == 8) {
            C0774a[] c0774aArr = this.f6160d;
            g2 = c0774aArr != null ? c0774aArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0774a i6 = i();
            C0774a r3 = r();
            int i7 = i6.f6048d;
            if (i7 > r3.f6048d) {
                return C0774a.a(0, 0, 0, i7);
            }
            C0774a c0774a2 = this.f6163g;
            return (c0774a2 == null || c0774a2.equals(c0774a) || (i3 = this.f6163g.f6048d) <= r3.f6048d) ? c0774a : C0774a.a(0, 0, 0, i3);
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
            return c0774a;
        }
        r rVar2 = this.f6162f;
        C0788b e2 = rVar2 != null ? rVar2.f6171a.e() : e();
        if (e2 == null) {
            return c0774a;
        }
        int i8 = Build.VERSION.SDK_INT;
        return C0774a.a(i8 >= 28 ? AbstractC0787a.d(e2.f6146a) : 0, i8 >= 28 ? AbstractC0787a.f(e2.f6146a) : 0, i8 >= 28 ? AbstractC0787a.e(e2.f6146a) : 0, i8 >= 28 ? AbstractC0787a.c(e2.f6146a) : 0);
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
        return !q(i2, false).equals(C0774a.f6044e);
    }

    public void v(C0774a c0774a) {
        this.f6163g = c0774a;
    }
}
