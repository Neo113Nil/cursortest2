package sg.bigo.ads.F;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import sg.bigo.ads.K0.AbstractC4953j;
import sg.bigo.ads.K0.AbstractC4954k;

/* loaded from: classes3.dex */
public final class f extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12287a;

    public f(g gVar) {
        this.f12287a = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12287a.b, "rotation", 0.0f, -20.0f, 0.0f);
        ofFloat.setInterpolator(AbstractC4954k.a(1));
        ofFloat.setDuration(500L);
        ofFloat.setRepeatCount(1);
        ofFloat.addListener(new e(this));
        ofFloat.start();
    }
}
