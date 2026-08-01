package sg.bigo.ads.n;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;

/* renamed from: sg.bigo.ads.n.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5404u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5389m f13193a;
    public final /* synthetic */ C5408w b;

    public RunnableC5404u(C5408w c5408w, C5389m c5389m) {
        this.b = c5408w;
        this.f13193a = c5389m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new C5406v(this.b));
        transitionSet.addListener((Transition.TransitionListener) new C5402t(this));
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(this.b.v, transitionSet);
        this.b.B();
    }
}
