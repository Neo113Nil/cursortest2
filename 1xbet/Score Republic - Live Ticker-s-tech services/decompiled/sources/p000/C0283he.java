package p000;

/* JADX INFO: renamed from: he */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0283he {

    /* JADX INFO: renamed from: a */
    public Object f3180a;

    /* JADX INFO: renamed from: b */
    public C0356je f3181b;

    /* JADX INFO: renamed from: c */
    public u11 f3182c;

    /* JADX INFO: renamed from: d */
    public boolean f3183d;

    public final void finalize() {
        u11 u11Var;
        C0356je c0356je = this.f3181b;
        if (c0356je != null) {
            C0320ie c0320ie = c0356je.f3911k;
            if (!c0320ie.isDone()) {
                c0320ie.mo4867k(new C0711t("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3180a, 2));
            }
        }
        if (this.f3183d || (u11Var = this.f3182c) == null) {
            return;
        }
        u11Var.m5018j(null);
    }
}
