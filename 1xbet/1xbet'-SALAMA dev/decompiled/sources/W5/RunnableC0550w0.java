package W5;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0550w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0556y0 f7385b;

    public /* synthetic */ RunnableC0550w0(C0556y0 c0556y0, int i7) {
        this.f7384a = i7;
        this.f7385b = c0556y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0556y0 c0556y0;
        boolean z4;
        long jNextLong;
        boolean z7 = true;
        switch (this.f7384a) {
            case 0:
                synchronized (this.f7385b) {
                    c0556y0 = this.f7385b;
                    if (c0556y0.f7401d != 6) {
                        c0556y0.f7401d = 6;
                    } else {
                        z7 = false;
                    }
                    break;
                }
                if (z7) {
                    A1.x0 x0Var = c0556y0.f7400c;
                    x0Var.getClass();
                    ((X5.m) x0Var.f613b).c(U5.l0.f6544n.g("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f7385b) {
                    try {
                        C0556y0 c0556y1 = this.f7385b;
                        c0556y1.f7403f = null;
                        int i7 = c0556y1.f7401d;
                        if (i7 == 2) {
                            c0556y1.f7401d = 4;
                            c0556y1.f7402e = c0556y1.f7398a.schedule(c0556y1.f7404g, c0556y1.j, TimeUnit.NANOSECONDS);
                            z4 = true;
                        } else {
                            if (i7 == 3) {
                                ScheduledExecutorService scheduledExecutorService = c0556y1.f7398a;
                                RunnableC0559z0 runnableC0559z0 = c0556y1.f7405h;
                                long j = c0556y1.f7406i;
                                D3.p pVar = c0556y1.f7399b;
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                c0556y1.f7403f = scheduledExecutorService.schedule(runnableC0559z0, j - pVar.a(timeUnit), timeUnit);
                                this.f7385b.f7401d = 2;
                            }
                            z4 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z4) {
                    A1.x0 x0Var2 = this.f7385b.f7400c;
                    x0Var2.getClass();
                    C0553x0 c0553x0 = new C0553x0(x0Var2);
                    X5.m mVar = (X5.m) x0Var2.f613b;
                    I3.a aVar = I3.a.f3657a;
                    synchronized (mVar.f7589k) {
                        try {
                            p113p3.f.r(mVar.f7588i != null);
                            if (mVar.f7603y) {
                                U5.m0 m0VarM = mVar.m();
                                Logger logger = C0509i0.f7239g;
                                try {
                                    aVar.execute(new RunnableC0506h0(c0553x0, m0VarM));
                                    break;
                                } catch (Throwable th2) {
                                    C0509i0.f7239g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                }
                                return;
                            }
                            C0509i0 c0509i0 = mVar.f7602x;
                            if (c0509i0 != null) {
                                jNextLong = 0;
                                z7 = false;
                            } else {
                                jNextLong = mVar.f7583d.nextLong();
                                mVar.f7584e.getClass();
                                D3.p pVar2 = new D3.p(0);
                                pVar2.b();
                                C0509i0 c0509i1 = new C0509i0(jNextLong, pVar2);
                                mVar.f7602x = c0509i1;
                                mVar.f7576L.getClass();
                                c0509i0 = c0509i1;
                            }
                            if (z7) {
                                mVar.f7588i.c((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            synchronized (c0509i0) {
                                try {
                                    if (!c0509i0.f7243d) {
                                        c0509i0.f7242c.put(c0553x0, aVar);
                                        return;
                                    }
                                    U5.m0 m0Var = c0509i0.f7244e;
                                    RunnableC0506h0 runnableC0506h0 = m0Var != null ? new RunnableC0506h0(c0553x0, m0Var) : new RunnableC0506h0(c0553x0, c0509i0.f7245f);
                                    try {
                                        aVar.execute(runnableC0506h0);
                                        return;
                                    } catch (Throwable th3) {
                                        C0509i0.f7239g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                return;
        }
    }
}
