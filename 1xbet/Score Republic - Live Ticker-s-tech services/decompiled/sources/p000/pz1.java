package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 extends zo1 {
    private static final pz1 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        pz1 pz1Var = new pz1();
        zzg = pz1Var;
        zo1.m5960o(pz1.class, pz1Var);
    }

    /* JADX INFO: renamed from: x */
    public static oz1 m4015x() {
        return (oz1) zzg.m5968j();
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new pz1();
        }
        if (i2 == 4) {
            return new oz1(zzg);
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
        synchronized (pz1.class) {
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
    public final boolean m4016t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m4017u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4018v() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final long m4019w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m4020y(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m4021z(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }
}
