package sg.bigo.ads.n;

import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;

/* renamed from: sg.bigo.ads.n.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5394o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5401s0 f13183a;

    public RunnableC5394o0(C5401s0 c5401s0) {
        this.f13183a = c5401s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.f13183a.d)) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Fade());
        TransitionManager.beginDelayedTransition(this.f13183a.Q, transitionSet);
        this.f13183a.W.setVisibility(0);
    }
}
