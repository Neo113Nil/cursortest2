package n;

import a.AbstractC0009a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class v extends AbstractC0009a {

    /* renamed from: j, reason: collision with root package name */
    public final WindowInsetsController f6173j;

    /* renamed from: k, reason: collision with root package name */
    public final Window f6174k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Window window) {
        super(20);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f6173j = insetsController;
        this.f6174k = window;
    }

    @Override // a.AbstractC0009a
    public final void D(boolean z2) {
        Window window = this.f6174k;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f6173j.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f6173j.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0009a
    public final void E(boolean z2) {
        Window window = this.f6174k;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f6173j.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f6173j.setSystemBarsAppearance(0, 8);
    }
}
