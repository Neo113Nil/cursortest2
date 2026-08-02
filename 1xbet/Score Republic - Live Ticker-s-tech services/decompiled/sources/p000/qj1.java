package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qj1 extends pj1 {

    /* JADX INFO: renamed from: r */
    public wd0 f6512r;

    public qj1(ak1 ak1Var, WindowInsets windowInsets) {
        super(ak1Var, windowInsets);
        this.f6512r = null;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: b */
    public ak1 mo4101b() {
        return ak1.m270b(this.f6171c.consumeStableInsets(), null);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: c */
    public ak1 mo4102c() {
        return ak1.m270b(this.f6171c.consumeSystemWindowInsets(), null);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: i */
    public final wd0 mo4103i() {
        if (this.f6512r == null) {
            WindowInsets windowInsets = this.f6171c;
            this.f6512r = wd0.m5318a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6512r;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: p */
    public boolean mo4104p() {
        return this.f6171c.isConsumed();
    }
}
