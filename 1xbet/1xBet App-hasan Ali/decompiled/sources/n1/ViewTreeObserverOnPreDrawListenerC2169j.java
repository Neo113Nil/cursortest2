package n1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: n1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2169j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final View f18435k;

    /* renamed from: l, reason: collision with root package name */
    public ViewTreeObserver f18436l;

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f18437m;

    public ViewTreeObserverOnPreDrawListenerC2169j(View view, Runnable runnable) {
        this.f18435k = view;
        this.f18436l = view.getViewTreeObserver();
        this.f18437m = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f18436l.isAlive();
        View view = this.f18435k;
        if (isAlive) {
            this.f18436l.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f18437m.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f18436l = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f18436l.isAlive();
        View view2 = this.f18435k;
        if (isAlive) {
            this.f18436l.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
