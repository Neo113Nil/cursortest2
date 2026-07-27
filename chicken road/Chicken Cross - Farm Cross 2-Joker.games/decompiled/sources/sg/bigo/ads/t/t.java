package sg.bigo.ads.t;

import android.transition.Transition;

/* loaded from: classes3.dex */
public final class t extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f13319a;

    public t(v vVar) {
        this.f13319a = vVar;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f13319a.M0 = true;
    }
}
