package m;

import a.AbstractC0018a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class s extends AbstractC0018a {

    /* renamed from: f, reason: collision with root package name */
    public final Window f882f;

    public s(Window window) {
        this.f882f = window;
    }

    @Override // a.AbstractC0018a
    public final void z(boolean z2) {
        Window window = this.f882f;
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
