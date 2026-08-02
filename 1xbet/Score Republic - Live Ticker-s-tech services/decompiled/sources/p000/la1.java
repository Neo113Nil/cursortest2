package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class la1 extends RuntimeException {

    /* JADX INFO: renamed from: j */
    public final ja1 f4744j;

    /* JADX INFO: renamed from: k */
    public final np0 f4745k;

    /* JADX INFO: renamed from: l */
    public final boolean f4746l;

    public la1(ja1 ja1Var, np0 np0Var) {
        super(ja1.m2833c(ja1Var), ja1Var.f3888c);
        this.f4744j = ja1Var;
        this.f4745k = np0Var;
        this.f4746l = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f4746l ? super.fillInStackTrace() : this;
    }
}
