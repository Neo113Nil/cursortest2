package n;

import a.AbstractC0009a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class s extends AbstractC0009a {

    /* renamed from: j, reason: collision with root package name */
    public final Window f6172j;

    public s(Window window) {
        super(20);
        this.f6172j = window;
    }

    @Override // a.AbstractC0009a
    public final void E(boolean z2) {
        Window window = this.f6172j;
        if (!z2) {
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
