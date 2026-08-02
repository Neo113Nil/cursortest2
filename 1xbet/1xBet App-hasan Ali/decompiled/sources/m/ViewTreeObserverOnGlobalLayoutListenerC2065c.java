package m;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import n.j0;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2065c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17870k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2072j f17871l;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2065c(AbstractC2072j abstractC2072j, int i) {
        this.f17870k = i;
        this.f17871l = abstractC2072j;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f17870k) {
            case 0:
                ViewOnKeyListenerC2067e viewOnKeyListenerC2067e = (ViewOnKeyListenerC2067e) this.f17871l;
                if (viewOnKeyListenerC2067e.i()) {
                    ArrayList arrayList = viewOnKeyListenerC2067e.f17890r;
                    if (arrayList.size() > 0) {
                        int i = 0;
                        if (!((C2066d) arrayList.get(0)).f17872a.f18226E) {
                            View view = viewOnKeyListenerC2067e.f17897y;
                            if (view != null && view.isShown()) {
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    ((C2066d) obj).f17872a.b();
                                }
                                break;
                            } else {
                                viewOnKeyListenerC2067e.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC2079q viewOnKeyListenerC2079q = (ViewOnKeyListenerC2079q) this.f17871l;
                if (viewOnKeyListenerC2079q.i()) {
                    j0 j0Var = viewOnKeyListenerC2079q.f17971r;
                    if (!j0Var.f18226E) {
                        View view2 = viewOnKeyListenerC2079q.f17976w;
                        if (view2 != null && view2.isShown()) {
                            j0Var.b();
                            break;
                        } else {
                            viewOnKeyListenerC2079q.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
