package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w02 extends zo1 {
    private static final w02 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private String zze = "";
    private kp1 zzf = fq1.f2476n;

    static {
        w02 w02Var = new w02();
        zzg = w02Var;
        zo1.m5960o(w02.class, w02Var);
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", c12.class});
        }
        if (i2 == 3) {
            return new w02();
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
        synchronized (w02.class) {
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
    public final String m5228t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final List m5229u() {
        return this.zzf;
    }
}
