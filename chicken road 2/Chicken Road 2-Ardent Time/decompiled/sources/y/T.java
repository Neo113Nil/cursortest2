package y;

/* loaded from: classes.dex */
public final class T extends y.S {
    @Override // a.AbstractC0059a
    public final void x(boolean z2) {
        android.view.Window window = this.f8449a;
        if (!z2) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
