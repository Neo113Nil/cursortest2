package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.N;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1062c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1071l f9540b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1062c(AbstractC1071l abstractC1071l, int i3) {
        this.f9539a = i3;
        this.f9540b = abstractC1071l;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9539a) {
            case 0:
                ViewOnKeyListenerC1066g viewOnKeyListenerC1066g = (ViewOnKeyListenerC1066g) this.f9540b;
                if (viewOnKeyListenerC1066g.k()) {
                    ArrayList arrayList = viewOnKeyListenerC1066g.f9555h;
                    if (arrayList.size() > 0 && !((C1065f) arrayList.get(0)).f9547a.f9731u) {
                        View view = viewOnKeyListenerC1066g.f9562o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C1065f) it.next()).f9547a.d();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1066g.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC1078s viewOnKeyListenerC1078s = (ViewOnKeyListenerC1078s) this.f9540b;
                if (viewOnKeyListenerC1078s.k()) {
                    N n3 = viewOnKeyListenerC1078s.f9642h;
                    if (!n3.f9731u) {
                        View view2 = viewOnKeyListenerC1078s.f9647m;
                        if (view2 != null && view2.isShown()) {
                            n3.d();
                            break;
                        } else {
                            viewOnKeyListenerC1078s.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
