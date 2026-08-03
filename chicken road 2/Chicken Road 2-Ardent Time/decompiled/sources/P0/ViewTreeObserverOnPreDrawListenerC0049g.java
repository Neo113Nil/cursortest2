package P0;

/* renamed from: P0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0049g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0.t f1345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0.C0050h f1346b;

    public ViewTreeObserverOnPreDrawListenerC0049g(P0.C0050h c0050h, P0.t tVar) {
        this.f1346b = c0050h;
        this.f1345a = tVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        P0.C0050h c0050h = this.f1346b;
        if (c0050h.f1354h && c0050h.f1352f != null) {
            this.f1345a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0050h.f1352f = null;
        }
        return c0050h.f1354h;
    }
}
