package m;

import a.AbstractC0018a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class v extends AbstractC0018a {

    /* renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f883f;

    /* renamed from: g, reason: collision with root package name */
    public final Window f884g;

    public v(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f883f = insetsController;
        this.f884g = window;
    }

    @Override // a.AbstractC0018a
    public final void y(boolean z2) {
        Window window = this.f884g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f883f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f883f.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0018a
    public final void z(boolean z2) {
        Window window = this.f884g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f883f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f883f.setSystemBarsAppearance(0, 8);
    }
}
