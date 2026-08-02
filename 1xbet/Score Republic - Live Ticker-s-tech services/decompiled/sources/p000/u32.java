package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u32 extends zo1 {
    private static final u32 zzl;
    private static volatile cq1 zzm;
    private int zzb;
    private String zze = "";
    private ko1 zzf = ko1.f4486k;
    private String zzg = "";
    private kp1 zzh;
    private kp1 zzi;
    private boolean zzj;
    private long zzk;

    static {
        u32 u32Var = new u32();
        zzl = u32Var;
        zo1.m5960o(u32.class, u32Var);
    }

    public u32() {
        fq1 fq1Var = fq1.f2476n;
        this.zzh = fq1Var;
        this.zzi = fq1Var;
    }

    /* JADX INFO: renamed from: z */
    public static t32 m4874z() {
        return (t32) zzl.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m4875A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m4876B(jo1 jo1Var) {
        jo1Var.getClass();
        this.zzb |= 2;
        this.zzf = jo1Var;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m4877C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m4878D(x32 x32Var) {
        kp1 kp1Var = this.zzh;
        if (!((eo1) kp1Var).f2152j) {
            this.zzh = j11.m2775j(kp1Var);
        }
        this.zzh.add(x32Var);
    }

    /* JADX INFO: renamed from: E */
    public final void m4879E(String str) {
        str.getClass();
        kp1 kp1Var = this.zzi;
        if (!((eo1) kp1Var).f2152j) {
            this.zzi = j11.m2775j(kp1Var);
        }
        this.zzi.add(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4880F(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4881G(long j) {
        this.zzb |= 16;
        this.zzk = j;
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
            return new gq1(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", x32.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new u32();
        }
        if (i2 == 4) {
            return new t32(zzl);
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
        synchronized (u32.class) {
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
    public final String m4882t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4883u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final ko1 m4884v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final String m4885w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final kp1 m4886x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final long m4887y() {
        return this.zzk;
    }
}
