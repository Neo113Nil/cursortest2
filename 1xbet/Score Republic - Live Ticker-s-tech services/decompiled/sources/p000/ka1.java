package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends Exception {

    /* JADX INFO: renamed from: j */
    public final ja1 f4331j;

    /* JADX INFO: renamed from: k */
    public final boolean f4332k;

    public ka1(ja1 ja1Var) {
        super(ja1.m2833c(ja1Var), ja1Var.f3888c);
        this.f4331j = ja1Var;
        this.f4332k = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f4332k ? super.fillInStackTrace() : this;
    }
}
