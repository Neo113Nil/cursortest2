package D;

import a.AbstractC0086a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class Y extends AbstractC0086a {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f225b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f226c;

    public Y(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f225b = insetsController;
        this.f226c = window;
    }

    @Override // a.AbstractC0086a
    public final void U(boolean z3) {
        Window window = this.f226c;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f225b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f225b.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0086a
    public final void V(boolean z3) {
        Window window = this.f226c;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f225b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f225b.setSystemBarsAppearance(0, 8);
    }
}
