package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 extends zo1 {
    private static final ax1 zzj;
    private static volatile cq1 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        ax1 ax1Var = new ax1();
        zzj = ax1Var;
        zo1.m5960o(ax1.class, ax1Var);
    }

    /* JADX INFO: renamed from: C */
    public static ax1 m514C() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m515A() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final String m516B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: D */
    public final int m517D() {
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
            return new gq1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", yn1.f9408c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new ax1();
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
        synchronized (ax1.class) {
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
    public final boolean m518t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m519u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m520v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m521w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final String m522x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m523y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m524z() {
        return this.zzh;
    }
}
