package y;

/* loaded from: classes.dex */
public final class V extends a.AbstractC0059a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowInsetsController f8450a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.Window f8451b;

    public V(android.view.Window window) {
        android.view.WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f8450a = insetsController;
        this.f8451b = window;
    }

    @Override // a.AbstractC0059a
    public final void x(boolean z2) {
        android.view.Window window = this.f8451b;
        if (z2) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f8450a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f8450a.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0059a
    public final void y(boolean z2) {
        android.view.Window window = this.f8451b;
        if (z2) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f8450a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f8450a.setSystemBarsAppearance(0, 8);
    }
}
