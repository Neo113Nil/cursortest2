package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0159e2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1907b;

    public C0159e2(li1 li1Var, View view) {
        this.f1906a = 2;
        this.f1907b = li1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f1906a;
        Object obj = this.f1907b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f367F = null;
                actionBarOverlayLayout.f382s = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ((li1) obj).mo1068b();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f1906a;
        Object obj = this.f1907b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f367F = null;
                actionBarOverlayLayout.f382s = false;
                break;
            case 1:
                bc1 bc1Var = (bc1) obj;
                View view = bc1Var.f823n;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height = view.getHeight();
                ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(bc1Var.f822m);
                duration.addListener(new zb1(bc1Var, layoutParams, height));
                duration.addUpdateListener(new ac1(bc1Var, layoutParams));
                duration.start();
                break;
            default:
                ((li1) obj).mo1067a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1906a) {
            case 2:
                ((li1) this.f1907b).mo1069d();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C0159e2(int i, Object obj) {
        this.f1906a = i;
        this.f1907b = obj;
    }
}
