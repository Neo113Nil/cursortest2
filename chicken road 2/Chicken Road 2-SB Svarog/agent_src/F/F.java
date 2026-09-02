package F;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f40b;

    public F(G g2) {
        this.f40b = g2;
    }

    public final void a(boolean z2) {
        if (this.f39a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f39a = true;
        G g2 = this.f40b;
        int i2 = g2.f42b - 1;
        g2.f42b = i2;
        boolean z3 = z2 | g2.f43c;
        g2.f43c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        g2.f44d.f(g2.f41a);
    }
}
