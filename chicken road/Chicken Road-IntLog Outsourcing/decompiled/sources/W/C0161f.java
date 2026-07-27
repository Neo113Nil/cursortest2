package W;

import android.animation.ValueAnimator;

/* renamed from: W.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0162g f3313a;

    public C0161f(C0162g c0162g) {
        this.f3313a = c0162g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0162g c0162g = this.f3313a;
        c0162g.f3317b.setAlpha(floatValue);
        c0162g.f3318c.setAlpha(floatValue);
        c0162g.f3329n.invalidate();
    }
}
