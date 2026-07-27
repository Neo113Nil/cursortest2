package sg.bigo.ads.L;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.L.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4980n extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12391a;
    public final /* synthetic */ Animation b;
    public final /* synthetic */ View c;
    public final /* synthetic */ AnimationSet d;

    public C4980n(View view, RotateAnimation rotateAnimation, View view2, AnimationSet animationSet) {
        this.f12391a = view;
        this.b = rotateAnimation;
        this.c = view2;
        this.d = animationSet;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12391a.startAnimation(this.b);
        this.c.setVisibility(0);
        this.c.startAnimation(this.d);
    }
}
