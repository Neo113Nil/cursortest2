package P;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class r0 extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final Window f5107d;

    public r0(Window window) {
        super(12);
        this.f5107d = window;
    }

    @Override // p3.f
    public final void X(boolean z4) {
        Window window = this.f5107d;
        if (!z4) {
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
