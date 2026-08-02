package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends zo1 {
    private static final ex1 zzk;
    private static volatile cq1 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private xw1 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        ex1 ex1Var = new ex1();
        zzk = ex1Var;
        zo1.m5960o(ex1.class, ex1Var);
    }

    /* JADX INFO: renamed from: B */
    public static cx1 m1508B() {
        return (cx1) zzk.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1509A() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1510C(String str) {
        this.zzb |= 2;
        this.zzf = str;
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
            return new gq1(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new ex1();
        }
        if (i2 == 4) {
            return new cx1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzl;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (ex1.class) {
            try {
                yo1Var = zzl;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzk);
                    zzl = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1511t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m1512u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final String m1513v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final xw1 m1514w() {
        xw1 xw1Var = this.zzg;
        return xw1Var == null ? xw1.m5698B() : xw1Var;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1515x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1516y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1517z() {
        return (this.zzb & 32) != 0;
    }
}
