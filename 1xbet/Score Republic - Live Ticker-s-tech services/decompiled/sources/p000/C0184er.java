package p000;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: er */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0184er extends h91 {

    /* JADX INFO: renamed from: c */
    public final C0221fr f2168c;

    public C0184er(C0221fr c0221fr) {
        this.f2168c = c0221fr;
    }

    @Override // p000.h91
    /* JADX INFO: renamed from: a */
    public final void mo1496a(ViewGroup viewGroup) {
        viewGroup.getClass();
        i91 i91Var = (i91) this.f2168c.f7192j;
        View view = i91Var.f3488c.f1112P;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        i91Var.m2578c(this);
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Animation from operation " + i91Var + " has been cancelled.");
        }
    }

    @Override // p000.h91
    /* JADX INFO: renamed from: b */
    public final void mo1497b(ViewGroup viewGroup) {
        viewGroup.getClass();
        C0221fr c0221fr = this.f2168c;
        i91 i91Var = (i91) c0221fr.f7192j;
        if (c0221fr.m4575k()) {
            i91Var.m2578c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = i91Var.f3488c.f1112P;
        context.getClass();
        f50 f50VarM1886B = c0221fr.m1886B(context);
        if (f50VarM1886B == null) {
            C0270h1.m2191g("Required value was null.");
            return;
        }
        Animation animation = (Animation) f50VarM1886B.f2313k;
        if (animation == null) {
            C0270h1.m2191g("Required value was null.");
            return;
        }
        if (i91Var.f3486a != 1) {
            view.startAnimation(animation);
            i91Var.m2578c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        g50 g50Var = new g50(animation, viewGroup, view);
        g50Var.setAnimationListener(new AnimationAnimationListenerC0147dr(i91Var, viewGroup, view, this));
        view.startAnimation(g50Var);
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Animation from operation " + i91Var + " has started.");
        }
    }
}
