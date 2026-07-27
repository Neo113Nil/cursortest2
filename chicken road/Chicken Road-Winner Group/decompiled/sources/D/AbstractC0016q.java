package D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.chicken.jump.road.pump.R;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0016q {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static V b(View view, V v3, Rect rect) {
        T t3 = v3.f223a;
        WindowInsets windowInsets = t3 instanceof M ? ((M) t3).f212c : null;
        if (windowInsets != null) {
            return V.a(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return v3;
    }

    public static boolean c(View view, float f, float f3, boolean z3) {
        return view.dispatchNestedFling(f, f3, z3);
    }

    public static boolean d(View view, float f, float f3) {
        return view.dispatchNestedPreFling(f, f3);
    }

    public static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
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

    public static V j(View view) {
        if (!G.f200d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = G.f197a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) G.f198b.get(obj);
            Rect rect2 = (Rect) G.f199c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i3 = Build.VERSION.SDK_INT;
            L k3 = i3 >= 30 ? new K() : i3 >= 29 ? new J() : new H();
            k3.c(w.c.a(rect.left, rect.top, rect.right, rect.bottom));
            k3.d(w.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            V b3 = k3.b();
            b3.f223a.o(b3);
            b3.f223a.d(view.getRootView());
            return b3;
        } catch (IllegalAccessException e3) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
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

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, InterfaceC0010k interfaceC0010k) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0010k);
        }
        if (interfaceC0010k == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0015p(view, interfaceC0010k));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i3) {
        return view.startNestedScroll(i3);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
