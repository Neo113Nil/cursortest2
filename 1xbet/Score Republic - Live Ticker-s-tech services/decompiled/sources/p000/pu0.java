package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public final View f6257j;

    /* JADX INFO: renamed from: k */
    public ViewTreeObserver f6258k;

    /* JADX INFO: renamed from: l */
    public final Runnable f6259l;

    public pu0(View view, Runnable runnable) {
        this.f6257j = view;
        this.f6258k = view.getViewTreeObserver();
        this.f6259l = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m3992a(View view, Runnable runnable) {
        if (view == null) {
            C0270h1.m2192h("view == null");
            return;
        }
        pu0 pu0Var = new pu0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pu0Var);
        view.addOnAttachStateChangeListener(pu0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f6258k.isAlive();
        View view = this.f6257j;
        if (zIsAlive) {
            this.f6258k.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f6259l.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6258k = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f6258k.isAlive();
        View view2 = this.f6257j;
        if (zIsAlive) {
            this.f6258k.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
