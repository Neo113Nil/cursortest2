package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v02 extends zo1 {
    private static final v02 zze;
    private static volatile cq1 zzf;
    private kp1 zzb = fq1.f2476n;

    static {
        v02 v02Var = new v02();
        zze = v02Var;
        zo1.m5960o(v02.class, v02Var);
    }

    /* JADX INFO: renamed from: v */
    public static v02 m5020v() {
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
            return new gq1(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", w02.class});
        }
        if (i2 == 3) {
            return new v02();
        }
        if (i2 == 4) {
            return new yw1(zze);
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
        synchronized (v02.class) {
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
    public final List m5021t() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: u */
    public final int m5022u() {
        return this.zzb.size();
    }
}
