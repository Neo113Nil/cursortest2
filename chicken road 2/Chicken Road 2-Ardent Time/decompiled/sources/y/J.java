package y;

/* loaded from: classes.dex */
public abstract class J extends y.O {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f8431h = false;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f8432i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Class f8433j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.reflect.Field f8434k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.reflect.Field f8435l;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets f8436c;

    /* renamed from: d, reason: collision with root package name */
    public r.c[] f8437d;

    /* renamed from: e, reason: collision with root package name */
    public r.c f8438e;

    /* renamed from: f, reason: collision with root package name */
    public y.Q f8439f;

    /* renamed from: g, reason: collision with root package name */
    public r.c f8440g;

    public J(y.Q q2, android.view.WindowInsets windowInsets) {
        super(q2);
        this.f8438e = null;
        this.f8436c = windowInsets;
    }

    private r.c r() {
        y.Q q2 = this.f8439f;
        return q2 != null ? q2.f8448a.g() : r.c.f8325e;
    }

    private r.c s(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f8431h) {
            u();
        }
        java.lang.reflect.Method method = f8432i;
        if (method != null && f8433j != null && f8434k != null) {
            try {
                java.lang.Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) f8434k.get(f8435l.get(invoke));
                if (rect != null) {
                    return r.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e2) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private static void u() {
        try {
            f8432i = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            f8433j = cls;
            f8434k = cls.getDeclaredField("mVisibleInsets");
            f8435l = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f8434k.setAccessible(true);
            f8435l.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e2) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f8431h = true;
    }

    @Override // y.O
    public void d(android.view.View view) {
        r.c s2 = s(view);
        if (s2 == null) {
            s2 = r.c.f8325e;
        }
        v(s2);
    }

    @Override // y.O
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return java.util.Objects.equals(this.f8440g, ((y.J) obj).f8440g);
        }
        return false;
    }

    @Override // y.O
    public final r.c i() {
        if (this.f8438e == null) {
            android.view.WindowInsets windowInsets = this.f8436c;
            this.f8438e = r.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f8438e;
    }

    @Override // y.O
    public boolean l() {
        return this.f8436c.isRound();
    }

    @Override // y.O
    @android.annotation.SuppressLint({"WrongConstant"})
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // y.O
    public void n(r.c[] cVarArr) {
        this.f8437d = cVarArr;
    }

    @Override // y.O
    public void o(y.Q q2) {
        this.f8439f = q2;
    }

    public r.c q(int i2, boolean z2) {
        r.c g2;
        int i3;
        if (i2 == 1) {
            return z2 ? r.c.a(0, java.lang.Math.max(r().f8327b, i().f8327b), 0, 0) : r.c.a(0, i().f8327b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                r.c r2 = r();
                r.c g3 = g();
                return r.c.a(java.lang.Math.max(r2.f8326a, g3.f8326a), 0, java.lang.Math.max(r2.f8328c, g3.f8328c), java.lang.Math.max(r2.f8329d, g3.f8329d));
            }
            r.c i4 = i();
            y.Q q2 = this.f8439f;
            g2 = q2 != null ? q2.f8448a.g() : null;
            int i5 = i4.f8329d;
            if (g2 != null) {
                i5 = java.lang.Math.min(i5, g2.f8329d);
            }
            return r.c.a(i4.f8326a, 0, i4.f8328c, i5);
        }
        r.c cVar = r.c.f8325e;
        if (i2 == 8) {
            r.c[] cVarArr = this.f8437d;
            g2 = cVarArr != null ? cVarArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            r.c i6 = i();
            r.c r3 = r();
            int i7 = i6.f8329d;
            if (i7 > r3.f8329d) {
                return r.c.a(0, 0, 0, i7);
            }
            r.c cVar2 = this.f8440g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f8440g.f8329d) <= r3.f8329d) ? cVar : r.c.a(0, 0, 0, i3);
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
            return cVar;
        }
        y.Q q3 = this.f8439f;
        y.C1017e e2 = q3 != null ? q3.f8448a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        int i8 = android.os.Build.VERSION.SDK_INT;
        return r.c.a(i8 >= 28 ? y.AbstractC1016d.d(e2.f8464a) : 0, i8 >= 28 ? y.AbstractC1016d.f(e2.f8464a) : 0, i8 >= 28 ? y.AbstractC1016d.e(e2.f8464a) : 0, i8 >= 28 ? y.AbstractC1016d.c(e2.f8464a) : 0);
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
        return !q(i2, false).equals(r.c.f8325e);
    }

    public void v(r.c cVar) {
        this.f8440g = cVar;
    }
}
