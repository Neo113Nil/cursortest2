package E;

import android.view.View;
import android.view.Window;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public class c0 extends AbstractC1341c {

    /* renamed from: b, reason: collision with root package name */
    public final Window f603b;

    public c0(Window window) {
        super(3);
        this.f603b = window;
    }

    @Override // n2.AbstractC1341c
    public final void E(boolean z) {
        Window window = this.f603b;
        if (!z) {
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
