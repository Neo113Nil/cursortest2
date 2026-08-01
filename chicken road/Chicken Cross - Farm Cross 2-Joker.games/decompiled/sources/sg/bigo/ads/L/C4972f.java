package sg.bigo.ads.L;

import android.animation.Animator;
import android.animation.AnimatorSet;
import sg.bigo.ads.K0.AbstractC4953j;

/* renamed from: sg.bigo.ads.L.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4972f extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f12383a;

    public C4972f(AnimatorSet animatorSet) {
        this.f12383a = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (r.b) {
            this.f12383a.start();
        } else {
            this.f12383a.cancel();
        }
    }
}
