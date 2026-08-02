package p000;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: hr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0296hr extends h91 {

    /* JADX INFO: renamed from: c */
    public final C0221fr f3295c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f3296d;

    public C0296hr(C0221fr c0221fr) {
        this.f3295c = c0221fr;
    }

    @Override // p000.h91
    /* JADX INFO: renamed from: a */
    public final void mo1496a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.f3296d;
        i91 i91Var = (i91) this.f3295c.f7192j;
        if (animatorSet == null) {
            i91Var.m2578c(this);
            return;
        }
        if (i91Var.f3492g) {
            C0369jr.f4071a.m2961a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (t50.m4691J(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(i91Var);
            sb.append(" has been canceled");
            sb.append(i91Var.f3492g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // p000.h91
    /* JADX INFO: renamed from: b */
    public final void mo1497b(ViewGroup viewGroup) {
        viewGroup.getClass();
        i91 i91Var = (i91) this.f3295c.f7192j;
        AnimatorSet animatorSet = this.f3296d;
        if (animatorSet == null) {
            i91Var.m2578c(this);
            return;
        }
        animatorSet.start();
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Animator from operation " + i91Var + " has started.");
        }
    }

    @Override // p000.h91
    /* JADX INFO: renamed from: c */
    public final void mo2241c(C0685sa c0685sa, ViewGroup viewGroup) {
        viewGroup.getClass();
        i91 i91Var = (i91) this.f3295c.f7192j;
        AnimatorSet animatorSet = this.f3296d;
        if (animatorSet == null) {
            i91Var.m2578c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !i91Var.f3488c.f1139v) {
            return;
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + i91Var);
        }
        long jM2696a = C0332ir.f3638a.m2696a(animatorSet);
        long j = (long) (c0685sa.f7081c * jM2696a);
        if (j == 0) {
            j = 1;
        }
        if (j == jM2696a) {
            j = jM2696a - 1;
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + i91Var);
        }
        C0369jr.f4071a.m2962b(animatorSet, j);
    }

    @Override // p000.h91
    /* JADX INFO: renamed from: d */
    public final void mo2242d(ViewGroup viewGroup) {
        C0296hr c0296hr;
        viewGroup.getClass();
        C0221fr c0221fr = this.f3295c;
        if (c0221fr.m4575k()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        f50 f50VarM1886B = c0221fr.m1886B(context);
        this.f3296d = f50VarM1886B != null ? (AnimatorSet) f50VarM1886B.f2314l : null;
        i91 i91Var = (i91) c0221fr.f7192j;
        c50 c50Var = i91Var.f3488c;
        boolean z = i91Var.f3486a == 3;
        View view = c50Var.f1112P;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f3296d;
        if (animatorSet != null) {
            c0296hr = this;
            animatorSet.addListener(new C0259gr(viewGroup, view, z, i91Var, c0296hr));
        } else {
            c0296hr = this;
        }
        AnimatorSet animatorSet2 = c0296hr.f3296d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
