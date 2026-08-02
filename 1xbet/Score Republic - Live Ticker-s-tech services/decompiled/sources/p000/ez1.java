package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 extends zo1 {
    private static final ez1 zzi;
    private static volatile cq1 zzj;
    private int zzb;
    private int zze;
    private m02 zzf;
    private m02 zzg;
    private boolean zzh;

    static {
        ez1 ez1Var = new ez1();
        zzi = ez1Var;
        zo1.m5960o(ez1.class, ez1Var);
    }

    /* JADX INFO: renamed from: A */
    public static dz1 m1528A() {
        return (dz1) zzi.m5968j();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m1529B(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1530C(m02 m02Var) {
        this.zzf = m02Var;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1531D(m02 m02Var) {
        this.zzg = m02Var;
        this.zzb |= 4;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m1532E(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
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
            return new gq1(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new ez1();
        }
        if (i2 == 4) {
            return new dz1(zzi);
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
        synchronized (ez1.class) {
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
    public final boolean m1533t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m1534u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final m02 m1535v() {
        m02 m02Var = this.zzf;
        return m02Var == null ? m02.m3297C() : m02Var;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1536w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final m02 m1537x() {
        m02 m02Var = this.zzg;
        return m02Var == null ? m02.m3297C() : m02Var;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1538y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1539z() {
        return this.zzh;
    }
}
