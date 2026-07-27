package D;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class N extends M {

    /* renamed from: m, reason: collision with root package name */
    public w.c f216m;

    public N(V v3, WindowInsets windowInsets) {
        super(v3, windowInsets);
        this.f216m = null;
    }

    @Override // D.T
    public V b() {
        return V.a(this.f212c.consumeStableInsets(), null);
    }

    @Override // D.T
    public V c() {
        return V.a(this.f212c.consumeSystemWindowInsets(), null);
    }

    @Override // D.T
    public final w.c g() {
        if (this.f216m == null) {
            WindowInsets windowInsets = this.f212c;
            this.f216m = w.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f216m;
    }

    @Override // D.T
    public boolean k() {
        return this.f212c.isConsumed();
    }

    @Override // D.T
    public void p(w.c cVar) {
        this.f216m = cVar;
    }
}
