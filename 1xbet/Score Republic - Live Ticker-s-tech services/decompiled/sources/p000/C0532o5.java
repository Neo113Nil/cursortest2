package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0532o5 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5626b;

    public /* synthetic */ C0532o5(int i, Object obj) {
        this.f5625a = i;
        this.f5626b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f5625a;
        Object obj = this.f5626b;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C0828w5) obj).m5239C();
                break;
            case 1:
                ((au0) obj).m3288a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
