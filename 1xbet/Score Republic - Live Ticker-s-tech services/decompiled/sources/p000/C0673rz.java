package p000;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.view.ViewGroup;

/* JADX INFO: renamed from: rz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0673rz extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f6991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Application f6992b;

    public C0673rz(ViewGroup viewGroup, Application application) {
        this.f6991a = viewGroup;
        this.f6992b = application;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f6991a.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f6992b.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
    }
}
