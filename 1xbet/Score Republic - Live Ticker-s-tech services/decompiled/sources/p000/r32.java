package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 extends zo1 {
    private static final r32 zzh;
    private static volatile cq1 zzi;
    private int zzb;
    private p32 zzf;
    private String zze = "";
    private String zzg = "";

    static {
        r32 r32Var = new r32();
        zzh = r32Var;
        zo1.m5960o(r32.class, r32Var);
    }

    /* JADX INFO: renamed from: u */
    public static m32 m4238u() {
        return (m32) zzh.m5968j();
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
            return new gq1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new r32();
        }
        if (i2 == 4) {
            return new m32(zzh);
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
        synchronized (r32.class) {
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
    public final String m4239t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m4240v(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m4241w(p32 p32Var) {
        this.zzf = p32Var;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m4242x(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
