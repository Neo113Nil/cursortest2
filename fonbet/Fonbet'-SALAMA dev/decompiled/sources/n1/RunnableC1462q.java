package n1;

/* renamed from: n1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1462q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1463r f15339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15340b;

    public RunnableC1462q(C1463r c1463r, String str) {
        this.f15339a = c1463r;
        this.f15340b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15339a.f15345d) {
            try {
                if (((RunnableC1462q) this.f15339a.f15343b.remove(this.f15340b)) != null) {
                    InterfaceC1461p interfaceC1461p = (InterfaceC1461p) this.f15339a.f15344c.remove(this.f15340b);
                    if (interfaceC1461p != null) {
                        String str = this.f15340b;
                        d1.n.d().b(g1.e.f13076A, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((g1.e) interfaceC1461p).e();
                    }
                } else {
                    d1.n.d().b("WrkTimerRunnable", "Timer with " + this.f15340b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
