package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5132I extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12827a;

    public C5132I(View view) {
        this.f12827a = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12827a.setVisibility(8);
        this.f12827a.setAlpha(0.0f);
    }
}
