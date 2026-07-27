package sg.bigo.ads.q;

import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13245a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Integer d = -234881024;
    public final /* synthetic */ C5430a e;
    public final /* synthetic */ n f;

    public l(n nVar, RealtimeBlurLinearLayout realtimeBlurLinearLayout, ViewGroup viewGroup, View view, C5430a c5430a) {
        this.f = nVar;
        this.f13245a = realtimeBlurLinearLayout;
        this.b = viewGroup;
        this.c = view;
        this.e = c5430a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator a2;
        X.c(this.f13245a);
        this.b.addView(this.f13245a, this.c.getLayoutParams());
        n nVar = this.f;
        Integer num = this.d;
        if (num == null) {
            nVar.getClass();
            a2 = null;
        } else {
            a2 = sg.bigo.ads.E0.p.a(nVar.f13247a, num.intValue(), new i());
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setDuration(300L);
        transitionSet.addListener((Transition.TransitionListener) new k(this, a2));
        TransitionManager.beginDelayedTransition(this.b, transitionSet);
    }
}
