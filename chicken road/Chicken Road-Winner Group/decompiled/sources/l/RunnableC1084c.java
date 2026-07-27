package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1084c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f9762b;

    public /* synthetic */ RunnableC1084c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f9761a = i3;
        this.f9762b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9761a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9762b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1958t = actionBarOverlayLayout.f1942c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1959u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9762b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1958t = actionBarOverlayLayout2.f1942c.animate().translationY(-actionBarOverlayLayout2.f1942c.getHeight()).setListener(actionBarOverlayLayout2.f1959u);
                break;
        }
    }
}
