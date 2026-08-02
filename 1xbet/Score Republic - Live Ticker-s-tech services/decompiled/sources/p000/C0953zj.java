package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: zj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0953zj implements uh0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9800j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9801k;

    public /* synthetic */ C0953zj(int i, Object obj) {
        this.f9800j = i;
        this.f9801k = obj;
    }

    @Override // p000.uh0
    /* JADX INFO: renamed from: d */
    public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
        Window window;
        View viewPeekDecorView;
        int i = this.f9800j;
        Object obj = this.f9801k;
        switch (i) {
            case 0:
                AbstractActivityC0790v4 abstractActivityC0790v4 = (AbstractActivityC0790v4) obj;
                if (ph0Var == ph0.ON_STOP && (window = abstractActivityC0790v4.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0790v4 abstractActivityC0790v5 = (AbstractActivityC0790v4) obj;
                if (ph0Var == ph0.ON_DESTROY) {
                    abstractActivityC0790v5.f2775k.f6028k = null;
                    if (!abstractActivityC0790v5.isChangingConfigurations()) {
                        abstractActivityC0790v5.mo861c().m2099a();
                    }
                    ViewTreeObserverOnDrawListenerC0141dk viewTreeObserverOnDrawListenerC0141dk = abstractActivityC0790v5.f2779o;
                    AbstractActivityC0790v4 abstractActivityC0790v6 = viewTreeObserverOnDrawListenerC0141dk.f1674m;
                    abstractActivityC0790v6.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0141dk);
                    abstractActivityC0790v6.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0141dk);
                }
                break;
            default:
                C0086c5 c0086c5 = (C0086c5) obj;
                c0086c5.getClass();
                if (ph0Var == ph0.ON_START) {
                    c0086c5.f1094e = true;
                } else if (ph0Var == ph0.ON_STOP) {
                    c0086c5.f1094e = false;
                }
                break;
        }
    }
}
