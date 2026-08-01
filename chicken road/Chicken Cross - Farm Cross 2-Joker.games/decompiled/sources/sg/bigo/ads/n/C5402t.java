package sg.bigo.ads.n;

import android.transition.Transition;

/* renamed from: sg.bigo.ads.n.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5402t extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5404u f13191a;

    public C5402t(RunnableC5404u runnableC5404u) {
        this.f13191a = runnableC5404u;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f13191a.b.z();
        RunnableC5404u runnableC5404u = this.f13191a;
        if (runnableC5404u.f13193a.b) {
            C5408w c5408w = runnableC5404u.b;
            c5408w.a(c5408w.J, new sg.bigo.ads.E0.k());
        }
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
