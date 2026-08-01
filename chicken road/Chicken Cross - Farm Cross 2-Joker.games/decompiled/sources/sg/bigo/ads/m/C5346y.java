package sg.bigo.ads.m;

import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.m.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5346y extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5347z f13107a;

    public C5346y(RunnableC5347z runnableC5347z) {
        this.f13107a = runnableC5347z;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f13107a.f13108a.run();
    }
}
