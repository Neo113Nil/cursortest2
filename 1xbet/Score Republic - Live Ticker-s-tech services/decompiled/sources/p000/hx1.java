package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 extends zo1 {
    private static final hx1 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        hx1 hx1Var = new hx1();
        zzg = hx1Var;
        zo1.m5960o(hx1.class, hx1Var);
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
            yn1 yn1Var = yn1.f9411f;
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", yn1Var, "zzf", yn1Var});
        }
        if (i2 == 3) {
            return new hx1();
        }
        if (i2 == 4) {
            return new yw1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzh;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (hx1.class) {
            try {
                yo1Var = zzh;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzg);
                    zzh = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final int m2347t() {
        int iM5365n = wm1.m5365n(this.zze);
        if (iM5365n == 0) {
            return 1;
        }
        return iM5365n;
    }

    /* JADX INFO: renamed from: u */
    public final int m2348u() {
        int iM5365n = wm1.m5365n(this.zzf);
        if (iM5365n == 0) {
            return 1;
        }
        return iM5365n;
    }
}
