package n1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import game.betting133.sports1xbet.R;
import java.util.List;

/* loaded from: classes.dex */
public final class J extends N {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f18375e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final A1.a f = new A1.a(A1.a.f602c);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f18376g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f18377h = new AccelerateInterpolator(1.5f);

    public static void f(View view, O o5) {
        AbstractC1674uy k5 = k(view);
        if (k5 != null) {
            k5.a(o5);
            if (k5.f15938k == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), o5);
            }
        }
    }

    public static void g(View view, O o5, k0 k0Var, boolean z3) {
        AbstractC1674uy k5 = k(view);
        if (k5 != null) {
            k5.f15939l = k0Var;
            if (!z3) {
                k5.b(o5);
                z3 = k5.f15938k == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), o5, k0Var, z3);
            }
        }
    }

    public static void h(View view, k0 k0Var, List list) {
        AbstractC1674uy k5 = k(view);
        if (k5 != null) {
            k0Var = k5.c(k0Var, list);
            if (k5.f15938k == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), k0Var, list);
            }
        }
    }

    public static void i(View view, O o5, G.v vVar) {
        AbstractC1674uy k5 = k(view);
        if (k5 != null) {
            k5.d(o5, vVar);
            if (k5.f15938k == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), o5, vVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC1674uy k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof I) {
            return ((I) tag).f18373a;
        }
        return null;
    }
}
