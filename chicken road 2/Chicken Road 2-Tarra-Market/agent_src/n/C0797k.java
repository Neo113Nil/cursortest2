package n;

import android.view.WindowInsets;
import j.C0774a;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0797k extends AbstractC0796j {

    /* renamed from: m, reason: collision with root package name */
    public C0774a f6164m;

    public C0797k(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
        this.f6164m = null;
    }

    @Override // n.C0802p
    public r b() {
        return r.a(null, this.f6159c.consumeStableInsets());
    }

    @Override // n.C0802p
    public r c() {
        return r.a(null, this.f6159c.consumeSystemWindowInsets());
    }

    @Override // n.C0802p
    public final C0774a g() {
        if (this.f6164m == null) {
            WindowInsets windowInsets = this.f6159c;
            this.f6164m = C0774a.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6164m;
    }

    @Override // n.C0802p
    public boolean k() {
        return this.f6159c.isConsumed();
    }

    @Override // n.C0802p
    public void p(C0774a c0774a) {
        this.f6164m = c0774a;
    }
}
