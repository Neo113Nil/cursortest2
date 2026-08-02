package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends zo1 {
    private static final cz1 zzl;
    private static volatile cq1 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        cz1 cz1Var = new cz1();
        zzl = cz1Var;
        zo1.m5960o(cz1.class, cz1Var);
    }

    /* JADX INFO: renamed from: A */
    public static az1 m1051A() {
        return (az1) zzl.m5968j();
    }

    /* JADX INFO: renamed from: B */
    public static cz1 m1052B() {
        return zzl;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1053C(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1054D(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m1055E(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m1056F(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m1057G(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m1058H(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m1059I(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
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
            return new gq1(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new cz1();
        }
        if (i2 == 4) {
            return new az1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzm;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (cz1.class) {
            try {
                yo1Var = zzm;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzl);
                    zzm = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1060t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1061u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1062v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1063w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1064x() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1065y() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1066z() {
        return this.zzk;
    }
}
