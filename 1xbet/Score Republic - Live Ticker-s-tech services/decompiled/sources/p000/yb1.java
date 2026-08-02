package p000;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f9260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f9261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f9262c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f9263d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bc1 f9264e;

    public yb1(bc1 bc1Var, float f, float f2, float f3, float f4) {
        this.f9264e = bc1Var;
        this.f9260a = f;
        this.f9261b = f2;
        this.f9262c = f3;
        this.f9263d = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = (valueAnimator.getAnimatedFraction() * this.f9261b) + this.f9260a;
        float animatedFraction2 = (valueAnimator.getAnimatedFraction() * this.f9263d) + this.f9262c;
        bc1 bc1Var = this.f9264e;
        bc1Var.mo638c(animatedFraction);
        bc1Var.f823n.setAlpha(animatedFraction2);
    }
}
