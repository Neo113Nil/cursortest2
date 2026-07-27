package E;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class Y extends X {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f594q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        b0.a(windowInsets, null);
    }

    public Y(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var, windowInsets);
    }

    @Override // E.U, E.Z
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f585c.isVisible(a0.a(i2));
        return isVisible;
    }

    @Override // E.U, E.Z
    public final void d(View view) {
    }
}
