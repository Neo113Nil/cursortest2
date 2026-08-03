package y;

/* renamed from: y.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1028p {
    public static void a(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static y.Q b(android.view.View view, y.Q q2, android.graphics.Rect rect) {
        y.O o2 = q2.f8448a;
        android.view.WindowInsets windowInsets = o2 instanceof y.J ? ((y.J) o2).f8436c : null;
        if (windowInsets != null) {
            return y.Q.a(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return q2;
    }

    public static boolean c(android.view.View view, float f2, float f3, boolean z2) {
        return view.dispatchNestedFling(f2, f3, z2);
    }

    public static boolean d(android.view.View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    public static boolean e(android.view.View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    public static boolean f(android.view.View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    public static android.content.res.ColorStateList g(android.view.View view) {
        return view.getBackgroundTintList();
    }

    public static android.graphics.PorterDuff.Mode h(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(android.view.View view) {
        return view.getElevation();
    }

    public static y.Q j(android.view.View view) {
        if (!y.E.f8423d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            java.lang.Object obj = y.E.f8420a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            android.graphics.Rect rect = (android.graphics.Rect) y.E.f8421b.get(obj);
            android.graphics.Rect rect2 = (android.graphics.Rect) y.E.f8422c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = android.os.Build.VERSION.SDK_INT;
            y.I h2 = i2 >= 30 ? new y.H() : i2 >= 29 ? new y.G() : new y.F();
            h2.c(r.c.a(rect.left, rect.top, rect.right, rect.bottom));
            h2.d(r.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            y.Q b2 = h2.b();
            b2.f8448a.o(b2);
            b2.f8448a.d(view.getRootView());
            return b2;
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    public static java.lang.String k(android.view.View view) {
        return view.getTransitionName();
    }

    public static float l(android.view.View view) {
        return view.getTranslationZ();
    }

    public static float m(android.view.View view) {
        return view.getZ();
    }

    public static boolean n(android.view.View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(android.view.View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(android.view.View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(android.view.View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(android.view.View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    public static void u(android.view.View view, y.InterfaceC1022j interfaceC1022j) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(com.watchfacestudio.huasi_urx110.R.id.tag_on_apply_window_listener, interfaceC1022j);
        }
        if (interfaceC1022j == null) {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new y.ViewOnApplyWindowInsetsListenerC1027o(view, interfaceC1022j));
        }
    }

    public static void v(android.view.View view, java.lang.String str) {
        view.setTransitionName(str);
    }

    public static void w(android.view.View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(android.view.View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(android.view.View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(android.view.View view) {
        view.stopNestedScroll();
    }
}
