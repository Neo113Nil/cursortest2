package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5133J extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12830a;
    public final /* synthetic */ AlphaAnimation b;

    public C5133J(View view, AlphaAnimation alphaAnimation) {
        this.f12830a = view;
        this.b = alphaAnimation;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12830a.startAnimation(this.b);
    }
}
