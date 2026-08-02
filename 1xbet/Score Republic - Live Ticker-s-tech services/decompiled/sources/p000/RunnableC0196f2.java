package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: f2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0196f2 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2267j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ActionBarOverlayLayout f2268k;

    public /* synthetic */ RunnableC0196f2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2267j = i;
        this.f2268k = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2267j;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2268k;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m352h();
                actionBarOverlayLayout.f367F = actionBarOverlayLayout.f376m.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f368G);
                break;
            default:
                actionBarOverlayLayout.m352h();
                actionBarOverlayLayout.f367F = actionBarOverlayLayout.f376m.animate().translationY(-actionBarOverlayLayout.f376m.getHeight()).setListener(actionBarOverlayLayout.f368G);
                break;
        }
    }
}
