package D;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class S extends P {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f220q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        V.a(windowInsets, null);
    }

    public S(V v3, WindowInsets windowInsets) {
        super(v3, windowInsets);
    }

    @Override // D.M, D.T
    public boolean m(int i3) {
        boolean isVisible;
        isVisible = this.f212c.isVisible(U.a(i3));
        return isVisible;
    }

    @Override // D.M, D.T
    public final void d(View view) {
    }
}
