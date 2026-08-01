package sg.bigo.ads.L;

import android.animation.Animator;
import android.animation.AnimatorSet;
import sg.bigo.ads.K0.AbstractC4953j;

/* renamed from: sg.bigo.ads.L.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4971e extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f12382a;

    public C4971e(AnimatorSet animatorSet) {
        this.f12382a = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (r.b) {
            this.f12382a.start();
        } else {
            this.f12382a.cancel();
        }
    }
}
