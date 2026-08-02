package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends zo1 {
    private static final mz1 zze;
    private static volatile cq1 zzf;
    private kp1 zzb = fq1.f2476n;

    static {
        mz1 mz1Var = new mz1();
        zze = mz1Var;
        zo1.m5960o(mz1.class, mz1Var);
    }

    /* JADX INFO: renamed from: u */
    public static gz1 m3451u() {
        return (gz1) zze.m5968j();
    }

    /* JADX INFO: renamed from: v */
    public static mz1 m3452v() {
        return zze;
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
            return new gq1(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", kz1.class});
        }
        if (i2 == 3) {
            return new mz1();
        }
        if (i2 == 4) {
            return new gz1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzf;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (mz1.class) {
            try {
                yo1Var = zzf;
                if (yo1Var == null) {
                    yo1Var = new yo1(zze);
                    zzf = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final List m3453t() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: w */
    public final void m3454w(ArrayList arrayList) {
        kp1 kp1Var = this.zzb;
        if (!((eo1) kp1Var).f2152j) {
            this.zzb = j11.m2775j(kp1Var);
        }
        do1.m1273d(arrayList, this.zzb);
    }
}
