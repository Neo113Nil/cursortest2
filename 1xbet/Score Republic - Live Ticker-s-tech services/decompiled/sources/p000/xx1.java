package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xx1 extends zo1 {
    private static final xx1 zzi;
    private static volatile cq1 zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        xx1 xx1Var = new xx1();
        zzi = xx1Var;
        zo1.m5960o(xx1.class, xx1Var);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m5708A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
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
            return new gq1(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new xx1();
        }
        if (i2 == 4) {
            return new wx1(zzi);
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
        synchronized (xx1.class) {
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
    public final String m5709t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5710u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5711v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5712w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5713x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5714y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m5715z() {
        return this.zzh;
    }
}
