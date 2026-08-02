package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zb1 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup.LayoutParams f9727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bc1 f9729c;

    public zb1(bc1 bc1Var, ViewGroup.LayoutParams layoutParams, int i) {
        this.f9729c = bc1Var;
        this.f9727a = layoutParams;
        this.f9728b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bc1 bc1Var = this.f9729c;
        nu1 nu1Var = bc1Var.f824o;
        View view = bc1Var.f823n;
        AbstractC0057bc abstractC0057bc = (AbstractC0057bc) nu1Var.f5551k;
        if (abstractC0057bc.mo630b() != null) {
            abstractC0057bc.mo630b().onClick(view);
        }
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        int i = this.f9728b;
        ViewGroup.LayoutParams layoutParams = this.f9727a;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
