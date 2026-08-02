package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h72 extends zo1 {
    private static final h72 zzl;
    private static volatile cq1 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private kp1 zzg = fq1.f2476n;

    static {
        h72 h72Var = new h72();
        zzl = h72Var;
        zo1.m5960o(h72.class, h72Var);
    }

    /* JADX INFO: renamed from: v */
    public static h72 m2223v(InputStream inputStream, so1 so1Var) throws mp1 {
        h72 h72Var = zzl;
        AbstractC0860x0 abstractC0860x0M5486K = AbstractC0860x0.m5486K(inputStream, 4096);
        zo1 zo1VarM5967i = h72Var.m5967i();
        try {
            hq1 hq1VarM1495a = eq1.f2165c.m1495a(zo1VarM5967i.getClass());
            C0212fi c0212fi = (C0212fi) abstractC0860x0M5486K.f8729l;
            if (c0212fi == null) {
                c0212fi = new C0212fi(abstractC0860x0M5486K, (byte) 0);
            }
            hq1VarM1495a.mo470g(zo1VarM5967i, c0212fi, so1Var);
            hq1VarM1495a.mo472i(zo1VarM5967i);
            zo1.m5963r(zo1VarM5967i);
            return (h72) zo1VarM5967i;
        } catch (lq1 e) {
            throw e.m3275a();
        } catch (mp1 e2) {
            if (e2.f5126j) {
                throw new mp1(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof mp1) {
                throw ((mp1) e3.getCause());
            }
            throw new mp1(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof mp1) {
                throw ((mp1) e4.getCause());
            }
            throw e4;
        }
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
            return new gq1(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", yn1.f9407b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new h72();
        }
        if (i2 == 4) {
            return new yw1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzm;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (h72.class) {
            try {
                yo1Var = zzm;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzl);
                    zzm = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final String m2224t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2225u() {
        return this.zzf;
    }
}
