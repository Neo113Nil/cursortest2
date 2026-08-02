package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 extends zo1 {
    private static final sx1 zzj;
    private static volatile cq1 zzk;
    private int zzb;
    private kp1 zze;
    private kp1 zzf;
    private kp1 zzg;
    private boolean zzh;
    private kp1 zzi;

    static {
        sx1 sx1Var = new sx1();
        zzj = sx1Var;
        zo1.m5960o(sx1.class, sx1Var);
    }

    public sx1() {
        fq1 fq1Var = fq1.f2476n;
        this.zze = fq1Var;
        this.zzf = fq1Var;
        this.zzg = fq1Var;
        this.zzi = fq1Var;
    }

    /* JADX INFO: renamed from: z */
    public static sx1 m4600z() {
        return zzj;
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
            return new gq1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", gx1.class, "zzf", hx1.class, "zzg", px1.class, "zzh", "zzi", gx1.class});
        }
        if (i2 == 3) {
            return new sx1();
        }
        if (i2 == 4) {
            return new yw1(zzj);
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
        synchronized (sx1.class) {
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
    public final List m4601t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final List m4602u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final List m4603v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4604w() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4605x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final kp1 m4606y() {
        return this.zzi;
    }
}
