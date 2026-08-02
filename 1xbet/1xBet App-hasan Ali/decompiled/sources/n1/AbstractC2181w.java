package n1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import game.betting133.sports1xbet.R;

/* renamed from: n1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2181w {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static k0 b(View view, k0 k0Var, Rect rect) {
        WindowInsets b3 = k0Var.b();
        if (b3 != null) {
            return k0.c(view, view.computeSystemWindowInsets(b3, rect));
        }
        rect.setEmpty();
        return k0Var;
    }

    public static void c(View view, InterfaceC2168i interfaceC2168i) {
        ViewOnApplyWindowInsetsListenerC2180v viewOnApplyWindowInsetsListenerC2180v = interfaceC2168i != null ? new ViewOnApplyWindowInsetsListenerC2180v(view, interfaceC2168i) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC2180v);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC2180v != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2180v);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
