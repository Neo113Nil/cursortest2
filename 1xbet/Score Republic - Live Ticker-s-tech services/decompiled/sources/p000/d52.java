package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d52 extends zo1 {
    private static final d52 zzg;
    private static volatile cq1 zzh;
    private int zzb;
    private kp1 zze = fq1.f2476n;
    private String zzf = "";

    static {
        d52 d52Var = new d52();
        zzg = d52Var;
        zo1.m5960o(d52.class, d52Var);
    }

    /* JADX INFO: renamed from: u */
    public static d52 m1095u() {
        return zzg;
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
            return new gq1(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new d52();
        }
        if (i2 == 4) {
            return new c52(zzg);
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
        synchronized (d52.class) {
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
    public final List m1096t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final void m1097v(String str) {
        kp1 kp1Var = this.zze;
        if (!((eo1) kp1Var).f2152j) {
            this.zze = j11.m2775j(kp1Var);
        }
        this.zze.add("");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m1098w(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
