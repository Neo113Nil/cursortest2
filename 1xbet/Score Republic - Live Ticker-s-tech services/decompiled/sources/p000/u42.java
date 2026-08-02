package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 extends zo1 {
    private static final u42 zzo;
    private static volatile cq1 zzp;
    private int zzb;
    private boolean zzf;
    private kp1 zzh;
    private kp1 zzi;
    private fp1 zzj;
    private x42 zzk;
    private boolean zzl;
    private boolean zzm;
    private r42 zzn;
    private ko1 zze = ko1.f4486k;
    private String zzg = "";

    static {
        u42 u42Var = new u42();
        zzo = u42Var;
        zo1.m5960o(u42.class, u42Var);
    }

    public u42() {
        fq1 fq1Var = fq1.f2476n;
        this.zzh = fq1Var;
        this.zzi = fq1Var;
        this.zzj = ap1.f589n;
    }

    /* JADX INFO: renamed from: t */
    public static u42 m4888t() {
        return zzo;
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
            return new gq1(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", yn1.f9407b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new u42();
        }
        if (i2 == 4) {
            return new yw1(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzp;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (u42.class) {
            try {
                yo1Var = zzp;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzo);
                    zzp = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }
}
