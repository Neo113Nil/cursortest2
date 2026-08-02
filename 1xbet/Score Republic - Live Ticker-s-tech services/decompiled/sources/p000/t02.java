package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t02 extends zo1 {
    private static final t02 zzk;
    private static volatile cq1 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        t02 t02Var = new t02();
        zzk = t02Var;
        zo1.m5960o(t02.class, t02Var);
    }

    /* JADX INFO: renamed from: E */
    public static s02 m4628E() {
        return (s02) zzk.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4629A() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final float m4630B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m4631C() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final double m4632D() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4633F(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4634G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4635H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4636I() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4637J(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4638K() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4639L(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4640M() {
        this.zzb &= -33;
        this.zzj = 0.0d;
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
            return new gq1(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new t02();
        }
        if (i2 == 4) {
            return new s02(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzl;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (t02.class) {
            try {
                yo1Var = zzl;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzk);
                    zzl = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4641t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final long m4642u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final String m4643v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4644w() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final String m4645x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4646y() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final long m4647z() {
        return this.zzh;
    }
}
