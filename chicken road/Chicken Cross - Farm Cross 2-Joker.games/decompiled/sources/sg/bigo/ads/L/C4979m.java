package sg.bigo.ads.L;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.L.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4979m extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12390a;
    public final /* synthetic */ Animation b;

    public C4979m(View view, RotateAnimation rotateAnimation) {
        this.f12390a = view;
        this.b = rotateAnimation;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12390a.startAnimation(this.b);
    }
}
