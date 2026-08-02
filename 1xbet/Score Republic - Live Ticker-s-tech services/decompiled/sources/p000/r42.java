package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r42 extends zo1 {
    private static final r42 zzf;
    private static volatile cq1 zzg;
    private int zzb;
    private boolean zze;

    static {
        r42 r42Var = new r42();
        zzf = r42Var;
        zo1.m5960o(r42.class, r42Var);
    }

    /* JADX INFO: renamed from: u */
    public static r42 m4243u() {
        return zzf;
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
            return new gq1(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new r42();
        }
        if (i2 == 4) {
            return new yw1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzg;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (r42.class) {
            try {
                yo1Var = zzg;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzf);
                    zzg = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4244t() {
        return this.zze;
    }
}
