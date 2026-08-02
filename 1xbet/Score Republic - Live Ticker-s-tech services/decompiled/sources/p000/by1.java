package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 extends zo1 {
    private static final by1 zzw;
    private static volatile cq1 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private kp1 zzh;
    private kp1 zzi;
    private kp1 zzj;
    private String zzk;
    private boolean zzl;
    private kp1 zzm;
    private kp1 zzn;
    private String zzo;
    private String zzp;
    private sx1 zzq;
    private fy1 zzr;
    private my1 zzs;
    private hy1 zzt;
    private dy1 zzu;
    private fp1 zzv;

    static {
        by1 by1Var = new by1();
        zzw = by1Var;
        zo1.m5960o(by1.class, by1Var);
    }

    public by1() {
        fq1 fq1Var = fq1.f2476n;
        this.zzh = fq1Var;
        this.zzi = fq1Var;
        this.zzj = fq1Var;
        this.zzk = "";
        this.zzm = fq1Var;
        this.zzn = fq1Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = ap1.f589n;
    }

    /* JADX INFO: renamed from: K */
    public static zx1 m799K() {
        return (zx1) zzw.m5968j();
    }

    /* JADX INFO: renamed from: L */
    public static by1 m800L() {
        return zzw;
    }

    /* JADX INFO: renamed from: A */
    public final List m801A() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: B */
    public final kp1 m802B() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: C */
    public final int m803C() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: D */
    public final kp1 m804D() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: E */
    public final String m805E() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m806F() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final sx1 m807G() {
        sx1 sx1Var = this.zzq;
        return sx1Var == null ? sx1.m4600z() : sx1Var;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m808H() {
        return (this.zzb & 512) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final my1 m809I() {
        my1 my1Var = this.zzs;
        return my1Var == null ? my1.m3448v() : my1Var;
    }

    /* JADX INFO: renamed from: J */
    public final fp1 m810J() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: M */
    public final void m811M(int i, xx1 xx1Var) {
        kp1 kp1Var = this.zzi;
        if (!((eo1) kp1Var).f2152j) {
            this.zzi = j11.m2775j(kp1Var);
        }
        this.zzi.set(i, xx1Var);
    }

    /* JADX INFO: renamed from: N */
    public final void m812N() {
        this.zzj = fq1.f2476n;
    }

    /* JADX INFO: renamed from: O */
    public final void m813O() {
        this.zzm = fq1.f2476n;
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
            return new gq1(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", jy1.class, "zzi", xx1.class, "zzj", tw1.class, "zzk", "zzl", "zzm", a12.class, "zzn", ux1.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new by1();
        }
        if (i2 == 4) {
            return new zx1(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzx;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (by1.class) {
            try {
                yo1Var = zzx;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzw);
                    zzx = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m814t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final long m815u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m816v() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m817w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final kp1 m818x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final int m819y() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: z */
    public final xx1 m820z(int i) {
        return (xx1) this.zzi.get(i);
    }
}
