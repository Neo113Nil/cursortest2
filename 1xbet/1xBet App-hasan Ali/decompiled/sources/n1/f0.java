package n1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import g1.C1968b;

/* loaded from: classes.dex */
public class f0 extends e0 {

    /* renamed from: x, reason: collision with root package name */
    public static final k0 f18432x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f18432x = k0.c(null, windowInsets);
    }

    public f0(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var, windowInsets);
    }

    @Override // n1.d0, n1.Z, n1.h0
    public C1968b i(int i) {
        Insets insets;
        insets = this.f18402c.getInsets(j0.a(i));
        return C1968b.c(insets);
    }

    @Override // n1.d0, n1.Z, n1.h0
    public C1968b j(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f18402c.getInsetsIgnoringVisibility(j0.a(i));
        return C1968b.c(insetsIgnoringVisibility);
    }

    @Override // n1.d0, n1.Z, n1.h0
    public boolean u(int i) {
        boolean isVisible;
        isVisible = this.f18402c.isVisible(j0.a(i));
        return isVisible;
    }

    public f0(k0 k0Var, f0 f0Var) {
        super(k0Var, f0Var);
    }

    @Override // n1.Z, n1.h0
    public void p(View view) {
    }
}
