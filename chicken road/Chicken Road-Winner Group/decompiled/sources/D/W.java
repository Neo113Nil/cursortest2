package D;

import a.AbstractC0086a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class W extends AbstractC0086a {

    /* renamed from: b, reason: collision with root package name */
    public final Window f224b;

    public W(Window window) {
        this.f224b = window;
    }

    @Override // a.AbstractC0086a
    public final void V(boolean z3) {
        Window window = this.f224b;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
