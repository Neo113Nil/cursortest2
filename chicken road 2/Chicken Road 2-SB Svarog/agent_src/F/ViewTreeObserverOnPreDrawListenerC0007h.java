package F;

import android.view.ViewTreeObserver;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0007h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f78a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0009j f79b;

    public ViewTreeObserverOnPreDrawListenerC0007h(C0009j c0009j, x xVar) {
        this.f79b = c0009j;
        this.f78a = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0009j c0009j = this.f79b;
        if (c0009j.f87h && c0009j.f85f != null) {
            this.f78a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0009j.f85f = null;
        }
        return c0009j.f87h;
    }
}
