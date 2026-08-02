package n1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: n1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2182x {
    public static k0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        k0 c5 = k0.c(null, rootWindowInsets);
        h0 h0Var = c5.f18442a;
        h0Var.y(c5);
        View rootView = view.getRootView();
        h0Var.d(rootView);
        h0Var.p(rootView);
        h0Var.q();
        return c5;
    }
}
