package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f9803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9804b;

    public c(e eVar, d dVar) {
        this.f9804b = eVar;
        this.f9803a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f9804b;
        d dVar = this.f9803a;
        eVar.a(1.0f, dVar, true);
        dVar.f9814k = dVar.f9809e;
        dVar.f9815l = dVar.f9810f;
        dVar.f9816m = dVar.f9811g;
        dVar.a((dVar.j + 1) % dVar.f9813i.length);
        if (!eVar.f9833f) {
            eVar.f9832e += 1.0f;
            return;
        }
        eVar.f9833f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f9817n) {
            dVar.f9817n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9804b.f9832e = 0.0f;
    }
}
