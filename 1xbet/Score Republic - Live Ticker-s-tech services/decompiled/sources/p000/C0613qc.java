package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: qc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0613qc implements pi1 {

    /* JADX INFO: renamed from: j */
    public Object f6461j = AbstractC0724tc.f7426p;

    /* JADX INFO: renamed from: k */
    public C0136df f6462k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0650rc f6463l;

    public C0613qc(C0650rc c0650rc) {
        this.f6463l = c0650rc;
    }

    @Override // p000.pi1
    /* JADX INFO: renamed from: a */
    public final void mo474a(g61 g61Var, int i) {
        C0136df c0136df = this.f6462k;
        if (c0136df != null) {
            c0136df.mo474a(g61Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m4054b(v10 v10Var) throws Throwable {
        C0061bg c0061bg;
        C0061bg c0061bg2;
        Object obj = this.f6461j;
        boolean z = true;
        if (obj == AbstractC0724tc.f7426p || obj == AbstractC0724tc.f7422l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0650rc.f6807p;
            C0650rc c0650rc = this.f6463l;
            C0061bg c0061bg3 = (C0061bg) atomicReferenceFieldUpdater.get(c0650rc);
            while (!c0650rc.m4334w(true, C0650rc.f6802k.get(c0650rc))) {
                long andIncrement = C0650rc.f6803l.getAndIncrement(c0650rc);
                long j = AbstractC0724tc.f7412b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c0061bg3.f2635e != j2) {
                    C0061bg c0061bgM4326n = c0650rc.m4326n(j2, c0061bg3);
                    if (c0061bgM4326n == null) {
                        continue;
                    } else {
                        c0061bg = c0061bgM4326n;
                    }
                } else {
                    c0061bg = c0061bg3;
                }
                Object objM4314I = c0650rc.m4314I(c0061bg, i, andIncrement, null);
                g72 g72Var = AbstractC0724tc.f7423m;
                if (objM4314I == g72Var) {
                    C0270h1.m2191g("unreachable");
                    return null;
                }
                g72 g72Var2 = AbstractC0724tc.f7425o;
                if (objM4314I == g72Var2) {
                    if (andIncrement < c0650rc.m4331s()) {
                        c0061bg.m951a();
                    }
                    c0061bg3 = c0061bg;
                } else {
                    if (objM4314I == AbstractC0724tc.f7424n) {
                        C0136df c0136dfM3650l = o80.m3650l(d71.m1111f(v10Var));
                        try {
                            this.f6462k = c0136dfM3650l;
                            Object objM4314I2 = c0650rc.m4314I(c0061bg, i, andIncrement, this);
                            if (objM4314I2 == g72Var) {
                                mo474a(c0061bg, i);
                            } else {
                                if (objM4314I2 == g72Var2) {
                                    if (andIncrement < c0650rc.m4331s()) {
                                        c0061bg.m951a();
                                    }
                                    C0061bg c0061bg4 = (C0061bg) C0650rc.f6807p.get(c0650rc);
                                    while (true) {
                                        if (c0650rc.m4334w(true, C0650rc.f6802k.get(c0650rc))) {
                                            C0136df c0136df = this.f6462k;
                                            c0136df.getClass();
                                            this.f6462k = null;
                                            this.f6461j = AbstractC0724tc.f7422l;
                                            Throwable thM4328p = c0650rc.m4328p();
                                            if (thM4328p == null) {
                                                c0136df.mo476f(Boolean.FALSE);
                                            } else {
                                                c0136df.mo476f(new o21(thM4328p));
                                            }
                                        } else {
                                            long andIncrement2 = C0650rc.f6803l.getAndIncrement(c0650rc);
                                            long j3 = AbstractC0724tc.f7412b;
                                            long j4 = andIncrement2 / j3;
                                            int i2 = (int) (andIncrement2 % j3);
                                            if (c0061bg4.f2635e != j4) {
                                                C0061bg c0061bgM4326n2 = c0650rc.m4326n(j4, c0061bg4);
                                                if (c0061bgM4326n2 != null) {
                                                    c0061bg2 = c0061bgM4326n2;
                                                }
                                            } else {
                                                c0061bg2 = c0061bg4;
                                            }
                                            Object objM4314I3 = c0650rc.m4314I(c0061bg2, i2, andIncrement2, this);
                                            C0061bg c0061bg5 = c0061bg2;
                                            if (objM4314I3 == AbstractC0724tc.f7423m) {
                                                mo474a(c0061bg5, i2);
                                            } else {
                                                if (objM4314I3 != AbstractC0724tc.f7425o) {
                                                    if (objM4314I3 == AbstractC0724tc.f7424n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c0061bg5.m951a();
                                                    this.f6461j = objM4314I3;
                                                    this.f6462k = null;
                                                    break;
                                                }
                                                if (andIncrement2 < c0650rc.m4331s()) {
                                                    c0061bg5.m951a();
                                                }
                                                c0061bg4 = c0061bg5;
                                            }
                                        }
                                    }
                                } else {
                                    c0061bg.m951a();
                                    this.f6461j = objM4314I2;
                                    this.f6462k = null;
                                }
                                c0136dfM3650l.m1178E(Boolean.TRUE, null);
                            }
                            return c0136dfM3650l.m1195u();
                        } catch (Throwable th) {
                            c0136dfM3650l.m1176C();
                            throw th;
                        }
                    }
                    c0061bg.m951a();
                    this.f6461j = objM4314I;
                }
            }
            this.f6461j = AbstractC0724tc.f7422l;
            Throwable thM4328p2 = c0650rc.m4328p();
            if (thM4328p2 != null) {
                int i3 = v91.f8139a;
                throw thM4328p2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
