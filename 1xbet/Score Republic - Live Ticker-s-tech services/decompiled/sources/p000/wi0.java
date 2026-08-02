package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8551j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ zi0 f8552k;

    public /* synthetic */ wi0(zi0 zi0Var, int i) {
        this.f8551j = i;
        this.f8552k = zi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8551j;
        zi0 zi0Var = this.f8552k;
        switch (i) {
            case 0:
                C0151dv c0151dv = zi0Var.f9782l;
                if (c0151dv != null) {
                    c0151dv.setListSelectionHidden(true);
                    c0151dv.requestLayout();
                }
                break;
            default:
                C0151dv c0151dv2 = zi0Var.f9782l;
                if (c0151dv2 != null && c0151dv2.isAttachedToWindow() && zi0Var.f9782l.getCount() > zi0Var.f9782l.getChildCount() && zi0Var.f9782l.getChildCount() <= zi0Var.f9792v) {
                    zi0Var.f9779H.setInputMethodMode(2);
                    zi0Var.mo3217c();
                    break;
                }
                break;
        }
    }
}
