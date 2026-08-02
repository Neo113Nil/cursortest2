package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 extends zo1 {
    private static final p02 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private int zze;
    private jp1 zzf = pp1.f6230n;

    static {
        p02 p02Var = new p02();
        zzg = p02Var;
        zo1.m5960o(p02.class, p02Var);
    }

    /* JADX INFO: renamed from: y */
    public static o02 m3823y() {
        return (o02) zzg.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final void m3824A(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((eo1) randomAccess).f2152j) {
            pp1 pp1Var = (pp1) randomAccess;
            int i = pp1Var.f6232l;
            this.zzf = pp1Var.mo460m(i + i);
        }
        do1.m1273d(list, this.zzf);
    }

    @Override // p000.zo1
    /* JADX INFO: renamed from: s */
    public final Object mo14s(int i) {
        cq1 yo1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new p02();
        }
        if (i2 == 4) {
            return new o02(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzh;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (p02.class) {
            try {
                yo1Var = zzh;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzg);
                    zzh = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3825t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m3826u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final List m3827v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final int m3828w() {
        return ((pp1) this.zzf).size();
    }

    /* JADX INFO: renamed from: x */
    public final long m3829x(int i) {
        return ((pp1) this.zzf).m3972c(i);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m3830z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
