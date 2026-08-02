package S2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5339b;

    public /* synthetic */ n(ViewGroup viewGroup, int i) {
        this.f5338a = i;
        this.f5339b = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5338a) {
            case 0:
                p pVar = (p) this.f5339b;
                pVar.setEnabled(true);
                pVar.f5344k.setEnabled(true);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5339b;
                actionBarOverlayLayout.f6706D = null;
                actionBarOverlayLayout.f6720s = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5338a) {
            case 0:
                p pVar = (p) this.f5339b;
                pVar.setEnabled(true);
                pVar.f5344k.setEnabled(true);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5339b;
                actionBarOverlayLayout.f6706D = null;
                actionBarOverlayLayout.f6720s = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5338a) {
            case 0:
                p pVar = (p) this.f5339b;
                pVar.setEnabled(false);
                pVar.f5344k.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
