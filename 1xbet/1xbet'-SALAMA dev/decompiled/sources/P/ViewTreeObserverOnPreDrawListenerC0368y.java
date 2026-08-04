package P;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: P.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0368y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f5113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f5114c;

    public ViewTreeObserverOnPreDrawListenerC0368y(View view, Runnable runnable) {
        this.f5112a = view;
        this.f5113b = view.getViewTreeObserver();
        this.f5114c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0368y viewTreeObserverOnPreDrawListenerC0368y = new ViewTreeObserverOnPreDrawListenerC0368y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0368y);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0368y);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f5113b.isAlive();
        View view = this.f5112a;
        if (zIsAlive) {
            this.f5113b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f5114c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5113b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f5113b.isAlive();
        View view2 = this.f5112a;
        if (zIsAlive) {
            this.f5113b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
