package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: j */
    public final long f9115j;

    /* JADX INFO: renamed from: k */
    public final boolean f9116k;

    /* JADX INFO: renamed from: l */
    public final String f9117l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ a02 f9118m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(a02 a02Var, Callable callable, boolean z) {
        super(callable);
        this.f9118m = a02Var;
        long andIncrement = a02.f7t.getAndIncrement();
        this.f9115j = andIncrement;
        this.f9117l = "Task exception on worker thread";
        this.f9116k = z;
        if (andIncrement == Long.MAX_VALUE) {
            ky1 ky1Var = ((f02) a02Var.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xz1 xz1Var = (xz1) obj;
        boolean z = xz1Var.f9116k;
        boolean z2 = this.f9116k;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = xz1Var.f9115j;
        long j2 = this.f9115j;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        ky1 ky1Var = ((f02) this.f9118m.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4601p.m5313b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        ky1 ky1Var = ((f02) this.f9118m.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4600o.m5313b(th, this.f9117l);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(a02 a02Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f9118m = a02Var;
        long andIncrement = a02.f7t.getAndIncrement();
        this.f9115j = andIncrement;
        this.f9117l = str;
        this.f9116k = z;
        if (andIncrement == Long.MAX_VALUE) {
            ky1 ky1Var = ((f02) a02Var.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Tasks index overflow");
        }
    }
}
