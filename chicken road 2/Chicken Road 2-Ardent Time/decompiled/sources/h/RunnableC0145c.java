package h;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0145c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f3127b;

    public /* synthetic */ RunnableC0145c(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f3126a = i2;
        this.f3127b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3126a) {
            case 0:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f3127b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.t = actionBarOverlayLayout.f2006c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2023u);
                break;
            default:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3127b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.t = actionBarOverlayLayout2.f2006c.animate().translationY(-actionBarOverlayLayout2.f2006c.getHeight()).setListener(actionBarOverlayLayout2.f2023u);
                break;
        }
    }
}
