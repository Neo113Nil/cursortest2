package sg.bigo.ads.L;

import android.animation.Animator;
import android.animation.AnimatorSet;
import sg.bigo.ads.K0.AbstractC4953j;

/* renamed from: sg.bigo.ads.L.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4970d extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f12381a;

    public C4970d(AnimatorSet animatorSet) {
        this.f12381a = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (r.b) {
            this.f12381a.start();
        } else {
            this.f12381a.cancel();
        }
    }
}
