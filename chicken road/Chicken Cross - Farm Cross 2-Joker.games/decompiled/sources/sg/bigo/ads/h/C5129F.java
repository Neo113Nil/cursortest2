package sg.bigo.ads.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: sg.bigo.ads.h.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5129F extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12817a;

    public C5129F(View view) {
        this.f12817a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12817a.setVisibility(0);
    }
}
