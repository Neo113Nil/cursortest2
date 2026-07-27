package k;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1063d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1071l f9542b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1063d(AbstractC1071l abstractC1071l, int i3) {
        this.f9541a = i3;
        this.f9542b = abstractC1071l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f9541a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f9541a) {
            case 0:
                ViewOnKeyListenerC1066g viewOnKeyListenerC1066g = (ViewOnKeyListenerC1066g) this.f9542b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1066g.f9571x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1066g.f9571x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1066g.f9571x.removeGlobalOnLayoutListener(viewOnKeyListenerC1066g.f9556i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1078s viewOnKeyListenerC1078s = (ViewOnKeyListenerC1078s) this.f9542b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1078s.f9649o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1078s.f9649o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1078s.f9649o.removeGlobalOnLayoutListener(viewOnKeyListenerC1078s.f9643i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
