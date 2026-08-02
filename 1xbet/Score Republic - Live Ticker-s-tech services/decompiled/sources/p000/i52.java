package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i52 extends zo1 {
    private static final i52 zze;
    private static volatile cq1 zzf;
    private rp1 zzb = rp1.f6937k;

    static {
        i52 i52Var = new i52();
        zze = i52Var;
        zo1.m5960o(i52.class, i52Var);
    }

    /* JADX INFO: renamed from: u */
    public static i52 m2530u() {
        return zze;
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
            return new gq1(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", f52.f2315a});
        }
        if (i2 == 3) {
            return new i52();
        }
        if (i2 == 4) {
            return new g52(zze);
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
        synchronized (i52.class) {
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

    /* JADX INFO: renamed from: t */
    public final d52 m2531t(String str, d52 d52Var) {
        str.getClass();
        d52 d52Var2 = (d52) this.zzb.get(str);
        return d52Var2 != null ? d52Var2 : d52Var;
    }

    /* JADX INFO: renamed from: v */
    public final rp1 m2532v() {
        rp1 rp1Var = this.zzb;
        if (!rp1Var.f6938j) {
            this.zzb = rp1Var.m4394a();
        }
        return this.zzb;
    }
}
