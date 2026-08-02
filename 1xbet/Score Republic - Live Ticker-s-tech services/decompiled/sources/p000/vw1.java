package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 extends zo1 {
    private static final vw1 zzm;
    private static volatile cq1 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private kp1 zzg = fq1.f2476n;
    private boolean zzh;
    private ax1 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        vw1 vw1Var = new vw1();
        zzm = vw1Var;
        zo1.m5960o(vw1.class, vw1Var);
    }

    /* JADX INFO: renamed from: F */
    public static uw1 m5202F() {
        return (uw1) zzm.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final ax1 m5203A() {
        ax1 ax1Var = this.zzi;
        return ax1Var == null ? ax1.m514C() : ax1Var;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m5204B() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m5205C() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5206D() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m5207E() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m5208G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: H */
    public final void m5209H(int i, xw1 xw1Var) {
        kp1 kp1Var = this.zzg;
        if (!((eo1) kp1Var).f2152j) {
            this.zzg = j11.m2775j(kp1Var);
        }
        this.zzg.set(i, xw1Var);
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
            return new gq1(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", xw1.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new vw1();
        }
        if (i2 == 4) {
            return new uw1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzn;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (vw1.class) {
            try {
                yo1Var = zzn;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzm);
                    zzn = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5210t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m5211u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final String m5212v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final List m5213w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: x */
    public final int m5214x() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: y */
    public final xw1 m5215y(int i) {
        return (xw1) this.zzg.get(i);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5216z() {
        return (this.zzb & 8) != 0;
    }
}
