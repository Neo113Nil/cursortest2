package sg.bigo.ads.t;

import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import sg.bigo.ads.K0.C4949f;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f13314a;

    public m(v vVar) {
        this.f13314a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new C4949f());
        transitionSet.addTransition(new Fade(2));
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(this.f13314a.w0, transitionSet);
        this.f13314a.y0.setVisibility(8);
    }
}
