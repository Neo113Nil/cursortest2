package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends m80 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f2428p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ hj1 f2429q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj1(hj1 hj1Var, int i) {
        super(10);
        this.f2428p = i;
        this.f2429q = hj1Var;
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: a */
    public final void mo1067a() {
        View view;
        int i = this.f2428p;
        hj1 hj1Var = this.f2429q;
        switch (i) {
            case 0:
                if (hj1Var.f3241o && (view = hj1Var.f3233g) != null) {
                    view.setTranslationY(0.0f);
                    hj1Var.f3230d.setTranslationY(0.0f);
                }
                hj1Var.f3230d.setVisibility(8);
                hj1Var.f3230d.setTransitioning(false);
                hj1Var.f3245s = null;
                C0312i6 c0312i6 = hj1Var.f3237k;
                if (c0312i6 != null) {
                    c0312i6.m2546q(hj1Var.f3236j);
                    hj1Var.f3236j = null;
                    hj1Var.f3237k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = hj1Var.f3229c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ai1.f194a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                hj1Var.f3245s = null;
                hj1Var.f3230d.requestLayout();
                break;
        }
    }
}
