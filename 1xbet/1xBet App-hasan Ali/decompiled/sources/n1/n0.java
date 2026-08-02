package n1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class n0 extends N4.b {
    public final WindowInsetsController f;

    /* renamed from: g, reason: collision with root package name */
    public final Window f18445g;

    public n0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f = insetsController;
        this.f18445g = window;
    }

    @Override // N4.b
    public void O(boolean z3) {
        l0(16, 16, z3);
    }

    @Override // N4.b
    public void P(boolean z3) {
        l0(8192, 8, z3);
    }

    public final void l0(int i, int i5, boolean z3) {
        Window window = this.f18445g;
        if (window == null) {
            if (z3) {
                this.f.setSystemBarsAppearance(i5, i5);
                return;
            } else {
                this.f.setSystemBarsAppearance(0, i5);
                return;
            }
        }
        if (z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
