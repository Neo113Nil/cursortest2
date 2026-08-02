package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 extends zo1 {
    private static final tw1 zzj;
    private static volatile cq1 zzk;
    private int zzb;
    private int zze;
    private kp1 zzf;
    private kp1 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        tw1 tw1Var = new tw1();
        zzj = tw1Var;
        zo1.m5960o(tw1.class, tw1Var);
    }

    public tw1() {
        fq1 fq1Var = fq1.f2476n;
        this.zzf = fq1Var;
        this.zzg = fq1Var;
    }

    /* JADX INFO: renamed from: A */
    public final vw1 m4855A(int i) {
        return (vw1) this.zzg.get(i);
    }

    /* JADX INFO: renamed from: B */
    public final void m4856B(int i, ex1 ex1Var) {
        kp1 kp1Var = this.zzf;
        if (!((eo1) kp1Var).f2152j) {
            this.zzf = j11.m2775j(kp1Var);
        }
        this.zzf.set(i, ex1Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m4857C(int i, vw1 vw1Var) {
        kp1 kp1Var = this.zzg;
        if (!((eo1) kp1Var).f2152j) {
            this.zzg = j11.m2775j(kp1Var);
        }
        this.zzg.set(i, vw1Var);
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
            return new gq1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", ex1.class, "zzg", vw1.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new tw1();
        }
        if (i2 == 4) {
            return new sw1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzk;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (tw1.class) {
            try {
                yo1Var = zzk;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzj);
                    zzk = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4858t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m4859u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final List m4860v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final int m4861w() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: x */
    public final ex1 m4862x(int i) {
        return (ex1) this.zzf.get(i);
    }

    /* JADX INFO: renamed from: y */
    public final kp1 m4863y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final int m4864z() {
        return this.zzg.size();
    }
}
