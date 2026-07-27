package sg.bigo.ads.m;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* loaded from: classes3.dex */
public final class w0 extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13104a;
    public final /* synthetic */ Animation b;

    public w0(View view, RotateAnimation rotateAnimation) {
        this.f13104a = view;
        this.b = rotateAnimation;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f13104a.startAnimation(this.b);
    }
}
