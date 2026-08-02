package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x72 extends zo1 {
    private static final x72 zzh;
    private static volatile cq1 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        x72 x72Var = new x72();
        zzh = x72Var;
        zo1.m5960o(x72.class, x72Var);
    }

    /* JADX INFO: renamed from: z */
    public static w72 m5593z() {
        return (w72) zzh.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m5594A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5595B(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5596C(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m5597D(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5598E(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m5599F(ko1 ko1Var) {
        ko1Var.getClass();
        this.zze = 6;
        this.zzf = ko1Var;
    }

    /* JADX INFO: renamed from: G */
    public final int m5600G() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
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
            return new gq1(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new x72();
        }
        if (i2 == 4) {
            return new w72(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzi;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (x72.class) {
            try {
                yo1Var = zzi;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzh);
                    zzi = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final String m5601t() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: u */
    public final long m5602u() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5603v() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final double m5604w() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x */
    public final String m5605x() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    /* JADX INFO: renamed from: y */
    public final ko1 m5606y() {
        return this.zze == 6 ? (ko1) this.zzf : ko1.f4486k;
    }
}
