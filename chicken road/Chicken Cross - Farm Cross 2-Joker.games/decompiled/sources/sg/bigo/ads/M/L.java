package sg.bigo.ads.M;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class L implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12431a;
    public final /* synthetic */ Q b;

    public L(Q q, int i) {
        this.b = q;
        this.f12431a = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            this.b.d.scrollTo(((Integer) animatedValue).intValue() + this.f12431a, this.b.d.getScrollY());
        }
    }
}
