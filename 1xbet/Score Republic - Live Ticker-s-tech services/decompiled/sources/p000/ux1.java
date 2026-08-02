package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 extends zo1 {
    private static final ux1 zzh;
    private static volatile cq1 zzi;
    private int zzb;
    private String zze = "";
    private kp1 zzf = fq1.f2476n;
    private boolean zzg;

    static {
        ux1 ux1Var = new ux1();
        zzh = ux1Var;
        zo1.m5960o(ux1.class, ux1Var);
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
            return new gq1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", hy1.class, "zzg"});
        }
        if (i2 == 3) {
            return new ux1();
        }
        if (i2 == 4) {
            return new yw1(zzh);
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
        synchronized (ux1.class) {
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
    public final String m4957t() {
        return this.zze;
    }
}
