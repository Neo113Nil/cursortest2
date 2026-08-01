package sg.bigo.ads.L;

import android.animation.Animator;
import android.animation.AnimatorSet;
import sg.bigo.ads.K0.AbstractC4953j;

/* loaded from: classes3.dex */
public final class o extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f12392a;

    public o(AnimatorSet animatorSet) {
        this.f12392a = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (r.c) {
            this.f12392a.start();
        } else {
            this.f12392a.cancel();
        }
    }
}
