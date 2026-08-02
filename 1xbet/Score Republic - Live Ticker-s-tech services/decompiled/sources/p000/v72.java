package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 extends zo1 {
    private static final v72 zzj;
    private static volatile cq1 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private ko1 zzf = ko1.f4486k;
    private String zzg = "";
    private kp1 zzi = fq1.f2476n;

    static {
        v72 v72Var = new v72();
        zzj = v72Var;
        zo1.m5960o(v72.class, v72Var);
    }

    /* JADX INFO: renamed from: A */
    public static v72 m5112A() {
        return zzj;
    }

    /* JADX INFO: renamed from: z */
    public static u72 m5113z() {
        return (u72) zzj.m5968j();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5114B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5115C(ko1 ko1Var) {
        ko1Var.getClass();
        this.zzb |= 2;
        this.zzf = ko1Var;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m5116D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5117E(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: F */
    public final void m5118F(x72 x72Var) {
        kp1 kp1Var = this.zzi;
        if (!((eo1) kp1Var).f2152j) {
            this.zzi = j11.m2775j(kp1Var);
        }
        this.zzi.add(x72Var);
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
            return new gq1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", x72.class});
        }
        if (i2 == 3) {
            return new v72();
        }
        if (i2 == 4) {
            return new u72(zzj);
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
        synchronized (v72.class) {
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
    public final String m5119t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final ko1 m5120u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final String m5121v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final long m5122w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final kp1 m5123x() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: y */
    public final int m5124y() {
        return this.zzi.size();
    }
}
