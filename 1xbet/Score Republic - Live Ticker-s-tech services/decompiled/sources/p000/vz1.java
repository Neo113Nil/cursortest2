package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f8309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a02 f8310b;

    public vz1(a02 a02Var, String str) {
        this.f8310b = a02Var;
        this.f8309a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        ky1 ky1Var = ((f02) this.f8310b.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4600o.m5313b(th, this.f8309a);
    }
}
