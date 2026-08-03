package y;

/* loaded from: classes.dex */
public class K extends y.J {

    /* renamed from: m, reason: collision with root package name */
    public r.c f8441m;

    public K(y.Q q2, android.view.WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f8441m = null;
    }

    @Override // y.O
    public y.Q b() {
        return y.Q.a(this.f8436c.consumeStableInsets(), null);
    }

    @Override // y.O
    public y.Q c() {
        return y.Q.a(this.f8436c.consumeSystemWindowInsets(), null);
    }

    @Override // y.O
    public final r.c g() {
        if (this.f8441m == null) {
            android.view.WindowInsets windowInsets = this.f8436c;
            this.f8441m = r.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f8441m;
    }

    @Override // y.O
    public boolean k() {
        return this.f8436c.isConsumed();
    }

    @Override // y.O
    public void p(r.c cVar) {
        this.f8441m = cVar;
    }
}
