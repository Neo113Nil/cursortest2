package I1;

import android.view.ViewTreeObserver;

/* renamed from: I1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0029f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0030g f604b;

    public ViewTreeObserverOnPreDrawListenerC0029f(C0030g c0030g, q qVar) {
        this.f604b = c0030g;
        this.f603a = qVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0030g c0030g = this.f604b;
        if (c0030g.f611h && c0030g.f != null) {
            this.f603a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0030g.f = null;
        }
        return c0030g.f611h;
    }
}
