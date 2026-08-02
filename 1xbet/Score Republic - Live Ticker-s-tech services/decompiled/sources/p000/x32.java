package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x32 extends zo1 {
    private static final x32 zzh;
    private static volatile cq1 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        x32 x32Var = new x32();
        zzh = x32Var;
        zo1.m5960o(x32.class, x32Var);
    }

    /* JADX INFO: renamed from: A */
    public static x32 m5500A() {
        return zzh;
    }

    /* JADX INFO: renamed from: z */
    public static w32 m5501z() {
        return (w32) zzh.m5968j();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5502B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5503C(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m5504D(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5505E(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m5506F(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m5507G(jo1 jo1Var) {
        jo1Var.getClass();
        this.zze = 5;
        this.zzf = jo1Var;
    }

    /* JADX INFO: renamed from: H */
    public final int m5508H() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
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
            return new gq1(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new x32();
        }
        if (i2 == 4) {
            return new w32(zzh);
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
        synchronized (x32.class) {
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
    public final String m5509t() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: u */
    public final long m5510u() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5511v() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final double m5512w() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x */
    public final String m5513x() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    /* JADX INFO: renamed from: y */
    public final ko1 m5514y() {
        return this.zze == 5 ? (ko1) this.zzf : ko1.f4486k;
    }
}
