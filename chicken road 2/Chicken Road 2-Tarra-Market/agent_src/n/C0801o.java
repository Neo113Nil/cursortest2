package n;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801o extends C0800n {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f6168q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r.a(null, windowInsets);
    }

    public C0801o(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
    }

    @Override // n.AbstractC0796j, n.C0802p
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f6159c.isVisible(q.a(i2));
        return isVisible;
    }

    @Override // n.AbstractC0796j, n.C0802p
    public final void d(View view) {
    }
}
