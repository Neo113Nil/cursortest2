package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends zo1 {
    private static final xw1 zzi;
    private static volatile cq1 zzj;
    private int zzb;
    private fx1 zze;
    private ax1 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        xw1 xw1Var = new xw1();
        zzi = xw1Var;
        zo1.m5960o(xw1.class, xw1Var);
    }

    /* JADX INFO: renamed from: B */
    public static xw1 m5698B() {
        return zzi;
    }

    /* JADX INFO: renamed from: A */
    public final String m5699A() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5700C(String str) {
        this.zzb |= 8;
        this.zzh = str;
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
            return new gq1(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new xw1();
        }
        if (i2 == 4) {
            return new ww1(zzi);
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
        synchronized (xw1.class) {
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
    public final boolean m5701t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final fx1 m5702u() {
        fx1 fx1Var = this.zze;
        return fx1Var == null ? fx1.m1898A() : fx1Var;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5703v() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final ax1 m5704w() {
        ax1 ax1Var = this.zzf;
        return ax1Var == null ? ax1.m514C() : ax1Var;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5705x() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5706y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5707z() {
        return (this.zzb & 8) != 0;
    }
}
