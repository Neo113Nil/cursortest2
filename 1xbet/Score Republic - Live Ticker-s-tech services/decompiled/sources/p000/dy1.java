package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends zo1 {
    private static final dy1 zze;
    private static volatile cq1 zzf;
    private kp1 zzb = fq1.f2476n;

    static {
        dy1 dy1Var = new dy1();
        zze = dy1Var;
        zo1.m5960o(dy1.class, dy1Var);
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
            return new gq1(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new dy1();
        }
        if (i2 == 4) {
            return new yw1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzf;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (dy1.class) {
            try {
                yo1Var = zzf;
                if (yo1Var == null) {
                    yo1Var = new yo1(zze);
                    zzf = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }
}
