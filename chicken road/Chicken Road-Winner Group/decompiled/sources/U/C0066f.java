package U;

import android.animation.ValueAnimator;

/* renamed from: U.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0067g f1535a;

    public C0066f(C0067g c0067g) {
        this.f1535a = c0067g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0067g c0067g = this.f1535a;
        c0067g.f1538b.setAlpha(floatValue);
        c0067g.f1539c.setAlpha(floatValue);
        c0067g.f1549n.invalidate();
    }
}
