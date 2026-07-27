package sg.bigo.ads.M;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class K extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f12430a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Q c;

    public K(Q q, long j, long j2) {
        this.c = q;
        this.f12430a = j;
        this.b = j2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Q.a(this.c, this.f12430a - 1, 300L, this.b);
    }
}
