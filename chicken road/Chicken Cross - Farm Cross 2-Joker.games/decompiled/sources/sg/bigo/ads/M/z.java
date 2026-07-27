package sg.bigo.ads.M;

import android.animation.ObjectAnimator;
import android.transition.Transition;

/* loaded from: classes3.dex */
public final class z extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f12457a;

    public z(A a2) {
        this.f12457a = a2;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12457a.f12422a, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
    }
}
