package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends zo1 {
    private static final my1 zzj;
    private static volatile cq1 zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        my1 my1Var = new my1();
        zzj = my1Var;
        zo1.m5960o(my1.class, my1Var);
    }

    /* JADX INFO: renamed from: v */
    public static my1 m3448v() {
        return zzj;
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
            return new gq1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new my1();
        }
        if (i2 == 4) {
            return new yw1(zzj);
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
        synchronized (my1.class) {
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
    public final int m3449t() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: u */
    public final String m3450u() {
        return this.zzi;
    }
}
