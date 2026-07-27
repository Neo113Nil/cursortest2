package D;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class X extends W {
    @Override // a.AbstractC0086a
    public final void U(boolean z3) {
        Window window = this.f224b;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
