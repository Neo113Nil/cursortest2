package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b31 extends o80 {

    /* JADX INFO: renamed from: n */
    public final i31 f700n;

    /* JADX INFO: renamed from: o */
    public long f701o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ zk0 f702p;

    public b31(zk0 zk0Var, i31 i31Var) {
        this.f702p = zk0Var;
        this.f700n = i31Var;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: z */
    public final void mo586z(long j) {
        if (this.f702p.f9846x.f1936f != null) {
            return;
        }
        synchronized (this.f702p.f9840r) {
            try {
                if (this.f702p.f9846x.f1936f == null) {
                    i31 i31Var = this.f700n;
                    if (!i31Var.f3419b) {
                        long j2 = this.f701o + j;
                        this.f701o = j2;
                        zk0 zk0Var = this.f702p;
                        long j3 = zk0Var.f9821C;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > zk0Var.f9842t) {
                            i31Var.f3420c = true;
                        } else {
                            long jAddAndGet = ((AtomicLong) zk0Var.f9841s.f254k).addAndGet(j2 - j3);
                            zk0 zk0Var2 = this.f702p;
                            zk0Var2.f9821C = this.f701o;
                            if (jAddAndGet > zk0Var2.f9843u) {
                                this.f700n.f3420c = true;
                            }
                        }
                        i31 i31Var2 = this.f700n;
                        u21 u21VarM5926b = i31Var2.f3420c ? this.f702p.m5926b(i31Var2) : null;
                        if (u21VarM5926b != null) {
                            u21VarM5926b.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
