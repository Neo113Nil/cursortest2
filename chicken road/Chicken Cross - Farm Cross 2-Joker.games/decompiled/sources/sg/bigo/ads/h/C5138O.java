package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.Animation;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.O, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5138O extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12844a;

    public C5138O(View view) {
        this.f12844a = view;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12844a.setVisibility(4);
    }
}
