package C0;

import v0.C1492g;
import v0.RunnableC1491f;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final z f378a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.j f379b;

    public y(z zVar, B0.j jVar) {
        this.f378a = zVar;
        this.f379b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f378a.f384d) {
            try {
                if (((y) this.f378a.f382b.remove(this.f379b)) != null) {
                    x xVar = (x) this.f378a.f383c.remove(this.f379b);
                    if (xVar != null) {
                        B0.j jVar = this.f379b;
                        C1492g c1492g = (C1492g) xVar;
                        s0.s.d().a(C1492g.f12068m, "Exceeded time limits on execution for " + jVar);
                        c1492g.f12076h.execute(new RunnableC1491f(c1492g, 0));
                    }
                } else {
                    s0.s.d().a("WrkTimerRunnable", "Timer with " + this.f379b + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
