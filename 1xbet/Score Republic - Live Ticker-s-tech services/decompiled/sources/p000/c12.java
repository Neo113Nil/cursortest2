package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c12 extends zo1 {
    private static final c12 zzk;
    private static volatile cq1 zzl;
    private int zzb;
    private int zze;
    private kp1 zzf = fq1.f2476n;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        c12 c12Var = new c12();
        zzk = c12Var;
        zo1.m5960o(c12.class, c12Var);
    }

    /* JADX INFO: renamed from: A */
    public final double m833A() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: B */
    public final int m834B() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
            return new gq1(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", yn1.f9421p, "zzf", c12.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new c12();
        }
        if (i2 == 4) {
            return new yw1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzl;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (c12.class) {
            try {
                yo1Var = zzl;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzk);
                    zzl = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final List m835t() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: u */
    public final String m836u() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m837v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m838w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m839x() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m840y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m841z() {
        return (this.zzb & 16) != 0;
    }
}
