package sg.bigo.ads.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: sg.bigo.ads.m.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5331j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13086a;
    public final /* synthetic */ long b;
    public final /* synthetic */ e0 c;

    public C5331j(e0 e0Var, long j, long j2) {
        this.c = e0Var;
        this.f13086a = j;
        this.b = j2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e0.a(this.c, this.f13086a - 1, 300L, this.b);
    }
}
