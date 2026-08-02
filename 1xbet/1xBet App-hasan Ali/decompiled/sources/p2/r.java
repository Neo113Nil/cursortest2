package p2;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final s f18731k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18732l;

    public r(s sVar, String str) {
        this.f18731k = sVar;
        this.f18732l = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18731k.f18737d) {
            try {
                if (((r) this.f18731k.f18735b.remove(this.f18732l)) != null) {
                    q qVar = (q) this.f18731k.f18736c.remove(this.f18732l);
                    if (qVar != null) {
                        String str = this.f18732l;
                        f2.m.d().a(i2.e.f17314t, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((i2.e) qVar).f();
                    }
                } else {
                    f2.m.d().a("WrkTimerRunnable", "Timer with " + this.f18732l + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
