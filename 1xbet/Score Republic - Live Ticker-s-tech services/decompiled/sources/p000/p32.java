package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p32 extends zo1 {
    private static final p32 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        p32 p32Var = new p32();
        zzg = p32Var;
        zo1.m5960o(p32.class, p32Var);
    }

    /* JADX INFO: renamed from: t */
    public static o32 m3844t() {
        return (o32) zzg.m5968j();
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new p32();
        }
        if (i2 == 4) {
            return new o32(zzg);
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
        synchronized (p32.class) {
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

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3845u(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m3846v(int i) {
        if (i == 1) {
            C0270h1.m2190f("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }
}
