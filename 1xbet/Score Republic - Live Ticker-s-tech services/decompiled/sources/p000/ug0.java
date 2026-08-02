package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7818j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ wg0 f7819k;

    public /* synthetic */ ug0(wg0 wg0Var, int i) {
        this.f7818j = i;
        this.f7819k = wg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wg0 wg0Var;
        boolean z;
        long jNextLong;
        boolean z2 = true;
        switch (this.f7818j) {
            case 0:
                synchronized (this.f7819k) {
                    try {
                        wg0Var = this.f7819k;
                        if (wg0Var.f8541d != 6) {
                            wg0Var.f8541d = 6;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z2) {
                    ((ot0) wg0Var.f8540c.f5551k).m3782q(ja1.f3883m.m2840h("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f7819k) {
                    try {
                        wg0 wg0Var2 = this.f7819k;
                        wg0Var2.f8543f = null;
                        int i = wg0Var2.f8541d;
                        if (i == 2) {
                            wg0Var2.f8541d = 4;
                            wg0Var2.f8542e = wg0Var2.f8538a.schedule(wg0Var2.f8544g, wg0Var2.f8547j, TimeUnit.NANOSECONDS);
                            z = true;
                        } else {
                            if (i == 3) {
                                wg0Var2.f8543f = wg0Var2.f8538a.schedule(wg0Var2.f8545h, wg0Var2.f8546i - wg0Var2.f8539b.m3509a(), TimeUnit.NANOSECONDS);
                                this.f7819k.f8541d = 2;
                            }
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (z) {
                    nu1 nu1Var = this.f7819k.f8540c;
                    ot0 ot0Var = (ot0) nu1Var.f5551k;
                    vg0 vg0Var = new vg0(nu1Var);
                    EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
                    synchronized (ot0Var.f5895k) {
                        try {
                            a90.m133q(ot0Var.f5893i != null);
                            if (ot0Var.f5909y) {
                                ka1 ka1VarM3777k = ot0Var.m3777k();
                                Logger logger = qb0.f6450g;
                                try {
                                    enumC0113ct.execute(new pb0(vg0Var, ka1VarM3777k));
                                    break;
                                } catch (Throwable th3) {
                                    qb0.f6450g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                                }
                                return;
                            }
                            qb0 qb0Var = ot0Var.f5908x;
                            if (qb0Var != null) {
                                jNextLong = 0;
                                z2 = false;
                            } else {
                                jNextLong = ot0Var.f5888d.nextLong();
                                na1 na1Var = (na1) ot0Var.f5889e.get();
                                na1Var.m3510b();
                                qb0 qb0Var2 = new qb0(jNextLong, na1Var);
                                ot0Var.f5908x = qb0Var2;
                                ot0Var.f5881L.getClass();
                                qb0Var = qb0Var2;
                            }
                            if (z2) {
                                ot0Var.f5893i.m4002i((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            synchronized (qb0Var) {
                                try {
                                    if (!qb0Var.f6454d) {
                                        qb0Var.f6453c.put(vg0Var, enumC0113ct);
                                        return;
                                    }
                                    ka1 ka1Var = qb0Var.f6455e;
                                    pb0 pb0Var = ka1Var != null ? new pb0(vg0Var, ka1Var) : new pb0(vg0Var, qb0Var.f6456f);
                                    try {
                                        enumC0113ct.execute(pb0Var);
                                        return;
                                    } catch (Throwable th4) {
                                        qb0.f6450g.log(Level.SEVERE, "Failed to execute PingCallback", th4);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                return;
        }
    }
}
