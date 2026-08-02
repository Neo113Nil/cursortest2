package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 extends zo1 {
    private static final wy1 zzp;
    private static volatile cq1 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private rp1 zzm;
    private rp1 zzn;
    private String zzo;

    static {
        wy1 wy1Var = new wy1();
        zzp = wy1Var;
        zo1.m5960o(wy1.class, wy1Var);
    }

    public wy1() {
        rp1 rp1Var = rp1.f6937k;
        this.zzm = rp1Var;
        this.zzn = rp1Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    /* JADX INFO: renamed from: Y */
    public static oy1 m5424Y() {
        return (oy1) zzp.m5968j();
    }

    /* JADX INFO: renamed from: Z */
    public static wy1 m5425Z() {
        return zzp;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m5426A() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5427B(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: C */
    public final rp1 m5428C() {
        rp1 rp1Var = this.zzm;
        if (!rp1Var.f6938j) {
            this.zzm = rp1Var.m4394a();
        }
        return this.zzm;
    }

    /* JADX INFO: renamed from: D */
    public final rp1 m5429D() {
        rp1 rp1Var = this.zzn;
        if (!rp1Var.f6938j) {
            this.zzn = rp1Var.m4394a();
        }
        return this.zzn;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5430E(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m5431F() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m5432G() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final String m5433H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m5434I() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final String m5435J() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m5436K() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final String m5437L() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m5438M() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final long m5439N() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m5440O() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final String m5441P() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5442Q() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: R */
    public final String m5443R() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m5444S() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final String m5445T() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m5446U() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: V */
    public final long m5447V() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m5448W() {
        return (this.zzb & 256) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final String m5449X() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m5450a0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m5451b0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m5452c0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m5453d0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m5454e0(String str) {
        this.zzb |= 4;
        this.zzg = str;
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
            return new gq1(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", qy1.f6635a, "zzn", sy1.f7233a, "zzo"});
        }
        if (i2 == 3) {
            return new wy1();
        }
        if (i2 == 4) {
            return new oy1(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzq;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (wy1.class) {
            try {
                yo1Var = zzq;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzp);
                    zzq = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m5455t() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m5456u(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m5457v(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m5458w() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m5459x(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m5460y() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m5461z(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }
}
