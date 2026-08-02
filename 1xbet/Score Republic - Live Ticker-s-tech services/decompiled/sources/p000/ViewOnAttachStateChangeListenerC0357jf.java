package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: jf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0357jf implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3917j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3918k;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0357jf(int i, Object obj) {
        this.f3917j = i;
        this.f3918k = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3917j) {
            case 1:
                View view2 = (View) this.f3918k;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ai1.f194a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f3917j;
        Object obj = this.f3918k;
        switch (i) {
            case 0:
                ViewOnKeyListenerC0431lf viewOnKeyListenerC0431lf = (ViewOnKeyListenerC0431lf) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0431lf.f4778G;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0431lf.f4778G = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0431lf.f4778G.removeGlobalOnLayoutListener(viewOnKeyListenerC0431lf.f4788r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                break;
            default:
                z91 z91Var = (z91) obj;
                ViewTreeObserver viewTreeObserver2 = z91Var.f9707x;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        z91Var.f9707x = view.getViewTreeObserver();
                    }
                    z91Var.f9707x.removeGlobalOnLayoutListener(z91Var.f9701r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m2849a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2850b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2851c(View view) {
    }
}
