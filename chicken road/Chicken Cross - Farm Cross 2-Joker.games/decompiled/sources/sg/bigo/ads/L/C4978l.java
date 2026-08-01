package sg.bigo.ads.L;

import android.view.View;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.L.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4978l extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12389a;

    public C4978l(View view) {
        this.f12389a = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12389a.setVisibility(4);
    }
}
