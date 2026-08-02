package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d42 extends zo1 {
    private static final d42 zzj;
    private static volatile cq1 zzk;
    private int zzb;
    private long zzh;
    private rp1 zzi = rp1.f6937k;
    private String zze = "";
    private ko1 zzf = ko1.f4486k;
    private String zzg = "";

    static {
        d42 d42Var = new d42();
        zzj = d42Var;
        zo1.m5960o(d42.class, d42Var);
    }

    /* JADX INFO: renamed from: A */
    public static d42 m1086A() {
        return zzj;
    }

    /* JADX INFO: renamed from: z */
    public static d42 m1087z(AbstractC0860x0 abstractC0860x0, so1 so1Var) throws mp1 {
        zo1 zo1VarM5967i = zzj.m5967i();
        try {
            hq1 hq1VarM1495a = eq1.f2165c.m1495a(zo1VarM5967i.getClass());
            C0212fi c0212fi = (C0212fi) abstractC0860x0.f8729l;
            if (c0212fi == null) {
                c0212fi = new C0212fi(abstractC0860x0, (byte) 0);
            }
            hq1VarM1495a.mo470g(zo1VarM5967i, c0212fi, so1Var);
            hq1VarM1495a.mo472i(zo1VarM5967i);
            zo1.m5963r(zo1VarM5967i);
            return (d42) zo1VarM5967i;
        } catch (IOException e) {
            if (e.getCause() instanceof mp1) {
                throw ((mp1) e.getCause());
            }
            throw new mp1(e.getMessage(), e);
        } catch (lq1 e2) {
            throw e2.m3275a();
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof mp1) {
                throw ((mp1) e3.getCause());
            }
            throw e3;
        } catch (mp1 e4) {
            if (e4.f5126j) {
                throw new mp1(e4.getMessage(), e4);
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
            return new gq1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", c42.f1089a});
        }
        if (i2 == 3) {
            return new d42();
        }
        if (i2 == 4) {
            return new yw1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzk;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (d42.class) {
            try {
                yo1Var = zzk;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzj);
                    zzk = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final String m1088t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final ko1 m1089u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: v */
    public final String m1090v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final long m1091w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final int m1092x() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: y */
    public final Map m1093y() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
