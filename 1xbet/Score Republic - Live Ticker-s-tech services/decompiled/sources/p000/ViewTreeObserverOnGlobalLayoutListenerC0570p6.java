package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0570p6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5998j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5999k;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0570p6(int i, Object obj) {
        this.f5998j = i;
        this.f5999k = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f5998j;
        Object obj = this.f5999k;
        switch (i) {
            case 0:
                C0903y6 c0903y6 = (C0903y6) obj;
                if (!c0903y6.getInternalPopup().mo4257a()) {
                    c0903y6.f9185o.mo4265m(c0903y6.getTextDirection(), c0903y6.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0903y6.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C0792v6 c0792v6 = (C0792v6) obj;
                C0903y6 c0903y7 = c0792v6.f8105M;
                if (c0903y7.isAttachedToWindow() && c0903y7.getGlobalVisibleRect(c0792v6.f8103K)) {
                    c0792v6.m5103s();
                    c0792v6.mo3217c();
                } else {
                    c0792v6.dismiss();
                }
                break;
            case 2:
                ((C0209ff) obj).f2388i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                break;
            case 3:
                ViewOnKeyListenerC0431lf viewOnKeyListenerC0431lf = (ViewOnKeyListenerC0431lf) obj;
                ArrayList arrayList = viewOnKeyListenerC0431lf.f4787q;
                if (viewOnKeyListenerC0431lf.mo3216a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((C0394kf) arrayList.get(0)).f4360a.f9778G) {
                        View view = viewOnKeyListenerC0431lf.f4794x;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((C0394kf) obj2).f4360a.mo3217c();
                            }
                        } else {
                            viewOnKeyListenerC0431lf.dismiss();
                        }
                    }
                    break;
                }
                break;
            case 4:
                ((cq0) obj).f1426i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                break;
            default:
                z91 z91Var = (z91) obj;
                co0 co0Var = z91Var.f9700q;
                if (z91Var.mo3216a() && !co0Var.f9778G) {
                    View view2 = z91Var.f9705v;
                    if (view2 != null && view2.isShown()) {
                        co0Var.mo3217c();
                    } else {
                        z91Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
