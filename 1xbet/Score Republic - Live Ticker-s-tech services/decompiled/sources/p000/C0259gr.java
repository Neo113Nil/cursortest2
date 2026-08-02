package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: gr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0259gr extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f2853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f2855c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ i91 f2856d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0296hr f2857e;

    public C0259gr(ViewGroup viewGroup, View view, boolean z, i91 i91Var, C0296hr c0296hr) {
        this.f2853a = viewGroup;
        this.f2854b = view;
        this.f2855c = z;
        this.f2856d = i91Var;
        this.f2857e = c0296hr;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f2853a;
        View view = this.f2854b;
        viewGroup.endViewTransition(view);
        boolean z = this.f2855c;
        i91 i91Var = this.f2856d;
        if (z || i91Var.f3486a == 3) {
            int i = i91Var.f3486a;
            view.getClass();
            j11.m2766a(i, view, viewGroup);
        }
        C0296hr c0296hr = this.f2857e;
        ((i91) c0296hr.f3295c.f7192j).m2578c(c0296hr);
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Animator from operation " + i91Var + " has ended.");
        }
    }
}
