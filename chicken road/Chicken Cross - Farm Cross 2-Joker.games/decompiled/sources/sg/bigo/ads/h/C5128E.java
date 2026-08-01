package sg.bigo.ads.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: sg.bigo.ads.h.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5128E extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12814a;

    public C5128E(View view) {
        this.f12814a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12814a.setVisibility(8);
    }
}
