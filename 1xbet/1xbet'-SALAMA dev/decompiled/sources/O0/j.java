package O0;

import P.c0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4855a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4857c;

    public j(c0 c0Var, View view) {
        this.f4856b = c0Var;
        this.f4857c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4855a) {
            case 1:
                ((c0) this.f4856b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4855a) {
            case 0:
                ((p122r.b) this.f4856b).remove(animator);
                ((m) this.f4857c).f4869D.remove(animator);
                break;
            default:
                ((c0) this.f4856b).c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4855a) {
            case 0:
                ((m) this.f4857c).f4869D.add(animator);
                break;
            default:
                ((c0) this.f4856b).b();
                break;
        }
    }

    public j(m mVar, p122r.b bVar) {
        this.f4857c = mVar;
        this.f4856b = bVar;
    }
}
