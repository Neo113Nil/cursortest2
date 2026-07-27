package U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: U.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1533a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0067g f1534b;

    public C0065e(C0067g c0067g) {
        this.f1534b = c0067g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1533a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1533a) {
            this.f1533a = false;
            return;
        }
        C0067g c0067g = this.f1534b;
        if (((Float) c0067g.f1556u.getAnimatedValue()).floatValue() == 0.0f) {
            c0067g.f1557v = 0;
            c0067g.e(0);
        } else {
            c0067g.f1557v = 2;
            c0067g.f1549n.invalidate();
        }
    }
}
