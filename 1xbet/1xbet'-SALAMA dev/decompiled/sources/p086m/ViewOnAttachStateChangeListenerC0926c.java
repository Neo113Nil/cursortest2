package p086m;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0926c implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f15084b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0926c(s sVar, int i7) {
        this.f15083a = i7;
        this.f15084b = sVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f15083a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f15083a) {
            case 0:
                e eVar = (e) this.f15084b;
                ViewTreeObserver viewTreeObserver = eVar.f15102O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.f15102O = view.getViewTreeObserver();
                    }
                    eVar.f15102O.removeGlobalOnLayoutListener(eVar.f15112z);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                C c3 = (C) this.f15084b;
                ViewTreeObserver viewTreeObserver2 = c3.f15051F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c3.f15051F = view.getViewTreeObserver();
                    }
                    c3.f15051F.removeGlobalOnLayoutListener(c3.f15064z);
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
