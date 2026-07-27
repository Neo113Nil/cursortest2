package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.L, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5135L extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12836a;

    public C5135L(View view) {
        this.f12836a = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        sg.bigo.ads.K0.X.c(this.f12836a);
    }
}
