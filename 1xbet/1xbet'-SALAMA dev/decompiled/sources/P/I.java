package P;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static q0 b(View view, q0 q0Var, Rect rect) {
        WindowInsets windowInsetsF = q0Var.f();
        if (windowInsetsF != null) {
            return q0.g(view.computeSystemWindowInsets(windowInsetsF, rect), view);
        }
        rect.setEmpty();
        return q0Var;
    }

    public static boolean c(View view, float f7, float f8, boolean z4) {
        return view.dispatchNestedFling(f7, f8, z4);
    }

    public static boolean d(View view, float f7, float f8) {
        return view.dispatchNestedPreFling(f7, f8);
    }

    public static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
    }

    public static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static q0 j(View view) {
        i0 g0Var;
        if (!e0.f5054d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = e0.f5051a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) e0.f5052b.get(obj);
            Rect rect2 = (Rect) e0.f5053c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                g0Var = new h0();
            } else {
                g0Var = i7 >= 29 ? new g0() : new f0();
            }
            g0Var.c(I.c.a(rect.left, rect.top, rect.right, rect.bottom));
            g0Var.d(I.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            q0 q0VarB = g0Var.b();
            q0VarB.f5101a.m(q0VarB);
            q0VarB.f5101a.d(view.getRootView());
            return q0VarB;
        } catch (IllegalAccessException e7) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f7) {
        view.setElevation(f7);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, InterfaceC0365v interfaceC0365v) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0365v);
        }
        if (interfaceC0365v == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new H(view, interfaceC0365v));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f7) {
        view.setTranslationZ(f7);
    }

    public static void x(View view, float f7) {
        view.setZ(f7);
    }

    public static boolean y(View view, int i7) {
        return view.startNestedScroll(i7);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
