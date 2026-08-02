package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 extends zo1 {
    private static final rw1 zzi;
    private static volatile cq1 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        rw1 rw1Var = new rw1();
        zzi = rw1Var;
        zo1.m5960o(rw1.class, rw1Var);
    }

    /* JADX INFO: renamed from: t */
    public static qw1 m4410t() {
        return (qw1) zzi.m5968j();
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
            return new gq1(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new rw1();
        }
        if (i2 == 4) {
            return new qw1(zzi);
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
        synchronized (rw1.class) {
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

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m4411u(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m4412v() {
        this.zzb |= 2;
        this.zzf = true;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m4413w(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m4414x(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
