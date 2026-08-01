package sg.bigo.ads.q;

import android.animation.ValueAnimator;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* loaded from: classes3.dex */
public final class j extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f13243a;
    public final /* synthetic */ C5430a b;
    public final /* synthetic */ n c;

    public j(n nVar, ValueAnimator valueAnimator, C5430a c5430a) {
        this.c = nVar;
        this.f13243a = valueAnimator;
        this.b = c5430a;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.c.a(this.b);
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ValueAnimator valueAnimator = this.f13243a;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
