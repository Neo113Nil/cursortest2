package n1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import g1.C1968b;

/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: w, reason: collision with root package name */
    public static final k0 f18427w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f18427w = k0.c(null, windowInsets);
    }

    public d0(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var, windowInsets);
    }

    @Override // n1.Z, n1.h0
    public C1968b i(int i) {
        Insets insets;
        insets = this.f18402c.getInsets(i0.a(i));
        return C1968b.c(insets);
    }

    @Override // n1.Z, n1.h0
    public C1968b j(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f18402c.getInsetsIgnoringVisibility(i0.a(i));
        return C1968b.c(insetsIgnoringVisibility);
    }

    @Override // n1.Z, n1.h0
    public boolean u(int i) {
        boolean isVisible;
        isVisible = this.f18402c.isVisible(i0.a(i));
        return isVisible;
    }

    public d0(k0 k0Var, d0 d0Var) {
        super(k0Var, d0Var);
    }

    @Override // n1.Z, n1.h0
    public final void d(View view) {
    }
}
