package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m02 extends zo1 {
    private static final m02 zzh;
    private static volatile cq1 zzi;
    private jp1 zzb;
    private jp1 zze;
    private kp1 zzf;
    private kp1 zzg;

    static {
        m02 m02Var = new m02();
        zzh = m02Var;
        zo1.m5960o(m02.class, m02Var);
    }

    public m02() {
        pp1 pp1Var = pp1.f6230n;
        this.zzb = pp1Var;
        this.zze = pp1Var;
        fq1 fq1Var = fq1.f2476n;
        this.zzf = fq1Var;
        this.zzg = fq1Var;
    }

    /* JADX INFO: renamed from: B */
    public static l02 m3296B() {
        return (l02) zzh.m5968j();
    }

    /* JADX INFO: renamed from: C */
    public static m02 m3297C() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final int m3298A() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: D */
    public final void m3299D(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((eo1) randomAccess).f2152j) {
            pp1 pp1Var = (pp1) randomAccess;
            int i = pp1Var.f6232l;
            this.zzb = pp1Var.mo460m(i + i);
        }
        do1.m1273d(iterable, this.zzb);
    }

    /* JADX INFO: renamed from: E */
    public final void m3300E() {
        this.zzb = pp1.f6230n;
    }

    /* JADX INFO: renamed from: F */
    public final void m3301F(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((eo1) randomAccess).f2152j) {
            pp1 pp1Var = (pp1) randomAccess;
            int i = pp1Var.f6232l;
            this.zze = pp1Var.mo460m(i + i);
        }
        do1.m1273d(list, this.zze);
    }

    /* JADX INFO: renamed from: G */
    public final void m3302G() {
        this.zze = pp1.f6230n;
    }

    /* JADX INFO: renamed from: H */
    public final void m3303H(ArrayList arrayList) {
        kp1 kp1Var = this.zzf;
        if (!((eo1) kp1Var).f2152j) {
            this.zzf = j11.m2775j(kp1Var);
        }
        do1.m1273d(arrayList, this.zzf);
    }

    /* JADX INFO: renamed from: I */
    public final void m3304I() {
        this.zzf = fq1.f2476n;
    }

    /* JADX INFO: renamed from: J */
    public final void m3305J(Iterable iterable) {
        kp1 kp1Var = this.zzg;
        if (!((eo1) kp1Var).f2152j) {
            this.zzg = j11.m2775j(kp1Var);
        }
        do1.m1273d(iterable, this.zzg);
    }

    /* JADX INFO: renamed from: K */
    public final void m3306K() {
        this.zzg = fq1.f2476n;
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
            return new gq1(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", pz1.class, "zzg", p02.class});
        }
        if (i2 == 3) {
            return new m02();
        }
        if (i2 == 4) {
            return new l02(zzh);
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
        synchronized (m02.class) {
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
    public final List m3307t() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: u */
    public final int m3308u() {
        return ((pp1) this.zzb).size();
    }

    /* JADX INFO: renamed from: v */
    public final List m3309v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final int m3310w() {
        return ((pp1) this.zze).size();
    }

    /* JADX INFO: renamed from: x */
    public final kp1 m3311x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final int m3312y() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: z */
    public final kp1 m3313z() {
        return this.zzg;
    }
}
