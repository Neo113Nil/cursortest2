package n1;

import android.view.WindowInsets;
import g1.C1968b;

/* loaded from: classes.dex */
public class a0 extends Z {

    /* renamed from: s, reason: collision with root package name */
    public C1968b f18412s;

    public a0(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var, windowInsets);
        this.f18412s = null;
    }

    @Override // n1.h0
    public k0 b() {
        return k0.c(null, this.f18402c.consumeStableInsets());
    }

    @Override // n1.h0
    public k0 c() {
        return k0.c(null, this.f18402c.consumeSystemWindowInsets());
    }

    @Override // n1.h0
    public final C1968b l() {
        if (this.f18412s == null) {
            WindowInsets windowInsets = this.f18402c;
            this.f18412s = C1968b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f18412s;
    }

    @Override // n1.h0
    public boolean s() {
        return this.f18402c.isConsumed();
    }

    @Override // n1.h0
    public void z(C1968b c1968b) {
        this.f18412s = c1968b;
    }

    public a0(k0 k0Var, a0 a0Var) {
        super(k0Var, a0Var);
        this.f18412s = null;
        this.f18412s = a0Var.f18412s;
    }
}
