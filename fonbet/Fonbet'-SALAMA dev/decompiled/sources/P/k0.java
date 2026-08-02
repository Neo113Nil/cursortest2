package P;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class k0 extends j0 {

    /* renamed from: k, reason: collision with root package name */
    public I.c f5085k;

    public k0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f5085k = null;
    }

    @Override // P.p0
    public q0 b() {
        return q0.g(this.f5082c.consumeStableInsets(), null);
    }

    @Override // P.p0
    public q0 c() {
        return q0.g(this.f5082c.consumeSystemWindowInsets(), null);
    }

    @Override // P.p0
    public final I.c f() {
        if (this.f5085k == null) {
            WindowInsets windowInsets = this.f5082c;
            this.f5085k = I.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5085k;
    }

    @Override // P.p0
    public boolean j() {
        return this.f5082c.isConsumed();
    }

    @Override // P.p0
    public void n(I.c cVar) {
        this.f5085k = cVar;
    }
}
