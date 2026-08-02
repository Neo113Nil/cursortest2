package n1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class l0 extends N4.b {
    public final Window f;

    public l0(Window window) {
        this.f = window;
    }

    @Override // N4.b
    public final void P(boolean z3) {
        Window window = this.f;
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
