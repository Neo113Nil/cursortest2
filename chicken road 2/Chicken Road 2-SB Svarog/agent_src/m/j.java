package m;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import i.C0040a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j extends p {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f864h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f865i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f866j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f867k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f868l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f869c;

    /* renamed from: d, reason: collision with root package name */
    public C0040a[] f870d;

    /* renamed from: e, reason: collision with root package name */
    public C0040a f871e;

    /* renamed from: f, reason: collision with root package name */
    public r f872f;

    /* renamed from: g, reason: collision with root package name */
    public C0040a f873g;

    public j(r rVar, WindowInsets windowInsets) {
        super(rVar);
        this.f871e = null;
        this.f869c = windowInsets;
    }

    private C0040a r() {
        r rVar = this.f872f;
        return rVar != null ? rVar.f881a.g() : C0040a.f550e;
    }

    private C0040a s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f864h) {
            u();
        }
        Method method = f865i;
        if (method != null && f866j != null && f867k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f867k.get(f868l.get(invoke));
                if (rect != null) {
                    return C0040a.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f865i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f866j = cls;
            f867k = cls.getDeclaredField("mVisibleInsets");
            f868l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f867k.setAccessible(true);
            f868l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f864h = true;
    }

    @Override // m.p
    public void d(View view) {
        C0040a s2 = s(view);
        if (s2 == null) {
            s2 = C0040a.f550e;
        }
        v(s2);
    }

    @Override // m.p
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f873g, ((j) obj).f873g);
        }
        return false;
    }

    @Override // m.p
    public final C0040a i() {
        if (this.f871e == null) {
            WindowInsets windowInsets = this.f869c;
            this.f871e = C0040a.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f871e;
    }

    @Override // m.p
    public boolean l() {
        return this.f869c.isRound();
    }

    @Override // m.p
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // m.p
    public void n(C0040a[] c0040aArr) {
        this.f870d = c0040aArr;
    }

    @Override // m.p
    public void o(r rVar) {
        this.f872f = rVar;
    }

    public C0040a q(int i2, boolean z2) {
        C0040a g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0040a.a(0, Math.max(r().f552b, i().f552b), 0, 0) : C0040a.a(0, i().f552b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0040a r2 = r();
                C0040a g3 = g();
                return C0040a.a(Math.max(r2.f551a, g3.f551a), 0, Math.max(r2.f553c, g3.f553c), Math.max(r2.f554d, g3.f554d));
            }
            C0040a i4 = i();
            r rVar = this.f872f;
            g2 = rVar != null ? rVar.f881a.g() : null;
            int i5 = i4.f554d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f554d);
            }
            return C0040a.a(i4.f551a, 0, i4.f553c, i5);
        }
        C0040a c0040a = C0040a.f550e;
        if (i2 == 8) {
            C0040a[] c0040aArr = this.f870d;
            g2 = c0040aArr != null ? c0040aArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0040a i6 = i();
            C0040a r3 = r();
            int i7 = i6.f554d;
            if (i7 > r3.f554d) {
                return C0040a.a(0, 0, 0, i7);
            }
            C0040a c0040a2 = this.f873g;
            if (c0040a2 != null && !c0040a2.equals(c0040a) && (i3 = this.f873g.f554d) > r3.f554d) {
                return C0040a.a(0, 0, 0, i3);
            }
        } else {
            if (i2 == 16) {
                return h();
            }
            if (i2 == 32) {
                return f();
            }
            if (i2 == 64) {
                return j();
            }
            if (i2 == 128) {
                r rVar2 = this.f872f;
                b e2 = rVar2 != null ? rVar2.f881a.e() : e();
                if (e2 != null) {
                    int i8 = Build.VERSION.SDK_INT;
                    return C0040a.a(i8 >= 28 ? AbstractC0043a.d(e2.f856a) : 0, i8 >= 28 ? AbstractC0043a.f(e2.f856a) : 0, i8 >= 28 ? AbstractC0043a.e(e2.f856a) : 0, i8 >= 28 ? AbstractC0043a.c(e2.f856a) : 0);
                }
            }
        }
        return c0040a;
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
        return !q(i2, false).equals(C0040a.f550e);
    }

    public void v(C0040a c0040a) {
        this.f873g = c0040a;
    }
}
