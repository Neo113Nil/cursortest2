package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class sj1 extends rj1 {

    /* JADX INFO: renamed from: s */
    public wd0 f7132s;

    /* JADX INFO: renamed from: t */
    public wd0 f7133t;

    /* JADX INFO: renamed from: u */
    public wd0 f7134u;

    public sj1(ak1 ak1Var, WindowInsets windowInsets) {
        super(ak1Var, windowInsets);
        this.f7132s = null;
        this.f7133t = null;
        this.f7134u = null;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: h */
    public wd0 mo4530h() {
        if (this.f7133t == null) {
            this.f7133t = wd0.m5319b(this.f6171c.getMandatorySystemGestureInsets());
        }
        return this.f7133t;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: j */
    public wd0 mo4531j() {
        if (this.f7132s == null) {
            this.f7132s = wd0.m5319b(this.f6171c.getSystemGestureInsets());
        }
        return this.f7132s;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: l */
    public wd0 mo4532l() {
        if (this.f7134u == null) {
            this.f7134u = wd0.m5319b(this.f6171c.getTappableElementInsets());
        }
        return this.f7134u;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: o */
    public ak1 mo4533o(int i, int i2, int i3, int i4) {
        return ak1.m270b(this.f6171c.inset(i, i2, i3, i4), null);
    }
}
