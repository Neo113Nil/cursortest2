package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a52 extends zo1 {
    private static final a52 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private t42 zze;
    private u42 zzf;

    static {
        a52 a52Var = new a52();
        zzg = a52Var;
        zo1.m5960o(a52.class, a52Var);
    }

    /* JADX INFO: renamed from: v */
    public static a52 m26v(byte[] bArr, so1 so1Var) {
        return (a52) zo1.m5958e(zzg, bArr, so1Var);
    }

    /* JADX INFO: renamed from: w */
    public static z42 m27w() {
        return (z42) zzg.m5968j();
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new a52();
        }
        if (i2 == 4) {
            return new z42(zzg);
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
        synchronized (a52.class) {
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
    public final t42 m28t() {
        t42 t42Var = this.zze;
        return t42Var == null ? t42.m4672H() : t42Var;
    }

    /* JADX INFO: renamed from: u */
    public final u42 m29u() {
        u42 u42Var = this.zzf;
        return u42Var == null ? u42.m4888t() : u42Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m30x(t42 t42Var) {
        this.zze = t42Var;
        this.zzb |= 1;
    }
}
