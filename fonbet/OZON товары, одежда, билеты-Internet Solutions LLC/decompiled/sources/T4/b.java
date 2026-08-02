package T4;

import T4.c;
import android.animation.Animator;

/* loaded from: classes.dex */
final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.a f26604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f26605b;

    b(c cVar, c.a aVar) {
        this.f26605b = cVar;
        this.f26604a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        c cVar = this.f26605b;
        c.a aVar = this.f26604a;
        cVar.a(1.0f, aVar, true);
        aVar.f26625k = aVar.f26619e;
        aVar.f26626l = aVar.f26620f;
        aVar.f26627m = aVar.f26621g;
        aVar.a((aVar.f26624j + 1) % aVar.f26623i.length);
        if (!cVar.f26614f) {
            cVar.f26613e += 1.0f;
            return;
        }
        cVar.f26614f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.f26628n) {
            aVar.f26628n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f26605b.f26613e = 0.0f;
    }
}
