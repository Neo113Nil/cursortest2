package n;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2124b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18213k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f18214l;

    public /* synthetic */ RunnableC2124b(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f18213k = i;
        this.f18214l = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18213k) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18214l;
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.f6706D = actionBarOverlayLayout.f6714m.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f6707E);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18214l;
                actionBarOverlayLayout2.g();
                actionBarOverlayLayout2.f6706D = actionBarOverlayLayout2.f6714m.animate().translationY(-actionBarOverlayLayout2.f6714m.getHeight()).setListener(actionBarOverlayLayout2.f6707E);
                break;
        }
    }
}
