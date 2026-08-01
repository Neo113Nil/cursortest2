package sg.bigo.ads.m;

import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

/* renamed from: sg.bigo.ads.m.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5347z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13108a;
    public final /* synthetic */ C5297A b;

    public RunnableC5347z(C5297A c5297a, RunnableC5344w runnableC5344w) {
        this.b = c5297a;
        this.f13108a = runnableC5344w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new C5345x(this));
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(this.b.k, transitionSet);
        ViewGroup viewGroup = this.b.k;
        C5346y c5346y = new C5346y(this);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(c5346y);
        viewGroup.startAnimation(alphaAnimation);
        sg.bigo.ads.K0.X.d(-1, -2, this.b.o);
    }
}
