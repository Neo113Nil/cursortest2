package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fx1 extends zo1 {
    private static final fx1 zzi;
    private static volatile cq1 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private kp1 zzh = fq1.f2476n;

    static {
        fx1 fx1Var = new fx1();
        zzi = fx1Var;
        zo1.m5960o(fx1.class, fx1Var);
    }

    /* JADX INFO: renamed from: A */
    public static fx1 m1898A() {
        return zzi;
    }

    /* JADX INFO: renamed from: B */
    public final int m1899B() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
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
            return new gq1(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", yn1.f9409d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new fx1();
        }
        if (i2 == 4) {
            return new yw1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzj;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (fx1.class) {
            try {
                yo1Var = zzj;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzi);
                    zzj = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1900t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1901u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final String m1902v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1903w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1904x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final kp1 m1905y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final int m1906z() {
        return this.zzh.size();
    }
}
