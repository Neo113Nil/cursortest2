package W;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: W.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3311a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162g f3312b;

    public C0160e(C0162g c0162g) {
        this.f3312b = c0162g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3311a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3311a) {
            this.f3311a = false;
            return;
        }
        C0162g c0162g = this.f3312b;
        if (((Float) c0162g.f3336u.getAnimatedValue()).floatValue() == 0.0f) {
            c0162g.f3337v = 0;
            c0162g.e(0);
        } else {
            c0162g.f3337v = 2;
            c0162g.f3329n.invalidate();
        }
    }
}
