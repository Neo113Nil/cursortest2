package P;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class t0 extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsController f5108d;

    /* renamed from: e, reason: collision with root package name */
    public final Window f5109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Window window) {
        super(12);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f5108d = insetsController;
        this.f5109e = window;
    }

    @Override // p3.f
    public final void W(boolean z4) {
        Window window = this.f5109e;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f5108d.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f5108d.setSystemBarsAppearance(0, 16);
    }

    @Override // p3.f
    public final void X(boolean z4) {
        Window window = this.f5109e;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f5108d.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f5108d.setSystemBarsAppearance(0, 8);
    }
}
