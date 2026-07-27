package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* loaded from: classes3.dex */
public final class I0 extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12828a;
    public final /* synthetic */ Y0 b;

    public I0(Y0 y0, FrameLayout frameLayout) {
        this.b = y0;
        this.f12828a = frameLayout;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12828a.clearAnimation();
        this.f12828a.setVisibility(8);
        this.b.a();
    }
}
