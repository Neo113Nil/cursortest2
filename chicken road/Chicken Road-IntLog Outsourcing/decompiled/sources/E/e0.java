package E;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC1341c {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f612b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Window window) {
        super(3);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f612b = insetsController;
        this.f613c = window;
    }

    @Override // n2.AbstractC1341c
    public final void D(boolean z) {
        Window window = this.f613c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f612b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f612b.setSystemBarsAppearance(0, 16);
    }

    @Override // n2.AbstractC1341c
    public final void E(boolean z) {
        Window window = this.f613c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f612b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f612b.setSystemBarsAppearance(0, 8);
    }
}
