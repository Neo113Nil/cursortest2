package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0628b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f8603b;

    public /* synthetic */ RunnableC0628b(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f8602a = i7;
        this.f8603b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8602a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8603b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f8221N = actionBarOverlayLayout.f8229d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f8222O);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8603b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f8221N = actionBarOverlayLayout2.f8229d.animate().translationY(-actionBarOverlayLayout2.f8229d.getHeight()).setListener(actionBarOverlayLayout2.f8222O);
                break;
        }
    }
}
