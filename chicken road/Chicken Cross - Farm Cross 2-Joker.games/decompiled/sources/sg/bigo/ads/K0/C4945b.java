package sg.bigo.ads.K0;

import android.view.animation.Animation;

/* renamed from: sg.bigo.ads.K0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4945b extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC4946c f12354a;

    public C4945b(RunnableC4946c runnableC4946c) {
        this.f12354a = runnableC4946c;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f12354a.f12355a.setVisibility(0);
    }
}
