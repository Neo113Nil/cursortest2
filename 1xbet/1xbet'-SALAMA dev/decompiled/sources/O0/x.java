package O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f4909c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4912f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4910d = true;

    public x(View view, int i7) {
        this.f4907a = view;
        this.f4908b = i7;
        this.f4909c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // O0.l
    public final void a() {
        f(false);
    }

    @Override // O0.l
    public final void d() {
        f(true);
    }

    @Override // O0.l
    public final void e(m mVar) {
        if (!this.f4912f) {
            t.f4897a.T(this.f4907a, this.f4908b);
            ViewGroup viewGroup = this.f4909c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        mVar.v(this);
    }

    public final void f(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f4910d || this.f4911e == z4 || (viewGroup = this.f4909c) == null) {
            return;
        }
        this.f4911e = z4;
        P6.b.N(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4912f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f4912f) {
            t.f4897a.T(this.f4907a, this.f4908b);
            ViewGroup viewGroup = this.f4909c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f4912f) {
            return;
        }
        t.f4897a.T(this.f4907a, this.f4908b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f4912f) {
            return;
        }
        t.f4897a.T(this.f4907a, 0);
    }

    @Override // O0.l
    public final void b() {
    }

    @Override // O0.l
    public final void c(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
