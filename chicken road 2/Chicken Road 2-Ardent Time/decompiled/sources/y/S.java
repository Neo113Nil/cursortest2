package y;

/* loaded from: classes.dex */
public class S extends a.AbstractC0059a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Window f8449a;

    public S(android.view.Window window) {
        this.f8449a = window;
    }

    @Override // a.AbstractC0059a
    public final void y(boolean z2) {
        android.view.Window window = this.f8449a;
        if (!z2) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
