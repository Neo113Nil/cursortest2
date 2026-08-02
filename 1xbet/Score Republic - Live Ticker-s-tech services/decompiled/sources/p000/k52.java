package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k52 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final long f4291j;

    /* JADX INFO: renamed from: k */
    public final long f4292k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ a81 f4293l;

    public k52(a81 a81Var, long j, long j2) {
        Objects.requireNonNull(a81Var);
        this.f4293l = a81Var;
        this.f4291j = j;
        this.f4292k = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a02 a02Var = ((f02) ((s52) this.f4293l.f64l).f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new cm1(8, this));
    }
}
