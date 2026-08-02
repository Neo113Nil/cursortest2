package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends zo1 {
    private static final kz1 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        kz1 kz1Var = new kz1();
        zzg = kz1Var;
        zo1.m5960o(kz1.class, kz1Var);
    }

    /* JADX INFO: renamed from: t */
    public static jz1 m3128t() {
        return (jz1) zzg.m5968j();
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", yn1.f9414i, "zzf", yn1.f9415j});
        }
        if (i2 == 3) {
            return new kz1();
        }
        if (i2 == 4) {
            return new jz1(zzg);
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
        synchronized (kz1.class) {
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

    /* JADX INFO: renamed from: u */
    public final int m3129u() {
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

    /* JADX INFO: renamed from: v */
    public final int m3130v() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m3131w(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m3132x(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
