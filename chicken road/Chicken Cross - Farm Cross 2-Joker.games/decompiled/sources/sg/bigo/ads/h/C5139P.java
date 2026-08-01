package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.P, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5139P extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12846a;
    public final /* synthetic */ Animation b;

    public C5139P(View view, RotateAnimation rotateAnimation) {
        this.f12846a = view;
        this.b = rotateAnimation;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12846a.startAnimation(this.b);
    }
}
