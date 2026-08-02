package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a12 extends zo1 {
    private static final a12 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private kp1 zze = fq1.f2476n;
    private v02 zzf;

    static {
        a12 a12Var = new a12();
        zzg = a12Var;
        zo1.m5960o(a12.class, a12Var);
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", c12.class, "zzf"});
        }
        if (i2 == 3) {
            return new a12();
        }
        if (i2 == 4) {
            return new yw1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzh;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (a12.class) {
            try {
                yo1Var = zzh;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzg);
                    zzh = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final List m15t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final v02 m16u() {
        v02 v02Var = this.zzf;
        return v02Var == null ? v02.m5020v() : v02Var;
    }
}
