package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uh1 {
    /* JADX INFO: renamed from: a */
    public static void m4919a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ak1 m4920b(View view, ak1 ak1Var, Rect rect) {
        WindowInsets windowInsetsM271a = ak1Var.m271a();
        if (windowInsetsM271a != null) {
            return ak1.m270b(view.computeSystemWindowInsets(windowInsetsM271a, rect), view);
        }
        rect.setEmpty();
        return ak1Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m4921c(View view, xt0 xt0Var) {
        th1 th1Var = xt0Var != null ? new th1(view, xt0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, th1Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (th1Var != null) {
            view.setOnApplyWindowInsetsListener(th1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
