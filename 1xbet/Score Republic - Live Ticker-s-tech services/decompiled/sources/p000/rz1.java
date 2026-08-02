package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rz1 extends zo1 {
    private static final rz1 zzm;
    private static volatile cq1 zzn;
    private int zzb;
    private kp1 zze = fq1.f2476n;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        rz1 rz1Var = new rz1();
        zzm = rz1Var;
        zo1.m5960o(rz1.class, rz1Var);
    }

    /* JADX INFO: renamed from: J */
    public static qz1 m4439J() {
        return (qz1) zzm.m5968j();
    }

    /* JADX INFO: renamed from: A */
    public final long m4440A() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m4441B() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final long m4442C() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4443D() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m4444E() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4445F() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final long m4446G() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m4447H() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final long m4448I() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4449K(int i, wz1 wz1Var) {
        m4460u();
        this.zze.set(i, wz1Var);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4450L(wz1 wz1Var) {
        wz1Var.getClass();
        m4460u();
        this.zze.add(wz1Var);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4451M(Iterable iterable) {
        m4460u();
        do1.m1273d(iterable, this.zze);
    }

    /* JADX INFO: renamed from: N */
    public final void m4452N() {
        this.zze = fq1.f2476n;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4453O(int i) {
        m4460u();
        this.zze.remove(i);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4454P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m4455Q(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m4456R(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4457S(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4458T(long j) {
        this.zzb |= 32;
        this.zzk = j;
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
            return new gq1(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", wz1.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new rz1();
        }
        if (i2 == 4) {
            return new qz1(zzm);
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
        synchronized (rz1.class) {
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
    public final /* synthetic */ void m4459t(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: u */
    public final void m4460u() {
        kp1 kp1Var = this.zze;
        if (((eo1) kp1Var).f2152j) {
            return;
        }
        this.zze = j11.m2775j(kp1Var);
    }

    /* JADX INFO: renamed from: v */
    public final List m4461v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final int m4462w() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: x */
    public final wz1 m4463x(int i) {
        return (wz1) this.zze.get(i);
    }

    /* JADX INFO: renamed from: y */
    public final String m4464y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m4465z() {
        return (this.zzb & 2) != 0;
    }
}
