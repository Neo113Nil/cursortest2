package g;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.l f2921b;

    public /* synthetic */ d(g.l lVar, int i2) {
        this.f2920a = i2;
        this.f2921b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i2 = this.f2920a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        switch (this.f2920a) {
            case 0:
                g.g gVar = (g.g) this.f2921b;
                android.view.ViewTreeObserver viewTreeObserver = gVar.f2950x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f2950x = view.getViewTreeObserver();
                    }
                    gVar.f2950x.removeGlobalOnLayoutListener(gVar.f2936i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                g.s sVar = (g.s) this.f2921b;
                android.view.ViewTreeObserver viewTreeObserver2 = sVar.f3032o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f3032o = view.getViewTreeObserver();
                    }
                    sVar.f3032o.removeGlobalOnLayoutListener(sVar.f3026i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(android.view.View view) {
    }

    private final void b(android.view.View view) {
    }
}
