package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: dr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0147dr implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i91 f1798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f1799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f1800c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0184er f1801d;

    public AnimationAnimationListenerC0147dr(i91 i91Var, ViewGroup viewGroup, View view, C0184er c0184er) {
        this.f1798a = i91Var;
        this.f1799b = viewGroup;
        this.f1800c = view;
        this.f1801d = c0184er;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.f1799b;
        viewGroup.post(new RunnableC0886xq(viewGroup, this.f1800c, this.f1801d, 1));
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1798a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1798a + " has reached onAnimationStart.");
        }
    }
}
