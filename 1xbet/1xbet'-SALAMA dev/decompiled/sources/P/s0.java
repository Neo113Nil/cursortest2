package P;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r0 {
    @Override // p113p3.f
    public final void W(boolean z4) {
        Window window = this.f5107d;
        if (!z4) {
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
