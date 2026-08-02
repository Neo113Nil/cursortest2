package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends vj1 {
    public wj1(ak1 ak1Var, WindowInsets windowInsets) {
        super(ak1Var, windowInsets);
    }

    @Override // p000.pj1, p000.xj1
    /* JADX INFO: renamed from: e */
    public List<Rect> mo3936e(int i) {
        return this.f6171c.getBoundingRects(zj1.m5924a(i));
    }

    @Override // p000.pj1, p000.xj1
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3937f(int i) {
        return this.f6171c.getBoundingRectsIgnoringVisibility(zj1.m5924a(i));
    }

    @Override // p000.pj1, p000.xj1
    /* JADX INFO: renamed from: n */
    public void mo3940n() {
    }
}
