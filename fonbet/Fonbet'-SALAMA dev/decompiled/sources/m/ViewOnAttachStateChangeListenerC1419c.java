package m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1419c implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f15078b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1419c(s sVar, int i7) {
        this.f15077a = i7;
        this.f15078b = sVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f15077a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f15077a) {
            case 0:
                ViewOnKeyListenerC1421e viewOnKeyListenerC1421e = (ViewOnKeyListenerC1421e) this.f15078b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1421e.f15096O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1421e.f15096O = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1421e.f15096O.removeGlobalOnLayoutListener(viewOnKeyListenerC1421e.f15106z);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1415C viewOnKeyListenerC1415C = (ViewOnKeyListenerC1415C) this.f15078b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1415C.f15045F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1415C.f15045F = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1415C.f15045F.removeGlobalOnLayoutListener(viewOnKeyListenerC1415C.f15058z);
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
