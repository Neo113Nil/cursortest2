package sg.bigo.ads.m;

import android.view.View;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* loaded from: classes3.dex */
public final class v0 extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13102a;

    public v0(View view) {
        this.f13102a = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f13102a.setVisibility(4);
    }
}
