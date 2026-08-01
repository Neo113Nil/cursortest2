package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5131H extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12824a;

    public C5131H(View view) {
        this.f12824a = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12824a.clearAnimation();
        this.f12824a.setVisibility(8);
    }
}
