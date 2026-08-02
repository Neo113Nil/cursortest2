package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t42 extends zo1 {
    private static final gp1 zzl = new zw1(6);
    private static final t42 zzq;
    private static volatile cq1 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private kp1 zzi;
    private kp1 zzj;
    private fp1 zzk;
    private x42 zzm;
    private boolean zzn;
    private boolean zzo;
    private r42 zzp;
    private ko1 zze = ko1.f4486k;
    private String zzg = "";

    static {
        t42 t42Var = new t42();
        zzq = t42Var;
        zo1.m5960o(t42.class, t42Var);
    }

    public t42() {
        fq1 fq1Var = fq1.f2476n;
        this.zzi = fq1Var;
        this.zzj = fq1Var;
        this.zzk = ap1.f589n;
    }

    /* JADX INFO: renamed from: G */
    public static s42 m4671G() {
        return (s42) zzq.m5968j();
    }

    /* JADX INFO: renamed from: H */
    public static t42 m4672H() {
        return zzq;
    }

    /* JADX INFO: renamed from: A */
    public final List m4673A() {
        return new hp1(this.zzk, zzl);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m4674B() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final x42 m4675C() {
        x42 x42Var = this.zzm;
        return x42Var == null ? x42.m5524v() : x42Var;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4676D() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4677E() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: F */
    public final r42 m4678F() {
        r42 r42Var = this.zzp;
        return r42Var == null ? r42.m4243u() : r42Var;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4679I(long j) {
        this.zzb |= 8;
        this.zzh = j;
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
            return new gq1(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", yn1.f9407b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new t42();
        }
        if (i2 == 4) {
            return new s42(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzr;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (t42.class) {
            try {
                yo1Var = zzr;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzq);
                    zzr = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4680t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final ko1 m4681u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4682v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final String m4683w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final long m4684x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final kp1 m4685y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: z */
    public final kp1 m4686z() {
        return this.zzj;
    }
}
