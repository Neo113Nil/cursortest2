package sg.bigo.ads.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: sg.bigo.ads.n.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5376f0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13168a;
    public final /* synthetic */ long b;
    public final /* synthetic */ U0 c;

    public C5376f0(U0 u0, long j, long j2) {
        this.c = u0;
        this.f13168a = j;
        this.b = j2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        U0.a(this.c, this.f13168a - 1, 300L, this.b);
    }
}
