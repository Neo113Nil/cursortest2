package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5134K extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimationSet f12833a;
    public final /* synthetic */ View b;

    public C5134K(AnimationSet animationSet, View view) {
        this.f12833a = animationSet;
        this.b = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12833a.setStartOffset(200L);
        this.b.startAnimation(this.f12833a);
    }
}
