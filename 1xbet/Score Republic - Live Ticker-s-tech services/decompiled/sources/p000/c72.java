package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 extends zo1 {
    private static final c72 zze;
    private static volatile cq1 zzf;
    private kp1 zzb = fq1.f2476n;

    static {
        c72 c72Var = new c72();
        zze = c72Var;
        zo1.m5960o(c72.class, c72Var);
    }

    /* JADX INFO: renamed from: u */
    public static c72 m896u(byte[] bArr, so1 so1Var) {
        return (c72) zo1.m5958e(zze, bArr, so1Var);
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
            return new gq1(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new c72();
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
        synchronized (c72.class) {
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
    public final List m897t() {
        return this.zzb;
    }
}
