package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wz1 extends zo1 {
    private static final wz1 zzk;
    private static volatile cq1 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private kp1 zzj = fq1.f2476n;

    static {
        wz1 wz1Var = new wz1();
        zzk = wz1Var;
        zo1.m5960o(wz1.class, wz1Var);
    }

    /* JADX INFO: renamed from: F */
    public static uz1 m5463F() {
        return (uz1) zzk.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final float m5464A() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m5465B() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final double m5466C() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: D */
    public final kp1 m5467D() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: E */
    public final int m5468E() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m5469G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m5470H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m5471I() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m5472J(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m5473K() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m5474L(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m5475M() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: N */
    public final void m5476N(wz1 wz1Var) {
        kp1 kp1Var = this.zzj;
        if (!((eo1) kp1Var).f2152j) {
            this.zzj = j11.m2775j(kp1Var);
        }
        this.zzj.add(wz1Var);
    }

    /* JADX INFO: renamed from: O */
    public final void m5477O(ArrayList arrayList) {
        kp1 kp1Var = this.zzj;
        if (!((eo1) kp1Var).f2152j) {
            this.zzj = j11.m2775j(kp1Var);
        }
        do1.m1273d(arrayList, this.zzj);
    }

    /* JADX INFO: renamed from: P */
    public final void m5478P() {
        this.zzj = fq1.f2476n;
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
            return new gq1(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", wz1.class});
        }
        if (i2 == 3) {
            return new wz1();
        }
        if (i2 == 4) {
            return new uz1(zzk);
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
        synchronized (wz1.class) {
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
    public final boolean m5479t() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final String m5480u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5481v() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m5482w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5483x() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final long m5484y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5485z() {
        return (this.zzb & 8) != 0;
    }
}
