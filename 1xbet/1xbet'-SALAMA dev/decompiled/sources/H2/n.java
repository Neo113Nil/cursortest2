package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3279b;

    public /* synthetic */ n(Object obj, int i7) {
        this.f3278a = i7;
        this.f3279b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3278a) {
            case 0:
                p pVar = (p) this.f3279b;
                pVar.setEnabled(true);
                pVar.f3284a.setEnabled(true);
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3279b;
                actionBarOverlayLayout.f8221N = null;
                actionBarOverlayLayout.f8209B = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3278a) {
            case 0:
                p pVar = (p) this.f3279b;
                pVar.setEnabled(true);
                pVar.f3284a.setEnabled(true);
                break;
            case 1:
                ((O0.m) this.f3279b).m();
                animator.removeListener(this);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3279b;
                actionBarOverlayLayout.f8221N = null;
                actionBarOverlayLayout.f8209B = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3278a) {
            case 0:
                p pVar = (p) this.f3279b;
                pVar.setEnabled(false);
                pVar.f3284a.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
