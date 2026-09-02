package m;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f878q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r.a(null, windowInsets);
    }

    public o(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
    }

    @Override // m.j, m.p
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f869c.isVisible(q.a(i2));
        return isVisible;
    }

    @Override // m.j, m.p
    public final void d(View view) {
    }
}
