package sg.bigo.ads.q;

import android.animation.ValueAnimator;
import android.transition.Transition;

/* loaded from: classes3.dex */
public final class k extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f13244a;
    public final /* synthetic */ l b;

    public k(l lVar, ValueAnimator valueAnimator) {
        this.b = lVar;
        this.f13244a = valueAnimator;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        l lVar = this.b;
        lVar.f.a(lVar.e);
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        ValueAnimator valueAnimator = this.f13244a;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
