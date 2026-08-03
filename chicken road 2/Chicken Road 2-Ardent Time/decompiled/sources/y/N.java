package y;

/* loaded from: classes.dex */
public final class N extends y.M {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f8445q = 0;

    static {
        android.view.WindowInsets windowInsets;
        windowInsets = android.view.WindowInsets.CONSUMED;
        y.Q.a(windowInsets, null);
    }

    public N(y.Q q2, android.view.WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // y.J, y.O
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f8436c.isVisible(y.P.a(i2));
        return isVisible;
    }

    @Override // y.J, y.O
    public final void d(android.view.View view) {
    }
}
