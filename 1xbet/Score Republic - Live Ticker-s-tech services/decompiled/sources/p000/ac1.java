package p000;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ac1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup.LayoutParams f140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bc1 f141b;

    public ac1(bc1 bc1Var, ViewGroup.LayoutParams layoutParams) {
        this.f141b = bc1Var;
        this.f140a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f140a;
        layoutParams.height = iIntValue;
        this.f141b.f823n.setLayoutParams(layoutParams);
    }
}
