package p096n1;

import p023d1.n;
import p047g1.e;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f15345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15346b;

    public q(r rVar, String str) {
        this.f15345a = rVar;
        this.f15346b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15345a.f15351d) {
            try {
                if (((q) this.f15345a.f15349b.remove(this.f15346b)) != null) {
                    p pVar = (p) this.f15345a.f15350c.remove(this.f15346b);
                    if (pVar != null) {
                        String str = this.f15346b;
                        n.d().b(e.f13082A, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((e) pVar).e();
                    }
                } else {
                    n.d().b("WrkTimerRunnable", "Timer with " + this.f15346b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
