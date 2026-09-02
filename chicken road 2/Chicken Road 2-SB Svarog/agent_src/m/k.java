package m;

import android.view.WindowInsets;
import i.C0040a;

/* loaded from: classes.dex */
public class k extends j {

    /* renamed from: m, reason: collision with root package name */
    public C0040a f874m;

    public k(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
        this.f874m = null;
    }

    @Override // m.p
    public r b() {
        return r.a(null, this.f869c.consumeStableInsets());
    }

    @Override // m.p
    public r c() {
        return r.a(null, this.f869c.consumeSystemWindowInsets());
    }

    @Override // m.p
    public final C0040a g() {
        if (this.f874m == null) {
            WindowInsets windowInsets = this.f869c;
            this.f874m = C0040a.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f874m;
    }

    @Override // m.p
    public boolean k() {
        return this.f869c.isConsumed();
    }

    @Override // m.p
    public void p(C0040a c0040a) {
        this.f874m = c0040a;
    }
}
