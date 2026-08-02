package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class vj1 extends uj1 {

    /* JADX INFO: renamed from: w */
    public static final ak1 f8205w = ak1.m270b(WindowInsets.CONSUMED, null);

    public vj1(ak1 ak1Var, WindowInsets windowInsets) {
        super(ak1Var, windowInsets);
    }

    @Override // p000.tj1, p000.pj1
    /* JADX INFO: renamed from: A */
    public wd0 mo3931A(int i) {
        return wd0.m5319b(this.f6171c.getInsets(zj1.m5924a(i)));
    }

    @Override // p000.tj1, p000.pj1
    /* JADX INFO: renamed from: D */
    public wd0 mo3933D(int i) {
        return wd0.m5319b(this.f6171c.getInsetsIgnoringVisibility(zj1.m5924a(i)));
    }

    @Override // p000.pj1, p000.xj1
    /* JADX INFO: renamed from: m */
    public void mo3939m(View view) {
    }
}
